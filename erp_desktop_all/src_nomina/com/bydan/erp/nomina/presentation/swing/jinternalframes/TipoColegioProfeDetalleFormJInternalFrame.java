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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoColegioProfeConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoColegioProfeDetalleFormJInternalFrame extends TipoColegioProfeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoColegioProfe;
	
	protected JMenuBar jmenuBarDetalleTipoColegioProfe;
	
	protected JMenu jmenuDetalleTipoColegioProfe;
	protected JMenu jmenuDetalleArchivoTipoColegioProfe;
	protected JMenu jmenuDetalleAccionesTipoColegioProfe;
	protected JMenu jmenuDetalleDatosTipoColegioProfe;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoColegioProfe;	
	protected GridBagConstraints gridBagConstraintsTipoColegioProfe;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoColegioProfeBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoColegioProfe;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoColegioProfeSessionBean tipocolegioprofeSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoColegioProfeLogic tipocolegioprofeLogic;
	
	public JScrollPane jScrollPanelDatosTipoColegioProfe;
	public JScrollPane jScrollPanelDatosEdicionTipoColegioProfe;
	public JScrollPane jScrollPanelDatosGeneralTipoColegioProfe;
	
	protected JPanel jPanelCamposTipoColegioProfe;    
	protected JPanel jPanelCamposOcultosTipoColegioProfe;    	
	protected JPanel jPanelAccionesTipoColegioProfe;
	protected JPanel jPanelAccionesFormularioTipoColegioProfe;
    
	
	
	protected Integer iXPanelCamposTipoColegioProfe=0;
	protected Integer iYPanelCamposTipoColegioProfe=0;
	
	protected Integer iXPanelCamposOcultosTipoColegioProfe=0;
	protected Integer iYPanelCamposOcultosTipoColegioProfe=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoColegioProfe;
	public JButton jButtonModificarTipoColegioProfe;
	public JButton jButtonActualizarTipoColegioProfe;
    public JButton jButtonEliminarTipoColegioProfe;
	public JButton jButtonCancelarTipoColegioProfe;
    public JButton jButtonGuardarCambiosTipoColegioProfe;
	public JButton jButtonGuardarCambiosTablaTipoColegioProfe;
	protected JButton jButtonCerrarTipoColegioProfe;
	
	
	protected JButton jButtonProcesarInformacionTipoColegioProfe;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoColegioProfe;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoColegioProfe;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoColegioProfe;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoColegioProfe;
	protected JButton jButtonModificarToolBarTipoColegioProfe;
	protected JButton jButtonActualizarToolBarTipoColegioProfe;
    protected JButton jButtonEliminarToolBarTipoColegioProfe;
	protected JButton jButtonCancelarToolBarTipoColegioProfe;
    protected JButton jButtonGuardarCambiosToolBarTipoColegioProfe;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoColegioProfe;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoColegioProfe;
	protected JButton jButtonCerrarToolBarTipoColegioProfe;
	
	protected JButton jButtonProcesarInformacionToolBarTipoColegioProfe;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoColegioProfe;
	protected JMenuItem jMenuItemModificarTipoColegioProfe;
	protected JMenuItem jMenuItemActualizarTipoColegioProfe;
    protected JMenuItem jMenuItemEliminarTipoColegioProfe;
	protected JMenuItem jMenuItemCancelarTipoColegioProfe;
    protected JMenuItem jMenuItemGuardarCambiosTipoColegioProfe;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoColegioProfe;
	protected JMenuItem jMenuItemCerrarTipoColegioProfe;
	protected JMenuItem jMenuItemDetalleCerrarTipoColegioProfe;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoColegioProfe;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoColegioProfe;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoColegioProfe;
	protected JMenuItem jMenuItemMostrarOcultarTipoColegioProfe;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoColegioProfe;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoColegioProfe;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoColegioProfe;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoColegioProfe;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoColegioProfe;
	public JLabel jLabelIdTipoColegioProfe;
	public JLabel jLabelidTipoColegioProfe;
	public JButton jButtonidTipoColegioProfeBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoColegioProfe;
	public JLabel jLabelcodigoTipoColegioProfe;
	public JTextField jTextFieldcodigoTipoColegioProfe;
	public JButton jButtoncodigoTipoColegioProfeBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoColegioProfe;
	public JLabel jLabelnombreTipoColegioProfe;
	public JTextArea jTextAreanombreTipoColegioProfe;
	public JScrollPane jscrollPanenombreTipoColegioProfe;
	public JButton jButtonnombreTipoColegioProfeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoColegioProfe;
	public JLabel jLabelid_empresaTipoColegioProfe;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoColegioProfe;
	public JButton jButtonid_empresaTipoColegioProfe= new JButtonMe();
	public JButton jButtonid_empresaTipoColegioProfeUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoColegioProfeBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoColegioProfe;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoColegioProfeDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoColegioProfe=new JPanel();
				this.jPanelAccionesFormularioTipoColegioProfe=new JPanel();
				this.jmenuBarDetalleTipoColegioProfe=new JMenuBar();
				this.jTtoolBarDetalleTipoColegioProfe=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoColegioProfeDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoColegioProfeDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoColegioProfe No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoColegioProfe() {
		return this.jButtonActualizarToolBarTipoColegioProfe;
	}
	
	public JButton getjButtonEliminarToolBarTipoColegioProfe() {
		return this.jButtonEliminarToolBarTipoColegioProfe;
	}
	
	public JButton getjButtonCancelarToolBarTipoColegioProfe() {
		return this.jButtonCancelarToolBarTipoColegioProfe;
	}		
	
	public JButton getjButtonProcesarInformacionTipoColegioProfe() {
		return this.jButtonProcesarInformacionTipoColegioProfe;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoColegioProfe)	{
		this.jButtonProcesarInformacionTipoColegioProfe = jButtonProcesarInformacionTipoColegioProfe;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoColegioProfe() {
		return this.jComboBoxTiposAccionesTipoColegioProfe;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoColegioProfe(
			JComboBox jComboBoxTiposRelacionesTipoColegioProfe) {
		this.jComboBoxTiposRelacionesTipoColegioProfe = jComboBoxTiposRelacionesTipoColegioProfe;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoColegioProfe(
			JComboBox jComboBoxTiposAccionesTipoColegioProfe) {
		this.jComboBoxTiposAccionesTipoColegioProfe = jComboBoxTiposAccionesTipoColegioProfe;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoColegioProfe() {
		return this.jComboBoxTiposAccionesFormularioTipoColegioProfe;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoColegioProfe(
			JComboBox jComboBoxTiposAccionesFormularioTipoColegioProfe) {
		this.jComboBoxTiposAccionesFormularioTipoColegioProfe = jComboBoxTiposAccionesFormularioTipoColegioProfe;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
		
		this.tipocolegioprofeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocolegioprofeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocolegioprofeSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoColegioProfeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoColegioProfeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoColegioProfeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Colegio Profe MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoColegioProfeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoColegioProfe= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoColegioProfe=new JButtonMe();
				this.jButtonModificarToolBarTipoColegioProfe=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoColegioProfe,this.jTtoolBarDetalleTipoColegioProfe,
							"actualizar","actualizar","Actualizar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoColegioProfe,this.jTtoolBarDetalleTipoColegioProfe,
							"eliminar","eliminar","Eliminar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoColegioProfe,this.jTtoolBarDetalleTipoColegioProfe,
							"cancelar","cancelar","Cancelar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoColegioProfe=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoColegioProfe,this.jTtoolBarDetalleTipoColegioProfe,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoColegioProfe=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoColegioProfe=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoColegioProfe=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoColegioProfe=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoColegioProfe=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoColegioProfe= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoColegioProfe.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoColegioProfe,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoColegioProfe= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoColegioProfe.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoColegioProfe,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoColegioProfe= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoColegioProfe.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoColegioProfe,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoColegioProfe= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoColegioProfe.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoColegioProfe,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoColegioProfe= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoColegioProfe.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoColegioProfe,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoColegioProfe= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoColegioProfe.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoColegioProfe,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoColegioProfe= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoColegioProfe.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoColegioProfe,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoColegioProfe= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoColegioProfe.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoColegioProfe,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoColegioProfe= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoColegioProfe.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoColegioProfe,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoColegioProfe= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoColegioProfe.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoColegioProfe,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoColegioProfe.add(this.jMenuItemDetalleCerrarTipoColegioProfe);
		
		this.jmenuDetalleAccionesTipoColegioProfe.add(this.jMenuItemActualizarTipoColegioProfe);
		this.jmenuDetalleAccionesTipoColegioProfe.add(this.jMenuItemEliminarTipoColegioProfe);
		this.jmenuDetalleAccionesTipoColegioProfe.add(this.jMenuItemCancelarTipoColegioProfe);		
		
		//this.jmenuDetalleDatosTipoColegioProfe.add(this.jMenuItemDetalleAbrirOrderByTipoColegioProfe);				
		this.jmenuDetalleDatosTipoColegioProfe.add(this.jMenuItemDetalleMostarOcultarTipoColegioProfe);				
				
		//this.jmenuDetalleAccionesTipoColegioProfe.add(this.jMenuItemGuardarCambiosTipoColegioProfe);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoColegioProfe.add(this.jmenuDetalleArchivoTipoColegioProfe);		
		this.jmenuBarDetalleTipoColegioProfe.add(this.jmenuDetalleAccionesTipoColegioProfe);		
		this.jmenuBarDetalleTipoColegioProfe.add(this.jmenuDetalleDatosTipoColegioProfe);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoColegioProfe);				
	}
	
	
	public void inicializarElementosCamposTipoColegioProfe() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoColegioProfe = new JLabelMe();
		jLabelIdTipoColegioProfe.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoColegioProfe = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoColegioProfe.setToolTipText(TipoColegioProfeConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoColegioProfe= new GridBagLayout();

		this.jPanelidTipoColegioProfe.setLayout(this.gridaBagLayoutTipoColegioProfe);

		jLabelidTipoColegioProfe = new JLabel();
		jLabelidTipoColegioProfe.setText("Id");

		jLabelidTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoColegioProfe = new JLabelMe();
		this.jLabelcodigoTipoColegioProfe.setText(""+TipoColegioProfeConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoColegioProfe.setToolTipText("Codigo");
		this.jLabelcodigoTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoColegioProfe=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoColegioProfe.setToolTipText(TipoColegioProfeConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoColegioProfe = new GridBagLayout();
		this.jPanelcodigoTipoColegioProfe.setLayout(this.gridaBagLayoutTipoColegioProfe);


		jTextFieldcodigoTipoColegioProfe= new JTextFieldMe();

		jTextFieldcodigoTipoColegioProfe.setEnabled(false);
		jTextFieldcodigoTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoColegioProfeBusqueda= new JButtonMe();
		this.jButtoncodigoTipoColegioProfeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoColegioProfeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoColegioProfeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoColegioProfeBusqueda.setText("U");
		this.jButtoncodigoTipoColegioProfeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoColegioProfeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoColegioProfeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoColegioProfeBusqueda"));

		if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoColegioProfeBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoColegioProfe = new JLabelMe();
		this.jLabelnombreTipoColegioProfe.setText(""+TipoColegioProfeConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoColegioProfe.setToolTipText("Nombre");
		this.jLabelnombreTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoColegioProfe=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoColegioProfe.setToolTipText(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoColegioProfe = new GridBagLayout();
		this.jPanelnombreTipoColegioProfe.setLayout(this.gridaBagLayoutTipoColegioProfe);


		jTextAreanombreTipoColegioProfe= new JTextAreaMe();
		jTextAreanombreTipoColegioProfe.setEnabled(false);
		jTextAreanombreTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoColegioProfe.setLineWrap(true);
		jTextAreanombreTipoColegioProfe.setWrapStyleWord(true);
		jTextAreanombreTipoColegioProfe.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoColegioProfe.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoColegioProfe = new JScrollPane(jTextAreanombreTipoColegioProfe);
		jscrollPanenombreTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoColegioProfeBusqueda= new JButtonMe();
		this.jButtonnombreTipoColegioProfeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoColegioProfeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoColegioProfeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoColegioProfeBusqueda.setText("U");
		this.jButtonnombreTipoColegioProfeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoColegioProfeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoColegioProfeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoColegioProfeBusqueda"));

		if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoColegioProfeBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoColegioProfe() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoColegioProfe = new JLabelMe();
		this.jLabelid_empresaTipoColegioProfe.setText(""+TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoColegioProfe.setToolTipText("Empresa");
		this.jLabelid_empresaTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoColegioProfe=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoColegioProfe.setToolTipText(TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoColegioProfe = new GridBagLayout();
		this.jPanelid_empresaTipoColegioProfe.setLayout(this.gridaBagLayoutTipoColegioProfe);


		jComboBoxid_empresaTipoColegioProfe= new JComboBoxMe();
		jComboBoxid_empresaTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoColegioProfe.setEnabled(false);

		this.jButtonid_empresaTipoColegioProfe= new JButtonMe();
		this.jButtonid_empresaTipoColegioProfe.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoColegioProfe.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoColegioProfe.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoColegioProfe.setText("Buscar");
		this.jButtonid_empresaTipoColegioProfe.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoColegioProfe.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoColegioProfe,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoColegioProfe"));

		this.jButtonid_empresaTipoColegioProfeBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoColegioProfeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoColegioProfeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoColegioProfeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoColegioProfeBusqueda.setText("U");
		this.jButtonid_empresaTipoColegioProfeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoColegioProfeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoColegioProfeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoColegioProfeBusqueda"));

		if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoColegioProfeBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoColegioProfeUpdate= new JButtonMe();
		this.jButtonid_empresaTipoColegioProfeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoColegioProfeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoColegioProfeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoColegioProfeUpdate.setText("U");
		this.jButtonid_empresaTipoColegioProfeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoColegioProfeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoColegioProfeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoColegioProfeUpdate"));



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
		//this.jInternalFrameDetalleTipoColegioProfe = new TipoColegioProfeBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Colegio Profe DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoColegioProfe= new GridBagLayout();
		

		
		String sToolTipTipoColegioProfe="";
		sToolTipTipoColegioProfe=TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoColegioProfe+="(Nomina.TipoColegioProfe)";
		}
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoColegioProfe+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoColegioProfe = new JButtonMe();
		this.jButtonModificarTipoColegioProfe = new JButtonMe();
        this.jButtonActualizarTipoColegioProfe = new JButtonMe();
        this.jButtonEliminarTipoColegioProfe = new JButtonMe();
        this.jButtonCancelarTipoColegioProfe = new JButtonMe();
        this.jButtonGuardarCambiosTipoColegioProfe = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoColegioProfe = new JButtonMe();
		this.jButtonCerrarTipoColegioProfe = new JButtonMe();
		
		this.jScrollPanelDatosTipoColegioProfe = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoColegioProfe = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoColegioProfe = new JScrollPane();
				
		
		
		this.jPanelCamposTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Colegio Profe";
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Colegio Profes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoColegioProfe.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoColegioProfe.setName("jPanelCamposTipoColegioProfe"); 

		this.jPanelCamposOcultosTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoColegioProfe.setName("jPanelCamposOcultosTipoColegioProfe"); 

        this.jPanelAccionesTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoColegioProfe.setToolTipText("Acciones");
        this.jPanelAccionesTipoColegioProfe.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoColegioProfe.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoColegioProfe.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoColegioProfe.setText("Nuevo");
		this.jButtonModificarTipoColegioProfe.setText("Editar");
        this.jButtonActualizarTipoColegioProfe.setText("Actualizar");
        this.jButtonEliminarTipoColegioProfe.setText("Eliminar");
        this.jButtonCancelarTipoColegioProfe.setText("Cancelar");
        this.jButtonGuardarCambiosTipoColegioProfe.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoColegioProfe.setText("Guardar");
		this.jButtonCerrarTipoColegioProfe.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoColegioProfe,"nuevo_button","Nuevo",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoColegioProfe,"modificar_button","Editar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoColegioProfe,"actualizar_button","Actualizar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoColegioProfe,"eliminar_button","Eliminar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoColegioProfe,"cancelar_button","Cancelar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoColegioProfe,"guardarcambios_button","Guardar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoColegioProfe,"guardarcambiostabla_button","Guardar",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoColegioProfe,"cerrar_button","Salir",this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoColegioProfe.setToolTipText("Nuevo"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoColegioProfe.setToolTipText("Editar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoColegioProfe.setToolTipText("Actualizar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoColegioProfe.setToolTipText("Eliminar)"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoColegioProfe.setToolTipText("Cancelar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoColegioProfe.setToolTipText("Guardar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoColegioProfe.setToolTipText("Guardar"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoColegioProfe.setToolTipText("Salir"+" "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoColegioProfe";
		inputMap = this.jButtonNuevoTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoColegioProfe.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoColegioProfe"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoColegioProfe";
		inputMap = this.jButtonActualizarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoColegioProfe"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoColegioProfe";
		inputMap = this.jButtonEliminarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoColegioProfe"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoColegioProfe";
		inputMap = this.jButtonCancelarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoColegioProfe"));
		
		//CERRAR		
		sMapKey = "CerrarTipoColegioProfe";
		inputMap = this.jButtonCerrarTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoColegioProfe"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoColegioProfe";
		inputMap = this.jButtonGuardarCambiosTablaTipoColegioProfe.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoColegioProfe"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoColegioProfe = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoColegioProfe.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoColegioProfe.setToolTipText("Nuevo TipoColegioProfe");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoColegioProfe = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoColegioProfe.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoColegioProfe.setToolTipText("Sin Cerrar Ventana TipoColegioProfe");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoColegioProfe = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoColegioProfe.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoColegioProfe.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoColegioProfe.setText("Accion");
		this.jComboBoxTiposAccionesTipoColegioProfe.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoColegioProfe = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoColegioProfe.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoColegioProfe.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoColegioProfe = new JLabelMe();
		
		this.jLabelAccionesTipoColegioProfe.setText("Acciones");		
		this.jLabelAccionesTipoColegioProfe.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoColegioProfe.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoColegioProfe.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoColegioProfe();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoColegioProfe();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoColegioProfe=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoColegioProfe.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoColegioProfe,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoColegioProfe.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoColegioProfe.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoColegioProfe.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoColegioProfe.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoColegioProfe.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoColegioProfe.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoColegioProfe, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoColegioProfe = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoColegioProfe = new GridBagLayout();
		
		this.jPanelCamposTipoColegioProfe.setLayout(gridaBagLayoutCamposTipoColegioProfe);
		this.jPanelCamposOcultosTipoColegioProfe.setLayout(gridaBagLayoutCamposOcultosTipoColegioProfe);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoColegioProfe.add(jLabelIdTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 1;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoColegioProfe.add(jLabelidTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);


	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoColegioProfe.add(jLabelid_empresaTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		//this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx = 2;
		this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
		this.gridBagConstraintsTipoColegioProfe.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoColegioProfe.add(jButtonid_empresaTipoColegioProfeBusqueda, this.gridBagConstraintsTipoColegioProfe);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		//this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx = 3;
		this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
		this.gridBagConstraintsTipoColegioProfe.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoColegioProfe.add(jButtonid_empresaTipoColegioProfeUpdate, this.gridBagConstraintsTipoColegioProfe);
	}

	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 1;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoColegioProfe.add(jComboBoxid_empresaTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);


	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoColegioProfe.add(jLabelcodigoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		//this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx = 2;
		this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
		this.gridBagConstraintsTipoColegioProfe.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoColegioProfe.add(jButtoncodigoTipoColegioProfeBusqueda, this.gridBagConstraintsTipoColegioProfe);
	}

	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 1;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoColegioProfe.add(jTextFieldcodigoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);


	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoColegioProfe.add(jLabelnombreTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		//this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx = 2;
		this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
		this.gridBagConstraintsTipoColegioProfe.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoColegioProfe.add(jButtonnombreTipoColegioProfeBusqueda, this.gridBagConstraintsTipoColegioProfe);
	}

	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoColegioProfe.gridy = 0;
	this.gridBagConstraintsTipoColegioProfe.gridx = 1;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoColegioProfe.add(jscrollPanenombreTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoColegioProfe.gridy = iYPanelCamposTipoColegioProfe;
	this.gridBagConstraintsTipoColegioProfe.gridx = iXPanelCamposTipoColegioProfe++;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoColegioProfe.add(this.jPanelidTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(iXPanelCamposTipoColegioProfe % 1==0) {
		iXPanelCamposTipoColegioProfe=0;
		iYPanelCamposTipoColegioProfe++;
	}
	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoColegioProfe.gridy = iYPanelCamposTipoColegioProfe;
	this.gridBagConstraintsTipoColegioProfe.gridx = iXPanelCamposTipoColegioProfe++;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoColegioProfe.add(this.jPanelcodigoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(iXPanelCamposTipoColegioProfe % 1==0) {
		iXPanelCamposTipoColegioProfe=0;
		iYPanelCamposTipoColegioProfe++;
	}
	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoColegioProfe.gridy = iYPanelCamposTipoColegioProfe;
	this.gridBagConstraintsTipoColegioProfe.gridx = iXPanelCamposTipoColegioProfe++;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoColegioProfe.add(this.jPanelnombreTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(iXPanelCamposTipoColegioProfe % 1==0) {
		iXPanelCamposTipoColegioProfe=0;
		iYPanelCamposTipoColegioProfe++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoColegioProfe.gridy = iYPanelCamposOcultosTipoColegioProfe;
	this.gridBagConstraintsTipoColegioProfe.gridx = iXPanelCamposOcultosTipoColegioProfe++;
	this.gridBagConstraintsTipoColegioProfe.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoColegioProfe.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoColegioProfe.add(this.jPanelid_empresaTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);



	if(iXPanelCamposOcultosTipoColegioProfe % 1==0) {
		iXPanelCamposOcultosTipoColegioProfe=0;
		iYPanelCamposOcultosTipoColegioProfe++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoColegioProfe= new GridBagLayout();
		this.jPanelAccionesTipoColegioProfe.setLayout(gridaBagLayoutAccionesTipoColegioProfe);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoColegioProfe= new GridBagLayout();
		this.jPanelAccionesFormularioTipoColegioProfe.setLayout(gridaBagLayoutAccionesFormularioTipoColegioProfe);
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoColegioProfe.add(this.jComboBoxTiposAccionesFormularioTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoColegioProfe.add(this.jCheckBoxPostAccionNuevoTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoColegioProfe.add(this.jCheckBoxPostAccionSinCerrarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoColegioProfe.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoColegioProfe.add(this.jCheckBoxPostAccionSinMensajeTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoColegioProfe.add(this.jButtonModificarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);							

		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;
		this.gridBagConstraintsTipoColegioProfe.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoColegioProfe.add(this.jButtonEliminarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
			
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoColegioProfe.add(this.jButtonActualizarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);


		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;		
		this.gridBagConstraintsTipoColegioProfe.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoColegioProfe.add(this.jButtonGuardarCambiosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);	
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = 0;		
		this.gridBagConstraintsTipoColegioProfe.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoColegioProfe.add(this.jButtonCancelarTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoColegioProfe = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoColegioProfe);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();						
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoColegioProfe.gridx = 0;		
			//this.gridBagConstraintsTipoColegioProfe.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoColegioProfe.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoColegioProfe.gridx =0;
		this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoColegioProfe.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoColegioProfe = new TipoColegioProfeBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Colegio Profe DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Colegio Profe DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Colegio Profe Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoColegioProfeModel tipocolegioprofeModel=new TipoColegioProfeModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoColegioProfeModel.TipoColegioProfeFocusTraversalPolicy tipocolegioprofeFocusTraversalPolicy = tipocolegioprofeModel.new TipoColegioProfeFocusTraversalPolicy(this);
			
			//tipocolegioprofeFocusTraversalPolicy.settipocolegioprofeJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocolegioprofeModel);
			
			
			this.jContentPaneDetalleTipoColegioProfe = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoColegioProfe = new GridBagLayout();	
			this.jContentPaneDetalleTipoColegioProfe.setLayout(gridaBagLayoutDetalleTipoColegioProfe);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoColegioProfe = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
				this.gridBagConstraintsTipoColegioProfe.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoColegioProfe.gridx = 0;
					
				
				this.jContentPaneDetalleTipoColegioProfe.add(jTtoolBarDetalleTipoColegioProfe, gridBagConstraintsTipoColegioProfe);								
				
}
			
			this.jScrollPanelDatosEdicionTipoColegioProfe=   new JScrollPane(jContentPaneDetalleTipoColegioProfe,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoColegioProfe.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoColegioProfe.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoColegioProfe.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoColegioProfe=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoColegioProfe.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoColegioProfe.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoColegioProfe.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoColegioProfe.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	        
			this.jContentPaneDetalleTipoColegioProfe.add(jPanelCamposTipoColegioProfe, gridBagConstraintsTipoColegioProfe);
			
			
			
			
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
						&& tipocolegioprofeSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoColegioProfe= new GridBagConstraints();
						this.gridBagConstraintsTipoColegioProfe.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoColegioProfe.gridx = 0;
						this.jContentPaneDetalleTipoColegioProfe.add(this.jTabbedPaneRelacionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoColegioProfe.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoColegioProfe.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
					this.gridBagConstraintsTipoColegioProfe.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoColegioProfe.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoColegioProfe.gridx = 0;
					
				
					this.jContentPaneDetalleTipoColegioProfe.add(jPanelCamposOcultosTipoColegioProfe, gridBagConstraintsTipoColegioProfe);
				
					this.jPanelCamposOcultosTipoColegioProfe.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	        this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoColegioProfe.add(this.jPanelAccionesFormularioTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);							
			
			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
	        this.gridBagConstraintsTipoColegioProfe.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoColegioProfe.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoColegioProfe.add(this.jPanelAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoColegioProfe);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoColegioProfe=   new JScrollPane(this.jPanelCamposTipoColegioProfe,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoColegioProfe.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoColegioProfe.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoColegioProfe.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoColegioProfe.gridx = 0;
			this.gridBagConstraintsTipoColegioProfe.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoColegioProfe.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoColegioProfe.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoColegioProfe.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);			
			
			this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
			this.gridBagConstraintsTipoColegioProfe.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoColegioProfe.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
			
			
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		
			
		this.gridBagConstraintsTipoColegioProfe = new GridBagConstraints();
		this.gridBagConstraintsTipoColegioProfe.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoColegioProfe.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoColegioProfe, this.gridBagConstraintsTipoColegioProfe);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoColegioProfe;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoColegioProfe;
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
