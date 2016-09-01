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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporConstantesFunciones;
import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporParameterReturnGeneral;
//import com.bydan.erp.importaciones.util.LiquidacionImpuestoImporParameterGeneral;
//import com.bydan.erp.importaciones.presentation.report.source.LiquidacionImpuestoImporBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.importaciones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.importaciones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.importaciones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class LiquidacionImpuestoImporBeanSwingJInternalFrame extends LiquidacionImpuestoImporJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LiquidacionImpuestoImporBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LiquidacionImpuestoImpor> liquidacionimpuestoimporValidator = new ClassValidator<LiquidacionImpuestoImpor>(LiquidacionImpuestoImpor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LiquidacionImpuestoImpor liquidacionimpuestoimpor;	
	public LiquidacionImpuestoImpor liquidacionimpuestoimporAux;
	public LiquidacionImpuestoImpor liquidacionimpuestoimporAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LiquidacionImpuestoImpor liquidacionimpuestoimporTotales;
	public Long idLiquidacionImpuestoImporActual;
	public Long iIdNuevoLiquidacionImpuestoImpor=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPedidoCompraImpor="";

	public List<PedidoCompraImpor> pedidocompraimporsForeignKey;

	public List<PedidoCompraImpor> getpedidocompraimporsForeignKey() {
		return pedidocompraimporsForeignKey;
	}

	public void setpedidocompraimporsForeignKey(List<PedidoCompraImpor> pedidocompraimporsForeignKey) {
		this.pedidocompraimporsForeignKey = pedidocompraimporsForeignKey;
	}

	//OBJETO FK ACTUAL
	public PedidoCompraImpor pedidocompraimporForeignKey;

	public PedidoCompraImpor getpedidocompraimporForeignKey() {
		return pedidocompraimporForeignKey;
	}

	public void setpedidocompraimporForeignKey(PedidoCompraImpor pedidocompraimporForeignKey) {
		this.pedidocompraimporForeignKey = pedidocompraimporForeignKey;
	}

	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
	}
	
	

	public Boolean isTienePermisosDetalleLiquidacionImpuestoImpor=false;

	public Boolean getIsTienePermisosDetalleLiquidacionImpuestoImpor() {
		return isTienePermisosDetalleLiquidacionImpuestoImpor;
	}

	public void setIsTienePermisosDetalleLiquidacionImpuestoImpor(Boolean isTienePermisosDetalleLiquidacionImpuestoImpor) {
		this.isTienePermisosDetalleLiquidacionImpuestoImpor= isTienePermisosDetalleLiquidacionImpuestoImpor;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoLiquidacionImpuestoImpor;
	public Boolean isPermisoNuevoLiquidacionImpuestoImpor;
	public Boolean isPermisoActualizarLiquidacionImpuestoImpor;
	public Boolean isPermisoActualizarOriginalLiquidacionImpuestoImpor;
	public Boolean isPermisoEliminarLiquidacionImpuestoImpor;
	public Boolean isPermisoGuardarCambiosLiquidacionImpuestoImpor;
	public Boolean isPermisoConsultaLiquidacionImpuestoImpor;
	public Boolean isPermisoBusquedaLiquidacionImpuestoImpor;
	public Boolean isPermisoReporteLiquidacionImpuestoImpor;
	public Boolean isPermisoPaginacionMedioLiquidacionImpuestoImpor;
	public Boolean isPermisoPaginacionAltoLiquidacionImpuestoImpor;
	public Boolean isPermisoPaginacionTodoLiquidacionImpuestoImpor;
	public Boolean isPermisoCopiarLiquidacionImpuestoImpor;
	public Boolean isPermisoVerFormLiquidacionImpuestoImpor;
	public Boolean isPermisoDuplicarLiquidacionImpuestoImpor;
	public Boolean isPermisoOrdenLiquidacionImpuestoImpor;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporReturnGeneral;
	public LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporParameterGeneral;
	
	

	public DetalleLiquidacionImpuestoImporLogic detalleliquidacionimpuestoimporLogic=null;

	public DetalleLiquidacionImpuestoImporLogic getDetalleLiquidacionImpuestoImporLogic() {
		return detalleliquidacionimpuestoimporLogic;
	}

	public void setDetalleLiquidacionImpuestoImporLogic(DetalleLiquidacionImpuestoImporLogic detalleliquidacionimpuestoimporLogic) {
		this.detalleliquidacionimpuestoimporLogic = detalleliquidacionimpuestoimporLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLiquidacionImpuestoImpor=false;
	public Boolean esParaAccionDesdeFormularioLiquidacionImpuestoImpor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LiquidacionImpuestoImporSessionBeanAdditional liquidacionimpuestoimporSessionBeanAdditional=null;
	
	public LiquidacionImpuestoImporSessionBeanAdditional getLiquidacionImpuestoImporSessionBeanAdditional() {
		return this.liquidacionimpuestoimporSessionBeanAdditional;
	}
	
	public void setLiquidacionImpuestoImporSessionBeanAdditional(LiquidacionImpuestoImporSessionBeanAdditional liquidacionimpuestoimporSessionBeanAdditional) {
		try {
			this.liquidacionimpuestoimporSessionBeanAdditional=liquidacionimpuestoimporSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional liquidacionimpuestoimporBeanSwingJInternalFrameAdditional=null;
	//public class LiquidacionImpuestoImporBeanSwingJInternalFrame
	
	public LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional getLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional() {
		return this.liquidacionimpuestoimporBeanSwingJInternalFrameAdditional;
	}
	
	public void setLiquidacionImpuestoImporBeanSwingJInternalFrameAdditional(LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional liquidacionimpuestoimporBeanSwingJInternalFrameAdditional) {
		try {
			this.liquidacionimpuestoimporBeanSwingJInternalFrameAdditional=liquidacionimpuestoimporBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LiquidacionImpuestoImpor liquidacionimpuestoimporBean;
	public LiquidacionImpuestoImporConstantesFunciones liquidacionimpuestoimporConstantesFunciones;
	//public LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporReturnGeneral;
	
	//FK
	
	public PedidoCompraImporLogic pedidocompraimporLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public FacturaLogic facturaLogic;
	
	//PARAMETROS
	
	
	//public List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors;	
	//public List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsEliminados;
	//public List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaCopiarLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaVerFormLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaOrdenLiquidacionImpuestoImpor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=false;
	public Boolean isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdPedidoCompraImpor=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoLiquidacionImpuestoImpor() {
		return this.iIdNuevoLiquidacionImpuestoImpor;
	}

	public void setiIdNuevoLiquidacionImpuestoImpor(Long iIdNuevoLiquidacionImpuestoImpor) {
		this.iIdNuevoLiquidacionImpuestoImpor = iIdNuevoLiquidacionImpuestoImpor;
	}
	
	public Long getidLiquidacionImpuestoImporActual() {
		return this.idLiquidacionImpuestoImporActual;
	}

	public void setidLiquidacionImpuestoImporActual(Long idLiquidacionImpuestoImporActual) {
		this.idLiquidacionImpuestoImporActual = idLiquidacionImpuestoImporActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LiquidacionImpuestoImpor getliquidacionimpuestoimpor() {
		return this.liquidacionimpuestoimpor;
	}

	public void setliquidacionimpuestoimpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor) {
		this.liquidacionimpuestoimpor = liquidacionimpuestoimpor;
	}
	
	public LiquidacionImpuestoImpor getliquidacionimpuestoimporAux() {
		return this.liquidacionimpuestoimporAux;
	}

	public void setliquidacionimpuestoimporAux(LiquidacionImpuestoImpor liquidacionimpuestoimporAux) {
		this.liquidacionimpuestoimporAux = liquidacionimpuestoimporAux;
	}				
	
	public LiquidacionImpuestoImpor getliquidacionimpuestoimporAnterior() {
		return this.liquidacionimpuestoimporAnterior;
	}

	public void setliquidacionimpuestoimporAnterior(LiquidacionImpuestoImpor liquidacionimpuestoimporAnterior) {
		this.liquidacionimpuestoimporAnterior = liquidacionimpuestoimporAnterior;
	}	
	
	public LiquidacionImpuestoImpor getliquidacionimpuestoimporTotales() {
		return this.liquidacionimpuestoimporTotales;
	}

	public void setliquidacionimpuestoimporTotales(LiquidacionImpuestoImpor liquidacionimpuestoimporTotales) {
		this.liquidacionimpuestoimporTotales = liquidacionimpuestoimporTotales;
	}	
	
	public LiquidacionImpuestoImpor getliquidacionimpuestoimporBean() {
		return this.liquidacionimpuestoimporBean;
	}

	public void setliquidacionimpuestoimporBean(LiquidacionImpuestoImpor liquidacionimpuestoimporBean) {
		this.liquidacionimpuestoimporBean = liquidacionimpuestoimporBean;
	}	
	
	public LiquidacionImpuestoImporParameterReturnGeneral getliquidacionimpuestoimporReturnGeneral() {
		return this.liquidacionimpuestoimporReturnGeneral;
	}

	public void setliquidacionimpuestoimporReturnGeneral(LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporReturnGeneral) {
		this.liquidacionimpuestoimporReturnGeneral = liquidacionimpuestoimporReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
	}

	public Long id_pedido_compra_imporFK_IdPedidoCompraImpor=-1L;

	public Long getid_pedido_compra_imporFK_IdPedidoCompraImpor() {
		return this.id_pedido_compra_imporFK_IdPedidoCompraImpor;
	}

	public void setid_pedido_compra_imporFK_IdPedidoCompraImpor(Long id_pedido_compra_imporFK_IdPedidoCompraImpor) {
		this.id_pedido_compra_imporFK_IdPedidoCompraImpor = id_pedido_compra_imporFK_IdPedidoCompraImpor;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public LiquidacionImpuestoImporLogic getLiquidacionImpuestoImporLogic()	{		
		return liquidacionimpuestoimporLogic;
	}

	public void setLiquidacionImpuestoImporLogic(LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogic) {
		this.liquidacionimpuestoimporLogic = liquidacionimpuestoimporLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoLiquidacionImpuestoImpor() {
		return isEsNuevoLiquidacionImpuestoImpor;
	}

	public void setIsEsNuevoLiquidacionImpuestoImpor(Boolean isEsNuevoLiquidacionImpuestoImpor) {
		this.isEsNuevoLiquidacionImpuestoImpor = isEsNuevoLiquidacionImpuestoImpor;
	}

	public Boolean getEsParaAccionDesdeFormularioLiquidacionImpuestoImpor() {
		return esParaAccionDesdeFormularioLiquidacionImpuestoImpor;
	}
	
	public void setEsParaAccionDesdeFormularioLiquidacionImpuestoImpor(Boolean esParaAccionDesdeFormularioLiquidacionImpuestoImpor) {
		this.esParaAccionDesdeFormularioLiquidacionImpuestoImpor = esParaAccionDesdeFormularioLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosPedidoCompraImporsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.pedidocompraimporsForeignKey=new ArrayList<PedidoCompraImpor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PedidoCompraImporLogic pedidocompraimporLogic=new PedidoCompraImporLogic();

			pedidocompraimporLogic.getPedidoCompraImporDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionPedidoCompraImpor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidocompraimporLogic.getPedidoCompraImporDataAccess().setIsForForeingKeyData(true);

					pedidocompraimporLogic.getTodosPedidoCompraImporsWithConnection(sFinalQuery,new Pagination());

					this.pedidocompraimporsForeignKey=pedidocompraimporLogic.getPedidoCompraImpors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPedidoCompraImpor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidocompraimporLogic.getEntityWithConnection(liquidacionimpuestoimporSessionBean.getlidPedidoCompraImporActual());
					this.pedidocompraimporsForeignKey.add(pedidocompraimporLogic.getPedidoCompraImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(liquidacionimpuestoimporSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(liquidacionimpuestoimporSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(liquidacionimpuestoimporSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(liquidacionimpuestoimporSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualPedidoCompraImporForeignKey(Long idPedidoCompraImporSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PedidoCompraImpor  pedidocompraimporTemp=null;

			for(PedidoCompraImpor pedidocompraimporAux:pedidocompraimporsForeignKey) {
				if(pedidocompraimporAux.getId()!=null && pedidocompraimporAux.getId().equals(idPedidoCompraImporSeleccionado)) {
					pedidocompraimporTemp=pedidocompraimporAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(pedidocompraimporTemp!=null) {

					if(this.liquidacionimpuestoimpor!=null) {
						this.liquidacionimpuestoimpor.setPedidoCompraImpor(pedidocompraimporTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setSelectedItem(pedidocompraimporTemp);
					}
				} else {
					//jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setSelectedItem(pedidocompraimporTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPedidoCompraImpor") || sFormularioTipoBusqueda.equals("Todos")){
					if(pedidocompraimporTemp!=null && jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor!=null) {
						jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setSelectedItem(pedidocompraimporTemp);
					} else {
						if(jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor!=null) {
							//jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setSelectedItem(pedidocompraimporTemp);
							if(jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.getItemCount()>0) {
								jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualPedidoCompraImporForeignKeyDescripcion(Long idPedidoCompraImporSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PedidoCompraImpor  pedidocompraimporTemp=null;

			for(PedidoCompraImpor pedidocompraimporAux:pedidocompraimporsForeignKey) {
				if(pedidocompraimporAux.getId()!=null && pedidocompraimporAux.getId().equals(idPedidoCompraImporSeleccionado)) {
					pedidocompraimporTemp=pedidocompraimporAux;
					break;
				}
			}


			sDescripcion=PedidoCompraImporConstantesFunciones.getPedidoCompraImporDescripcion(pedidocompraimporTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPedidoCompraImporForeignKeyGenerico(Long idPedidoCompraImporSeleccionado,JComboBox jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			PedidoCompraImpor  pedidocompraimporTemp=null;

			for(PedidoCompraImpor pedidocompraimporAux:pedidocompraimporsForeignKey) {
				if(pedidocompraimporAux.getId()!=null && pedidocompraimporAux.getId().equals(idPedidoCompraImporSeleccionado)) {
					pedidocompraimporTemp=pedidocompraimporAux;
					break;
				}
			}

			if(pedidocompraimporTemp!=null) {
				jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico.setSelectedItem(pedidocompraimporTemp);
			} else {
				if(jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico!=null && jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.liquidacionimpuestoimpor!=null) {
						this.liquidacionimpuestoimpor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLiquidacionImpuestoImpor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaLiquidacionImpuestoImporGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLiquidacionImpuestoImporGenerico!=null && jComboBoxid_empresaLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_empresaLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.liquidacionimpuestoimpor!=null) {
						this.liquidacionimpuestoimpor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalLiquidacionImpuestoImpor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalLiquidacionImpuestoImporGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalLiquidacionImpuestoImporGenerico!=null && jComboBoxid_sucursalLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_sucursalLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.liquidacionimpuestoimpor!=null) {
						this.liquidacionimpuestoimpor.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteLiquidacionImpuestoImpor.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor!=null) {
						jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor!=null) {
							//jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteLiquidacionImpuestoImporGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteLiquidacionImpuestoImporGenerico!=null && jComboBoxid_clienteLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_clienteLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.liquidacionimpuestoimpor!=null) {
						this.liquidacionimpuestoimpor.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaLiquidacionImpuestoImpor.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.getItemCount()>0) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor!=null) {
						jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor!=null) {
							//jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaLiquidacionImpuestoImporGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaLiquidacionImpuestoImporGenerico!=null && jComboBoxid_facturaLiquidacionImpuestoImporGenerico.getItemCount()>0) {
					jComboBoxid_facturaLiquidacionImpuestoImporGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPedidoCompraImporForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimpor,JComboBox jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			PedidoCompraImpor  pedidocompraimporAux=new PedidoCompraImpor();

			if(jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico==null) {
				pedidocompraimporAux=(PedidoCompraImpor)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				pedidocompraimporAux=(PedidoCompraImpor)jComboBoxid_pedido_compra_imporLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(pedidocompraimporAux!=null && pedidocompraimporAux.getId()!=null) {
				liquidacionimpuestoimpor.setid_pedido_compra_impor(pedidocompraimporAux.getId());
				liquidacionimpuestoimpor.setpedidocompraimpor_descripcion(LiquidacionImpuestoImporConstantesFunciones.getPedidoCompraImporDescripcion(pedidocompraimporAux));
				liquidacionimpuestoimpor.setPedidoCompraImpor(pedidocompraimporAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimpor,JComboBox jComboBoxid_empresaLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLiquidacionImpuestoImporGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				liquidacionimpuestoimpor.setid_empresa(empresaAux.getId());
				liquidacionimpuestoimpor.setempresa_descripcion(LiquidacionImpuestoImporConstantesFunciones.getEmpresaDescripcion(empresaAux));
				liquidacionimpuestoimpor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimpor,JComboBox jComboBoxid_sucursalLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalLiquidacionImpuestoImporGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				liquidacionimpuestoimpor.setid_sucursal(sucursalAux.getId());
				liquidacionimpuestoimpor.setsucursal_descripcion(LiquidacionImpuestoImporConstantesFunciones.getSucursalDescripcion(sucursalAux));
				liquidacionimpuestoimpor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimpor,JComboBox jComboBoxid_clienteLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteLiquidacionImpuestoImporGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				liquidacionimpuestoimpor.setid_cliente(clienteAux.getId());
				liquidacionimpuestoimpor.setcliente_descripcion(LiquidacionImpuestoImporConstantesFunciones.getClienteDescripcion(clienteAux));
				liquidacionimpuestoimpor.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(LiquidacionImpuestoImpor liquidacionimpuestoimpor,JComboBox jComboBoxid_facturaLiquidacionImpuestoImporGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaLiquidacionImpuestoImporGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaLiquidacionImpuestoImporGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				liquidacionimpuestoimpor.setid_factura(facturaAux.getId());
				liquidacionimpuestoimpor.setfactura_descripcion(LiquidacionImpuestoImporConstantesFunciones.getFacturaDescripcion(facturaAux));
				liquidacionimpuestoimpor.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePedidoCompraImporsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPedidoCompraImpor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.removeAllItems();

							for(PedidoCompraImpor pedidocompraimpor:this.pedidocompraimporsForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.addItem(pedidocompraimpor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
					}

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPedidoCompraImpor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.removeAllItems();

							for(PedidoCompraImpor pedidocompraimpor:this.pedidocompraimporsForeignKey) {
								this.jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.addItem(pedidocompraimpor);
							}
						}

						if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
					}

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
					}

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
					}

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.addItem(cliente);
							}
						}

						if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { 
					}

					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.addItem(factura);
							}
						}

						if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePedidoCompraImporForeignKey(PedidoCompraImpor pedidocompraimpor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setSelectedItem(pedidocompraimpor);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setSelectedItem(pedidocompraimpor);
						} else {
							this.jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LiquidacionImpuestoImporConstantesFunciones.refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LiquidacionImpuestoImporConstantesFunciones.refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor(this.liquidacionimpuestoimpors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(PedidoCompraImpor.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Factura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(this.liquidacionimpuestoimpors);
			liquidacionimpuestoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public LiquidacionImpuestoImporParameterReturnGeneral getLiquidacionImpuestoImporParameterGeneral() {
		return this.liquidacionimpuestoimporParameterGeneral;
	}
	
	public void setLiquidacionImpuestoImporParameterGeneral(LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporParameterGeneral) {
		this.liquidacionimpuestoimporParameterGeneral = liquidacionimpuestoimporParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoLiquidacionImpuestoImpor() {
		return isPermisoTodoLiquidacionImpuestoImpor;
	}

	public void setIsPermisoTodoLiquidacionImpuestoImpor(Boolean isPermisoTodoLiquidacionImpuestoImpor) {
		this.isPermisoTodoLiquidacionImpuestoImpor = isPermisoTodoLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoNuevoLiquidacionImpuestoImpor() {
		return isPermisoNuevoLiquidacionImpuestoImpor;
	}

	public void setIsPermisoNuevoLiquidacionImpuestoImpor(Boolean isPermisoNuevoLiquidacionImpuestoImpor) {
		this.isPermisoNuevoLiquidacionImpuestoImpor = isPermisoNuevoLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoActualizarLiquidacionImpuestoImpor() {
		return isPermisoActualizarLiquidacionImpuestoImpor;
	}

	public void setIsPermisoActualizarLiquidacionImpuestoImpor(Boolean isPermisoActualizarLiquidacionImpuestoImpor) {
		this.isPermisoActualizarLiquidacionImpuestoImpor = isPermisoActualizarLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoEliminarLiquidacionImpuestoImpor() {
		return isPermisoEliminarLiquidacionImpuestoImpor;
	}

	public void setIsPermisoEliminarLiquidacionImpuestoImpor(Boolean isPermisoEliminarLiquidacionImpuestoImpor) {
		this.isPermisoEliminarLiquidacionImpuestoImpor = isPermisoEliminarLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoGuardarCambiosLiquidacionImpuestoImpor() {
		return isPermisoGuardarCambiosLiquidacionImpuestoImpor;
	}

	public void setIsPermisoGuardarCambiosLiquidacionImpuestoImpor(Boolean isPermisoGuardarCambiosLiquidacionImpuestoImpor) {
		this.isPermisoGuardarCambiosLiquidacionImpuestoImpor = isPermisoGuardarCambiosLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoConsultaLiquidacionImpuestoImpor() {
		return isPermisoConsultaLiquidacionImpuestoImpor;
	}

	public void setIsPermisoConsultaLiquidacionImpuestoImpor(Boolean isPermisoConsultaLiquidacionImpuestoImpor) {
		this.isPermisoConsultaLiquidacionImpuestoImpor = isPermisoConsultaLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoBusquedaLiquidacionImpuestoImpor() {
		return isPermisoBusquedaLiquidacionImpuestoImpor;
	}

	public void setIsPermisoBusquedaLiquidacionImpuestoImpor(Boolean isPermisoBusquedaLiquidacionImpuestoImpor) {
		this.isPermisoBusquedaLiquidacionImpuestoImpor = isPermisoBusquedaLiquidacionImpuestoImpor;
	}

	public Boolean getIsPermisoReporteLiquidacionImpuestoImpor() {
		return isPermisoReporteLiquidacionImpuestoImpor;
	}

	public void setIsPermisoReporteLiquidacionImpuestoImpor(Boolean isPermisoReporteLiquidacionImpuestoImpor) {
		this.isPermisoReporteLiquidacionImpuestoImpor = isPermisoReporteLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoPaginacionMedioLiquidacionImpuestoImpor() {
		return isPermisoPaginacionMedioLiquidacionImpuestoImpor;
	}

	public void setIsPermisoPaginacionMedioLiquidacionImpuestoImpor(Boolean isPermisoPaginacionMedioLiquidacionImpuestoImpor) {
		this.isPermisoPaginacionMedioLiquidacionImpuestoImpor = isPermisoPaginacionMedioLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoPaginacionTodoLiquidacionImpuestoImpor() {
		return isPermisoPaginacionTodoLiquidacionImpuestoImpor;
	}

	public void setIsPermisoPaginacionTodoLiquidacionImpuestoImpor(Boolean isPermisoPaginacionTodoLiquidacionImpuestoImpor) {
		this.isPermisoPaginacionTodoLiquidacionImpuestoImpor = isPermisoPaginacionTodoLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoPaginacionAltoLiquidacionImpuestoImpor() {
		return isPermisoPaginacionAltoLiquidacionImpuestoImpor;
	}

	public void setIsPermisoPaginacionAltoLiquidacionImpuestoImpor(Boolean isPermisoPaginacionAltoLiquidacionImpuestoImpor) {
		this.isPermisoPaginacionAltoLiquidacionImpuestoImpor = isPermisoPaginacionAltoLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoCopiarLiquidacionImpuestoImpor() {
		return isPermisoCopiarLiquidacionImpuestoImpor;
	}

	public void setIsPermisoCopiarLiquidacionImpuestoImpor(Boolean isPermisoCopiarLiquidacionImpuestoImpor) {
		this.isPermisoCopiarLiquidacionImpuestoImpor = isPermisoCopiarLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoVerFormLiquidacionImpuestoImpor() {
		return isPermisoVerFormLiquidacionImpuestoImpor;
	}

	public void setIsPermisoVerFormLiquidacionImpuestoImpor(Boolean isPermisoVerFormLiquidacionImpuestoImpor) {
		this.isPermisoVerFormLiquidacionImpuestoImpor = isPermisoVerFormLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoDuplicarLiquidacionImpuestoImpor() {
		return isPermisoDuplicarLiquidacionImpuestoImpor;
	}

	public void setIsPermisoDuplicarLiquidacionImpuestoImpor(Boolean isPermisoDuplicarLiquidacionImpuestoImpor) {
		this.isPermisoDuplicarLiquidacionImpuestoImpor = isPermisoDuplicarLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsPermisoOrdenLiquidacionImpuestoImpor() {
		return isPermisoOrdenLiquidacionImpuestoImpor;
	}

	public void setIsPermisoOrdenLiquidacionImpuestoImpor(Boolean isPermisoOrdenLiquidacionImpuestoImpor) {
		this.isPermisoOrdenLiquidacionImpuestoImpor = isPermisoOrdenLiquidacionImpuestoImpor;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaNuevoLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaNuevoLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaNuevoLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor = isVisibilidadCeldaNuevoLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaDuplicarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor = isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaCopiarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaCopiarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaCopiarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor = isVisibilidadCeldaCopiarLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaVerFormLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaVerFormLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaVerFormLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor = isVisibilidadCeldaVerFormLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaOrdenLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaOrdenLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaOrdenLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor = isVisibilidadCeldaOrdenLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor = isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaModificarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaModificarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaModificarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor = isVisibilidadCeldaModificarLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaActualizarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaActualizarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaActualizarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor = isVisibilidadCeldaActualizarLiquidacionImpuestoImpor;
	}

	public Boolean getIsVisibilidadCeldaEliminarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaEliminarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaEliminarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaEliminarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor = isVisibilidadCeldaEliminarLiquidacionImpuestoImpor;
	}

	public Boolean getIsVisibilidadCeldaCancelarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaCancelarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaCancelarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaCancelarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor = isVisibilidadCeldaCancelarLiquidacionImpuestoImpor;
	}

	public Boolean getIsVisibilidadCeldaGuardarLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaGuardarLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaGuardarLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaGuardarLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor = isVisibilidadCeldaGuardarLiquidacionImpuestoImpor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor() {
		return isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor(Boolean isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor) {
		this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor = isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor;
	}
		
	public LiquidacionImpuestoImporSessionBean getliquidacionimpuestoimporSessionBean() {
		return this.liquidacionimpuestoimporSessionBean;
	}
	
	public void setliquidacionimpuestoimporSessionBean(LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean) {
		this.liquidacionimpuestoimporSessionBean=liquidacionimpuestoimporSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdPedidoCompraImpor() {
		return this.isVisibilidadFK_IdPedidoCompraImpor;
	}

	public void setisVisibilidadFK_IdPedidoCompraImpor(Boolean isVisibilidadFK_IdPedidoCompraImpor) {
		this.isVisibilidadFK_IdPedidoCompraImpor=isVisibilidadFK_IdPedidoCompraImpor;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor)throws Exception {
		try {
			
				this.setActualParaGuardarPedidoCompraImporForeignKey(liquidacionimpuestoimpor,null);
				this.setActualParaGuardarEmpresaForeignKey(liquidacionimpuestoimpor,null);
				this.setActualParaGuardarSucursalForeignKey(liquidacionimpuestoimpor,null);
				this.setActualParaGuardarClienteForeignKey(liquidacionimpuestoimpor,null);
				this.setActualParaGuardarFacturaForeignKey(liquidacionimpuestoimpor,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(LiquidacionImpuestoImpor liquidacionimpuestoimpor,LiquidacionImpuestoImpor liquidacionimpuestoimporAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLiquidacionImpuestoImpor(liquidacionimpuestoimpor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		liquidacionimpuestoimporAux.setId(liquidacionimpuestoimpor.getId());
		liquidacionimpuestoimporAux.setVersionRow(liquidacionimpuestoimpor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLiquidacionImpuestoImpor();
		
			int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = liquidacionimpuestoimporValidator.getInvalidValues(this.liquidacionimpuestoimpor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			liquidacionimpuestoimporLogic.setDatosCliente(datosCliente);
			liquidacionimpuestoimporLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				liquidacionimpuestoimporAux=new  LiquidacionImpuestoImpor();
				
				liquidacionimpuestoimporAux.setIsNew(true);
				liquidacionimpuestoimporAux.setIsChanged(true);
				
				liquidacionimpuestoimporAux.setLiquidacionImpuestoImporOriginal(this.liquidacionimpuestoimpor);
				
				liquidacionimpuestoimporAux.setId(this.liquidacionimpuestoimpor.getId());	
				liquidacionimpuestoimporAux.setVersionRow(this.liquidacionimpuestoimpor.getVersionRow());	
				liquidacionimpuestoimporAux.setid_pedido_compra_impor(this.liquidacionimpuestoimpor.getid_pedido_compra_impor());	
				liquidacionimpuestoimporAux.setid_empresa(this.liquidacionimpuestoimpor.getid_empresa());	
				liquidacionimpuestoimporAux.setid_sucursal(this.liquidacionimpuestoimpor.getid_sucursal());	
				liquidacionimpuestoimporAux.setid_cliente(this.liquidacionimpuestoimpor.getid_cliente());	
				liquidacionimpuestoimporAux.setid_factura(this.liquidacionimpuestoimpor.getid_factura());	
				liquidacionimpuestoimporAux.setnumero_comprobante(this.liquidacionimpuestoimpor.getnumero_comprobante());	
				liquidacionimpuestoimporAux.setnumero_dui(this.liquidacionimpuestoimpor.getnumero_dui());	
				liquidacionimpuestoimporAux.setfecha(this.liquidacionimpuestoimpor.getfecha());	
				liquidacionimpuestoimporAux.setfecha_pago(this.liquidacionimpuestoimpor.getfecha_pago());	
				liquidacionimpuestoimporAux.setfob(this.liquidacionimpuestoimpor.getfob());	
				liquidacionimpuestoimporAux.setseguro(this.liquidacionimpuestoimpor.getseguro());	
				liquidacionimpuestoimporAux.setflete(this.liquidacionimpuestoimpor.getflete());	
				liquidacionimpuestoimporAux.setporcentaje_fodi(this.liquidacionimpuestoimpor.getporcentaje_fodi());	
				liquidacionimpuestoimporAux.setporcentaje_iva(this.liquidacionimpuestoimpor.getporcentaje_iva());	
				liquidacionimpuestoimporAux.settasa_control(this.liquidacionimpuestoimpor.gettasa_control());	
				liquidacionimpuestoimporAux.setcfr(this.liquidacionimpuestoimpor.getcfr());	
				liquidacionimpuestoimporAux.setcif(this.liquidacionimpuestoimpor.getcif());	
				liquidacionimpuestoimporAux.settotal(this.liquidacionimpuestoimpor.gettotal());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImpors();//WithConnection
						//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.liquidacionimpuestoimpor,liquidacionimpuestoimporAux);
					
					this.refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors.addAll(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImporRelaciones(liquidacionimpuestoimporAux,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());//WithConnection
								//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.liquidacionimpuestoimpor,liquidacionimpuestoimporAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors= new ArrayList<DetalleLiquidacionImpuestoImpor>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();}
							liquidacionimpuestoimporAux.setDetalleLiquidacionImpuestoImpors(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.liquidacionimpuestoimpor,liquidacionimpuestoimporAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				liquidacionimpuestoimporAux=new  LiquidacionImpuestoImpor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() 
					|| (this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() && this.liquidacionimpuestoimpor.getId()>=0)) {
						
					liquidacionimpuestoimporAux.setIsNew(false);
				}
				
				liquidacionimpuestoimporAux.setIsDeleted(false);
			
				liquidacionimpuestoimporAux.setId(this.liquidacionimpuestoimpor.getId());	
				liquidacionimpuestoimporAux.setVersionRow(this.liquidacionimpuestoimpor.getVersionRow());	
				liquidacionimpuestoimporAux.setid_pedido_compra_impor(this.liquidacionimpuestoimpor.getid_pedido_compra_impor());	
				liquidacionimpuestoimporAux.setid_empresa(this.liquidacionimpuestoimpor.getid_empresa());	
				liquidacionimpuestoimporAux.setid_sucursal(this.liquidacionimpuestoimpor.getid_sucursal());	
				liquidacionimpuestoimporAux.setid_cliente(this.liquidacionimpuestoimpor.getid_cliente());	
				liquidacionimpuestoimporAux.setid_factura(this.liquidacionimpuestoimpor.getid_factura());	
				liquidacionimpuestoimporAux.setnumero_comprobante(this.liquidacionimpuestoimpor.getnumero_comprobante());	
				liquidacionimpuestoimporAux.setnumero_dui(this.liquidacionimpuestoimpor.getnumero_dui());	
				liquidacionimpuestoimporAux.setfecha(this.liquidacionimpuestoimpor.getfecha());	
				liquidacionimpuestoimporAux.setfecha_pago(this.liquidacionimpuestoimpor.getfecha_pago());	
				liquidacionimpuestoimporAux.setfob(this.liquidacionimpuestoimpor.getfob());	
				liquidacionimpuestoimporAux.setseguro(this.liquidacionimpuestoimpor.getseguro());	
				liquidacionimpuestoimporAux.setflete(this.liquidacionimpuestoimpor.getflete());	
				liquidacionimpuestoimporAux.setporcentaje_fodi(this.liquidacionimpuestoimpor.getporcentaje_fodi());	
				liquidacionimpuestoimporAux.setporcentaje_iva(this.liquidacionimpuestoimpor.getporcentaje_iva());	
				liquidacionimpuestoimporAux.settasa_control(this.liquidacionimpuestoimpor.gettasa_control());	
				liquidacionimpuestoimporAux.setcfr(this.liquidacionimpuestoimpor.getcfr());	
				liquidacionimpuestoimporAux.setcif(this.liquidacionimpuestoimpor.getcif());	
				liquidacionimpuestoimporAux.settotal(this.liquidacionimpuestoimpor.gettotal());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImpors();//WithConnection
						//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.liquidacionimpuestoimpor,liquidacionimpuestoimporAux);
					
					this.refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors.addAll(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImporRelaciones(liquidacionimpuestoimporAux,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());//WithConnection
								//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.liquidacionimpuestoimpor,liquidacionimpuestoimporAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors= new ArrayList<DetalleLiquidacionImpuestoImpor>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();}
							liquidacionimpuestoimporAux.setDetalleLiquidacionImpuestoImpors(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
									|| this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimpors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.liquidacionimpuestoimpor,liquidacionimpuestoimporAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				liquidacionimpuestoimporAux=new  LiquidacionImpuestoImpor();
				
				liquidacionimpuestoimporAux.setIsNew(false);
				liquidacionimpuestoimporAux.setIsChanged(false);
				
				liquidacionimpuestoimporAux.setIsDeleted(true);
				
				liquidacionimpuestoimporAux.setId(this.liquidacionimpuestoimpor.getId());	
				liquidacionimpuestoimporAux.setVersionRow(this.liquidacionimpuestoimpor.getVersionRow());	
				liquidacionimpuestoimporAux.setid_pedido_compra_impor(this.liquidacionimpuestoimpor.getid_pedido_compra_impor());	
				liquidacionimpuestoimporAux.setid_empresa(this.liquidacionimpuestoimpor.getid_empresa());	
				liquidacionimpuestoimporAux.setid_sucursal(this.liquidacionimpuestoimpor.getid_sucursal());	
				liquidacionimpuestoimporAux.setid_cliente(this.liquidacionimpuestoimpor.getid_cliente());	
				liquidacionimpuestoimporAux.setid_factura(this.liquidacionimpuestoimpor.getid_factura());	
				liquidacionimpuestoimporAux.setnumero_comprobante(this.liquidacionimpuestoimpor.getnumero_comprobante());	
				liquidacionimpuestoimporAux.setnumero_dui(this.liquidacionimpuestoimpor.getnumero_dui());	
				liquidacionimpuestoimporAux.setfecha(this.liquidacionimpuestoimpor.getfecha());	
				liquidacionimpuestoimporAux.setfecha_pago(this.liquidacionimpuestoimpor.getfecha_pago());	
				liquidacionimpuestoimporAux.setfob(this.liquidacionimpuestoimpor.getfob());	
				liquidacionimpuestoimporAux.setseguro(this.liquidacionimpuestoimpor.getseguro());	
				liquidacionimpuestoimporAux.setflete(this.liquidacionimpuestoimpor.getflete());	
				liquidacionimpuestoimporAux.setporcentaje_fodi(this.liquidacionimpuestoimpor.getporcentaje_fodi());	
				liquidacionimpuestoimporAux.setporcentaje_iva(this.liquidacionimpuestoimpor.getporcentaje_iva());	
				liquidacionimpuestoimporAux.settasa_control(this.liquidacionimpuestoimpor.gettasa_control());	
				liquidacionimpuestoimporAux.setcfr(this.liquidacionimpuestoimpor.getcfr());	
				liquidacionimpuestoimporAux.setcif(this.liquidacionimpuestoimpor.getcif());	
				liquidacionimpuestoimporAux.settotal(this.liquidacionimpuestoimpor.gettotal());	
				
				if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.liquidacionimpuestoimporAux.getId()>=0) {	
						this.liquidacionimpuestoimporsEliminados.add(liquidacionimpuestoimporAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImpors();//WithConnection
						//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors().addAll(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors.addAll(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImporRelaciones(liquidacionimpuestoimporAux,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());//WithConnection
								//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(new ArrayList<DetalleLiquidacionImpuestoImpor>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors= new ArrayList<DetalleLiquidacionImpuestoImpor>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.quitarFilaTotales();}
							liquidacionimpuestoimporAux.setDetalleLiquidacionImpuestoImpors(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
								|| this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(liquidacionimpuestoimporAux,liquidacionimpuestoimpors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(this.liquidacionimpuestoimporsEliminados);
					
					liquidacionimpuestoimporLogic.saveLiquidacionImpuestoImpors();//WithConnection
					//liquidacionimpuestoimporLogic.getSetVersionRowLiquidacionImpuestoImpors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor();
				
				this.liquidacionimpuestoimporsEliminados= new ArrayList<LiquidacionImpuestoImpor>();		
			}
			
			if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Liquidacion Impuesto Impor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.liquidacionimpuestoimpor=liquidacionimpuestoimporAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessLiquidacionImpuestoImpor();
      	}
		
	}	
	
	public void actualizarRelaciones(LiquidacionImpuestoImpor liquidacionimpuestoimporLocal) throws Exception {
		
		if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				liquidacionimpuestoimporLocal.setDetalleLiquidacionImpuestoImpors(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
			
			} else {
			
				liquidacionimpuestoimporLocal.setDetalleLiquidacionImpuestoImpors(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimpors);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LiquidacionImpuestoImpor liquidacionimpuestoimporLocal) throws Exception {	
		if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PedidoCompraImporDetalleFormJInternalFrame.class)) {
				PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrameLocal=(PedidoCompraImporBeanSwingJInternalFrame) ((PedidoCompraImporDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				pedidocompraimporBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPedidoCompraImpor(pedidocompraimporBeanSwingJInternalFrameLocal.getpedidocompraimpor(),true);
				pedidocompraimporBeanSwingJInternalFrameLocal.actualizarLista(pedidocompraimporBeanSwingJInternalFrameLocal.pedidocompraimpor,this.pedidocompraimporsForeignKey);

				pedidocompraimporBeanSwingJInternalFrameLocal.actualizarRelaciones(pedidocompraimporBeanSwingJInternalFrameLocal.pedidocompraimpor);

				liquidacionimpuestoimporLocal.setPedidoCompraImpor(pedidocompraimporBeanSwingJInternalFrameLocal.pedidocompraimpor);

				this.addItemDefectoCombosForeignKeyPedidoCompraImpor();
				this.cargarCombosFramePedidoCompraImporsForeignKey("Formulario");
				this.setActualPedidoCompraImporForeignKey(pedidocompraimporBeanSwingJInternalFrameLocal.pedidocompraimpor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				liquidacionimpuestoimporLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				liquidacionimpuestoimporLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				liquidacionimpuestoimporLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				liquidacionimpuestoimporLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLiquidacionImpuestoImporActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = liquidacionimpuestoimporValidator.getInvalidValues(this.liquidacionimpuestoimpor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LiquidacionImpuestoImpor liquidacionimpuestoimpor,List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors) throws Exception {
		try	{		
			LiquidacionImpuestoImporConstantesFunciones.actualizarLista(liquidacionimpuestoimpor,liquidacionimpuestoimpors,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LiquidacionImpuestoImpor liquidacionimpuestoimpor,List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors) throws Exception {
		try	{			
			LiquidacionImpuestoImporConstantesFunciones.actualizarSelectedLista(liquidacionimpuestoimpor,liquidacionimpuestoimpors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				liquidacionimpuestoimporsLocal=this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				liquidacionimpuestoimporsLocal=this.liquidacionimpuestoimpors;
			}
			//ARCHITECTURE
		
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporLocal:liquidacionimpuestoimporsLocal) {
				if(this.permiteMantenimiento(liquidacionimpuestoimporLocal) && liquidacionimpuestoimporLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.getLiquidacionImpuestoImporLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.IDPEDIDOCOMPRAIMPOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_empresaLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_sucursalLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_clienteLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_facturaLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelnumero_comprobanteLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.NUMERODUI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelnumero_duiLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfechaLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.FECHAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfecha_pagoLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.FOB)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfobLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.SEGURO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelseguroLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfleteLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.PORCENTAJEFODI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelporcentaje_fodiLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.PORCENTAJEIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelporcentaje_ivaLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.TASACONTROL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabeltasa_controlLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.CFR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelcfrLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.CIF)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelcifLiquidacionImpuestoImpor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LiquidacionImpuestoImporConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabeltotalLiquidacionImpuestoImpor,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_pedido_compra_imporLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_empresaLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_sucursalLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_clienteLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelid_facturaLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelnumero_comprobanteLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelnumero_duiLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfechaLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfecha_pagoLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfobLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelseguroLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfleteLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelporcentaje_fodiLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelporcentaje_ivaLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabeltasa_controlLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelcfrLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelcifLiquidacionImpuestoImpor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabeltotalLiquidacionImpuestoImpor,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleLiquidacionImpuestoImpor")) {
			if(this.liquidacionimpuestoimpor==null) {
				this.liquidacionimpuestoimpor= new LiquidacionImpuestoImpor();
			}

			if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLiquidacionImpuestoImpor
				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);

				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getdetalleliquidacionimpuestoimpor().setLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoLiquidacionImpuestoImpor--;	
		
		
		this.liquidacionimpuestoimporAux=new LiquidacionImpuestoImpor();
		
		this.liquidacionimpuestoimporAux.setId(this.iIdNuevoLiquidacionImpuestoImpor);
		this.liquidacionimpuestoimporAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().add(this.liquidacionimpuestoimporAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.liquidacionimpuestoimpors.add(this.liquidacionimpuestoimporAux);
		}
		//ARCHITECTURE
		
		this.liquidacionimpuestoimpor=this.liquidacionimpuestoimporAux;
		
		if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
			this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
		}
				
		//this.setDefaultControlesLiquidacionImpuestoImpor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLiquidacionImpuestoImpor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLiquidacionImpuestoImpor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLiquidacionImpuestoImpor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimporBean,this.liquidacionimpuestoimpor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
			classes=LiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsOfLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.liquidacionimpuestoimporReturnGeneral=liquidacionimpuestoimporLogic.procesarEventosLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),this.liquidacionimpuestoimpor,this.liquidacionimpuestoimporParameterGeneral,this.isEsNuevoLiquidacionImpuestoImpor,classes);//this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral,this.liquidacionimpuestoimporBean,false);
		
		if(this.liquidacionimpuestoimporReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor());
		}
		
		if(this.liquidacionimpuestoimporReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor(),classes);//this.liquidacionimpuestoimporBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLiquidacionImpuestoImpor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLiquidacionImpuestoImpor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.RecargarFormLiquidacionImpuestoImpor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
						
			if(liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() && DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleLiquidacionImpuestoImporActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLiquidacionImpuestoImpor();
			}
			
			this.actualizarVisualTableDatosLiquidacionImpuestoImpor();
			
			this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpuestoImpor(), this.getIndiceNuevoLiquidacionImpuestoImpor());
			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
						
			this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLiquidacionImpuestoImpor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarnumero_duiLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarfechaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarfecha_pagoLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarfobLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarseguroLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarfleteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activartasa_controlLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarcfrLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarcifLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activartotalLiquidacionImpuestoImpor);	
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarid_pedido_compra_imporLiquidacionImpuestoImpor);//
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarid_empresaLiquidacionImpuestoImpor);//
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarid_sucursalLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarid_clienteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setEnabled(isHabilitar && this.liquidacionimpuestoimporConstantesFunciones.activarid_facturaLiquidacionImpuestoImpor);
	};
	
	public void setDefaultControlesLiquidacionImpuestoImpor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLiquidacionImpuestoImpor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(true);			
			this.liquidacionimpuestoimporSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(false);			
			this.liquidacionimpuestoimporSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoLiquidacionImpuestoImpor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
				if(liquidacionimpuestoimporAux.getId().equals(this.iIdNuevoLiquidacionImpuestoImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimpors) {
				if(liquidacionimpuestoimporAux.getId().equals(this.iIdNuevoLiquidacionImpuestoImpor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
				if(liquidacionimpuestoimporAux.getId().equals(liquidacionimpuestoimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimpors) {
				if(liquidacionimpuestoimporAux.getId().equals(liquidacionimpuestoimpor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimporOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
				if(liquidacionimpuestoimporAux.getLiquidacionImpuestoImporOriginal().getId().equals(liquidacionimpuestoimporOriginal.getId())) {
					existe=true;
					liquidacionimpuestoimporOriginal.setId(liquidacionimpuestoimporAux.getId());
					liquidacionimpuestoimporOriginal.setVersionRow(liquidacionimpuestoimporAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimpors) {
				if(liquidacionimpuestoimporAux.getLiquidacionImpuestoImporOriginal().getId().equals(liquidacionimpuestoimporOriginal.getId())) {
					existe=true;
					liquidacionimpuestoimporOriginal.setId(liquidacionimpuestoimporAux.getId());
					liquidacionimpuestoimporOriginal.setVersionRow(liquidacionimpuestoimporAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLiquidacionImpuestoImpor(Boolean esParaCancelar) throws Exception {
		liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
		liquidacionimpuestoimporAux=new LiquidacionImpuestoImpor();
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
					if(liquidacionimpuestoimporAux.getId()<0) {
						liquidacionimpuestoimporsAux.add(liquidacionimpuestoimporAux);
					}		
				}
				this.iIdNuevoLiquidacionImpuestoImpor=0L;
				this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().removeAll(liquidacionimpuestoimporsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimpors) {
					if(liquidacionimpuestoimporAux.getId()<0) {
						liquidacionimpuestoimporsAux.add(liquidacionimpuestoimporAux);
					}		
				}
				this.iIdNuevoLiquidacionImpuestoImpor=0L;
				this.liquidacionimpuestoimpors.removeAll(liquidacionimpuestoimporsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLiquidacionImpuestoImpor 
					&& this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()>0
					) {
					liquidacionimpuestoimporAux=this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().get(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size() - 1);
				
					if(liquidacionimpuestoimporAux.getId()<0) {
						this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().remove(liquidacionimpuestoimporAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLiquidacionImpuestoImpor && this.liquidacionimpuestoimpors.size()>0) {
					liquidacionimpuestoimporAux=this.liquidacionimpuestoimpors.get(this.liquidacionimpuestoimpors.size() - 1);
				
					if(liquidacionimpuestoimporAux.getId()<0) {
						this.liquidacionimpuestoimpors.remove(liquidacionimpuestoimporAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLiquidacionImpuestoImpor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(liquidacionimpuestoimpor.getId()<0) {
				this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().remove(this.liquidacionimpuestoimpor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(liquidacionimpuestoimpor.getId()<0) {
				this.liquidacionimpuestoimpors.remove(this.liquidacionimpuestoimpor);
			}
		}			
	}
	
	public void setEstadosInicialesLiquidacionImpuestoImpor(List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsAux) throws Exception {
		LiquidacionImpuestoImporConstantesFunciones.setEstadosInicialesLiquidacionImpuestoImpor(liquidacionimpuestoimporsAux);
	}
	
	public void setEstadosInicialesLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimporAux) throws Exception {
		LiquidacionImpuestoImporConstantesFunciones.setEstadosInicialesLiquidacionImpuestoImpor(liquidacionimpuestoimporAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLiquidacionImpuestoImporActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLiquidacionImpuestoImporActual()) {
				if(!this.isEsNuevoLiquidacionImpuestoImpor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLiquidacionImpuestoImpor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLiquidacionImpuestoImporActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Liquidacion Impuesto Impor ?", "MANTENIMIENTO DE Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LiquidacionImpuestoImpor liquidacionimpuestoimpor) throws Exception {
		LiquidacionImpuestoImporConstantesFunciones.seleccionarAsignar(this.liquidacionimpuestoimpor,liquidacionimpuestoimpor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLiquidacionImpuestoImpor=this.isPermisoActualizarOriginalLiquidacionImpuestoImpor;
			
			
			this.seleccionarAsignar(liquidacionimpuestoimpor);
			
			

			idClienteActual=liquidacionimpuestoimpor.getid_cliente();
			this.seleccionarClienteActual();

			idFacturaActual=liquidacionimpuestoimpor.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LiquidacionImpuestoImporConstantesFunciones.quitarEspaciosLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.liquidacionimpuestoimporSessionBean.setsFuncionBusquedaRapida(this.liquidacionimpuestoimporSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLiquidacionImpuestoImpor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLiquidacionImpuestoImpor(esParaCancelar);				
				this.cancelarNuevoLiquidacionImpuestoImpor(esParaCancelar);								
			}
			
			this.liquidacionimpuestoimpor=new LiquidacionImpuestoImpor();
			
			this.inicializarLiquidacionImpuestoImpor();
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLiquidacionImpuestoImpor() throws Exception {
		try {
			LiquidacionImpuestoImporConstantesFunciones.inicializarLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLiquidacionImpuestoImpors(String sAccionBusqueda,List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="LiquidacionImpuestoImpor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LiquidacionImpuestoImporMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LiquidacionImpuestoImporMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LiquidacionImpuestoImpor"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Liquidacion Impuesto Impores");		
		parameters.put("busquedapor", LiquidacionImpuestoImporConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleLiquidacionImpuestoImpor.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					LiquidacionImpuestoImporLogic liquidacionimpuestoimporLogicAuxiliar=new LiquidacionImpuestoImporLogic();
					liquidacionimpuestoimporLogicAuxiliar.setDatosCliente(liquidacionimpuestoimporLogic.getDatosCliente());				
					liquidacionimpuestoimporLogicAuxiliar.setLiquidacionImpuestoImpors(liquidacionimpuestoimporsParaReportes);
					
					liquidacionimpuestoimporLogicAuxiliar.cargarRelacionesLoteForeignKeyLiquidacionImpuestoImporWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					liquidacionimpuestoimporsParaReportes=liquidacionimpuestoimporLogicAuxiliar.getLiquidacionImpuestoImpors();
					
					//liquidacionimpuestoimporLogic.getNewConnexionToDeep();
					
					//for (LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsParaReportes) {
					//	liquidacionimpuestoimporLogic.deepLoad(liquidacionimpuestoimpor, false, DeepLoadType.INCLUDE, classes);
					//}						
					//liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleLiquidacionImpuestoImpor = AuxiliarReportes.class.getResourceAsStream("DetalleLiquidacionImpuestoImporDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleliquidacionimpuestoimpor", reportFileDetalleLiquidacionImpuestoImpor);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLiquidacionImpuestoImpor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LiquidacionImpuestoImporConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLiquidacionImpuestoImpor=new JRBeanArrayDataSource(LiquidacionImpuestoImporJInternalFrame.TraerLiquidacionImpuestoImporBeans(liquidacionimpuestoimporsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLiquidacionImpuestoImpor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LiquidacionImpuestoImporConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LiquidacionImpuestoImporConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LiquidacionImpuestoImporBean.TraerLiquidacionImpuestoImporBeans(liquidacionimpuestoimporsParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimpuestoimporsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimpuestoimporsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImporActionPerformed(null);
					//this.generarExcelReporteLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimpuestoimporsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimpuestoimporsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimpuestoimporsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLiquidacionImpuestoImpors(sAccionBusqueda,sTipoArchivoReporte,liquidacionimpuestoimporsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLiquidacionImpuestoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LiquidacionImpuestoImpors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLiquidacionImpuestoImpor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LiquidacionImpuestoImpor liquidacionimpuestoimpor : liquidacionimpuestoimporsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LiquidacionImpuestoImporConstantesFunciones.generarExcelReporteDataLiquidacionImpuestoImpor("NORMAL",row,workbook,liquidacionimpuestoimpor,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLiquidacionImpuestoImpor(String sTipo,Row row,Workbook workbook) {
		
		LiquidacionImpuestoImporConstantesFunciones.generarExcelReporteHeaderLiquidacionImpuestoImpor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLiquidacionImpuestoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LiquidacionImpuestoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LiquidacionImpuestoImpor liquidacionimpuestoimpor : liquidacionimpuestoimporsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.getLiquidacionImpuestoImporDescripcion(liquidacionimpuestoimpor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getpedidocompraimpor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getnumero_dui());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getfecha_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getfob());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getseguro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getporcentaje_fodi());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getporcentaje_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.gettasa_control());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getcfr());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.getcif());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(liquidacionimpuestoimpor.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLiquidacionImpuestoImpors(String sAccionBusqueda,String sTipoArchivoReporte,List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsRespaldo=null;
		
		classes=LiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsOfLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.liquidacionimpuestoimporLogic.setDatosCliente(this.datosCliente);
		this.liquidacionimpuestoimporLogic.setDatosDeep(this.datosDeep);
		this.liquidacionimpuestoimporLogic.setIsConDeep(true);
		
		liquidacionimpuestoimporsRespaldo=this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors();
		
		this.liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(liquidacionimpuestoimporsParaReportes);	
		this.liquidacionimpuestoimporLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		liquidacionimpuestoimporsParaReportes=this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors();
		this.liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(liquidacionimpuestoimporsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LiquidacionImpuestoImpors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLiquidacionImpuestoImpor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LiquidacionImpuestoImpor liquidacionimpuestoimpor : liquidacionimpuestoimporsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLiquidacionImpuestoImpor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LiquidacionImpuestoImporConstantesFunciones.generarExcelReporteDataLiquidacionImpuestoImpor("NORMAL",row,workbook,liquidacionimpuestoimpor,cellStyleDataAux);
		
			
			


				//DetalleLiquidacionImpuestoImpor
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO))) {

				if(liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors()!=null && liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleLiquidacionImpuestoImporConstantesFunciones.generarExcelReporteHeaderDetalleLiquidacionImpuestoImpor("RELACIONADO",row,workbook);
				}

				if(liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors()!=null) {
					i2=0;
					for(DetalleLiquidacionImpuestoImpor detalleliquidacionimpuestoimpor : liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleLiquidacionImpuestoImporConstantesFunciones.generarExcelReporteDataDetalleLiquidacionImpuestoImpor("RELACIONADO",row,workbook,detalleliquidacionimpuestoimpor,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.getLiquidacionImpuestoImporDescripcion(liquidacionimpuestoimpor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLiquidacionImpuestoImpor() throws Exception {		
		this.startProcessLiquidacionImpuestoImpor(true);
	}
	
	public void startProcessLiquidacionImpuestoImpor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLiquidacionImpuestoImpor ,this.jPanelParametrosReportesLiquidacionImpuestoImpor, this.jScrollPanelDatosLiquidacionImpuestoImpor,this.jPanelPaginacionLiquidacionImpuestoImpor, this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor, this.jPanelAccionesLiquidacionImpuestoImpor,this.jPanelAccionesFormularioLiquidacionImpuestoImpor,this.jmenuBarLiquidacionImpuestoImpor,this.jmenuBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasLiquidacionImpuestoImpor=this.jTabbedPaneBusquedasLiquidacionImpuestoImpor; 
		
		final JPanel jPanelParametrosReportesLiquidacionImpuestoImpor=this.jPanelParametrosReportesLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosLiquidacionImpuestoImpor=this.jScrollPanelDatosLiquidacionImpuestoImpor;
		final JTable jTableDatosLiquidacionImpuestoImpor=this.jTableDatosLiquidacionImpuestoImpor;		
		final JPanel jPanelPaginacionLiquidacionImpuestoImpor=this.jPanelPaginacionLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosEdicionLiquidacionImpuestoImpor=this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesLiquidacionImpuestoImpor=this.jPanelAccionesLiquidacionImpuestoImpor;
		
		JPanel jPanelCamposAuxiliarLiquidacionImpuestoImpor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLiquidacionImpuestoImpor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			jPanelCamposAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelCamposLiquidacionImpuestoImpor;
			jPanelAccionesFormularioAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelAccionesFormularioLiquidacionImpuestoImpor;
		}
		
		final JPanel jPanelCamposLiquidacionImpuestoImpor=jPanelCamposAuxiliarLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesFormularioLiquidacionImpuestoImpor=jPanelAccionesFormularioAuxiliarLiquidacionImpuestoImpor;
		
		
		final JMenuBar jmenuBarLiquidacionImpuestoImpor=this.jmenuBarLiquidacionImpuestoImpor;
		final JToolBar jTtoolBarLiquidacionImpuestoImpor=this.jTtoolBarLiquidacionImpuestoImpor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLiquidacionImpuestoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLiquidacionImpuestoImpor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			jmenuBarDetalleAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jmenuBarDetalleLiquidacionImpuestoImpor;
			jTtoolBarDetalleAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTtoolBarDetalleLiquidacionImpuestoImpor;
		}
		
		final JMenuBar jmenuBarDetalleLiquidacionImpuestoImpor=jmenuBarDetalleAuxiliarLiquidacionImpuestoImpor;
		final JToolBar jTtoolBarDetalleLiquidacionImpuestoImpor=jTtoolBarDetalleAuxiliarLiquidacionImpuestoImpor;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLiquidacionImpuestoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLiquidacionImpuestoImpor;
			processRunnable.jTableDatos=jTableDatosLiquidacionImpuestoImpor;
			processRunnable.jPanelCampos=jPanelCamposLiquidacionImpuestoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionLiquidacionImpuestoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesLiquidacionImpuestoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLiquidacionImpuestoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarLiquidacionImpuestoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jTtoolBar=jTtoolBarLiquidacionImpuestoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLiquidacionImpuestoImpor ,jPanelParametrosReportesLiquidacionImpuestoImpor,jTableDatosLiquidacionImpuestoImpor, /*jScrollPanelDatosLiquidacionImpuestoImpor,*/jPanelCamposLiquidacionImpuestoImpor,jPanelPaginacionLiquidacionImpuestoImpor, /*jScrollPanelDatosEdicionLiquidacionImpuestoImpor,*/ jPanelAccionesLiquidacionImpuestoImpor,jPanelAccionesFormularioLiquidacionImpuestoImpor,jmenuBarLiquidacionImpuestoImpor,jmenuBarDetalleLiquidacionImpuestoImpor,jTtoolBarLiquidacionImpuestoImpor,jTtoolBarDetalleLiquidacionImpuestoImpor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLiquidacionImpuestoImpor ,jPanelParametrosReportesLiquidacionImpuestoImpor, jScrollPanelDatosLiquidacionImpuestoImpor,jPanelPaginacionLiquidacionImpuestoImpor, jScrollPanelDatosEdicionLiquidacionImpuestoImpor, jPanelAccionesLiquidacionImpuestoImpor,jPanelAccionesFormularioLiquidacionImpuestoImpor,jmenuBarLiquidacionImpuestoImpor,jmenuBarDetalleLiquidacionImpuestoImpor,jTtoolBarLiquidacionImpuestoImpor,jTtoolBarDetalleLiquidacionImpuestoImpor);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessLiquidacionImpuestoImpor() {// throws Exception 
		this.finishProcessLiquidacionImpuestoImpor(true);
	}
	
	public void finishProcessLiquidacionImpuestoImpor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLiquidacionImpuestoImpor ,this.jPanelParametrosReportesLiquidacionImpuestoImpor, this.jScrollPanelDatosLiquidacionImpuestoImpor,this.jPanelPaginacionLiquidacionImpuestoImpor, this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor, this.jPanelAccionesLiquidacionImpuestoImpor,this.jPanelAccionesFormularioLiquidacionImpuestoImpor,this.jmenuBarLiquidacionImpuestoImpor,this.jmenuBarDetalleLiquidacionImpuestoImpor,this.jTtoolBarLiquidacionImpuestoImpor,this.jTtoolBarDetalleLiquidacionImpuestoImpor);		
		
		final JTabbedPane jTabbedPaneBusquedasLiquidacionImpuestoImpor=this.jTabbedPaneBusquedasLiquidacionImpuestoImpor; 
		
		final JPanel jPanelParametrosReportesLiquidacionImpuestoImpor=this.jPanelParametrosReportesLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosLiquidacionImpuestoImpor=this.jScrollPanelDatosLiquidacionImpuestoImpor;
		final JTable jTableDatosLiquidacionImpuestoImpor=this.jTableDatosLiquidacionImpuestoImpor;		
		final JPanel jPanelPaginacionLiquidacionImpuestoImpor=this.jPanelPaginacionLiquidacionImpuestoImpor;
		//final JScrollPane jScrollPanelDatosEdicionLiquidacionImpuestoImpor=this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesLiquidacionImpuestoImpor=this.jPanelAccionesLiquidacionImpuestoImpor;
		
		JPanel jPanelCamposAuxiliarLiquidacionImpuestoImpor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLiquidacionImpuestoImpor=new JPanel();
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			jPanelCamposAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelCamposLiquidacionImpuestoImpor;
			jPanelAccionesFormularioAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelAccionesFormularioLiquidacionImpuestoImpor;
		}
		
		final JPanel jPanelCamposLiquidacionImpuestoImpor=jPanelCamposAuxiliarLiquidacionImpuestoImpor;
		final JPanel jPanelAccionesFormularioLiquidacionImpuestoImpor=jPanelAccionesFormularioAuxiliarLiquidacionImpuestoImpor;
		
		
		final JMenuBar jmenuBarLiquidacionImpuestoImpor=this.jmenuBarLiquidacionImpuestoImpor;		
		final JToolBar jTtoolBarLiquidacionImpuestoImpor=this.jTtoolBarLiquidacionImpuestoImpor;
				
		JMenuBar jmenuBarDetalleAuxiliarLiquidacionImpuestoImpor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLiquidacionImpuestoImpor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			jmenuBarDetalleAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jmenuBarDetalleLiquidacionImpuestoImpor;
			jTtoolBarDetalleAuxiliarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTtoolBarDetalleLiquidacionImpuestoImpor;		
		}
		
		final JMenuBar jmenuBarDetalleLiquidacionImpuestoImpor=jmenuBarDetalleAuxiliarLiquidacionImpuestoImpor;
		final JToolBar jTtoolBarDetalleLiquidacionImpuestoImpor=jTtoolBarDetalleAuxiliarLiquidacionImpuestoImpor;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLiquidacionImpuestoImpor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLiquidacionImpuestoImpor;
			processRunnable.jTableDatos=jTableDatosLiquidacionImpuestoImpor;
			processRunnable.jPanelCampos=jPanelCamposLiquidacionImpuestoImpor;
			processRunnable.jPanelPaginacion=jPanelPaginacionLiquidacionImpuestoImpor;
			processRunnable.jPanelAcciones=jPanelAccionesLiquidacionImpuestoImpor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLiquidacionImpuestoImpor;
			
			
			processRunnable.jmenuBar=jmenuBarLiquidacionImpuestoImpor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jTtoolBar=jTtoolBarLiquidacionImpuestoImpor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLiquidacionImpuestoImpor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLiquidacionImpuestoImpor ,jPanelParametrosReportesLiquidacionImpuestoImpor, jTableDatosLiquidacionImpuestoImpor,/*jScrollPanelDatosLiquidacionImpuestoImpor,*/jPanelCamposLiquidacionImpuestoImpor,jPanelPaginacionLiquidacionImpuestoImpor, /*jScrollPanelDatosEdicionLiquidacionImpuestoImpor,*/ jPanelAccionesLiquidacionImpuestoImpor,jPanelAccionesFormularioLiquidacionImpuestoImpor,jmenuBarLiquidacionImpuestoImpor,jmenuBarDetalleLiquidacionImpuestoImpor,jTtoolBarLiquidacionImpuestoImpor,jTtoolBarDetalleLiquidacionImpuestoImpor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLiquidacionImpuestoImpor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLiquidacionImpuestoImpor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLiquidacionImpuestoImpor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLiquidacionImpuestoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLiquidacionImpuestoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLiquidacionImpuestoImpor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLiquidacionImpuestoImpor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLiquidacionImpuestoImpor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLiquidacionImpuestoImpor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.liquidacionimpuestoimporConstantesFunciones.getsFinalQueryLiquidacionImpuestoImpor();
		String  finalQueryPaginacionTodos=this.liquidacionimpuestoimporConstantesFunciones.getsFinalQueryLiquidacionImpuestoImpor();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=LiquidacionImpuestoImporConstantesFunciones.getArrayColumnasGlobalesNoLiquidacionImpuestoImpor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LiquidacionImpuestoImporConstantesFunciones.getArrayColumnasGlobalesLiquidacionImpuestoImpor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LiquidacionImpuestoImporConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.liquidacionimpuestoimporsEliminados= new ArrayList<LiquidacionImpuestoImpor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLiquidacionImpuestoImpor();
		
				///*LiquidacionImpuestoImporSessionBean*/this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			
			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=LiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LiquidacionImpuestoImporConstantesFunciones.getClassesForeignKeysOfLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/liquidacionimpuestoimpor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			liquidacionimpuestoimporsAux= new ArrayList<LiquidacionImpuestoImpor>();
			
				
			liquidacionimpuestoimporLogic.setDatosCliente(this.datosCliente);
			liquidacionimpuestoimporLogic.setDatosDeep(this.datosDeep);
			liquidacionimpuestoimporLogic.setIsConDeep(true);
			
			
			liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					liquidacionimpuestoimporLogic.getTodosLiquidacionImpuestoImpors(finalQueryGlobal,pagination);
					
					//liquidacionimpuestoimporLogic.getTodosLiquidacionImpuestoImporsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()==null|| liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							liquidacionimpuestoimporsAux= new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporsAux= new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimpors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							liquidacionimpuestoimporLogic.getTodosLiquidacionImpuestoImpors(finalQueryGlobal+"",this.pagination);												
							
							//liquidacionimpuestoimporLogic.getTodosLiquidacionImpuestoImporsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());					
							liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(liquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimpors.addAll(liquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLiquidacionImpuestoImpor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLiquidacionImpuestoImpor=this.idActual;
				
				} else if(this.idLiquidacionImpuestoImporActual!=null && this.idLiquidacionImpuestoImporActual!=0L) {
					idLiquidacionImpuestoImpor=idLiquidacionImpuestoImporActual;
				}
				
					
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndicePorId(idLiquidacionImpuestoImpor);
				
				this.liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					liquidacionimpuestoimporLogic.getEntity(idLiquidacionImpuestoImpor);
					
					//liquidacionimpuestoimporLogic.getEntityWithConnection(idLiquidacionImpuestoImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().add(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
					this.liquidacionimpuestoimpors.add(liquidacionimpuestoimpor);
				}
				
				if(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()==null||liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpuestoimpors==null|| liquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
						liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpuestoImpors("FK_IdCliente",liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpuestoImpors("FK_IdCliente",liquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());
						liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(liquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimpors.addAll(liquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()==null||liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpuestoimpors==null|| liquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
						liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpuestoImpors("FK_IdEmpresa",liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpuestoImpors("FK_IdEmpresa",liquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());
						liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(liquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimpors.addAll(liquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()==null||liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpuestoimpors==null|| liquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
						liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpuestoImpors("FK_IdFactura",liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpuestoImpors("FK_IdFactura",liquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());
						liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(liquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimpors.addAll(liquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPedidoCompraImpor")) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdPedidoCompraImpor(id_pedido_compra_imporFK_IdPedidoCompraImpor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdPedidoCompraImpor(finalQueryGlobal,pagination,id_pedido_compra_imporFK_IdPedidoCompraImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdPedidoCompraImpor(id_pedido_compra_imporFK_IdPedidoCompraImpor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdPedidoCompraImpor(id_pedido_compra_imporFK_IdPedidoCompraImpor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()==null||liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpuestoimpors==null|| liquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
						liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdPedidoCompraImpor(finalQueryGlobal,pagination,id_pedido_compra_imporFK_IdPedidoCompraImpor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdPedidoCompraImpor(id_pedido_compra_imporFK_IdPedidoCompraImpor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdPedidoCompraImpor(id_pedido_compra_imporFK_IdPedidoCompraImpor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpuestoImpors("FK_IdPedidoCompraImpor",liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpuestoImpors("FK_IdPedidoCompraImpor",liquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());
						liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(liquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimpors.addAll(liquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()==null||liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=liquidacionimpuestoimpors==null|| liquidacionimpuestoimpors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
						liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporsAux=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimporsAux.addAll(liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LiquidacionImpuestoImporConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLiquidacionImpuestoImpors("FK_IdSucursal",liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLiquidacionImpuestoImpors("FK_IdSucursal",liquidacionimpuestoimpors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(new ArrayList<LiquidacionImpuestoImpor>());
						liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().addAll(liquidacionimpuestoimporsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
							liquidacionimpuestoimpors.addAll(liquidacionimpuestoimporsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLiquidacionImpuestoImpor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLiquidacionImpuestoImpor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=liquidacionimpuestoimpors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=liquidacionimpuestoimpors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LiquidacionImpuestoImpor liquidacionimpuestoimpor) {
		Boolean permite=true;
		
		if(this.liquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LiquidacionImpuestoImporConstantesFunciones.getOrderByListaLiquidacionImpuestoImpor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LiquidacionImpuestoImporConstantesFunciones.getOrderByListaLiquidacionImpuestoImpor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
				if(liquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimpuestoimporTotales=liquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:this.liquidacionimpuestoimpors) {
				if(liquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimpuestoimporTotales=liquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.liquidacionimpuestoimporAux=new LiquidacionImpuestoImpor();
			this.liquidacionimpuestoimporAux.setsType(Constantes2.S_TOTALES);
			this.liquidacionimpuestoimporAux.setIsNew(false);
			this.liquidacionimpuestoimporAux.setIsChanged(false);
			this.liquidacionimpuestoimporAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpuestoImpor(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),this.liquidacionimpuestoimporAux);
				
				this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().add(this.liquidacionimpuestoimporAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpuestoImpor(this.liquidacionimpuestoimpors,this.liquidacionimpuestoimporAux);
				
				this.liquidacionimpuestoimpors.add(this.liquidacionimpuestoimporAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		liquidacionimpuestoimporTotales=new LiquidacionImpuestoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().remove(liquidacionimpuestoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.liquidacionimpuestoimpors.remove(liquidacionimpuestoimporTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		liquidacionimpuestoimporTotales=new LiquidacionImpuestoImpor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
				if(liquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimpuestoimporTotales=liquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpuestoImpor(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),liquidacionimpuestoimporTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:this.liquidacionimpuestoimpors) {
				if(liquidacionimpuestoimpor.getsType().equals(Constantes2.S_TOTALES)) {
					liquidacionimpuestoimporTotales=liquidacionimpuestoimpor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LiquidacionImpuestoImporConstantesFunciones.TotalizarValoresFilaLiquidacionImpuestoImpor(this.liquidacionimpuestoimpors,liquidacionimpuestoimporTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLiquidacionImpuestoImporsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdPedidoCompraImpor()throws Exception {
		try {
			sAccionBusqueda="FK_IdPedidoCompraImpor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLiquidacionImpuestoImporsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdPedidoCompraImpor(String sFinalQuery,Long id_pedido_compra_impor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdPedidoCompraImpor(sFinalQuery,this.pagination,id_pedido_compra_impor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLiquidacionImpuestoImporsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLogic.getLiquidacionImpuestoImporsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosLiquidacionImpuestoImpor() {
		this.isPermisoTodoLiquidacionImpuestoImpor=false;
		this.isPermisoNuevoLiquidacionImpuestoImpor=false;
		this.isPermisoActualizarLiquidacionImpuestoImpor=false;
		this.isPermisoActualizarOriginalLiquidacionImpuestoImpor=false;
		this.isPermisoEliminarLiquidacionImpuestoImpor=false;
		this.isPermisoGuardarCambiosLiquidacionImpuestoImpor=false;
		this.isPermisoConsultaLiquidacionImpuestoImpor=false;
		this.isPermisoBusquedaLiquidacionImpuestoImpor=false;
		this.isPermisoReporteLiquidacionImpuestoImpor=false;		
		this.isPermisoOrdenLiquidacionImpuestoImpor=false;		
		this.isPermisoPaginacionMedioLiquidacionImpuestoImpor=false;		
		this.isPermisoPaginacionAltoLiquidacionImpuestoImpor=false;
		this.isPermisoPaginacionTodoLiquidacionImpuestoImpor=false;
		this.isPermisoCopiarLiquidacionImpuestoImpor=false;		
		this.isPermisoVerFormLiquidacionImpuestoImpor=false;		
		this.isPermisoDuplicarLiquidacionImpuestoImpor=false;		
		this.isPermisoOrdenLiquidacionImpuestoImpor=false;		
	}
	
	public void setPermisosUsuarioLiquidacionImpuestoImpor(Boolean isPermiso) {
		this.isPermisoTodoLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoNuevoLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarOriginalLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoEliminarLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoGuardarCambiosLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoConsultaLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoBusquedaLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoReporteLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoOrdenLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoPaginacionMedioLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoPaginacionAltoLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoPaginacionTodoLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoCopiarLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoVerFormLiquidacionImpuestoImpor=isPermiso;		
		this.isPermisoDuplicarLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoOrdenLiquidacionImpuestoImpor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLiquidacionImpuestoImpor(Boolean isPermiso) {
		//this.isPermisoTodoLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoNuevoLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoActualizarOriginalLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoEliminarLiquidacionImpuestoImpor=isPermiso;
		this.isPermisoGuardarCambiosLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoConsultaLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoBusquedaLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoReporteLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoOrdenLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoPaginacionMedioLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoPaginacionAltoLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoPaginacionTodoLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoCopiarLiquidacionImpuestoImpor=isPermiso;		
		//this.isPermisoDuplicarLiquidacionImpuestoImpor=isPermiso;
		//this.isPermisoOrdenLiquidacionImpuestoImpor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLiquidacionImpuestoImporClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleLiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION);
		
		if(LiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleLiquidacionImpuestoImpor=false;
		this.isTienePermisosDetalleLiquidacionImpuestoImpor=this.verificarGetPermisosUsuarioOpcionLiquidacionImpuestoImporClaseRelacionada(this.opcionsRelacionadas,DetalleLiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebLiquidacionImpuestoImpor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLiquidacionImpuestoImporClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleLiquidacionImpuestoImpor=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioLiquidacionImpuestoImporClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLiquidacionImpuestoImporClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLiquidacionImpuestoImporClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleLiquidacionImpuestoImpor && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.remove(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioLiquidacionImpuestoImpor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLiquidacionImpuestoImpor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLiquidacionImpuestoImpor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLiquidacionImpuestoImpor=this.isPermisoActualizarLiquidacionImpuestoImpor;
			this.isPermisoEliminarLiquidacionImpuestoImpor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLiquidacionImpuestoImpor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLiquidacionImpuestoImpor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLiquidacionImpuestoImpor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLiquidacionImpuestoImpor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLiquidacionImpuestoImpor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLiquidacionImpuestoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLiquidacionImpuestoImpor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLiquidacionImpuestoImpor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLiquidacionImpuestoImpor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLiquidacionImpuestoImpor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLiquidacionImpuestoImpor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLiquidacionImpuestoImpor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLiquidacionImpuestoImpor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLiquidacionImpuestoImpor.setToolTipText(this.jTableDatosLiquidacionImpuestoImpor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLiquidacionImpuestoImpor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLiquidacionImpuestoImpor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioLiquidacionImpuestoImpor() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleLiquidacionImpuestoImpor && this.liquidacionimpuestoimporConstantesFunciones.mostrarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor && !LiquidacionImpuestoImporConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Liquidacion Impuesto Impor");
			reporte.setsDescripcion("Detalle Liquidacion Impuesto Impor");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyLiquidacionImpuestoImporListas()throws Exception {
		try	{						
			
				this.pedidocompraimporsForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLiquidacionImpuestoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LiquidacionImpuestoImporJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLiquidacionImpuestoImporListas(false);
			} else {
			
				this.cargarCombosForeignKeyPedidoCompraImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPedidoCompraImporListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.pedidocompraimporsForeignKey==null||this.pedidocompraimporsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PedidoCompraImporConstantesFunciones.getArrayColumnasGlobalesPedidoCompraImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoCompraImporConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PedidoCompraImporConstantesFunciones.SFINALQUERY;

				this.cargarCombosPedidoCompraImporsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyLiquidacionImpuestoImporListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporReturnGeneral=new LiquidacionImpuestoImporParameterReturnGeneral();
						
			


				String finalQueryGlobalPedidoCompraImpor="";

				if(((this.pedidocompraimporsForeignKey==null||this.pedidocompraimporsForeignKey.size()<=0) && this.liquidacionimpuestoimporConstantesFunciones.cargarid_pedido_compra_imporLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.liquidacionimpuestoimporConstantesFunciones.cargarid_pedido_compra_imporLiquidacionImpuestoImpor)) {

					if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionPedidoCompraImpor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PedidoCompraImporConstantesFunciones.getArrayColumnasGlobalesPedidoCompraImpor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPedidoCompraImpor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoCompraImporConstantesFunciones.TABLENAME);

						finalQueryGlobalPedidoCompraImpor=Funciones.GetFinalQueryAppend(finalQueryGlobalPedidoCompraImpor, "");
						finalQueryGlobalPedidoCompraImpor+=PedidoCompraImporConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPedidoCompraImporsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPedidoCompraImpor=" WHERE " + ConstantesSql.ID + "="+liquidacionimpuestoimporSessionBean.getlidPedidoCompraImporActual();
					}
				} else {
					finalQueryGlobalPedidoCompraImpor="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.liquidacionimpuestoimporConstantesFunciones.cargarid_empresaLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.liquidacionimpuestoimporConstantesFunciones.cargarid_empresaLiquidacionImpuestoImpor)) {

					if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+liquidacionimpuestoimporSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.liquidacionimpuestoimporConstantesFunciones.cargarid_sucursalLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.liquidacionimpuestoimporConstantesFunciones.cargarid_sucursalLiquidacionImpuestoImpor)) {

					if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+liquidacionimpuestoimporSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.liquidacionimpuestoimporConstantesFunciones.cargarid_clienteLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.liquidacionimpuestoimporConstantesFunciones.cargarid_clienteLiquidacionImpuestoImpor)) {

					if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+liquidacionimpuestoimporSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.liquidacionimpuestoimporConstantesFunciones.cargarid_facturaLiquidacionImpuestoImpor)
					 || (this.esRecargarFks && this.liquidacionimpuestoimporConstantesFunciones.cargarid_facturaLiquidacionImpuestoImpor)) {

					if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+liquidacionimpuestoimporSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				liquidacionimpuestoimporReturnGeneral=liquidacionimpuestoimporLogic.cargarCombosLoteForeignKeyLiquidacionImpuestoImpor(finalQueryGlobalPedidoCompraImpor,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalFactura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPedidoCompraImpor.equals("NONE")) {
				this.pedidocompraimporsForeignKey=liquidacionimpuestoimporReturnGeneral.getpedidocompraimporsForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=liquidacionimpuestoimporReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=liquidacionimpuestoimporReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=liquidacionimpuestoimporReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=liquidacionimpuestoimporReturnGeneral.getfacturasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLiquidacionImpuestoImpor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPedidoCompraImpor();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyFactura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPedidoCompraImpor()throws Exception {
		try {
			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionPedidoCompraImpor()) {
				PedidoCompraImpor pedidocompraimpor=new PedidoCompraImpor();
				PedidoCompraImporConstantesFunciones.setPedidoCompraImporDescripcion(pedidocompraimpor,Constantes.SMENSAJE_ESCOJA_OPCION);
				pedidocompraimpor.setId(null);

				if(!PedidoCompraImporConstantesFunciones.ExisteEnLista(this.pedidocompraimporsForeignKey,pedidocompraimpor,true)) {

					this.pedidocompraimporsForeignKey.add(0,pedidocompraimpor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.liquidacionimpuestoimporSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyLiquidacionImpuestoImpor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLiquidacionImpuestoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLiquidacionImpuestoImpor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.liquidacionimpuestoimpor.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.liquidacionimpuestoimpor.setfecha_pago(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLiquidacionImpuestoImpor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor)throws Exception {	
		try {
			
			this.setActualPedidoCompraImporForeignKey(liquidacionimpuestoimpor.getid_pedido_compra_impor(),false,"Formulario");
			this.setActualClienteForeignKey(liquidacionimpuestoimpor.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(liquidacionimpuestoimpor.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,String sTipoEvento)throws Exception {	
		try {
			
			

				if(liquidacionimpuestoimpor.getCliente()!=null && !sTipoEvento.equals("id_clienteLiquidacionImpuestoImpor")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(liquidacionimpuestoimpor.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(liquidacionimpuestoimpor.getFactura()!=null && !sTipoEvento.equals("id_facturaLiquidacionImpuestoImpor")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(liquidacionimpuestoimpor.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLiquidacionImpuestoImpor()throws Exception {	
		try {
			
			this.setActualPedidoCompraImporForeignKey(this.liquidacionimpuestoimporConstantesFunciones.getid_pedido_compra_impor(),false,"Formulario");
			this.setActualClienteForeignKey(this.liquidacionimpuestoimporConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(this.liquidacionimpuestoimporConstantesFunciones.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLiquidacionImpuestoImpor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLiquidacionImpuestoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLiquidacionImpuestoImpor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLiquidacionImpuestoImpor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLiquidacionImpuestoImpor()throws Exception {
		try {
			

			this.cargarCombosFramePedidoCompraImporsForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLiquidacionImpuestoImpor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePedidoCompraImporsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLiquidacionImpuestoImpor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.getItemCount()>0) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public LiquidacionImpuestoImporBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean(); 
		this.liquidacionimpuestoimporConstantesFunciones=new LiquidacionImpuestoImporConstantesFunciones(); 
		this.liquidacionimpuestoimporBean=new LiquidacionImpuestoImpor();//(this.liquidacionimpuestoimporConstantesFunciones); 		
		this.liquidacionimpuestoimporReturnGeneral=new LiquidacionImpuestoImporParameterReturnGeneral(); 
		
		this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LiquidacionImpuestoImporBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLiquidacionImpuestoImpor(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.liquidacionimpuestoimporConstantesFunciones=new LiquidacionImpuestoImporConstantesFunciones(); 
			this.liquidacionimpuestoimporBean=new LiquidacionImpuestoImpor();//this.liquidacionimpuestoimporConstantesFunciones); 			
			this.liquidacionimpuestoimporReturnGeneral=new LiquidacionImpuestoImporParameterReturnGeneral(); 
		
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Liquidacion Impuesto Impor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.liquidacionimpuestoimpor=new LiquidacionImpuestoImpor();
			this.liquidacionimpuestoimpors = new ArrayList<LiquidacionImpuestoImpor>();
			this.liquidacionimpuestoimporsAux = new ArrayList<LiquidacionImpuestoImpor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic=new LiquidacionImpuestoImporLogic();
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.liquidacionimpuestoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.liquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor);	
					}
					
					if(this.jInternalFrameImportacionLiquidacionImpuestoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLiquidacionImpuestoImpor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLiquidacionImpuestoImpor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLiquidacionImpuestoImpor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor);
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor);
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setVisible(false);
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLiquidacionImpuestoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLiquidacionImpuestoImpor);
					this.jInternalFrameImportacionLiquidacionImpuestoImpor.setVisible(false);
					this.jInternalFrameImportacionLiquidacionImpuestoImpor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLiquidacionImpuestoImpor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLiquidacionImpuestoImpor);
					this.jInternalFrameOrderByLiquidacionImpuestoImpor.setVisible(false);
					this.jInternalFrameOrderByLiquidacionImpuestoImpor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLiquidacionImpuestoImporActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.liquidacionimpuestoimporReturnGeneral=new LiquidacionImpuestoImporParameterReturnGeneral();
			
			this.liquidacionimpuestoimporParameterGeneral=new LiquidacionImpuestoImporParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleLiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdPedidoCompraImpor=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLiquidacionImpuestoImpor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLiquidacionImpuestoImpor(false);
			
			this.setPermisosUsuarioLiquidacionImpuestoImpor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() 
				|| (this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() && this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLiquidacionImpuestoImporClasesRelacionadas();
			}
			
			if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLiquidacionImpuestoImporClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLiquidacionImpuestoImpor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLiquidacionImpuestoImpor();
			}
			
			if(!this.isPermisoBusquedaLiquidacionImpuestoImpor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLiquidacionImpuestoImpor,this.isPermisoPaginacionMedioLiquidacionImpuestoImpor,this.isPermisoPaginacionTodoLiquidacionImpuestoImpor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarLiquidacionImpuestoImpor());
				
				this.tiposColumnasSelect=LiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarLiquidacionImpuestoImpor(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectLiquidacionImpuestoImpor();				
				//this.tiposRelacionesSelect=LiquidacionImpuestoImporConstantesFunciones.getTiposRelacionesLiquidacionImpuestoImpor(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLiquidacionImpuestoImpor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioLiquidacionImpuestoImpor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioLiquidacionImpuestoImpor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpuestoImpor() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.detalleliquidacionimpuestoimporLogic=new DetalleLiquidacionImpuestoImporLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.pedidocompraimporLogic=new PedidoCompraImporLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			this.facturaLogic=new FacturaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				liquidacionimpuestoimporImplementable= (LiquidacionImpuestoImporImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LiquidacionImpuestoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				liquidacionimpuestoimporImplementableHome= (LiquidacionImpuestoImporImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LiquidacionImpuestoImporConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.liquidacionimpuestoimpors= new ArrayList<LiquidacionImpuestoImpor>();
			this.liquidacionimpuestoimporsEliminados= new ArrayList<LiquidacionImpuestoImpor>();
						
			this.isEsNuevoLiquidacionImpuestoImpor=false;
			this.esParaAccionDesdeFormularioLiquidacionImpuestoImpor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.pedidocompraimporsForeignKey=new ArrayList<PedidoCompraImpor>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLiquidacionImpuestoImpor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLiquidacionImpuestoImpor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLiquidacionImpuestoImpor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLiquidacionImpuestoImpor();
			}
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLiquidacionImpuestoImpor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LiquidacionImpuestoImpor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLiquidacionImpuestoImpor() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLiquidacionImpuestoImpor")) {
				iIndex=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Liquidacion Impuesto Impores")) {
					if(!DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLiquidacionImpuestoImpor();

						this.cargarParteTabPanelRelacionadaDetalleLiquidacionImpuestoImpor(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLiquidacionImpuestoImpor();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleLiquidacionImpuestoImpor(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpuestoImpor(false,true,iIndex);
		this.jButtonDetalleLiquidacionImpuestoImporActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleLiquidacionImpuestoImpor();

		//this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.updateUI();
		//this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleLiquidacionImpuestoImpor")) {
				int row=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
				jButtonDetalleLiquidacionImpuestoImporActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Liquidacion Impuesto Impor")) {

					if(this.isTienePermisosDetalleLiquidacionImpuestoImpor && this.liquidacionimpuestoimporConstantesFunciones.mostrarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor && !LiquidacionImpuestoImporConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Liquidacion Impuesto Impores"+"("+DetalleLiquidacionImpuestoImporConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Liquidacion Impuesto Impores");

						if(liquidacionimpuestoimporConstantesFunciones.resaltarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(liquidacionimpuestoimporConstantesFunciones.resaltarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor);
						}

						jmenuItem.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleLiquidacionImpuestoImpor"));

						

						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jmenuDetalleLiquidacionImpuestoImpor.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyLiquidacionImpuestoImpor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLiquidacionImpuestoImpor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLiquidacionImpuestoImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLiquidacionImpuestoImporListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLiquidacionImpuestoImpor();
		
		this.cargarCombosFrameForeignKeyLiquidacionImpuestoImpor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLiquidacionImpuestoImpor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLiquidacionImpuestoImpor();
		}
	}
	
	

	public void cargarCombosForeignKeyPedidoCompraImpor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPedidoCompraImporListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPedidoCompraImpor();
				this.cargarCombosFramePedidoCompraImporsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPedidoCompraImpor(this.pedidocompraimporsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoLiquidacionImpuestoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			
			if(jTableDatosLiquidacionImpuestoImpor.getRowCount()>=1) {
				jTableDatosLiquidacionImpuestoImpor.removeRowSelectionInterval(0, jTableDatosLiquidacionImpuestoImpor.getRowCount()-1);						
			}
			
			this.isEsNuevoLiquidacionImpuestoImpor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLiquidacionImpuestoImpor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLiquidacionImpuestoImpor(true);			
			//this.liquidacionimpuestoimpor=new LiquidacionImpuestoImpor();
			//this.liquidacionimpuestoimpor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor() ;
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLiquidacionImpuestoImpor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.liquidacionimpuestoimpor);	
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);				
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LiquidacionImpuestoImpor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLiquidacionImpuestoImporActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRows().length;			
			}
			
			liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLiquidacionImpuestoImpor--;			
				//LiquidacionImpuestoImpor liquidacionimpuestoimporAux= new LiquidacionImpuestoImpor();			
				//liquidacionimpuestoimporAux.setId(this.iIdNuevoLiquidacionImpuestoImpor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LiquidacionImpuestoImpor liquidacionimpuestoimporOrigen=new LiquidacionImpuestoImpor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporOrigen : liquidacionimpuestoimporsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							liquidacionimpuestoimporOrigen =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							liquidacionimpuestoimporOrigen =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLiquidacionImpuestoImpor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.liquidacionimpuestoimpor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLiquidacionImpuestoImpor(liquidacionimpuestoimporOrigen,this.liquidacionimpuestoimpor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().add(this.liquidacionimpuestoimporAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpors.add(this.liquidacionimpuestoimporAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
				
				this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpuestoImpor(), this.getIndiceNuevoLiquidacionImpuestoImpor());
				
				int iLastRow =  this.jTableDatosLiquidacionImpuestoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLiquidacionImpuestoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLiquidacionImpuestoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();									
		
			LiquidacionImpuestoImpor liquidacionimpuestoimporOrigen=new LiquidacionImpuestoImpor();
			LiquidacionImpuestoImpor liquidacionimpuestoimporDestino=new LiquidacionImpuestoImpor();
				
			liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || liquidacionimpuestoimporsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLiquidacionImpuestoImpor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporOrigen =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						liquidacionimpuestoimporOrigen =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						liquidacionimpuestoimporDestino =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						liquidacionimpuestoimporDestino =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				liquidacionimpuestoimporOrigen =liquidacionimpuestoimporsSeleccionados.get(0);
				liquidacionimpuestoimporDestino =liquidacionimpuestoimporsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLiquidacionImpuestoImpor(liquidacionimpuestoimporOrigen,liquidacionimpuestoimporDestino,true,false);
				
				liquidacionimpuestoimporDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(liquidacionimpuestoimporDestino,liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(liquidacionimpuestoimporDestino,liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
				
				//this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpuestoImpor(), this.getIndiceNuevoLiquidacionImpuestoImpor());
				
				int iLastRow =  this.jTableDatosLiquidacionImpuestoImpor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLiquidacionImpuestoImpor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLiquidacionImpuestoImpor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLiquidacionImpuestoImpor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(!isVisible);
			this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(!isVisible);
			this.jPanelAccionesLiquidacionImpuestoImpor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLiquidacionImpuestoImpor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLiquidacionImpuestoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLiquidacionImpuestoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLiquidacionImpuestoImpor();
			
			this.abrirFrameOrderByLiquidacionImpuestoImpor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLiquidacionImpuestoImpor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLiquidacionImpuestoImpor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLiquidacionImpuestoImpor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.isMaximum()) {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSize(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.iWidthFormulario,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.isMaximum()) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jContentPaneDetalleLiquidacionImpuestoImpor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jContentPaneDetalleLiquidacionImpuestoImpor.getWidth(),LiquidacionImpuestoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jContentPaneDetalleLiquidacionImpuestoImpor.getWidth(),LiquidacionImpuestoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jContentPaneDetalleLiquidacionImpuestoImpor.getWidth(),LiquidacionImpuestoImporConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleLiquidacionImpuestoImpor();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLiquidacionImpuestoImpor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpuestoImpor,false,this);
				} else {
					this.jInternalFrameOrderByLiquidacionImpuestoImpor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLiquidacionImpuestoImpor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLiquidacionImpuestoImpor);
				this.jInternalFrameOrderByLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameOrderByLiquidacionImpuestoImpor.setSelected(false);
				
				this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLiquidacionImpuestoImpor"));
				
				this.inicializarActualizarBindingTablaOrderByLiquidacionImpuestoImpor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLiquidacionImpuestoImpor==null) {
				
				this.jInternalFrameImportacionLiquidacionImpuestoImpor=new ImportacionJInternalFrame(LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLiquidacionImpuestoImpor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLiquidacionImpuestoImpor);
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.setSelected(false);


				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLiquidacionImpuestoImpor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor==null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor=new ReporteDinamicoJInternalFrame(LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor);
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setVisible(false);
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLiquidacionImpuestoImpor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLiquidacionImpuestoImpor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleLiquidacionImpuestoImpor() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jContentPaneDetalleLiquidacionImpuestoImpor.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLiquidacionImpuestoImpor);
			
	       	this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSelected(false);
			
			//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.dispose();
			//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLiquidacionImpuestoImpor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameImportacionLiquidacionImpuestoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setVisible(true);
	        this.jInternalFrameOrderByLiquidacionImpuestoImpor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameOrderByLiquidacionImpuestoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLiquidacionImpuestoImpor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLiquidacionImpuestoImpor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLiquidacionImpuestoImpor.setVisible(false);
	        this.jInternalFrameImportacionLiquidacionImpuestoImpor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLiquidacionImpuestoImpor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLiquidacionImpuestoImpor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLiquidacionImpuestoImpor(true);
			//this.isEsNuevoLiquidacionImpuestoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false) ;
			
			if(liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado() && DetalleLiquidacionImpuestoImporJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleLiquidacionImpuestoImporActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLiquidacionImpuestoImpor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLiquidacionImpuestoImporActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLiquidacionImpuestoImpor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLiquidacionImpuestoImpor(true);
			//this.isEsNuevoLiquidacionImpuestoImpor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.liquidacionimpuestoimpor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false) ;
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLiquidacionImpuestoImpor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_clienteLiquidacionImpuestoImpor) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_facturaLiquidacionImpuestoImpor) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPedidoCompraImpor(List<PedidoCompraImpor> pedidocompraimporsForeignKey)throws Exception{
		TableColumn tableColumnPedidoCompraImpor=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR));
		TableCellEditor tableCellEditorPedidoCompraImpor =tableColumnPedidoCompraImpor.getCellEditor();

		PedidoCompraImporTableCell pedidocompraimporTableCellFk=(PedidoCompraImporTableCell)tableCellEditorPedidoCompraImpor;

		if(pedidocompraimporTableCellFk!=null) {
			pedidocompraimporTableCellFk.setpedidocompraimporsForeignKey(pedidocompraimporsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//pedidocompraimporTableCellFk.setRowActual(intSelectedRow);
			//pedidocompraimporTableCellFk.setpedidocompraimporsForeignKeyActual(pedidocompraimporsForeignKey);
		//}


		if(pedidocompraimporTableCellFk!=null) {
			pedidocompraimporTableCellFk.RecargarPedidoCompraImporsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLiquidacionImpuestoImpor(false);
			
			//if(!this.isEsNuevoLiquidacionImpuestoImpor) {								
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				
			}
			
			if(this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLiquidacionImpuestoImpor=true;
					this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
					this.isEsNuevoLiquidacionImpuestoImpor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLiquidacionImpuestoImpor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLiquidacionImpuestoImpor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(false);
				
				this.habilitarDeshabilitarControlesLiquidacionImpuestoImpor(false);
			
												
				
				if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLiquidacionImpuestoImpor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,liquidacionimpuestoimporSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,liquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.liquidacionimpuestoimpor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				this.liquidacionimpuestoimpor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				this.liquidacionimpuestoimpor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LiquidacionImpuestoImporModel) this.jTableDatosLiquidacionImpuestoImpor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLiquidacionImpuestoImpor=true;
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
				this.isEsNuevoLiquidacionImpuestoImpor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(false);
				
				this.habilitarDeshabilitarControlesLiquidacionImpuestoImpor(false);
				
				
				
				if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLiquidacionImpuestoImpor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLiquidacionImpuestoImpor.getRowCount()>=1) {
				jTableDatosLiquidacionImpuestoImpor.removeRowSelectionInterval(0, jTableDatosLiquidacionImpuestoImpor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLiquidacionImpuestoImpor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(false) ;
			
			this.isEsNuevoLiquidacionImpuestoImpor=false;
			
			if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLiquidacionImpuestoImpor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				
				//SI ES MANUAL
				if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLiquidacionImpuestoImpor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLiquidacionImpuestoImpor--;			
			//LiquidacionImpuestoImpor liquidacionimpuestoimporAux= new LiquidacionImpuestoImpor();			
			//liquidacionimpuestoimporAux.setId(this.iIdNuevoLiquidacionImpuestoImpor);
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLiquidacionImpuestoImpor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
			
			this.liquidacionimpuestoimpor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().add(this.liquidacionimpuestoimporAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.liquidacionimpuestoimpors.add(this.liquidacionimpuestoimporAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			
			this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(this.getIndiceNuevoLiquidacionImpuestoImpor(), this.getIndiceNuevoLiquidacionImpuestoImpor());
			
			int iLastRow =  this.jTableDatosLiquidacionImpuestoImpor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLiquidacionImpuestoImpor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLiquidacionImpuestoImpor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLiquidacionImpuestoImpor();
			}
			
			//this.abrirFrameTreeLiquidacionImpuestoImpor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Liquidacion Impuesto ImporES ?", "MANTENIMIENTO DE Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLiquidacionImpuestoImpor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLiquidacionImpuestoImpor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.liquidacionimpuestoimporReturnGeneral=liquidacionimpuestoimporLogic.procesarImportacionLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.liquidacionimpuestoimporParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLiquidacionImpuestoImporReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLiquidacionImpuestoImpor.setFileImportacion(this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLiquidacionImpuestoImpor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLiquidacionImpuestoImpor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		

		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LiquidacionImpuestoImporBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LiquidacionImpuestoImporBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PedidoCompraImpor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PedidoCompraImpor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PedidoCompraImpor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PedidoCompraImpor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDui_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDui_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDui_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDui_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_b_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_b_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_b_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_b_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_guro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_guro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_guro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_guro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeFodi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeFodi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeFodi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeFodi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_saControl_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_saControl_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_saControl_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_saControl_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_r_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_r_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_r_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_r_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_f_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_f_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_f_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_f_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR:
					sNombreCampoCategoria="id_pedido_compra_impor";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI:
					sNombreCampoCategoria="numero_dui";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoria="fecha_pago";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					sNombreCampoCategoria="fob";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					sNombreCampoCategoria="seguro";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					sNombreCampoCategoria="porcentaje_fodi";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					sNombreCampoCategoria="porcentaje_iva";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL:
					sNombreCampoCategoria="tasa_control";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR:
					sNombreCampoCategoria="cfr";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF:
					sNombreCampoCategoria="cif";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR:
					sNombreCampoCategoriaValor="id_pedido_compra_impor";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI:
					sNombreCampoCategoriaValor="numero_dui";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoriaValor="fecha_pago";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					sNombreCampoCategoriaValor="fob";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					sNombreCampoCategoriaValor="seguro";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					sNombreCampoCategoriaValor="porcentaje_fodi";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					sNombreCampoCategoriaValor="porcentaje_iva";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL:
					sNombreCampoCategoriaValor="tasa_control";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR:
					sNombreCampoCategoriaValor="cfr";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF:
					sNombreCampoCategoriaValor="cif";
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pedo Compra Impor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pedido_compra_impor");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dui",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dui");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pago");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fob",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fob");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Seguro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"seguro");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Fodi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_fodi");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_iva");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tasa Control",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tasa_control");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cfr",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cfr");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cif",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cif");
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("LiquidacionImpuestoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getpedidocompraimpor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getnumero_dui());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getfecha_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getfob());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getseguro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getporcentaje_fodi());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getporcentaje_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.gettasa_control());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getcfr());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.getcif());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(LiquidacionImpuestoImpor liquidacionimpuestoimpor:liquidacionimpuestoimporsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(liquidacionimpuestoimpor.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelLiquidacionImpuestoImpor(row);				
			//	iRow++;
			//}				
			
			//for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLiquidacionImpuestoImpor(liquidacionimpuestoimporAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLiquidacionImpuestoImpor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLiquidacionImpuestoImpor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
			
			//SI ES MANUAL
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLiquidacionImpuestoImpor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLiquidacionImpuestoImpor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLiquidacionImpuestoImpor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLiquidacionImpuestoImpor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLiquidacionImpuestoImpor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLiquidacionImpuestoImpor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLiquidacionImpuestoImpor.setMinimumSize(dimensionMinimum);
		this.jTableDatosLiquidacionImpuestoImpor.setMaximumSize(dimensionMaximum);
		this.jTableDatosLiquidacionImpuestoImpor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLiquidacionImpuestoImpor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLiquidacionImpuestoImpor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLiquidacionImpuestoImpor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpuestoImpor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLiquidacionImpuestoImpor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLiquidacionImpuestoImpor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor();
		
		this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLiquidacionImpuestoImpor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpuestoImpor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLiquidacionImpuestoImpor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLiquidacionImpuestoImpor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLiquidacionImpuestoImpor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jCheckBoxPostAccionNuevoLiquidacionImpuestoImpor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jCheckBoxPostAccionSinCerrarLiquidacionImpuestoImpor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jCheckBoxPostAccionSinMensajeLiquidacionImpuestoImpor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {
		try	{	
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLiquidacionImpuestoImpor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLiquidacionImpuestoImpor() throws Exception {
		try	{
			if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLiquidacionImpuestoImpor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLiquidacionImpuestoImpor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLiquidacionImpuestoImpor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLiquidacionImpuestoImpor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLiquidacionImpuestoImpor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLiquidacionImpuestoImpor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
				
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=LiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarLiquidacionImpuestoImpor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=LiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarLiquidacionImpuestoImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=LiquidacionImpuestoImporConstantesFunciones.getTiposSeleccionarLiquidacionImpuestoImpor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLiquidacionImpuestoImpor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteLiquidacionImpuestoImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaLiquidacionImpuestoImpor.getSelectedItem()).getId();}
		if(this.jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.getSelectedItem()!=null){this.id_pedido_compra_imporFK_IdPedidoCompraImpor=((PedidoCompraImpor)this.jComboBoxid_pedido_compra_imporFK_IdPedidoCompraImporLiquidacionImpuestoImpor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {				
		if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLiquidacionImpuestoImpor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLiquidacionImpuestoImpor() throws Exception {
		this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLiquidacionImpuestoImpor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLiquidacionImpuestoImporOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImporOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLiquidacionImpuestoImpor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=liquidacionimpuestoimpors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLiquidacionImpuestoImpor.setModel(new LiquidacionImpuestoImporModel(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLiquidacionImpuestoImpor.setModel(new LiquidacionImpuestoImporModel(this.liquidacionimpuestoimpors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLiquidacionImpuestoImpor!=null && this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLiquidacionImpuestoImpor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,liquidacionimpuestoimporConstantesFunciones.resaltarSeleccionarLiquidacionImpuestoImpor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO,liquidacionimpuestoimporConstantesFunciones.resaltarSeleccionarLiquidacionImpuestoImpor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_ID));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostraridLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltaridLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activaridLiquidacionImpuestoImpor,iSizeTabla,this,true,"idLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltaridLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activaridLiquidacionImpuestoImpor,this,true,"idLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_pedido_compra_imporLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PedidoCompraImporTableCell(this.pedidocompraimporsForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_pedido_compra_imporLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_pedido_compra_imporLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new PedidoCompraImporTableCell(this.pedidocompraimporsForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_pedido_compra_imporLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_pedido_compra_imporLiquidacionImpuestoImpor,true,"id_pedido_compra_imporLiquidacionImpuestoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_empresaLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_empresaLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_empresaLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_empresaLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_empresaLiquidacionImpuestoImpor,false,"id_empresaLiquidacionImpuestoImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_sucursalLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_sucursalLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_sucursalLiquidacionImpuestoImpor,false,"id_sucursalLiquidacionImpuestoImpor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_clienteLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_clienteLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_clienteLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_clienteLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_clienteLiquidacionImpuestoImpor,true,"id_clienteLiquidacionImpuestoImpor","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_facturaLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_facturaLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_facturaLiquidacionImpuestoImpor,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.liquidacionimpuestoimporConstantesFunciones.resaltarid_facturaLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarid_facturaLiquidacionImpuestoImpor,true,"id_facturaLiquidacionImpuestoImpor","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarnumero_comprobanteLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteLiquidacionImpuestoImpor,iSizeTabla,this,true,"numero_comprobanteLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteLiquidacionImpuestoImpor,this,true,"numero_comprobanteLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarnumero_duiLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_duiLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarnumero_duiLiquidacionImpuestoImpor,iSizeTabla,this,true,"numero_duiLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_duiLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarnumero_duiLiquidacionImpuestoImpor,this,true,"numero_duiLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarfechaLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfechaLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfechaLiquidacionImpuestoImpor,iSizeTabla,this,true,"fechaLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfechaLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfechaLiquidacionImpuestoImpor,this,true,"fechaLiquidacionImpuestoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarfecha_pagoLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfecha_pagoLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfecha_pagoLiquidacionImpuestoImpor,iSizeTabla,this,true,"fecha_pagoLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfecha_pagoLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfecha_pagoLiquidacionImpuestoImpor,this,true,"fecha_pagoLiquidacionImpuestoImpor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarfobLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfobLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfobLiquidacionImpuestoImpor,iSizeTabla,this,true,"fobLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfobLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfobLiquidacionImpuestoImpor,this,true,"fobLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarseguroLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarseguroLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarseguroLiquidacionImpuestoImpor,iSizeTabla,this,true,"seguroLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarseguroLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarseguroLiquidacionImpuestoImpor,this,true,"seguroLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarfleteLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfleteLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfleteLiquidacionImpuestoImpor,iSizeTabla,this,true,"fleteLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarfleteLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarfleteLiquidacionImpuestoImpor,this,true,"fleteLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_fodiLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiLiquidacionImpuestoImpor,iSizeTabla,this,true,"porcentaje_fodiLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiLiquidacionImpuestoImpor,this,true,"porcentaje_fodiLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_ivaLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaLiquidacionImpuestoImpor,iSizeTabla,this,true,"porcentaje_ivaLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaLiquidacionImpuestoImpor,this,true,"porcentaje_ivaLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrartasa_controlLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltartasa_controlLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activartasa_controlLiquidacionImpuestoImpor,iSizeTabla,this,true,"tasa_controlLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltartasa_controlLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activartasa_controlLiquidacionImpuestoImpor,this,true,"tasa_controlLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarcfrLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarcfrLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarcfrLiquidacionImpuestoImpor,iSizeTabla,this,true,"cfrLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarcfrLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarcfrLiquidacionImpuestoImpor,this,true,"cfrLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrarcifLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarcifLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarcifLiquidacionImpuestoImpor,iSizeTabla,this,true,"cifLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltarcifLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activarcifLiquidacionImpuestoImpor,this,true,"cifLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL));

		if(this.liquidacionimpuestoimporConstantesFunciones.mostrartotalLiquidacionImpuestoImpor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltartotalLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activartotalLiquidacionImpuestoImpor,iSizeTabla,this,true,"totalLiquidacionImpuestoImpor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.liquidacionimpuestoimporConstantesFunciones.resaltartotalLiquidacionImpuestoImpor,this.liquidacionimpuestoimporConstantesFunciones.activartotalLiquidacionImpuestoImpor,this,true,"totalLiquidacionImpuestoImpor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LiquidacionImpuestoImporPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleLiquidacionImpuestoImpor && this.liquidacionimpuestoimporConstantesFunciones.mostrarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor && !LiquidacionImpuestoImporConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Liquidacion Impuesto Impores");
				tableColumn.setHeaderValue("Detalle Liquidacion Impuesto Impores");
				tableColumn.setCellRenderer(new DetalleLiquidacionImpuestoImporTableCell(liquidacionimpuestoimporConstantesFunciones.resaltarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor));
				tableColumn.setCellEditor(new DetalleLiquidacionImpuestoImporTableCell(liquidacionimpuestoimporConstantesFunciones.resaltarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor,this,this.liquidacionimpuestoimporConstantesFunciones.activarDetalleLiquidacionImpuestoImporLiquidacionImpuestoImpor));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLiquidacionImpuestoImpor.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLiquidacionImpuestoImpor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLiquidacionImpuestoImpor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLiquidacionImpuestoImpor.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosLiquidacionImpuestoImpor.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosLiquidacionImpuestoImpor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLiquidacionImpuestoImpor.moveColumn(this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLiquidacionImpuestoImpor.moveColumn(this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosLiquidacionImpuestoImpor.moveColumn(this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLiquidacionImpuestoImpor.moveColumn(this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLiquidacionImpuestoImpor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLiquidacionImpuestoImpor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLiquidacionImpuestoImpor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLiquidacionImpuestoImpor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLiquidacionImpuestoImpor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLiquidacionImpuestoImpor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=liquidacionimpuestoimpors.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosLiquidacionImpuestoImpor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLiquidacionImpuestoImpor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLiquidacionImpuestoImpor();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoLiquidacionImpuestoImpor=false;
					
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
				if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLiquidacionImpuestoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.liquidacionimpuestoimpor.getsType().equals("DUPLICADO")
				   || this.liquidacionimpuestoimpor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLiquidacionImpuestoImpor=true;
				
				} else {
					this.isEsNuevoLiquidacionImpuestoImpor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					if(this.liquidacionimpuestoimpor.getId()>=0 && !this.liquidacionimpuestoimpor.getIsNew()) {						
						this.isEsNuevoLiquidacionImpuestoImpor=false;
						
					} else {
						this.isEsNuevoLiquidacionImpuestoImpor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLiquidacionImpuestoImpor(esRelaciones);						
				
				this.seleccionarLiquidacionImpuestoImpor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.liquidacionimpuestoimpor.getId()<0) {
					this.isEsNuevoLiquidacionImpuestoImpor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLiquidacionImpuestoImpor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLiquidacionImpuestoImpor(evt,rowIndex);
				}	
				
				if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LiquidacionImpuestoImpor: " + this.dDif); 
					}
				}								
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLiquidacionImpuestoImpor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {
					if(this.liquidacionimpuestoimpor.getId()>0) {
						this.liquidacionimpuestoimpor.setIsDeleted(true);
						
						this.liquidacionimpuestoimporsEliminados.add(this.liquidacionimpuestoimpor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().remove(this.liquidacionimpuestoimpor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpors.remove(this.liquidacionimpuestoimpor);				
					}
					
					
					((LiquidacionImpuestoImporModel) this.jTableDatosLiquidacionImpuestoImpor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLiquidacionImpuestoImpor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLiquidacionImpuestoImpor) {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLiquidacionImpuestoImpor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}
				
				//ARCHITECTURE
				try {
					

					//PedidoCompraImpor
					if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_pedido_compra_imporLiquidacionImpuestoImpor || this.liquidacionimpuestoimporConstantesFunciones.event_dependid_pedido_compra_imporLiquidacionImpuestoImpor) {
						//this.cargarCombosPedidoCompraImporsForeignKeyLista(" where id="+this.liquidacionimpuestoimpor.getid_pedido_compra_impor());
									//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
						this.pedidocompraimporsForeignKey=new ArrayList<PedidoCompraImpor>();

						if(liquidacionimpuestoimpor.getPedidoCompraImpor()!=null) {
							this.pedidocompraimporsForeignKey.add(liquidacionimpuestoimpor.getPedidoCompraImpor());
						}

						this.addItemDefectoCombosForeignKeyPedidoCompraImpor();
						this.cargarCombosFramePedidoCompraImporsForeignKey("Todos");
					}
					this.setActualPedidoCompraImporForeignKey(this.liquidacionimpuestoimpor.getid_pedido_compra_impor(),false,"Formulario");

					//Empresa
					if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_empresaLiquidacionImpuestoImpor || this.liquidacionimpuestoimporConstantesFunciones.event_dependid_empresaLiquidacionImpuestoImpor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.liquidacionimpuestoimpor.getid_empresa());
									//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(liquidacionimpuestoimpor.getEmpresa()!=null) {
							this.empresasForeignKey.add(liquidacionimpuestoimpor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.liquidacionimpuestoimpor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_sucursalLiquidacionImpuestoImpor || this.liquidacionimpuestoimporConstantesFunciones.event_dependid_sucursalLiquidacionImpuestoImpor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.liquidacionimpuestoimpor.getid_sucursal());
									//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(liquidacionimpuestoimpor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(liquidacionimpuestoimpor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.liquidacionimpuestoimpor.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_clienteLiquidacionImpuestoImpor || this.liquidacionimpuestoimporConstantesFunciones.event_dependid_clienteLiquidacionImpuestoImpor) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.liquidacionimpuestoimpor.getid_cliente());
									//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(liquidacionimpuestoimpor.getCliente()!=null) {
							this.clientesForeignKey.add(liquidacionimpuestoimpor.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.liquidacionimpuestoimpor.getid_cliente(),false,"Formulario");

					//Factura
					if(!this.liquidacionimpuestoimporConstantesFunciones.cargarid_facturaLiquidacionImpuestoImpor || this.liquidacionimpuestoimporConstantesFunciones.event_dependid_facturaLiquidacionImpuestoImpor) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.liquidacionimpuestoimpor.getid_factura());
									//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(liquidacionimpuestoimpor.getFactura()!=null) {
							this.facturasForeignKey.add(liquidacionimpuestoimpor.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.liquidacionimpuestoimpor.getid_factura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLiquidacionImpuestoImpor(liquidacionimpuestoimpor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLiquidacionImpuestoImpor(liquidacionimpuestoimpor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLiquidacionImpuestoImpor(liquidacionimpuestoimpor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpuestoImpor(liquidacionimpuestoimpor);
	}
	
	public void setVariablesObjetoActualToFormularioLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getId().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getnumero_comprobante());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getnumero_dui());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setDate(liquidacionimpuestoimpor.getfecha());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setDate(liquidacionimpuestoimpor.getfecha_pago());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getfob().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getseguro().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getflete().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getporcentaje_fodi().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getporcentaje_iva().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.gettasa_control().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getcfr().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getcif().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LiquidacionImpuestoImpor liquidacionimpuestoimporLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,liquidacionimpuestoimporLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LiquidacionImpuestoImpor liquidacionimpuestoimporLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				liquidacionimpuestoimporLocal=this.liquidacionimpuestoimpor;
			} else {
				liquidacionimpuestoimporLocal=this.liquidacionimpuestoimporAnterior;
			}
		}
		
		if(this.permiteMantenimiento(liquidacionimpuestoimporLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLiquidacionImpuestoImpor(liquidacionimpuestoimporLocal,true);
					
					if(liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(liquidacionimpuestoimporLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(liquidacionimpuestoimporLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(liquidacionimpuestoimpor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(liquidacionimpuestoimpor);
	}
	
	public void setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(liquidacionimpuestoimpor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.getText()==null || this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.getText()=="" || this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.getText()=="Id") {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setText("0");
			}

			if(conColumnasBase) {liquidacionimpuestoimpor.setId(Long.parseLong(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelIdLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setnumero_comprobante(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelnumero_comprobanteLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setnumero_dui(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelnumero_duiLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setfecha(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfechaLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setfecha_pago(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfecha_pagoLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setfob(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfobLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setseguro(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelseguroLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setflete(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelfleteLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setporcentaje_fodi(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelporcentaje_fodiLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setporcentaje_iva(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelporcentaje_ivaLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.settasa_control(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabeltasa_controlLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setcfr(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelcfrLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.setcif(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelcifLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			liquidacionimpuestoimpor.settotal(Double.parseDouble(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabeltotalLiquidacionImpuestoImpor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimporBean,LiquidacionImpuestoImpor liquidacionimpuestoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && liquidacionimpuestoimporBean.getid_pedido_compra_impor()!=null && !liquidacionimpuestoimporBean.getid_pedido_compra_impor().equals(-1L))) {liquidacionimpuestoimpor.setid_pedido_compra_impor(liquidacionimpuestoimporBean.getid_pedido_compra_impor());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporBean.getid_cliente()!=null && !liquidacionimpuestoimporBean.getid_cliente().equals(-1L))) {liquidacionimpuestoimpor.setid_cliente(liquidacionimpuestoimporBean.getid_cliente());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporBean.getid_factura()!=null && !liquidacionimpuestoimporBean.getid_factura().equals(-1L))) {liquidacionimpuestoimpor.setid_factura(liquidacionimpuestoimporBean.getid_factura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimporOrigen,LiquidacionImpuestoImpor liquidacionimpuestoimpor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getId()!=null && !liquidacionimpuestoimporOrigen.getId().equals(0L))) {liquidacionimpuestoimpor.setId(liquidacionimpuestoimporOrigen.getId());}}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getid_pedido_compra_impor()!=null && !liquidacionimpuestoimporOrigen.getid_pedido_compra_impor().equals(-1L))) {liquidacionimpuestoimpor.setid_pedido_compra_impor(liquidacionimpuestoimporOrigen.getid_pedido_compra_impor());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getid_cliente()!=null && !liquidacionimpuestoimporOrigen.getid_cliente().equals(-1L))) {liquidacionimpuestoimpor.setid_cliente(liquidacionimpuestoimporOrigen.getid_cliente());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getid_factura()!=null && !liquidacionimpuestoimporOrigen.getid_factura().equals(-1L))) {liquidacionimpuestoimpor.setid_factura(liquidacionimpuestoimporOrigen.getid_factura());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getnumero_comprobante()!=null && !liquidacionimpuestoimporOrigen.getnumero_comprobante().equals(""))) {liquidacionimpuestoimpor.setnumero_comprobante(liquidacionimpuestoimporOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getnumero_dui()!=null && !liquidacionimpuestoimporOrigen.getnumero_dui().equals(""))) {liquidacionimpuestoimpor.setnumero_dui(liquidacionimpuestoimporOrigen.getnumero_dui());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getfecha()!=null && !liquidacionimpuestoimporOrigen.getfecha().equals(new Date()))) {liquidacionimpuestoimpor.setfecha(liquidacionimpuestoimporOrigen.getfecha());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getfecha_pago()!=null && !liquidacionimpuestoimporOrigen.getfecha_pago().equals(new Date()))) {liquidacionimpuestoimpor.setfecha_pago(liquidacionimpuestoimporOrigen.getfecha_pago());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getfob()!=null && !liquidacionimpuestoimporOrigen.getfob().equals(0.0))) {liquidacionimpuestoimpor.setfob(liquidacionimpuestoimporOrigen.getfob());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getseguro()!=null && !liquidacionimpuestoimporOrigen.getseguro().equals(0.0))) {liquidacionimpuestoimpor.setseguro(liquidacionimpuestoimporOrigen.getseguro());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getflete()!=null && !liquidacionimpuestoimporOrigen.getflete().equals(0.0))) {liquidacionimpuestoimpor.setflete(liquidacionimpuestoimporOrigen.getflete());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getporcentaje_fodi()!=null && !liquidacionimpuestoimporOrigen.getporcentaje_fodi().equals(0.0))) {liquidacionimpuestoimpor.setporcentaje_fodi(liquidacionimpuestoimporOrigen.getporcentaje_fodi());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getporcentaje_iva()!=null && !liquidacionimpuestoimporOrigen.getporcentaje_iva().equals(0.0))) {liquidacionimpuestoimpor.setporcentaje_iva(liquidacionimpuestoimporOrigen.getporcentaje_iva());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.gettasa_control()!=null && !liquidacionimpuestoimporOrigen.gettasa_control().equals(0.0))) {liquidacionimpuestoimpor.settasa_control(liquidacionimpuestoimporOrigen.gettasa_control());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getcfr()!=null && !liquidacionimpuestoimporOrigen.getcfr().equals(0.0))) {liquidacionimpuestoimpor.setcfr(liquidacionimpuestoimporOrigen.getcfr());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.getcif()!=null && !liquidacionimpuestoimporOrigen.getcif().equals(0.0))) {liquidacionimpuestoimpor.setcif(liquidacionimpuestoimporOrigen.getcif());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporOrigen.gettotal()!=null && !liquidacionimpuestoimporOrigen.gettotal().equals(0.0))) {liquidacionimpuestoimpor.settotal(liquidacionimpuestoimporOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getId().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getnumero_comprobante());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getnumero_dui());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setDate(liquidacionimpuestoimpor.getfecha());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setDate(liquidacionimpuestoimpor.getfecha_pago());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getfob().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getseguro().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getflete().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getporcentaje_fodi().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getporcentaje_iva().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.gettasa_control().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getcfr().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.getcif().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setText(liquidacionimpuestoimpor.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLiquidacionImpuestoImpor(LiquidacionImpuestoImporBean liquidacionimpuestoimporBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getId().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getnumero_dui());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setDate(liquidacionimpuestoimporBean.getfecha());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setDate(liquidacionimpuestoimporBean.getfecha_pago());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getfob().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getseguro().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getflete().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getporcentaje_fodi().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getporcentaje_iva().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.gettasa_control().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getcfr().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.getcif().toString());
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setText(liquidacionimpuestoimporBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLiquidacionImpuestoImpor(LiquidacionImpuestoImporParameterReturnGeneral liquidacionimpuestoimporReturnGeneral,LiquidacionImpuestoImporBean liquidacionimpuestoimporBean,Boolean conDefault) throws Exception { 
		try {
			LiquidacionImpuestoImpor liquidacionimpuestoimporLocal=new LiquidacionImpuestoImpor();
			
			liquidacionimpuestoimporLocal=liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getId()!=null && !liquidacionimpuestoimporLocal.getId().equals(0L))) {liquidacionimpuestoimporBean.setId(liquidacionimpuestoimporLocal.getId());}}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getid_pedido_compra_impor()!=null && !liquidacionimpuestoimporLocal.getid_pedido_compra_impor().equals(-1L))) {liquidacionimpuestoimporBean.setid_pedido_compra_impor(liquidacionimpuestoimporLocal.getid_pedido_compra_impor());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getid_cliente()!=null && !liquidacionimpuestoimporLocal.getid_cliente().equals(-1L))) {liquidacionimpuestoimporBean.setid_cliente(liquidacionimpuestoimporLocal.getid_cliente());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getid_factura()!=null && !liquidacionimpuestoimporLocal.getid_factura().equals(-1L))) {liquidacionimpuestoimporBean.setid_factura(liquidacionimpuestoimporLocal.getid_factura());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getnumero_comprobante()!=null && !liquidacionimpuestoimporLocal.getnumero_comprobante().equals(""))) {liquidacionimpuestoimporBean.setnumero_comprobante(liquidacionimpuestoimporLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getnumero_dui()!=null && !liquidacionimpuestoimporLocal.getnumero_dui().equals(""))) {liquidacionimpuestoimporBean.setnumero_dui(liquidacionimpuestoimporLocal.getnumero_dui());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getfecha()!=null && !liquidacionimpuestoimporLocal.getfecha().equals(new Date()))) {liquidacionimpuestoimporBean.setfecha(liquidacionimpuestoimporLocal.getfecha());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getfecha_pago()!=null && !liquidacionimpuestoimporLocal.getfecha_pago().equals(new Date()))) {liquidacionimpuestoimporBean.setfecha_pago(liquidacionimpuestoimporLocal.getfecha_pago());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getfob()!=null && !liquidacionimpuestoimporLocal.getfob().equals(0.0))) {liquidacionimpuestoimporBean.setfob(liquidacionimpuestoimporLocal.getfob());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getseguro()!=null && !liquidacionimpuestoimporLocal.getseguro().equals(0.0))) {liquidacionimpuestoimporBean.setseguro(liquidacionimpuestoimporLocal.getseguro());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getflete()!=null && !liquidacionimpuestoimporLocal.getflete().equals(0.0))) {liquidacionimpuestoimporBean.setflete(liquidacionimpuestoimporLocal.getflete());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getporcentaje_fodi()!=null && !liquidacionimpuestoimporLocal.getporcentaje_fodi().equals(0.0))) {liquidacionimpuestoimporBean.setporcentaje_fodi(liquidacionimpuestoimporLocal.getporcentaje_fodi());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getporcentaje_iva()!=null && !liquidacionimpuestoimporLocal.getporcentaje_iva().equals(0.0))) {liquidacionimpuestoimporBean.setporcentaje_iva(liquidacionimpuestoimporLocal.getporcentaje_iva());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.gettasa_control()!=null && !liquidacionimpuestoimporLocal.gettasa_control().equals(0.0))) {liquidacionimpuestoimporBean.settasa_control(liquidacionimpuestoimporLocal.gettasa_control());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getcfr()!=null && !liquidacionimpuestoimporLocal.getcfr().equals(0.0))) {liquidacionimpuestoimporBean.setcfr(liquidacionimpuestoimporLocal.getcfr());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.getcif()!=null && !liquidacionimpuestoimporLocal.getcif().equals(0.0))) {liquidacionimpuestoimporBean.setcif(liquidacionimpuestoimporLocal.getcif());}
			if(conDefault || (!conDefault && liquidacionimpuestoimporLocal.gettotal()!=null && !liquidacionimpuestoimporLocal.gettotal().equals(0.0))) {liquidacionimpuestoimporBean.settotal(liquidacionimpuestoimporLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLiquidacionImpuestoImporGenerico(Long idLiquidacionImpuestoImporSeleccionado,JComboBox jComboBoxLiquidacionImpuestoImpor,List<LiquidacionImpuestoImpor> liquidacionimpuestoimporsLocal)throws Exception {
		try {
			LiquidacionImpuestoImpor  liquidacionimpuestoimporTemp=null;

			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsLocal) {
				if(liquidacionimpuestoimporAux.getId()!=null && liquidacionimpuestoimporAux.getId().equals(idLiquidacionImpuestoImporSeleccionado)) {
					liquidacionimpuestoimporTemp=liquidacionimpuestoimporAux;
					break;
				}
			}

			jComboBoxLiquidacionImpuestoImpor.setSelectedItem(liquidacionimpuestoimporTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLiquidacionImpuestoImporGenerico(JComboBox jComboBoxLiquidacionImpuestoImpor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLiquidacionImpuestoImpor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLiquidacionImpuestoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLiquidacionImpuestoImpor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLiquidacionImpuestoImpor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLiquidacionImpuestoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLiquidacionImpuestoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("DetalleLiquidacionImpuestoImpor")) {
			jButtonDetalleLiquidacionImpuestoImporActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			liquidacionimpuestoimpor=(LiquidacionImpuestoImpor) liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) liquidacionimpuestoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("PedidoCompraImpor")) {
			//sDescripcion=this.getActualPedidoCompraImporForeignKeyDescripcion((Long)value);
			if(!liquidacionimpuestoimpor.getIsNew() && !liquidacionimpuestoimpor.getIsChanged() && !liquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpuestoimpor.getpedidocompraimpor_descripcion();
			} else {
				//sDescripcion=this.getActualPedidoCompraImporForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpuestoimpor.getpedidocompraimpor_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!liquidacionimpuestoimpor.getIsNew() && !liquidacionimpuestoimpor.getIsChanged() && !liquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpuestoimpor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpuestoimpor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!liquidacionimpuestoimpor.getIsNew() && !liquidacionimpuestoimpor.getIsChanged() && !liquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpuestoimpor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpuestoimpor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!liquidacionimpuestoimpor.getIsNew() && !liquidacionimpuestoimpor.getIsChanged() && !liquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpuestoimpor.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpuestoimpor.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!liquidacionimpuestoimpor.getIsNew() && !liquidacionimpuestoimpor.getIsChanged() && !liquidacionimpuestoimpor.getIsDeleted()) {
				sDescripcion=liquidacionimpuestoimpor.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=liquidacionimpuestoimpor.getfactura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LiquidacionImpuestoImpor liquidacionimpuestoimporRow=new LiquidacionImpuestoImpor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			liquidacionimpuestoimporRow=(LiquidacionImpuestoImpor) liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			liquidacionimpuestoimporRow=(LiquidacionImpuestoImpor) liquidacionimpuestoimpors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleLiquidacionImpuestoImporActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,LiquidacionImpuestoImpor liquidacionimpuestoimpor) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor = (LiquidacionImpuestoImpor)this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.liquidacionimpuestoimpor = (LiquidacionImpuestoImpor)this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(liquidacionimpuestoimpor!=null) {
						this.liquidacionimpuestoimpor = liquidacionimpuestoimpor;
					} else {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}
				}

				if(this.isTienePermisosDetalleLiquidacionImpuestoImpor && this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {
					DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame detalleliquidacionimpuestoimporBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup=new DetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleliquidacionimpuestoimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup;
					} else {
						detalleliquidacionimpuestoimporBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame;
					}

					List<LiquidacionImpuestoImpor> liquidacionimpuestoimpors=new ArrayList<LiquidacionImpuestoImpor>();
					liquidacionimpuestoimpors.add(this.liquidacionimpuestoimpor);
					if(!esRelacionado) {
						//detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.setConGuardarRelaciones(false);
						//detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.cargarDetalleLiquidacionImpuestoImporBeanSwingJInternalFrame(liquidacionimpuestoimpors,this.liquidacionimpuestoimpor,detalleliquidacionimpuestoimporBeanSwingJInternalFrame,/*conInicializar,*/detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporSessionBean.getEsGuardarRelacionado());
					detalleliquidacionimpuestoimporBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpuestoImpor("no_relacionado");

						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleLiquidacionImpuestoImporConstantesFunciones.ITAMANIOFILATABLA + (DetalleLiquidacionImpuestoImporConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
						TitledBorder titledBorderDetalleLiquidacionImpuestoImpor=(TitledBorder)detalleliquidacionimpuestoimporBeanSwingJInternalFrame.jScrollPanelDatosDetalleLiquidacionImpuestoImpor.getBorder();

						titledBorderDetalleLiquidacionImpuestoImpor.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Detalle Liquidacion Impuesto Impor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleliquidacionimpuestoimporBeanSwingJInternalFrame);
						}

						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleliquidacionimpuestoimporBeanSwingJInternalFrame);

						detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Liquidacion Impuesto Impor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor));			
			this.jButtonDuplicarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor && this.isPermisoDuplicarLiquidacionImpuestoImpor));			
			this.jButtonCopiarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor && this.isPermisoCopiarLiquidacionImpuestoImpor));
			this.jButtonVerFormLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor && this.isPermisoVerFormLiquidacionImpuestoImpor));
			
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor && this.isPermisoOrdenLiquidacionImpuestoImpor));			
			
			this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor));			
			this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor && this.isPermisoActualizarLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor && this.isPermisoActualizarLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor && this.isPermisoEliminarLiquidacionImpuestoImpor));
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor);							
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));			
			
			}
						
			this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor));						
			this.jButtonDuplicarToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor && this.isPermisoDuplicarLiquidacionImpuestoImpor));						
			this.jButtonCopiarToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor && this.isPermisoCopiarLiquidacionImpuestoImpor));			
			this.jButtonVerFormToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor && this.isPermisoVerFormLiquidacionImpuestoImpor));			
			this.jButtonAbrirOrderByToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor && this.isPermisoOrdenLiquidacionImpuestoImpor));
			this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor));			
			this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));			
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor && this.isPermisoActualizarLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor  && this.isPermisoActualizarLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor && this.isPermisoEliminarLiquidacionImpuestoImpor));
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarToolBarLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor);				
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor));			
			this.jMenuItemDuplicarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor && this.isPermisoDuplicarLiquidacionImpuestoImpor));			
			this.jMenuItemCopiarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor && this.isPermisoCopiarLiquidacionImpuestoImpor));			
			this.jMenuItemVerFormLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor && this.isPermisoVerFormLiquidacionImpuestoImpor));			
			this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor && this.isPermisoOrdenLiquidacionImpuestoImpor));			
			//this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor && this.isPermisoOrdenLiquidacionImpuestoImpor));
			this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor && this.isPermisoOrdenLiquidacionImpuestoImpor));			
			//this.jMenuItemDetalleMostrarOcultarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor && this.isPermisoOrdenLiquidacionImpuestoImpor));			
			this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor));			
			this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor && this.isPermisoNuevoLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));									
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemModificarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor && this.isPermisoActualizarLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemActualizarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor && this.isPermisoActualizarLiquidacionImpuestoImpor));	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemEliminarLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor && this.isPermisoEliminarLiquidacionImpuestoImpor));
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemCancelarLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor);				
			}
			
			this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));						
			this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=this.jButtonNuevoLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor=this.jButtonDuplicarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor=this.jButtonCopiarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor=this.jButtonVerFormLiquidacionImpuestoImpor.isVisible();
			
			this.isVisibilidadCeldaOrdenLiquidacionImpuestoImpor=this.jButtonAbrirOrderByLiquidacionImpuestoImpor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=this.jButtonModificarLiquidacionImpuestoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=this.jButtonNuevoToolBarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarToolBarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarToolBarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarToolBarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarToolBarLiquidacionImpuestoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=this.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=this.jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=this.jMenuItemNuevoLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor.isVisible();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemModificarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemActualizarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemEliminarLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemCancelarLiquidacionImpuestoImpor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLiquidacionImpuestoImpor(Boolean esInicializar) {
		if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {			
			if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
				//if(this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLiquidacionImpuestoImpor();
			}
			
			this.inicializarActualizarBindingBotonesManualLiquidacionImpuestoImpor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLiquidacionImpuestoImpor() {
		this.jButtonNuevoLiquidacionImpuestoImpor.setVisible(this.isPermisoNuevoLiquidacionImpuestoImpor);			
		this.jButtonDuplicarLiquidacionImpuestoImpor.setVisible(this.isPermisoDuplicarLiquidacionImpuestoImpor);			
		this.jButtonCopiarLiquidacionImpuestoImpor.setVisible(this.isPermisoCopiarLiquidacionImpuestoImpor);			
		this.jButtonVerFormLiquidacionImpuestoImpor.setVisible(this.isPermisoVerFormLiquidacionImpuestoImpor);			
		
		this.jButtonAbrirOrderByLiquidacionImpuestoImpor.setVisible(this.isPermisoOrdenLiquidacionImpuestoImpor);					
		
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.setVisible(this.isPermisoNuevoLiquidacionImpuestoImpor);			
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarLiquidacionImpuestoImpor);	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarLiquidacionImpuestoImpor);	
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarLiquidacionImpuestoImpor.setVisible(this.isPermisoEliminarLiquidacionImpuestoImpor);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor);						
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.setVisible(this.isPermisoGuardarCambiosLiquidacionImpuestoImpor);							
		}
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarLiquidacionImpuestoImpor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLiquidacionImpuestoImpor() {
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarLiquidacionImpuestoImpor);	
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarLiquidacionImpuestoImpor.setVisible(this.isPermisoActualizarLiquidacionImpuestoImpor);	
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarLiquidacionImpuestoImpor.setVisible(this.isPermisoEliminarLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarLiquidacionImpuestoImpor.setVisible(this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor);							
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.setVisible((this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor && this.isPermisoGuardarCambiosLiquidacionImpuestoImpor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLiquidacionImpuestoImpor() {
		if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLiquidacionImpuestoImpor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLiquidacionImpuestoImpor() {
	}
	
	public void jTableDatosLiquidacionImpuestoImporListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLiquidacionImpuestoImpor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.liquidacionimpuestoimpor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopedidocompraimpor=true;

			idTienePermisopedidocompraimpor=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpuestoImpor(PedidoCompraImporConstantesFunciones.CLASSNAME);

			if(idTienePermisopedidocompraimpor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);

				this.pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.pedidocompraimporBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.pedidocompraimporBeanSwingJInternalFrame.getPedidoCompraImporLogic().setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());

				if(this.liquidacionimpuestoimpor.getid_pedido_compra_impor()!=null) {
					this.pedidocompraimporBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.pedidocompraimporBeanSwingJInternalFrame.setIdActual(this.liquidacionimpuestoimpor.getid_pedido_compra_impor());
					this.pedidocompraimporBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.pedidocompraimporBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor();
				}

				JInternalFrameBase jinternalFrame =this.pedidocompraimporBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBorderpedidocompraimpor=(TitledBorder)this.pedidocompraimporBeanSwingJInternalFrame.jScrollPanelDatosPedidoCompraImpor.getBorder();

				titledBorderpedidocompraimpor.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Pedido Compra");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getid_pedido_compra_impor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pedido_compra_impor = "+this.liquidacionimpuestoimpor.getid_pedido_compra_impor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpuestoImpor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());

				if(this.liquidacionimpuestoimpor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.liquidacionimpuestoimpor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.liquidacionimpuestoimpor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpuestoImpor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());

				if(this.liquidacionimpuestoimpor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.liquidacionimpuestoimpor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.liquidacionimpuestoimpor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteLiquidacionImpuestoImporActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderLiquidacionImpuestoImpor=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpuestoImpor(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());

				if(this.liquidacionimpuestoimpor.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.liquidacionimpuestoimpor.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.liquidacionimpuestoimpor.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaLiquidacionImpuestoImporActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderLiquidacionImpuestoImpor=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaLiquidacionImpuestoImporUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebLiquidacionImpuestoImpor(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLiquidacionImpuestoImpor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLiquidacionImpuestoImpor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.liquidacionimpuestoimporLogic.getConnexion());

				if(this.liquidacionimpuestoimpor.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.liquidacionimpuestoimpor.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLiquidacionImpuestoImpor=(TitledBorder)this.jScrollPanelDatosLiquidacionImpuestoImpor.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderLiquidacionImpuestoImpor.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.liquidacionimpuestoimpor.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.liquidacionimpuestoimpor.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_duiLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getnumero_dui()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dui like '%"+this.liquidacionimpuestoimpor.getnumero_dui()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.liquidacionimpuestoimpor.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pagoLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getfecha_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago = '"+Funciones2.getStringPostgresDate(this.liquidacionimpuestoimpor.getfecha_pago())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfobLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getfob()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fob = "+this.liquidacionimpuestoimpor.getfob().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonseguroLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getseguro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where seguro = "+this.liquidacionimpuestoimpor.getseguro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.liquidacionimpuestoimpor.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_fodiLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getporcentaje_fodi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_fodi = "+this.liquidacionimpuestoimpor.getporcentaje_fodi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_ivaLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getporcentaje_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_iva = "+this.liquidacionimpuestoimpor.getporcentaje_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontasa_controlLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.gettasa_control()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tasa_control = "+this.liquidacionimpuestoimpor.gettasa_control().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncfrLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getcfr()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cfr = "+this.liquidacionimpuestoimpor.getcfr().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncifLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.getcif()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cif = "+this.liquidacionimpuestoimpor.getcif().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalLiquidacionImpuestoImporBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.getliquidacionimpuestoimpor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.liquidacionimpuestoimpor==null) {
						this.liquidacionimpuestoimpor = new LiquidacionImpuestoImpor();
					}

					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);
				}

				if(this.liquidacionimpuestoimpor.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.liquidacionimpuestoimpor.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);

			this.getLiquidacionImpuestoImporsFK_IdCliente();

			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);

			//if(LiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);

			this.getLiquidacionImpuestoImporsFK_IdEmpresa();

			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);

			//if(LiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);

			this.getLiquidacionImpuestoImporsFK_IdFactura();

			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);

			//if(LiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);

			this.getLiquidacionImpuestoImporsFK_IdPedidoCompraImpor();

			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);

			//if(LiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalLiquidacionImpuestoImporActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);

			this.getLiquidacionImpuestoImporsFK_IdSucursal();

			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);

			//if(LiquidacionImpuestoImporBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.liquidacionimpuestoimporLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLiquidacionImpuestoImpor() {
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
		

		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setVisible(false);	    			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.dispose();
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.dispose();
			this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor=null;
		}
		
		if(this.jInternalFrameImportacionLiquidacionImpuestoImpor!=null) {
			this.jInternalFrameImportacionLiquidacionImpuestoImpor.setVisible(false);	    			
			this.jInternalFrameImportacionLiquidacionImpuestoImpor.dispose();
			this.jInternalFrameImportacionLiquidacionImpuestoImpor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLiquidacionImpuestoImpor();
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			
			if(sTipo.equals("NuevoLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLiquidacionImpuestoImpor")) {
				jButtonDuplicarLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLiquidacionImpuestoImpor")) {
				jButtonCopiarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormLiquidacionImpuestoImpor")) {
				jButtonVerFormLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLiquidacionImpuestoImpor")) {
				jButtonDuplicarLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLiquidacionImpuestoImpor")) {
				jButtonDuplicarLiquidacionImpuestoImporActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLiquidacionImpuestoImpor")) {
				jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLiquidacionImpuestoImpor")) {
				jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLiquidacionImpuestoImpor")) {
				jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLiquidacionImpuestoImpor")) {
				jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLiquidacionImpuestoImpor")) {
				jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLiquidacionImpuestoImpor")) {
				jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarLiquidacionImpuestoImpor")) {
				jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLiquidacionImpuestoImpor")) {
				jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLiquidacionImpuestoImpor")) {
				jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarLiquidacionImpuestoImpor")) {
				jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLiquidacionImpuestoImpor")) {
				jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLiquidacionImpuestoImpor")) {
				jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarLiquidacionImpuestoImpor")) {
				jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLiquidacionImpuestoImpor")) {
				jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLiquidacionImpuestoImpor")) {
				jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLiquidacionImpuestoImpor")) {
				jButtonMostrarOcultarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLiquidacionImpuestoImpor")) {
				jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLiquidacionImpuestoImpor")) {
				jButtonCopiarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLiquidacionImpuestoImpor")) {
				jButtonVerFormLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLiquidacionImpuestoImpor")) {
				jButtonCopiarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLiquidacionImpuestoImpor")) {
				jButtonVerFormLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLiquidacionImpuestoImpor")) {
				jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLiquidacionImpuestoImpor")) {
				jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLiquidacionImpuestoImpor")) {
				jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLiquidacionImpuestoImpor")) {
				jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLiquidacionImpuestoImpor")) {
				jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLiquidacionImpuestoImpor")) {
				jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLiquidacionImpuestoImpor") || sTipo.equals("MenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLiquidacionImpuestoImpor") || sTipo.equals("MenuItemDetalleMostrarOcultarLiquidacionImpuestoImpor")) {
				jButtonMostrarOcultarLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLiquidacionImpuestoImpor")) {
				jButtonCerrarReporteDinamicoLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLiquidacionImpuestoImpor")) {
				jButtonGenerarReporteDinamicoLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLiquidacionImpuestoImpor")) {
				
				jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLiquidacionImpuestoImpor")) {
				jButtonCerrarImportacionLiquidacionImpuestoImporActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLiquidacionImpuestoImpor")) {
				
				jButtonGenerarImportacionLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLiquidacionImpuestoImpor")) {
				
				jButtonAbrirImportacionLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLiquidacionImpuestoImpor")) {
				jComboBoxTiposAccionesLiquidacionImpuestoImporActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLiquidacionImpuestoImpor")) {
				jComboBoxTiposRelacionesLiquidacionImpuestoImporActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLiquidacionImpuestoImpor")) {
				jComboBoxTiposAccionesLiquidacionImpuestoImporActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLiquidacionImpuestoImpor")) {
				
				jComboBoxTiposSeleccionarLiquidacionImpuestoImporActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLiquidacionImpuestoImpor")) {
				jTextFieldValorCampoGeneralLiquidacionImpuestoImporActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLiquidacionImpuestoImpor")) {
				jButtonCerrarOrderByLiquidacionImpuestoImporActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLiquidacionImpuestoImporBusqueda")) {
				this.jButtonidLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedido_compra_imporLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedido_compra_imporLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_empresaLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_empresaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_sucursalLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_sucursalLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImpor")) {
				this.jButtonid_clienteLiquidacionImpuestoImporActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_clienteLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_clienteLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImpor")) {
				this.jButtonid_facturaLiquidacionImpuestoImporActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_facturaLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_facturaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteLiquidacionImpuestoImporBusqueda")) {
				this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_duiLiquidacionImpuestoImporBusqueda")) {
				this.jButtonnumero_duiLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfechaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfecha_pagoLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fobLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfobLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("seguroLiquidacionImpuestoImporBusqueda")) {
				this.jButtonseguroLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfleteLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_fodiLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_ivaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tasa_controlLiquidacionImpuestoImporBusqueda")) {
				this.jButtontasa_controlLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cfrLiquidacionImpuestoImporBusqueda")) {
				this.jButtoncfrLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cifLiquidacionImpuestoImporBusqueda")) {
				this.jButtoncifLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalLiquidacionImpuestoImporBusqueda")) {
				this.jButtontotalLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImpor")) {
				this.jButtonid_clienteLiquidacionImpuestoImporActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImpor")) {
				this.jButtonid_facturaLiquidacionImpuestoImporActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteLiquidacionImpuestoImpor")) {
				this.jButtonFK_IdClienteLiquidacionImpuestoImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaLiquidacionImpuestoImpor")) {
				this.jButtonFK_IdFacturaLiquidacionImpuestoImporActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPedidoCompraImporLiquidacionImpuestoImpor")) {
				this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImporActionPerformed(evt);
			}
			
			;
			
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLiquidacionImpuestoImpor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LiquidacionImpuestoImpor liquidacionimpuestoimporLocal=null;
			
			if(!this.getEsControlTabla()) {
				liquidacionimpuestoimporLocal=this.liquidacionimpuestoimpor;
			} else {
				liquidacionimpuestoimporLocal=this.liquidacionimpuestoimporAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
							
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
								
						
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
								
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
							
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
								
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLiquidacionImpuestoImpor")) {
					jCheckBoxSeleccionarTodosLiquidacionImpuestoImporItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLiquidacionImpuestoImpor")) {
					jCheckBoxSeleccionadosLiquidacionImpuestoImporItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLiquidacionImpuestoImpor")) {
					
				}
				
				


				
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
												
				
				


				
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.liquidacionimpuestoimpor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.liquidacionimpuestoimpor);
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LiquidacionImpuestoImpor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LiquidacionImpuestoImpor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLiquidacionImpuestoImporActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.liquidacionimpuestoimporAnterior =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLiquidacionImpuestoImpor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLiquidacionImpuestoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLiquidacionImpuestoImpor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.liquidacionimpuestoimpor =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.liquidacionimpuestoimpor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLiquidacionImpuestoImpor")) {
				
				}
				
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLiquidacionImpuestoImpor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLiquidacionImpuestoImpor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLiquidacionImpuestoImpor")) {
			
			}
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLiquidacionImpuestoImpor();
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			if(sTipo.equals("NuevoLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLiquidacionImpuestoImpor")) {
				jButtonDuplicarLiquidacionImpuestoImporActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLiquidacionImpuestoImpor")) {
				jButtonCopiarLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLiquidacionImpuestoImpor")) {
				jButtonVerFormLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLiquidacionImpuestoImpor")) {
				jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLiquidacionImpuestoImpor")) {
				jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLiquidacionImpuestoImpor")) {
				jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLiquidacionImpuestoImpor")) {
				jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLiquidacionImpuestoImpor")) {
				jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLiquidacionImpuestoImpor")) {
				jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLiquidacionImpuestoImpor")) {
				jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLiquidacionImpuestoImpor")) {
				jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLiquidacionImpuestoImpor")) {
				jButtonAbrirOrderByLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLiquidacionImpuestoImpor")) {
				jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLiquidacionImpuestoImpor")) {
				jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLiquidacionImpuestoImpor")) {
				jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLiquidacionImpuestoImporBusqueda")) {
				this.jButtonidLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedido_compra_imporLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedido_compra_imporLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_empresaLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_empresaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_sucursalLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_sucursalLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImpor")) {
				this.jButtonid_clienteLiquidacionImpuestoImporActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_clienteLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_clienteLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImpor")) {
				this.jButtonid_facturaLiquidacionImpuestoImporActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImporUpdate")) {
				this.jButtonid_facturaLiquidacionImpuestoImporUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonid_facturaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteLiquidacionImpuestoImporBusqueda")) {
				this.jButtonnumero_comprobanteLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_duiLiquidacionImpuestoImporBusqueda")) {
				this.jButtonnumero_duiLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfechaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfecha_pagoLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fobLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfobLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("seguroLiquidacionImpuestoImporBusqueda")) {
				this.jButtonseguroLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteLiquidacionImpuestoImporBusqueda")) {
				this.jButtonfleteLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_fodiLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_fodiLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_ivaLiquidacionImpuestoImporBusqueda")) {
				this.jButtonporcentaje_ivaLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tasa_controlLiquidacionImpuestoImporBusqueda")) {
				this.jButtontasa_controlLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cfrLiquidacionImpuestoImporBusqueda")) {
				this.jButtoncfrLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cifLiquidacionImpuestoImporBusqueda")) {
				this.jButtoncifLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalLiquidacionImpuestoImporBusqueda")) {
				this.jButtontotalLiquidacionImpuestoImporBusquedaActionPerformed(evt);
			}
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLiquidacionImpuestoImpor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLiquidacionImpuestoImpor")) {
				closingInternalFrameLiquidacionImpuestoImpor();
				
			} else if(sTipo.equals("jButtonCancelarLiquidacionImpuestoImpor")) {
				JInternalFrameBase jInternalFrameDetalleFormLiquidacionImpuestoImpor = (JInternalFrameBase)evt.getSource();
	            	
	            LiquidacionImpuestoImporBeanSwingJInternalFrame jInternalFrameParent=(LiquidacionImpuestoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormLiquidacionImpuestoImpor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLiquidacionImpuestoImporActionPerformed(null);
			}
			
			LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.liquidacionimpuestoimpor,new Object(),this.liquidacionimpuestoimporParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLiquidacionImpuestoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLiquidacionImpuestoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLiquidacionImpuestoImpor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {
			if(!esControlTabla) {
				if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);			
				}
				
				if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.liquidacionimpuestoimporReturnGeneral=liquidacionimpuestoimporLogic.procesarEventosLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),this.liquidacionimpuestoimpor,this.liquidacionimpuestoimporParameterGeneral,this.isEsNuevoLiquidacionImpuestoImpor,classes);//this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral,this.liquidacionimpuestoimporBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLiquidacionImpuestoImpor(classes,this.liquidacionimpuestoimporReturnGeneral,this.liquidacionimpuestoimporBean,false);
					}
						
					if(this.liquidacionimpuestoimporReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor());	
					}
						
					if(this.liquidacionimpuestoimporReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor(),classes);//this.liquidacionimpuestoimporBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,classes);//this.liquidacionimpuestoimporBean);									
				}
			
				if(LiquidacionImpuestoImporJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLiquidacionImpuestoImpor(this.liquidacionimpuestoimpor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.liquidacionimpuestoimporAnterior!=null) {
						this.liquidacionimpuestoimpor=this.liquidacionimpuestoimporAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.liquidacionimpuestoimporReturnGeneral=liquidacionimpuestoimporLogic.procesarEventosLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),this.liquidacionimpuestoimpor,this.liquidacionimpuestoimporParameterGeneral,this.isEsNuevoLiquidacionImpuestoImpor,classes);//this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.liquidacionimpuestoimporSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor(),liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor(),this.liquidacionimpuestoimpors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLiquidacionImpuestoImpor.repaint();
				
				//((AbstractTableModel) this.jTableDatosLiquidacionImpuestoImpor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLiquidacionImpuestoImpor();
			}
		}
	}
	
	public void actualizarVisualTableDatosLiquidacionImpuestoImpor() throws Exception {
		
		LiquidacionImpuestoImporModel liquidacionimpuestoimporModel=(LiquidacionImpuestoImporModel)this.jTableDatosLiquidacionImpuestoImpor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			liquidacionimpuestoimporModel.liquidacionimpuestoimpors=this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			liquidacionimpuestoimporModel.liquidacionimpuestoimpors=this.liquidacionimpuestoimpors;
		}
		
		
		((LiquidacionImpuestoImporModel) this.jTableDatosLiquidacionImpuestoImpor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLiquidacionImpuestoImpor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getliquidacionimpuestoimporAnterior(),this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getliquidacionimpuestoimporAnterior(),this.liquidacionimpuestoimpors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLiquidacionImpuestoImpor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpuestoImpor.class)) {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors());
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimpuestoimpor,new Object(),generalEntityParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsOfLiquidacionImpuestoImpor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LiquidacionImpuestoImporConstantesFunciones.getClassesRelationshipsFromStringsOfLiquidacionImpuestoImpor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLiquidacionImpuestoImpor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.liquidacionimpuestoimpor,new Object(),generalEntityParameterGeneral,this.liquidacionimpuestoimporReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLiquidacionImpuestoImpor(LiquidacionImpuestoImporBean liquidacionimpuestoimporBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpuestoImpor.class)) {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.setDetalleLiquidacionImpuestoImpors(liquidacionimpuestoimpor.getDetalleLiquidacionImpuestoImpors());
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpuestoImpor(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLiquidacionImpuestoImpor(ArrayList<Classe> classes,LiquidacionImpuestoImporReturnGeneral liquidacionimpuestoimporReturnGeneral,LiquidacionImpuestoImporBean liquidacionimpuestoimporBean,Boolean conDefault) throws Exception {
		
			this.liquidacionimpuestoimporBean.setDetalleLiquidacionImpuestoImpors(liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor().getDetalleLiquidacionImpuestoImpors());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleLiquidacionImpuestoImpor.class)) {
					liquidacionimpuestoimpor.setDetalleLiquidacionImpuestoImpors(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporBeanSwingJInternalFrame.detalleliquidacionimpuestoimporLogic.getDetalleLiquidacionImpuestoImpors());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor = new LiquidacionImpuestoImporDetalleFormJInternalFrame(jDesktopPane,this.liquidacionimpuestoimporSessionBean.getConGuardarRelaciones(),this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setVisible(false);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setSelected(false);						
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.liquidacionimpuestoimporLogic=this.liquidacionimpuestoimporLogic;
		
		this.cargarCombosFrameForeignKeyLiquidacionImpuestoImpor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLiquidacionImpuestoImpor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLiquidacionImpuestoImpor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLiquidacionImpuestoImpor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLiquidacionImpuestoImpor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLiquidacionImpuestoImpor"));
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarLiquidacionImpuestoImpor"));

		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarLiquidacionImpuestoImpor"));
					
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemModificarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"ActualizarLiquidacionImpuestoImpor"));
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLiquidacionImpuestoImpor"));
						
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemActualizarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarLiquidacionImpuestoImpor"));
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarLiquidacionImpuestoImpor"));
								
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemEliminarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarLiquidacionImpuestoImpor"));
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarLiquidacionImpuestoImpor"));
					
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemCancelarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLiquidacionImpuestoImpor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemDetalleCerrarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLiquidacionImpuestoImpor"));		
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLiquidacionImpuestoImpor"));
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLiquidacionImpuestoImpor"));
		
		
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLiquidacionImpuestoImpor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonidLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"idLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_compra_imporLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_compra_imporLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_empresaLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_empresaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_sucursalLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImpuestoImporBusqueda"));
		//jButtonid_clienteLiquidacionImpuestoImpor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteLiquidacionImpuestoImporActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImpor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImporBusqueda"));
		//jButtonid_facturaLiquidacionImpuestoImpor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaLiquidacionImpuestoImporActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImpor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_duiLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfechaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfobLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fobLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonseguroLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"seguroLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfleteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_fodiLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_ivaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtontasa_controlLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"tasa_controlLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtoncfrLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cfrLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtoncifLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cifLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtontotalLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"totalLiquidacionImpuestoImporBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLiquidacionImpuestoImpor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLiquidacionImpuestoImpor"));
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLiquidacionImpuestoImpor"));
		}
		
		this.jTableDatosLiquidacionImpuestoImpor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLiquidacionImpuestoImpor"));
		
		this.jTableDatosLiquidacionImpuestoImpor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLiquidacionImpuestoImpor"));
		
		this.jButtonNuevoLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"NuevoLiquidacionImpuestoImpor"));
		
		this.jButtonDuplicarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"DuplicarLiquidacionImpuestoImpor"));
		
		this.jButtonCopiarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"CopiarLiquidacionImpuestoImpor"));
		
		this.jButtonVerFormLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"VerFormLiquidacionImpuestoImpor"));
		
		
		this.jButtonNuevoToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"NuevoToolBarLiquidacionImpuestoImpor"));
			
		this.jButtonDuplicarToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLiquidacionImpuestoImpor"));
			
		this.jMenuItemNuevoLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLiquidacionImpuestoImpor"));
			
		this.jMenuItemDuplicarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLiquidacionImpuestoImpor"));		
		
		
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLiquidacionImpuestoImpor"));
		
		
		this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLiquidacionImpuestoImpor"));
			
		this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLiquidacionImpuestoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonModificarToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ModificarToolBarLiquidacionImpuestoImpor"));
			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemModificarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"MenuItemModificarLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"ActualizarLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonActualizarToolBarLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLiquidacionImpuestoImpor"));
				
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemActualizarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonEliminarToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"EliminarToolBarLiquidacionImpuestoImpor"));
						
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemEliminarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonCancelarToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CancelarToolBarLiquidacionImpuestoImpor"));
			
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemCancelarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLiquidacionImpuestoImpor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLiquidacionImpuestoImpor"));		
		
		
		this.jButtonCerrarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CerrarLiquidacionImpuestoImpor"));
		
		
		this.jButtonCerrarToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CerrarToolBarLiquidacionImpuestoImpor"));
			
		this.jMenuItemCerrarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLiquidacionImpuestoImpor"));
			
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jMenuItemDetalleCerrarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLiquidacionImpuestoImpor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosLiquidacionImpuestoImpor"));
		}
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLiquidacionImpuestoImpor"));
		}
		
		this.jButtonCopiarToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CopiarToolBarLiquidacionImpuestoImpor"));
			
		this.jButtonVerFormToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"VerFormToolBarLiquidacionImpuestoImpor"));
		
		this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLiquidacionImpuestoImpor"));
			
		this.jMenuItemCopiarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLiquidacionImpuestoImpor"));		
		
		this.jMenuItemVerFormLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLiquidacionImpuestoImpor"));		
		
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLiquidacionImpuestoImpor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLiquidacionImpuestoImpor"));
			
		this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLiquidacionImpuestoImpor"));		
		
		
		
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionLiquidacionImpuestoImpor"));
					
		this.jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLiquidacionImpuestoImpor"));
		
		this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLiquidacionImpuestoImpor"));		
		
		
		
		this.jButtonAnterioresLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AnterioresLiquidacionImpuestoImpor"));
		
		
		this.jButtonAnterioresToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLiquidacionImpuestoImpor"));
		
		this.jMenuItemAnterioresLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLiquidacionImpuestoImpor"));		
		
		
		this.jButtonSiguientesLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"SiguientesLiquidacionImpuestoImpor"));
		
		
		this.jButtonSiguientesToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLiquidacionImpuestoImpor"));
			
		this.jMenuItemSiguientesLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLiquidacionImpuestoImpor"));
			
		this.jMenuItemAbrirOrderByLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLiquidacionImpuestoImpor"));
			
		this.jMenuItemMostrarOcultarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLiquidacionImpuestoImpor"));
			
		this.jMenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLiquidacionImpuestoImpor"));
			
		this.jMenuItemDetalleMostarOcultarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLiquidacionImpuestoImpor"));		
		
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLiquidacionImpuestoImpor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLiquidacionImpuestoImpor"));
			
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLiquidacionImpuestoImpor"));

		this.jCheckBoxSeleccionadosLiquidacionImpuestoImpor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLiquidacionImpuestoImpor"));
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLiquidacionImpuestoImpor"));
		}
		
		
		this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposRelacionesLiquidacionImpuestoImpor"));
			
		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposAccionesLiquidacionImpuestoImpor"));
					
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLiquidacionImpuestoImpor"));
			
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLiquidacionImpuestoImpor"));		
		
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonidLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"idLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_compra_imporLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_compra_imporLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_empresaLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_empresaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_sucursalLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImpuestoImporBusqueda"));
		//jButtonid_clienteLiquidacionImpuestoImpor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteLiquidacionImpuestoImporActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImpor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImporBusqueda"));
		//jButtonid_facturaLiquidacionImpuestoImpor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaLiquidacionImpuestoImporActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImpor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_duiLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfechaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfobLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fobLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonseguroLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"seguroLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfleteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_fodiLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_ivaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtontasa_controlLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"tasa_controlLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtoncfrLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cfrLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtoncifLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cifLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtontotalLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"totalLiquidacionImpuestoImporBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdClienteLiquidacionImpuestoImpor"));

			this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImpor"));

			this.jButtonFK_IdFacturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdFacturaLiquidacionImpuestoImpor"));

			this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImpor"));

			this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdPedidoCompraImporLiquidacionImpuestoImpor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLiquidacionImpuestoImpor"));
				this.jInternalFrameReporteDinamicoLiquidacionImpuestoImpor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLiquidacionImpuestoImpor"));
			}
			
			//this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLiquidacionImpuestoImpor"));				
			//this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLiquidacionImpuestoImpor"));
			//this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLiquidacionImpuestoImpor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLiquidacionImpuestoImpor"));
				this.jInternalFrameImportacionLiquidacionImpuestoImpor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLiquidacionImpuestoImpor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByLiquidacionImpuestoImpor"));
			
			this.jButtonAbrirOrderByToolBarLiquidacionImpuestoImpor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLiquidacionImpuestoImpor"));			
			
			if(this.jInternalFrameOrderByLiquidacionImpuestoImpor!=null) {
				this.jInternalFrameOrderByLiquidacionImpuestoImpor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLiquidacionImpuestoImpor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTabbedPaneRelacionesLiquidacionImpuestoImpor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLiquidacionImpuestoImpor"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameLiquidacionImpuestoImpor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLiquidacionImpuestoImpor = (JInternalFrameBase)event.getSource();
	            	
	            LiquidacionImpuestoImporBeanSwingJInternalFrame jInternalFrameParent=(LiquidacionImpuestoImporBeanSwingJInternalFrame)jInternalFrameDetalleFormLiquidacionImpuestoImpor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLiquidacionImpuestoImporActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLiquidacionImpuestoImpor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLiquidacionImpuestoImporListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLiquidacionImpuestoImpor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLiquidacionImpuestoImpor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLiquidacionImpuestoImpor";
		inputMap = this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLiquidacionImpuestoImporActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLiquidacionImpuestoImpor";
		inputMap = this.jButtonModificarLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLiquidacionImpuestoImpor";
		inputMap = this.jButtonActualizarLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLiquidacionImpuestoImpor";
		inputMap = this.jButtonEliminarLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLiquidacionImpuestoImpor";
		inputMap = this.jButtonCancelarLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLiquidacionImpuestoImpor";
		inputMap = this.jButtonCerrarLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLiquidacionImpuestoImpor";
		inputMap = this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonGuardarCambiosLiquidacionImpuestoImpor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLiquidacionImpuestoImpor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLiquidacionImpuestoImporItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLiquidacionImpuestoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLiquidacionImpuestoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLiquidacionImpuestoImporActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonidLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"idLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_pedido_compra_imporLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_compra_imporLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_pedido_compra_imporLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_compra_imporLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_empresaLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_empresaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLiquidacionImpuestoImporBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_sucursalLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_sucursalLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLiquidacionImpuestoImporBusqueda"));
		//jButtonid_clienteLiquidacionImpuestoImpor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteLiquidacionImpuestoImporActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImpor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImporBusqueda"));
		//jButtonid_facturaLiquidacionImpuestoImpor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaLiquidacionImpuestoImporActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImpor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImporUpdate.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImporUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonnumero_comprobanteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonnumero_duiLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"numero_duiLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfechaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fechaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfecha_pagoLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfobLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fobLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonseguroLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"seguroLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonfleteLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"fleteLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonporcentaje_fodiLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_fodiLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonporcentaje_ivaLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_ivaLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtontasa_controlLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"tasa_controlLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtoncfrLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cfrLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtoncifLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"cifLiquidacionImpuestoImporBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtontotalLiquidacionImpuestoImporBusqueda.addActionListener(new ButtonActionListener(this,"totalLiquidacionImpuestoImporBusqueda"));
		
		
		this.jButtonFK_IdClienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdClienteLiquidacionImpuestoImpor"));

		this.jButtonBuscarFK_IdClienteid_clienteLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_clienteLiquidacionImpuestoImpor"));

		this.jButtonFK_IdFacturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdFacturaLiquidacionImpuestoImpor"));

		this.jButtonBuscarFK_IdFacturaid_facturaLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"id_facturaLiquidacionImpuestoImpor"));

		this.jButtonFK_IdPedidoCompraImporLiquidacionImpuestoImpor.addActionListener(new ButtonActionListener(this,"FK_IdPedidoCompraImporLiquidacionImpuestoImpor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLiquidacionImpuestoImpor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLiquidacionImpuestoImporActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLiquidacionImpuestoImporActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLiquidacionImpuestoImpor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLiquidacionImpuestoImpor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
					liquidacionimpuestoimporAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimpors) {
					liquidacionimpuestoimporAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLiquidacionImpuestoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
						liquidacionimpuestoimporAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimpors) {
						liquidacionimpuestoimporAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimpors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLiquidacionImpuestoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLiquidacionImpuestoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLiquidacionImpuestoImporItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLiquidacionImpuestoImpor.getSelectedRows();
			
			LiquidacionImpuestoImpor liquidacionimpuestoimporLocal=new LiquidacionImpuestoImpor();
			
			//this.seleccionarTodosLiquidacionImpuestoImpor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					liquidacionimpuestoimporLocal =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors().toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					liquidacionimpuestoimporLocal =(LiquidacionImpuestoImpor) this.liquidacionimpuestoimpors.toArray()[this.jTableDatosLiquidacionImpuestoImpor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				liquidacionimpuestoimporLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
						liquidacionimpuestoimporAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimpors) {
						liquidacionimpuestoimporAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLiquidacionImpuestoImpor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLiquidacionImpuestoImpor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLiquidacionImpuestoImpor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLiquidacionImpuestoImporItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLiquidacionImpuestoImporParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLiquidacionImpuestoImporActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLiquidacionImpuestoImpor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
				
						if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							liquidacionimpuestoimporAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI)) {
							existe=true;
							liquidacionimpuestoimporAux.setnumero_dui(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							liquidacionimpuestoimporAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							liquidacionimpuestoimporAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB)) {
							existe=true;
							liquidacionimpuestoimporAux.setfob(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO)) {
							existe=true;
							liquidacionimpuestoimporAux.setseguro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							liquidacionimpuestoimporAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI)) {
							existe=true;
							liquidacionimpuestoimporAux.setporcentaje_fodi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA)) {
							existe=true;
							liquidacionimpuestoimporAux.setporcentaje_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL)) {
							existe=true;
							liquidacionimpuestoimporAux.settasa_control(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR)) {
							existe=true;
							liquidacionimpuestoimporAux.setcfr(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF)) {
							existe=true;
							liquidacionimpuestoimporAux.setcif(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							liquidacionimpuestoimporAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimpors) {
					
						if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							liquidacionimpuestoimporAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI)) {
							existe=true;
							liquidacionimpuestoimporAux.setnumero_dui(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							liquidacionimpuestoimporAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							liquidacionimpuestoimporAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB)) {
							existe=true;
							liquidacionimpuestoimporAux.setfob(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO)) {
							existe=true;
							liquidacionimpuestoimporAux.setseguro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							liquidacionimpuestoimporAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI)) {
							existe=true;
							liquidacionimpuestoimporAux.setporcentaje_fodi(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA)) {
							existe=true;
							liquidacionimpuestoimporAux.setporcentaje_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL)) {
							existe=true;
							liquidacionimpuestoimporAux.settasa_control(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR)) {
							existe=true;
							liquidacionimpuestoimporAux.setcfr(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF)) {
							existe=true;
							liquidacionimpuestoimporAux.setcif(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							liquidacionimpuestoimporAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLiquidacionImpuestoImporActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLiquidacionImpuestoImpor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLiquidacionImpuestoImpor) {				
					conSplash=true;//false;										
					
					//this.startProcessLiquidacionImpuestoImpor(conSplash);
				
					this.generarReporteLiquidacionImpuestoImporsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLiquidacionImpuestoImporsSeleccionados();
				//this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLiquidacionImpuestoImporsSeleccionados(false);
				//this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLiquidacionImpuestoImporsSeleccionados(true);
				//this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLiquidacionImpuestoImpor();
				
				this.exportarLiquidacionImpuestoImporsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLiquidacionImpuestoImpors();
				//this.importarLiquidacionImpuestoImpors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLiquidacionImpuestoImpor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLiquidacionImpuestoImporsSeleccionados();
				//this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLiquidacionImpuestoImpor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLiquidacionImpuestoImpor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLiquidacionImpuestoImpor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
				}	
			} 			
			else if(LiquidacionImpuestoImporBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLiquidacionImpuestoImpor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLiquidacionImpuestoImpor(conSplash);
					
						//this.actualizarParametrosGeneralLiquidacionImpuestoImpor();
						
						this.generarReporteProcesoAccionLiquidacionImpuestoImporsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Liquidacion Impuesto ImporES SELECCIONADOS?", "MANTENIMIENTO DE Liquidacion Impuesto Impor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLiquidacionImpuestoImpor();
				
						this.actualizarParametrosGeneralLiquidacionImpuestoImpor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.liquidacionimpuestoimporReturnGeneral=liquidacionimpuestoimporLogic.procesarAccionLiquidacionImpuestoImporsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors(),this.liquidacionimpuestoimporParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLiquidacionImpuestoImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLiquidacionImpuestoImpor();
					
					LiquidacionImpuestoImporBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLiquidacionImpuestoImporReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLiquidacionImpuestoImpor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxTiposAccionesFormularioLiquidacionImpuestoImpor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLiquidacionImpuestoImpor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLiquidacionImpuestoImporActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLiquidacionImpuestoImpor();
			
			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
			LiquidacionImpuestoImpor liquidacionimpuestoimpor=new LiquidacionImpuestoImpor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLiquidacionImpuestoImpor.getSelectedItem();
			
			
			
			
			liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
			//this.sTipoAccion;
			
			if(liquidacionimpuestoimporsSeleccionados.size()==1) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsSeleccionados) {
					liquidacionimpuestoimpor=liquidacionimpuestoimporAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Liquidacion Impuesto Impor")) {
					jButtonDetalleLiquidacionImpuestoImporActionPerformed(null,rowIndex,true,false,liquidacionimpuestoimpor);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLiquidacionImpuestoImpor();
			
      		//this.finishProcessLiquidacionImpuestoImpor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLiquidacionImpuestoImporReturnGeneral() throws Exception {
		if(this.liquidacionimpuestoimporReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.liquidacionimpuestoimporReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.liquidacionimpuestoimporReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.liquidacionimpuestoimporReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.liquidacionimpuestoimporReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.liquidacionimpuestoimporReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
		}
		
		if(this.liquidacionimpuestoimporReturnGeneral.getConRetornoLista() || this.liquidacionimpuestoimporReturnGeneral.getConRetornoObjeto()) {
			if(this.liquidacionimpuestoimporReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpors(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.liquidacionimpuestoimporReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.liquidacionimpuestoimporLogic.setLiquidacionImpuestoImpor(this.liquidacionimpuestoimporReturnGeneral.getLiquidacionImpuestoImpor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLiquidacionImpuestoImpor(false);
		}
	}
	
	public void actualizarParametrosGeneralLiquidacionImpuestoImpor() throws Exception {
		
		
	}
	
	public ArrayList<LiquidacionImpuestoImpor> getLiquidacionImpuestoImporsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLiquidacionImpuestoImpor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors()) {
					if(liquidacionimpuestoimporAux.getIsSelected()) {
						liquidacionimpuestoimporsSeleccionados.add(liquidacionimpuestoimporAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:this.liquidacionimpuestoimpors) {
					if(liquidacionimpuestoimporAux.getIsSelected()) {
						liquidacionimpuestoimporsSeleccionados.add(liquidacionimpuestoimporAux);				
					}
				}
			}
			
			if(liquidacionimpuestoimporsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						liquidacionimpuestoimporsSeleccionados.addAll(this.liquidacionimpuestoimporLogic.getLiquidacionImpuestoImpors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						liquidacionimpuestoimporsSeleccionados.addAll(this.liquidacionimpuestoimpors);				
					}
				}
			}
		} else {
			liquidacionimpuestoimporsSeleccionados.add(this.liquidacionimpuestoimpor);
		}
		
		return liquidacionimpuestoimporsSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteLiquidacionImpuestoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLiquidacionImpuestoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLiquidacionImpuestoImporsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLiquidacionImpuestoImporsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLiquidacionImpuestoImporsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesLiquidacionImpuestoImporsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Liquidacion Impuesto Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados);
		
	}	
	
	public void generarReporteNormalLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLiquidacionImpuestoImporsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLiquidacionImpuestoImpor();
		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLiquidacionImpuestoImpor();
		
		
		//this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados ,liquidacionimpuestoimporImplementable,liquidacionimpuestoimporImplementableHome);
	}
	
	public void mostrarImportacionLiquidacionImpuestoImpors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLiquidacionImpuestoImpor();
		
		this.abrirFrameImportacionLiquidacionImpuestoImpor();		
		
			
		//this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados ,liquidacionimpuestoimporImplementable,liquidacionimpuestoimporImplementableHome);
	}
	
	public void importarLiquidacionImpuestoImpors() throws Exception {		
	
	}
	
	public void exportarLiquidacionImpuestoImporsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLiquidacionImpuestoImporsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLiquidacionImpuestoImporsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLiquidacionImpuestoImporsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Liquidacion Impuesto Impor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLiquidacionImpuestoImpor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLiquidacionImpuestoImpor(liquidacionimpuestoimporAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//liquidacionimpuestoimporAux.setsDetalleGeneralEntityReporte(liquidacionimpuestoimporAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLiquidacionImpuestoImpor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=liquidacionimpuestoimpor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getpedidocompraimpor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getnumero_dui();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getfecha_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getfob().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getseguro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getporcentaje_fodi().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getporcentaje_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.gettasa_control().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getcfr().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.getcif().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=liquidacionimpuestoimpor.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LiquidacionImpuestoImpors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLiquidacionImpuestoImpor(row);				
				iRow++;
			}				
			
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLiquidacionImpuestoImpor(liquidacionimpuestoimporAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLiquidacionImpuestoImporsSeleccionados() throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();		
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"liquidacionimpuestoimpor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("liquidacionimpuestoimpors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("liquidacionimpuestoimpor");
			//elementRoot.appendChild(element);
		
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsSeleccionados) {
				element = document.createElement("liquidacionimpuestoimpor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLiquidacionImpuestoImpor(liquidacionimpuestoimporAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Liquidacion Impuesto Impor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLiquidacionImpuestoImpor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FOB);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_SEGURO);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEFODI);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_PORCENTAJEIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_TASACONTROL);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_CFR);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_CIF);
		cell = row.createCell(iColumn++);cell.setCellValue(LiquidacionImpuestoImporConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getpedidocompraimpor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getnumero_dui());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getfecha_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getfob());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getseguro());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getporcentaje_fodi());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getporcentaje_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.gettasa_control());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getcfr());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.getcif());
		cell = row.createCell(iColumn++);cell.setCellValue(liquidacionimpuestoimpor.gettotal());				
	}
	
	public void setFilaDatosExportarXmlLiquidacionImpuestoImpor(LiquidacionImpuestoImpor liquidacionimpuestoimpor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LiquidacionImpuestoImporConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(liquidacionimpuestoimpor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LiquidacionImpuestoImporConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(liquidacionimpuestoimpor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpedidocompraimpor_descripcion = document.createElement(LiquidacionImpuestoImporConstantesFunciones.IDPEDIDOCOMPRAIMPOR);
		elementpedidocompraimpor_descripcion.appendChild(document.createTextNode(liquidacionimpuestoimpor.getpedidocompraimpor_descripcion()));
		element.appendChild(elementpedidocompraimpor_descripcion);

		Element elementempresa_descripcion = document.createElement(LiquidacionImpuestoImporConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(liquidacionimpuestoimpor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(LiquidacionImpuestoImporConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(liquidacionimpuestoimpor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(LiquidacionImpuestoImporConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(liquidacionimpuestoimpor.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfactura_descripcion = document.createElement(LiquidacionImpuestoImporConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(liquidacionimpuestoimpor.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementnumero_comprobante = document.createElement(LiquidacionImpuestoImporConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(liquidacionimpuestoimpor.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnumero_dui = document.createElement(LiquidacionImpuestoImporConstantesFunciones.NUMERODUI);
		elementnumero_dui.appendChild(document.createTextNode(liquidacionimpuestoimpor.getnumero_dui().trim()));
		element.appendChild(elementnumero_dui);

		Element elementfecha = document.createElement(LiquidacionImpuestoImporConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(liquidacionimpuestoimpor.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_pago = document.createElement(LiquidacionImpuestoImporConstantesFunciones.FECHAPAGO);
		elementfecha_pago.appendChild(document.createTextNode(liquidacionimpuestoimpor.getfecha_pago().toString().trim()));
		element.appendChild(elementfecha_pago);

		Element elementfob = document.createElement(LiquidacionImpuestoImporConstantesFunciones.FOB);
		elementfob.appendChild(document.createTextNode(liquidacionimpuestoimpor.getfob().toString().trim()));
		element.appendChild(elementfob);

		Element elementseguro = document.createElement(LiquidacionImpuestoImporConstantesFunciones.SEGURO);
		elementseguro.appendChild(document.createTextNode(liquidacionimpuestoimpor.getseguro().toString().trim()));
		element.appendChild(elementseguro);

		Element elementflete = document.createElement(LiquidacionImpuestoImporConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(liquidacionimpuestoimpor.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementporcentaje_fodi = document.createElement(LiquidacionImpuestoImporConstantesFunciones.PORCENTAJEFODI);
		elementporcentaje_fodi.appendChild(document.createTextNode(liquidacionimpuestoimpor.getporcentaje_fodi().toString().trim()));
		element.appendChild(elementporcentaje_fodi);

		Element elementporcentaje_iva = document.createElement(LiquidacionImpuestoImporConstantesFunciones.PORCENTAJEIVA);
		elementporcentaje_iva.appendChild(document.createTextNode(liquidacionimpuestoimpor.getporcentaje_iva().toString().trim()));
		element.appendChild(elementporcentaje_iva);

		Element elementtasa_control = document.createElement(LiquidacionImpuestoImporConstantesFunciones.TASACONTROL);
		elementtasa_control.appendChild(document.createTextNode(liquidacionimpuestoimpor.gettasa_control().toString().trim()));
		element.appendChild(elementtasa_control);

		Element elementcfr = document.createElement(LiquidacionImpuestoImporConstantesFunciones.CFR);
		elementcfr.appendChild(document.createTextNode(liquidacionimpuestoimpor.getcfr().toString().trim()));
		element.appendChild(elementcfr);

		Element elementcif = document.createElement(LiquidacionImpuestoImporConstantesFunciones.CIF);
		elementcif.appendChild(document.createTextNode(liquidacionimpuestoimpor.getcif().toString().trim()));
		element.appendChild(elementcif);

		Element elementtotal = document.createElement(LiquidacionImpuestoImporConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(liquidacionimpuestoimpor.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoLiquidacionImpuestoImporsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados=new ArrayList<LiquidacionImpuestoImpor>();
		
		liquidacionimpuestoimporsSeleccionados=this.getLiquidacionImpuestoImporsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoLiquidacionImpuestoImpor(liquidacionimpuestoimporsSeleccionados);
		
		this.generarReporteLiquidacionImpuestoImpors("Todos",liquidacionimpuestoimporsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLiquidacionImpuestoImpor(ArrayList<LiquidacionImpuestoImpor> liquidacionimpuestoimporsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LiquidacionImpuestoImpor liquidacionimpuestoimporAux:liquidacionimpuestoimporsSeleccionados) {
				liquidacionimpuestoimporAux.setsDetalleGeneralEntityReporte(liquidacionimpuestoimporAux.toString());
			
				if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getpedidocompraimpor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_NUMERODUI)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(liquidacionimpuestoimporAux.getnumero_dui());
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(liquidacionimpuestoimporAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(LiquidacionImpuestoImporConstantesFunciones.LABEL_FECHAPAGO)) {
					existe=true;
					liquidacionimpuestoimporAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(liquidacionimpuestoimporAux.getfecha_pago()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LiquidacionImpuestoImporConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLiquidacionImpuestoImpor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=true;
				this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=true;
				this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=true;
			}
			
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=true;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaModificarLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaCancelarLiquidacionImpuestoImpor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				} else {
					this.isVisibilidadCeldaGuardarLiquidacionImpuestoImpor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LiquidacionImpuestoImporJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=true;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=true;
		} else {
			this.actualizarEstadoPanelsLiquidacionImpuestoImpor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLiquidacionImpuestoImpor=false;
			//this.isVisibilidadCeldaVerFormLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaDuplicarLiquidacionImpuestoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
		} else {
			this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			if(!liquidacionimpuestoimporSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;												
			}
			
			this.jButtonCerrarLiquidacionImpuestoImpor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLiquidacionImpuestoImpor=false;
		}
		
		if(!this.permiteMantenimiento(this.liquidacionimpuestoimpor)) {
			this.isVisibilidadCeldaActualizarLiquidacionImpuestoImpor=false;
			this.isVisibilidadCeldaEliminarLiquidacionImpuestoImpor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLiquidacionImpuestoImpor() {
		this.isVisibilidadCeldaNuevoLiquidacionImpuestoImpor=false;
		this.isVisibilidadCeldaGuardarCambiosLiquidacionImpuestoImpor=false;
	}
	
	public void actualizarEstadoPanelsLiquidacionImpuestoImpor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosEdicionLiquidacionImpuestoImpor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLiquidacionImpuestoImpor!=null) {
				this.jScrollPanelDatosLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelPaginacionLiquidacionImpuestoImpor!=null) {
				this.jPanelPaginacionLiquidacionImpuestoImpor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
					this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.liquidacionimpuestoimporSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor!=null) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLiquidacionImpuestoImpor!=null) {
				this.jPanelParametrosReportesLiquidacionImpuestoImpor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPedidoCompraImpor(Boolean isParaPedidoCompraImpor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPedidoCompraImporNegation=!isParaPedidoCompraImpor;

			this.isVisibilidadFK_IdCliente=isParaPedidoCompraImporNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdClienteLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdFactura=isParaPedidoCompraImporNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdFacturaLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdPedidoCompraImpor=isParaPedidoCompraImpor;
			if(!this.isVisibilidadFK_IdPedidoCompraImpor) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdClienteLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdFacturaLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdPedidoCompraImpor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPedidoCompraImpor) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdClienteLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdFacturaLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdPedidoCompraImpor=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPedidoCompraImpor) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdClienteLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdFactura=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdFacturaLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdPedidoCompraImpor=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPedidoCompraImpor) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdCliente=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdClienteLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdFacturaLiquidacionImpuestoImpor);}

			this.isVisibilidadFK_IdPedidoCompraImpor=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdPedidoCompraImpor) {this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);}
		}
		
	}
	
	

	public String registrarSesionLiquidacionImpuestoImporParaDetalleLiquidacionImpuestoImpores() throws Exception {
		Boolean isPaginaPopupDetalleLiquidacionImpuestoImpor=false;

		try {

			if(this.liquidacionimpuestoimporSessionBean==null) {
				this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean==null) {
				this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean=new DetalleLiquidacionImpuestoImporSessionBean();
			}

			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.setsPathNavegacionActual(liquidacionimpuestoimporSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleLiquidacionImpuestoImporConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleLiquidacionImpuestoImpor=this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpuestoImpor(true);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleLiquidacionImpuestoImpor(LiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.setisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor(true);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.detalleliquidacionimpuestoimporSessionBean.setlidLiquidacionImpuestoImporActual(this.idLiquidacionImpuestoImporActual);

			liquidacionimpuestoimporSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLiquidacionImpuestoImpor(true);
			liquidacionimpuestoimporSessionBean.setlIdLiquidacionImpuestoImporActualForeignKey(this.idLiquidacionImpuestoImporActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionLiquidacionImpuestoImporParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(liquidacionimpuestoimporSessionBean==null) {
				liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(liquidacionimpuestoimporSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.liquidacionimpuestoimporFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(LiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor(true);
			//clienteSessionBean.setlidLiquidacionImpuestoImporActual(this.idLiquidacionImpuestoImporActual);

			liquidacionimpuestoimporSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLiquidacionImpuestoImpor(true);
			liquidacionimpuestoimporSessionBean.setlIdLiquidacionImpuestoImporActualForeignKey(this.idLiquidacionImpuestoImporActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionLiquidacionImpuestoImporParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(liquidacionimpuestoimporSessionBean==null) {
				liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(liquidacionimpuestoimporSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.liquidacionimpuestoimporFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(LiquidacionImpuestoImporConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionLiquidacionImpuestoImpor(true);
			//facturaSessionBean.setlidLiquidacionImpuestoImporActual(this.idLiquidacionImpuestoImporActual);

			liquidacionimpuestoimporSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLiquidacionImpuestoImpor(true);
			liquidacionimpuestoimporSessionBean.setlIdLiquidacionImpuestoImporActualForeignKey(this.idLiquidacionImpuestoImporActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		
		if(this.liquidacionimpuestoimporSessionBean==null) {
			this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		}
		
		this.liquidacionimpuestoimporSessionBean.setsUltimaBusquedaLiquidacionImpuestoImpor(this.getsAccionBusqueda());
		this.liquidacionimpuestoimporSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.liquidacionimpuestoimporSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			liquidacionimpuestoimporSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			liquidacionimpuestoimporSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			liquidacionimpuestoimporSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPedidoCompraImpor")) {
			liquidacionimpuestoimporSessionBean.setid_pedido_compra_impor(this.getid_pedido_compra_imporFK_IdPedidoCompraImpor());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			liquidacionimpuestoimporSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LiquidacionImpuestoImporSessionBean liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		
		if(this.liquidacionimpuestoimporSessionBean==null) {
			this.liquidacionimpuestoimporSessionBean=new LiquidacionImpuestoImporSessionBean();
		}
		
		if(this.liquidacionimpuestoimporSessionBean.getsUltimaBusquedaLiquidacionImpuestoImpor()!=null&&!this.liquidacionimpuestoimporSessionBean.getsUltimaBusquedaLiquidacionImpuestoImpor().equals("")) {
			this.setsAccionBusqueda(liquidacionimpuestoimporSessionBean.getsUltimaBusquedaLiquidacionImpuestoImpor());
			this.setiNumeroPaginacion(liquidacionimpuestoimporSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(liquidacionimpuestoimporSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(liquidacionimpuestoimporSessionBean.getid_cliente());
				liquidacionimpuestoimporSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(liquidacionimpuestoimporSessionBean.getid_empresa());
				liquidacionimpuestoimporSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(liquidacionimpuestoimporSessionBean.getid_factura());
				liquidacionimpuestoimporSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPedidoCompraImpor")) {
				this.setid_pedido_compra_imporFK_IdPedidoCompraImpor(liquidacionimpuestoimporSessionBean.getid_pedido_compra_impor());
				liquidacionimpuestoimporSessionBean.setid_pedido_compra_impor(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(liquidacionimpuestoimporSessionBean.getid_sucursal());
				liquidacionimpuestoimporSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.liquidacionimpuestoimporSessionBean.setsUltimaBusquedaLiquidacionImpuestoImpor("");
		this.liquidacionimpuestoimporSessionBean.setiNumeroPaginacion(LiquidacionImpuestoImporConstantesFunciones.INUMEROPAGINACION);
		this.liquidacionimpuestoimporSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLiquidacionImpuestoImpor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLiquidacionImpuestoImpor() {
		this.updateBorderResaltarBusquedasFormularioLiquidacionImpuestoImpor();
		this.updateVisibilidadBusquedasFormularioLiquidacionImpuestoImpor();
		this.updateHabilitarBusquedasFormularioLiquidacionImpuestoImpor();
	}
	
	public void updateBorderResaltarBusquedasFormularioLiquidacionImpuestoImpor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponents().length>0) {
	

		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdClienteLiquidacionImpuestoImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdClienteLiquidacionImpuestoImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdClienteLiquidacionImpuestoImpor);
			}
		}

		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdFacturaLiquidacionImpuestoImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdFacturaLiquidacionImpuestoImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdFacturaLiquidacionImpuestoImpor);
			}
		}

		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdPedidoCompraImporLiquidacionImpuestoImpor!=null) {
			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
				jPanel.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLiquidacionImpuestoImpor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdClienteLiquidacionImpuestoImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarFK_IdClienteLiquidacionImpuestoImpor);
			if(!this.liquidacionimpuestoimporConstantesFunciones.mostrarFK_IdClienteLiquidacionImpuestoImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdFacturaLiquidacionImpuestoImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarFK_IdFacturaLiquidacionImpuestoImpor);
			if(!this.liquidacionimpuestoimporConstantesFunciones.mostrarFK_IdFacturaLiquidacionImpuestoImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(index);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			if(!this.liquidacionimpuestoimporConstantesFunciones.mostrarFK_IdPedidoCompraImporLiquidacionImpuestoImpor && index>-1) {
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLiquidacionImpuestoImpor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdClienteLiquidacionImpuestoImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarFK_IdClienteLiquidacionImpuestoImpor);
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setEnabledAt(index,this.liquidacionimpuestoimporConstantesFunciones.activarFK_IdClienteLiquidacionImpuestoImpor);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdFacturaLiquidacionImpuestoImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarFK_IdFacturaLiquidacionImpuestoImpor);
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setEnabledAt(index,this.liquidacionimpuestoimporConstantesFunciones.activarFK_IdFacturaLiquidacionImpuestoImpor);
			}

			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
				this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setEnabledAt(index,this.liquidacionimpuestoimporConstantesFunciones.activarFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLiquidacionImpuestoImpor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdClienteLiquidacionImpuestoImpor);

			this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);

			this.liquidacionimpuestoimporConstantesFunciones.setResaltarFK_IdClienteLiquidacionImpuestoImpor(resaltar);

			jPanel.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdClienteLiquidacionImpuestoImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdFacturaLiquidacionImpuestoImpor);

			this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);

			this.liquidacionimpuestoimporConstantesFunciones.setResaltarFK_IdFacturaLiquidacionImpuestoImpor(resaltar);

			jPanel.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdFacturaLiquidacionImpuestoImpor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPedidoCompraImpor")) {
			index= this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.indexOfComponent(this.jPanelFK_IdPedidoCompraImporLiquidacionImpuestoImpor);

			this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLiquidacionImpuestoImpor.getComponent(index);

			this.liquidacionimpuestoimporConstantesFunciones.setResaltarFK_IdPedidoCompraImporLiquidacionImpuestoImpor(resaltar);

			jPanel.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarFK_IdPedidoCompraImporLiquidacionImpuestoImpor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLiquidacionImpuestoImpor.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioLiquidacionImpuestoImpor() throws Exception {

		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLiquidacionImpuestoImpor();
		this.updateVisibilidadResaltarControlesFormularioLiquidacionImpuestoImpor();
		this.updateHabilitarResaltarControlesFormularioLiquidacionImpuestoImpor();
		
	}
	
	public void updateBorderResaltarControlesFormularioLiquidacionImpuestoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltaridLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltaridLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_pedido_compra_imporLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_pedido_compra_imporLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_empresaLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_empresaLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_sucursalLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_clienteLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_clienteLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_facturaLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarid_facturaLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_comprobanteLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_duiLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarnumero_duiLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarfechaLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarfechaLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarfecha_pagoLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarfecha_pagoLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarfobLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarfobLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarseguroLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarseguroLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarfleteLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarfleteLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_fodiLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarporcentaje_ivaLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltartasa_controlLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltartasa_controlLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarcfrLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarcfrLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltarcifLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltarcifLiquidacionImpuestoImpor);}
		if(this.liquidacionimpuestoimporConstantesFunciones.resaltartotalLiquidacionImpuestoImpor!=null && this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setBorder(this.liquidacionimpuestoimporConstantesFunciones.resaltartotalLiquidacionImpuestoImpor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLiquidacionImpuestoImpor() throws Exception {		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
	
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostraridLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelidLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostraridLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_pedido_compra_imporLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelid_pedido_compra_imporLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_pedido_compra_imporLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_empresaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelid_empresaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_empresaLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_sucursalLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelid_sucursalLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_sucursalLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_clienteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelid_clienteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_clienteLiquidacionImpuestoImpor);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_clienteLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_facturaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelid_facturaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_facturaLiquidacionImpuestoImpor);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarid_facturaLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarnumero_comprobanteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelnumero_comprobanteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarnumero_comprobanteLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarnumero_duiLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelnumero_duiLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarnumero_duiLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfechaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelfechaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfechaLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfecha_pagoLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelfecha_pagoLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfecha_pagoLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfobLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelfobLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfobLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarseguroLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelseguroLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarseguroLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfleteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelfleteLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarfleteLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_fodiLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelporcentaje_fodiLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_fodiLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_ivaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelporcentaje_ivaLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarporcentaje_ivaLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrartasa_controlLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPaneltasa_controlLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrartasa_controlLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarcfrLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelcfrLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarcfrLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarcifLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPanelcifLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrarcifLiquidacionImpuestoImpor);
		//this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrartotalLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jPaneltotalLiquidacionImpuestoImpor.setVisible(this.liquidacionimpuestoimporConstantesFunciones.mostrartotalLiquidacionImpuestoImpor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLiquidacionImpuestoImpor() throws Exception {
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLiquidacionImpuestoImpor!=null) {
	
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jLabelidLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activaridLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_pedido_compra_imporLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_pedido_compra_imporLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_empresaLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_empresaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_sucursalLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_sucursalLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_clienteLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_clienteLiquidacionImpuestoImpor);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_clienteLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_clienteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jComboBoxid_facturaLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_facturaLiquidacionImpuestoImpor);
			this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jButtonid_facturaLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarid_facturaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_comprobanteLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarnumero_comprobanteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldnumero_duiLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarnumero_duiLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfechaLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarfechaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jDateChooserfecha_pagoLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarfecha_pagoLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfobLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarfobLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldseguroLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarseguroLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldfleteLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarfleteLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_fodiLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_fodiLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldporcentaje_ivaLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarporcentaje_ivaLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtasa_controlLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activartasa_controlLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcfrLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarcfrLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldcifLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activarcifLiquidacionImpuestoImpor);
		this.jInternalFrameDetalleFormLiquidacionImpuestoImpor.jTextFieldtotalLiquidacionImpuestoImpor.setEnabled(this.liquidacionimpuestoimporConstantesFunciones.activartotalLiquidacionImpuestoImpor);
		}
	}
	
		
}