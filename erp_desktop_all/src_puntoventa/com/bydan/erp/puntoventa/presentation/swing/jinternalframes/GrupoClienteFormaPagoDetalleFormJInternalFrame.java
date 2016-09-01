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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.GrupoClienteFormaPagoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class GrupoClienteFormaPagoDetalleFormJInternalFrame extends GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGrupoClienteFormaPago;
	
	protected JMenuBar jmenuBarDetalleGrupoClienteFormaPago;
	
	protected JMenu jmenuDetalleGrupoClienteFormaPago;
	protected JMenu jmenuDetalleArchivoGrupoClienteFormaPago;
	protected JMenu jmenuDetalleAccionesGrupoClienteFormaPago;
	protected JMenu jmenuDetalleDatosGrupoClienteFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoClienteFormaPago;	
	protected GridBagConstraints gridBagConstraintsGrupoClienteFormaPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleGrupoClienteFormaPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";
	
	public GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;	
	
	public GrupoClienteFormaPagoLogic grupoclienteformapagoLogic;
	
	public JScrollPane jScrollPanelDatosGrupoClienteFormaPago;
	public JScrollPane jScrollPanelDatosEdicionGrupoClienteFormaPago;
	public JScrollPane jScrollPanelDatosGeneralGrupoClienteFormaPago;
	
	protected JPanel jPanelCamposGrupoClienteFormaPago;    
	protected JPanel jPanelCamposOcultosGrupoClienteFormaPago;    	
	protected JPanel jPanelAccionesGrupoClienteFormaPago;
	protected JPanel jPanelAccionesFormularioGrupoClienteFormaPago;
    
	
	
	protected Integer iXPanelCamposGrupoClienteFormaPago=0;
	protected Integer iYPanelCamposGrupoClienteFormaPago=0;
	
	protected Integer iXPanelCamposOcultosGrupoClienteFormaPago=0;
	protected Integer iYPanelCamposOcultosGrupoClienteFormaPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGrupoClienteFormaPago;
	public JButton jButtonModificarGrupoClienteFormaPago;
	public JButton jButtonActualizarGrupoClienteFormaPago;
    public JButton jButtonEliminarGrupoClienteFormaPago;
	public JButton jButtonCancelarGrupoClienteFormaPago;
    public JButton jButtonGuardarCambiosGrupoClienteFormaPago;
	public JButton jButtonGuardarCambiosTablaGrupoClienteFormaPago;
	protected JButton jButtonCerrarGrupoClienteFormaPago;
	
	
	protected JButton jButtonProcesarInformacionGrupoClienteFormaPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGrupoClienteFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoClienteFormaPago;
	protected JButton jButtonModificarToolBarGrupoClienteFormaPago;
	protected JButton jButtonActualizarToolBarGrupoClienteFormaPago;
    protected JButton jButtonEliminarToolBarGrupoClienteFormaPago;
	protected JButton jButtonCancelarToolBarGrupoClienteFormaPago;
    protected JButton jButtonGuardarCambiosToolBarGrupoClienteFormaPago;
	protected JButton jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoClienteFormaPago;
	protected JButton jButtonCerrarToolBarGrupoClienteFormaPago;
	
	protected JButton jButtonProcesarInformacionToolBarGrupoClienteFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoClienteFormaPago;
	protected JMenuItem jMenuItemModificarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemActualizarGrupoClienteFormaPago;
    protected JMenuItem jMenuItemEliminarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemCancelarGrupoClienteFormaPago;
    protected JMenuItem jMenuItemGuardarCambiosGrupoClienteFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoClienteFormaPago;
	protected JMenuItem jMenuItemCerrarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoClienteFormaPago;
	
	protected JMenuItem jMenuItemProcesarInformacionGrupoClienteFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarGrupoClienteFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoClienteFormaPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoClienteFormaPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGrupoClienteFormaPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGrupoClienteFormaPago;
	public JLabel jLabelIdGrupoClienteFormaPago;
	public JLabel jLabelidGrupoClienteFormaPago;
	public JButton jButtonidGrupoClienteFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGrupoClienteFormaPago;
	public JLabel jLabelid_empresaGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGrupoClienteFormaPago;
	public JButton jButtonid_empresaGrupoClienteFormaPago= new JButtonMe();
	public JButton jButtonid_empresaGrupoClienteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaGrupoClienteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteGrupoClienteFormaPago;
	public JLabel jLabelid_grupo_clienteGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteGrupoClienteFormaPago;
	public JButton jButtonid_grupo_clienteGrupoClienteFormaPago= new JButtonMe();
	public JButton jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoGrupoClienteFormaPago;
	public JLabel jLabelid_tipo_forma_pagoGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago;
	public JButton jButtonid_tipo_forma_pagoGrupoClienteFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGrupoClienteFormaPago;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GrupoClienteFormaPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGrupoClienteFormaPago=new JPanel();
				this.jPanelAccionesFormularioGrupoClienteFormaPago=new JPanel();
				this.jmenuBarDetalleGrupoClienteFormaPago=new JMenuBar();
				this.jTtoolBarDetalleGrupoClienteFormaPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GrupoClienteFormaPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGrupoClienteFormaPago() {
		return this.jButtonActualizarToolBarGrupoClienteFormaPago;
	}
	
	public JButton getjButtonEliminarToolBarGrupoClienteFormaPago() {
		return this.jButtonEliminarToolBarGrupoClienteFormaPago;
	}
	
	public JButton getjButtonCancelarToolBarGrupoClienteFormaPago() {
		return this.jButtonCancelarToolBarGrupoClienteFormaPago;
	}		
	
	public JButton getjButtonProcesarInformacionGrupoClienteFormaPago() {
		return this.jButtonProcesarInformacionGrupoClienteFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoClienteFormaPago)	{
		this.jButtonProcesarInformacionGrupoClienteFormaPago = jButtonProcesarInformacionGrupoClienteFormaPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoClienteFormaPago() {
		return this.jComboBoxTiposAccionesGrupoClienteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposRelacionesGrupoClienteFormaPago) {
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago = jComboBoxTiposRelacionesGrupoClienteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposAccionesGrupoClienteFormaPago) {
		this.jComboBoxTiposAccionesGrupoClienteFormaPago = jComboBoxTiposAccionesGrupoClienteFormaPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGrupoClienteFormaPago() {
		return this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGrupoClienteFormaPago(
			JComboBox jComboBoxTiposAccionesFormularioGrupoClienteFormaPago) {
		this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago = jComboBoxTiposAccionesFormularioGrupoClienteFormaPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		
		this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoClienteFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Cliente Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
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
	
		GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoClienteFormaPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGrupoClienteFormaPago=new JButtonMe();
				this.jButtonModificarToolBarGrupoClienteFormaPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGrupoClienteFormaPago,this.jTtoolBarDetalleGrupoClienteFormaPago,
							"actualizar","actualizar","Actualizar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGrupoClienteFormaPago,this.jTtoolBarDetalleGrupoClienteFormaPago,
							"eliminar","eliminar","Eliminar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGrupoClienteFormaPago,this.jTtoolBarDetalleGrupoClienteFormaPago,
							"cancelar","cancelar","Cancelar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGrupoClienteFormaPago,this.jTtoolBarDetalleGrupoClienteFormaPago,
							"guardarcambios","guardarcambios","Guardar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGrupoClienteFormaPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGrupoClienteFormaPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGrupoClienteFormaPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGrupoClienteFormaPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGrupoClienteFormaPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoClienteFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoClienteFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoClienteFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGrupoClienteFormaPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGrupoClienteFormaPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGrupoClienteFormaPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGrupoClienteFormaPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGrupoClienteFormaPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGrupoClienteFormaPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGrupoClienteFormaPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGrupoClienteFormaPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGrupoClienteFormaPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGrupoClienteFormaPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGrupoClienteFormaPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGrupoClienteFormaPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGrupoClienteFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoClienteFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoClienteFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoClienteFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoClienteFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoClienteFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGrupoClienteFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGrupoClienteFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGrupoClienteFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoClienteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoClienteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoClienteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGrupoClienteFormaPago.add(this.jMenuItemDetalleCerrarGrupoClienteFormaPago);
		
		this.jmenuDetalleAccionesGrupoClienteFormaPago.add(this.jMenuItemActualizarGrupoClienteFormaPago);
		this.jmenuDetalleAccionesGrupoClienteFormaPago.add(this.jMenuItemEliminarGrupoClienteFormaPago);
		this.jmenuDetalleAccionesGrupoClienteFormaPago.add(this.jMenuItemCancelarGrupoClienteFormaPago);		
		
		//this.jmenuDetalleDatosGrupoClienteFormaPago.add(this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago);				
		this.jmenuDetalleDatosGrupoClienteFormaPago.add(this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago);				
				
		//this.jmenuDetalleAccionesGrupoClienteFormaPago.add(this.jMenuItemGuardarCambiosGrupoClienteFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGrupoClienteFormaPago.add(this.jmenuDetalleArchivoGrupoClienteFormaPago);		
		this.jmenuBarDetalleGrupoClienteFormaPago.add(this.jmenuDetalleAccionesGrupoClienteFormaPago);		
		this.jmenuBarDetalleGrupoClienteFormaPago.add(this.jmenuDetalleDatosGrupoClienteFormaPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGrupoClienteFormaPago);				
	}
	
	
	public void inicializarElementosCamposGrupoClienteFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGrupoClienteFormaPago = new JLabelMe();
		jLabelIdGrupoClienteFormaPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGrupoClienteFormaPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGrupoClienteFormaPago.setToolTipText(GrupoClienteFormaPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGrupoClienteFormaPago= new GridBagLayout();

		this.jPanelidGrupoClienteFormaPago.setLayout(this.gridaBagLayoutGrupoClienteFormaPago);

		jLabelidGrupoClienteFormaPago = new JLabel();
		jLabelidGrupoClienteFormaPago.setText("Id");

		jLabelidGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysGrupoClienteFormaPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGrupoClienteFormaPago = new JLabelMe();
		this.jLabelid_empresaGrupoClienteFormaPago.setText(""+GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGrupoClienteFormaPago.setToolTipText("Empresa");
		this.jLabelid_empresaGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGrupoClienteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGrupoClienteFormaPago.setToolTipText(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGrupoClienteFormaPago = new GridBagLayout();
		this.jPanelid_empresaGrupoClienteFormaPago.setLayout(this.gridaBagLayoutGrupoClienteFormaPago);


		jComboBoxid_empresaGrupoClienteFormaPago= new JComboBoxMe();
		jComboBoxid_empresaGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGrupoClienteFormaPago.setEnabled(false);

		this.jButtonid_empresaGrupoClienteFormaPago= new JButtonMe();
		this.jButtonid_empresaGrupoClienteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoClienteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoClienteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoClienteFormaPago.setText("Buscar");
		this.jButtonid_empresaGrupoClienteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGrupoClienteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoClienteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoClienteFormaPago"));

		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setText("U");
		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoClienteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoClienteFormaPagoBusqueda"));

		if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGrupoClienteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaGrupoClienteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_empresaGrupoClienteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoClienteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoClienteFormaPagoUpdate.setText("U");
		this.jButtonid_empresaGrupoClienteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGrupoClienteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoClienteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoClienteFormaPagoUpdate"));



					
		this.jLabelid_grupo_clienteGrupoClienteFormaPago = new JLabelMe();
		this.jLabelid_grupo_clienteGrupoClienteFormaPago.setText(""+GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteGrupoClienteFormaPago.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteGrupoClienteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteGrupoClienteFormaPago.setToolTipText(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutGrupoClienteFormaPago = new GridBagLayout();
		this.jPanelid_grupo_clienteGrupoClienteFormaPago.setLayout(this.gridaBagLayoutGrupoClienteFormaPago);


		jComboBoxid_grupo_clienteGrupoClienteFormaPago= new JComboBoxMe();
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteGrupoClienteFormaPago= new JButtonMe();
		this.jButtonid_grupo_clienteGrupoClienteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteGrupoClienteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteGrupoClienteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteGrupoClienteFormaPago.setText("Buscar");
		this.jButtonid_grupo_clienteGrupoClienteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteGrupoClienteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteGrupoClienteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteGrupoClienteFormaPago"));

		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setText("U");
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteGrupoClienteFormaPagoBusqueda"));

		if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.setText("U");
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteGrupoClienteFormaPagoUpdate"));



					
		this.jLabelid_tipo_forma_pagoGrupoClienteFormaPago = new JLabelMe();
		this.jLabelid_tipo_forma_pagoGrupoClienteFormaPago.setText(""+GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoGrupoClienteFormaPago.setToolTipText("T. Forma Pago");
		this.jLabelid_tipo_forma_pagoGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_forma_pagoGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_forma_pagoGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.setToolTipText(GrupoClienteFormaPagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutGrupoClienteFormaPago = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.setLayout(this.gridaBagLayoutGrupoClienteFormaPago);


		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago= new JButtonMe();
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago.setText("Buscar");
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoGrupoClienteFormaPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoGrupoClienteFormaPago"));

		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoGrupoClienteFormaPagoBusqueda"));

		if(this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoGrupoClienteFormaPagoUpdate"));



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
		//this.jInternalFrameDetalleGrupoClienteFormaPago = new GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Grupo Cliente Forma Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoClienteFormaPago= new GridBagLayout();
		

		
		String sToolTipGrupoClienteFormaPago="";
		sToolTipGrupoClienteFormaPago=GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoClienteFormaPago+="(PuntoVenta.GrupoClienteFormaPago)";
		}
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoClienteFormaPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGrupoClienteFormaPago = new JButtonMe();
		this.jButtonModificarGrupoClienteFormaPago = new JButtonMe();
        this.jButtonActualizarGrupoClienteFormaPago = new JButtonMe();
        this.jButtonEliminarGrupoClienteFormaPago = new JButtonMe();
        this.jButtonCancelarGrupoClienteFormaPago = new JButtonMe();
        this.jButtonGuardarCambiosGrupoClienteFormaPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago = new JButtonMe();
		this.jButtonCerrarGrupoClienteFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosGrupoClienteFormaPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionGrupoClienteFormaPago = new JScrollPane();
		this.jScrollPanelDatosGeneralGrupoClienteFormaPago = new JScrollPane();
				
		
		
		this.jPanelCamposGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Cliente Forma Pago";
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Cliente Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoClienteFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGrupoClienteFormaPago.setName("jPanelCamposGrupoClienteFormaPago"); 

		this.jPanelCamposOcultosGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGrupoClienteFormaPago.setName("jPanelCamposOcultosGrupoClienteFormaPago"); 

        this.jPanelAccionesGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoClienteFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesGrupoClienteFormaPago.setName("Acciones"); 

		this.jPanelAccionesFormularioGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGrupoClienteFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGrupoClienteFormaPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGrupoClienteFormaPago.setText("Nuevo");
		this.jButtonModificarGrupoClienteFormaPago.setText("Editar");
        this.jButtonActualizarGrupoClienteFormaPago.setText("Actualizar");
        this.jButtonEliminarGrupoClienteFormaPago.setText("Eliminar");
        this.jButtonCancelarGrupoClienteFormaPago.setText("Cancelar");
        this.jButtonGuardarCambiosGrupoClienteFormaPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.setText("Guardar");
		this.jButtonCerrarGrupoClienteFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoClienteFormaPago,"nuevo_button","Nuevo",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGrupoClienteFormaPago,"modificar_button","Editar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGrupoClienteFormaPago,"actualizar_button","Actualizar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGrupoClienteFormaPago,"eliminar_button","Eliminar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGrupoClienteFormaPago,"cancelar_button","Cancelar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGrupoClienteFormaPago,"guardarcambios_button","Guardar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoClienteFormaPago,"guardarcambiostabla_button","Guardar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoClienteFormaPago,"cerrar_button","Salir",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGrupoClienteFormaPago.setToolTipText("Nuevo"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGrupoClienteFormaPago.setToolTipText("Editar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGrupoClienteFormaPago.setToolTipText("Actualizar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGrupoClienteFormaPago.setToolTipText("Eliminar)"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGrupoClienteFormaPago.setToolTipText("Cancelar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGrupoClienteFormaPago.setToolTipText("Guardar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.setToolTipText("Guardar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoClienteFormaPago.setToolTipText("Salir"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoClienteFormaPago";
		inputMap = this.jButtonNuevoGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoClienteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoClienteFormaPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGrupoClienteFormaPago";
		inputMap = this.jButtonActualizarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGrupoClienteFormaPago"));
		
		//ELIMINAR
		sMapKey = "EliminarGrupoClienteFormaPago";
		inputMap = this.jButtonEliminarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGrupoClienteFormaPago"));
		
		//CANCELAR	
		sMapKey = "CancelarGrupoClienteFormaPago";
		inputMap = this.jButtonCancelarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGrupoClienteFormaPago"));
		
		//CERRAR		
		sMapKey = "CerrarGrupoClienteFormaPago";
		inputMap = this.jButtonCerrarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoClienteFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoClienteFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoClienteFormaPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGrupoClienteFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGrupoClienteFormaPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGrupoClienteFormaPago.setToolTipText("Nuevo GrupoClienteFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago.setToolTipText("Sin Cerrar Ventana GrupoClienteFormaPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoClienteFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGrupoClienteFormaPago = new JLabelMe();
		
		this.jLabelAccionesGrupoClienteFormaPago.setText("Acciones");		
		this.jLabelAccionesGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGrupoClienteFormaPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGrupoClienteFormaPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGrupoClienteFormaPago=new JTabbedPane();
		this.jTabbedPaneRelacionesGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGrupoClienteFormaPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGrupoClienteFormaPago = new GridBagLayout();
		
		this.jPanelCamposGrupoClienteFormaPago.setLayout(gridaBagLayoutCamposGrupoClienteFormaPago);
		this.jPanelCamposOcultosGrupoClienteFormaPago.setLayout(gridaBagLayoutCamposOcultosGrupoClienteFormaPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGrupoClienteFormaPago.add(jLabelIdGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 1;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGrupoClienteFormaPago.add(jLabelidGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);


	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGrupoClienteFormaPago.add(jLabelid_empresaGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 2;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoClienteFormaPago.add(jButtonid_empresaGrupoClienteFormaPagoBusqueda, this.gridBagConstraintsGrupoClienteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 3;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoClienteFormaPago.add(jButtonid_empresaGrupoClienteFormaPagoUpdate, this.gridBagConstraintsGrupoClienteFormaPago);
	}

	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 1;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGrupoClienteFormaPago.add(jComboBoxid_empresaGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);


	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteGrupoClienteFormaPago.add(jLabelid_grupo_clienteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 2;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteGrupoClienteFormaPago.add(jButtonid_grupo_clienteGrupoClienteFormaPagoBusqueda, this.gridBagConstraintsGrupoClienteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 3;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteGrupoClienteFormaPago.add(jButtonid_grupo_clienteGrupoClienteFormaPagoUpdate, this.gridBagConstraintsGrupoClienteFormaPago);
	}

	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 1;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteGrupoClienteFormaPago.add(jComboBoxid_grupo_clienteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);


	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.add(jLabelid_tipo_forma_pagoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 2;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.add(jButtonid_tipo_forma_pagoGrupoClienteFormaPagoBusqueda, this.gridBagConstraintsGrupoClienteFormaPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 3;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.add(jButtonid_tipo_forma_pagoGrupoClienteFormaPagoUpdate, this.gridBagConstraintsGrupoClienteFormaPago);
	}

	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = 1;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago.add(jComboBoxid_tipo_forma_pagoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = iYPanelCamposGrupoClienteFormaPago;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = iXPanelCamposGrupoClienteFormaPago++;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoClienteFormaPago.add(this.jPanelidGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(iXPanelCamposGrupoClienteFormaPago % 1==0) {
		iXPanelCamposGrupoClienteFormaPago=0;
		iYPanelCamposGrupoClienteFormaPago++;
	}
	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = iYPanelCamposGrupoClienteFormaPago;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = iXPanelCamposGrupoClienteFormaPago++;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoClienteFormaPago.add(this.jPanelid_grupo_clienteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(iXPanelCamposGrupoClienteFormaPago % 1==0) {
		iXPanelCamposGrupoClienteFormaPago=0;
		iYPanelCamposGrupoClienteFormaPago++;
	}
	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = iYPanelCamposGrupoClienteFormaPago;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = iXPanelCamposGrupoClienteFormaPago++;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoClienteFormaPago.add(this.jPanelid_tipo_forma_pagoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(iXPanelCamposGrupoClienteFormaPago % 1==0) {
		iXPanelCamposGrupoClienteFormaPago=0;
		iYPanelCamposGrupoClienteFormaPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoClienteFormaPago.gridy = iYPanelCamposOcultosGrupoClienteFormaPago;
	this.gridBagConstraintsGrupoClienteFormaPago.gridx = iXPanelCamposOcultosGrupoClienteFormaPago++;
	this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoClienteFormaPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoClienteFormaPago.add(this.jPanelid_empresaGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);



	if(iXPanelCamposOcultosGrupoClienteFormaPago % 1==0) {
		iXPanelCamposOcultosGrupoClienteFormaPago=0;
		iYPanelCamposOcultosGrupoClienteFormaPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesGrupoClienteFormaPago= new GridBagLayout();
		this.jPanelAccionesGrupoClienteFormaPago.setLayout(gridaBagLayoutAccionesGrupoClienteFormaPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGrupoClienteFormaPago= new GridBagLayout();
		this.jPanelAccionesFormularioGrupoClienteFormaPago.setLayout(gridaBagLayoutAccionesFormularioGrupoClienteFormaPago);
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoClienteFormaPago.add(this.jComboBoxTiposAccionesFormularioGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoClienteFormaPago.add(this.jCheckBoxPostAccionNuevoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoClienteFormaPago.add(this.jCheckBoxPostAccionSinCerrarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.grupoclienteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoClienteFormaPago.add(this.jCheckBoxPostAccionSinMensajeGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesGrupoClienteFormaPago.add(this.jButtonModificarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);							

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesGrupoClienteFormaPago.add(this.jButtonEliminarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
			
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoClienteFormaPago.add(this.jButtonActualizarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);


		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoClienteFormaPago.add(this.jButtonGuardarCambiosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);	
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesGrupoClienteFormaPago.add(this.jButtonCancelarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoClienteFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoClienteFormaPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;		
			//this.gridBagConstraintsGrupoClienteFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =0;
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoClienteFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGrupoClienteFormaPago = new GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Grupo Cliente Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Grupo Cliente Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Cliente Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GrupoClienteFormaPagoModel grupoclienteformapagoModel=new GrupoClienteFormaPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//GrupoClienteFormaPagoModel.GrupoClienteFormaPagoFocusTraversalPolicy grupoclienteformapagoFocusTraversalPolicy = grupoclienteformapagoModel.new GrupoClienteFormaPagoFocusTraversalPolicy(this);
			
			//grupoclienteformapagoFocusTraversalPolicy.setgrupoclienteformapagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(grupoclienteformapagoModel);
			
			
			this.jContentPaneDetalleGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGrupoClienteFormaPago = new GridBagLayout();	
			this.jContentPaneDetalleGrupoClienteFormaPago.setLayout(gridaBagLayoutDetalleGrupoClienteFormaPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoClienteFormaPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
				this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
					
				
				this.jContentPaneDetalleGrupoClienteFormaPago.add(jTtoolBarDetalleGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);								
				
}
			
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago=   new JScrollPane(jContentPaneDetalleGrupoClienteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	        
			this.jContentPaneDetalleGrupoClienteFormaPago.add(jPanelCamposGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);
			
			
			
			
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
						&& grupoclienteformapagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGrupoClienteFormaPago= new GridBagConstraints();
						this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
						this.jContentPaneDetalleGrupoClienteFormaPago.add(this.jTabbedPaneRelacionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGrupoClienteFormaPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGrupoClienteFormaPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
					this.gridBagConstraintsGrupoClienteFormaPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
					
				
					this.jContentPaneDetalleGrupoClienteFormaPago.add(jPanelCamposOcultosGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);
				
					this.jPanelCamposOcultosGrupoClienteFormaPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	        this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGrupoClienteFormaPago.add(this.jPanelAccionesFormularioGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);							
			
			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
	        this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
	        
			
			this.jContentPaneDetalleGrupoClienteFormaPago.add(this.jPanelAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGrupoClienteFormaPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago=   new JScrollPane(this.jPanelCamposGrupoClienteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGrupoClienteFormaPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
			
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
			
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGrupoClienteFormaPago;//jContentPane;
		
		return jScrollPanelDatosEdicionGrupoClienteFormaPago;
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
