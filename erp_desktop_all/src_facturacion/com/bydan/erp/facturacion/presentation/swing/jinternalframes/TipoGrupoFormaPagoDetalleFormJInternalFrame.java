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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoGrupoFormaPagoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoGrupoFormaPagoDetalleFormJInternalFrame extends TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGrupoFormaPago;
	
	protected JMenuBar jmenuBarDetalleTipoGrupoFormaPago;
	
	protected JMenu jmenuDetalleTipoGrupoFormaPago;
	protected JMenu jmenuDetalleArchivoTipoGrupoFormaPago;
	protected JMenu jmenuDetalleAccionesTipoGrupoFormaPago;
	protected JMenu jmenuDetalleDatosTipoGrupoFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoFormaPago;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGrupoFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	
	

	public TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame=null;
	public TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTipoFormaPago=false;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;

	public AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFrame=null;
	public AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAnticipoCliente=false;
	public AnticipoClienteSessionBean anticipoclienteSessionBean;
	
		
	
	public TipoGrupoFormaPagoLogic tipogrupoformapagoLogic;
	
	public JScrollPane jScrollPanelDatosTipoGrupoFormaPago;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoFormaPago;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoFormaPago;
	
	protected JPanel jPanelCamposTipoGrupoFormaPago;    
	protected JPanel jPanelCamposOcultosTipoGrupoFormaPago;    	
	protected JPanel jPanelAccionesTipoGrupoFormaPago;
	protected JPanel jPanelAccionesFormularioTipoGrupoFormaPago;
    
	
	
	protected Integer iXPanelCamposTipoGrupoFormaPago=0;
	protected Integer iYPanelCamposTipoGrupoFormaPago=0;
	
	protected Integer iXPanelCamposOcultosTipoGrupoFormaPago=0;
	protected Integer iYPanelCamposOcultosTipoGrupoFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGrupoFormaPago;
	public JButton jButtonModificarTipoGrupoFormaPago;
	public JButton jButtonActualizarTipoGrupoFormaPago;
    public JButton jButtonEliminarTipoGrupoFormaPago;
	public JButton jButtonCancelarTipoGrupoFormaPago;
    public JButton jButtonGuardarCambiosTipoGrupoFormaPago;
	public JButton jButtonGuardarCambiosTablaTipoGrupoFormaPago;
	protected JButton jButtonCerrarTipoGrupoFormaPago;
	
	
	protected JButton jButtonProcesarInformacionTipoGrupoFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGrupoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoFormaPago;
	protected JButton jButtonModificarToolBarTipoGrupoFormaPago;
	protected JButton jButtonActualizarToolBarTipoGrupoFormaPago;
    protected JButton jButtonEliminarToolBarTipoGrupoFormaPago;
	protected JButton jButtonCancelarToolBarTipoGrupoFormaPago;
    protected JButton jButtonGuardarCambiosToolBarTipoGrupoFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoFormaPago;
	protected JButton jButtonCerrarToolBarTipoGrupoFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoFormaPago;
	protected JMenuItem jMenuItemModificarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemActualizarTipoGrupoFormaPago;
    protected JMenuItem jMenuItemEliminarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemCancelarTipoGrupoFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosTipoGrupoFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoFormaPago;
	protected JMenuItem jMenuItemCerrarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGrupoFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGrupoFormaPago;
	public JLabel jLabelIdTipoGrupoFormaPago;
	public JTextFieldMe jTextFieldidTipoGrupoFormaPago;
	public JButton jButtonidTipoGrupoFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGrupoFormaPago;
	public JLabel jLabelnombreTipoGrupoFormaPago;
	public JTextArea jTextAreanombreTipoGrupoFormaPago;
	public JScrollPane jscrollPanenombreTipoGrupoFormaPago;
	public JButton jButtonnombreTipoGrupoFormaPagoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGrupoFormaPago;
	
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
	
	public TipoGrupoFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGrupoFormaPago=new JPanel();
				this.jPanelAccionesFormularioTipoGrupoFormaPago=new JPanel();
				this.jmenuBarDetalleTipoGrupoFormaPago=new JMenuBar();
				this.jTtoolBarDetalleTipoGrupoFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGrupoFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGrupoFormaPago() {
		return this.jButtonActualizarToolBarTipoGrupoFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarTipoGrupoFormaPago() {
		return this.jButtonEliminarToolBarTipoGrupoFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarTipoGrupoFormaPago() {
		return this.jButtonCancelarToolBarTipoGrupoFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGrupoFormaPago() {
		return this.jButtonProcesarInformacionTipoGrupoFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoFormaPago)	{
		this.jButtonProcesarInformacionTipoGrupoFormaPago = jButtonProcesarInformacionTipoGrupoFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoFormaPago() {
		return this.jComboBoxTiposAccionesTipoGrupoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposRelacionesTipoGrupoFormaPago) {
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago = jComboBoxTiposRelacionesTipoGrupoFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoFormaPago(
			JComboBox jComboBoxTiposAccionesTipoGrupoFormaPago) {
		this.jComboBoxTiposAccionesTipoGrupoFormaPago = jComboBoxTiposAccionesTipoGrupoFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGrupoFormaPago() {
		return this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGrupoFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioTipoGrupoFormaPago) {
		this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago = jComboBoxTiposAccionesFormularioTipoGrupoFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
		
		this.tipogrupoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.tipoformapagoSessionBean=new TipoFormaPagoSessionBean();
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		//this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGrupoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGrupoFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGrupoFormaPago=new JButtonMe();
				this.jButtonModificarToolBarTipoGrupoFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGrupoFormaPago,this.jTtoolBarDetalleTipoGrupoFormaPago,
							"actualizar","actualizar","Actualizar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGrupoFormaPago,this.jTtoolBarDetalleTipoGrupoFormaPago,
							"eliminar","eliminar","Eliminar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGrupoFormaPago,this.jTtoolBarDetalleTipoGrupoFormaPago,
							"cancelar","cancelar","Cancelar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGrupoFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGrupoFormaPago,this.jTtoolBarDetalleTipoGrupoFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGrupoFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGrupoFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGrupoFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGrupoFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGrupoFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGrupoFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGrupoFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGrupoFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGrupoFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGrupoFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGrupoFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGrupoFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGrupoFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGrupoFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGrupoFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGrupoFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGrupoFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGrupoFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGrupoFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGrupoFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGrupoFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGrupoFormaPago.add(this.jMenuItemDetalleCerrarTipoGrupoFormaPago);
		
		this.jmenuDetalleAccionesTipoGrupoFormaPago.add(this.jMenuItemActualizarTipoGrupoFormaPago);
		this.jmenuDetalleAccionesTipoGrupoFormaPago.add(this.jMenuItemEliminarTipoGrupoFormaPago);
		this.jmenuDetalleAccionesTipoGrupoFormaPago.add(this.jMenuItemCancelarTipoGrupoFormaPago);		
		
		//this.jmenuDetalleDatosTipoGrupoFormaPago.add(this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago);				
		this.jmenuDetalleDatosTipoGrupoFormaPago.add(this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago);				
				
		//this.jmenuDetalleAccionesTipoGrupoFormaPago.add(this.jMenuItemGuardarCambiosTipoGrupoFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGrupoFormaPago.add(this.jmenuDetalleArchivoTipoGrupoFormaPago);		
		this.jmenuBarDetalleTipoGrupoFormaPago.add(this.jmenuDetalleAccionesTipoGrupoFormaPago);		
		this.jmenuBarDetalleTipoGrupoFormaPago.add(this.jmenuDetalleDatosTipoGrupoFormaPago);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoGrupoFormaPago.add(this.jmenuDetalleTipoGrupoFormaPago);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGrupoFormaPago);				
	}
	
	
	public void inicializarElementosCamposTipoGrupoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGrupoFormaPago = new JLabelMe();
		jLabelIdTipoGrupoFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGrupoFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGrupoFormaPago.setToolTipText(TipoGrupoFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGrupoFormaPago= new GridBagLayout();

		this.jPanelidTipoGrupoFormaPago.setLayout(this.gridaBagLayoutTipoGrupoFormaPago);

		jTextFieldidTipoGrupoFormaPago = new JTextFieldMe();
		jTextFieldidTipoGrupoFormaPago.setText("Id");

		jTextFieldidTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoGrupoFormaPago = new JLabelMe();
		this.jLabelnombreTipoGrupoFormaPago.setText(""+TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGrupoFormaPago.setToolTipText("Nombre");
		this.jLabelnombreTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGrupoFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGrupoFormaPago.setToolTipText(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGrupoFormaPago = new GridBagLayout();
		this.jPanelnombreTipoGrupoFormaPago.setLayout(this.gridaBagLayoutTipoGrupoFormaPago);


		jTextAreanombreTipoGrupoFormaPago= new JTextAreaMe();
		jTextAreanombreTipoGrupoFormaPago.setEnabled(false);
		jTextAreanombreTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoFormaPago.setLineWrap(true);
		jTextAreanombreTipoGrupoFormaPago.setWrapStyleWord(true);
		jTextAreanombreTipoGrupoFormaPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGrupoFormaPago.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGrupoFormaPago = new JScrollPane(jTextAreanombreTipoGrupoFormaPago);
		jscrollPanenombreTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoGrupoFormaPagoBusqueda= new JButtonMe();
		this.jButtonnombreTipoGrupoFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGrupoFormaPagoBusqueda.setText("U");
		this.jButtonnombreTipoGrupoFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGrupoFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGrupoFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGrupoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGrupoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGrupoFormaPagoBusqueda"));

		if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGrupoFormaPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGrupoFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoGrupoFormaPago = new TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Grupo Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoFormaPago= new GridBagLayout();
		

		
		String sToolTipTipoGrupoFormaPago="";
		sToolTipTipoGrupoFormaPago=TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoFormaPago+="(Facturacion.TipoGrupoFormaPago)";
		}
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGrupoFormaPago = new JButtonMe();
		this.jButtonModificarTipoGrupoFormaPago = new JButtonMe();
        this.jButtonActualizarTipoGrupoFormaPago = new JButtonMe();
        this.jButtonEliminarTipoGrupoFormaPago = new JButtonMe();
        this.jButtonCancelarTipoGrupoFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosTipoGrupoFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago = new JButtonMe();
		this.jButtonCerrarTipoGrupoFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGrupoFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGrupoFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Forma Pago";
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGrupoFormaPago.setName("jPanelCamposTipoGrupoFormaPago"); 

		this.jPanelCamposOcultosTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGrupoFormaPago.setName("jPanelCamposOcultosTipoGrupoFormaPago"); 

        this.jPanelAccionesTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGrupoFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGrupoFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGrupoFormaPago.setText("Nuevo");
		this.jButtonModificarTipoGrupoFormaPago.setText("Editar");
        this.jButtonActualizarTipoGrupoFormaPago.setText("Actualizar");
        this.jButtonEliminarTipoGrupoFormaPago.setText("Eliminar");
        this.jButtonCancelarTipoGrupoFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGrupoFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.setText("Guardar");
		this.jButtonCerrarTipoGrupoFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoFormaPago,"nuevo_button","Nuevo",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGrupoFormaPago,"modificar_button","Editar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGrupoFormaPago,"actualizar_button","Actualizar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGrupoFormaPago,"eliminar_button","Eliminar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGrupoFormaPago,"cancelar_button","Cancelar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGrupoFormaPago,"guardarcambios_button","Guardar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoFormaPago,"guardarcambiostabla_button","Guardar",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoFormaPago,"cerrar_button","Salir",this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGrupoFormaPago.setToolTipText("Nuevo"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGrupoFormaPago.setToolTipText("Editar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGrupoFormaPago.setToolTipText("Actualizar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGrupoFormaPago.setToolTipText("Eliminar)"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGrupoFormaPago.setToolTipText("Cancelar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGrupoFormaPago.setToolTipText("Guardar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.setToolTipText("Guardar"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoFormaPago.setToolTipText("Salir"+" "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoFormaPago";
		inputMap = this.jButtonNuevoTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGrupoFormaPago";
		inputMap = this.jButtonActualizarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGrupoFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGrupoFormaPago";
		inputMap = this.jButtonEliminarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGrupoFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGrupoFormaPago";
		inputMap = this.jButtonCancelarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGrupoFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoFormaPago";
		inputMap = this.jButtonCerrarTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGrupoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGrupoFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGrupoFormaPago.setToolTipText("Nuevo TipoGrupoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago.setToolTipText("Sin Cerrar Ventana TipoGrupoFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGrupoFormaPago = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoFormaPago.setText("Acciones");		
		this.jLabelAccionesTipoGrupoFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGrupoFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGrupoFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGrupoFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGrupoFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGrupoFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGrupoFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGrupoFormaPago = new GridBagLayout();
		
		this.jPanelCamposTipoGrupoFormaPago.setLayout(gridaBagLayoutCamposTipoGrupoFormaPago);
		this.jPanelCamposOcultosTipoGrupoFormaPago.setLayout(gridaBagLayoutCamposOcultosTipoGrupoFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGrupoFormaPago.add(jLabelIdTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);



	this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGrupoFormaPago.add(jTextFieldidTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);


	this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGrupoFormaPago.add(jLabelnombreTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 2;
		this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
		this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGrupoFormaPago.add(jButtonnombreTipoGrupoFormaPagoBusqueda, this.gridBagConstraintsTipoGrupoFormaPago);
	}

	this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.gridx = 1;
	this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGrupoFormaPago.add(jscrollPanenombreTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoFormaPago.gridy = iYPanelCamposTipoGrupoFormaPago;
	this.gridBagConstraintsTipoGrupoFormaPago.gridx = iXPanelCamposTipoGrupoFormaPago++;
	this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoFormaPago.add(this.jPanelidTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);



	if(iXPanelCamposTipoGrupoFormaPago % 1==0) {
		iXPanelCamposTipoGrupoFormaPago=0;
		iYPanelCamposTipoGrupoFormaPago++;
	}
	this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoFormaPago.gridy = iYPanelCamposTipoGrupoFormaPago;
	this.gridBagConstraintsTipoGrupoFormaPago.gridx = iXPanelCamposTipoGrupoFormaPago++;
	this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoFormaPago.add(this.jPanelnombreTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);



	if(iXPanelCamposTipoGrupoFormaPago % 1==0) {
		iXPanelCamposTipoGrupoFormaPago=0;
		iYPanelCamposTipoGrupoFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoFormaPago= new GridBagLayout();
		this.jPanelAccionesTipoGrupoFormaPago.setLayout(gridaBagLayoutAccionesTipoGrupoFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGrupoFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGrupoFormaPago.setLayout(gridaBagLayoutAccionesFormularioTipoGrupoFormaPago);
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoFormaPago.add(this.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);

		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoFormaPago.add(this.jCheckBoxPostAccionNuevoTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoFormaPago.add(this.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoFormaPago.add(this.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoFormaPago.add(this.jButtonModificarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);							

		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoFormaPago.add(this.jButtonEliminarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
			
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoFormaPago.add(this.jButtonActualizarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);


		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoFormaPago.add(this.jButtonGuardarCambiosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);	
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = 0;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoFormaPago.add(this.jButtonCancelarTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =0;
		this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGrupoFormaPago = new TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Grupo Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Grupo Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGrupoFormaPagoModel tipogrupoformapagoModel=new TipoGrupoFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGrupoFormaPagoModel.TipoGrupoFormaPagoFocusTraversalPolicy tipogrupoformapagoFocusTraversalPolicy = tipogrupoformapagoModel.new TipoGrupoFormaPagoFocusTraversalPolicy(this);
			
			//tipogrupoformapagoFocusTraversalPolicy.settipogrupoformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogrupoformapagoModel);
			
			
			this.jContentPaneDetalleTipoGrupoFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGrupoFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleTipoGrupoFormaPago.setLayout(gridaBagLayoutDetalleTipoGrupoFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGrupoFormaPago.add(jTtoolBarDetalleTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago=   new JScrollPane(jContentPaneDetalleTipoGrupoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleTipoGrupoFormaPago.add(jPanelCamposTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);
			
			
			
			
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
						&& tipogrupoformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAnticipoCliente(this.puedeCargarPorParteAnticipoCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoFormaPago(this.puedeCargarPorParteTipoFormaPago,false,-1);
					
					if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGrupoFormaPago= new GridBagConstraints();
						this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
						this.jContentPaneDetalleTipoGrupoFormaPago.add(this.jTabbedPaneRelacionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGrupoFormaPago.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAnticipoCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTipoFormaPago(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGrupoFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
					this.gridBagConstraintsTipoGrupoFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGrupoFormaPago.add(jPanelCamposOcultosTipoGrupoFormaPago, gridBagConstraintsTipoGrupoFormaPago);
				
					this.jPanelCamposOcultosTipoGrupoFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
	        this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGrupoFormaPago.add(this.jPanelAccionesFormularioTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);							
			
			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGrupoFormaPago.add(this.jPanelAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGrupoFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago=   new JScrollPane(this.jPanelCamposTipoGrupoFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
			this.gridBagConstraintsTipoGrupoFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGrupoFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGrupoFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);			
			
			this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
			
			
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		
			
		this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoFormaPago, this.gridBagConstraintsTipoGrupoFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGrupoFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGrupoFormaPago;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAnticipoCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		this.anticipoclienteSessionBean.setConGuardarRelaciones(false);
		this.anticipoclienteSessionBean.setEsGuardarRelacionado(true);

		this.anticipoclienteBeanSwingJInternalFrame=null;//new AnticipoClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.anticipoclienteBeanSwingJInternalFramePopup=new AnticipoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.anticipoclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {

				AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.anticipoclienteSessionBean.setEsGuardarRelacionado(true);

				this.anticipoclienteBeanSwingJInternalFrame=new AnticipoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.anticipoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.anticipoclienteBeanSwingJInternalFrame.setanticipoclienteSessionBean(this.anticipoclienteSessionBean);

				//this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoGrupoFormaPago.add(this.anticipoclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGrupoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.add("Anticipo Clientes",this.anticipoclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.setComponentAt(iIndexTab,this.anticipoclienteBeanSwingJInternalFrame.getContentPane());
				}

				//AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.anticipoclienteSessionBean.setEsGuardarRelacionado(false);
				this.anticipoclienteBeanSwingJInternalFrame=null;//new AnticipoClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAnticipoCliente) {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.add("Anticipo Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoGrupoFormaPago.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGrupoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTipoFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tipoformapagoSessionBean=new TipoFormaPagoSessionBean();
		this.tipoformapagoSessionBean.setConGuardarRelaciones(false);
		this.tipoformapagoSessionBean.setEsGuardarRelacionado(true);

		this.tipoformapagoBeanSwingJInternalFrame=null;//new TipoFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tipoformapagoBeanSwingJInternalFramePopup=new TipoFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tipoformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {

				TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TipoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGrupoFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tipoformapagoSessionBean.setEsGuardarRelacionado(true);

				this.tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tipoformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tipoformapagoBeanSwingJInternalFrame.settipoformapagoSessionBean(this.tipoformapagoSessionBean);

				//this.gridBagConstraintsTipoGrupoFormaPago = new GridBagConstraints();
				//this.gridBagConstraintsTipoGrupoFormaPago.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGrupoFormaPago.gridx = 0;
				//this.jContentPaneDetalleTipoGrupoFormaPago.add(this.tipoformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGrupoFormaPago);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.add("Tipo Forma Pagos",this.tipoformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.setComponentAt(iIndexTab,this.tipoformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tipoformapagoSessionBean.setEsGuardarRelacionado(false);
				this.tipoformapagoBeanSwingJInternalFrame=null;//new TipoFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tipoformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTipoFormaPago) {
					this.jTabbedPaneRelacionesTipoGrupoFormaPago.add("Tipo Forma Pagos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTipoFormaPagoBeanSwingJInternalFrame(List<TipoGrupoFormaPago> tipogrupoformapagos,TipoGrupoFormaPago tipogrupoformapago,TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tipoformapagoBeanSwingJInternalFrame=new TipoFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tipoformapagoBeanSwingJInternalFrame.getTipoFormaPagoLogic().setConnexion(this.tipogrupoformapagoLogic.getConnexion());

					tipoformapagoBeanSwingJInternalFrame.settipogrupoformapagosForeignKey(tipogrupoformapagos);
					tipoformapagoBeanSwingJInternalFrame.settipogrupoformapagoForeignKey(tipogrupoformapago);
					tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(true);
					tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.setlidTipoGrupoFormaPagoActual(tipogrupoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tipoformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyTipoFormaPago(tipoformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tipoformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGrupoFormaPago(true);
					tipoformapagoBeanSwingJInternalFrame.setid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago(tipogrupoformapago.getId());

					if(!this.conCargarFormDetalle) {
						tipoformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tipoformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGrupoFormaPagoForeignKey(tipogrupoformapago,1,false,true,true);
					tipoformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tipoformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGrupoFormaPago");
					tipoformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGrupoFormaPago");
					tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago(true);
					tipoformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTipoFormaPago("n",tipoformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tipoformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tipoformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					tipoformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tipoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoFormaPago("relacionado");
					} else {
						tipoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoFormaPago("no_relacionado");
					}

					tipoformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionTipoFormaPago().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<TipoGrupoFormaPago> tipogrupoformapagos,TipoGrupoFormaPago tipogrupoformapago,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.tipogrupoformapagoLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.settipogrupoformapagosForeignKey(tipogrupoformapagos);
					datogeneralempleadoBeanSwingJInternalFrame.settipogrupoformapagoForeignKey(tipogrupoformapago);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidTipoGrupoFormaPagoActual(tipogrupoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGrupoFormaPago(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago(tipogrupoformapago.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGrupoFormaPagoForeignKey(tipogrupoformapago,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGrupoFormaPago");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGrupoFormaPago");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAnticipoClienteBeanSwingJInternalFrame(List<TipoGrupoFormaPago> tipogrupoformapagos,TipoGrupoFormaPago tipogrupoformapago,AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//anticipoclienteBeanSwingJInternalFrame=new AnticipoClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					anticipoclienteBeanSwingJInternalFrame.getAnticipoClienteLogic().setConnexion(this.tipogrupoformapagoLogic.getConnexion());

					anticipoclienteBeanSwingJInternalFrame.settipogrupoformapagosForeignKey(tipogrupoformapagos);
					anticipoclienteBeanSwingJInternalFrame.settipogrupoformapagoForeignKey(tipogrupoformapago);
					anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(true);
					anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setlidTipoGrupoFormaPagoActual(tipogrupoformapago.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					anticipoclienteBeanSwingJInternalFrame.cargarCombosForeignKeyAnticipoCliente(anticipoclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					anticipoclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGrupoFormaPago(true);
					anticipoclienteBeanSwingJInternalFrame.setid_tipo_grupo_forma_pagoFK_IdTipoGrupoFormaPago(tipogrupoformapago.getId());

					if(!this.conCargarFormDetalle) {
						anticipoclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					anticipoclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGrupoFormaPagoForeignKey(tipogrupoformapago,1,false,true,true);
					anticipoclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					anticipoclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGrupoFormaPago");
					anticipoclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGrupoFormaPago");
					anticipoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnticipoCliente(true);
					anticipoclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAnticipoCliente("n",anticipoclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, anticipoclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					anticipoclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					anticipoclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						anticipoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsAnticipoCliente("relacionado");
					} else {
						anticipoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsAnticipoCliente("no_relacionado");
					}

					anticipoclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionAnticipoCliente().setVisible(false);

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
