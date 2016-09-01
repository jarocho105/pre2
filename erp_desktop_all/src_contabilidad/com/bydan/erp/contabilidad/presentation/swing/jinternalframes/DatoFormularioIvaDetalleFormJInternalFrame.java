/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.DatoFormularioIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class DatoFormularioIvaDetalleFormJInternalFrame extends DatoFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDatoFormularioIva;
	
	protected JMenuBar jmenuBarDetalleDatoFormularioIva;
	
	protected JMenu jmenuDetalleDatoFormularioIva;
	protected JMenu jmenuDetalleArchivoDatoFormularioIva;
	protected JMenu jmenuDetalleAccionesDatoFormularioIva;
	protected JMenu jmenuDetalleDatosDatoFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoFormularioIva;	
	protected GridBagConstraints gridBagConstraintsDatoFormularioIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DatoFormularioIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDatoFormularioIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected SemestreBeanSwingJInternalFrame semestreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_semestre="";
	
	public DatoFormularioIvaSessionBean datoformularioivaSessionBean;
	
	

	public FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame=null;
	public FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioIva=false;
	public FormularioIvaSessionBean formularioivaSessionBean;
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public SemestreSessionBean semestreSessionBean;	
	
	public DatoFormularioIvaLogic datoformularioivaLogic;
	
	public JScrollPane jScrollPanelDatosDatoFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionDatoFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralDatoFormularioIva;
	
	protected JPanel jPanelCamposDatoFormularioIva;    
	protected JPanel jPanelCamposOcultosDatoFormularioIva;    	
	protected JPanel jPanelAccionesDatoFormularioIva;
	protected JPanel jPanelAccionesFormularioDatoFormularioIva;
    
	
	
	protected Integer iXPanelCamposDatoFormularioIva=0;
	protected Integer iYPanelCamposDatoFormularioIva=0;
	
	protected Integer iXPanelCamposOcultosDatoFormularioIva=0;
	protected Integer iYPanelCamposOcultosDatoFormularioIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDatoFormularioIva;
	public JButton jButtonModificarDatoFormularioIva;
	public JButton jButtonActualizarDatoFormularioIva;
    public JButton jButtonEliminarDatoFormularioIva;
	public JButton jButtonCancelarDatoFormularioIva;
    public JButton jButtonGuardarCambiosDatoFormularioIva;
	public JButton jButtonGuardarCambiosTablaDatoFormularioIva;
	protected JButton jButtonCerrarDatoFormularioIva;
	
	
	protected JButton jButtonProcesarInformacionDatoFormularioIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDatoFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDatoFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDatoFormularioIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoFormularioIva;
	protected JButton jButtonModificarToolBarDatoFormularioIva;
	protected JButton jButtonActualizarToolBarDatoFormularioIva;
    protected JButton jButtonEliminarToolBarDatoFormularioIva;
	protected JButton jButtonCancelarToolBarDatoFormularioIva;
    protected JButton jButtonGuardarCambiosToolBarDatoFormularioIva;
	protected JButton jButtonGuardarCambiosTablaToolBarDatoFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoFormularioIva;
	protected JButton jButtonCerrarToolBarDatoFormularioIva;
	
	protected JButton jButtonProcesarInformacionToolBarDatoFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoFormularioIva;
	protected JMenuItem jMenuItemModificarDatoFormularioIva;
	protected JMenuItem jMenuItemActualizarDatoFormularioIva;
    protected JMenuItem jMenuItemEliminarDatoFormularioIva;
	protected JMenuItem jMenuItemCancelarDatoFormularioIva;
    protected JMenuItem jMenuItemGuardarCambiosDatoFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoFormularioIva;
	protected JMenuItem jMenuItemCerrarDatoFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarDatoFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoFormularioIva;
	
	protected JMenuItem jMenuItemProcesarInformacionDatoFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarDatoFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoFormularioIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoFormularioIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDatoFormularioIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDatoFormularioIva;
	public JLabel jLabelIdDatoFormularioIva;
	public JLabel jLabelidDatoFormularioIva;
	public JButton jButtonidDatoFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_mensualDatoFormularioIva;
	public JLabel jLabeles_mensualDatoFormularioIva;
	public JCheckBox jCheckBoxes_mensualDatoFormularioIva;
	public JButton jButtones_mensualDatoFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPaneles_sustitutivaDatoFormularioIva;
	public JLabel jLabeles_sustitutivaDatoFormularioIva;
	public JCheckBox jCheckBoxes_sustitutivaDatoFormularioIva;
	public JButton jButtones_sustitutivaDatoFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_formularioDatoFormularioIva;
	public JLabel jLabelnumero_formularioDatoFormularioIva;
	public JTextField jTextFieldnumero_formularioDatoFormularioIva;
	public JButton jButtonnumero_formularioDatoFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioDatoFormularioIva;
	public JLabel jLabelid_anioDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDatoFormularioIva;
	public JButton jButtonid_anioDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_anioDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_anioDatoFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDatoFormularioIva;
	public JLabel jLabelid_mesDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDatoFormularioIva;
	public JButton jButtonid_mesDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_mesDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_mesDatoFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelid_semestreDatoFormularioIva;
	public JLabel jLabelid_semestreDatoFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_semestreDatoFormularioIva;
	public JButton jButtonid_semestreDatoFormularioIva= new JButtonMe();
	public JButton jButtonid_semestreDatoFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_semestreDatoFormularioIvaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDatoFormularioIva;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DatoFormularioIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDatoFormularioIva=new JPanel();
				this.jPanelAccionesFormularioDatoFormularioIva=new JPanel();
				this.jmenuBarDetalleDatoFormularioIva=new JMenuBar();
				this.jTtoolBarDetalleDatoFormularioIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DatoFormularioIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarDatoFormularioIva() {
		return this.jButtonActualizarToolBarDatoFormularioIva;
	}
	
	public JButton getjButtonEliminarToolBarDatoFormularioIva() {
		return this.jButtonEliminarToolBarDatoFormularioIva;
	}
	
	public JButton getjButtonCancelarToolBarDatoFormularioIva() {
		return this.jButtonCancelarToolBarDatoFormularioIva;
	}		
	
	public JButton getjButtonProcesarInformacionDatoFormularioIva() {
		return this.jButtonProcesarInformacionDatoFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoFormularioIva)	{
		this.jButtonProcesarInformacionDatoFormularioIva = jButtonProcesarInformacionDatoFormularioIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoFormularioIva() {
		return this.jComboBoxTiposAccionesDatoFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoFormularioIva(
			JComboBox jComboBoxTiposRelacionesDatoFormularioIva) {
		this.jComboBoxTiposRelacionesDatoFormularioIva = jComboBoxTiposRelacionesDatoFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoFormularioIva(
			JComboBox jComboBoxTiposAccionesDatoFormularioIva) {
		this.jComboBoxTiposAccionesDatoFormularioIva = jComboBoxTiposAccionesDatoFormularioIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDatoFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioDatoFormularioIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDatoFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioDatoFormularioIva) {
		this.jComboBoxTiposAccionesFormularioDatoFormularioIva = jComboBoxTiposAccionesFormularioDatoFormularioIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.datoformularioivaSessionBean=new DatoFormularioIvaSessionBean();
		
		this.datoformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datoformularioivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formularioivaSessionBean=new FormularioIvaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		DatoFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDatoFormularioIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDatoFormularioIva=new JButtonMe();
				this.jButtonModificarToolBarDatoFormularioIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDatoFormularioIva,this.jTtoolBarDetalleDatoFormularioIva,
							"actualizar","actualizar","Actualizar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDatoFormularioIva,this.jTtoolBarDetalleDatoFormularioIva,
							"eliminar","eliminar","Eliminar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDatoFormularioIva,this.jTtoolBarDetalleDatoFormularioIva,
							"cancelar","cancelar","Cancelar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDatoFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDatoFormularioIva,this.jTtoolBarDetalleDatoFormularioIva,
							"guardarcambios","guardarcambios","Guardar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDatoFormularioIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDatoFormularioIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDatoFormularioIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDatoFormularioIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDatoFormularioIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDatoFormularioIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDatoFormularioIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDatoFormularioIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDatoFormularioIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDatoFormularioIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDatoFormularioIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDatoFormularioIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDatoFormularioIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDatoFormularioIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDatoFormularioIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDatoFormularioIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDatoFormularioIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDatoFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDatoFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDatoFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDatoFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDatoFormularioIva.add(this.jMenuItemDetalleCerrarDatoFormularioIva);
		
		this.jmenuDetalleAccionesDatoFormularioIva.add(this.jMenuItemActualizarDatoFormularioIva);
		this.jmenuDetalleAccionesDatoFormularioIva.add(this.jMenuItemEliminarDatoFormularioIva);
		this.jmenuDetalleAccionesDatoFormularioIva.add(this.jMenuItemCancelarDatoFormularioIva);		
		
		//this.jmenuDetalleDatosDatoFormularioIva.add(this.jMenuItemDetalleAbrirOrderByDatoFormularioIva);				
		this.jmenuDetalleDatosDatoFormularioIva.add(this.jMenuItemDetalleMostarOcultarDatoFormularioIva);				
				
		//this.jmenuDetalleAccionesDatoFormularioIva.add(this.jMenuItemGuardarCambiosDatoFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDatoFormularioIva.add(this.jmenuDetalleArchivoDatoFormularioIva);		
		this.jmenuBarDetalleDatoFormularioIva.add(this.jmenuDetalleAccionesDatoFormularioIva);		
		this.jmenuBarDetalleDatoFormularioIva.add(this.jmenuDetalleDatosDatoFormularioIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDatoFormularioIva.add(this.jmenuDetalleDatoFormularioIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDatoFormularioIva);				
	}
	
	
	public void inicializarElementosCamposDatoFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDatoFormularioIva = new JLabelMe();
		jLabelIdDatoFormularioIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDatoFormularioIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDatoFormularioIva= new GridBagLayout();

		this.jPanelidDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);

		jLabelidDatoFormularioIva = new JLabel();
		jLabelidDatoFormularioIva.setText("Id");

		jLabelidDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_mensualDatoFormularioIva = new JLabelMe();
		this.jLabeles_mensualDatoFormularioIva.setText(""+DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL+" : *");
		this.jLabeles_mensualDatoFormularioIva.setToolTipText("Es Mensual");
		this.jLabeles_mensualDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mensualDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mensualDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_mensualDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_mensualDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_mensualDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_ESMENSUAL);
		this.gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		this.jPaneles_mensualDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);


		jCheckBoxes_mensualDatoFormularioIva= new JCheckBoxMe();
		jCheckBoxes_mensualDatoFormularioIva.setEnabled(false);

		jCheckBoxes_mensualDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mensualDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mensualDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_mensualDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_mensualDatoFormularioIvaBusqueda= new JButtonMe();
		this.jButtones_mensualDatoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mensualDatoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mensualDatoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_mensualDatoFormularioIvaBusqueda.setText("U");
		this.jButtones_mensualDatoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_mensualDatoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_mensualDatoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_mensualDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_mensualDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_mensualDatoFormularioIvaBusqueda"));

		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_mensualDatoFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabeles_sustitutivaDatoFormularioIva = new JLabelMe();
		this.jLabeles_sustitutivaDatoFormularioIva.setText(""+DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA+" : *");
		this.jLabeles_sustitutivaDatoFormularioIva.setToolTipText("Es Sustitutiva");
		this.jLabeles_sustitutivaDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_sustitutivaDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_sustitutivaDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_sustitutivaDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_sustitutivaDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_sustitutivaDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_ESSUSTITUTIVA);
		this.gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		this.jPaneles_sustitutivaDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);


		jCheckBoxes_sustitutivaDatoFormularioIva= new JCheckBoxMe();
		jCheckBoxes_sustitutivaDatoFormularioIva.setEnabled(false);

		jCheckBoxes_sustitutivaDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_sustitutivaDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_sustitutivaDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_sustitutivaDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_sustitutivaDatoFormularioIvaBusqueda= new JButtonMe();
		this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setText("U");
		this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_sustitutivaDatoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_sustitutivaDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_sustitutivaDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_sustitutivaDatoFormularioIvaBusqueda"));

		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_sustitutivaDatoFormularioIvaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_formularioDatoFormularioIva = new JLabelMe();
		this.jLabelnumero_formularioDatoFormularioIva.setText(""+DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO+" : *");
		this.jLabelnumero_formularioDatoFormularioIva.setToolTipText("Numero Formulario");
		this.jLabelnumero_formularioDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_formularioDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_formularioDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_formularioDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_formularioDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_formularioDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_NUMEROFORMULARIO);
		this.gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		this.jPanelnumero_formularioDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);


		jTextFieldnumero_formularioDatoFormularioIva= new JTextFieldMe();

		jTextFieldnumero_formularioDatoFormularioIva.setEnabled(false);
		jTextFieldnumero_formularioDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_formularioDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_formularioDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_formularioDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_formularioDatoFormularioIvaBusqueda= new JButtonMe();
		this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setText("U");
		this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_formularioDatoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_formularioDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_formularioDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_formularioDatoFormularioIvaBusqueda"));

		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_formularioDatoFormularioIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDatoFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioDatoFormularioIva = new JLabelMe();
		this.jLabelid_anioDatoFormularioIva.setText(""+DatoFormularioIvaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDatoFormularioIva.setToolTipText("Anio");
		this.jLabelid_anioDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		this.jPanelid_anioDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);


		jComboBoxid_anioDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_anioDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioDatoFormularioIva= new JButtonMe();
		this.jButtonid_anioDatoFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDatoFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDatoFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDatoFormularioIva.setText("Buscar");
		this.jButtonid_anioDatoFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDatoFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDatoFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDatoFormularioIva"));

		this.jButtonid_anioDatoFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_anioDatoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDatoFormularioIvaBusqueda.setText("U");
		this.jButtonid_anioDatoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDatoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDatoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDatoFormularioIvaBusqueda"));

		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDatoFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_anioDatoFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_anioDatoFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDatoFormularioIvaUpdate.setText("U");
		this.jButtonid_anioDatoFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDatoFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDatoFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDatoFormularioIvaUpdate"));



					
		this.jLabelid_mesDatoFormularioIva = new JLabelMe();
		this.jLabelid_mesDatoFormularioIva.setText(""+DatoFormularioIvaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDatoFormularioIva.setToolTipText("Mes");
		this.jLabelid_mesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		this.jPanelid_mesDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);


		jComboBoxid_mesDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_mesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesDatoFormularioIva= new JButtonMe();
		this.jButtonid_mesDatoFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDatoFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDatoFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDatoFormularioIva.setText("Buscar");
		this.jButtonid_mesDatoFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDatoFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDatoFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDatoFormularioIva"));

		this.jButtonid_mesDatoFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_mesDatoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDatoFormularioIvaBusqueda.setText("U");
		this.jButtonid_mesDatoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDatoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDatoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDatoFormularioIvaBusqueda"));

		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDatoFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_mesDatoFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_mesDatoFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDatoFormularioIvaUpdate.setText("U");
		this.jButtonid_mesDatoFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDatoFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDatoFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDatoFormularioIvaUpdate"));



					
		this.jLabelid_semestreDatoFormularioIva = new JLabelMe();
		this.jLabelid_semestreDatoFormularioIva.setText(""+DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE+" : *");
		this.jLabelid_semestreDatoFormularioIva.setToolTipText("Semestre");
		this.jLabelid_semestreDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_semestreDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_semestreDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_semestreDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_semestreDatoFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_semestreDatoFormularioIva.setToolTipText(DatoFormularioIvaConstantesFunciones.LABEL_IDSEMESTRE);
		this.gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		this.jPanelid_semestreDatoFormularioIva.setLayout(this.gridaBagLayoutDatoFormularioIva);


		jComboBoxid_semestreDatoFormularioIva= new JComboBoxMe();
		jComboBoxid_semestreDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_semestreDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_semestreDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_semestreDatoFormularioIva= new JButtonMe();
		this.jButtonid_semestreDatoFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_semestreDatoFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_semestreDatoFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_semestreDatoFormularioIva.setText("Buscar");
		this.jButtonid_semestreDatoFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_semestreDatoFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_semestreDatoFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_semestreDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_semestreDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_semestreDatoFormularioIva"));

		this.jButtonid_semestreDatoFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_semestreDatoFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreDatoFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreDatoFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_semestreDatoFormularioIvaBusqueda.setText("U");
		this.jButtonid_semestreDatoFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_semestreDatoFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_semestreDatoFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_semestreDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_semestreDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_semestreDatoFormularioIvaBusqueda"));

		if(this.datoformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_semestreDatoFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_semestreDatoFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_semestreDatoFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreDatoFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_semestreDatoFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_semestreDatoFormularioIvaUpdate.setText("U");
		this.jButtonid_semestreDatoFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_semestreDatoFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_semestreDatoFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_semestreDatoFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_semestreDatoFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_semestreDatoFormularioIvaUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleDatoFormularioIva = new DatoFormularioIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dato Formulario Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoFormularioIva= new GridBagLayout();
		

		
		String sToolTipDatoFormularioIva="";
		sToolTipDatoFormularioIva=DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoFormularioIva+="(Contabilidad.DatoFormularioIva)";
		}
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoFormularioIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDatoFormularioIva = new JButtonMe();
		this.jButtonModificarDatoFormularioIva = new JButtonMe();
        this.jButtonActualizarDatoFormularioIva = new JButtonMe();
        this.jButtonEliminarDatoFormularioIva = new JButtonMe();
        this.jButtonCancelarDatoFormularioIva = new JButtonMe();
        this.jButtonGuardarCambiosDatoFormularioIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaDatoFormularioIva = new JButtonMe();
		this.jButtonCerrarDatoFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosDatoFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionDatoFormularioIva = new JScrollPane();
		this.jScrollPanelDatosGeneralDatoFormularioIva = new JScrollPane();
				
		
		
		this.jPanelCamposDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dato Formulario Iva";
		
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDatoFormularioIva.setName("jPanelCamposDatoFormularioIva"); 

		this.jPanelCamposOcultosDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDatoFormularioIva.setName("jPanelCamposOcultosDatoFormularioIva"); 

        this.jPanelAccionesDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesDatoFormularioIva.setName("Acciones"); 

		this.jPanelAccionesFormularioDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDatoFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDatoFormularioIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDatoFormularioIva.setText("Nuevo");
		this.jButtonModificarDatoFormularioIva.setText("Editar");
        this.jButtonActualizarDatoFormularioIva.setText("Actualizar");
        this.jButtonEliminarDatoFormularioIva.setText("Eliminar");
        this.jButtonCancelarDatoFormularioIva.setText("Cancelar");
        this.jButtonGuardarCambiosDatoFormularioIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaDatoFormularioIva.setText("Guardar");
		this.jButtonCerrarDatoFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoFormularioIva,"nuevo_button","Nuevo",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDatoFormularioIva,"modificar_button","Editar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDatoFormularioIva,"actualizar_button","Actualizar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDatoFormularioIva,"eliminar_button","Eliminar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDatoFormularioIva,"cancelar_button","Cancelar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDatoFormularioIva,"guardarcambios_button","Guardar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoFormularioIva,"guardarcambiostabla_button","Guardar",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoFormularioIva,"cerrar_button","Salir",this.datoformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDatoFormularioIva.setToolTipText("Nuevo"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDatoFormularioIva.setToolTipText("Editar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDatoFormularioIva.setToolTipText("Actualizar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDatoFormularioIva.setToolTipText("Eliminar)"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDatoFormularioIva.setToolTipText("Cancelar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDatoFormularioIva.setToolTipText("Guardar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDatoFormularioIva.setToolTipText("Guardar"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoFormularioIva.setToolTipText("Salir"+" "+DatoFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoDatoFormularioIva";
		inputMap = this.jButtonNuevoDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoFormularioIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDatoFormularioIva";
		inputMap = this.jButtonActualizarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDatoFormularioIva"));
		
		//ELIMINAR
		sMapKey = "EliminarDatoFormularioIva";
		inputMap = this.jButtonEliminarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDatoFormularioIva"));
		
		//CANCELAR	
		sMapKey = "CancelarDatoFormularioIva";
		inputMap = this.jButtonCancelarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDatoFormularioIva"));
		
		//CERRAR		
		sMapKey = "CerrarDatoFormularioIva";
		inputMap = this.jButtonCerrarDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaDatoFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoFormularioIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDatoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDatoFormularioIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDatoFormularioIva.setToolTipText("Nuevo DatoFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDatoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDatoFormularioIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDatoFormularioIva.setToolTipText("Sin Cerrar Ventana DatoFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDatoFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDatoFormularioIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDatoFormularioIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesDatoFormularioIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDatoFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDatoFormularioIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDatoFormularioIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDatoFormularioIva = new JLabelMe();
		
		this.jLabelAccionesDatoFormularioIva.setText("Acciones");		
		this.jLabelAccionesDatoFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDatoFormularioIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDatoFormularioIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDatoFormularioIva=new JTabbedPane();
		this.jTabbedPaneRelacionesDatoFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDatoFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDatoFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDatoFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoFormularioIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDatoFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDatoFormularioIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDatoFormularioIva = new GridBagLayout();
		
		this.jPanelCamposDatoFormularioIva.setLayout(gridaBagLayoutCamposDatoFormularioIva);
		this.jPanelCamposOcultosDatoFormularioIva.setLayout(gridaBagLayoutCamposOcultosDatoFormularioIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDatoFormularioIva.add(jLabelIdDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDatoFormularioIva.add(jLabelidDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_mensualDatoFormularioIva.add(jLabeles_mensualDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 2;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_mensualDatoFormularioIva.add(jButtones_mensualDatoFormularioIvaBusqueda, this.gridBagConstraintsDatoFormularioIva);
	}

	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_mensualDatoFormularioIva.add(jCheckBoxes_mensualDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDatoFormularioIva.add(jLabelid_anioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 2;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDatoFormularioIva.add(jButtonid_anioDatoFormularioIvaBusqueda, this.gridBagConstraintsDatoFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 3;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDatoFormularioIva.add(jButtonid_anioDatoFormularioIvaUpdate, this.gridBagConstraintsDatoFormularioIva);
	}

	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDatoFormularioIva.add(jComboBoxid_anioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDatoFormularioIva.add(jLabelid_mesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 2;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDatoFormularioIva.add(jButtonid_mesDatoFormularioIvaBusqueda, this.gridBagConstraintsDatoFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 3;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDatoFormularioIva.add(jButtonid_mesDatoFormularioIvaUpdate, this.gridBagConstraintsDatoFormularioIva);
	}

	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDatoFormularioIva.add(jComboBoxid_mesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_semestreDatoFormularioIva.add(jLabelid_semestreDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 2;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_semestreDatoFormularioIva.add(jButtonid_semestreDatoFormularioIvaBusqueda, this.gridBagConstraintsDatoFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 3;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_semestreDatoFormularioIva.add(jButtonid_semestreDatoFormularioIvaUpdate, this.gridBagConstraintsDatoFormularioIva);
	}

	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_semestreDatoFormularioIva.add(jComboBoxid_semestreDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_sustitutivaDatoFormularioIva.add(jLabeles_sustitutivaDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 2;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_sustitutivaDatoFormularioIva.add(jButtones_sustitutivaDatoFormularioIvaBusqueda, this.gridBagConstraintsDatoFormularioIva);
	}

	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_sustitutivaDatoFormularioIva.add(jCheckBoxes_sustitutivaDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_formularioDatoFormularioIva.add(jLabelnumero_formularioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = 2;
		this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
		this.gridBagConstraintsDatoFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_formularioDatoFormularioIva.add(jButtonnumero_formularioDatoFormularioIvaBusqueda, this.gridBagConstraintsDatoFormularioIva);
	}

	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioIva.gridy = 0;
	this.gridBagConstraintsDatoFormularioIva.gridx = 1;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_formularioDatoFormularioIva.add(jTextFieldnumero_formularioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPanelidDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPaneles_mensualDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPanelid_anioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPanelid_mesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPanelid_semestreDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPaneles_sustitutivaDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
	this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioIva.gridy = iYPanelCamposDatoFormularioIva;
	this.gridBagConstraintsDatoFormularioIva.gridx = iXPanelCamposDatoFormularioIva++;
	this.gridBagConstraintsDatoFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioIva.add(this.jPanelnumero_formularioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);



	if(iXPanelCamposDatoFormularioIva % 1==0) {
		iXPanelCamposDatoFormularioIva=0;
		iYPanelCamposDatoFormularioIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDatoFormularioIva= new GridBagLayout();
		this.jPanelAccionesDatoFormularioIva.setLayout(gridaBagLayoutAccionesDatoFormularioIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDatoFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioDatoFormularioIva.setLayout(gridaBagLayoutAccionesFormularioDatoFormularioIva);
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoFormularioIva.add(this.jComboBoxTiposAccionesFormularioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoFormularioIva.add(this.jCheckBoxPostAccionNuevoDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoFormularioIva.add(this.jCheckBoxPostAccionSinCerrarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.datoformularioivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.datoformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoFormularioIva.add(this.jCheckBoxPostAccionSinMensajeDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesDatoFormularioIva.add(this.jButtonModificarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);							

		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;
		this.gridBagConstraintsDatoFormularioIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesDatoFormularioIva.add(this.jButtonEliminarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
			
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoFormularioIva.add(this.jButtonActualizarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);


		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;		
		this.gridBagConstraintsDatoFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoFormularioIva.add(this.jButtonGuardarCambiosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);	
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = 0;		
		this.gridBagConstraintsDatoFormularioIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesDatoFormularioIva.add(this.jButtonCancelarDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoFormularioIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datoformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;		
			//this.gridBagConstraintsDatoFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoFormularioIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoFormularioIva.gridx =0;
		this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DatoFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDatoFormularioIva = new DatoFormularioIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dato Formulario Iva DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Dato Formulario Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato Formulario Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DatoFormularioIvaModel datoformularioivaModel=new DatoFormularioIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//DatoFormularioIvaModel.DatoFormularioIvaFocusTraversalPolicy datoformularioivaFocusTraversalPolicy = datoformularioivaModel.new DatoFormularioIvaFocusTraversalPolicy(this);
			
			//datoformularioivaFocusTraversalPolicy.setdatoformularioivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(datoformularioivaModel);
			
			
			this.jContentPaneDetalleDatoFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDatoFormularioIva = new GridBagLayout();	
			this.jContentPaneDetalleDatoFormularioIva.setLayout(gridaBagLayoutDetalleDatoFormularioIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoFormularioIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDatoFormularioIva.gridx = 0;
					
				
				this.jContentPaneDetalleDatoFormularioIva.add(jTtoolBarDetalleDatoFormularioIva, gridBagConstraintsDatoFormularioIva);								
				
}
			
			this.jScrollPanelDatosEdicionDatoFormularioIva=   new JScrollPane(jContentPaneDetalleDatoFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDatoFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	        
			this.jContentPaneDetalleDatoFormularioIva.add(jPanelCamposDatoFormularioIva, gridBagConstraintsDatoFormularioIva);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& datoformularioivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormularioIva(this.puedeCargarPorParteFormularioIva,false,-1);
					
					if(this.datoformularioivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDatoFormularioIva= new GridBagConstraints();
						this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDatoFormularioIva.gridx = 0;
						this.jContentPaneDetalleDatoFormularioIva.add(this.jTabbedPaneRelacionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDatoFormularioIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormularioIva(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDatoFormularioIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
					this.gridBagConstraintsDatoFormularioIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDatoFormularioIva.gridx = 0;
					
				
					this.jContentPaneDetalleDatoFormularioIva.add(jPanelCamposOcultosDatoFormularioIva, gridBagConstraintsDatoFormularioIva);
				
					this.jPanelCamposOcultosDatoFormularioIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	        this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDatoFormularioIva.add(this.jPanelAccionesFormularioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);							
			
			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
	        this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsDatoFormularioIva.gridx = 0;
	        
			
			this.jContentPaneDetalleDatoFormularioIva.add(this.jPanelAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDatoFormularioIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDatoFormularioIva=   new JScrollPane(this.jPanelCamposDatoFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;
			this.gridBagConstraintsDatoFormularioIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDatoFormularioIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDatoFormularioIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);			
			
			this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
			
			
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		
			
		this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoFormularioIva, this.gridBagConstraintsDatoFormularioIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDatoFormularioIva;//jContentPane;
		
		return jScrollPanelDatosEdicionDatoFormularioIva;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormularioIva(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formularioivaSessionBean=new FormularioIvaSessionBean();
		this.formularioivaSessionBean.setConGuardarRelaciones(false);
		this.formularioivaSessionBean.setEsGuardarRelacionado(true);

		this.formularioivaBeanSwingJInternalFrame=null;//new FormularioIvaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formularioivaBeanSwingJInternalFramePopup=new FormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formularioivaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {

				FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DatoFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formularioivaSessionBean.setEsGuardarRelacionado(true);

				this.formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formularioivaBeanSwingJInternalFrame.setformularioivaSessionBean(this.formularioivaSessionBean);

				//this.gridBagConstraintsDatoFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsDatoFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDatoFormularioIva.gridx = 0;
				//this.jContentPaneDetalleDatoFormularioIva.add(this.formularioivaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDatoFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDatoFormularioIva.add("Formulario Ivas",this.formularioivaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDatoFormularioIva.setComponentAt(iIndexTab,this.formularioivaBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formularioivaSessionBean.setEsGuardarRelacionado(false);
				this.formularioivaBeanSwingJInternalFrame=null;//new FormularioIvaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioIva) {
					this.jTabbedPaneRelacionesDatoFormularioIva.add("Formulario Ivas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormularioIvaBeanSwingJInternalFrame(List<DatoFormularioIva> datoformularioivas,DatoFormularioIva datoformularioiva,FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formularioivaBeanSwingJInternalFrame.getFormularioIvaLogic().setConnexion(this.datoformularioivaLogic.getConnexion());

					formularioivaBeanSwingJInternalFrame.setdatoformularioivasForeignKey(datoformularioivas);
					formularioivaBeanSwingJInternalFrame.setdatoformularioivaForeignKey(datoformularioiva);
					formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setisBusquedaDesdeForeignKeySesionDatoFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setlidDatoFormularioIvaActual(datoformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formularioivaBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioIva(formularioivaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formularioivaBeanSwingJInternalFrame.setVisibilidadBusquedasParaDatoFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.setid_dato_formulario_ivaFK_IdDatoFormularioIva(datoformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						formularioivaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formularioivaBeanSwingJInternalFrame.setSelectedItemCombosFrameDatoFormularioIvaForeignKey(datoformularioiva,1,false,true,true);
					formularioivaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formularioivaBeanSwingJInternalFrame.procesarBusqueda("FK_IdDatoFormularioIva");
					formularioivaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDatoFormularioIva");
					formularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormularioIva("n",formularioivaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formularioivaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formularioivaBeanSwingJInternalFrame.setAutoscrolls(true);
					formularioivaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioIva("relacionado");
					} else {
						formularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioIva("no_relacionado");
					}

					formularioivaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormularioIva().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
