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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoGastoProduConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoGastoProduDetalleFormJInternalFrame extends TipoGastoProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGastoProdu;
	
	protected JMenuBar jmenuBarDetalleTipoGastoProdu;
	
	protected JMenu jmenuDetalleTipoGastoProdu;
	protected JMenu jmenuDetalleArchivoTipoGastoProdu;
	protected JMenu jmenuDetalleAccionesTipoGastoProdu;
	protected JMenu jmenuDetalleDatosTipoGastoProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGastoProdu;	
	protected GridBagConstraints gridBagConstraintsTipoGastoProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGastoProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGastoProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGastoProduSessionBean tipogastoproduSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoGastoProduLogic tipogastoproduLogic;
	
	public JScrollPane jScrollPanelDatosTipoGastoProdu;
	public JScrollPane jScrollPanelDatosEdicionTipoGastoProdu;
	public JScrollPane jScrollPanelDatosGeneralTipoGastoProdu;
	
	protected JPanel jPanelCamposTipoGastoProdu;    
	protected JPanel jPanelCamposOcultosTipoGastoProdu;    	
	protected JPanel jPanelAccionesTipoGastoProdu;
	protected JPanel jPanelAccionesFormularioTipoGastoProdu;
    
	
	
	protected Integer iXPanelCamposTipoGastoProdu=0;
	protected Integer iYPanelCamposTipoGastoProdu=0;
	
	protected Integer iXPanelCamposOcultosTipoGastoProdu=0;
	protected Integer iYPanelCamposOcultosTipoGastoProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGastoProdu;
	public JButton jButtonModificarTipoGastoProdu;
	public JButton jButtonActualizarTipoGastoProdu;
    public JButton jButtonEliminarTipoGastoProdu;
	public JButton jButtonCancelarTipoGastoProdu;
    public JButton jButtonGuardarCambiosTipoGastoProdu;
	public JButton jButtonGuardarCambiosTablaTipoGastoProdu;
	protected JButton jButtonCerrarTipoGastoProdu;
	
	
	protected JButton jButtonProcesarInformacionTipoGastoProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGastoProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGastoProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGastoProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGastoProdu;
	protected JButton jButtonModificarToolBarTipoGastoProdu;
	protected JButton jButtonActualizarToolBarTipoGastoProdu;
    protected JButton jButtonEliminarToolBarTipoGastoProdu;
	protected JButton jButtonCancelarToolBarTipoGastoProdu;
    protected JButton jButtonGuardarCambiosToolBarTipoGastoProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGastoProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGastoProdu;
	protected JButton jButtonCerrarToolBarTipoGastoProdu;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGastoProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGastoProdu;
	protected JMenuItem jMenuItemModificarTipoGastoProdu;
	protected JMenuItem jMenuItemActualizarTipoGastoProdu;
    protected JMenuItem jMenuItemEliminarTipoGastoProdu;
	protected JMenuItem jMenuItemCancelarTipoGastoProdu;
    protected JMenuItem jMenuItemGuardarCambiosTipoGastoProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGastoProdu;
	protected JMenuItem jMenuItemCerrarTipoGastoProdu;
	protected JMenuItem jMenuItemDetalleCerrarTipoGastoProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGastoProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGastoProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGastoProdu;
	protected JMenuItem jMenuItemMostrarOcultarTipoGastoProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGastoProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGastoProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGastoProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGastoProdu;
	public JLabel jLabelIdTipoGastoProdu;
	public JTextFieldMe jTextFieldidTipoGastoProdu;
	public JButton jButtonidTipoGastoProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGastoProdu;
	public JLabel jLabelnombreTipoGastoProdu;
	public JTextArea jTextAreanombreTipoGastoProdu;
	public JScrollPane jscrollPanenombreTipoGastoProdu;
	public JButton jButtonnombreTipoGastoProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoGastoProdu;
	public JLabel jLabeldescripcionTipoGastoProdu;
	public JTextArea jTextAreadescripcionTipoGastoProdu;
	public JScrollPane jscrollPanedescripcionTipoGastoProdu;
	public JButton jButtondescripcionTipoGastoProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoGastoProdu;
	public JLabel jLabelid_paisTipoGastoProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoGastoProdu;
	public JButton jButtonid_paisTipoGastoProdu= new JButtonMe();
	public JButton jButtonid_paisTipoGastoProduUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoGastoProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGastoProdu;
	
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
	
	public TipoGastoProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGastoProdu=new JPanel();
				this.jPanelAccionesFormularioTipoGastoProdu=new JPanel();
				this.jmenuBarDetalleTipoGastoProdu=new JMenuBar();
				this.jTtoolBarDetalleTipoGastoProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGastoProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGastoProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGastoProdu() {
		return this.jButtonActualizarToolBarTipoGastoProdu;
	}
	
	public JButton getjButtonEliminarToolBarTipoGastoProdu() {
		return this.jButtonEliminarToolBarTipoGastoProdu;
	}
	
	public JButton getjButtonCancelarToolBarTipoGastoProdu() {
		return this.jButtonCancelarToolBarTipoGastoProdu;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGastoProdu() {
		return this.jButtonProcesarInformacionTipoGastoProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGastoProdu)	{
		this.jButtonProcesarInformacionTipoGastoProdu = jButtonProcesarInformacionTipoGastoProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGastoProdu() {
		return this.jComboBoxTiposAccionesTipoGastoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGastoProdu(
			JComboBox jComboBoxTiposRelacionesTipoGastoProdu) {
		this.jComboBoxTiposRelacionesTipoGastoProdu = jComboBoxTiposRelacionesTipoGastoProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGastoProdu(
			JComboBox jComboBoxTiposAccionesTipoGastoProdu) {
		this.jComboBoxTiposAccionesTipoGastoProdu = jComboBoxTiposAccionesTipoGastoProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGastoProdu() {
		return this.jComboBoxTiposAccionesFormularioTipoGastoProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGastoProdu(
			JComboBox jComboBoxTiposAccionesFormularioTipoGastoProdu) {
		this.jComboBoxTiposAccionesFormularioTipoGastoProdu = jComboBoxTiposAccionesFormularioTipoGastoProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogastoproduSessionBean=new TipoGastoProduSessionBean();
		
		this.tipogastoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGastoProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGastoProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGastoProdu=new JButtonMe();
				this.jButtonModificarToolBarTipoGastoProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGastoProdu,this.jTtoolBarDetalleTipoGastoProdu,
							"actualizar","actualizar","Actualizar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGastoProdu,this.jTtoolBarDetalleTipoGastoProdu,
							"eliminar","eliminar","Eliminar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGastoProdu,this.jTtoolBarDetalleTipoGastoProdu,
							"cancelar","cancelar","Cancelar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGastoProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGastoProdu,this.jTtoolBarDetalleTipoGastoProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGastoProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGastoProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGastoProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGastoProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGastoProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGastoProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGastoProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGastoProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGastoProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGastoProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGastoProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGastoProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGastoProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGastoProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGastoProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGastoProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGastoProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGastoProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGastoProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGastoProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGastoProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGastoProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGastoProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGastoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGastoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGastoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGastoProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGastoProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGastoProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGastoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGastoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGastoProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGastoProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGastoProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGastoProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGastoProdu.add(this.jMenuItemDetalleCerrarTipoGastoProdu);
		
		this.jmenuDetalleAccionesTipoGastoProdu.add(this.jMenuItemActualizarTipoGastoProdu);
		this.jmenuDetalleAccionesTipoGastoProdu.add(this.jMenuItemEliminarTipoGastoProdu);
		this.jmenuDetalleAccionesTipoGastoProdu.add(this.jMenuItemCancelarTipoGastoProdu);		
		
		//this.jmenuDetalleDatosTipoGastoProdu.add(this.jMenuItemDetalleAbrirOrderByTipoGastoProdu);				
		this.jmenuDetalleDatosTipoGastoProdu.add(this.jMenuItemDetalleMostarOcultarTipoGastoProdu);				
				
		//this.jmenuDetalleAccionesTipoGastoProdu.add(this.jMenuItemGuardarCambiosTipoGastoProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGastoProdu.add(this.jmenuDetalleArchivoTipoGastoProdu);		
		this.jmenuBarDetalleTipoGastoProdu.add(this.jmenuDetalleAccionesTipoGastoProdu);		
		this.jmenuBarDetalleTipoGastoProdu.add(this.jmenuDetalleDatosTipoGastoProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGastoProdu);				
	}
	
	
	public void inicializarElementosCamposTipoGastoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGastoProdu = new JLabelMe();
		jLabelIdTipoGastoProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGastoProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGastoProdu.setToolTipText(TipoGastoProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGastoProdu= new GridBagLayout();

		this.jPanelidTipoGastoProdu.setLayout(this.gridaBagLayoutTipoGastoProdu);

		jTextFieldidTipoGastoProdu = new JTextFieldMe();
		jTextFieldidTipoGastoProdu.setText("Id");

		jTextFieldidTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoGastoProdu = new JLabelMe();
		this.jLabelnombreTipoGastoProdu.setText(""+TipoGastoProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGastoProdu.setToolTipText("Nombre");
		this.jLabelnombreTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGastoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGastoProdu.setToolTipText(TipoGastoProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGastoProdu = new GridBagLayout();
		this.jPanelnombreTipoGastoProdu.setLayout(this.gridaBagLayoutTipoGastoProdu);


		jTextAreanombreTipoGastoProdu= new JTextAreaMe();
		jTextAreanombreTipoGastoProdu.setEnabled(false);
		jTextAreanombreTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoProdu.setLineWrap(true);
		jTextAreanombreTipoGastoProdu.setWrapStyleWord(true);
		jTextAreanombreTipoGastoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGastoProdu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGastoProdu = new JScrollPane(jTextAreanombreTipoGastoProdu);
		jscrollPanenombreTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGastoProduBusqueda= new JButtonMe();
		this.jButtonnombreTipoGastoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGastoProduBusqueda.setText("U");
		this.jButtonnombreTipoGastoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGastoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGastoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGastoProduBusqueda"));

		if(this.tipogastoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGastoProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoGastoProdu = new JLabelMe();
		this.jLabeldescripcionTipoGastoProdu.setText(""+TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoGastoProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoGastoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoGastoProdu.setToolTipText(TipoGastoProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoGastoProdu = new GridBagLayout();
		this.jPaneldescripcionTipoGastoProdu.setLayout(this.gridaBagLayoutTipoGastoProdu);


		jTextAreadescripcionTipoGastoProdu= new JTextAreaMe();
		jTextAreadescripcionTipoGastoProdu.setEnabled(false);
		jTextAreadescripcionTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoProdu.setLineWrap(true);
		jTextAreadescripcionTipoGastoProdu.setWrapStyleWord(true);
		jTextAreadescripcionTipoGastoProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoGastoProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoGastoProdu = new JScrollPane(jTextAreadescripcionTipoGastoProdu);
		jscrollPanedescripcionTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoGastoProduBusqueda= new JButtonMe();
		this.jButtondescripcionTipoGastoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoGastoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoGastoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoGastoProduBusqueda.setText("U");
		this.jButtondescripcionTipoGastoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoGastoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoGastoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoGastoProduBusqueda"));

		if(this.tipogastoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoGastoProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGastoProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoGastoProdu = new JLabelMe();
		this.jLabelid_paisTipoGastoProdu.setText(""+TipoGastoProduConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoGastoProdu.setToolTipText("Pais");
		this.jLabelid_paisTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoGastoProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoGastoProdu.setToolTipText(TipoGastoProduConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoGastoProdu = new GridBagLayout();
		this.jPanelid_paisTipoGastoProdu.setLayout(this.gridaBagLayoutTipoGastoProdu);


		jComboBoxid_paisTipoGastoProdu= new JComboBoxMe();
		jComboBoxid_paisTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoGastoProdu= new JButtonMe();
		this.jButtonid_paisTipoGastoProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGastoProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGastoProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGastoProdu.setText("Buscar");
		this.jButtonid_paisTipoGastoProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoGastoProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGastoProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGastoProdu"));

		this.jButtonid_paisTipoGastoProduBusqueda= new JButtonMe();
		this.jButtonid_paisTipoGastoProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGastoProduBusqueda.setText("U");
		this.jButtonid_paisTipoGastoProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoGastoProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGastoProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGastoProduBusqueda"));

		if(this.tipogastoproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoGastoProduBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoGastoProduUpdate= new JButtonMe();
		this.jButtonid_paisTipoGastoProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGastoProduUpdate.setText("U");
		this.jButtonid_paisTipoGastoProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoGastoProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGastoProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoGastoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGastoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGastoProduUpdate"));



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
		//this.jInternalFrameDetalleTipoGastoProdu = new TipoGastoProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Gasto Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGastoProdu= new GridBagLayout();
		

		
		String sToolTipTipoGastoProdu="";
		sToolTipTipoGastoProdu=TipoGastoProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGastoProdu+="(Produccion.TipoGastoProdu)";
		}
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGastoProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGastoProdu = new JButtonMe();
		this.jButtonModificarTipoGastoProdu = new JButtonMe();
        this.jButtonActualizarTipoGastoProdu = new JButtonMe();
        this.jButtonEliminarTipoGastoProdu = new JButtonMe();
        this.jButtonCancelarTipoGastoProdu = new JButtonMe();
        this.jButtonGuardarCambiosTipoGastoProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGastoProdu = new JButtonMe();
		this.jButtonCerrarTipoGastoProdu = new JButtonMe();
		
		this.jScrollPanelDatosTipoGastoProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGastoProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGastoProdu = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto Produccion";
		
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGastoProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGastoProdu.setName("jPanelCamposTipoGastoProdu"); 

		this.jPanelCamposOcultosTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGastoProdu.setName("jPanelCamposOcultosTipoGastoProdu"); 

        this.jPanelAccionesTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGastoProdu.setToolTipText("Acciones");
        this.jPanelAccionesTipoGastoProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGastoProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGastoProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGastoProdu.setText("Nuevo");
		this.jButtonModificarTipoGastoProdu.setText("Editar");
        this.jButtonActualizarTipoGastoProdu.setText("Actualizar");
        this.jButtonEliminarTipoGastoProdu.setText("Eliminar");
        this.jButtonCancelarTipoGastoProdu.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGastoProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGastoProdu.setText("Guardar");
		this.jButtonCerrarTipoGastoProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGastoProdu,"nuevo_button","Nuevo",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGastoProdu,"modificar_button","Editar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGastoProdu,"actualizar_button","Actualizar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGastoProdu,"eliminar_button","Eliminar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGastoProdu,"cancelar_button","Cancelar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGastoProdu,"guardarcambios_button","Guardar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGastoProdu,"guardarcambiostabla_button","Guardar",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGastoProdu,"cerrar_button","Salir",this.tipogastoproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGastoProdu.setToolTipText("Nuevo"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGastoProdu.setToolTipText("Editar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGastoProdu.setToolTipText("Actualizar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGastoProdu.setToolTipText("Eliminar)"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGastoProdu.setToolTipText("Cancelar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGastoProdu.setToolTipText("Guardar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGastoProdu.setToolTipText("Guardar"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGastoProdu.setToolTipText("Salir"+" "+TipoGastoProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGastoProdu";
		inputMap = this.jButtonNuevoTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGastoProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGastoProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGastoProdu";
		inputMap = this.jButtonActualizarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGastoProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGastoProdu";
		inputMap = this.jButtonEliminarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGastoProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGastoProdu";
		inputMap = this.jButtonCancelarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGastoProdu"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGastoProdu";
		inputMap = this.jButtonCerrarTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGastoProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGastoProdu";
		inputMap = this.jButtonGuardarCambiosTablaTipoGastoProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGastoProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGastoProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGastoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGastoProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGastoProdu.setToolTipText("Nuevo TipoGastoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGastoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGastoProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGastoProdu.setToolTipText("Sin Cerrar Ventana TipoGastoProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGastoProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGastoProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGastoProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGastoProdu.setText("Accion");
		this.jComboBoxTiposAccionesTipoGastoProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGastoProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGastoProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGastoProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGastoProdu = new JLabelMe();
		
		this.jLabelAccionesTipoGastoProdu.setText("Acciones");		
		this.jLabelAccionesTipoGastoProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGastoProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGastoProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGastoProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGastoProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGastoProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGastoProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGastoProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGastoProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGastoProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGastoProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGastoProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGastoProdu = new GridBagLayout();
		
		this.jPanelCamposTipoGastoProdu.setLayout(gridaBagLayoutCamposTipoGastoProdu);
		this.jPanelCamposOcultosTipoGastoProdu.setLayout(gridaBagLayoutCamposOcultosTipoGastoProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGastoProdu.add(jLabelIdTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 1;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGastoProdu.add(jTextFieldidTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);


	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoGastoProdu.add(jLabelid_paisTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx = 2;
		this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
		this.gridBagConstraintsTipoGastoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGastoProdu.add(jButtonid_paisTipoGastoProduBusqueda, this.gridBagConstraintsTipoGastoProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx = 3;
		this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
		this.gridBagConstraintsTipoGastoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGastoProdu.add(jButtonid_paisTipoGastoProduUpdate, this.gridBagConstraintsTipoGastoProdu);
	}

	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 1;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoGastoProdu.add(jComboBoxid_paisTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);


	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGastoProdu.add(jLabelnombreTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx = 2;
		this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
		this.gridBagConstraintsTipoGastoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGastoProdu.add(jButtonnombreTipoGastoProduBusqueda, this.gridBagConstraintsTipoGastoProdu);
	}

	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 1;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGastoProdu.add(jscrollPanenombreTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);


	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoGastoProdu.add(jLabeldescripcionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx = 2;
		this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
		this.gridBagConstraintsTipoGastoProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoGastoProdu.add(jButtondescripcionTipoGastoProduBusqueda, this.gridBagConstraintsTipoGastoProdu);
	}

	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProdu.gridy = 0;
	this.gridBagConstraintsTipoGastoProdu.gridx = 1;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoGastoProdu.add(jscrollPanedescripcionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProdu.gridy = iYPanelCamposTipoGastoProdu;
	this.gridBagConstraintsTipoGastoProdu.gridx = iXPanelCamposTipoGastoProdu++;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProdu.add(this.jPanelidTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(iXPanelCamposTipoGastoProdu % 1==0) {
		iXPanelCamposTipoGastoProdu=0;
		iYPanelCamposTipoGastoProdu++;
	}
	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProdu.gridy = iYPanelCamposTipoGastoProdu;
	this.gridBagConstraintsTipoGastoProdu.gridx = iXPanelCamposTipoGastoProdu++;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProdu.add(this.jPanelid_paisTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(iXPanelCamposTipoGastoProdu % 1==0) {
		iXPanelCamposTipoGastoProdu=0;
		iYPanelCamposTipoGastoProdu++;
	}
	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProdu.gridy = iYPanelCamposTipoGastoProdu;
	this.gridBagConstraintsTipoGastoProdu.gridx = iXPanelCamposTipoGastoProdu++;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProdu.add(this.jPanelnombreTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(iXPanelCamposTipoGastoProdu % 1==0) {
		iXPanelCamposTipoGastoProdu=0;
		iYPanelCamposTipoGastoProdu++;
	}
	this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProdu.gridy = iYPanelCamposTipoGastoProdu;
	this.gridBagConstraintsTipoGastoProdu.gridx = iXPanelCamposTipoGastoProdu++;
	this.gridBagConstraintsTipoGastoProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProdu.add(this.jPaneldescripcionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);



	if(iXPanelCamposTipoGastoProdu % 1==0) {
		iXPanelCamposTipoGastoProdu=0;
		iYPanelCamposTipoGastoProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGastoProdu= new GridBagLayout();
		this.jPanelAccionesTipoGastoProdu.setLayout(gridaBagLayoutAccionesTipoGastoProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGastoProdu= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGastoProdu.setLayout(gridaBagLayoutAccionesFormularioTipoGastoProdu);
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGastoProdu.add(this.jComboBoxTiposAccionesFormularioTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGastoProdu.add(this.jCheckBoxPostAccionNuevoTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGastoProdu.add(this.jCheckBoxPostAccionSinCerrarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogastoproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogastoproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGastoProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGastoProdu.add(this.jCheckBoxPostAccionSinMensajeTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGastoProdu.add(this.jButtonModificarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);							

		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;
		this.gridBagConstraintsTipoGastoProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGastoProdu.add(this.jButtonEliminarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
			
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGastoProdu.add(this.jButtonActualizarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);


		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;		
		this.gridBagConstraintsTipoGastoProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGastoProdu.add(this.jButtonGuardarCambiosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);	
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = 0;		
		this.gridBagConstraintsTipoGastoProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGastoProdu.add(this.jButtonCancelarTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGastoProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGastoProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();						
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;		
			//this.gridBagConstraintsTipoGastoProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGastoProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoProdu.gridx =0;
		this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGastoProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGastoProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGastoProdu = new TipoGastoProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Gasto Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Gasto Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGastoProduModel tipogastoproduModel=new TipoGastoProduModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGastoProduModel.TipoGastoProduFocusTraversalPolicy tipogastoproduFocusTraversalPolicy = tipogastoproduModel.new TipoGastoProduFocusTraversalPolicy(this);
			
			//tipogastoproduFocusTraversalPolicy.settipogastoproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogastoproduModel);
			
			
			this.jContentPaneDetalleTipoGastoProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGastoProdu = new GridBagLayout();	
			this.jContentPaneDetalleTipoGastoProdu.setLayout(gridaBagLayoutDetalleTipoGastoProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGastoProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGastoProdu.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGastoProdu.add(jTtoolBarDetalleTipoGastoProdu, gridBagConstraintsTipoGastoProdu);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGastoProdu=   new JScrollPane(jContentPaneDetalleTipoGastoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGastoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGastoProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGastoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGastoProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	        
			this.jContentPaneDetalleTipoGastoProdu.add(jPanelCamposTipoGastoProdu, gridBagConstraintsTipoGastoProdu);
			
			
			
			
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
						&& tipogastoproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipogastoproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGastoProdu= new GridBagConstraints();
						this.gridBagConstraintsTipoGastoProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGastoProdu.gridx = 0;
						this.jContentPaneDetalleTipoGastoProdu.add(this.jTabbedPaneRelacionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGastoProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGastoProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
					this.gridBagConstraintsTipoGastoProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGastoProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGastoProdu.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGastoProdu.add(jPanelCamposOcultosTipoGastoProdu, gridBagConstraintsTipoGastoProdu);
				
					this.jPanelCamposOcultosTipoGastoProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	        this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGastoProdu.add(this.jPanelAccionesFormularioTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);							
			
			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
	        this.gridBagConstraintsTipoGastoProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGastoProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGastoProdu.add(this.jPanelAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGastoProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGastoProdu=   new JScrollPane(this.jPanelCamposTipoGastoProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGastoProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;
			this.gridBagConstraintsTipoGastoProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGastoProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGastoProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);			
			
			this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
			
			
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		
			
		this.gridBagConstraintsTipoGastoProdu = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGastoProdu, this.gridBagConstraintsTipoGastoProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGastoProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGastoProdu;
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
