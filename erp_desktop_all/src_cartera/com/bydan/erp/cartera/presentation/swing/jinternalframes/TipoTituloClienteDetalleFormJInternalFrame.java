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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoTituloClienteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoTituloClienteDetalleFormJInternalFrame extends TipoTituloClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTituloCliente;
	
	protected JMenuBar jmenuBarDetalleTipoTituloCliente;
	
	protected JMenu jmenuDetalleTipoTituloCliente;
	protected JMenu jmenuDetalleArchivoTipoTituloCliente;
	protected JMenu jmenuDetalleAccionesTipoTituloCliente;
	protected JMenu jmenuDetalleDatosTipoTituloCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTituloCliente;	
	protected GridBagConstraints gridBagConstraintsTipoTituloCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTituloClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTituloCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoTituloClienteSessionBean tipotituloclienteSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoTituloClienteLogic tipotituloclienteLogic;
	
	public JScrollPane jScrollPanelDatosTipoTituloCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoTituloCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoTituloCliente;
	
	protected JPanel jPanelCamposTipoTituloCliente;    
	protected JPanel jPanelCamposOcultosTipoTituloCliente;    	
	protected JPanel jPanelAccionesTipoTituloCliente;
	protected JPanel jPanelAccionesFormularioTipoTituloCliente;
    
	
	
	protected Integer iXPanelCamposTipoTituloCliente=0;
	protected Integer iYPanelCamposTipoTituloCliente=0;
	
	protected Integer iXPanelCamposOcultosTipoTituloCliente=0;
	protected Integer iYPanelCamposOcultosTipoTituloCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTituloCliente;
	public JButton jButtonModificarTipoTituloCliente;
	public JButton jButtonActualizarTipoTituloCliente;
    public JButton jButtonEliminarTipoTituloCliente;
	public JButton jButtonCancelarTipoTituloCliente;
    public JButton jButtonGuardarCambiosTipoTituloCliente;
	public JButton jButtonGuardarCambiosTablaTipoTituloCliente;
	protected JButton jButtonCerrarTipoTituloCliente;
	
	
	protected JButton jButtonProcesarInformacionTipoTituloCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTituloCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTituloCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTituloCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTituloCliente;
	protected JButton jButtonModificarToolBarTipoTituloCliente;
	protected JButton jButtonActualizarToolBarTipoTituloCliente;
    protected JButton jButtonEliminarToolBarTipoTituloCliente;
	protected JButton jButtonCancelarToolBarTipoTituloCliente;
    protected JButton jButtonGuardarCambiosToolBarTipoTituloCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTituloCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTituloCliente;
	protected JButton jButtonCerrarToolBarTipoTituloCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTituloCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTituloCliente;
	protected JMenuItem jMenuItemModificarTipoTituloCliente;
	protected JMenuItem jMenuItemActualizarTipoTituloCliente;
    protected JMenuItem jMenuItemEliminarTipoTituloCliente;
	protected JMenuItem jMenuItemCancelarTipoTituloCliente;
    protected JMenuItem jMenuItemGuardarCambiosTipoTituloCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTituloCliente;
	protected JMenuItem jMenuItemCerrarTipoTituloCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoTituloCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTituloCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTituloCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTituloCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoTituloCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTituloCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTituloCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTituloCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTituloCliente;
	public JLabel jLabelIdTipoTituloCliente;
	public JTextFieldMe jTextFieldidTipoTituloCliente;
	public JButton jButtonidTipoTituloClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTituloCliente;
	public JLabel jLabelnombreTipoTituloCliente;
	public JTextArea jTextAreanombreTipoTituloCliente;
	public JScrollPane jscrollPanenombreTipoTituloCliente;
	public JButton jButtonnombreTipoTituloClienteBusqueda= new JButtonMe();

	public JPanel jPanelsiglasTipoTituloCliente;
	public JLabel jLabelsiglasTipoTituloCliente;
	public JTextField jTextFieldsiglasTipoTituloCliente;
	public JButton jButtonsiglasTipoTituloClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoTituloCliente;
	public JLabel jLabelid_paisTipoTituloCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoTituloCliente;
	public JButton jButtonid_paisTipoTituloCliente= new JButtonMe();
	public JButton jButtonid_paisTipoTituloClienteUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoTituloClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTituloCliente;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoTituloClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTituloCliente=new JPanel();
				this.jPanelAccionesFormularioTipoTituloCliente=new JPanel();
				this.jmenuBarDetalleTipoTituloCliente=new JMenuBar();
				this.jTtoolBarDetalleTipoTituloCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTituloClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTituloClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTituloCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTituloCliente() {
		return this.jButtonActualizarToolBarTipoTituloCliente;
	}
	
	public JButton getjButtonEliminarToolBarTipoTituloCliente() {
		return this.jButtonEliminarToolBarTipoTituloCliente;
	}
	
	public JButton getjButtonCancelarToolBarTipoTituloCliente() {
		return this.jButtonCancelarToolBarTipoTituloCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTituloCliente() {
		return this.jButtonProcesarInformacionTipoTituloCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTituloCliente)	{
		this.jButtonProcesarInformacionTipoTituloCliente = jButtonProcesarInformacionTipoTituloCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTituloCliente() {
		return this.jComboBoxTiposAccionesTipoTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTituloCliente(
			JComboBox jComboBoxTiposRelacionesTipoTituloCliente) {
		this.jComboBoxTiposRelacionesTipoTituloCliente = jComboBoxTiposRelacionesTipoTituloCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTituloCliente(
			JComboBox jComboBoxTiposAccionesTipoTituloCliente) {
		this.jComboBoxTiposAccionesTipoTituloCliente = jComboBoxTiposAccionesTipoTituloCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTituloCliente() {
		return this.jComboBoxTiposAccionesFormularioTipoTituloCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTituloCliente(
			JComboBox jComboBoxTiposAccionesFormularioTipoTituloCliente) {
		this.jComboBoxTiposAccionesFormularioTipoTituloCliente = jComboBoxTiposAccionesFormularioTipoTituloCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
		
		this.tipotituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotituloclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTituloClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTituloClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Titulo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTituloClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTituloCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTituloCliente=new JButtonMe();
				this.jButtonModificarToolBarTipoTituloCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTituloCliente,this.jTtoolBarDetalleTipoTituloCliente,
							"actualizar","actualizar","Actualizar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTituloCliente,this.jTtoolBarDetalleTipoTituloCliente,
							"eliminar","eliminar","Eliminar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTituloCliente,this.jTtoolBarDetalleTipoTituloCliente,
							"cancelar","cancelar","Cancelar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTituloCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTituloCliente,this.jTtoolBarDetalleTipoTituloCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTituloCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTituloCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTituloCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTituloCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTituloCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTituloCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTituloCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTituloCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTituloCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTituloCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTituloCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTituloCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTituloCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTituloCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTituloCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTituloCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTituloCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTituloCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTituloCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTituloCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTituloCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTituloCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTituloCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTituloCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTituloCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTituloCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTituloCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTituloCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTituloCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTituloCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTituloCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTituloCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTituloCliente.add(this.jMenuItemDetalleCerrarTipoTituloCliente);
		
		this.jmenuDetalleAccionesTipoTituloCliente.add(this.jMenuItemActualizarTipoTituloCliente);
		this.jmenuDetalleAccionesTipoTituloCliente.add(this.jMenuItemEliminarTipoTituloCliente);
		this.jmenuDetalleAccionesTipoTituloCliente.add(this.jMenuItemCancelarTipoTituloCliente);		
		
		//this.jmenuDetalleDatosTipoTituloCliente.add(this.jMenuItemDetalleAbrirOrderByTipoTituloCliente);				
		this.jmenuDetalleDatosTipoTituloCliente.add(this.jMenuItemDetalleMostarOcultarTipoTituloCliente);				
				
		//this.jmenuDetalleAccionesTipoTituloCliente.add(this.jMenuItemGuardarCambiosTipoTituloCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTituloCliente.add(this.jmenuDetalleArchivoTipoTituloCliente);		
		this.jmenuBarDetalleTipoTituloCliente.add(this.jmenuDetalleAccionesTipoTituloCliente);		
		this.jmenuBarDetalleTipoTituloCliente.add(this.jmenuDetalleDatosTipoTituloCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTituloCliente);				
	}
	
	
	public void inicializarElementosCamposTipoTituloCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTituloCliente = new JLabelMe();
		jLabelIdTipoTituloCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTituloCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTituloCliente.setToolTipText(TipoTituloClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTituloCliente= new GridBagLayout();

		this.jPanelidTipoTituloCliente.setLayout(this.gridaBagLayoutTipoTituloCliente);

		jTextFieldidTipoTituloCliente = new JTextFieldMe();
		jTextFieldidTipoTituloCliente.setText("Id");

		jTextFieldidTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoTituloCliente = new JLabelMe();
		this.jLabelnombreTipoTituloCliente.setText(""+TipoTituloClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTituloCliente.setToolTipText("Nombre");
		this.jLabelnombreTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTituloCliente.setToolTipText(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTituloCliente = new GridBagLayout();
		this.jPanelnombreTipoTituloCliente.setLayout(this.gridaBagLayoutTipoTituloCliente);


		jTextAreanombreTipoTituloCliente= new JTextAreaMe();
		jTextAreanombreTipoTituloCliente.setEnabled(false);
		jTextAreanombreTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTituloCliente.setLineWrap(true);
		jTextAreanombreTipoTituloCliente.setWrapStyleWord(true);
		jTextAreanombreTipoTituloCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTituloCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTituloCliente = new JScrollPane(jTextAreanombreTipoTituloCliente);
		jscrollPanenombreTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoTituloClienteBusqueda= new JButtonMe();
		this.jButtonnombreTipoTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTituloClienteBusqueda.setText("U");
		this.jButtonnombreTipoTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTituloClienteBusqueda"));

		if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTituloClienteBusqueda.setVisible(false);		}


					
		this.jLabelsiglasTipoTituloCliente = new JLabelMe();
		this.jLabelsiglasTipoTituloCliente.setText(""+TipoTituloClienteConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasTipoTituloCliente.setToolTipText("Siglas");
		this.jLabelsiglasTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasTipoTituloCliente.setToolTipText(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutTipoTituloCliente = new GridBagLayout();
		this.jPanelsiglasTipoTituloCliente.setLayout(this.gridaBagLayoutTipoTituloCliente);


		jTextFieldsiglasTipoTituloCliente= new JTextFieldMe();

		jTextFieldsiglasTipoTituloCliente.setEnabled(false);
		jTextFieldsiglasTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasTipoTituloClienteBusqueda= new JButtonMe();
		this.jButtonsiglasTipoTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasTipoTituloClienteBusqueda.setText("U");
		this.jButtonsiglasTipoTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasTipoTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasTipoTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasTipoTituloClienteBusqueda"));

		if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasTipoTituloClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTituloCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoTituloCliente = new JLabelMe();
		this.jLabelid_paisTipoTituloCliente.setText(""+TipoTituloClienteConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoTituloCliente.setToolTipText("Pais");
		this.jLabelid_paisTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoTituloCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoTituloCliente.setToolTipText(TipoTituloClienteConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoTituloCliente = new GridBagLayout();
		this.jPanelid_paisTipoTituloCliente.setLayout(this.gridaBagLayoutTipoTituloCliente);


		jComboBoxid_paisTipoTituloCliente= new JComboBoxMe();
		jComboBoxid_paisTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoTituloCliente= new JButtonMe();
		this.jButtonid_paisTipoTituloCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoTituloCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoTituloCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoTituloCliente.setText("Buscar");
		this.jButtonid_paisTipoTituloCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoTituloCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoTituloCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoTituloCliente"));

		this.jButtonid_paisTipoTituloClienteBusqueda= new JButtonMe();
		this.jButtonid_paisTipoTituloClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTituloClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTituloClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoTituloClienteBusqueda.setText("U");
		this.jButtonid_paisTipoTituloClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoTituloClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoTituloClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoTituloClienteBusqueda"));

		if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoTituloClienteBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoTituloClienteUpdate= new JButtonMe();
		this.jButtonid_paisTipoTituloClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTituloClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTituloClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoTituloClienteUpdate.setText("U");
		this.jButtonid_paisTipoTituloClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoTituloClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoTituloClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoTituloClienteUpdate"));



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
		//this.jInternalFrameDetalleTipoTituloCliente = new TipoTituloClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Titulo Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTituloCliente= new GridBagLayout();
		

		
		String sToolTipTipoTituloCliente="";
		sToolTipTipoTituloCliente=TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTituloCliente+="(Cartera.TipoTituloCliente)";
		}
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTituloCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTituloCliente = new JButtonMe();
		this.jButtonModificarTipoTituloCliente = new JButtonMe();
        this.jButtonActualizarTipoTituloCliente = new JButtonMe();
        this.jButtonEliminarTipoTituloCliente = new JButtonMe();
        this.jButtonCancelarTipoTituloCliente = new JButtonMe();
        this.jButtonGuardarCambiosTipoTituloCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTituloCliente = new JButtonMe();
		this.jButtonCerrarTipoTituloCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoTituloCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTituloCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTituloCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Titulo Cliente";
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Titulo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTituloCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTituloCliente.setName("jPanelCamposTipoTituloCliente"); 

		this.jPanelCamposOcultosTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTituloCliente.setName("jPanelCamposOcultosTipoTituloCliente"); 

        this.jPanelAccionesTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTituloCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoTituloCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTituloCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTituloCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTituloCliente.setText("Nuevo");
		this.jButtonModificarTipoTituloCliente.setText("Editar");
        this.jButtonActualizarTipoTituloCliente.setText("Actualizar");
        this.jButtonEliminarTipoTituloCliente.setText("Eliminar");
        this.jButtonCancelarTipoTituloCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTituloCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTituloCliente.setText("Guardar");
		this.jButtonCerrarTipoTituloCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTituloCliente,"nuevo_button","Nuevo",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTituloCliente,"modificar_button","Editar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTituloCliente,"actualizar_button","Actualizar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTituloCliente,"eliminar_button","Eliminar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTituloCliente,"cancelar_button","Cancelar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTituloCliente,"guardarcambios_button","Guardar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTituloCliente,"guardarcambiostabla_button","Guardar",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTituloCliente,"cerrar_button","Salir",this.tipotituloclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTituloCliente.setToolTipText("Nuevo"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTituloCliente.setToolTipText("Editar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTituloCliente.setToolTipText("Actualizar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTituloCliente.setToolTipText("Eliminar)"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTituloCliente.setToolTipText("Cancelar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTituloCliente.setToolTipText("Guardar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTituloCliente.setToolTipText("Guardar"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTituloCliente.setToolTipText("Salir"+" "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTituloCliente";
		inputMap = this.jButtonNuevoTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTituloCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTituloCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTituloCliente";
		inputMap = this.jButtonActualizarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTituloCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTituloCliente";
		inputMap = this.jButtonEliminarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTituloCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTituloCliente";
		inputMap = this.jButtonCancelarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTituloCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTituloCliente";
		inputMap = this.jButtonCerrarTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTituloCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTituloCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoTituloCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTituloCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTituloCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTituloCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTituloCliente.setToolTipText("Nuevo TipoTituloCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTituloCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTituloCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTituloCliente.setToolTipText("Sin Cerrar Ventana TipoTituloCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTituloCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTituloCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTituloCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTituloCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoTituloCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTituloCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTituloCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTituloCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTituloCliente = new JLabelMe();
		
		this.jLabelAccionesTipoTituloCliente.setText("Acciones");		
		this.jLabelAccionesTipoTituloCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTituloCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTituloCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTituloCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTituloCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTituloCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTituloCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTituloCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTituloCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTituloCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTituloCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTituloCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTituloCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTituloCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTituloCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTituloCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTituloCliente = new GridBagLayout();
		
		this.jPanelCamposTipoTituloCliente.setLayout(gridaBagLayoutCamposTipoTituloCliente);
		this.jPanelCamposOcultosTipoTituloCliente.setLayout(gridaBagLayoutCamposOcultosTipoTituloCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTituloCliente.add(jLabelIdTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 1;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTituloCliente.add(jTextFieldidTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);


	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoTituloCliente.add(jLabelid_paisTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx = 2;
		this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
		this.gridBagConstraintsTipoTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoTituloCliente.add(jButtonid_paisTipoTituloClienteBusqueda, this.gridBagConstraintsTipoTituloCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx = 3;
		this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
		this.gridBagConstraintsTipoTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoTituloCliente.add(jButtonid_paisTipoTituloClienteUpdate, this.gridBagConstraintsTipoTituloCliente);
	}

	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 1;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoTituloCliente.add(jComboBoxid_paisTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);


	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTituloCliente.add(jLabelnombreTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx = 2;
		this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
		this.gridBagConstraintsTipoTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTituloCliente.add(jButtonnombreTipoTituloClienteBusqueda, this.gridBagConstraintsTipoTituloCliente);
	}

	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 1;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTituloCliente.add(jscrollPanenombreTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);


	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasTipoTituloCliente.add(jLabelsiglasTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx = 2;
		this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
		this.gridBagConstraintsTipoTituloCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasTipoTituloCliente.add(jButtonsiglasTipoTituloClienteBusqueda, this.gridBagConstraintsTipoTituloCliente);
	}

	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTituloCliente.gridy = 0;
	this.gridBagConstraintsTipoTituloCliente.gridx = 1;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasTipoTituloCliente.add(jTextFieldsiglasTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTituloCliente.gridy = iYPanelCamposTipoTituloCliente;
	this.gridBagConstraintsTipoTituloCliente.gridx = iXPanelCamposTipoTituloCliente++;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTituloCliente.add(this.jPanelidTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(iXPanelCamposTipoTituloCliente % 1==0) {
		iXPanelCamposTipoTituloCliente=0;
		iYPanelCamposTipoTituloCliente++;
	}
	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTituloCliente.gridy = iYPanelCamposTipoTituloCliente;
	this.gridBagConstraintsTipoTituloCliente.gridx = iXPanelCamposTipoTituloCliente++;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTituloCliente.add(this.jPanelid_paisTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(iXPanelCamposTipoTituloCliente % 1==0) {
		iXPanelCamposTipoTituloCliente=0;
		iYPanelCamposTipoTituloCliente++;
	}
	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTituloCliente.gridy = iYPanelCamposTipoTituloCliente;
	this.gridBagConstraintsTipoTituloCliente.gridx = iXPanelCamposTipoTituloCliente++;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTituloCliente.add(this.jPanelnombreTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(iXPanelCamposTipoTituloCliente % 1==0) {
		iXPanelCamposTipoTituloCliente=0;
		iYPanelCamposTipoTituloCliente++;
	}
	this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTituloCliente.gridy = iYPanelCamposTipoTituloCliente;
	this.gridBagConstraintsTipoTituloCliente.gridx = iXPanelCamposTipoTituloCliente++;
	this.gridBagConstraintsTipoTituloCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTituloCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTituloCliente.add(this.jPanelsiglasTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);



	if(iXPanelCamposTipoTituloCliente % 1==0) {
		iXPanelCamposTipoTituloCliente=0;
		iYPanelCamposTipoTituloCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTituloCliente= new GridBagLayout();
		this.jPanelAccionesTipoTituloCliente.setLayout(gridaBagLayoutAccionesTipoTituloCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTituloCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTituloCliente.setLayout(gridaBagLayoutAccionesFormularioTipoTituloCliente);
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTituloCliente.add(this.jComboBoxTiposAccionesFormularioTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTituloCliente.add(this.jCheckBoxPostAccionNuevoTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTituloCliente.add(this.jCheckBoxPostAccionSinCerrarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTituloCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTituloCliente.add(this.jCheckBoxPostAccionSinMensajeTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTituloCliente.add(this.jButtonModificarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);							

		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;
		this.gridBagConstraintsTipoTituloCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTituloCliente.add(this.jButtonEliminarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
			
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTituloCliente.add(this.jButtonActualizarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);


		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;		
		this.gridBagConstraintsTipoTituloCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTituloCliente.add(this.jButtonGuardarCambiosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);	
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = 0;		
		this.gridBagConstraintsTipoTituloCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTituloCliente.add(this.jButtonCancelarTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTituloCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTituloCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;		
			//this.gridBagConstraintsTipoTituloCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTituloCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTituloCliente.gridx =0;
		this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTituloCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTituloCliente = new TipoTituloClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Titulo Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Titulo Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Titulo Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTituloClienteModel tipotituloclienteModel=new TipoTituloClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTituloClienteModel.TipoTituloClienteFocusTraversalPolicy tipotituloclienteFocusTraversalPolicy = tipotituloclienteModel.new TipoTituloClienteFocusTraversalPolicy(this);
			
			//tipotituloclienteFocusTraversalPolicy.settipotituloclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipotituloclienteModel);
			
			
			this.jContentPaneDetalleTipoTituloCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTituloCliente = new GridBagLayout();	
			this.jContentPaneDetalleTipoTituloCliente.setLayout(gridaBagLayoutDetalleTipoTituloCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTituloCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoTituloCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTituloCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTituloCliente.add(jTtoolBarDetalleTipoTituloCliente, gridBagConstraintsTipoTituloCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTituloCliente=   new JScrollPane(jContentPaneDetalleTipoTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTituloCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTituloCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	        
			this.jContentPaneDetalleTipoTituloCliente.add(jPanelCamposTipoTituloCliente, gridBagConstraintsTipoTituloCliente);
			
			
			
			
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
						&& tipotituloclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTituloCliente= new GridBagConstraints();
						this.gridBagConstraintsTipoTituloCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTituloCliente.gridx = 0;
						this.jContentPaneDetalleTipoTituloCliente.add(this.jTabbedPaneRelacionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTituloCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTituloCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
					this.gridBagConstraintsTipoTituloCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTituloCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTituloCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTituloCliente.add(jPanelCamposOcultosTipoTituloCliente, gridBagConstraintsTipoTituloCliente);
				
					this.jPanelCamposOcultosTipoTituloCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	        this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTituloCliente.add(this.jPanelAccionesFormularioTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);							
			
			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
	        this.gridBagConstraintsTipoTituloCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoTituloCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTituloCliente.add(this.jPanelAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTituloCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTituloCliente=   new JScrollPane(this.jPanelCamposTipoTituloCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTituloCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTituloCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTituloCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;
			this.gridBagConstraintsTipoTituloCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTituloCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTituloCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);			
			
			this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoTituloCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTituloCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
			
			
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		
			
		this.gridBagConstraintsTipoTituloCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoTituloCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTituloCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTituloCliente, this.gridBagConstraintsTipoTituloCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTituloCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTituloCliente;
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
