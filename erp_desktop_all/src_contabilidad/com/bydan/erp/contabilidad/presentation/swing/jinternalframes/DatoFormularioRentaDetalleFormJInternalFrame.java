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
import com.bydan.erp.contabilidad.util.DatoFormularioRentaConstantesFunciones;

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
public class DatoFormularioRentaDetalleFormJInternalFrame extends DatoFormularioRentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDatoFormularioRenta;
	
	protected JMenuBar jmenuBarDetalleDatoFormularioRenta;
	
	protected JMenu jmenuDetalleDatoFormularioRenta;
	protected JMenu jmenuDetalleArchivoDatoFormularioRenta;
	protected JMenu jmenuDetalleAccionesDatoFormularioRenta;
	protected JMenu jmenuDetalleDatosDatoFormularioRenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoFormularioRenta;	
	protected GridBagConstraints gridBagConstraintsDatoFormularioRenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DatoFormularioRentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDatoFormularioRenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DatoFormularioRentaSessionBean datoformulariorentaSessionBean;
	
	

	public FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFrame=null;
	public FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioRenta=false;
	public FormularioRentaSessionBean formulariorentaSessionBean;

	public FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame=null;
	public FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioRentaExtra=false;
	public FormularioRentaExtraSessionBean formulariorentaextraSessionBean;
	
	
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DatoFormularioRentaLogic datoformulariorentaLogic;
	
	public JScrollPane jScrollPanelDatosDatoFormularioRenta;
	public JScrollPane jScrollPanelDatosEdicionDatoFormularioRenta;
	public JScrollPane jScrollPanelDatosGeneralDatoFormularioRenta;
	
	protected JPanel jPanelCamposDatoFormularioRenta;    
	protected JPanel jPanelCamposOcultosDatoFormularioRenta;    	
	protected JPanel jPanelAccionesDatoFormularioRenta;
	protected JPanel jPanelAccionesFormularioDatoFormularioRenta;
    
	
	
	protected Integer iXPanelCamposDatoFormularioRenta=0;
	protected Integer iYPanelCamposDatoFormularioRenta=0;
	
	protected Integer iXPanelCamposOcultosDatoFormularioRenta=0;
	protected Integer iYPanelCamposOcultosDatoFormularioRenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDatoFormularioRenta;
	public JButton jButtonModificarDatoFormularioRenta;
	public JButton jButtonActualizarDatoFormularioRenta;
    public JButton jButtonEliminarDatoFormularioRenta;
	public JButton jButtonCancelarDatoFormularioRenta;
    public JButton jButtonGuardarCambiosDatoFormularioRenta;
	public JButton jButtonGuardarCambiosTablaDatoFormularioRenta;
	protected JButton jButtonCerrarDatoFormularioRenta;
	
	
	protected JButton jButtonProcesarInformacionDatoFormularioRenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDatoFormularioRenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDatoFormularioRenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDatoFormularioRenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoFormularioRenta;
	protected JButton jButtonModificarToolBarDatoFormularioRenta;
	protected JButton jButtonActualizarToolBarDatoFormularioRenta;
    protected JButton jButtonEliminarToolBarDatoFormularioRenta;
	protected JButton jButtonCancelarToolBarDatoFormularioRenta;
    protected JButton jButtonGuardarCambiosToolBarDatoFormularioRenta;
	protected JButton jButtonGuardarCambiosTablaToolBarDatoFormularioRenta;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoFormularioRenta;
	protected JButton jButtonCerrarToolBarDatoFormularioRenta;
	
	protected JButton jButtonProcesarInformacionToolBarDatoFormularioRenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoFormularioRenta;
	protected JMenuItem jMenuItemModificarDatoFormularioRenta;
	protected JMenuItem jMenuItemActualizarDatoFormularioRenta;
    protected JMenuItem jMenuItemEliminarDatoFormularioRenta;
	protected JMenuItem jMenuItemCancelarDatoFormularioRenta;
    protected JMenuItem jMenuItemGuardarCambiosDatoFormularioRenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoFormularioRenta;
	protected JMenuItem jMenuItemCerrarDatoFormularioRenta;
	protected JMenuItem jMenuItemDetalleCerrarDatoFormularioRenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoFormularioRenta;
	
	protected JMenuItem jMenuItemProcesarInformacionDatoFormularioRenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoFormularioRenta;
	protected JMenuItem jMenuItemMostrarOcultarDatoFormularioRenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoFormularioRenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoFormularioRenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDatoFormularioRenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDatoFormularioRenta;
	public JLabel jLabelIdDatoFormularioRenta;
	public JLabel jLabelidDatoFormularioRenta;
	public JButton jButtonidDatoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPaneles_sustitutivaDatoFormularioRenta;
	public JLabel jLabeles_sustitutivaDatoFormularioRenta;
	public JCheckBox jCheckBoxes_sustitutivaDatoFormularioRenta;
	public JButton jButtones_sustitutivaDatoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_formularioDatoFormularioRenta;
	public JLabel jLabelnumero_formularioDatoFormularioRenta;
	public JTextField jTextFieldnumero_formularioDatoFormularioRenta;
	public JButton jButtonnumero_formularioDatoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelcedula_representanteDatoFormularioRenta;
	public JLabel jLabelcedula_representanteDatoFormularioRenta;
	public JTextField jTextFieldcedula_representanteDatoFormularioRenta;
	public JButton jButtoncedula_representanteDatoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_fiscalDatoFormularioRenta;
	public JLabel jLabelnumero_fiscalDatoFormularioRenta;
	public JTextField jTextFieldnumero_fiscalDatoFormularioRenta;
	public JButton jButtonnumero_fiscalDatoFormularioRentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_anioDatoFormularioRenta;
	public JLabel jLabelid_anioDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDatoFormularioRenta;
	public JButton jButtonid_anioDatoFormularioRenta= new JButtonMe();
	public JButton jButtonid_anioDatoFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_anioDatoFormularioRentaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDatoFormularioRenta;
	public JLabel jLabelid_mesDatoFormularioRenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDatoFormularioRenta;
	public JButton jButtonid_mesDatoFormularioRenta= new JButtonMe();
	public JButton jButtonid_mesDatoFormularioRentaUpdate= new JButtonMe();
	public JButton jButtonid_mesDatoFormularioRentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDatoFormularioRenta;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DatoFormularioRentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDatoFormularioRenta=new JPanel();
				this.jPanelAccionesFormularioDatoFormularioRenta=new JPanel();
				this.jmenuBarDetalleDatoFormularioRenta=new JMenuBar();
				this.jTtoolBarDetalleDatoFormularioRenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DatoFormularioRentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoFormularioRentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoFormularioRenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDatoFormularioRenta() {
		return this.jButtonActualizarToolBarDatoFormularioRenta;
	}
	
	public JButton getjButtonEliminarToolBarDatoFormularioRenta() {
		return this.jButtonEliminarToolBarDatoFormularioRenta;
	}
	
	public JButton getjButtonCancelarToolBarDatoFormularioRenta() {
		return this.jButtonCancelarToolBarDatoFormularioRenta;
	}		
	
	public JButton getjButtonProcesarInformacionDatoFormularioRenta() {
		return this.jButtonProcesarInformacionDatoFormularioRenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoFormularioRenta)	{
		this.jButtonProcesarInformacionDatoFormularioRenta = jButtonProcesarInformacionDatoFormularioRenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoFormularioRenta() {
		return this.jComboBoxTiposAccionesDatoFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoFormularioRenta(
			JComboBox jComboBoxTiposRelacionesDatoFormularioRenta) {
		this.jComboBoxTiposRelacionesDatoFormularioRenta = jComboBoxTiposRelacionesDatoFormularioRenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoFormularioRenta(
			JComboBox jComboBoxTiposAccionesDatoFormularioRenta) {
		this.jComboBoxTiposAccionesDatoFormularioRenta = jComboBoxTiposAccionesDatoFormularioRenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDatoFormularioRenta() {
		return this.jComboBoxTiposAccionesFormularioDatoFormularioRenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDatoFormularioRenta(
			JComboBox jComboBoxTiposAccionesFormularioDatoFormularioRenta) {
		this.jComboBoxTiposAccionesFormularioDatoFormularioRenta = jComboBoxTiposAccionesFormularioDatoFormularioRenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.datoformulariorentaSessionBean=new DatoFormularioRentaSessionBean();
		
		this.datoformulariorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoformulariorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datoformulariorentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		//this.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoFormularioRentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato Formulario Renta MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
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
	
		DatoFormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDatoFormularioRenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDatoFormularioRenta=new JButtonMe();
				this.jButtonModificarToolBarDatoFormularioRenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDatoFormularioRenta,this.jTtoolBarDetalleDatoFormularioRenta,
							"actualizar","actualizar","Actualizar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDatoFormularioRenta,this.jTtoolBarDetalleDatoFormularioRenta,
							"eliminar","eliminar","Eliminar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDatoFormularioRenta,this.jTtoolBarDetalleDatoFormularioRenta,
							"cancelar","cancelar","Cancelar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDatoFormularioRenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDatoFormularioRenta,this.jTtoolBarDetalleDatoFormularioRenta,
							"guardarcambios","guardarcambios","Guardar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDatoFormularioRenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDatoFormularioRenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDatoFormularioRenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDatoFormularioRenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDatoFormularioRenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoFormularioRenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoFormularioRenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoFormularioRenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDatoFormularioRenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDatoFormularioRenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDatoFormularioRenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDatoFormularioRenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDatoFormularioRenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDatoFormularioRenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDatoFormularioRenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDatoFormularioRenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDatoFormularioRenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDatoFormularioRenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDatoFormularioRenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDatoFormularioRenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDatoFormularioRenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoFormularioRenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoFormularioRenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoFormularioRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoFormularioRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoFormularioRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDatoFormularioRenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDatoFormularioRenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDatoFormularioRenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoFormularioRenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoFormularioRenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoFormularioRenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDatoFormularioRenta.add(this.jMenuItemDetalleCerrarDatoFormularioRenta);
		
		this.jmenuDetalleAccionesDatoFormularioRenta.add(this.jMenuItemActualizarDatoFormularioRenta);
		this.jmenuDetalleAccionesDatoFormularioRenta.add(this.jMenuItemEliminarDatoFormularioRenta);
		this.jmenuDetalleAccionesDatoFormularioRenta.add(this.jMenuItemCancelarDatoFormularioRenta);		
		
		//this.jmenuDetalleDatosDatoFormularioRenta.add(this.jMenuItemDetalleAbrirOrderByDatoFormularioRenta);				
		this.jmenuDetalleDatosDatoFormularioRenta.add(this.jMenuItemDetalleMostarOcultarDatoFormularioRenta);				
				
		//this.jmenuDetalleAccionesDatoFormularioRenta.add(this.jMenuItemGuardarCambiosDatoFormularioRenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDatoFormularioRenta.add(this.jmenuDetalleArchivoDatoFormularioRenta);		
		this.jmenuBarDetalleDatoFormularioRenta.add(this.jmenuDetalleAccionesDatoFormularioRenta);		
		this.jmenuBarDetalleDatoFormularioRenta.add(this.jmenuDetalleDatosDatoFormularioRenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleDatoFormularioRenta.add(this.jmenuDetalleDatoFormularioRenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDatoFormularioRenta);				
	}
	
	
	public void inicializarElementosCamposDatoFormularioRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDatoFormularioRenta = new JLabelMe();
		jLabelIdDatoFormularioRenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDatoFormularioRenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDatoFormularioRenta= new GridBagLayout();

		this.jPanelidDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);

		jLabelidDatoFormularioRenta = new JLabel();
		jLabelidDatoFormularioRenta.setText("Id");

		jLabelidDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_sustitutivaDatoFormularioRenta = new JLabelMe();
		this.jLabeles_sustitutivaDatoFormularioRenta.setText(""+DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA+" : *");
		this.jLabeles_sustitutivaDatoFormularioRenta.setToolTipText("Es Sustitutiva");
		this.jLabeles_sustitutivaDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_sustitutivaDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_sustitutivaDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_sustitutivaDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_sustitutivaDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_sustitutivaDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_ESSUSTITUTIVA);
		this.gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		this.jPaneles_sustitutivaDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);


		jCheckBoxes_sustitutivaDatoFormularioRenta= new JCheckBoxMe();
		jCheckBoxes_sustitutivaDatoFormularioRenta.setEnabled(false);

		jCheckBoxes_sustitutivaDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_sustitutivaDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_sustitutivaDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_sustitutivaDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_sustitutivaDatoFormularioRentaBusqueda= new JButtonMe();
		this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setText("U");
		this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_sustitutivaDatoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_sustitutivaDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_sustitutivaDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_sustitutivaDatoFormularioRentaBusqueda"));

		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_sustitutivaDatoFormularioRentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_formularioDatoFormularioRenta = new JLabelMe();
		this.jLabelnumero_formularioDatoFormularioRenta.setText(""+DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO+" : *");
		this.jLabelnumero_formularioDatoFormularioRenta.setToolTipText("Numero Formulario");
		this.jLabelnumero_formularioDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_formularioDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_formularioDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_formularioDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_formularioDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_formularioDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFORMULARIO);
		this.gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		this.jPanelnumero_formularioDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);


		jTextFieldnumero_formularioDatoFormularioRenta= new JTextFieldMe();

		jTextFieldnumero_formularioDatoFormularioRenta.setEnabled(false);
		jTextFieldnumero_formularioDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_formularioDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_formularioDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_formularioDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_formularioDatoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setText("U");
		this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_formularioDatoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_formularioDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_formularioDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_formularioDatoFormularioRentaBusqueda"));

		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_formularioDatoFormularioRentaBusqueda.setVisible(false);		}


					
		this.jLabelcedula_representanteDatoFormularioRenta = new JLabelMe();
		this.jLabelcedula_representanteDatoFormularioRenta.setText(""+DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE+" : *");
		this.jLabelcedula_representanteDatoFormularioRenta.setToolTipText("Cedula Representante");
		this.jLabelcedula_representanteDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcedula_representanteDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcedula_representanteDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcedula_representanteDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcedula_representanteDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcedula_representanteDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_CEDULAREPRESENTANTE);
		this.gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		this.jPanelcedula_representanteDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);


		jTextFieldcedula_representanteDatoFormularioRenta= new JTextFieldMe();

		jTextFieldcedula_representanteDatoFormularioRenta.setEnabled(false);
		jTextFieldcedula_representanteDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedula_representanteDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedula_representanteDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcedula_representanteDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncedula_representanteDatoFormularioRentaBusqueda= new JButtonMe();
		this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setText("U");
		this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncedula_representanteDatoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcedula_representanteDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcedula_representanteDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cedula_representanteDatoFormularioRentaBusqueda"));

		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncedula_representanteDatoFormularioRentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_fiscalDatoFormularioRenta = new JLabelMe();
		this.jLabelnumero_fiscalDatoFormularioRenta.setText(""+DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL+" : *");
		this.jLabelnumero_fiscalDatoFormularioRenta.setToolTipText("Numero Fiscal");
		this.jLabelnumero_fiscalDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fiscalDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fiscalDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_fiscalDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_fiscalDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_fiscalDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_NUMEROFISCAL);
		this.gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		this.jPanelnumero_fiscalDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);


		jTextFieldnumero_fiscalDatoFormularioRenta= new JTextFieldMe();

		jTextFieldnumero_fiscalDatoFormularioRenta.setEnabled(false);
		jTextFieldnumero_fiscalDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fiscalDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fiscalDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_fiscalDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setText("U");
		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_fiscalDatoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_fiscalDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_fiscalDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_fiscalDatoFormularioRentaBusqueda"));

		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_fiscalDatoFormularioRentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDatoFormularioRenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_anioDatoFormularioRenta = new JLabelMe();
		this.jLabelid_anioDatoFormularioRenta.setText(""+DatoFormularioRentaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDatoFormularioRenta.setToolTipText("Anio");
		this.jLabelid_anioDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		this.jPanelid_anioDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);


		jComboBoxid_anioDatoFormularioRenta= new JComboBoxMe();
		jComboBoxid_anioDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioDatoFormularioRenta= new JButtonMe();
		this.jButtonid_anioDatoFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDatoFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDatoFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDatoFormularioRenta.setText("Buscar");
		this.jButtonid_anioDatoFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDatoFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDatoFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDatoFormularioRenta"));

		this.jButtonid_anioDatoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_anioDatoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDatoFormularioRentaBusqueda.setText("U");
		this.jButtonid_anioDatoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDatoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDatoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDatoFormularioRentaBusqueda"));

		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDatoFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_anioDatoFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_anioDatoFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDatoFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDatoFormularioRentaUpdate.setText("U");
		this.jButtonid_anioDatoFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDatoFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDatoFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDatoFormularioRentaUpdate"));



					
		this.jLabelid_mesDatoFormularioRenta = new JLabelMe();
		this.jLabelid_mesDatoFormularioRenta.setText(""+DatoFormularioRentaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDatoFormularioRenta.setToolTipText("Mes");
		this.jLabelid_mesDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDatoFormularioRenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDatoFormularioRenta.setToolTipText(DatoFormularioRentaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		this.jPanelid_mesDatoFormularioRenta.setLayout(this.gridaBagLayoutDatoFormularioRenta);


		jComboBoxid_mesDatoFormularioRenta= new JComboBoxMe();
		jComboBoxid_mesDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesDatoFormularioRenta= new JButtonMe();
		this.jButtonid_mesDatoFormularioRenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDatoFormularioRenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDatoFormularioRenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDatoFormularioRenta.setText("Buscar");
		this.jButtonid_mesDatoFormularioRenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDatoFormularioRenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDatoFormularioRenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDatoFormularioRenta"));

		this.jButtonid_mesDatoFormularioRentaBusqueda= new JButtonMe();
		this.jButtonid_mesDatoFormularioRentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioRentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioRentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDatoFormularioRentaBusqueda.setText("U");
		this.jButtonid_mesDatoFormularioRentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDatoFormularioRentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDatoFormularioRentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDatoFormularioRentaBusqueda"));

		if(this.datoformulariorentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDatoFormularioRentaBusqueda.setVisible(false);		}

		this.jButtonid_mesDatoFormularioRentaUpdate= new JButtonMe();
		this.jButtonid_mesDatoFormularioRentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioRentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDatoFormularioRentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDatoFormularioRentaUpdate.setText("U");
		this.jButtonid_mesDatoFormularioRentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDatoFormularioRentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDatoFormularioRentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDatoFormularioRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDatoFormularioRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDatoFormularioRentaUpdate"));



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
		//this.jInternalFrameDetalleDatoFormularioRenta = new DatoFormularioRentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dato Formulario Renta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoFormularioRenta= new GridBagLayout();
		

		
		String sToolTipDatoFormularioRenta="";
		sToolTipDatoFormularioRenta=DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoFormularioRenta+="(Contabilidad.DatoFormularioRenta)";
		}
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoFormularioRenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDatoFormularioRenta = new JButtonMe();
		this.jButtonModificarDatoFormularioRenta = new JButtonMe();
        this.jButtonActualizarDatoFormularioRenta = new JButtonMe();
        this.jButtonEliminarDatoFormularioRenta = new JButtonMe();
        this.jButtonCancelarDatoFormularioRenta = new JButtonMe();
        this.jButtonGuardarCambiosDatoFormularioRenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaDatoFormularioRenta = new JButtonMe();
		this.jButtonCerrarDatoFormularioRenta = new JButtonMe();
		
		this.jScrollPanelDatosDatoFormularioRenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionDatoFormularioRenta = new JScrollPane();
		this.jScrollPanelDatosGeneralDatoFormularioRenta = new JScrollPane();
				
		
		
		this.jPanelCamposDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dato Formulario Renta";
		
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato Formulario Rentas" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoFormularioRenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDatoFormularioRenta.setName("jPanelCamposDatoFormularioRenta"); 

		this.jPanelCamposOcultosDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDatoFormularioRenta.setName("jPanelCamposOcultosDatoFormularioRenta"); 

        this.jPanelAccionesDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoFormularioRenta.setToolTipText("Acciones");
        this.jPanelAccionesDatoFormularioRenta.setName("Acciones"); 

		this.jPanelAccionesFormularioDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDatoFormularioRenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDatoFormularioRenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDatoFormularioRenta.setText("Nuevo");
		this.jButtonModificarDatoFormularioRenta.setText("Editar");
        this.jButtonActualizarDatoFormularioRenta.setText("Actualizar");
        this.jButtonEliminarDatoFormularioRenta.setText("Eliminar");
        this.jButtonCancelarDatoFormularioRenta.setText("Cancelar");
        this.jButtonGuardarCambiosDatoFormularioRenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.setText("Guardar");
		this.jButtonCerrarDatoFormularioRenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoFormularioRenta,"nuevo_button","Nuevo",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDatoFormularioRenta,"modificar_button","Editar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDatoFormularioRenta,"actualizar_button","Actualizar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDatoFormularioRenta,"eliminar_button","Eliminar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDatoFormularioRenta,"cancelar_button","Cancelar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDatoFormularioRenta,"guardarcambios_button","Guardar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoFormularioRenta,"guardarcambiostabla_button","Guardar",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoFormularioRenta,"cerrar_button","Salir",this.datoformulariorentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDatoFormularioRenta.setToolTipText("Nuevo"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDatoFormularioRenta.setToolTipText("Editar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDatoFormularioRenta.setToolTipText("Actualizar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDatoFormularioRenta.setToolTipText("Eliminar)"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDatoFormularioRenta.setToolTipText("Cancelar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDatoFormularioRenta.setToolTipText("Guardar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.setToolTipText("Guardar"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoFormularioRenta.setToolTipText("Salir"+" "+DatoFormularioRentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoFormularioRenta";
		inputMap = this.jButtonNuevoDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoFormularioRenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoFormularioRenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDatoFormularioRenta";
		inputMap = this.jButtonActualizarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDatoFormularioRenta"));
		
		//ELIMINAR
		sMapKey = "EliminarDatoFormularioRenta";
		inputMap = this.jButtonEliminarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDatoFormularioRenta"));
		
		//CANCELAR	
		sMapKey = "CancelarDatoFormularioRenta";
		inputMap = this.jButtonCancelarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDatoFormularioRenta"));
		
		//CERRAR		
		sMapKey = "CerrarDatoFormularioRenta";
		inputMap = this.jButtonCerrarDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoFormularioRenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoFormularioRenta";
		inputMap = this.jButtonGuardarCambiosTablaDatoFormularioRenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoFormularioRenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoFormularioRenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDatoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDatoFormularioRenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDatoFormularioRenta.setToolTipText("Nuevo DatoFormularioRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDatoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDatoFormularioRenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDatoFormularioRenta.setToolTipText("Sin Cerrar Ventana DatoFormularioRenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDatoFormularioRenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDatoFormularioRenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDatoFormularioRenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoFormularioRenta.setText("Accion");
		this.jComboBoxTiposAccionesDatoFormularioRenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDatoFormularioRenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDatoFormularioRenta = new JLabelMe();
		
		this.jLabelAccionesDatoFormularioRenta.setText("Acciones");		
		this.jLabelAccionesDatoFormularioRenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioRenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoFormularioRenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDatoFormularioRenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDatoFormularioRenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDatoFormularioRenta=new JTabbedPane();
		this.jTabbedPaneRelacionesDatoFormularioRenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDatoFormularioRenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDatoFormularioRenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioRenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoFormularioRenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoFormularioRenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDatoFormularioRenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDatoFormularioRenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDatoFormularioRenta = new GridBagLayout();
		
		this.jPanelCamposDatoFormularioRenta.setLayout(gridaBagLayoutCamposDatoFormularioRenta);
		this.jPanelCamposOcultosDatoFormularioRenta.setLayout(gridaBagLayoutCamposOcultosDatoFormularioRenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDatoFormularioRenta.add(jLabelIdDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDatoFormularioRenta.add(jLabelidDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDatoFormularioRenta.add(jLabelid_anioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 2;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDatoFormularioRenta.add(jButtonid_anioDatoFormularioRentaBusqueda, this.gridBagConstraintsDatoFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 3;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDatoFormularioRenta.add(jButtonid_anioDatoFormularioRentaUpdate, this.gridBagConstraintsDatoFormularioRenta);
	}

	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDatoFormularioRenta.add(jComboBoxid_anioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDatoFormularioRenta.add(jLabelid_mesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 2;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDatoFormularioRenta.add(jButtonid_mesDatoFormularioRentaBusqueda, this.gridBagConstraintsDatoFormularioRenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 3;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDatoFormularioRenta.add(jButtonid_mesDatoFormularioRentaUpdate, this.gridBagConstraintsDatoFormularioRenta);
	}

	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDatoFormularioRenta.add(jComboBoxid_mesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_sustitutivaDatoFormularioRenta.add(jLabeles_sustitutivaDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 2;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_sustitutivaDatoFormularioRenta.add(jButtones_sustitutivaDatoFormularioRentaBusqueda, this.gridBagConstraintsDatoFormularioRenta);
	}

	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_sustitutivaDatoFormularioRenta.add(jCheckBoxes_sustitutivaDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_formularioDatoFormularioRenta.add(jLabelnumero_formularioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 2;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_formularioDatoFormularioRenta.add(jButtonnumero_formularioDatoFormularioRentaBusqueda, this.gridBagConstraintsDatoFormularioRenta);
	}

	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_formularioDatoFormularioRenta.add(jTextFieldnumero_formularioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcedula_representanteDatoFormularioRenta.add(jLabelcedula_representanteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 2;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcedula_representanteDatoFormularioRenta.add(jButtoncedula_representanteDatoFormularioRentaBusqueda, this.gridBagConstraintsDatoFormularioRenta);
	}

	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcedula_representanteDatoFormularioRenta.add(jTextFieldcedula_representanteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_fiscalDatoFormularioRenta.add(jLabelnumero_fiscalDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		//this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = 2;
		this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
		this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_fiscalDatoFormularioRenta.add(jButtonnumero_fiscalDatoFormularioRentaBusqueda, this.gridBagConstraintsDatoFormularioRenta);
	}

	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
	this.gridBagConstraintsDatoFormularioRenta.gridx = 1;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_fiscalDatoFormularioRenta.add(jTextFieldnumero_fiscalDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPanelidDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
	}
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPanelid_anioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
	}
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPanelid_mesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
	}
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPaneles_sustitutivaDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
	}
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPanelnumero_formularioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
	}
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPanelcedula_representanteDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
	}
	this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoFormularioRenta.gridy = iYPanelCamposDatoFormularioRenta;
	this.gridBagConstraintsDatoFormularioRenta.gridx = iXPanelCamposDatoFormularioRenta++;
	this.gridBagConstraintsDatoFormularioRenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoFormularioRenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoFormularioRenta.add(this.jPanelnumero_fiscalDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);



	if(iXPanelCamposDatoFormularioRenta % 1==0) {
		iXPanelCamposDatoFormularioRenta=0;
		iYPanelCamposDatoFormularioRenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesDatoFormularioRenta= new GridBagLayout();
		this.jPanelAccionesDatoFormularioRenta.setLayout(gridaBagLayoutAccionesDatoFormularioRenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDatoFormularioRenta= new GridBagLayout();
		this.jPanelAccionesFormularioDatoFormularioRenta.setLayout(gridaBagLayoutAccionesFormularioDatoFormularioRenta);
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoFormularioRenta.add(this.jComboBoxTiposAccionesFormularioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoFormularioRenta.add(this.jCheckBoxPostAccionNuevoDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoFormularioRenta.add(this.jCheckBoxPostAccionSinCerrarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.datoformulariorentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.datoformulariorentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoFormularioRenta.add(this.jCheckBoxPostAccionSinMensajeDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesDatoFormularioRenta.add(this.jButtonModificarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);							

		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;
		this.gridBagConstraintsDatoFormularioRenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesDatoFormularioRenta.add(this.jButtonEliminarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
			
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoFormularioRenta.add(this.jButtonActualizarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);


		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoFormularioRenta.add(this.jButtonGuardarCambiosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);	
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = 0;		
		this.gridBagConstraintsDatoFormularioRenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesDatoFormularioRenta.add(this.jButtonCancelarDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoFormularioRenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoFormularioRenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datoformulariorentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();						
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;		
			//this.gridBagConstraintsDatoFormularioRenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoFormularioRenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoFormularioRenta.gridx =0;
		this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoFormularioRenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DatoFormularioRentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDatoFormularioRenta = new DatoFormularioRentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dato Formulario Renta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dato Formulario Renta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato Formulario Renta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DatoFormularioRentaModel datoformulariorentaModel=new DatoFormularioRentaModel(this);
			
			//SI USARA CLASE INTERNA
			//DatoFormularioRentaModel.DatoFormularioRentaFocusTraversalPolicy datoformulariorentaFocusTraversalPolicy = datoformulariorentaModel.new DatoFormularioRentaFocusTraversalPolicy(this);
			
			//datoformulariorentaFocusTraversalPolicy.setdatoformulariorentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(datoformulariorentaModel);
			
			
			this.jContentPaneDetalleDatoFormularioRenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDatoFormularioRenta = new GridBagLayout();	
			this.jContentPaneDetalleDatoFormularioRenta.setLayout(gridaBagLayoutDetalleDatoFormularioRenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoFormularioRenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
				this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
					
				
				this.jContentPaneDetalleDatoFormularioRenta.add(jTtoolBarDetalleDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);								
				
}
			
			this.jScrollPanelDatosEdicionDatoFormularioRenta=   new JScrollPane(jContentPaneDetalleDatoFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDatoFormularioRenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	        
			this.jContentPaneDetalleDatoFormularioRenta.add(jPanelCamposDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);
			
			
			
			
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
						&& datoformulariorentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormularioRenta(this.puedeCargarPorParteFormularioRenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(this.puedeCargarPorParteFormularioRentaExtra,false,-1);
					
					if(this.datoformulariorentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDatoFormularioRenta= new GridBagConstraints();
						this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
						this.jContentPaneDetalleDatoFormularioRenta.add(this.jTabbedPaneRelacionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDatoFormularioRenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormularioRenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDatoFormularioRenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
					this.gridBagConstraintsDatoFormularioRenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
					
				
					this.jContentPaneDetalleDatoFormularioRenta.add(jPanelCamposOcultosDatoFormularioRenta, gridBagConstraintsDatoFormularioRenta);
				
					this.jPanelCamposOcultosDatoFormularioRenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	        this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDatoFormularioRenta.add(this.jPanelAccionesFormularioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);							
			
			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
	        this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
	        
			
			this.jContentPaneDetalleDatoFormularioRenta.add(this.jPanelAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDatoFormularioRenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDatoFormularioRenta=   new JScrollPane(this.jPanelCamposDatoFormularioRenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoFormularioRenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioRenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoFormularioRenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
			this.gridBagConstraintsDatoFormularioRenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDatoFormularioRenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDatoFormularioRenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);			
			
			this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
			this.gridBagConstraintsDatoFormularioRenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
			
			
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		
			
		this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
		this.gridBagConstraintsDatoFormularioRenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoFormularioRenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoFormularioRenta, this.gridBagConstraintsDatoFormularioRenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDatoFormularioRenta;//jContentPane;
		
		return jScrollPanelDatosEdicionDatoFormularioRenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormularioRenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formulariorentaSessionBean=new FormularioRentaSessionBean();
		this.formulariorentaSessionBean.setConGuardarRelaciones(false);
		this.formulariorentaSessionBean.setEsGuardarRelacionado(true);

		this.formulariorentaBeanSwingJInternalFrame=null;//new FormularioRentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formulariorentaBeanSwingJInternalFramePopup=new FormularioRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formulariorentaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {

				FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL=DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formulariorentaSessionBean.setEsGuardarRelacionado(true);

				this.formulariorentaBeanSwingJInternalFrame=new FormularioRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formulariorentaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formulariorentaBeanSwingJInternalFrame.setformulariorentaSessionBean(this.formulariorentaSessionBean);

				//this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
				//this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
				//this.jContentPaneDetalleDatoFormularioRenta.add(this.formulariorentaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDatoFormularioRenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDatoFormularioRenta.add("Formulario Rentas",this.formulariorentaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDatoFormularioRenta.setComponentAt(iIndexTab,this.formulariorentaBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formulariorentaSessionBean.setEsGuardarRelacionado(false);
				this.formulariorentaBeanSwingJInternalFrame=null;//new FormularioRentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formulariorentaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioRenta) {
					this.jTabbedPaneRelacionesDatoFormularioRenta.add("Formulario Rentas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormularioRentaExtra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formulariorentaextraSessionBean=new FormularioRentaExtraSessionBean();
		this.formulariorentaextraSessionBean.setConGuardarRelaciones(false);
		this.formulariorentaextraSessionBean.setEsGuardarRelacionado(true);

		this.formulariorentaextraBeanSwingJInternalFrame=null;//new FormularioRentaExtraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formulariorentaextraBeanSwingJInternalFramePopup=new FormularioRentaExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formulariorentaextraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {

				FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL=DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioRentaExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=DatoFormularioRentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formulariorentaextraSessionBean.setEsGuardarRelacionado(true);

				this.formulariorentaextraBeanSwingJInternalFrame=new FormularioRentaExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formulariorentaextraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formulariorentaextraBeanSwingJInternalFrame.setformulariorentaextraSessionBean(this.formulariorentaextraSessionBean);

				//this.gridBagConstraintsDatoFormularioRenta = new GridBagConstraints();
				//this.gridBagConstraintsDatoFormularioRenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsDatoFormularioRenta.gridx = 0;
				//this.jContentPaneDetalleDatoFormularioRenta.add(this.formulariorentaextraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsDatoFormularioRenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesDatoFormularioRenta.add("Formulario Renta Extras",this.formulariorentaextraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesDatoFormularioRenta.setComponentAt(iIndexTab,this.formulariorentaextraBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioRentaExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formulariorentaextraSessionBean.setEsGuardarRelacionado(false);
				this.formulariorentaextraBeanSwingJInternalFrame=null;//new FormularioRentaExtraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formulariorentaextraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioRentaExtra) {
					this.jTabbedPaneRelacionesDatoFormularioRenta.add("Formulario Renta Extras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormularioRentaBeanSwingJInternalFrame(List<DatoFormularioRenta> datoformulariorentas,DatoFormularioRenta datoformulariorenta,FormularioRentaBeanSwingJInternalFrame formulariorentaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formulariorentaBeanSwingJInternalFrame=new FormularioRentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formulariorentaBeanSwingJInternalFrame.getFormularioRentaLogic().setConnexion(this.datoformulariorentaLogic.getConnexion());

					formulariorentaBeanSwingJInternalFrame.setdatoformulariorentasForeignKey(datoformulariorentas);
					formulariorentaBeanSwingJInternalFrame.setdatoformulariorentaForeignKey(datoformulariorenta);
					formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setisBusquedaDesdeForeignKeySesionDatoFormularioRenta(true);
					formulariorentaBeanSwingJInternalFrame.formulariorentaSessionBean.setlidDatoFormularioRentaActual(datoformulariorenta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formulariorentaBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioRenta(formulariorentaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formulariorentaBeanSwingJInternalFrame.setVisibilidadBusquedasParaDatoFormularioRenta(true);
					formulariorentaBeanSwingJInternalFrame.setid_dato_formulario_rentaFK_IdDatoFormularioRenta(datoformulariorenta.getId());

					if(!this.conCargarFormDetalle) {
						formulariorentaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formulariorentaBeanSwingJInternalFrame.setSelectedItemCombosFrameDatoFormularioRentaForeignKey(datoformulariorenta,1,false,true,true);
					formulariorentaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formulariorentaBeanSwingJInternalFrame.procesarBusqueda("FK_IdDatoFormularioRenta");
					formulariorentaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDatoFormularioRenta");
					formulariorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRenta(true);
					formulariorentaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormularioRenta("n",formulariorentaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formulariorentaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formulariorentaBeanSwingJInternalFrame.setAutoscrolls(true);
					formulariorentaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formulariorentaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRenta("relacionado");
					} else {
						formulariorentaBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRenta("no_relacionado");
					}

					formulariorentaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormularioRenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormularioRentaExtraBeanSwingJInternalFrame(List<DatoFormularioRenta> datoformulariorentas,DatoFormularioRenta datoformulariorenta,FormularioRentaExtraBeanSwingJInternalFrame formulariorentaextraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formulariorentaextraBeanSwingJInternalFrame=new FormularioRentaExtraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formulariorentaextraBeanSwingJInternalFrame.getFormularioRentaExtraLogic().setConnexion(this.datoformulariorentaLogic.getConnexion());

					formulariorentaextraBeanSwingJInternalFrame.setdatoformulariorentasForeignKey(datoformulariorentas);
					formulariorentaextraBeanSwingJInternalFrame.setdatoformulariorentaForeignKey(datoformulariorenta);
					formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setisBusquedaDesdeForeignKeySesionDatoFormularioRenta(true);
					formulariorentaextraBeanSwingJInternalFrame.formulariorentaextraSessionBean.setlidDatoFormularioRentaActual(datoformulariorenta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formulariorentaextraBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioRentaExtra(formulariorentaextraBeanSwingJInternalFrame.isCargarCombosDependencia);
					formulariorentaextraBeanSwingJInternalFrame.setVisibilidadBusquedasParaDatoFormularioRenta(true);
					formulariorentaextraBeanSwingJInternalFrame.setid_dato_formulario_rentaFK_IdDatoFormularioRenta(datoformulariorenta.getId());

					if(!this.conCargarFormDetalle) {
						formulariorentaextraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formulariorentaextraBeanSwingJInternalFrame.setSelectedItemCombosFrameDatoFormularioRentaForeignKey(datoformulariorenta,1,false,true,true);
					formulariorentaextraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formulariorentaextraBeanSwingJInternalFrame.procesarBusqueda("FK_IdDatoFormularioRenta");
					formulariorentaextraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdDatoFormularioRenta");
					formulariorentaextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormularioRentaExtra(true);
					formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormularioRentaExtra("n",formulariorentaextraBeanSwingJInternalFrame.isGuardarCambiosEnLote, formulariorentaextraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formulariorentaextraBeanSwingJInternalFrame.setAutoscrolls(true);
					formulariorentaextraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRentaExtra("relacionado");
					} else {
						formulariorentaextraBeanSwingJInternalFrame.actualizarEstadoPanelsFormularioRentaExtra("no_relacionado");
					}

					formulariorentaextraBeanSwingJInternalFrame.getjButtonRecargarInformacionFormularioRentaExtra().setVisible(false);

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
