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
import com.bydan.erp.contabilidad.util.GrupoParametroFormularioIvaConstantesFunciones;

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
public class GrupoParametroFormularioIvaDetalleFormJInternalFrame extends GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGrupoParametroFormularioIva;
	
	protected JMenuBar jmenuBarDetalleGrupoParametroFormularioIva;
	
	protected JMenu jmenuDetalleGrupoParametroFormularioIva;
	protected JMenu jmenuDetalleArchivoGrupoParametroFormularioIva;
	protected JMenu jmenuDetalleAccionesGrupoParametroFormularioIva;
	protected JMenu jmenuDetalleDatosGrupoParametroFormularioIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoParametroFormularioIva;	
	protected GridBagConstraints gridBagConstraintsGrupoParametroFormularioIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleGrupoParametroFormularioIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public GrupoParametroFormularioIvaSessionBean grupoparametroformularioivaSessionBean;
	
	

	public ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame=null;
	public ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroFormularioIva=false;
	public ParametroFormularioIvaSessionBean parametroformularioivaSessionBean;

	public FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame=null;
	public FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormularioIva=false;
	public FormularioIvaSessionBean formularioivaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public GrupoParametroFormularioIvaLogic grupoparametroformularioivaLogic;
	
	public JScrollPane jScrollPanelDatosGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosEdicionGrupoParametroFormularioIva;
	public JScrollPane jScrollPanelDatosGeneralGrupoParametroFormularioIva;
	
	protected JPanel jPanelCamposGrupoParametroFormularioIva;    
	protected JPanel jPanelCamposOcultosGrupoParametroFormularioIva;    	
	protected JPanel jPanelAccionesGrupoParametroFormularioIva;
	protected JPanel jPanelAccionesFormularioGrupoParametroFormularioIva;
    
	
	
	protected Integer iXPanelCamposGrupoParametroFormularioIva=0;
	protected Integer iYPanelCamposGrupoParametroFormularioIva=0;
	
	protected Integer iXPanelCamposOcultosGrupoParametroFormularioIva=0;
	protected Integer iYPanelCamposOcultosGrupoParametroFormularioIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGrupoParametroFormularioIva;
	public JButton jButtonModificarGrupoParametroFormularioIva;
	public JButton jButtonActualizarGrupoParametroFormularioIva;
    public JButton jButtonEliminarGrupoParametroFormularioIva;
	public JButton jButtonCancelarGrupoParametroFormularioIva;
    public JButton jButtonGuardarCambiosGrupoParametroFormularioIva;
	public JButton jButtonGuardarCambiosTablaGrupoParametroFormularioIva;
	protected JButton jButtonCerrarGrupoParametroFormularioIva;
	
	
	protected JButton jButtonProcesarInformacionGrupoParametroFormularioIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoParametroFormularioIva;
	protected JButton jButtonModificarToolBarGrupoParametroFormularioIva;
	protected JButton jButtonActualizarToolBarGrupoParametroFormularioIva;
    protected JButton jButtonEliminarToolBarGrupoParametroFormularioIva;
	protected JButton jButtonCancelarToolBarGrupoParametroFormularioIva;
    protected JButton jButtonGuardarCambiosToolBarGrupoParametroFormularioIva;
	protected JButton jButtonGuardarCambiosTablaToolBarGrupoParametroFormularioIva;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoParametroFormularioIva;
	protected JButton jButtonCerrarToolBarGrupoParametroFormularioIva;
	
	protected JButton jButtonProcesarInformacionToolBarGrupoParametroFormularioIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemModificarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemActualizarGrupoParametroFormularioIva;
    protected JMenuItem jMenuItemEliminarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCancelarGrupoParametroFormularioIva;
    protected JMenuItem jMenuItemGuardarCambiosGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemCerrarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleCerrarGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva;
	
	protected JMenuItem jMenuItemProcesarInformacionGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoParametroFormularioIva;
	protected JMenuItem jMenuItemMostrarOcultarGrupoParametroFormularioIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoParametroFormularioIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoParametroFormularioIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGrupoParametroFormularioIva;
	public JLabel jLabelIdGrupoParametroFormularioIva;
	public JLabel jLabelidGrupoParametroFormularioIva;
	public JButton jButtonidGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreGrupoParametroFormularioIva;
	public JLabel jLabelnombreGrupoParametroFormularioIva;
	public JTextArea jTextAreanombreGrupoParametroFormularioIva;
	public JScrollPane jscrollPanenombreGrupoParametroFormularioIva;
	public JButton jButtonnombreGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGrupoParametroFormularioIva;
	public JLabel jLabelid_empresaGrupoParametroFormularioIva;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGrupoParametroFormularioIva;
	public JButton jButtonid_empresaGrupoParametroFormularioIva= new JButtonMe();
	public JButton jButtonid_empresaGrupoParametroFormularioIvaUpdate= new JButtonMe();
	public JButton jButtonid_empresaGrupoParametroFormularioIvaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGrupoParametroFormularioIva;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGrupoParametroFormularioIva=new JPanel();
				this.jPanelAccionesFormularioGrupoParametroFormularioIva=new JPanel();
				this.jmenuBarDetalleGrupoParametroFormularioIva=new JMenuBar();
				this.jTtoolBarDetalleGrupoParametroFormularioIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoParametroFormularioIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoParametroFormularioIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGrupoParametroFormularioIva() {
		return this.jButtonActualizarToolBarGrupoParametroFormularioIva;
	}
	
	public JButton getjButtonEliminarToolBarGrupoParametroFormularioIva() {
		return this.jButtonEliminarToolBarGrupoParametroFormularioIva;
	}
	
	public JButton getjButtonCancelarToolBarGrupoParametroFormularioIva() {
		return this.jButtonCancelarToolBarGrupoParametroFormularioIva;
	}		
	
	public JButton getjButtonProcesarInformacionGrupoParametroFormularioIva() {
		return this.jButtonProcesarInformacionGrupoParametroFormularioIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoParametroFormularioIva)	{
		this.jButtonProcesarInformacionGrupoParametroFormularioIva = jButtonProcesarInformacionGrupoParametroFormularioIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposRelacionesGrupoParametroFormularioIva) {
		this.jComboBoxTiposRelacionesGrupoParametroFormularioIva = jComboBoxTiposRelacionesGrupoParametroFormularioIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesGrupoParametroFormularioIva) {
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva = jComboBoxTiposAccionesGrupoParametroFormularioIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGrupoParametroFormularioIva() {
		return this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGrupoParametroFormularioIva(
			JComboBox jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva) {
		this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva = jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.grupoparametroformularioivaSessionBean=new GrupoParametroFormularioIvaSessionBean();
		
		this.grupoparametroformularioivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoparametroformularioivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		//this.formularioivaSessionBean=new FormularioIvaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoParametroFormularioIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Parametro Formulario Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
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
	
		GrupoParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoParametroFormularioIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGrupoParametroFormularioIva=new JButtonMe();
				this.jButtonModificarToolBarGrupoParametroFormularioIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGrupoParametroFormularioIva,this.jTtoolBarDetalleGrupoParametroFormularioIva,
							"actualizar","actualizar","Actualizar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGrupoParametroFormularioIva,this.jTtoolBarDetalleGrupoParametroFormularioIva,
							"eliminar","eliminar","Eliminar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGrupoParametroFormularioIva,this.jTtoolBarDetalleGrupoParametroFormularioIva,
							"cancelar","cancelar","Cancelar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGrupoParametroFormularioIva,this.jTtoolBarDetalleGrupoParametroFormularioIva,
							"guardarcambios","guardarcambios","Guardar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGrupoParametroFormularioIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGrupoParametroFormularioIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGrupoParametroFormularioIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGrupoParametroFormularioIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGrupoParametroFormularioIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoParametroFormularioIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoParametroFormularioIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoParametroFormularioIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGrupoParametroFormularioIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGrupoParametroFormularioIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGrupoParametroFormularioIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGrupoParametroFormularioIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGrupoParametroFormularioIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGrupoParametroFormularioIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGrupoParametroFormularioIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGrupoParametroFormularioIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGrupoParametroFormularioIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGrupoParametroFormularioIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGrupoParametroFormularioIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGrupoParametroFormularioIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGrupoParametroFormularioIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoParametroFormularioIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoParametroFormularioIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGrupoParametroFormularioIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGrupoParametroFormularioIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGrupoParametroFormularioIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGrupoParametroFormularioIva.add(this.jMenuItemDetalleCerrarGrupoParametroFormularioIva);
		
		this.jmenuDetalleAccionesGrupoParametroFormularioIva.add(this.jMenuItemActualizarGrupoParametroFormularioIva);
		this.jmenuDetalleAccionesGrupoParametroFormularioIva.add(this.jMenuItemEliminarGrupoParametroFormularioIva);
		this.jmenuDetalleAccionesGrupoParametroFormularioIva.add(this.jMenuItemCancelarGrupoParametroFormularioIva);		
		
		//this.jmenuDetalleDatosGrupoParametroFormularioIva.add(this.jMenuItemDetalleAbrirOrderByGrupoParametroFormularioIva);				
		this.jmenuDetalleDatosGrupoParametroFormularioIva.add(this.jMenuItemDetalleMostarOcultarGrupoParametroFormularioIva);				
				
		//this.jmenuDetalleAccionesGrupoParametroFormularioIva.add(this.jMenuItemGuardarCambiosGrupoParametroFormularioIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGrupoParametroFormularioIva.add(this.jmenuDetalleArchivoGrupoParametroFormularioIva);		
		this.jmenuBarDetalleGrupoParametroFormularioIva.add(this.jmenuDetalleAccionesGrupoParametroFormularioIva);		
		this.jmenuBarDetalleGrupoParametroFormularioIva.add(this.jmenuDetalleDatosGrupoParametroFormularioIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGrupoParametroFormularioIva.add(this.jmenuDetalleGrupoParametroFormularioIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGrupoParametroFormularioIva);				
	}
	
	
	public void inicializarElementosCamposGrupoParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGrupoParametroFormularioIva = new JLabelMe();
		jLabelIdGrupoParametroFormularioIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGrupoParametroFormularioIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGrupoParametroFormularioIva.setToolTipText(GrupoParametroFormularioIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGrupoParametroFormularioIva= new GridBagLayout();

		this.jPanelidGrupoParametroFormularioIva.setLayout(this.gridaBagLayoutGrupoParametroFormularioIva);

		jLabelidGrupoParametroFormularioIva = new JLabel();
		jLabelidGrupoParametroFormularioIva.setText("Id");

		jLabelidGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreGrupoParametroFormularioIva = new JLabelMe();
		this.jLabelnombreGrupoParametroFormularioIva.setText(""+GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreGrupoParametroFormularioIva.setToolTipText("Nombre");
		this.jLabelnombreGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreGrupoParametroFormularioIva.setToolTipText(GrupoParametroFormularioIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutGrupoParametroFormularioIva = new GridBagLayout();
		this.jPanelnombreGrupoParametroFormularioIva.setLayout(this.gridaBagLayoutGrupoParametroFormularioIva);


		jTextAreanombreGrupoParametroFormularioIva= new JTextAreaMe();
		jTextAreanombreGrupoParametroFormularioIva.setEnabled(false);
		jTextAreanombreGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoParametroFormularioIva.setLineWrap(true);
		jTextAreanombreGrupoParametroFormularioIva.setWrapStyleWord(true);
		jTextAreanombreGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreGrupoParametroFormularioIva.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreGrupoParametroFormularioIva = new JScrollPane(jTextAreanombreGrupoParametroFormularioIva);
		jscrollPanenombreGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreGrupoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setText("U");
		this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreGrupoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreGrupoParametroFormularioIvaBusqueda"));

		if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreGrupoParametroFormularioIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGrupoParametroFormularioIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGrupoParametroFormularioIva = new JLabelMe();
		this.jLabelid_empresaGrupoParametroFormularioIva.setText(""+GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGrupoParametroFormularioIva.setToolTipText("Empresa");
		this.jLabelid_empresaGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGrupoParametroFormularioIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGrupoParametroFormularioIva.setToolTipText(GrupoParametroFormularioIvaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGrupoParametroFormularioIva = new GridBagLayout();
		this.jPanelid_empresaGrupoParametroFormularioIva.setLayout(this.gridaBagLayoutGrupoParametroFormularioIva);


		jComboBoxid_empresaGrupoParametroFormularioIva= new JComboBoxMe();
		jComboBoxid_empresaGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGrupoParametroFormularioIva.setEnabled(false);

		this.jButtonid_empresaGrupoParametroFormularioIva= new JButtonMe();
		this.jButtonid_empresaGrupoParametroFormularioIva.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoParametroFormularioIva.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoParametroFormularioIva.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoParametroFormularioIva.setText("Buscar");
		this.jButtonid_empresaGrupoParametroFormularioIva.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGrupoParametroFormularioIva.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoParametroFormularioIva,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoParametroFormularioIva"));

		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda= new JButtonMe();
		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setText("U");
		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoParametroFormularioIvaBusqueda"));

		if(this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGrupoParametroFormularioIvaBusqueda.setVisible(false);		}

		this.jButtonid_empresaGrupoParametroFormularioIvaUpdate= new JButtonMe();
		this.jButtonid_empresaGrupoParametroFormularioIvaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoParametroFormularioIvaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoParametroFormularioIvaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoParametroFormularioIvaUpdate.setText("U");
		this.jButtonid_empresaGrupoParametroFormularioIvaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGrupoParametroFormularioIvaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoParametroFormularioIvaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGrupoParametroFormularioIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoParametroFormularioIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoParametroFormularioIvaUpdate"));



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
		//this.jInternalFrameDetalleGrupoParametroFormularioIva = new GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Grupo Parametro Formulario Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoParametroFormularioIva= new GridBagLayout();
		

		
		String sToolTipGrupoParametroFormularioIva="";
		sToolTipGrupoParametroFormularioIva=GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoParametroFormularioIva+="(Contabilidad.GrupoParametroFormularioIva)";
		}
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoParametroFormularioIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonModificarGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonActualizarGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonEliminarGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonCancelarGrupoParametroFormularioIva = new JButtonMe();
        this.jButtonGuardarCambiosGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva = new JButtonMe();
		this.jButtonCerrarGrupoParametroFormularioIva = new JButtonMe();
		
		this.jScrollPanelDatosGrupoParametroFormularioIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionGrupoParametroFormularioIva = new JScrollPane();
		this.jScrollPanelDatosGeneralGrupoParametroFormularioIva = new JScrollPane();
				
		
		
		this.jPanelCamposGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Parametro Formulario Iva";
		
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Parametro Formulario Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoParametroFormularioIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGrupoParametroFormularioIva.setName("jPanelCamposGrupoParametroFormularioIva"); 

		this.jPanelCamposOcultosGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGrupoParametroFormularioIva.setName("jPanelCamposOcultosGrupoParametroFormularioIva"); 

        this.jPanelAccionesGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesGrupoParametroFormularioIva.setName("Acciones"); 

		this.jPanelAccionesFormularioGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGrupoParametroFormularioIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGrupoParametroFormularioIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGrupoParametroFormularioIva.setText("Nuevo");
		this.jButtonModificarGrupoParametroFormularioIva.setText("Editar");
        this.jButtonActualizarGrupoParametroFormularioIva.setText("Actualizar");
        this.jButtonEliminarGrupoParametroFormularioIva.setText("Eliminar");
        this.jButtonCancelarGrupoParametroFormularioIva.setText("Cancelar");
        this.jButtonGuardarCambiosGrupoParametroFormularioIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.setText("Guardar");
		this.jButtonCerrarGrupoParametroFormularioIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoParametroFormularioIva,"nuevo_button","Nuevo",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGrupoParametroFormularioIva,"modificar_button","Editar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGrupoParametroFormularioIva,"actualizar_button","Actualizar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGrupoParametroFormularioIva,"eliminar_button","Eliminar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGrupoParametroFormularioIva,"cancelar_button","Cancelar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGrupoParametroFormularioIva,"guardarcambios_button","Guardar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva,"guardarcambiostabla_button","Guardar",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoParametroFormularioIva,"cerrar_button","Salir",this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGrupoParametroFormularioIva.setToolTipText("Nuevo"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGrupoParametroFormularioIva.setToolTipText("Editar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGrupoParametroFormularioIva.setToolTipText("Actualizar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGrupoParametroFormularioIva.setToolTipText("Eliminar)"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGrupoParametroFormularioIva.setToolTipText("Cancelar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGrupoParametroFormularioIva.setToolTipText("Guardar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.setToolTipText("Guardar"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoParametroFormularioIva.setToolTipText("Salir"+" "+GrupoParametroFormularioIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoParametroFormularioIva";
		inputMap = this.jButtonNuevoGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoParametroFormularioIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoParametroFormularioIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGrupoParametroFormularioIva";
		inputMap = this.jButtonActualizarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGrupoParametroFormularioIva"));
		
		//ELIMINAR
		sMapKey = "EliminarGrupoParametroFormularioIva";
		inputMap = this.jButtonEliminarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGrupoParametroFormularioIva"));
		
		//CANCELAR	
		sMapKey = "CancelarGrupoParametroFormularioIva";
		inputMap = this.jButtonCancelarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGrupoParametroFormularioIva"));
		
		//CERRAR		
		sMapKey = "CerrarGrupoParametroFormularioIva";
		inputMap = this.jButtonCerrarGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoParametroFormularioIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoParametroFormularioIva";
		inputMap = this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoParametroFormularioIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoParametroFormularioIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva.setToolTipText("Nuevo GrupoParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva.setToolTipText("Sin Cerrar Ventana GrupoParametroFormularioIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setText("Accion");
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGrupoParametroFormularioIva = new JLabelMe();
		
		this.jLabelAccionesGrupoParametroFormularioIva.setText("Acciones");		
		this.jLabelAccionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGrupoParametroFormularioIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGrupoParametroFormularioIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGrupoParametroFormularioIva=new JTabbedPane();
		this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGrupoParametroFormularioIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGrupoParametroFormularioIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jPanelCamposGrupoParametroFormularioIva.setLayout(gridaBagLayoutCamposGrupoParametroFormularioIva);
		this.jPanelCamposOcultosGrupoParametroFormularioIva.setLayout(gridaBagLayoutCamposOcultosGrupoParametroFormularioIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGrupoParametroFormularioIva.add(jLabelIdGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);



	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGrupoParametroFormularioIva.add(jLabelidGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);


	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGrupoParametroFormularioIva.add(jLabelid_empresaGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoParametroFormularioIva.add(jButtonid_empresaGrupoParametroFormularioIvaBusqueda, this.gridBagConstraintsGrupoParametroFormularioIva);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 3;
		this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoParametroFormularioIva.add(jButtonid_empresaGrupoParametroFormularioIvaUpdate, this.gridBagConstraintsGrupoParametroFormularioIva);
	}

	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGrupoParametroFormularioIva.add(jComboBoxid_empresaGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);


	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreGrupoParametroFormularioIva.add(jLabelnombreGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		//this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 2;
		this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreGrupoParametroFormularioIva.add(jButtonnombreGrupoParametroFormularioIvaBusqueda, this.gridBagConstraintsGrupoParametroFormularioIva);
	}

	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 1;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreGrupoParametroFormularioIva.add(jscrollPanenombreGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iYPanelCamposGrupoParametroFormularioIva;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iXPanelCamposGrupoParametroFormularioIva++;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoParametroFormularioIva.add(this.jPanelidGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);



	if(iXPanelCamposGrupoParametroFormularioIva % 1==0) {
		iXPanelCamposGrupoParametroFormularioIva=0;
		iYPanelCamposGrupoParametroFormularioIva++;
	}
	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iYPanelCamposGrupoParametroFormularioIva;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iXPanelCamposGrupoParametroFormularioIva++;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoParametroFormularioIva.add(this.jPanelnombreGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);



	if(iXPanelCamposGrupoParametroFormularioIva % 1==0) {
		iXPanelCamposGrupoParametroFormularioIva=0;
		iYPanelCamposGrupoParametroFormularioIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iYPanelCamposOcultosGrupoParametroFormularioIva;
	this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iXPanelCamposOcultosGrupoParametroFormularioIva++;
	this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoParametroFormularioIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoParametroFormularioIva.add(this.jPanelid_empresaGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);



	if(iXPanelCamposOcultosGrupoParametroFormularioIva % 1==0) {
		iXPanelCamposOcultosGrupoParametroFormularioIva=0;
		iYPanelCamposOcultosGrupoParametroFormularioIva++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesGrupoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesGrupoParametroFormularioIva.setLayout(gridaBagLayoutAccionesGrupoParametroFormularioIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGrupoParametroFormularioIva= new GridBagLayout();
		this.jPanelAccionesFormularioGrupoParametroFormularioIva.setLayout(gridaBagLayoutAccionesFormularioGrupoParametroFormularioIva);
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoParametroFormularioIva.add(this.jComboBoxTiposAccionesFormularioGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);

		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoParametroFormularioIva.add(this.jCheckBoxPostAccionNuevoGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoParametroFormularioIva.add(this.jCheckBoxPostAccionSinCerrarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.grupoparametroformularioivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoParametroFormularioIva.add(this.jCheckBoxPostAccionSinMensajeGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesGrupoParametroFormularioIva.add(this.jButtonModificarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);							

		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesGrupoParametroFormularioIva.add(this.jButtonEliminarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
			
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoParametroFormularioIva.add(this.jButtonActualizarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);


		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoParametroFormularioIva.add(this.jButtonGuardarCambiosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);	
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = 0;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesGrupoParametroFormularioIva.add(this.jButtonCancelarGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoParametroFormularioIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoParametroFormularioIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoparametroformularioivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();						
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;		
			//this.gridBagConstraintsGrupoParametroFormularioIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoParametroFormularioIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =0;
		this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoParametroFormularioIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GrupoParametroFormularioIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGrupoParametroFormularioIva = new GrupoParametroFormularioIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Grupo Parametro Formulario Iva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Grupo Parametro Formulario Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Parametro Formulario Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GrupoParametroFormularioIvaModel grupoparametroformularioivaModel=new GrupoParametroFormularioIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//GrupoParametroFormularioIvaModel.GrupoParametroFormularioIvaFocusTraversalPolicy grupoparametroformularioivaFocusTraversalPolicy = grupoparametroformularioivaModel.new GrupoParametroFormularioIvaFocusTraversalPolicy(this);
			
			//grupoparametroformularioivaFocusTraversalPolicy.setgrupoparametroformularioivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(grupoparametroformularioivaModel);
			
			
			this.jContentPaneDetalleGrupoParametroFormularioIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGrupoParametroFormularioIva = new GridBagLayout();	
			this.jContentPaneDetalleGrupoParametroFormularioIva.setLayout(gridaBagLayoutDetalleGrupoParametroFormularioIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoParametroFormularioIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
				this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
					
				
				this.jContentPaneDetalleGrupoParametroFormularioIva.add(jTtoolBarDetalleGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);								
				
}
			
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva=   new JScrollPane(jContentPaneDetalleGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
	        
			this.jContentPaneDetalleGrupoParametroFormularioIva.add(jPanelCamposGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);
			
			
			
			
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
						&& grupoparametroformularioivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormularioIva(this.puedeCargarPorParteFormularioIva,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(this.puedeCargarPorParteParametroFormularioIva,false,-1);
					
					if(this.grupoparametroformularioivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGrupoParametroFormularioIva= new GridBagConstraints();
						this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
						this.jContentPaneDetalleGrupoParametroFormularioIva.add(this.jTabbedPaneRelacionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGrupoParametroFormularioIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormularioIva(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGrupoParametroFormularioIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
					this.gridBagConstraintsGrupoParametroFormularioIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
					
				
					this.jContentPaneDetalleGrupoParametroFormularioIva.add(jPanelCamposOcultosGrupoParametroFormularioIva, gridBagConstraintsGrupoParametroFormularioIva);
				
					this.jPanelCamposOcultosGrupoParametroFormularioIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
	        this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGrupoParametroFormularioIva.add(this.jPanelAccionesFormularioGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);							
			
			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
	        this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
	        
			
			this.jContentPaneDetalleGrupoParametroFormularioIva.add(this.jPanelAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGrupoParametroFormularioIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva=   new JScrollPane(this.jPanelCamposGrupoParametroFormularioIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoParametroFormularioIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
			this.gridBagConstraintsGrupoParametroFormularioIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGrupoParametroFormularioIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGrupoParametroFormularioIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);			
			
			this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
			this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
			
			
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		
			
		this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
		this.gridBagConstraintsGrupoParametroFormularioIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoParametroFormularioIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoParametroFormularioIva, this.gridBagConstraintsGrupoParametroFormularioIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGrupoParametroFormularioIva;//jContentPane;
		
		return jScrollPanelDatosEdicionGrupoParametroFormularioIva;
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

				FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formularioivaSessionBean.setEsGuardarRelacionado(true);

				this.formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formularioivaBeanSwingJInternalFrame.setformularioivaSessionBean(this.formularioivaSessionBean);

				//this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
				//this.jContentPaneDetalleGrupoParametroFormularioIva.add(this.formularioivaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoParametroFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoParametroFormularioIva.add("Formulario Ivas",this.formularioivaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setComponentAt(iIndexTab,this.formularioivaBeanSwingJInternalFrame.getContentPane());
				}

				//FormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formularioivaSessionBean.setEsGuardarRelacionado(false);
				this.formularioivaBeanSwingJInternalFrame=null;//new FormularioIvaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formularioivaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormularioIva) {
					this.jTabbedPaneRelacionesGrupoParametroFormularioIva.add("Formulario Ivas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroFormularioIva(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroformularioivaSessionBean=new ParametroFormularioIvaSessionBean();
		this.parametroformularioivaSessionBean.setConGuardarRelaciones(false);
		this.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);

		this.parametroformularioivaBeanSwingJInternalFrame=null;//new ParametroFormularioIvaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroformularioivaBeanSwingJInternalFramePopup=new ParametroFormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroformularioivaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {

				ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoParametroFormularioIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroformularioivaSessionBean.setEsGuardarRelacionado(true);

				this.parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroformularioivaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroformularioivaBeanSwingJInternalFrame.setparametroformularioivaSessionBean(this.parametroformularioivaSessionBean);

				//this.gridBagConstraintsGrupoParametroFormularioIva = new GridBagConstraints();
				//this.gridBagConstraintsGrupoParametroFormularioIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoParametroFormularioIva.gridx = 0;
				//this.jContentPaneDetalleGrupoParametroFormularioIva.add(this.parametroformularioivaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoParametroFormularioIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoParametroFormularioIva.add("Parametro Formulario Ivas",this.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoParametroFormularioIva.setComponentAt(iIndexTab,this.parametroformularioivaBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroFormularioIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroformularioivaSessionBean.setEsGuardarRelacionado(false);
				this.parametroformularioivaBeanSwingJInternalFrame=null;//new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroformularioivaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroFormularioIva) {
					this.jTabbedPaneRelacionesGrupoParametroFormularioIva.add("Parametro Formulario Ivas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroFormularioIvaBeanSwingJInternalFrame(List<GrupoParametroFormularioIva> grupoparametroformularioivas,GrupoParametroFormularioIva grupoparametroformularioiva,ParametroFormularioIvaBeanSwingJInternalFrame parametroformularioivaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroformularioivaBeanSwingJInternalFrame=new ParametroFormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroformularioivaBeanSwingJInternalFrame.getParametroFormularioIvaLogic().setConnexion(this.grupoparametroformularioivaLogic.getConnexion());

					parametroformularioivaBeanSwingJInternalFrame.setgrupoparametroformularioivasForeignKey(grupoparametroformularioivas);
					parametroformularioivaBeanSwingJInternalFrame.setgrupoparametroformularioivaForeignKey(grupoparametroformularioiva);
					parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.parametroformularioivaSessionBean.setlidGrupoParametroFormularioIvaActual(grupoparametroformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroformularioivaBeanSwingJInternalFrame.cargarCombosForeignKeyParametroFormularioIva(parametroformularioivaBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroformularioivaBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.setid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva(grupoparametroformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						parametroformularioivaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroformularioivaBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoParametroFormularioIvaForeignKey(grupoparametroformularioiva,1,false,true,true);
					parametroformularioivaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroformularioivaBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoParametroFormularioIva");
					parametroformularioivaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoParametroFormularioIva");
					parametroformularioivaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFormularioIva(true);
					parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroFormularioIva("n",parametroformularioivaBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroformularioivaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroformularioivaBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroformularioivaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("relacionado");
					} else {
						parametroformularioivaBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFormularioIva("no_relacionado");
					}

					parametroformularioivaBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroFormularioIva().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormularioIvaBeanSwingJInternalFrame(List<GrupoParametroFormularioIva> grupoparametroformularioivas,GrupoParametroFormularioIva grupoparametroformularioiva,FormularioIvaBeanSwingJInternalFrame formularioivaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formularioivaBeanSwingJInternalFrame=new FormularioIvaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formularioivaBeanSwingJInternalFrame.getFormularioIvaLogic().setConnexion(this.grupoparametroformularioivaLogic.getConnexion());

					formularioivaBeanSwingJInternalFrame.setgrupoparametroformularioivasForeignKey(grupoparametroformularioivas);
					formularioivaBeanSwingJInternalFrame.setgrupoparametroformularioivaForeignKey(grupoparametroformularioiva);
					formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setisBusquedaDesdeForeignKeySesionGrupoParametroFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.formularioivaSessionBean.setlidGrupoParametroFormularioIvaActual(grupoparametroformularioiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formularioivaBeanSwingJInternalFrame.cargarCombosForeignKeyFormularioIva(formularioivaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formularioivaBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoParametroFormularioIva(true);
					formularioivaBeanSwingJInternalFrame.setid_grupo_parametro_formulario_ivaFK_IdGrupoParametroFormularioIva(grupoparametroformularioiva.getId());

					if(!this.conCargarFormDetalle) {
						formularioivaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formularioivaBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoParametroFormularioIvaForeignKey(grupoparametroformularioiva,1,false,true,true);
					formularioivaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formularioivaBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoParametroFormularioIva");
					formularioivaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoParametroFormularioIva");
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
