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
import com.bydan.erp.contabilidad.util.TipoLineaFlujoCajaConstantesFunciones;

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
public class TipoLineaFlujoCajaDetalleFormJInternalFrame extends TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoLineaFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleTipoLineaFlujoCaja;
	
	protected JMenu jmenuDetalleTipoLineaFlujoCaja;
	protected JMenu jmenuDetalleArchivoTipoLineaFlujoCaja;
	protected JMenu jmenuDetalleAccionesTipoLineaFlujoCaja;
	protected JMenu jmenuDetalleDatosTipoLineaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLineaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsTipoLineaFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoLineaFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoLineaFlujoCajaSessionBean tipolineaflujocajaSessionBean;
	
	

	public LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame=null;
	public LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLineaFlujoCaja=false;
	public LineaFlujoCajaSessionBean lineaflujocajaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoLineaFlujoCajaLogic tipolineaflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosTipoLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionTipoLineaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralTipoLineaFlujoCaja;
	
	protected JPanel jPanelCamposTipoLineaFlujoCaja;    
	protected JPanel jPanelCamposOcultosTipoLineaFlujoCaja;    	
	protected JPanel jPanelAccionesTipoLineaFlujoCaja;
	protected JPanel jPanelAccionesFormularioTipoLineaFlujoCaja;
    
	
	
	protected Integer iXPanelCamposTipoLineaFlujoCaja=0;
	protected Integer iYPanelCamposTipoLineaFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosTipoLineaFlujoCaja=0;
	protected Integer iYPanelCamposOcultosTipoLineaFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoLineaFlujoCaja;
	public JButton jButtonModificarTipoLineaFlujoCaja;
	public JButton jButtonActualizarTipoLineaFlujoCaja;
    public JButton jButtonEliminarTipoLineaFlujoCaja;
	public JButton jButtonCancelarTipoLineaFlujoCaja;
    public JButton jButtonGuardarCambiosTipoLineaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaTipoLineaFlujoCaja;
	protected JButton jButtonCerrarTipoLineaFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionTipoLineaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoLineaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLineaFlujoCaja;
	protected JButton jButtonModificarToolBarTipoLineaFlujoCaja;
	protected JButton jButtonActualizarToolBarTipoLineaFlujoCaja;
    protected JButton jButtonEliminarToolBarTipoLineaFlujoCaja;
	protected JButton jButtonCancelarToolBarTipoLineaFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarTipoLineaFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoLineaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLineaFlujoCaja;
	protected JButton jButtonCerrarToolBarTipoLineaFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarTipoLineaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemModificarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemActualizarTipoLineaFlujoCaja;
    protected JMenuItem jMenuItemEliminarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemCancelarTipoLineaFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemCerrarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLineaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarTipoLineaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLineaFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLineaFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoLineaFlujoCaja;
	public JLabel jLabelIdTipoLineaFlujoCaja;
	public JLabel jLabelidTipoLineaFlujoCaja;
	public JButton jButtonidTipoLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoLineaFlujoCaja;
	public JLabel jLabelnombreTipoLineaFlujoCaja;
	public JTextArea jTextAreanombreTipoLineaFlujoCaja;
	public JScrollPane jscrollPanenombreTipoLineaFlujoCaja;
	public JButton jButtonnombreTipoLineaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sriTipoLineaFlujoCaja;
	public JLabel jLabelcodigo_sriTipoLineaFlujoCaja;
	public JTextField jTextFieldcodigo_sriTipoLineaFlujoCaja;
	public JButton jButtoncodigo_sriTipoLineaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoLineaFlujoCaja;
	public JLabel jLabelid_empresaTipoLineaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoLineaFlujoCaja;
	public JButton jButtonid_empresaTipoLineaFlujoCaja= new JButtonMe();
	public JButton jButtonid_empresaTipoLineaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoLineaFlujoCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoLineaFlujoCaja;
	
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
	
	public TipoLineaFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoLineaFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioTipoLineaFlujoCaja=new JPanel();
				this.jmenuBarDetalleTipoLineaFlujoCaja=new JMenuBar();
				this.jTtoolBarDetalleTipoLineaFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoLineaFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLineaFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLineaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoLineaFlujoCaja() {
		return this.jButtonActualizarToolBarTipoLineaFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarTipoLineaFlujoCaja() {
		return this.jButtonEliminarToolBarTipoLineaFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarTipoLineaFlujoCaja() {
		return this.jButtonCancelarToolBarTipoLineaFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionTipoLineaFlujoCaja() {
		return this.jButtonProcesarInformacionTipoLineaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLineaFlujoCaja)	{
		this.jButtonProcesarInformacionTipoLineaFlujoCaja = jButtonProcesarInformacionTipoLineaFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLineaFlujoCaja() {
		return this.jComboBoxTiposAccionesTipoLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesTipoLineaFlujoCaja) {
		this.jComboBoxTiposRelacionesTipoLineaFlujoCaja = jComboBoxTiposRelacionesTipoLineaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposAccionesTipoLineaFlujoCaja) {
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja = jComboBoxTiposAccionesTipoLineaFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoLineaFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoLineaFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja = jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipolineaflujocajaSessionBean=new TipoLineaFlujoCajaSessionBean();
		
		this.tipolineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLineaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Linea Flujo Caja  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoLineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoLineaFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoLineaFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarTipoLineaFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoLineaFlujoCaja,this.jTtoolBarDetalleTipoLineaFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoLineaFlujoCaja,this.jTtoolBarDetalleTipoLineaFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoLineaFlujoCaja,this.jTtoolBarDetalleTipoLineaFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoLineaFlujoCaja,this.jTtoolBarDetalleTipoLineaFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoLineaFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoLineaFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoLineaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoLineaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoLineaFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLineaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLineaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLineaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoLineaFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoLineaFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoLineaFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoLineaFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoLineaFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoLineaFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoLineaFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoLineaFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoLineaFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoLineaFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoLineaFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoLineaFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoLineaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLineaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLineaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLineaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLineaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLineaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoLineaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoLineaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoLineaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoLineaFlujoCaja.add(this.jMenuItemDetalleCerrarTipoLineaFlujoCaja);
		
		this.jmenuDetalleAccionesTipoLineaFlujoCaja.add(this.jMenuItemActualizarTipoLineaFlujoCaja);
		this.jmenuDetalleAccionesTipoLineaFlujoCaja.add(this.jMenuItemEliminarTipoLineaFlujoCaja);
		this.jmenuDetalleAccionesTipoLineaFlujoCaja.add(this.jMenuItemCancelarTipoLineaFlujoCaja);		
		
		//this.jmenuDetalleDatosTipoLineaFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByTipoLineaFlujoCaja);				
		this.jmenuDetalleDatosTipoLineaFlujoCaja.add(this.jMenuItemDetalleMostarOcultarTipoLineaFlujoCaja);				
				
		//this.jmenuDetalleAccionesTipoLineaFlujoCaja.add(this.jMenuItemGuardarCambiosTipoLineaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoLineaFlujoCaja.add(this.jmenuDetalleArchivoTipoLineaFlujoCaja);		
		this.jmenuBarDetalleTipoLineaFlujoCaja.add(this.jmenuDetalleAccionesTipoLineaFlujoCaja);		
		this.jmenuBarDetalleTipoLineaFlujoCaja.add(this.jmenuDetalleDatosTipoLineaFlujoCaja);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoLineaFlujoCaja.add(this.jmenuDetalleTipoLineaFlujoCaja);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoLineaFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposTipoLineaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoLineaFlujoCaja = new JLabelMe();
		jLabelIdTipoLineaFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoLineaFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoLineaFlujoCaja.setToolTipText(TipoLineaFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoLineaFlujoCaja= new GridBagLayout();

		this.jPanelidTipoLineaFlujoCaja.setLayout(this.gridaBagLayoutTipoLineaFlujoCaja);

		jLabelidTipoLineaFlujoCaja = new JLabel();
		jLabelidTipoLineaFlujoCaja.setText("Id");

		jLabelidTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoLineaFlujoCaja = new JLabelMe();
		this.jLabelnombreTipoLineaFlujoCaja.setText(""+TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoLineaFlujoCaja.setToolTipText("Nombre");
		this.jLabelnombreTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoLineaFlujoCaja.setToolTipText(TipoLineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoLineaFlujoCaja = new GridBagLayout();
		this.jPanelnombreTipoLineaFlujoCaja.setLayout(this.gridaBagLayoutTipoLineaFlujoCaja);


		jTextAreanombreTipoLineaFlujoCaja= new JTextAreaMe();
		jTextAreanombreTipoLineaFlujoCaja.setEnabled(false);
		jTextAreanombreTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLineaFlujoCaja.setLineWrap(true);
		jTextAreanombreTipoLineaFlujoCaja.setWrapStyleWord(true);
		jTextAreanombreTipoLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoLineaFlujoCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoLineaFlujoCaja = new JScrollPane(jTextAreanombreTipoLineaFlujoCaja);
		jscrollPanenombreTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonnombreTipoLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoLineaFlujoCajaBusqueda.setText("U");
		this.jButtonnombreTipoLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoLineaFlujoCajaBusqueda"));

		if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoLineaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sriTipoLineaFlujoCaja = new JLabelMe();
		this.jLabelcodigo_sriTipoLineaFlujoCaja.setText(""+TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI+" : *");
		this.jLabelcodigo_sriTipoLineaFlujoCaja.setToolTipText("Codigo Sri");
		this.jLabelcodigo_sriTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sriTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sriTipoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sriTipoLineaFlujoCaja.setToolTipText(TipoLineaFlujoCajaConstantesFunciones.LABEL_CODIGOSRI);
		this.gridaBagLayoutTipoLineaFlujoCaja = new GridBagLayout();
		this.jPanelcodigo_sriTipoLineaFlujoCaja.setLayout(this.gridaBagLayoutTipoLineaFlujoCaja);


		jTextFieldcodigo_sriTipoLineaFlujoCaja= new JTextFieldMe();

		jTextFieldcodigo_sriTipoLineaFlujoCaja.setEnabled(false);
		jTextFieldcodigo_sriTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sriTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setText("U");
		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sriTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sriTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sriTipoLineaFlujoCajaBusqueda"));

		if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sriTipoLineaFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoLineaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoLineaFlujoCaja = new JLabelMe();
		this.jLabelid_empresaTipoLineaFlujoCaja.setText(""+TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoLineaFlujoCaja.setToolTipText("Empresa");
		this.jLabelid_empresaTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoLineaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoLineaFlujoCaja.setToolTipText(TipoLineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoLineaFlujoCaja = new GridBagLayout();
		this.jPanelid_empresaTipoLineaFlujoCaja.setLayout(this.gridaBagLayoutTipoLineaFlujoCaja);


		jComboBoxid_empresaTipoLineaFlujoCaja= new JComboBoxMe();
		jComboBoxid_empresaTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoLineaFlujoCaja.setEnabled(false);

		this.jButtonid_empresaTipoLineaFlujoCaja= new JButtonMe();
		this.jButtonid_empresaTipoLineaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLineaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLineaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLineaFlujoCaja.setText("Buscar");
		this.jButtonid_empresaTipoLineaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoLineaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLineaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLineaFlujoCaja"));

		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setText("U");
		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLineaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLineaFlujoCajaBusqueda"));

		if(this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoLineaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoLineaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoLineaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLineaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLineaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoLineaFlujoCajaUpdate.setText("U");
		this.jButtonid_empresaTipoLineaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoLineaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLineaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLineaFlujoCajaUpdate"));



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
		//this.jInternalFrameDetalleTipoLineaFlujoCaja = new TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Linea Flujo Caja  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLineaFlujoCaja= new GridBagLayout();
		

		
		String sToolTipTipoLineaFlujoCaja="";
		sToolTipTipoLineaFlujoCaja=TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLineaFlujoCaja+="(Contabilidad.TipoLineaFlujoCaja)";
		}
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLineaFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonModificarTipoLineaFlujoCaja = new JButtonMe();
        this.jButtonActualizarTipoLineaFlujoCaja = new JButtonMe();
        this.jButtonEliminarTipoLineaFlujoCaja = new JButtonMe();
        this.jButtonCancelarTipoLineaFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja = new JButtonMe();
		this.jButtonCerrarTipoLineaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosTipoLineaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoLineaFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoLineaFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Linea Flujo Caja ";
		
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Linea Flujo Caja s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLineaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoLineaFlujoCaja.setName("jPanelCamposTipoLineaFlujoCaja"); 

		this.jPanelCamposOcultosTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoLineaFlujoCaja.setName("jPanelCamposOcultosTipoLineaFlujoCaja"); 

        this.jPanelAccionesTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLineaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesTipoLineaFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoLineaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoLineaFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoLineaFlujoCaja.setText("Nuevo");
		this.jButtonModificarTipoLineaFlujoCaja.setText("Editar");
        this.jButtonActualizarTipoLineaFlujoCaja.setText("Actualizar");
        this.jButtonEliminarTipoLineaFlujoCaja.setText("Eliminar");
        this.jButtonCancelarTipoLineaFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosTipoLineaFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.setText("Guardar");
		this.jButtonCerrarTipoLineaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLineaFlujoCaja,"nuevo_button","Nuevo",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoLineaFlujoCaja,"modificar_button","Editar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoLineaFlujoCaja,"actualizar_button","Actualizar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoLineaFlujoCaja,"eliminar_button","Eliminar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoLineaFlujoCaja,"cancelar_button","Cancelar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoLineaFlujoCaja,"guardarcambios_button","Guardar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja,"guardarcambiostabla_button","Guardar",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLineaFlujoCaja,"cerrar_button","Salir",this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoLineaFlujoCaja.setToolTipText("Nuevo"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoLineaFlujoCaja.setToolTipText("Editar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoLineaFlujoCaja.setToolTipText("Actualizar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoLineaFlujoCaja.setToolTipText("Eliminar)"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoLineaFlujoCaja.setToolTipText("Cancelar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoLineaFlujoCaja.setToolTipText("Guardar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.setToolTipText("Guardar"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLineaFlujoCaja.setToolTipText("Salir"+" "+TipoLineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLineaFlujoCaja";
		inputMap = this.jButtonNuevoTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLineaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLineaFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoLineaFlujoCaja";
		inputMap = this.jButtonActualizarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoLineaFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoLineaFlujoCaja";
		inputMap = this.jButtonEliminarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoLineaFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoLineaFlujoCaja";
		inputMap = this.jButtonCancelarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoLineaFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarTipoLineaFlujoCaja";
		inputMap = this.jButtonCerrarTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLineaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLineaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLineaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLineaFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja.setToolTipText("Nuevo TipoLineaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja.setToolTipText("Sin Cerrar Ventana TipoLineaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoLineaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesTipoLineaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoLineaFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoLineaFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoLineaFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoLineaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoLineaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoLineaFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoLineaFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposTipoLineaFlujoCaja.setLayout(gridaBagLayoutCamposTipoLineaFlujoCaja);
		this.jPanelCamposOcultosTipoLineaFlujoCaja.setLayout(gridaBagLayoutCamposOcultosTipoLineaFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoLineaFlujoCaja.add(jLabelIdTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoLineaFlujoCaja.add(jLabelidTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);


	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoLineaFlujoCaja.add(jLabelid_empresaTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoLineaFlujoCaja.add(jButtonid_empresaTipoLineaFlujoCajaBusqueda, this.gridBagConstraintsTipoLineaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 3;
		this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoLineaFlujoCaja.add(jButtonid_empresaTipoLineaFlujoCajaUpdate, this.gridBagConstraintsTipoLineaFlujoCaja);
	}

	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoLineaFlujoCaja.add(jComboBoxid_empresaTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);


	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoLineaFlujoCaja.add(jLabelnombreTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoLineaFlujoCaja.add(jButtonnombreTipoLineaFlujoCajaBusqueda, this.gridBagConstraintsTipoLineaFlujoCaja);
	}

	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoLineaFlujoCaja.add(jscrollPanenombreTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);


	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sriTipoLineaFlujoCaja.add(jLabelcodigo_sriTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sriTipoLineaFlujoCaja.add(jButtoncodigo_sriTipoLineaFlujoCajaBusqueda, this.gridBagConstraintsTipoLineaFlujoCaja);
	}

	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sriTipoLineaFlujoCaja.add(jTextFieldcodigo_sriTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iYPanelCamposTipoLineaFlujoCaja;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iXPanelCamposTipoLineaFlujoCaja++;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLineaFlujoCaja.add(this.jPanelidTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(iXPanelCamposTipoLineaFlujoCaja % 1==0) {
		iXPanelCamposTipoLineaFlujoCaja=0;
		iYPanelCamposTipoLineaFlujoCaja++;
	}
	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iYPanelCamposTipoLineaFlujoCaja;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iXPanelCamposTipoLineaFlujoCaja++;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLineaFlujoCaja.add(this.jPanelnombreTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(iXPanelCamposTipoLineaFlujoCaja % 1==0) {
		iXPanelCamposTipoLineaFlujoCaja=0;
		iYPanelCamposTipoLineaFlujoCaja++;
	}
	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iYPanelCamposTipoLineaFlujoCaja;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iXPanelCamposTipoLineaFlujoCaja++;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLineaFlujoCaja.add(this.jPanelcodigo_sriTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(iXPanelCamposTipoLineaFlujoCaja % 1==0) {
		iXPanelCamposTipoLineaFlujoCaja=0;
		iYPanelCamposTipoLineaFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iYPanelCamposOcultosTipoLineaFlujoCaja;
	this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iXPanelCamposOcultosTipoLineaFlujoCaja++;
	this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLineaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoLineaFlujoCaja.add(this.jPanelid_empresaTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);



	if(iXPanelCamposOcultosTipoLineaFlujoCaja % 1==0) {
		iXPanelCamposOcultosTipoLineaFlujoCaja=0;
		iYPanelCamposOcultosTipoLineaFlujoCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoLineaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesTipoLineaFlujoCaja.setLayout(gridaBagLayoutAccionesTipoLineaFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoLineaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioTipoLineaFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioTipoLineaFlujoCaja);
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLineaFlujoCaja.add(this.jComboBoxTiposAccionesFormularioTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLineaFlujoCaja.add(this.jCheckBoxPostAccionNuevoTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLineaFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipolineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLineaFlujoCaja.add(this.jCheckBoxPostAccionSinMensajeTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoLineaFlujoCaja.add(this.jButtonModificarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);							

		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoLineaFlujoCaja.add(this.jButtonEliminarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
			
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLineaFlujoCaja.add(this.jButtonActualizarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);


		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLineaFlujoCaja.add(this.jButtonGuardarCambiosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);	
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoLineaFlujoCaja.add(this.jButtonCancelarTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLineaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLineaFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsTipoLineaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLineaFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =0;
		this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLineaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoLineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoLineaFlujoCaja = new TipoLineaFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Linea Flujo Caja  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Linea Flujo Caja  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Linea Flujo Caja  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoLineaFlujoCajaModel tipolineaflujocajaModel=new TipoLineaFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoLineaFlujoCajaModel.TipoLineaFlujoCajaFocusTraversalPolicy tipolineaflujocajaFocusTraversalPolicy = tipolineaflujocajaModel.new TipoLineaFlujoCajaFocusTraversalPolicy(this);
			
			//tipolineaflujocajaFocusTraversalPolicy.settipolineaflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipolineaflujocajaModel);
			
			
			this.jContentPaneDetalleTipoLineaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoLineaFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetalleTipoLineaFlujoCaja.setLayout(gridaBagLayoutDetalleTipoLineaFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLineaFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetalleTipoLineaFlujoCaja.add(jTtoolBarDetalleTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja=   new JScrollPane(jContentPaneDetalleTipoLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetalleTipoLineaFlujoCaja.add(jPanelCamposTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);
			
			
			
			
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
						&& tipolineaflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(this.puedeCargarPorParteLineaFlujoCaja,false,-1);
					
					if(this.tipolineaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoLineaFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
						this.jContentPaneDetalleTipoLineaFlujoCaja.add(this.jTabbedPaneRelacionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoLineaFlujoCaja.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoLineaFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsTipoLineaFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetalleTipoLineaFlujoCaja.add(jPanelCamposOcultosTipoLineaFlujoCaja, gridBagConstraintsTipoLineaFlujoCaja);
				
					this.jPanelCamposOcultosTipoLineaFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	        this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoLineaFlujoCaja.add(this.jPanelAccionesFormularioTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);							
			
			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoLineaFlujoCaja.add(this.jPanelAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoLineaFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja=   new JScrollPane(this.jPanelCamposTipoLineaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLineaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
			this.gridBagConstraintsTipoLineaFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoLineaFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoLineaFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);			
			
			this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
			
			
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		
			
		this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoLineaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLineaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLineaFlujoCaja, this.gridBagConstraintsTipoLineaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoLineaFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoLineaFlujoCaja;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		this.lineaflujocajaSessionBean.setConGuardarRelaciones(false);
		this.lineaflujocajaSessionBean.setEsGuardarRelacionado(true);

		this.lineaflujocajaBeanSwingJInternalFrame=null;//new LineaFlujoCajaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.lineaflujocajaBeanSwingJInternalFramePopup=new LineaFlujoCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.lineaflujocajaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {

				LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoLineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.lineaflujocajaSessionBean.setEsGuardarRelacionado(true);

				this.lineaflujocajaBeanSwingJInternalFrame=new LineaFlujoCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.lineaflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.lineaflujocajaBeanSwingJInternalFrame.setlineaflujocajaSessionBean(this.lineaflujocajaSessionBean);

				//this.gridBagConstraintsTipoLineaFlujoCaja = new GridBagConstraints();
				//this.gridBagConstraintsTipoLineaFlujoCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoLineaFlujoCaja.gridx = 0;
				//this.jContentPaneDetalleTipoLineaFlujoCaja.add(this.lineaflujocajaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoLineaFlujoCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoLineaFlujoCaja.add("Linea Flujo Cajas",this.lineaflujocajaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoLineaFlujoCaja.setComponentAt(iIndexTab,this.lineaflujocajaBeanSwingJInternalFrame.getContentPane());
				}

				//LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.lineaflujocajaSessionBean.setEsGuardarRelacionado(false);
				this.lineaflujocajaBeanSwingJInternalFrame=null;//new LineaFlujoCajaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLineaFlujoCaja) {
					this.jTabbedPaneRelacionesTipoLineaFlujoCaja.add("Linea Flujo Cajas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarLineaFlujoCajaBeanSwingJInternalFrame(List<TipoLineaFlujoCaja> tipolineaflujocajas,TipoLineaFlujoCaja tipolineaflujocaja,LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//lineaflujocajaBeanSwingJInternalFrame=new LineaFlujoCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					lineaflujocajaBeanSwingJInternalFrame.getLineaFlujoCajaLogic().setConnexion(this.tipolineaflujocajaLogic.getConnexion());

					lineaflujocajaBeanSwingJInternalFrame.settipolineaflujocajasForeignKey(tipolineaflujocajas);
					lineaflujocajaBeanSwingJInternalFrame.settipolineaflujocajaForeignKey(tipolineaflujocaja);
					lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja(true);
					lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setlidTipoLineaFlujoCajaActual(tipolineaflujocaja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					lineaflujocajaBeanSwingJInternalFrame.cargarCombosForeignKeyLineaFlujoCaja(lineaflujocajaBeanSwingJInternalFrame.isCargarCombosDependencia);
					lineaflujocajaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoLineaFlujoCaja(true);
					lineaflujocajaBeanSwingJInternalFrame.setid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja(tipolineaflujocaja.getId());

					if(!this.conCargarFormDetalle) {
						lineaflujocajaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					lineaflujocajaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoLineaFlujoCajaForeignKey(tipolineaflujocaja,1,false,true,true);
					lineaflujocajaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					lineaflujocajaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoLineaFlujoCaja");
					lineaflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoLineaFlujoCaja");
					lineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaFlujoCaja(true);
					lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLineaFlujoCaja("n",lineaflujocajaBeanSwingJInternalFrame.isGuardarCambiosEnLote, lineaflujocajaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					lineaflujocajaBeanSwingJInternalFrame.setAutoscrolls(true);
					lineaflujocajaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaFlujoCaja("relacionado");
					} else {
						lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaFlujoCaja("no_relacionado");
					}

					lineaflujocajaBeanSwingJInternalFrame.getjButtonRecargarInformacionLineaFlujoCaja().setVisible(false);

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
