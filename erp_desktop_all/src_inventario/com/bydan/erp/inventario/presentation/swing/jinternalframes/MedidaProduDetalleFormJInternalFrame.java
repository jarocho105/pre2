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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.MedidaProduConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class MedidaProduDetalleFormJInternalFrame extends MedidaProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMedidaProdu;
	
	protected JMenuBar jmenuBarDetalleMedidaProdu;
	
	protected JMenu jmenuDetalleMedidaProdu;
	protected JMenu jmenuDetalleArchivoMedidaProdu;
	protected JMenu jmenuDetalleAccionesMedidaProdu;
	protected JMenu jmenuDetalleDatosMedidaProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMedidaProdu;	
	protected GridBagConstraints gridBagConstraintsMedidaProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MedidaProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleMedidaProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public MedidaProduSessionBean medidaproduSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public MedidaProduLogic medidaproduLogic;
	
	public JScrollPane jScrollPanelDatosMedidaProdu;
	public JScrollPane jScrollPanelDatosEdicionMedidaProdu;
	public JScrollPane jScrollPanelDatosGeneralMedidaProdu;
	
	protected JPanel jPanelCamposMedidaProdu;    
	protected JPanel jPanelCamposOcultosMedidaProdu;    	
	protected JPanel jPanelAccionesMedidaProdu;
	protected JPanel jPanelAccionesFormularioMedidaProdu;
    
	
	
	protected Integer iXPanelCamposMedidaProdu=0;
	protected Integer iYPanelCamposMedidaProdu=0;
	
	protected Integer iXPanelCamposOcultosMedidaProdu=0;
	protected Integer iYPanelCamposOcultosMedidaProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMedidaProdu;
	public JButton jButtonModificarMedidaProdu;
	public JButton jButtonActualizarMedidaProdu;
    public JButton jButtonEliminarMedidaProdu;
	public JButton jButtonCancelarMedidaProdu;
    public JButton jButtonGuardarCambiosMedidaProdu;
	public JButton jButtonGuardarCambiosTablaMedidaProdu;
	protected JButton jButtonCerrarMedidaProdu;
	
	
	protected JButton jButtonProcesarInformacionMedidaProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMedidaProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMedidaProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMedidaProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMedidaProdu;
	protected JButton jButtonModificarToolBarMedidaProdu;
	protected JButton jButtonActualizarToolBarMedidaProdu;
    protected JButton jButtonEliminarToolBarMedidaProdu;
	protected JButton jButtonCancelarToolBarMedidaProdu;
    protected JButton jButtonGuardarCambiosToolBarMedidaProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarMedidaProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarMedidaProdu;
	protected JButton jButtonCerrarToolBarMedidaProdu;
	
	protected JButton jButtonProcesarInformacionToolBarMedidaProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMedidaProdu;
	protected JMenuItem jMenuItemModificarMedidaProdu;
	protected JMenuItem jMenuItemActualizarMedidaProdu;
    protected JMenuItem jMenuItemEliminarMedidaProdu;
	protected JMenuItem jMenuItemCancelarMedidaProdu;
    protected JMenuItem jMenuItemGuardarCambiosMedidaProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaMedidaProdu;
	protected JMenuItem jMenuItemCerrarMedidaProdu;
	protected JMenuItem jMenuItemDetalleCerrarMedidaProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarMedidaProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionMedidaProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMedidaProdu;
	protected JMenuItem jMenuItemMostrarOcultarMedidaProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMedidaProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMedidaProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMedidaProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMedidaProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMedidaProdu;
	public JLabel jLabelIdMedidaProdu;
	public JLabel jLabelidMedidaProdu;
	public JButton jButtonidMedidaProduBusqueda= new JButtonMe();

	public JPanel jPanelnombreMedidaProdu;
	public JLabel jLabelnombreMedidaProdu;
	public JTextArea jTextAreanombreMedidaProdu;
	public JScrollPane jscrollPanenombreMedidaProdu;
	public JButton jButtonnombreMedidaProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMedidaProdu;
	public JLabel jLabelid_empresaMedidaProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMedidaProdu;
	public JButton jButtonid_empresaMedidaProdu= new JButtonMe();
	public JButton jButtonid_empresaMedidaProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaMedidaProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMedidaProdu;
	
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
	
	public MedidaProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMedidaProdu=new JPanel();
				this.jPanelAccionesFormularioMedidaProdu=new JPanel();
				this.jmenuBarDetalleMedidaProdu=new JMenuBar();
				this.jTtoolBarDetalleMedidaProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MedidaProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MedidaProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MedidaProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMedidaProdu() {
		return this.jButtonActualizarToolBarMedidaProdu;
	}
	
	public JButton getjButtonEliminarToolBarMedidaProdu() {
		return this.jButtonEliminarToolBarMedidaProdu;
	}
	
	public JButton getjButtonCancelarToolBarMedidaProdu() {
		return this.jButtonCancelarToolBarMedidaProdu;
	}		
	
	public JButton getjButtonProcesarInformacionMedidaProdu() {
		return this.jButtonProcesarInformacionMedidaProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMedidaProdu)	{
		this.jButtonProcesarInformacionMedidaProdu = jButtonProcesarInformacionMedidaProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMedidaProdu() {
		return this.jComboBoxTiposAccionesMedidaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMedidaProdu(
			JComboBox jComboBoxTiposRelacionesMedidaProdu) {
		this.jComboBoxTiposRelacionesMedidaProdu = jComboBoxTiposRelacionesMedidaProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMedidaProdu(
			JComboBox jComboBoxTiposAccionesMedidaProdu) {
		this.jComboBoxTiposAccionesMedidaProdu = jComboBoxTiposAccionesMedidaProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMedidaProdu() {
		return this.jComboBoxTiposAccionesFormularioMedidaProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMedidaProdu(
			JComboBox jComboBoxTiposAccionesFormularioMedidaProdu) {
		this.jComboBoxTiposAccionesFormularioMedidaProdu = jComboBoxTiposAccionesFormularioMedidaProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.medidaproduSessionBean=new MedidaProduSessionBean();
		
		this.medidaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.medidaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.medidaproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MedidaProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MedidaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MedidaProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Medida Produ MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
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
	
		MedidaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMedidaProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMedidaProdu=new JButtonMe();
				this.jButtonModificarToolBarMedidaProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMedidaProdu,this.jTtoolBarDetalleMedidaProdu,
							"actualizar","actualizar","Actualizar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMedidaProdu,this.jTtoolBarDetalleMedidaProdu,
							"eliminar","eliminar","Eliminar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMedidaProdu,this.jTtoolBarDetalleMedidaProdu,
							"cancelar","cancelar","Cancelar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMedidaProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMedidaProdu,this.jTtoolBarDetalleMedidaProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMedidaProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMedidaProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMedidaProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMedidaProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMedidaProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMedidaProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMedidaProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMedidaProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMedidaProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMedidaProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMedidaProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMedidaProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMedidaProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMedidaProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMedidaProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMedidaProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMedidaProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMedidaProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMedidaProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMedidaProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMedidaProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMedidaProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMedidaProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMedidaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMedidaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMedidaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMedidaProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMedidaProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMedidaProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMedidaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMedidaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMedidaProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMedidaProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMedidaProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMedidaProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMedidaProdu.add(this.jMenuItemDetalleCerrarMedidaProdu);
		
		this.jmenuDetalleAccionesMedidaProdu.add(this.jMenuItemActualizarMedidaProdu);
		this.jmenuDetalleAccionesMedidaProdu.add(this.jMenuItemEliminarMedidaProdu);
		this.jmenuDetalleAccionesMedidaProdu.add(this.jMenuItemCancelarMedidaProdu);		
		
		//this.jmenuDetalleDatosMedidaProdu.add(this.jMenuItemDetalleAbrirOrderByMedidaProdu);				
		this.jmenuDetalleDatosMedidaProdu.add(this.jMenuItemDetalleMostarOcultarMedidaProdu);				
				
		//this.jmenuDetalleAccionesMedidaProdu.add(this.jMenuItemGuardarCambiosMedidaProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMedidaProdu.add(this.jmenuDetalleArchivoMedidaProdu);		
		this.jmenuBarDetalleMedidaProdu.add(this.jmenuDetalleAccionesMedidaProdu);		
		this.jmenuBarDetalleMedidaProdu.add(this.jmenuDetalleDatosMedidaProdu);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMedidaProdu);				
	}
	
	
	public void inicializarElementosCamposMedidaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMedidaProdu = new JLabelMe();
		jLabelIdMedidaProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMedidaProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMedidaProdu.setToolTipText(MedidaProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMedidaProdu= new GridBagLayout();

		this.jPanelidMedidaProdu.setLayout(this.gridaBagLayoutMedidaProdu);

		jLabelidMedidaProdu = new JLabel();
		jLabelidMedidaProdu.setText("Id");

		jLabelidMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreMedidaProdu = new JLabelMe();
		this.jLabelnombreMedidaProdu.setText(""+MedidaProduConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMedidaProdu.setToolTipText("Nombre");
		this.jLabelnombreMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMedidaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMedidaProdu.setToolTipText(MedidaProduConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMedidaProdu = new GridBagLayout();
		this.jPanelnombreMedidaProdu.setLayout(this.gridaBagLayoutMedidaProdu);


		jTextAreanombreMedidaProdu= new JTextAreaMe();
		jTextAreanombreMedidaProdu.setEnabled(false);
		jTextAreanombreMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMedidaProdu.setLineWrap(true);
		jTextAreanombreMedidaProdu.setWrapStyleWord(true);
		jTextAreanombreMedidaProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreMedidaProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreMedidaProdu = new JScrollPane(jTextAreanombreMedidaProdu);
		jscrollPanenombreMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreMedidaProduBusqueda= new JButtonMe();
		this.jButtonnombreMedidaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMedidaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMedidaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMedidaProduBusqueda.setText("U");
		this.jButtonnombreMedidaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMedidaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMedidaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMedidaProduBusqueda"));

		if(this.medidaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMedidaProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMedidaProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMedidaProdu = new JLabelMe();
		this.jLabelid_empresaMedidaProdu.setText(""+MedidaProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMedidaProdu.setToolTipText("Empresa");
		this.jLabelid_empresaMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMedidaProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMedidaProdu.setToolTipText(MedidaProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMedidaProdu = new GridBagLayout();
		this.jPanelid_empresaMedidaProdu.setLayout(this.gridaBagLayoutMedidaProdu);


		jComboBoxid_empresaMedidaProdu= new JComboBoxMe();
		jComboBoxid_empresaMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMedidaProdu.setEnabled(false);

		this.jButtonid_empresaMedidaProdu= new JButtonMe();
		this.jButtonid_empresaMedidaProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMedidaProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMedidaProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMedidaProdu.setText("Buscar");
		this.jButtonid_empresaMedidaProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMedidaProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMedidaProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMedidaProdu"));

		this.jButtonid_empresaMedidaProduBusqueda= new JButtonMe();
		this.jButtonid_empresaMedidaProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMedidaProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMedidaProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMedidaProduBusqueda.setText("U");
		this.jButtonid_empresaMedidaProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMedidaProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMedidaProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMedidaProduBusqueda"));

		if(this.medidaproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMedidaProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaMedidaProduUpdate= new JButtonMe();
		this.jButtonid_empresaMedidaProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMedidaProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMedidaProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMedidaProduUpdate.setText("U");
		this.jButtonid_empresaMedidaProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMedidaProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMedidaProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMedidaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMedidaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMedidaProduUpdate"));



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
		//this.jInternalFrameDetalleMedidaProdu = new MedidaProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Medida Produ DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMedidaProdu= new GridBagLayout();
		

		
		String sToolTipMedidaProdu="";
		sToolTipMedidaProdu=MedidaProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMedidaProdu+="(Inventario.MedidaProdu)";
		}
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipMedidaProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMedidaProdu = new JButtonMe();
		this.jButtonModificarMedidaProdu = new JButtonMe();
        this.jButtonActualizarMedidaProdu = new JButtonMe();
        this.jButtonEliminarMedidaProdu = new JButtonMe();
        this.jButtonCancelarMedidaProdu = new JButtonMe();
        this.jButtonGuardarCambiosMedidaProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaMedidaProdu = new JButtonMe();
		this.jButtonCerrarMedidaProdu = new JButtonMe();
		
		this.jScrollPanelDatosMedidaProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionMedidaProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralMedidaProdu = new JScrollPane();
				
		
		
		this.jPanelCamposMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Medida Produ";
		
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Medida Produs" + this.sPath));
		} else {
			this.jScrollPanelDatosMedidaProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMedidaProdu.setName("jPanelCamposMedidaProdu"); 

		this.jPanelCamposOcultosMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMedidaProdu.setName("jPanelCamposOcultosMedidaProdu"); 

        this.jPanelAccionesMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMedidaProdu.setToolTipText("Acciones");
        this.jPanelAccionesMedidaProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMedidaProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMedidaProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMedidaProdu.setText("Nuevo");
		this.jButtonModificarMedidaProdu.setText("Editar");
        this.jButtonActualizarMedidaProdu.setText("Actualizar");
        this.jButtonEliminarMedidaProdu.setText("Eliminar");
        this.jButtonCancelarMedidaProdu.setText("Cancelar");
        this.jButtonGuardarCambiosMedidaProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaMedidaProdu.setText("Guardar");
		this.jButtonCerrarMedidaProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMedidaProdu,"nuevo_button","Nuevo",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMedidaProdu,"modificar_button","Editar",this.medidaproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMedidaProdu,"actualizar_button","Actualizar",this.medidaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMedidaProdu,"eliminar_button","Eliminar",this.medidaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMedidaProdu,"cancelar_button","Cancelar",this.medidaproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMedidaProdu,"guardarcambios_button","Guardar",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMedidaProdu,"guardarcambiostabla_button","Guardar",this.medidaproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMedidaProdu,"cerrar_button","Salir",this.medidaproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMedidaProdu.setToolTipText("Nuevo"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMedidaProdu.setToolTipText("Editar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMedidaProdu.setToolTipText("Actualizar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMedidaProdu.setToolTipText("Eliminar)"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMedidaProdu.setToolTipText("Cancelar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMedidaProdu.setToolTipText("Guardar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMedidaProdu.setToolTipText("Guardar"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMedidaProdu.setToolTipText("Salir"+" "+MedidaProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMedidaProdu";
		inputMap = this.jButtonNuevoMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMedidaProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMedidaProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMedidaProdu";
		inputMap = this.jButtonActualizarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMedidaProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarMedidaProdu";
		inputMap = this.jButtonEliminarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMedidaProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarMedidaProdu";
		inputMap = this.jButtonCancelarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMedidaProdu"));
		
		//CERRAR		
		sMapKey = "CerrarMedidaProdu";
		inputMap = this.jButtonCerrarMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMedidaProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMedidaProdu";
		inputMap = this.jButtonGuardarCambiosTablaMedidaProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMedidaProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMedidaProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMedidaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMedidaProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMedidaProdu.setToolTipText("Nuevo MedidaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMedidaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMedidaProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMedidaProdu.setToolTipText("Sin Cerrar Ventana MedidaProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMedidaProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMedidaProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMedidaProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMedidaProdu.setText("Accion");
		this.jComboBoxTiposAccionesMedidaProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMedidaProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMedidaProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMedidaProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMedidaProdu = new JLabelMe();
		
		this.jLabelAccionesMedidaProdu.setText("Acciones");		
		this.jLabelAccionesMedidaProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMedidaProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMedidaProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMedidaProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMedidaProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMedidaProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesMedidaProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMedidaProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMedidaProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMedidaProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMedidaProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMedidaProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMedidaProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMedidaProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMedidaProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMedidaProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMedidaProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMedidaProdu = new GridBagLayout();
		
		this.jPanelCamposMedidaProdu.setLayout(gridaBagLayoutCamposMedidaProdu);
		this.jPanelCamposOcultosMedidaProdu.setLayout(gridaBagLayoutCamposOcultosMedidaProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMedidaProdu.gridy = 0;
	this.gridBagConstraintsMedidaProdu.gridx = 0;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMedidaProdu.add(jLabelIdMedidaProdu, this.gridBagConstraintsMedidaProdu);



	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMedidaProdu.gridy = 0;
	this.gridBagConstraintsMedidaProdu.gridx = 1;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMedidaProdu.add(jLabelidMedidaProdu, this.gridBagConstraintsMedidaProdu);


	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMedidaProdu.gridy = 0;
	this.gridBagConstraintsMedidaProdu.gridx = 0;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMedidaProdu.add(jLabelid_empresaMedidaProdu, this.gridBagConstraintsMedidaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		//this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = 0;
		this.gridBagConstraintsMedidaProdu.gridx = 2;
		this.gridBagConstraintsMedidaProdu.ipadx = 0;
		this.gridBagConstraintsMedidaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMedidaProdu.add(jButtonid_empresaMedidaProduBusqueda, this.gridBagConstraintsMedidaProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		//this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = 0;
		this.gridBagConstraintsMedidaProdu.gridx = 3;
		this.gridBagConstraintsMedidaProdu.ipadx = 0;
		this.gridBagConstraintsMedidaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMedidaProdu.add(jButtonid_empresaMedidaProduUpdate, this.gridBagConstraintsMedidaProdu);
	}

	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMedidaProdu.gridy = 0;
	this.gridBagConstraintsMedidaProdu.gridx = 1;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMedidaProdu.add(jComboBoxid_empresaMedidaProdu, this.gridBagConstraintsMedidaProdu);


	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMedidaProdu.gridy = 0;
	this.gridBagConstraintsMedidaProdu.gridx = 0;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMedidaProdu.add(jLabelnombreMedidaProdu, this.gridBagConstraintsMedidaProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		//this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMedidaProdu.gridy = 0;
		this.gridBagConstraintsMedidaProdu.gridx = 2;
		this.gridBagConstraintsMedidaProdu.ipadx = 0;
		this.gridBagConstraintsMedidaProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMedidaProdu.add(jButtonnombreMedidaProduBusqueda, this.gridBagConstraintsMedidaProdu);
	}

	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMedidaProdu.gridy = 0;
	this.gridBagConstraintsMedidaProdu.gridx = 1;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMedidaProdu.add(jscrollPanenombreMedidaProdu, this.gridBagConstraintsMedidaProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMedidaProdu.gridy = iYPanelCamposMedidaProdu;
	this.gridBagConstraintsMedidaProdu.gridx = iXPanelCamposMedidaProdu++;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMedidaProdu.add(this.jPanelidMedidaProdu, this.gridBagConstraintsMedidaProdu);



	if(iXPanelCamposMedidaProdu % 1==0) {
		iXPanelCamposMedidaProdu=0;
		iYPanelCamposMedidaProdu++;
	}
	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMedidaProdu.gridy = iYPanelCamposMedidaProdu;
	this.gridBagConstraintsMedidaProdu.gridx = iXPanelCamposMedidaProdu++;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMedidaProdu.add(this.jPanelnombreMedidaProdu, this.gridBagConstraintsMedidaProdu);



	if(iXPanelCamposMedidaProdu % 1==0) {
		iXPanelCamposMedidaProdu=0;
		iYPanelCamposMedidaProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMedidaProdu.gridy = iYPanelCamposOcultosMedidaProdu;
	this.gridBagConstraintsMedidaProdu.gridx = iXPanelCamposOcultosMedidaProdu++;
	this.gridBagConstraintsMedidaProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMedidaProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMedidaProdu.add(this.jPanelid_empresaMedidaProdu, this.gridBagConstraintsMedidaProdu);



	if(iXPanelCamposOcultosMedidaProdu % 1==0) {
		iXPanelCamposOcultosMedidaProdu=0;
		iYPanelCamposOcultosMedidaProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesMedidaProdu= new GridBagLayout();
		this.jPanelAccionesMedidaProdu.setLayout(gridaBagLayoutAccionesMedidaProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMedidaProdu= new GridBagLayout();
		this.jPanelAccionesFormularioMedidaProdu.setLayout(gridaBagLayoutAccionesFormularioMedidaProdu);
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMedidaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMedidaProdu.add(this.jComboBoxTiposAccionesFormularioMedidaProdu, this.gridBagConstraintsMedidaProdu);

		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMedidaProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMedidaProdu.add(this.jCheckBoxPostAccionNuevoMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMedidaProdu.add(this.jCheckBoxPostAccionSinCerrarMedidaProdu, this.gridBagConstraintsMedidaProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.medidaproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.medidaproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMedidaProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMedidaProdu.add(this.jCheckBoxPostAccionSinMensajeMedidaProdu, this.gridBagConstraintsMedidaProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = 0;
		this.gridBagConstraintsMedidaProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesMedidaProdu.add(this.jButtonModificarMedidaProdu, this.gridBagConstraintsMedidaProdu);							

		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMedidaProdu.gridy = 0;
		this.gridBagConstraintsMedidaProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesMedidaProdu.add(this.jButtonEliminarMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
			
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = 0;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesMedidaProdu.add(this.jButtonActualizarMedidaProdu, this.gridBagConstraintsMedidaProdu);


		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = 0;		
		this.gridBagConstraintsMedidaProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesMedidaProdu.add(this.jButtonGuardarCambiosMedidaProdu, this.gridBagConstraintsMedidaProdu);	
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = 0;		
		this.gridBagConstraintsMedidaProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesMedidaProdu.add(this.jButtonCancelarMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMedidaProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMedidaProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.medidaproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();						
			this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMedidaProdu.gridx = 0;		
			//this.gridBagConstraintsMedidaProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMedidaProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMedidaProdu.gridx =0;
		this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMedidaProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMedidaProdu, this.gridBagConstraintsMedidaProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MedidaProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMedidaProdu = new MedidaProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Medida Produ DATOS");
			
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
			
	        //this.setTitle("[FOR] - Medida Produ DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Medida Produ Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MedidaProduModel medidaproduModel=new MedidaProduModel(this);
			
			//SI USARA CLASE INTERNA
			//MedidaProduModel.MedidaProduFocusTraversalPolicy medidaproduFocusTraversalPolicy = medidaproduModel.new MedidaProduFocusTraversalPolicy(this);
			
			//medidaproduFocusTraversalPolicy.setmedidaproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(medidaproduModel);
			
			
			this.jContentPaneDetalleMedidaProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMedidaProdu = new GridBagLayout();	
			this.jContentPaneDetalleMedidaProdu.setLayout(gridaBagLayoutDetalleMedidaProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMedidaProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
				this.gridBagConstraintsMedidaProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMedidaProdu.gridx = 0;
					
				
				this.jContentPaneDetalleMedidaProdu.add(jTtoolBarDetalleMedidaProdu, gridBagConstraintsMedidaProdu);								
				
}
			
			this.jScrollPanelDatosEdicionMedidaProdu=   new JScrollPane(jContentPaneDetalleMedidaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMedidaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMedidaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMedidaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMedidaProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMedidaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMedidaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMedidaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMedidaProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMedidaProdu.gridx = 0;
	        
			this.jContentPaneDetalleMedidaProdu.add(jPanelCamposMedidaProdu, gridBagConstraintsMedidaProdu);
			
			
			
			
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
						&& medidaproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.medidaproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMedidaProdu= new GridBagConstraints();
						this.gridBagConstraintsMedidaProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMedidaProdu.gridx = 0;
						this.jContentPaneDetalleMedidaProdu.add(this.jTabbedPaneRelacionesMedidaProdu, this.gridBagConstraintsMedidaProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMedidaProdu.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMedidaProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
					this.gridBagConstraintsMedidaProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMedidaProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMedidaProdu.gridx = 0;
					
				
					this.jContentPaneDetalleMedidaProdu.add(jPanelCamposOcultosMedidaProdu, gridBagConstraintsMedidaProdu);
				
					this.jPanelCamposOcultosMedidaProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMedidaProdu.gridx = 0;
	        this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMedidaProdu.add(this.jPanelAccionesFormularioMedidaProdu, this.gridBagConstraintsMedidaProdu);							
			
			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
	        this.gridBagConstraintsMedidaProdu.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMedidaProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleMedidaProdu.add(this.jPanelAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMedidaProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMedidaProdu=   new JScrollPane(this.jPanelCamposMedidaProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMedidaProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMedidaProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMedidaProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMedidaProdu.gridx = 0;
			this.gridBagConstraintsMedidaProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMedidaProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMedidaProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMedidaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMedidaProdu, this.gridBagConstraintsMedidaProdu);			
			
			this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
			this.gridBagConstraintsMedidaProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMedidaProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMedidaProdu, this.gridBagConstraintsMedidaProdu);
			
			
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMedidaProdu, this.gridBagConstraintsMedidaProdu);
		
			
		this.gridBagConstraintsMedidaProdu = new GridBagConstraints();
		this.gridBagConstraintsMedidaProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMedidaProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMedidaProdu, this.gridBagConstraintsMedidaProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMedidaProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionMedidaProdu;
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
