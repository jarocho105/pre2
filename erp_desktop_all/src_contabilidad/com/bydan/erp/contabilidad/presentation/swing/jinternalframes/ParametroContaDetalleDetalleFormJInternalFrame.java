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



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.contabilidad.util.ParametroContaDetalleConstantesFunciones;

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
public class ParametroContaDetalleDetalleFormJInternalFrame extends ParametroContaDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroContaDetalle;
	
	protected JMenuBar jmenuBarDetalleParametroContaDetalle;
	
	protected JMenu jmenuDetalleParametroContaDetalle;
	protected JMenu jmenuDetalleArchivoParametroContaDetalle;
	protected JMenu jmenuDetalleAccionesParametroContaDetalle;
	protected JMenu jmenuDetalleDatosParametroContaDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroContaDetalle;	
	protected GridBagConstraints gridBagConstraintsParametroContaDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroContaDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroContaDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ParametroContaBeanSwingJInternalFrame parametrocontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parametroconta="";

	protected TipoParametroContaBeanSwingJInternalFrame tipoparametrocontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparametroconta="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public ParametroContaDetalleSessionBean parametrocontadetalleSessionBean;
	
	
	
	
	public ParametroContaSessionBean parametrocontaSessionBean;
	public TipoParametroContaSessionBean tipoparametrocontaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public ParametroContaDetalleLogic parametrocontadetalleLogic;
	
	public JScrollPane jScrollPanelDatosParametroContaDetalle;
	public JScrollPane jScrollPanelDatosEdicionParametroContaDetalle;
	public JScrollPane jScrollPanelDatosGeneralParametroContaDetalle;
	
	protected JPanel jPanelCamposParametroContaDetalle;    
	protected JPanel jPanelCamposOcultosParametroContaDetalle;    	
	protected JPanel jPanelAccionesParametroContaDetalle;
	protected JPanel jPanelAccionesFormularioParametroContaDetalle;
    
	
	
	protected Integer iXPanelCamposParametroContaDetalle=0;
	protected Integer iYPanelCamposParametroContaDetalle=0;
	
	protected Integer iXPanelCamposOcultosParametroContaDetalle=0;
	protected Integer iYPanelCamposOcultosParametroContaDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroContaDetalle;
	public JButton jButtonModificarParametroContaDetalle;
	public JButton jButtonActualizarParametroContaDetalle;
    public JButton jButtonEliminarParametroContaDetalle;
	public JButton jButtonCancelarParametroContaDetalle;
    public JButton jButtonGuardarCambiosParametroContaDetalle;
	public JButton jButtonGuardarCambiosTablaParametroContaDetalle;
	protected JButton jButtonCerrarParametroContaDetalle;
	
	
	protected JButton jButtonProcesarInformacionParametroContaDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroContaDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroContaDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroContaDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroContaDetalle;
	protected JButton jButtonModificarToolBarParametroContaDetalle;
	protected JButton jButtonActualizarToolBarParametroContaDetalle;
    protected JButton jButtonEliminarToolBarParametroContaDetalle;
	protected JButton jButtonCancelarToolBarParametroContaDetalle;
    protected JButton jButtonGuardarCambiosToolBarParametroContaDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroContaDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroContaDetalle;
	protected JButton jButtonCerrarToolBarParametroContaDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarParametroContaDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroContaDetalle;
	protected JMenuItem jMenuItemModificarParametroContaDetalle;
	protected JMenuItem jMenuItemActualizarParametroContaDetalle;
    protected JMenuItem jMenuItemEliminarParametroContaDetalle;
	protected JMenuItem jMenuItemCancelarParametroContaDetalle;
    protected JMenuItem jMenuItemGuardarCambiosParametroContaDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroContaDetalle;
	protected JMenuItem jMenuItemCerrarParametroContaDetalle;
	protected JMenuItem jMenuItemDetalleCerrarParametroContaDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroContaDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroContaDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroContaDetalle;
	protected JMenuItem jMenuItemMostrarOcultarParametroContaDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroContaDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroContaDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroContaDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroContaDetalle;
	public JLabel jLabelIdParametroContaDetalle;
	public JLabel jLabelidParametroContaDetalle;
	public JButton jButtonidParametroContaDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_parametro_contaParametroContaDetalle;
	public JLabel jLabelid_parametro_contaParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parametro_contaParametroContaDetalle;
	public JButton jButtonid_parametro_contaParametroContaDetalle= new JButtonMe();
	public JButton jButtonid_parametro_contaParametroContaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_parametro_contaParametroContaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_parametro_contaParametroContaDetalle;
	public JLabel jLabelid_tipo_parametro_contaParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_parametro_contaParametroContaDetalle;
	public JButton jButtonid_tipo_parametro_contaParametroContaDetalle= new JButtonMe();
	public JButton jButtonid_tipo_parametro_contaParametroContaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableParametroContaDetalle;
	public JLabel jLabelid_cuenta_contableParametroContaDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableParametroContaDetalle;
	public JButton jButtonid_cuenta_contableParametroContaDetalle= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroContaDetalleUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroContaDetalleBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroContaDetalleArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroContaDetalle;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroContaDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroContaDetalle=new JPanel();
				this.jPanelAccionesFormularioParametroContaDetalle=new JPanel();
				this.jmenuBarDetalleParametroContaDetalle=new JMenuBar();
				this.jTtoolBarDetalleParametroContaDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroContaDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroContaDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroContaDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroContaDetalle() {
		return this.jButtonActualizarToolBarParametroContaDetalle;
	}
	
	public JButton getjButtonEliminarToolBarParametroContaDetalle() {
		return this.jButtonEliminarToolBarParametroContaDetalle;
	}
	
	public JButton getjButtonCancelarToolBarParametroContaDetalle() {
		return this.jButtonCancelarToolBarParametroContaDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionParametroContaDetalle() {
		return this.jButtonProcesarInformacionParametroContaDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroContaDetalle)	{
		this.jButtonProcesarInformacionParametroContaDetalle = jButtonProcesarInformacionParametroContaDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroContaDetalle() {
		return this.jComboBoxTiposAccionesParametroContaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroContaDetalle(
			JComboBox jComboBoxTiposRelacionesParametroContaDetalle) {
		this.jComboBoxTiposRelacionesParametroContaDetalle = jComboBoxTiposRelacionesParametroContaDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroContaDetalle(
			JComboBox jComboBoxTiposAccionesParametroContaDetalle) {
		this.jComboBoxTiposAccionesParametroContaDetalle = jComboBoxTiposAccionesParametroContaDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroContaDetalle() {
		return this.jComboBoxTiposAccionesFormularioParametroContaDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroContaDetalle(
			JComboBox jComboBoxTiposAccionesFormularioParametroContaDetalle) {
		this.jComboBoxTiposAccionesFormularioParametroContaDetalle = jComboBoxTiposAccionesFormularioParametroContaDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocontadetalleSessionBean=new ParametroContaDetalleSessionBean();
		
		this.parametrocontadetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocontadetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocontadetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroContaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroContaDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Conta Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroContaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroContaDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroContaDetalle=new JButtonMe();
				this.jButtonModificarToolBarParametroContaDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroContaDetalle,this.jTtoolBarDetalleParametroContaDetalle,
							"actualizar","actualizar","Actualizar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroContaDetalle,this.jTtoolBarDetalleParametroContaDetalle,
							"eliminar","eliminar","Eliminar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroContaDetalle,this.jTtoolBarDetalleParametroContaDetalle,
							"cancelar","cancelar","Cancelar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroContaDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroContaDetalle,this.jTtoolBarDetalleParametroContaDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroContaDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroContaDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroContaDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroContaDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroContaDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroContaDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroContaDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroContaDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroContaDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroContaDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroContaDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroContaDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroContaDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroContaDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroContaDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroContaDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroContaDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroContaDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroContaDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroContaDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroContaDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroContaDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroContaDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroContaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroContaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroContaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroContaDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroContaDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroContaDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroContaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroContaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroContaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroContaDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroContaDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroContaDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroContaDetalle.add(this.jMenuItemDetalleCerrarParametroContaDetalle);
		
		this.jmenuDetalleAccionesParametroContaDetalle.add(this.jMenuItemActualizarParametroContaDetalle);
		this.jmenuDetalleAccionesParametroContaDetalle.add(this.jMenuItemEliminarParametroContaDetalle);
		this.jmenuDetalleAccionesParametroContaDetalle.add(this.jMenuItemCancelarParametroContaDetalle);		
		
		//this.jmenuDetalleDatosParametroContaDetalle.add(this.jMenuItemDetalleAbrirOrderByParametroContaDetalle);				
		this.jmenuDetalleDatosParametroContaDetalle.add(this.jMenuItemDetalleMostarOcultarParametroContaDetalle);				
				
		//this.jmenuDetalleAccionesParametroContaDetalle.add(this.jMenuItemGuardarCambiosParametroContaDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroContaDetalle.add(this.jmenuDetalleArchivoParametroContaDetalle);		
		this.jmenuBarDetalleParametroContaDetalle.add(this.jmenuDetalleAccionesParametroContaDetalle);		
		this.jmenuBarDetalleParametroContaDetalle.add(this.jmenuDetalleDatosParametroContaDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroContaDetalle);				
	}
	
	
	public void inicializarElementosCamposParametroContaDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroContaDetalle = new JLabelMe();
		jLabelIdParametroContaDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroContaDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroContaDetalle.setToolTipText(ParametroContaDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroContaDetalle= new GridBagLayout();

		this.jPanelidParametroContaDetalle.setLayout(this.gridaBagLayoutParametroContaDetalle);

		jLabelidParametroContaDetalle = new JLabel();
		jLabelidParametroContaDetalle.setText("Id");

		jLabelidParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroContaDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_parametro_contaParametroContaDetalle = new JLabelMe();
		this.jLabelid_parametro_contaParametroContaDetalle.setText(""+ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA+" : *");
		this.jLabelid_parametro_contaParametroContaDetalle.setToolTipText("Parametro Conta");
		this.jLabelid_parametro_contaParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_parametro_contaParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_parametro_contaParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parametro_contaParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parametro_contaParametroContaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parametro_contaParametroContaDetalle.setToolTipText(ParametroContaDetalleConstantesFunciones.LABEL_IDPARAMETROCONTA);
		this.gridaBagLayoutParametroContaDetalle = new GridBagLayout();
		this.jPanelid_parametro_contaParametroContaDetalle.setLayout(this.gridaBagLayoutParametroContaDetalle);


		jComboBoxid_parametro_contaParametroContaDetalle= new JComboBoxMe();
		jComboBoxid_parametro_contaParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_contaParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parametro_contaParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parametro_contaParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parametro_contaParametroContaDetalle= new JButtonMe();
		this.jButtonid_parametro_contaParametroContaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_contaParametroContaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_contaParametroContaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parametro_contaParametroContaDetalle.setText("Buscar");
		this.jButtonid_parametro_contaParametroContaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parametro_contaParametroContaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_contaParametroContaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parametro_contaParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_contaParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_contaParametroContaDetalle"));

		this.jButtonid_parametro_contaParametroContaDetalleBusqueda= new JButtonMe();
		this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setText("U");
		this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_contaParametroContaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parametro_contaParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_contaParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_contaParametroContaDetalleBusqueda"));

		if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parametro_contaParametroContaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_parametro_contaParametroContaDetalleUpdate= new JButtonMe();
		this.jButtonid_parametro_contaParametroContaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_contaParametroContaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parametro_contaParametroContaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parametro_contaParametroContaDetalleUpdate.setText("U");
		this.jButtonid_parametro_contaParametroContaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parametro_contaParametroContaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parametro_contaParametroContaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parametro_contaParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parametro_contaParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parametro_contaParametroContaDetalleUpdate"));



					
		this.jLabelid_tipo_parametro_contaParametroContaDetalle = new JLabelMe();
		this.jLabelid_tipo_parametro_contaParametroContaDetalle.setText(""+ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA+" : *");
		this.jLabelid_tipo_parametro_contaParametroContaDetalle.setToolTipText("Tipo Parametro Conta");
		this.jLabelid_tipo_parametro_contaParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_parametro_contaParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_parametro_contaParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_parametro_contaParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_parametro_contaParametroContaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_parametro_contaParametroContaDetalle.setToolTipText(ParametroContaDetalleConstantesFunciones.LABEL_IDTIPOPARAMETROCONTA);
		this.gridaBagLayoutParametroContaDetalle = new GridBagLayout();
		this.jPanelid_tipo_parametro_contaParametroContaDetalle.setLayout(this.gridaBagLayoutParametroContaDetalle);


		jComboBoxid_tipo_parametro_contaParametroContaDetalle= new JComboBoxMe();
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_parametro_contaParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_parametro_contaParametroContaDetalle= new JButtonMe();
		this.jButtonid_tipo_parametro_contaParametroContaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_parametro_contaParametroContaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_parametro_contaParametroContaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_parametro_contaParametroContaDetalle.setText("Buscar");
		this.jButtonid_tipo_parametro_contaParametroContaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_parametro_contaParametroContaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_parametro_contaParametroContaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_parametro_contaParametroContaDetalle"));

		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda= new JButtonMe();
		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setText("U");
		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_parametro_contaParametroContaDetalleBusqueda"));

		if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate= new JButtonMe();
		this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.setText("U");
		this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_parametro_contaParametroContaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_parametro_contaParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_parametro_contaParametroContaDetalleUpdate"));



					
		this.jLabelid_cuenta_contableParametroContaDetalle = new JLabelMe();
		this.jLabelid_cuenta_contableParametroContaDetalle.setText(""+ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableParametroContaDetalle.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableParametroContaDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableParametroContaDetalle.setToolTipText(ParametroContaDetalleConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutParametroContaDetalle = new GridBagLayout();
		this.jPanelid_cuenta_contableParametroContaDetalle.setLayout(this.gridaBagLayoutParametroContaDetalle);


		jComboBoxid_cuenta_contableParametroContaDetalle= new JComboBoxMe();
		jComboBoxid_cuenta_contableParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableParametroContaDetalle= new JButtonMe();
		this.jButtonid_cuenta_contableParametroContaDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroContaDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroContaDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroContaDetalle.setText("Buscar");
		this.jButtonid_cuenta_contableParametroContaDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableParametroContaDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroContaDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroContaDetalle"));

		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setText("U");
		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroContaDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroContaDetalleBusqueda"));

		if(this.parametrocontadetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableParametroContaDetalleBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableParametroContaDetalleUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableParametroContaDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroContaDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroContaDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableParametroContaDetalleUpdate.setText("U");
		this.jButtonid_cuenta_contableParametroContaDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableParametroContaDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroContaDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroContaDetalleUpdate"));


		jButtonid_cuenta_contableParametroContaDetalleArbol= new JButtonMe();
		jButtonid_cuenta_contableParametroContaDetalleArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroContaDetalleArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroContaDetalleArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroContaDetalleArbol.setText("Arbol");
		jButtonid_cuenta_contableParametroContaDetalleArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableParametroContaDetalleArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroContaDetalleArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableParametroContaDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroContaDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroContaDetalleArbol"));



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
		//this.jInternalFrameDetalleParametroContaDetalle = new ParametroContaDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Conta Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroContaDetalle= new GridBagLayout();
		

		
		String sToolTipParametroContaDetalle="";
		sToolTipParametroContaDetalle=ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroContaDetalle+="(Contabilidad.ParametroContaDetalle)";
		}
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroContaDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroContaDetalle = new JButtonMe();
		this.jButtonModificarParametroContaDetalle = new JButtonMe();
        this.jButtonActualizarParametroContaDetalle = new JButtonMe();
        this.jButtonEliminarParametroContaDetalle = new JButtonMe();
        this.jButtonCancelarParametroContaDetalle = new JButtonMe();
        this.jButtonGuardarCambiosParametroContaDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroContaDetalle = new JButtonMe();
		this.jButtonCerrarParametroContaDetalle = new JButtonMe();
		
		this.jScrollPanelDatosParametroContaDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroContaDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroContaDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Conta Detalle";
		
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Conta Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroContaDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroContaDetalle.setName("jPanelCamposParametroContaDetalle"); 

		this.jPanelCamposOcultosParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroContaDetalle.setName("jPanelCamposOcultosParametroContaDetalle"); 

        this.jPanelAccionesParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroContaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesParametroContaDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroContaDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroContaDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroContaDetalle.setText("Nuevo");
		this.jButtonModificarParametroContaDetalle.setText("Editar");
        this.jButtonActualizarParametroContaDetalle.setText("Actualizar");
        this.jButtonEliminarParametroContaDetalle.setText("Eliminar");
        this.jButtonCancelarParametroContaDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosParametroContaDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroContaDetalle.setText("Guardar");
		this.jButtonCerrarParametroContaDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroContaDetalle,"nuevo_button","Nuevo",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroContaDetalle,"modificar_button","Editar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroContaDetalle,"actualizar_button","Actualizar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroContaDetalle,"eliminar_button","Eliminar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroContaDetalle,"cancelar_button","Cancelar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroContaDetalle,"guardarcambios_button","Guardar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroContaDetalle,"guardarcambiostabla_button","Guardar",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroContaDetalle,"cerrar_button","Salir",this.parametrocontadetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroContaDetalle.setToolTipText("Nuevo"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroContaDetalle.setToolTipText("Editar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroContaDetalle.setToolTipText("Actualizar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroContaDetalle.setToolTipText("Eliminar)"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroContaDetalle.setToolTipText("Cancelar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroContaDetalle.setToolTipText("Guardar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroContaDetalle.setToolTipText("Guardar"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroContaDetalle.setToolTipText("Salir"+" "+ParametroContaDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroContaDetalle";
		inputMap = this.jButtonNuevoParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroContaDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroContaDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroContaDetalle";
		inputMap = this.jButtonActualizarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroContaDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroContaDetalle";
		inputMap = this.jButtonEliminarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroContaDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroContaDetalle";
		inputMap = this.jButtonCancelarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroContaDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarParametroContaDetalle";
		inputMap = this.jButtonCerrarParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroContaDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroContaDetalle";
		inputMap = this.jButtonGuardarCambiosTablaParametroContaDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroContaDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroContaDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroContaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroContaDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroContaDetalle.setToolTipText("Nuevo ParametroContaDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroContaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroContaDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroContaDetalle.setToolTipText("Sin Cerrar Ventana ParametroContaDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroContaDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroContaDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroContaDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroContaDetalle.setText("Accion");
		this.jComboBoxTiposAccionesParametroContaDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroContaDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroContaDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroContaDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroContaDetalle = new JLabelMe();
		
		this.jLabelAccionesParametroContaDetalle.setText("Acciones");		
		this.jLabelAccionesParametroContaDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContaDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroContaDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroContaDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroContaDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroContaDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroContaDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroContaDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroContaDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContaDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroContaDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroContaDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroContaDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroContaDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroContaDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroContaDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroContaDetalle = new GridBagLayout();
		
		this.jPanelCamposParametroContaDetalle.setLayout(gridaBagLayoutCamposParametroContaDetalle);
		this.jPanelCamposOcultosParametroContaDetalle.setLayout(gridaBagLayoutCamposOcultosParametroContaDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroContaDetalle.add(jLabelIdParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 1;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroContaDetalle.add(jLabelidParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);


	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parametro_contaParametroContaDetalle.add(jLabelid_parametro_contaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 2;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
		this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parametro_contaParametroContaDetalle.add(jButtonid_parametro_contaParametroContaDetalleBusqueda, this.gridBagConstraintsParametroContaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 3;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
		this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parametro_contaParametroContaDetalle.add(jButtonid_parametro_contaParametroContaDetalleUpdate, this.gridBagConstraintsParametroContaDetalle);
	}

	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 1;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parametro_contaParametroContaDetalle.add(jComboBoxid_parametro_contaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);


	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_parametro_contaParametroContaDetalle.add(jLabelid_tipo_parametro_contaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 2;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
		this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_parametro_contaParametroContaDetalle.add(jButtonid_tipo_parametro_contaParametroContaDetalleBusqueda, this.gridBagConstraintsParametroContaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 3;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
		this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_parametro_contaParametroContaDetalle.add(jButtonid_tipo_parametro_contaParametroContaDetalleUpdate, this.gridBagConstraintsParametroContaDetalle);
	}

	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 1;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_parametro_contaParametroContaDetalle.add(jComboBoxid_tipo_parametro_contaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);


	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableParametroContaDetalle.add(jLabelid_cuenta_contableParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 2;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableParametroContaDetalle.add(jButtonid_cuenta_contableParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 3;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableParametroContaDetalle.add(jButtonid_cuenta_contableParametroContaDetalleArbol, this.gridBagConstraintsParametroContaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 4;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
		this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableParametroContaDetalle.add(jButtonid_cuenta_contableParametroContaDetalleBusqueda, this.gridBagConstraintsParametroContaDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		//this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = 5;
		this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
		this.gridBagConstraintsParametroContaDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableParametroContaDetalle.add(jButtonid_cuenta_contableParametroContaDetalleUpdate, this.gridBagConstraintsParametroContaDetalle);
	}

	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroContaDetalle.gridy = 0;
	this.gridBagConstraintsParametroContaDetalle.gridx = 1;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableParametroContaDetalle.add(jComboBoxid_cuenta_contableParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContaDetalle.gridy = iYPanelCamposParametroContaDetalle;
	this.gridBagConstraintsParametroContaDetalle.gridx = iXPanelCamposParametroContaDetalle++;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContaDetalle.add(this.jPanelidParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(iXPanelCamposParametroContaDetalle % 1==0) {
		iXPanelCamposParametroContaDetalle=0;
		iYPanelCamposParametroContaDetalle++;
	}
	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContaDetalle.gridy = iYPanelCamposParametroContaDetalle;
	this.gridBagConstraintsParametroContaDetalle.gridx = iXPanelCamposParametroContaDetalle++;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContaDetalle.add(this.jPanelid_parametro_contaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(iXPanelCamposParametroContaDetalle % 1==0) {
		iXPanelCamposParametroContaDetalle=0;
		iYPanelCamposParametroContaDetalle++;
	}
	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContaDetalle.gridy = iYPanelCamposParametroContaDetalle;
	this.gridBagConstraintsParametroContaDetalle.gridx = iXPanelCamposParametroContaDetalle++;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContaDetalle.add(this.jPanelid_tipo_parametro_contaParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(iXPanelCamposParametroContaDetalle % 1==0) {
		iXPanelCamposParametroContaDetalle=0;
		iYPanelCamposParametroContaDetalle++;
	}
	this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroContaDetalle.gridy = iYPanelCamposParametroContaDetalle;
	this.gridBagConstraintsParametroContaDetalle.gridx = iXPanelCamposParametroContaDetalle++;
	this.gridBagConstraintsParametroContaDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroContaDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroContaDetalle.add(this.jPanelid_cuenta_contableParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);



	if(iXPanelCamposParametroContaDetalle % 1==0) {
		iXPanelCamposParametroContaDetalle=0;
		iYPanelCamposParametroContaDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroContaDetalle= new GridBagLayout();
		this.jPanelAccionesParametroContaDetalle.setLayout(gridaBagLayoutAccionesParametroContaDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroContaDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioParametroContaDetalle.setLayout(gridaBagLayoutAccionesFormularioParametroContaDetalle);
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroContaDetalle.add(this.jComboBoxTiposAccionesFormularioParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroContaDetalle.add(this.jCheckBoxPostAccionNuevoParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroContaDetalle.add(this.jCheckBoxPostAccionSinCerrarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrocontadetalleSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroContaDetalle.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroContaDetalle.add(this.jCheckBoxPostAccionSinMensajeParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroContaDetalle.add(this.jButtonModificarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);							

		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;
		this.gridBagConstraintsParametroContaDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroContaDetalle.add(this.jButtonEliminarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
			
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroContaDetalle.add(this.jButtonActualizarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);


		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;		
		this.gridBagConstraintsParametroContaDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroContaDetalle.add(this.jButtonGuardarCambiosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);	
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = 0;		
		this.gridBagConstraintsParametroContaDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroContaDetalle.add(this.jButtonCancelarParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroContaDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroContaDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocontadetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();						
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;		
			//this.gridBagConstraintsParametroContaDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroContaDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroContaDetalle.gridx =0;
		this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroContaDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroContaDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroContaDetalle = new ParametroContaDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Conta Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Conta Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Conta Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroContaDetalleModel parametrocontadetalleModel=new ParametroContaDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroContaDetalleModel.ParametroContaDetalleFocusTraversalPolicy parametrocontadetalleFocusTraversalPolicy = parametrocontadetalleModel.new ParametroContaDetalleFocusTraversalPolicy(this);
			
			//parametrocontadetalleFocusTraversalPolicy.setparametrocontadetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrocontadetalleModel);
			
			
			this.jContentPaneDetalleParametroContaDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroContaDetalle = new GridBagLayout();	
			this.jContentPaneDetalleParametroContaDetalle.setLayout(gridaBagLayoutDetalleParametroContaDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroContaDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
				this.gridBagConstraintsParametroContaDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroContaDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleParametroContaDetalle.add(jTtoolBarDetalleParametroContaDetalle, gridBagConstraintsParametroContaDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionParametroContaDetalle=   new JScrollPane(jContentPaneDetalleParametroContaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroContaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroContaDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroContaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroContaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroContaDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	        
			this.jContentPaneDetalleParametroContaDetalle.add(jPanelCamposParametroContaDetalle, gridBagConstraintsParametroContaDetalle);
			
			
			
			
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
						&& parametrocontadetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrocontadetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroContaDetalle= new GridBagConstraints();
						this.gridBagConstraintsParametroContaDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroContaDetalle.gridx = 0;
						this.jContentPaneDetalleParametroContaDetalle.add(this.jTabbedPaneRelacionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroContaDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroContaDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
					this.gridBagConstraintsParametroContaDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroContaDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroContaDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleParametroContaDetalle.add(jPanelCamposOcultosParametroContaDetalle, gridBagConstraintsParametroContaDetalle);
				
					this.jPanelCamposOcultosParametroContaDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	        this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroContaDetalle.add(this.jPanelAccionesFormularioParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);							
			
			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
	        this.gridBagConstraintsParametroContaDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroContaDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroContaDetalle.add(this.jPanelAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroContaDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroContaDetalle=   new JScrollPane(this.jPanelCamposParametroContaDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroContaDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContaDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroContaDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;
			this.gridBagConstraintsParametroContaDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroContaDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroContaDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);			
			
			this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
			this.gridBagConstraintsParametroContaDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroContaDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
			
			
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		
			
		this.gridBagConstraintsParametroContaDetalle = new GridBagConstraints();
		this.gridBagConstraintsParametroContaDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroContaDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroContaDetalle, this.gridBagConstraintsParametroContaDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroContaDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroContaDetalle;
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
