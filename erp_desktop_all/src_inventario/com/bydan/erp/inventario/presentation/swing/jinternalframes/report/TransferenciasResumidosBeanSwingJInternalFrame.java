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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.TransferenciasResumidosConstantesFunciones;
import com.bydan.erp.inventario.util.report.TransferenciasResumidosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.TransferenciasResumidosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.TransferenciasResumidosBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransferenciasResumidosBeanSwingJInternalFrame extends TransferenciasResumidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransferenciasResumidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TransferenciasResumidos> transferenciasresumidosValidator = new ClassValidator<TransferenciasResumidos>(TransferenciasResumidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TransferenciasResumidos transferenciasresumidos;	
	public TransferenciasResumidos transferenciasresumidosAux;
	public TransferenciasResumidos transferenciasresumidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TransferenciasResumidos transferenciasresumidosTotales;
	public Long idTransferenciasResumidosActual;
	public Long iIdNuevoTransferenciasResumidos=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
	}

	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoTransferenciasResumidos;
	public Boolean isPermisoNuevoTransferenciasResumidos;
	public Boolean isPermisoActualizarTransferenciasResumidos;
	public Boolean isPermisoActualizarOriginalTransferenciasResumidos;
	public Boolean isPermisoEliminarTransferenciasResumidos;
	public Boolean isPermisoGuardarCambiosTransferenciasResumidos;
	public Boolean isPermisoConsultaTransferenciasResumidos;
	public Boolean isPermisoBusquedaTransferenciasResumidos;
	public Boolean isPermisoReporteTransferenciasResumidos;
	public Boolean isPermisoPaginacionMedioTransferenciasResumidos;
	public Boolean isPermisoPaginacionAltoTransferenciasResumidos;
	public Boolean isPermisoPaginacionTodoTransferenciasResumidos;
	public Boolean isPermisoCopiarTransferenciasResumidos;
	public Boolean isPermisoVerFormTransferenciasResumidos;
	public Boolean isPermisoDuplicarTransferenciasResumidos;
	public Boolean isPermisoOrdenTransferenciasResumidos;
	
	
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
	
	public TransferenciasResumidosParameterReturnGeneral transferenciasresumidosReturnGeneral;
	public TransferenciasResumidosParameterReturnGeneral transferenciasresumidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransferenciasResumidos=false;
	public Boolean esParaAccionDesdeFormularioTransferenciasResumidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransferenciasResumidosSessionBeanAdditional transferenciasresumidosSessionBeanAdditional=null;
	
	public TransferenciasResumidosSessionBeanAdditional getTransferenciasResumidosSessionBeanAdditional() {
		return this.transferenciasresumidosSessionBeanAdditional;
	}
	
	public void setTransferenciasResumidosSessionBeanAdditional(TransferenciasResumidosSessionBeanAdditional transferenciasresumidosSessionBeanAdditional) {
		try {
			this.transferenciasresumidosSessionBeanAdditional=transferenciasresumidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransferenciasResumidosBeanSwingJInternalFrameAdditional transferenciasresumidosBeanSwingJInternalFrameAdditional=null;
	//public class TransferenciasResumidosBeanSwingJInternalFrame
	
	public TransferenciasResumidosBeanSwingJInternalFrameAdditional getTransferenciasResumidosBeanSwingJInternalFrameAdditional() {
		return this.transferenciasresumidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransferenciasResumidosBeanSwingJInternalFrameAdditional(TransferenciasResumidosBeanSwingJInternalFrameAdditional transferenciasresumidosBeanSwingJInternalFrameAdditional) {
		try {
			this.transferenciasresumidosBeanSwingJInternalFrameAdditional=transferenciasresumidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransferenciasResumidosLogic transferenciasresumidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TransferenciasResumidos transferenciasresumidosBean;
	public TransferenciasResumidosConstantesFunciones transferenciasresumidosConstantesFunciones;
	//public TransferenciasResumidosParameterReturnGeneral transferenciasresumidosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public TransaccionLogic transaccionLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<TransferenciasResumidos> transferenciasresumidoss;	
	//public List<TransferenciasResumidos> transferenciasresumidossEliminados;
	//public List<TransferenciasResumidos> transferenciasresumidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransferenciasResumidos=false;
	public Boolean isVisibilidadCeldaDuplicarTransferenciasResumidos=true;
	public Boolean isVisibilidadCeldaCopiarTransferenciasResumidos=true;
	public Boolean isVisibilidadCeldaVerFormTransferenciasResumidos=true;
	public Boolean isVisibilidadCeldaOrdenTransferenciasResumidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
	public Boolean isVisibilidadCeldaModificarTransferenciasResumidos=false;
	public Boolean isVisibilidadCeldaActualizarTransferenciasResumidos=false;
	public Boolean isVisibilidadCeldaEliminarTransferenciasResumidos=false;
	public Boolean isVisibilidadCeldaCancelarTransferenciasResumidos=false;
	public Boolean isVisibilidadCeldaGuardarTransferenciasResumidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;	
	
	
	public Boolean isVisibilidadBusquedaTransferenciasResumidos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoTransferenciasResumidos() {
		return this.iIdNuevoTransferenciasResumidos;
	}

	public void setiIdNuevoTransferenciasResumidos(Long iIdNuevoTransferenciasResumidos) {
		this.iIdNuevoTransferenciasResumidos = iIdNuevoTransferenciasResumidos;
	}
	
	public Long getidTransferenciasResumidosActual() {
		return this.idTransferenciasResumidosActual;
	}

	public void setidTransferenciasResumidosActual(Long idTransferenciasResumidosActual) {
		this.idTransferenciasResumidosActual = idTransferenciasResumidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TransferenciasResumidos gettransferenciasresumidos() {
		return this.transferenciasresumidos;
	}

	public void settransferenciasresumidos(TransferenciasResumidos transferenciasresumidos) {
		this.transferenciasresumidos = transferenciasresumidos;
	}
	
	public TransferenciasResumidos gettransferenciasresumidosAux() {
		return this.transferenciasresumidosAux;
	}

	public void settransferenciasresumidosAux(TransferenciasResumidos transferenciasresumidosAux) {
		this.transferenciasresumidosAux = transferenciasresumidosAux;
	}				
	
	public TransferenciasResumidos gettransferenciasresumidosAnterior() {
		return this.transferenciasresumidosAnterior;
	}

	public void settransferenciasresumidosAnterior(TransferenciasResumidos transferenciasresumidosAnterior) {
		this.transferenciasresumidosAnterior = transferenciasresumidosAnterior;
	}	
	
	public TransferenciasResumidos gettransferenciasresumidosTotales() {
		return this.transferenciasresumidosTotales;
	}

	public void settransferenciasresumidosTotales(TransferenciasResumidos transferenciasresumidosTotales) {
		this.transferenciasresumidosTotales = transferenciasresumidosTotales;
	}	
	
	public TransferenciasResumidos gettransferenciasresumidosBean() {
		return this.transferenciasresumidosBean;
	}

	public void settransferenciasresumidosBean(TransferenciasResumidos transferenciasresumidosBean) {
		this.transferenciasresumidosBean = transferenciasresumidosBean;
	}	
	
	public TransferenciasResumidosParameterReturnGeneral gettransferenciasresumidosReturnGeneral() {
		return this.transferenciasresumidosReturnGeneral;
	}

	public void settransferenciasresumidosReturnGeneral(TransferenciasResumidosParameterReturnGeneral transferenciasresumidosReturnGeneral) {
		this.transferenciasresumidosReturnGeneral = transferenciasresumidosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaTransferenciasResumidos=-1L;

	public Long getid_bodegaBusquedaTransferenciasResumidos() {
		return this.id_bodegaBusquedaTransferenciasResumidos;
	}

	public void setid_bodegaBusquedaTransferenciasResumidos(Long id_bodegaBusquedaTransferenciasResumidos) {
		this.id_bodegaBusquedaTransferenciasResumidos = id_bodegaBusquedaTransferenciasResumidos;
	}

;
	public Long id_productoBusquedaTransferenciasResumidos=-1L;

	public Long getid_productoBusquedaTransferenciasResumidos() {
		return this.id_productoBusquedaTransferenciasResumidos;
	}

	public void setid_productoBusquedaTransferenciasResumidos(Long id_productoBusquedaTransferenciasResumidos) {
		this.id_productoBusquedaTransferenciasResumidos = id_productoBusquedaTransferenciasResumidos;
	}

;
	public Long id_transaccionBusquedaTransferenciasResumidos=-1L;

	public Long getid_transaccionBusquedaTransferenciasResumidos() {
		return this.id_transaccionBusquedaTransferenciasResumidos;
	}

	public void setid_transaccionBusquedaTransferenciasResumidos(Long id_transaccionBusquedaTransferenciasResumidos) {
		this.id_transaccionBusquedaTransferenciasResumidos = id_transaccionBusquedaTransferenciasResumidos;
	}

;
	public Long id_lineaBusquedaTransferenciasResumidos=-1L;

	public Long getid_lineaBusquedaTransferenciasResumidos() {
		return this.id_lineaBusquedaTransferenciasResumidos;
	}

	public void setid_lineaBusquedaTransferenciasResumidos(Long id_lineaBusquedaTransferenciasResumidos) {
		this.id_lineaBusquedaTransferenciasResumidos = id_lineaBusquedaTransferenciasResumidos;
	}

;
	public Long id_linea_grupoBusquedaTransferenciasResumidos=-1L;

	public Long getid_linea_grupoBusquedaTransferenciasResumidos() {
		return this.id_linea_grupoBusquedaTransferenciasResumidos;
	}

	public void setid_linea_grupoBusquedaTransferenciasResumidos(Long id_linea_grupoBusquedaTransferenciasResumidos) {
		this.id_linea_grupoBusquedaTransferenciasResumidos = id_linea_grupoBusquedaTransferenciasResumidos;
	}

;
	public Long id_linea_categoriaBusquedaTransferenciasResumidos=-1L;

	public Long getid_linea_categoriaBusquedaTransferenciasResumidos() {
		return this.id_linea_categoriaBusquedaTransferenciasResumidos;
	}

	public void setid_linea_categoriaBusquedaTransferenciasResumidos(Long id_linea_categoriaBusquedaTransferenciasResumidos) {
		this.id_linea_categoriaBusquedaTransferenciasResumidos = id_linea_categoriaBusquedaTransferenciasResumidos;
	}

;
	public Long id_linea_marcaBusquedaTransferenciasResumidos=-1L;

	public Long getid_linea_marcaBusquedaTransferenciasResumidos() {
		return this.id_linea_marcaBusquedaTransferenciasResumidos;
	}

	public void setid_linea_marcaBusquedaTransferenciasResumidos(Long id_linea_marcaBusquedaTransferenciasResumidos) {
		this.id_linea_marcaBusquedaTransferenciasResumidos = id_linea_marcaBusquedaTransferenciasResumidos;
	}

;
	public Date fecha_emision_desdeBusquedaTransferenciasResumidos=new Date();

	public Date getfecha_emision_desdeBusquedaTransferenciasResumidos() {
		return this.fecha_emision_desdeBusquedaTransferenciasResumidos;
	}

	public void setfecha_emision_desdeBusquedaTransferenciasResumidos(Date fecha_emision_desdeBusquedaTransferenciasResumidos) {
		this.fecha_emision_desdeBusquedaTransferenciasResumidos = fecha_emision_desdeBusquedaTransferenciasResumidos;
	}

;
	public Date fecha_emision_hastaBusquedaTransferenciasResumidos=new Date();

	public Date getfecha_emision_hastaBusquedaTransferenciasResumidos() {
		return this.fecha_emision_hastaBusquedaTransferenciasResumidos;
	}

	public void setfecha_emision_hastaBusquedaTransferenciasResumidos(Date fecha_emision_hastaBusquedaTransferenciasResumidos) {
		this.fecha_emision_hastaBusquedaTransferenciasResumidos = fecha_emision_hastaBusquedaTransferenciasResumidos;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransferenciasResumidosLogic getTransferenciasResumidosLogic()	{		
		return transferenciasresumidosLogic;
	}

	public void setTransferenciasResumidosLogic(TransferenciasResumidosLogic transferenciasresumidosLogic) {
		this.transferenciasresumidosLogic = transferenciasresumidosLogic;
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
	
	public Boolean getIsEsNuevoTransferenciasResumidos() {
		return isEsNuevoTransferenciasResumidos;
	}

	public void setIsEsNuevoTransferenciasResumidos(Boolean isEsNuevoTransferenciasResumidos) {
		this.isEsNuevoTransferenciasResumidos = isEsNuevoTransferenciasResumidos;
	}

	public Boolean getEsParaAccionDesdeFormularioTransferenciasResumidos() {
		return esParaAccionDesdeFormularioTransferenciasResumidos;
	}
	
	public void setEsParaAccionDesdeFormularioTransferenciasResumidos(Boolean esParaAccionDesdeFormularioTransferenciasResumidos) {
		this.esParaAccionDesdeFormularioTransferenciasResumidos = esParaAccionDesdeFormularioTransferenciasResumidos;
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

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidEmpresaActual());
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

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidSucursalActual());
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

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(transferenciasresumidosSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransferenciasResumidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransferenciasResumidosGenerico)throws Exception
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
				jComboBoxid_empresaTransferenciasResumidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransferenciasResumidosGenerico!=null && jComboBoxid_empresaTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransferenciasResumidosGenerico.setSelectedIndex(0);
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

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTransferenciasResumidos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTransferenciasResumidosGenerico)throws Exception
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
				jComboBoxid_sucursalTransferenciasResumidosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTransferenciasResumidosGenerico!=null && jComboBoxid_sucursalTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaTransferenciasResumidos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaTransferenciasResumidosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaTransferenciasResumidosGenerico!=null && jComboBoxid_bodegaTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoTransferenciasResumidos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoTransferenciasResumidosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoTransferenciasResumidosGenerico!=null && jComboBoxid_productoTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_productoTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionTransferenciasResumidos.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionTransferenciasResumidosGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionTransferenciasResumidosGenerico!=null && jComboBoxid_transaccionTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_transaccionTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaTransferenciasResumidos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaTransferenciasResumidosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaTransferenciasResumidosGenerico!=null && jComboBoxid_lineaTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_lineaTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoTransferenciasResumidos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoTransferenciasResumidosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoTransferenciasResumidosGenerico!=null && jComboBoxid_linea_grupoTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaTransferenciasResumidos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaTransferenciasResumidosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaTransferenciasResumidosGenerico!=null && jComboBoxid_linea_categoriaTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.transferenciasresumidos!=null) {
						this.transferenciasresumidos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaTransferenciasResumidos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
						jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
							//jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaTransferenciasResumidosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaTransferenciasResumidosGenerico!=null && jComboBoxid_linea_marcaTransferenciasResumidosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaTransferenciasResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_empresaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransferenciasResumidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transferenciasresumidos.setid_empresa(empresaAux.getId());
				transferenciasresumidos.setempresa_descripcion(TransferenciasResumidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transferenciasresumidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_sucursalTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTransferenciasResumidosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				transferenciasresumidos.setid_sucursal(sucursalAux.getId());
				transferenciasresumidos.setsucursal_descripcion(TransferenciasResumidosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				transferenciasresumidos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_bodegaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaTransferenciasResumidosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				transferenciasresumidos.setid_bodega(bodegaAux.getId());
				transferenciasresumidos.setbodega_descripcion(TransferenciasResumidosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				transferenciasresumidos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_productoTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoTransferenciasResumidosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				transferenciasresumidos.setid_producto(productoAux.getId());
				transferenciasresumidos.setproducto_descripcion(TransferenciasResumidosConstantesFunciones.getProductoDescripcion(productoAux));
				transferenciasresumidos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_transaccionTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionTransferenciasResumidosGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				transferenciasresumidos.setid_transaccion(transaccionAux.getId());
				transferenciasresumidos.settransaccion_descripcion(TransferenciasResumidosConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				transferenciasresumidos.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_lineaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaTransferenciasResumidosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				transferenciasresumidos.setid_linea(lineaAux.getId());
				transferenciasresumidos.setlinea_descripcion(TransferenciasResumidosConstantesFunciones.getLineaDescripcion(lineaAux));
				transferenciasresumidos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_linea_grupoTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoTransferenciasResumidosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				transferenciasresumidos.setid_linea_grupo(lineaAux.getId());
				transferenciasresumidos.setlineagrupo_descripcion(TransferenciasResumidosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				transferenciasresumidos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_linea_categoriaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaTransferenciasResumidosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				transferenciasresumidos.setid_linea_categoria(lineaAux.getId());
				transferenciasresumidos.setlineacategoria_descripcion(TransferenciasResumidosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				transferenciasresumidos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(TransferenciasResumidos transferenciasresumidos,JComboBox jComboBoxid_linea_marcaTransferenciasResumidosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaTransferenciasResumidosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaTransferenciasResumidosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				transferenciasresumidos.setid_linea_marca(lineaAux.getId());
				transferenciasresumidos.setlineamarca_descripcion(TransferenciasResumidosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				transferenciasresumidos.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(bodega);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(producto);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(transaccion);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(linea);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(lineagrupo);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(lineacategoria);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { 
					}

					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaTransferenciasResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.addItem(lineamarca);
							}
						}

						if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransferenciasResumidos() throws Exception {
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
		
	public TransferenciasResumidosParameterReturnGeneral getTransferenciasResumidosParameterGeneral() {
		return this.transferenciasresumidosParameterGeneral;
	}
	
	public void setTransferenciasResumidosParameterGeneral(TransferenciasResumidosParameterReturnGeneral transferenciasresumidosParameterGeneral) {
		this.transferenciasresumidosParameterGeneral = transferenciasresumidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTransferenciasResumidos() {
		return isPermisoTodoTransferenciasResumidos;
	}

	public void setIsPermisoTodoTransferenciasResumidos(Boolean isPermisoTodoTransferenciasResumidos) {
		this.isPermisoTodoTransferenciasResumidos = isPermisoTodoTransferenciasResumidos;
	}

	public Boolean getIsPermisoNuevoTransferenciasResumidos() {
		return isPermisoNuevoTransferenciasResumidos;
	}

	public void setIsPermisoNuevoTransferenciasResumidos(Boolean isPermisoNuevoTransferenciasResumidos) {
		this.isPermisoNuevoTransferenciasResumidos = isPermisoNuevoTransferenciasResumidos;
	}

	public Boolean getIsPermisoActualizarTransferenciasResumidos() {
		return isPermisoActualizarTransferenciasResumidos;
	}

	public void setIsPermisoActualizarTransferenciasResumidos(Boolean isPermisoActualizarTransferenciasResumidos) {
		this.isPermisoActualizarTransferenciasResumidos = isPermisoActualizarTransferenciasResumidos;
	}

	public Boolean getIsPermisoEliminarTransferenciasResumidos() {
		return isPermisoEliminarTransferenciasResumidos;
	}

	public void setIsPermisoEliminarTransferenciasResumidos(Boolean isPermisoEliminarTransferenciasResumidos) {
		this.isPermisoEliminarTransferenciasResumidos = isPermisoEliminarTransferenciasResumidos;
	}

	public Boolean getIsPermisoGuardarCambiosTransferenciasResumidos() {
		return isPermisoGuardarCambiosTransferenciasResumidos;
	}

	public void setIsPermisoGuardarCambiosTransferenciasResumidos(Boolean isPermisoGuardarCambiosTransferenciasResumidos) {
		this.isPermisoGuardarCambiosTransferenciasResumidos = isPermisoGuardarCambiosTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoConsultaTransferenciasResumidos() {
		return isPermisoConsultaTransferenciasResumidos;
	}

	public void setIsPermisoConsultaTransferenciasResumidos(Boolean isPermisoConsultaTransferenciasResumidos) {
		this.isPermisoConsultaTransferenciasResumidos = isPermisoConsultaTransferenciasResumidos;
	}

	public Boolean getIsPermisoBusquedaTransferenciasResumidos() {
		return isPermisoBusquedaTransferenciasResumidos;
	}

	public void setIsPermisoBusquedaTransferenciasResumidos(Boolean isPermisoBusquedaTransferenciasResumidos) {
		this.isPermisoBusquedaTransferenciasResumidos = isPermisoBusquedaTransferenciasResumidos;
	}

	public Boolean getIsPermisoReporteTransferenciasResumidos() {
		return isPermisoReporteTransferenciasResumidos;
	}

	public void setIsPermisoReporteTransferenciasResumidos(Boolean isPermisoReporteTransferenciasResumidos) {
		this.isPermisoReporteTransferenciasResumidos = isPermisoReporteTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransferenciasResumidos() {
		return isPermisoPaginacionMedioTransferenciasResumidos;
	}

	public void setIsPermisoPaginacionMedioTransferenciasResumidos(Boolean isPermisoPaginacionMedioTransferenciasResumidos) {
		this.isPermisoPaginacionMedioTransferenciasResumidos = isPermisoPaginacionMedioTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransferenciasResumidos() {
		return isPermisoPaginacionTodoTransferenciasResumidos;
	}

	public void setIsPermisoPaginacionTodoTransferenciasResumidos(Boolean isPermisoPaginacionTodoTransferenciasResumidos) {
		this.isPermisoPaginacionTodoTransferenciasResumidos = isPermisoPaginacionTodoTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransferenciasResumidos() {
		return isPermisoPaginacionAltoTransferenciasResumidos;
	}

	public void setIsPermisoPaginacionAltoTransferenciasResumidos(Boolean isPermisoPaginacionAltoTransferenciasResumidos) {
		this.isPermisoPaginacionAltoTransferenciasResumidos = isPermisoPaginacionAltoTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoCopiarTransferenciasResumidos() {
		return isPermisoCopiarTransferenciasResumidos;
	}

	public void setIsPermisoCopiarTransferenciasResumidos(Boolean isPermisoCopiarTransferenciasResumidos) {
		this.isPermisoCopiarTransferenciasResumidos = isPermisoCopiarTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoVerFormTransferenciasResumidos() {
		return isPermisoVerFormTransferenciasResumidos;
	}

	public void setIsPermisoVerFormTransferenciasResumidos(Boolean isPermisoVerFormTransferenciasResumidos) {
		this.isPermisoVerFormTransferenciasResumidos = isPermisoVerFormTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoDuplicarTransferenciasResumidos() {
		return isPermisoDuplicarTransferenciasResumidos;
	}

	public void setIsPermisoDuplicarTransferenciasResumidos(Boolean isPermisoDuplicarTransferenciasResumidos) {
		this.isPermisoDuplicarTransferenciasResumidos = isPermisoDuplicarTransferenciasResumidos;
	}
	
	public Boolean getIsPermisoOrdenTransferenciasResumidos() {
		return isPermisoOrdenTransferenciasResumidos;
	}

	public void setIsPermisoOrdenTransferenciasResumidos(Boolean isPermisoOrdenTransferenciasResumidos) {
		this.isPermisoOrdenTransferenciasResumidos = isPermisoOrdenTransferenciasResumidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTransferenciasResumidos() {
		return isVisibilidadCeldaNuevoTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaNuevoTransferenciasResumidos(Boolean isVisibilidadCeldaNuevoTransferenciasResumidos) {
		this.isVisibilidadCeldaNuevoTransferenciasResumidos = isVisibilidadCeldaNuevoTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransferenciasResumidos() {
		return isVisibilidadCeldaDuplicarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaDuplicarTransferenciasResumidos(Boolean isVisibilidadCeldaDuplicarTransferenciasResumidos) {
		this.isVisibilidadCeldaDuplicarTransferenciasResumidos = isVisibilidadCeldaDuplicarTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransferenciasResumidos() {
		return isVisibilidadCeldaCopiarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaCopiarTransferenciasResumidos(Boolean isVisibilidadCeldaCopiarTransferenciasResumidos) {
		this.isVisibilidadCeldaCopiarTransferenciasResumidos = isVisibilidadCeldaCopiarTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransferenciasResumidos() {
		return isVisibilidadCeldaVerFormTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaVerFormTransferenciasResumidos(Boolean isVisibilidadCeldaVerFormTransferenciasResumidos) {
		this.isVisibilidadCeldaVerFormTransferenciasResumidos = isVisibilidadCeldaVerFormTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransferenciasResumidos() {
		return isVisibilidadCeldaOrdenTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaOrdenTransferenciasResumidos(Boolean isVisibilidadCeldaOrdenTransferenciasResumidos) {
		this.isVisibilidadCeldaOrdenTransferenciasResumidos = isVisibilidadCeldaOrdenTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransferenciasResumidos() {
		return isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransferenciasResumidos(Boolean isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos) {
		this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos = isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransferenciasResumidos() {
		return isVisibilidadCeldaModificarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaModificarTransferenciasResumidos(Boolean isVisibilidadCeldaModificarTransferenciasResumidos) {
		this.isVisibilidadCeldaModificarTransferenciasResumidos = isVisibilidadCeldaModificarTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransferenciasResumidos() {
		return isVisibilidadCeldaActualizarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaActualizarTransferenciasResumidos(Boolean isVisibilidadCeldaActualizarTransferenciasResumidos) {
		this.isVisibilidadCeldaActualizarTransferenciasResumidos = isVisibilidadCeldaActualizarTransferenciasResumidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransferenciasResumidos() {
		return isVisibilidadCeldaEliminarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaEliminarTransferenciasResumidos(Boolean isVisibilidadCeldaEliminarTransferenciasResumidos) {
		this.isVisibilidadCeldaEliminarTransferenciasResumidos = isVisibilidadCeldaEliminarTransferenciasResumidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransferenciasResumidos() {
		return isVisibilidadCeldaCancelarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaCancelarTransferenciasResumidos(Boolean isVisibilidadCeldaCancelarTransferenciasResumidos) {
		this.isVisibilidadCeldaCancelarTransferenciasResumidos = isVisibilidadCeldaCancelarTransferenciasResumidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransferenciasResumidos() {
		return isVisibilidadCeldaGuardarTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaGuardarTransferenciasResumidos(Boolean isVisibilidadCeldaGuardarTransferenciasResumidos) {
		this.isVisibilidadCeldaGuardarTransferenciasResumidos = isVisibilidadCeldaGuardarTransferenciasResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransferenciasResumidos() {
		return isVisibilidadCeldaGuardarCambiosTransferenciasResumidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransferenciasResumidos(Boolean isVisibilidadCeldaGuardarCambiosTransferenciasResumidos) {
		this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos = isVisibilidadCeldaGuardarCambiosTransferenciasResumidos;
	}
		
	public TransferenciasResumidosSessionBean gettransferenciasresumidosSessionBean() {
		return this.transferenciasresumidosSessionBean;
	}
	
	public void settransferenciasresumidosSessionBean(TransferenciasResumidosSessionBean transferenciasresumidosSessionBean) {
		this.transferenciasresumidosSessionBean=transferenciasresumidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaTransferenciasResumidos() {
		return this.isVisibilidadBusquedaTransferenciasResumidos;
	}

	public void setisVisibilidadBusquedaTransferenciasResumidos(Boolean isVisibilidadBusquedaTransferenciasResumidos) {
		this.isVisibilidadBusquedaTransferenciasResumidos=isVisibilidadBusquedaTransferenciasResumidos;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarSucursalForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarBodegaForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarProductoForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarTransaccionForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarLineaForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(transferenciasresumidos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(transferenciasresumidos,null);
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
	
	public void bugActualizarReferenciaActual(TransferenciasResumidos transferenciasresumidos,TransferenciasResumidos transferenciasresumidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransferenciasResumidos(transferenciasresumidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transferenciasresumidosAux.setId(transferenciasresumidos.getId());
		transferenciasresumidosAux.setVersionRow(transferenciasresumidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(TransferenciasResumidos transferenciasresumidosLocal) throws Exception {
		
		if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TransferenciasResumidos transferenciasresumidosLocal) throws Exception {	
		if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transferenciasresumidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				transferenciasresumidosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				transferenciasresumidosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				transferenciasresumidosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				transferenciasresumidosLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				transferenciasresumidosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				transferenciasresumidosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				transferenciasresumidosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				transferenciasresumidosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransferenciasResumidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transferenciasresumidosValidator.getInvalidValues(this.transferenciasresumidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TransferenciasResumidos transferenciasresumidos,List<TransferenciasResumidos> transferenciasresumidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(TransferenciasResumidos transferenciasresumidos,List<TransferenciasResumidos> transferenciasresumidoss) throws Exception {
		try	{			
			TransferenciasResumidosConstantesFunciones.actualizarSelectedLista(transferenciasresumidos,transferenciasresumidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TransferenciasResumidos> transferenciasresumidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transferenciasresumidossLocal=this.transferenciasresumidosLogic.getTransferenciasResumidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transferenciasresumidossLocal=this.transferenciasresumidoss;
			}
			//ARCHITECTURE
		
			for(TransferenciasResumidos transferenciasresumidosLocal:transferenciasresumidossLocal) {
				if(this.permiteMantenimiento(transferenciasresumidosLocal) && transferenciasresumidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TransferenciasResumidosConstantesFunciones.getTransferenciasResumidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_transaccionTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_bodegaTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_productoTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_unidadTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcantidadTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcosto_unitarioTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcosto_totalTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.NOMBREBODEGAENVIAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_bodega_enviarTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcodigo_productoTransferenciasResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransferenciasResumidosConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabeltipoTransferenciasResumidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_transaccionTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_bodegaTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_productoTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_unidadTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcantidadTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcosto_unitarioTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcosto_totalTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_bodega_enviarTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcodigo_productoTransferenciasResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabeltipoTransferenciasResumidos,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTransferenciasResumidos--;	
		
		
		this.transferenciasresumidosAux=new TransferenciasResumidos();
		
		this.transferenciasresumidosAux.setId(this.iIdNuevoTransferenciasResumidos);
		this.transferenciasresumidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transferenciasresumidosLogic.getTransferenciasResumidoss().add(this.transferenciasresumidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transferenciasresumidoss.add(this.transferenciasresumidosAux);
		}
		//ARCHITECTURE
		
		this.transferenciasresumidos=this.transferenciasresumidosAux;
		
		if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidos);
			this.setVariablesObjetoActualToFormularioForeignKeyTransferenciasResumidos(this.transferenciasresumidos);
		}
				
		//this.setDefaultControlesTransferenciasResumidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransferenciasResumidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransferenciasResumidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransferenciasResumidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransferenciasResumidos(this.transferenciasresumidosBean,this.transferenciasresumidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransferenciasResumidos(this.transferenciasresumidosReturnGeneral,this.transferenciasresumidosBean,false);
		
		if(this.transferenciasresumidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransferenciasResumidos(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos());
		}
		
		if(this.transferenciasresumidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos(),classes);//this.transferenciasresumidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransferenciasResumidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransferenciasResumidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.RecargarFormTransferenciasResumidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransferenciasResumidos(false);
						
			if(transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransferenciasResumidos();
			}
			
			this.actualizarVisualTableDatosTransferenciasResumidos();
			
			this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(this.getIndiceNuevoTransferenciasResumidos(), this.getIndiceNuevoTransferenciasResumidos());
			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
						
			this.actualizarEstadoCeldasBotonesTransferenciasResumidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransferenciasResumidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_desdeTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarfecha_emision_desdeTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_hastaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarfecha_emision_hastaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarnombre_transaccionTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarnombre_bodegaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarnombre_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarnombre_unidadTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarcantidadTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarcosto_unitarioTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarcosto_totalTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarnombre_bodega_enviarTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarcodigo_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activartipoTransferenciasResumidos);	
		//
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_empresaTransferenciasResumidos);//
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_sucursalTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_bodegaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_transaccionTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_lineaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_linea_grupoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_linea_categoriaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setEnabled(isHabilitar && this.transferenciasresumidosConstantesFunciones.activarid_linea_marcaTransferenciasResumidos);
	};
	
	public void setDefaultControlesTransferenciasResumidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransferenciasResumidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transferenciasresumidosSessionBean.setConGuardarRelaciones(true);			
			this.transferenciasresumidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.setVisible(true);
			
					
		} else {
			//this.transferenciasresumidosSessionBean.setConGuardarRelaciones(false);			
			this.transferenciasresumidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransferenciasResumidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
				if(transferenciasresumidosAux.getId().equals(this.iIdNuevoTransferenciasResumidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidoss) {
				if(transferenciasresumidosAux.getId().equals(this.iIdNuevoTransferenciasResumidos)) {
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
	
	public int getIndiceActualTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
				if(transferenciasresumidosAux.getId().equals(transferenciasresumidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidoss) {
				if(transferenciasresumidosAux.getId().equals(transferenciasresumidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTransferenciasResumidos(TransferenciasResumidos transferenciasresumidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
				if(transferenciasresumidosAux.getTransferenciasResumidosOriginal().getId().equals(transferenciasresumidosOriginal.getId())) {
					existe=true;
					transferenciasresumidosOriginal.setId(transferenciasresumidosAux.getId());
					transferenciasresumidosOriginal.setVersionRow(transferenciasresumidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidoss) {
				if(transferenciasresumidosAux.getTransferenciasResumidosOriginal().getId().equals(transferenciasresumidosOriginal.getId())) {
					existe=true;
					transferenciasresumidosOriginal.setId(transferenciasresumidosAux.getId());
					transferenciasresumidosOriginal.setVersionRow(transferenciasresumidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransferenciasResumidos(Boolean esParaCancelar) throws Exception {
		transferenciasresumidossAux=new ArrayList<TransferenciasResumidos>();
		transferenciasresumidosAux=new TransferenciasResumidos();
		
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
					if(transferenciasresumidosAux.getId()<0) {
						transferenciasresumidossAux.add(transferenciasresumidosAux);
					}		
				}
				this.iIdNuevoTransferenciasResumidos=0L;
				this.transferenciasresumidosLogic.getTransferenciasResumidoss().removeAll(transferenciasresumidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidoss) {
					if(transferenciasresumidosAux.getId()<0) {
						transferenciasresumidossAux.add(transferenciasresumidosAux);
					}		
				}
				this.iIdNuevoTransferenciasResumidos=0L;
				this.transferenciasresumidoss.removeAll(transferenciasresumidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransferenciasResumidos 
					&& this.transferenciasresumidosLogic.getTransferenciasResumidoss().size()>0
					) {
					transferenciasresumidosAux=this.transferenciasresumidosLogic.getTransferenciasResumidoss().get(this.transferenciasresumidosLogic.getTransferenciasResumidoss().size() - 1);
				
					if(transferenciasresumidosAux.getId()<0) {
						this.transferenciasresumidosLogic.getTransferenciasResumidoss().remove(transferenciasresumidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransferenciasResumidos && this.transferenciasresumidoss.size()>0) {
					transferenciasresumidosAux=this.transferenciasresumidoss.get(this.transferenciasresumidoss.size() - 1);
				
					if(transferenciasresumidosAux.getId()<0) {
						this.transferenciasresumidoss.remove(transferenciasresumidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransferenciasResumidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transferenciasresumidos.getId()<0) {
				this.transferenciasresumidosLogic.getTransferenciasResumidoss().remove(this.transferenciasresumidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transferenciasresumidos.getId()<0) {
				this.transferenciasresumidoss.remove(this.transferenciasresumidos);
			}
		}			
	}
	
	public void setEstadosInicialesTransferenciasResumidos(List<TransferenciasResumidos> transferenciasresumidossAux) throws Exception {
		TransferenciasResumidosConstantesFunciones.setEstadosInicialesTransferenciasResumidos(transferenciasresumidossAux);
	}
	
	public void setEstadosInicialesTransferenciasResumidos(TransferenciasResumidos transferenciasresumidosAux) throws Exception {
		TransferenciasResumidosConstantesFunciones.setEstadosInicialesTransferenciasResumidos(transferenciasresumidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransferenciasResumidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransferenciasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransferenciasResumidosActual()) {
				if(!this.isEsNuevoTransferenciasResumidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransferenciasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransferenciasResumidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransferenciasResumidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transferencias Resumidos ?", "MANTENIMIENTO DE Transferencias Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransferenciasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TransferenciasResumidos transferenciasresumidos) throws Exception {
		TransferenciasResumidosConstantesFunciones.seleccionarAsignar(this.transferenciasresumidos,transferenciasresumidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransferenciasResumidos=this.isPermisoActualizarOriginalTransferenciasResumidos;
			
			
			this.seleccionarAsignar(transferenciasresumidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesTransferenciasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transferenciasresumidosSessionBean.setsFuncionBusquedaRapida(this.transferenciasresumidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransferenciasResumidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransferenciasResumidos(esParaCancelar);				
				this.cancelarNuevoTransferenciasResumidos(esParaCancelar);								
			}
			
			this.transferenciasresumidos=new TransferenciasResumidos();
			
			this.inicializarTransferenciasResumidos();
			
			this.actualizarEstadoCeldasBotonesTransferenciasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransferenciasResumidos() throws Exception {
		try {
			TransferenciasResumidosConstantesFunciones.inicializarTransferenciasResumidos(this.transferenciasresumidos);
			
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
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transferenciasresumidosLogic.getTransferenciasResumidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransferenciasResumidoss(String sAccionBusqueda,List<TransferenciasResumidos> transferenciasresumidossParaReportes) throws Exception {
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
					sPathReporteFinal="TransferenciasResumidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransferenciasResumidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransferenciasResumidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TransferenciasResumidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Transferencias Resumidoses");		
		parameters.put("busquedapor", TransferenciasResumidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransferenciasResumidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransferenciasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransferenciasResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransferenciasResumidos=new JRBeanArrayDataSource(TransferenciasResumidosJInternalFrame.TraerTransferenciasResumidosBeans(transferenciasresumidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransferenciasResumidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransferenciasResumidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransferenciasResumidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransferenciasResumidosBean.TraerTransferenciasResumidosBeans(transferenciasresumidossParaReportes).toArray()));
							
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
				this.generarExcelReporteTransferenciasResumidoss(sAccionBusqueda,sTipoArchivoReporte,transferenciasresumidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransferenciasResumidoss(sAccionBusqueda,sTipoArchivoReporte,transferenciasresumidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidosActionPerformed(null);
					//this.generarExcelReporteTransferenciasResumidoss(sAccionBusqueda,sTipoArchivoReporte,transferenciasresumidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransferenciasResumidoss(sAccionBusqueda,sTipoArchivoReporte,transferenciasresumidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransferenciasResumidoss(sAccionBusqueda,sTipoArchivoReporte,transferenciasresumidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransferenciasResumidoss(sAccionBusqueda,sTipoArchivoReporte,transferenciasresumidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransferenciasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TransferenciasResumidos> transferenciasresumidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransferenciasResumidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransferenciasResumidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TransferenciasResumidos transferenciasresumidos : transferenciasresumidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransferenciasResumidosConstantesFunciones.generarExcelReporteDataTransferenciasResumidos("NORMAL",row,workbook,transferenciasresumidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransferenciasResumidos(String sTipo,Row row,Workbook workbook) {
		
		TransferenciasResumidosConstantesFunciones.generarExcelReporteHeaderTransferenciasResumidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransferenciasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TransferenciasResumidos> transferenciasresumidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransferenciasResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TransferenciasResumidos transferenciasresumidos : transferenciasresumidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransferenciasResumidosConstantesFunciones.getTransferenciasResumidosDescripcion(transferenciasresumidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getnombre_bodega_enviar());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransferenciasResumidosConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transferenciasresumidos.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransferenciasResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<TransferenciasResumidos> transferenciasresumidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TransferenciasResumidos> transferenciasresumidossRespaldo=null;
		
		classes=TransferenciasResumidosConstantesFunciones.getClassesRelationshipsOfTransferenciasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transferenciasresumidosLogic.setDatosCliente(this.datosCliente);
		this.transferenciasresumidosLogic.setDatosDeep(this.datosDeep);
		this.transferenciasresumidosLogic.setIsConDeep(true);
		
		transferenciasresumidossRespaldo=this.transferenciasresumidosLogic.getTransferenciasResumidoss();
		
		this.transferenciasresumidosLogic.setTransferenciasResumidoss(transferenciasresumidossParaReportes);	
		this.transferenciasresumidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transferenciasresumidossParaReportes=this.transferenciasresumidosLogic.getTransferenciasResumidoss();
		this.transferenciasresumidosLogic.setTransferenciasResumidoss(transferenciasresumidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TransferenciasResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransferenciasResumidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TransferenciasResumidos transferenciasresumidos : transferenciasresumidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransferenciasResumidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransferenciasResumidosConstantesFunciones.generarExcelReporteDataTransferenciasResumidos("NORMAL",row,workbook,transferenciasresumidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransferenciasResumidosConstantesFunciones.getTransferenciasResumidosDescripcion(transferenciasresumidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransferenciasResumidos() throws Exception {		
		this.startProcessTransferenciasResumidos(true);
	}
	
	public void startProcessTransferenciasResumidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransferenciasResumidos ,this.jPanelParametrosReportesTransferenciasResumidos, this.jScrollPanelDatosTransferenciasResumidos,this.jPanelPaginacionTransferenciasResumidos, this.jScrollPanelDatosEdicionTransferenciasResumidos, this.jPanelAccionesTransferenciasResumidos,this.jPanelAccionesFormularioTransferenciasResumidos,this.jmenuBarTransferenciasResumidos,this.jmenuBarDetalleTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,this.jTtoolBarDetalleTransferenciasResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasTransferenciasResumidos=this.jTabbedPaneBusquedasTransferenciasResumidos; 
		
		final JPanel jPanelParametrosReportesTransferenciasResumidos=this.jPanelParametrosReportesTransferenciasResumidos;
		//final JScrollPane jScrollPanelDatosTransferenciasResumidos=this.jScrollPanelDatosTransferenciasResumidos;
		final JTable jTableDatosTransferenciasResumidos=this.jTableDatosTransferenciasResumidos;		
		final JPanel jPanelPaginacionTransferenciasResumidos=this.jPanelPaginacionTransferenciasResumidos;
		//final JScrollPane jScrollPanelDatosEdicionTransferenciasResumidos=this.jScrollPanelDatosEdicionTransferenciasResumidos;
		final JPanel jPanelAccionesTransferenciasResumidos=this.jPanelAccionesTransferenciasResumidos;
		
		JPanel jPanelCamposAuxiliarTransferenciasResumidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransferenciasResumidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			jPanelCamposAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelCamposTransferenciasResumidos;
			jPanelAccionesFormularioAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelAccionesFormularioTransferenciasResumidos;
		}
		
		final JPanel jPanelCamposTransferenciasResumidos=jPanelCamposAuxiliarTransferenciasResumidos;
		final JPanel jPanelAccionesFormularioTransferenciasResumidos=jPanelAccionesFormularioAuxiliarTransferenciasResumidos;
		
		
		final JMenuBar jmenuBarTransferenciasResumidos=this.jmenuBarTransferenciasResumidos;
		final JToolBar jTtoolBarTransferenciasResumidos=this.jTtoolBarTransferenciasResumidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransferenciasResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransferenciasResumidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			jmenuBarDetalleAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jmenuBarDetalleTransferenciasResumidos;
			jTtoolBarDetalleAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jTtoolBarDetalleTransferenciasResumidos;
		}
		
		final JMenuBar jmenuBarDetalleTransferenciasResumidos=jmenuBarDetalleAuxiliarTransferenciasResumidos;
		final JToolBar jTtoolBarDetalleTransferenciasResumidos=jTtoolBarDetalleAuxiliarTransferenciasResumidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransferenciasResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransferenciasResumidos;
			processRunnable.jTableDatos=jTableDatosTransferenciasResumidos;
			processRunnable.jPanelCampos=jPanelCamposTransferenciasResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransferenciasResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesTransferenciasResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransferenciasResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarTransferenciasResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransferenciasResumidos;
			processRunnable.jTtoolBar=jTtoolBarTransferenciasResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransferenciasResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransferenciasResumidos ,jPanelParametrosReportesTransferenciasResumidos,jTableDatosTransferenciasResumidos, /*jScrollPanelDatosTransferenciasResumidos,*/jPanelCamposTransferenciasResumidos,jPanelPaginacionTransferenciasResumidos, /*jScrollPanelDatosEdicionTransferenciasResumidos,*/ jPanelAccionesTransferenciasResumidos,jPanelAccionesFormularioTransferenciasResumidos,jmenuBarTransferenciasResumidos,jmenuBarDetalleTransferenciasResumidos,jTtoolBarTransferenciasResumidos,jTtoolBarDetalleTransferenciasResumidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransferenciasResumidos ,jPanelParametrosReportesTransferenciasResumidos, jScrollPanelDatosTransferenciasResumidos,jPanelPaginacionTransferenciasResumidos, jScrollPanelDatosEdicionTransferenciasResumidos, jPanelAccionesTransferenciasResumidos,jPanelAccionesFormularioTransferenciasResumidos,jmenuBarTransferenciasResumidos,jmenuBarDetalleTransferenciasResumidos,jTtoolBarTransferenciasResumidos,jTtoolBarDetalleTransferenciasResumidos);
						
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
	
	public void finishProcessTransferenciasResumidos() {// throws Exception 
		this.finishProcessTransferenciasResumidos(true);
	}
	
	public void finishProcessTransferenciasResumidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransferenciasResumidos ,this.jPanelParametrosReportesTransferenciasResumidos, this.jScrollPanelDatosTransferenciasResumidos,this.jPanelPaginacionTransferenciasResumidos, this.jScrollPanelDatosEdicionTransferenciasResumidos, this.jPanelAccionesTransferenciasResumidos,this.jPanelAccionesFormularioTransferenciasResumidos,this.jmenuBarTransferenciasResumidos,this.jmenuBarDetalleTransferenciasResumidos,this.jTtoolBarTransferenciasResumidos,this.jTtoolBarDetalleTransferenciasResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasTransferenciasResumidos=this.jTabbedPaneBusquedasTransferenciasResumidos; 
		
		final JPanel jPanelParametrosReportesTransferenciasResumidos=this.jPanelParametrosReportesTransferenciasResumidos;
		//final JScrollPane jScrollPanelDatosTransferenciasResumidos=this.jScrollPanelDatosTransferenciasResumidos;
		final JTable jTableDatosTransferenciasResumidos=this.jTableDatosTransferenciasResumidos;		
		final JPanel jPanelPaginacionTransferenciasResumidos=this.jPanelPaginacionTransferenciasResumidos;
		//final JScrollPane jScrollPanelDatosEdicionTransferenciasResumidos=this.jScrollPanelDatosEdicionTransferenciasResumidos;
		final JPanel jPanelAccionesTransferenciasResumidos=this.jPanelAccionesTransferenciasResumidos;
		
		JPanel jPanelCamposAuxiliarTransferenciasResumidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransferenciasResumidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			jPanelCamposAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelCamposTransferenciasResumidos;
			jPanelAccionesFormularioAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelAccionesFormularioTransferenciasResumidos;
		}
		
		final JPanel jPanelCamposTransferenciasResumidos=jPanelCamposAuxiliarTransferenciasResumidos;
		final JPanel jPanelAccionesFormularioTransferenciasResumidos=jPanelAccionesFormularioAuxiliarTransferenciasResumidos;
		
		
		final JMenuBar jmenuBarTransferenciasResumidos=this.jmenuBarTransferenciasResumidos;		
		final JToolBar jTtoolBarTransferenciasResumidos=this.jTtoolBarTransferenciasResumidos;
				
		JMenuBar jmenuBarDetalleAuxiliarTransferenciasResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransferenciasResumidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			jmenuBarDetalleAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jmenuBarDetalleTransferenciasResumidos;
			jTtoolBarDetalleAuxiliarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jTtoolBarDetalleTransferenciasResumidos;		
		}
		
		final JMenuBar jmenuBarDetalleTransferenciasResumidos=jmenuBarDetalleAuxiliarTransferenciasResumidos;
		final JToolBar jTtoolBarDetalleTransferenciasResumidos=jTtoolBarDetalleAuxiliarTransferenciasResumidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransferenciasResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransferenciasResumidos;
			processRunnable.jTableDatos=jTableDatosTransferenciasResumidos;
			processRunnable.jPanelCampos=jPanelCamposTransferenciasResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransferenciasResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesTransferenciasResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransferenciasResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarTransferenciasResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransferenciasResumidos;
			processRunnable.jTtoolBar=jTtoolBarTransferenciasResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransferenciasResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransferenciasResumidos ,jPanelParametrosReportesTransferenciasResumidos, jTableDatosTransferenciasResumidos,/*jScrollPanelDatosTransferenciasResumidos,*/jPanelCamposTransferenciasResumidos,jPanelPaginacionTransferenciasResumidos, /*jScrollPanelDatosEdicionTransferenciasResumidos,*/ jPanelAccionesTransferenciasResumidos,jPanelAccionesFormularioTransferenciasResumidos,jmenuBarTransferenciasResumidos,jmenuBarDetalleTransferenciasResumidos,jTtoolBarTransferenciasResumidos,jTtoolBarDetalleTransferenciasResumidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransferenciasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransferenciasResumidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransferenciasResumidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransferenciasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransferenciasResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransferenciasResumidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransferenciasResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransferenciasResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransferenciasResumidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transferenciasresumidosConstantesFunciones.getsFinalQueryTransferenciasResumidos();
		String  finalQueryPaginacionTodos=this.transferenciasresumidosConstantesFunciones.getsFinalQueryTransferenciasResumidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TransferenciasResumidosConstantesFunciones.getArrayColumnasGlobalesNoTransferenciasResumidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransferenciasResumidosConstantesFunciones.getArrayColumnasGlobalesTransferenciasResumidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransferenciasResumidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transferenciasresumidossEliminados= new ArrayList<TransferenciasResumidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransferenciasResumidos();
		
				///*TransferenciasResumidosSessionBean*/this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			
			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
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
					this.iNumeroPaginacion=TransferenciasResumidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransferenciasResumidosConstantesFunciones.getClassesForeignKeysOfTransferenciasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transferenciasresumidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transferenciasresumidossAux= new ArrayList<TransferenciasResumidos>();
			
				
			transferenciasresumidosLogic.setDatosCliente(this.datosCliente);
			transferenciasresumidosLogic.setDatosDeep(this.datosDeep);
			transferenciasresumidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaTransferenciasResumidos")) {
				this.sDetalleReporte=TransferenciasResumidosConstantesFunciones.getDetalleIndiceBusquedaTransferenciasResumidos(id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transferenciasresumidosLogic.getTransferenciasResumidossBusquedaTransferenciasResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransferenciasResumidosConstantesFunciones.getDetalleIndiceBusquedaTransferenciasResumidos(id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransferenciasResumidosConstantesFunciones.getDetalleIndiceBusquedaTransferenciasResumidos(id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transferenciasresumidosLogic.getTransferenciasResumidoss()==null||transferenciasresumidosLogic.getTransferenciasResumidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transferenciasresumidoss==null|| transferenciasresumidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasresumidossAux=new ArrayList<TransferenciasResumidos>();
						transferenciasresumidossAux.addAll(transferenciasresumidosLogic.getTransferenciasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transferenciasresumidossAux=new ArrayList<TransferenciasResumidos>();
							transferenciasresumidossAux.addAll(transferenciasresumidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transferenciasresumidosLogic.getTransferenciasResumidossBusquedaTransferenciasResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransferenciasResumidosConstantesFunciones.getDetalleIndiceBusquedaTransferenciasResumidos(id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransferenciasResumidosConstantesFunciones.getDetalleIndiceBusquedaTransferenciasResumidos(id_bodegaBusquedaTransferenciasResumidos,id_productoBusquedaTransferenciasResumidos,id_transaccionBusquedaTransferenciasResumidos,id_lineaBusquedaTransferenciasResumidos,id_linea_grupoBusquedaTransferenciasResumidos,id_linea_categoriaBusquedaTransferenciasResumidos,id_linea_marcaBusquedaTransferenciasResumidos,fecha_emision_desdeBusquedaTransferenciasResumidos,fecha_emision_hastaBusquedaTransferenciasResumidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransferenciasResumidoss("BusquedaTransferenciasResumidos",transferenciasresumidosLogic.getTransferenciasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransferenciasResumidoss("BusquedaTransferenciasResumidos",transferenciasresumidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasresumidosLogic.setTransferenciasResumidoss(new ArrayList<TransferenciasResumidos>());
						transferenciasresumidosLogic.getTransferenciasResumidoss().addAll(transferenciasresumidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transferenciasresumidoss=new ArrayList<TransferenciasResumidos>();
							transferenciasresumidoss.addAll(transferenciasresumidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransferenciasResumidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransferenciasResumidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transferenciasresumidosLogic.getTransferenciasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferenciasresumidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transferenciasresumidosLogic.getTransferenciasResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transferenciasresumidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TransferenciasResumidos transferenciasresumidos) {
		Boolean permite=true;
		
		if(this.transferenciasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransferenciasResumidosConstantesFunciones.getOrderByListaTransferenciasResumidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransferenciasResumidosConstantesFunciones.getOrderByListaTransferenciasResumidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidosLogic.getTransferenciasResumidoss()) {
				if(transferenciasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasresumidosTotales=transferenciasresumidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransferenciasResumidos transferenciasresumidos:this.transferenciasresumidoss) {
				if(transferenciasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasresumidosTotales=transferenciasresumidos;
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
			this.transferenciasresumidosAux=new TransferenciasResumidos();
			this.transferenciasresumidosAux.setsType(Constantes2.S_TOTALES);
			this.transferenciasresumidosAux.setIsNew(false);
			this.transferenciasresumidosAux.setIsChanged(false);
			this.transferenciasresumidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//TransferenciasResumidosConstantesFunciones.TotalizarValoresFilaTransferenciasResumidos(this.transferenciasresumidosLogic.getTransferenciasResumidoss(),this.transferenciasresumidosAux);
				
				//this.transferenciasresumidosLogic.getTransferenciasResumidoss().add(this.transferenciasresumidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransferenciasResumidosConstantesFunciones.TotalizarValoresFilaTransferenciasResumidos(this.transferenciasresumidoss,this.transferenciasresumidosAux);
				
				this.transferenciasresumidoss.add(this.transferenciasresumidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transferenciasresumidosTotales=new TransferenciasResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transferenciasresumidosLogic.getTransferenciasResumidoss().remove(transferenciasresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transferenciasresumidoss.remove(transferenciasresumidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transferenciasresumidosTotales=new TransferenciasResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidosLogic.getTransferenciasResumidoss()) {
				if(transferenciasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasresumidosTotales=transferenciasresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransferenciasResumidosConstantesFunciones.TotalizarValoresFilaTransferenciasResumidos(this.transferenciasresumidosLogic.getTransferenciasResumidoss(),transferenciasresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TransferenciasResumidos transferenciasresumidos:this.transferenciasresumidoss) {
				if(transferenciasresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					transferenciasresumidosTotales=transferenciasresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransferenciasResumidosConstantesFunciones.TotalizarValoresFilaTransferenciasResumidos(this.transferenciasresumidoss,transferenciasresumidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransferenciasResumidossBusquedaTransferenciasResumidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaTransferenciasResumidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransferenciasResumidossFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransferenciasResumidossBusquedaTransferenciasResumidos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_transaccion,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossBusquedaTransferenciasResumidos(sFinalQuery,this.pagination,id_bodega,id_producto,id_transaccion,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransferenciasResumidossFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transferenciasresumidosLogic.getTransferenciasResumidossFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTransferenciasResumidos() {
		this.isPermisoTodoTransferenciasResumidos=false;
		this.isPermisoNuevoTransferenciasResumidos=false;
		this.isPermisoActualizarTransferenciasResumidos=false;
		this.isPermisoActualizarOriginalTransferenciasResumidos=false;
		this.isPermisoEliminarTransferenciasResumidos=false;
		this.isPermisoGuardarCambiosTransferenciasResumidos=false;
		this.isPermisoConsultaTransferenciasResumidos=true;
		this.isPermisoBusquedaTransferenciasResumidos=true;
		this.isPermisoReporteTransferenciasResumidos=true;
		this.isPermisoOrdenTransferenciasResumidos=false;		
		this.isPermisoPaginacionMedioTransferenciasResumidos=false;		
		this.isPermisoPaginacionAltoTransferenciasResumidos=false;		
		this.isPermisoPaginacionTodoTransferenciasResumidos=false;		
		this.isPermisoCopiarTransferenciasResumidos=false;		
		this.isPermisoVerFormTransferenciasResumidos=false;		
		this.isPermisoDuplicarTransferenciasResumidos=false;
		this.isPermisoOrdenTransferenciasResumidos=false;
	}
	
	public void setPermisosUsuarioTransferenciasResumidos(Boolean isPermiso) {
		this.isPermisoTodoTransferenciasResumidos=isPermiso;
		this.isPermisoNuevoTransferenciasResumidos=isPermiso;
		this.isPermisoActualizarTransferenciasResumidos=isPermiso;
		this.isPermisoActualizarOriginalTransferenciasResumidos=isPermiso;
		this.isPermisoEliminarTransferenciasResumidos=isPermiso;
		this.isPermisoGuardarCambiosTransferenciasResumidos=isPermiso;
		this.isPermisoConsultaTransferenciasResumidos=isPermiso;
		this.isPermisoBusquedaTransferenciasResumidos=isPermiso;
		this.isPermisoReporteTransferenciasResumidos=isPermiso;
		this.isPermisoOrdenTransferenciasResumidos=isPermiso;		
		this.isPermisoPaginacionMedioTransferenciasResumidos=isPermiso;		
		this.isPermisoPaginacionAltoTransferenciasResumidos=isPermiso;		
		this.isPermisoPaginacionTodoTransferenciasResumidos=isPermiso;		
		this.isPermisoCopiarTransferenciasResumidos=isPermiso;		
		this.isPermisoVerFormTransferenciasResumidos=isPermiso;		
		this.isPermisoDuplicarTransferenciasResumidos=isPermiso;
		this.isPermisoOrdenTransferenciasResumidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransferenciasResumidos(Boolean isPermiso) {
		//this.isPermisoTodoTransferenciasResumidos=isPermiso;
		this.isPermisoNuevoTransferenciasResumidos=isPermiso;
		this.isPermisoActualizarTransferenciasResumidos=isPermiso;
		this.isPermisoActualizarOriginalTransferenciasResumidos=isPermiso;
		this.isPermisoEliminarTransferenciasResumidos=isPermiso;
		this.isPermisoGuardarCambiosTransferenciasResumidos=isPermiso;
		//this.isPermisoConsultaTransferenciasResumidos=isPermiso;
		//this.isPermisoBusquedaTransferenciasResumidos=isPermiso;
		//this.isPermisoReporteTransferenciasResumidos=isPermiso;
		//this.isPermisoOrdenTransferenciasResumidos=isPermiso;		
		//this.isPermisoPaginacionMedioTransferenciasResumidos=isPermiso;		
		//this.isPermisoPaginacionAltoTransferenciasResumidos=isPermiso;		
		//this.isPermisoPaginacionTodoTransferenciasResumidos=isPermiso;		
		//this.isPermisoCopiarTransferenciasResumidos=isPermiso;		
		//this.isPermisoDuplicarTransferenciasResumidos=isPermiso;
		//this.isPermisoOrdenTransferenciasResumidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransferenciasResumidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransferenciasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransferenciasResumidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransferenciasResumidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransferenciasResumidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransferenciasResumidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransferenciasResumidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransferenciasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransferenciasResumidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransferenciasResumidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransferenciasResumidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransferenciasResumidos=this.isPermisoActualizarTransferenciasResumidos;
			this.isPermisoEliminarTransferenciasResumidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransferenciasResumidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransferenciasResumidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransferenciasResumidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransferenciasResumidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransferenciasResumidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransferenciasResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransferenciasResumidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransferenciasResumidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransferenciasResumidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransferenciasResumidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransferenciasResumidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransferenciasResumidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransferenciasResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransferenciasResumidos.setToolTipText(this.jTableDatosTransferenciasResumidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransferenciasResumidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransferenciasResumidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransferenciasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TransferenciasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTransferenciasResumidos() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyTransferenciasResumidosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransferenciasResumidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransferenciasResumidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyTransferenciasResumidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transferenciasresumidosSessionBean==null) {
				this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean();
			}

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.transferenciasresumidosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTransferenciasResumidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransferenciasResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransferenciasResumidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransferenciasResumidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransferenciasResumidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransferenciasResumidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransferenciasResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransferenciasResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransferenciasResumidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransferenciasResumidos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransferenciasResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransferenciasResumidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public TransferenciasResumidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransferenciasResumidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransferenciasResumidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transferenciasresumidosSessionBean=new TransferenciasResumidosSessionBean(); 
		this.transferenciasresumidosConstantesFunciones=new TransferenciasResumidosConstantesFunciones(); 
		this.transferenciasresumidosBean=new TransferenciasResumidos();//(this.transferenciasresumidosConstantesFunciones); 		
		this.transferenciasresumidosReturnGeneral=new TransferenciasResumidosParameterReturnGeneral(); 
		
		this.transferenciasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransferenciasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransferenciasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransferenciasResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransferenciasResumidos(true);
			
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
			
			this.transferenciasresumidosConstantesFunciones=new TransferenciasResumidosConstantesFunciones(); 
			this.transferenciasresumidosBean=new TransferenciasResumidos();//this.transferenciasresumidosConstantesFunciones); 			
			this.transferenciasresumidosReturnGeneral=new TransferenciasResumidosParameterReturnGeneral(); 
		
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencias Resumidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.transferenciasresumidos=new TransferenciasResumidos();
			this.transferenciasresumidoss = new ArrayList<TransferenciasResumidos>();
			this.transferenciasresumidossAux = new ArrayList<TransferenciasResumidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic=new TransferenciasResumidosLogic();
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.transferenciasresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transferenciasresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransferenciasResumidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransferenciasResumidos);	
					}
					
					if(this.jInternalFrameImportacionTransferenciasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransferenciasResumidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransferenciasResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransferenciasResumidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransferenciasResumidos);
				this.jInternalFrameDetalleFormTransferenciasResumidos.setVisible(false);
				this.jInternalFrameDetalleFormTransferenciasResumidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransferenciasResumidos);
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.setVisible(false);
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransferenciasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransferenciasResumidos);
					this.jInternalFrameImportacionTransferenciasResumidos.setVisible(false);
					this.jInternalFrameImportacionTransferenciasResumidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransferenciasResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransferenciasResumidos);
					this.jInternalFrameOrderByTransferenciasResumidos.setVisible(false);
					this.jInternalFrameOrderByTransferenciasResumidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransferenciasResumidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransferenciasResumidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.transferenciasresumidosReturnGeneral=new TransferenciasResumidosParameterReturnGeneral();
			
			this.transferenciasresumidosParameterGeneral=new TransferenciasResumidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transferenciasresumidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TransferenciasResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransferenciasResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),this.transferenciasresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransferenciasResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),this.transferenciasresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaDuplicarTransferenciasResumidos=true;
			this.isVisibilidadCeldaCopiarTransferenciasResumidos=true;
			this.isVisibilidadCeldaVerFormTransferenciasResumidos=true;
			this.isVisibilidadCeldaOrdenTransferenciasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
			this.isVisibilidadCeldaModificarTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
			
			
			this.isVisibilidadBusquedaTransferenciasResumidos=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransferenciasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransferenciasResumidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransferenciasResumidos(false);
			
			this.setPermisosUsuarioTransferenciasResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() 
				|| (this.transferenciasresumidosSessionBean.getEsGuardarRelacionado() && this.transferenciasresumidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransferenciasResumidosClasesRelacionadas();
			}
			
			if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransferenciasResumidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransferenciasResumidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransferenciasResumidos();
			}
			
			if(!this.isPermisoBusquedaTransferenciasResumidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransferenciasResumidosConstantesFunciones.getTiposSeleccionarTransferenciasResumidos());
				
				this.tiposColumnasSelect=TransferenciasResumidosConstantesFunciones.getTiposSeleccionarTransferenciasResumidos(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransferenciasResumidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioTransferenciasResumidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioTransferenciasResumidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransferenciasResumidos() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transferenciasresumidosImplementable= (TransferenciasResumidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransferenciasResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transferenciasresumidosImplementableHome= (TransferenciasResumidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransferenciasResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transferenciasresumidoss= new ArrayList<TransferenciasResumidos>();
			this.transferenciasresumidossEliminados= new ArrayList<TransferenciasResumidos>();
						
			this.isEsNuevoTransferenciasResumidos=false;
			this.esParaAccionDesdeFormularioTransferenciasResumidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransferenciasResumidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransferenciasResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransferenciasResumidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransferenciasResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransferenciasResumidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransferenciasResumidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransferenciasResumidos();
			}
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransferenciasResumidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransferenciasResumidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransferenciasResumidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransferenciasResumidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TransferenciasResumidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransferenciasResumidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransferenciasResumidos")) {
				iIndex=this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransferenciasResumidos();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyTransferenciasResumidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransferenciasResumidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransferenciasResumidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransferenciasResumidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransferenciasResumidos();
		
		this.cargarCombosFrameForeignKeyTransferenciasResumidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransferenciasResumidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransferenciasResumidos();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTransferenciasResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			
			if(jTableDatosTransferenciasResumidos.getRowCount()>=1) {
				jTableDatosTransferenciasResumidos.removeRowSelectionInterval(0, jTableDatosTransferenciasResumidos.getRowCount()-1);						
			}
			
			this.isEsNuevoTransferenciasResumidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransferenciasResumidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransferenciasResumidos(true);			
			//this.transferenciasresumidos=new TransferenciasResumidos();
			//this.transferenciasresumidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransferenciasResumidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos() ;
			
			if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransferenciasResumidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transferenciasresumidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);				
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TransferenciasResumidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransferenciasResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransferenciasResumidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransferenciasResumidos.getSelectedRows().length;			
			}
			
			transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransferenciasResumidos--;			
				//TransferenciasResumidos transferenciasresumidosAux= new TransferenciasResumidos();			
				//transferenciasresumidosAux.setId(this.iIdNuevoTransferenciasResumidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TransferenciasResumidos transferenciasresumidosOrigen=new TransferenciasResumidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TransferenciasResumidos transferenciasresumidosOrigen : transferenciasresumidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transferenciasresumidosOrigen =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transferenciasresumidosOrigen =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransferenciasResumidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transferenciasresumidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransferenciasResumidos(transferenciasresumidosOrigen,this.transferenciasresumidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transferenciasresumidosLogic.getTransferenciasResumidoss().add(this.transferenciasresumidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidoss.add(this.transferenciasresumidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
				
				this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(this.getIndiceNuevoTransferenciasResumidos(), this.getIndiceNuevoTransferenciasResumidos());
				
				int iLastRow =  this.jTableDatosTransferenciasResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransferenciasResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransferenciasResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();									
		
			TransferenciasResumidos transferenciasresumidosOrigen=new TransferenciasResumidos();
			TransferenciasResumidos transferenciasresumidosDestino=new TransferenciasResumidos();
				
			transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransferenciasResumidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transferenciasresumidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransferenciasResumidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasresumidosOrigen =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transferenciasresumidosOrigen =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transferenciasresumidosDestino =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transferenciasresumidosDestino =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transferenciasresumidosOrigen =transferenciasresumidossSeleccionados.get(0);
				transferenciasresumidosDestino =transferenciasresumidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransferenciasResumidos(transferenciasresumidosOrigen,transferenciasresumidosDestino,true,false);
				
				transferenciasresumidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transferenciasresumidosDestino,transferenciasresumidosLogic.getTransferenciasResumidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transferenciasresumidosDestino,transferenciasresumidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
				
				//this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(this.getIndiceNuevoTransferenciasResumidos(), this.getIndiceNuevoTransferenciasResumidos());
				
				int iLastRow =  this.jTableDatosTransferenciasResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransferenciasResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransferenciasResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransferenciasResumidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransferenciasResumidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransferenciasResumidos.setVisible(!isVisible);
			this.jPanelPaginacionTransferenciasResumidos.setVisible(!isVisible);
			this.jPanelAccionesTransferenciasResumidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransferenciasResumidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransferenciasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransferenciasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransferenciasResumidos();
			
			this.abrirFrameOrderByTransferenciasResumidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransferenciasResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransferenciasResumidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransferenciasResumidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransferenciasResumidos.isMaximum()) {
					this.jInternalFrameDetalleFormTransferenciasResumidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransferenciasResumidos.setSize(this.jInternalFrameDetalleFormTransferenciasResumidos.iWidthFormulario,this.jInternalFrameDetalleFormTransferenciasResumidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransferenciasResumidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransferenciasResumidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransferenciasResumidos.isMaximum()) {
						this.jInternalFrameDetalleFormTransferenciasResumidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransferenciasResumidos.jContentPaneDetalleTransferenciasResumidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransferenciasResumidos.jContentPaneDetalleTransferenciasResumidos.getWidth(),TransferenciasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransferenciasResumidos.jContentPaneDetalleTransferenciasResumidos.getWidth(),TransferenciasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransferenciasResumidos.jContentPaneDetalleTransferenciasResumidos.getWidth(),TransferenciasResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransferenciasResumidos.setVisible(true);
	        this.jInternalFrameDetalleFormTransferenciasResumidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransferenciasResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransferenciasResumidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransferenciasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferenciasResumidos,false,this);
				} else {
					this.jInternalFrameOrderByTransferenciasResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransferenciasResumidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransferenciasResumidos);
				this.jInternalFrameOrderByTransferenciasResumidos.setVisible(false);
				this.jInternalFrameOrderByTransferenciasResumidos.setSelected(false);
				
				this.jInternalFrameOrderByTransferenciasResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransferenciasResumidos"));
				
				this.inicializarActualizarBindingTablaOrderByTransferenciasResumidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransferenciasResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransferenciasResumidos==null) {
				
				this.jInternalFrameImportacionTransferenciasResumidos=new ImportacionJInternalFrame(TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransferenciasResumidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransferenciasResumidos);
				this.jInternalFrameImportacionTransferenciasResumidos.setVisible(false);
				this.jInternalFrameImportacionTransferenciasResumidos.setSelected(false);


				this.jInternalFrameImportacionTransferenciasResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransferenciasResumidos"));
				this.jInternalFrameImportacionTransferenciasResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransferenciasResumidos"));
				this.jInternalFrameImportacionTransferenciasResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransferenciasResumidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransferenciasResumidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransferenciasResumidos==null) {
				this.jInternalFrameReporteDinamicoTransferenciasResumidos=new ReporteDinamicoJInternalFrame(TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransferenciasResumidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransferenciasResumidos);
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.setVisible(false);
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransferenciasResumidos"));
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransferenciasResumidos"));
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransferenciasResumidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransferenciasResumidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTransferenciasResumidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransferenciasResumidos);
			
	       	this.jInternalFrameDetalleFormTransferenciasResumidos.setVisible(false);
	        this.jInternalFrameDetalleFormTransferenciasResumidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransferenciasResumidos.dispose();
			//this.jInternalFrameDetalleFormTransferenciasResumidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransferenciasResumidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransferenciasResumidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransferenciasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransferenciasResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransferenciasResumidos.setVisible(true);
	        this.jInternalFrameImportacionTransferenciasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransferenciasResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransferenciasResumidos.setVisible(true);
	        this.jInternalFrameOrderByTransferenciasResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransferenciasResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransferenciasResumidos.setVisible(false);
	        this.jInternalFrameOrderByTransferenciasResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransferenciasResumidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransferenciasResumidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransferenciasResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransferenciasResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransferenciasResumidos.setVisible(false);
	        this.jInternalFrameImportacionTransferenciasResumidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransferenciasResumidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransferenciasResumidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransferenciasResumidos(true);
			//this.isEsNuevoTransferenciasResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransferenciasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransferenciasResumidos(false) ;
			
			if(transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransferenciasResumidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransferenciasResumidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransferenciasResumidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransferenciasResumidos(true);
			//this.isEsNuevoTransferenciasResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transferenciasresumidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransferenciasResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransferenciasResumidos(false) ;
			
			if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransferenciasResumidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransferenciasResumidos(false);
			
			//if(!this.isEsNuevoTransferenciasResumidos) {								
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				
			}
			
			if(this.permiteMantenimiento(this.transferenciasresumidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransferenciasResumidos=true;
					this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
					this.isEsNuevoTransferenciasResumidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransferenciasResumidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransferenciasResumidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransferenciasResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(false);
				
				this.habilitarDeshabilitarControlesTransferenciasResumidos(false);
			
												
				
				if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransferenciasResumidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransferenciasResumidosActionPerformed(evt,transferenciasresumidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransferenciasResumidos(this.transferenciasresumidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transferenciasresumidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transferenciasresumidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				this.transferenciasresumidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				this.transferenciasresumidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transferenciasresumidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransferenciasResumidosModel) this.jTableDatosTransferenciasResumidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransferenciasResumidos=true;
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
				this.isEsNuevoTransferenciasResumidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransferenciasResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(false);
				
				this.habilitarDeshabilitarControlesTransferenciasResumidos(false);
				
				
				
				if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransferenciasResumidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransferenciasResumidos.getRowCount()>=1) {
				jTableDatosTransferenciasResumidos.removeRowSelectionInterval(0, jTableDatosTransferenciasResumidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransferenciasResumidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransferenciasResumidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(false) ;
			
			this.isEsNuevoTransferenciasResumidos=false;
			
			if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransferenciasResumidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransferenciasResumidos(false);
				
				//SI ES MANUAL
				if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransferenciasResumidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransferenciasResumidos--;			
			//TransferenciasResumidos transferenciasresumidosAux= new TransferenciasResumidos();			
			//transferenciasresumidosAux.setId(this.iIdNuevoTransferenciasResumidos);
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransferenciasResumidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
			
			this.transferenciasresumidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transferenciasresumidosLogic.getTransferenciasResumidoss().add(this.transferenciasresumidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transferenciasresumidoss.add(this.transferenciasresumidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			
			this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(this.getIndiceNuevoTransferenciasResumidos(), this.getIndiceNuevoTransferenciasResumidos());
			
			int iLastRow =  this.jTableDatosTransferenciasResumidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransferenciasResumidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransferenciasResumidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferenciasResumidos(false);
			
			//SI ES MANUAL
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransferenciasResumidos();
			}
			
			//this.abrirFrameTreeTransferenciasResumidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransferenciasResumidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransferenciasResumidos.setFileImportacion(this.jInternalFrameImportacionTransferenciasResumidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransferenciasResumidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransferenciasResumidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransferenciasResumidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransferenciasResumidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		

		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransferenciasResumidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransferenciasResumidosBaseDesign.jrxml";
			
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
			
			this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodegaEnviar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodegaEnviar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodegaEnviar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodegaEnviar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					sNombreCampoCategoria="nombre_bodega_enviar";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					sNombreCampoCategoriaValor="nombre_bodega_enviar";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega Enviar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega_enviar");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
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
	
	public void jButtonGenerarExcelReporteDinamicoTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TransferenciasResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getnombre_bodega_enviar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransferenciasResumidosConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(TransferenciasResumidos transferenciasresumidos:transferenciasresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transferenciasresumidos.gettipo());
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
			//	this.getFilaCabeceraExportarExcelTransferenciasResumidos(row);				
			//	iRow++;
			//}				
			
			//for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransferenciasResumidos(transferenciasresumidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferenciasResumidos(false);
			
			//SI ES MANUAL
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransferenciasResumidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferenciasResumidos(false);
			
			//SI ES MANUAL
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransferenciasResumidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransferenciasResumidos(false);
			
			//SI ES MANUAL
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransferenciasResumidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransferenciasResumidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransferenciasResumidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransferenciasResumidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransferenciasResumidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransferenciasResumidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransferenciasResumidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransferenciasResumidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransferenciasResumidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransferenciasResumidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransferenciasResumidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransferenciasResumidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransferenciasResumidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransferenciasResumidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransferenciasResumidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransferenciasResumidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransferenciasResumidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransferenciasResumidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransferenciasResumidos();
		
		this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransferenciasResumidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransferenciasResumidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransferenciasResumidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransferenciasResumidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransferenciasResumidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransferenciasResumidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransferenciasResumidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransferenciasResumidos.jCheckBoxPostAccionNuevoTransferenciasResumidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransferenciasResumidos.jCheckBoxPostAccionSinCerrarTransferenciasResumidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransferenciasResumidos.jCheckBoxPostAccionSinMensajeTransferenciasResumidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransferenciasResumidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransferenciasResumidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransferenciasResumidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jCheckBoxPostAccionNuevoTransferenciasResumidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransferenciasResumidos.jCheckBoxPostAccionSinCerrarTransferenciasResumidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransferenciasResumidos.jCheckBoxPostAccionSinMensajeTransferenciasResumidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransferenciasResumidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransferenciasResumidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransferenciasResumidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransferenciasResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransferenciasResumidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransferenciasResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransferenciasResumidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransferenciasResumidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransferenciasResumidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransferenciasResumidos(Boolean esInicializar) throws Exception {
		try	{	
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransferenciasResumidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransferenciasResumidos() throws Exception {
		try	{
			if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransferenciasResumidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransferenciasResumidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransferenciasResumidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransferenciasResumidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransferenciasResumidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransferenciasResumidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransferenciasResumidos.addItem(reporte);
			}
			
			
			if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransferenciasResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransferenciasResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransferenciasResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransferenciasResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransferenciasResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransferenciasResumidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransferenciasResumidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransferenciasResumidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransferenciasResumidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TransferenciasResumidosConstantesFunciones.getTiposSeleccionarTransferenciasResumidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TransferenciasResumidosConstantesFunciones.getTiposSeleccionarTransferenciasResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TransferenciasResumidosConstantesFunciones.getTiposSeleccionarTransferenciasResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransferenciasResumidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_bodegaBusquedaTransferenciasResumidos=((Bodega)this.jComboBoxid_bodegaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_productoBusquedaTransferenciasResumidos=((Producto)this.jComboBoxid_productoBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_transaccionBusquedaTransferenciasResumidos=((Transaccion)this.jComboBoxid_transaccionBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_lineaBusquedaTransferenciasResumidos=((Linea)this.jComboBoxid_lineaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_linea_grupoBusquedaTransferenciasResumidos=((Linea)this.jComboBoxid_linea_grupoBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaTransferenciasResumidos=((Linea)this.jComboBoxid_linea_categoriaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()!=null){this.id_linea_marcaBusquedaTransferenciasResumidos=((Linea)this.jComboBoxid_linea_marcaBusquedaTransferenciasResumidosTransferenciasResumidos.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaTransferenciasResumidos=new Date(this.jDateChooserfecha_emision_desdeBusquedaTransferenciasResumidosTransferenciasResumidos.getDate().getTime());
		this.fecha_emision_hastaBusquedaTransferenciasResumidos=new Date(this.jDateChooserfecha_emision_hastaBusquedaTransferenciasResumidosTransferenciasResumidos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransferenciasResumidos(Boolean esInicializar) throws Exception {				
		if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransferenciasResumidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransferenciasResumidos() throws Exception {
		this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransferenciasResumidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransferenciasResumidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransferenciasResumidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transferenciasresumidosLogic.getTransferenciasResumidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transferenciasresumidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransferenciasResumidos.setModel(new TransferenciasResumidosModel(this.transferenciasresumidosLogic.getTransferenciasResumidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransferenciasResumidos.setModel(new TransferenciasResumidosModel(this.transferenciasresumidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransferenciasResumidos!=null && this.jInternalFrameOrderByTransferenciasResumidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransferenciasResumidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO,transferenciasresumidosConstantesFunciones.resaltarSeleccionarTransferenciasResumidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransferenciasResumidosConstantesFunciones.SCLASSWEBTITULO,transferenciasresumidosConstantesFunciones.resaltarSeleccionarTransferenciasResumidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_ID));

		if(this.transferenciasresumidosConstantesFunciones.mostraridTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasresumidosConstantesFunciones.resaltaridTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activaridTransferenciasResumidos,iSizeTabla,this,true,"idTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltaridTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activaridTransferenciasResumidos,this,true,"idTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.transferenciasresumidosConstantesFunciones.mostrarnombre_transaccionTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_transaccionTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_transaccionTransferenciasResumidos,iSizeTabla,this,true,"nombre_transaccionTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_transaccionTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_transaccionTransferenciasResumidos,this,true,"nombre_transaccionTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.transferenciasresumidosConstantesFunciones.mostrarnombre_bodegaTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodegaTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_bodegaTransferenciasResumidos,iSizeTabla,this,true,"nombre_bodegaTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodegaTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_bodegaTransferenciasResumidos,this,true,"nombre_bodegaTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.transferenciasresumidosConstantesFunciones.mostrarnombre_productoTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_productoTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_productoTransferenciasResumidos,iSizeTabla,this,true,"nombre_productoTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_productoTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_productoTransferenciasResumidos,this,true,"nombre_productoTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.transferenciasresumidosConstantesFunciones.mostrarnombre_unidadTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_unidadTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_unidadTransferenciasResumidos,iSizeTabla,this,true,"nombre_unidadTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_unidadTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_unidadTransferenciasResumidos,this,true,"nombre_unidadTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD));

		if(this.transferenciasresumidosConstantesFunciones.mostrarcantidadTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcantidadTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcantidadTransferenciasResumidos,iSizeTabla,this,true,"cantidadTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcantidadTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcantidadTransferenciasResumidos,this,true,"cantidadTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.transferenciasresumidosConstantesFunciones.mostrarcosto_unitarioTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcosto_unitarioTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcosto_unitarioTransferenciasResumidos,iSizeTabla,this,true,"costo_unitarioTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcosto_unitarioTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcosto_unitarioTransferenciasResumidos,this,true,"costo_unitarioTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.transferenciasresumidosConstantesFunciones.mostrarcosto_totalTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcosto_totalTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcosto_totalTransferenciasResumidos,iSizeTabla,this,true,"costo_totalTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcosto_totalTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcosto_totalTransferenciasResumidos,this,true,"costo_totalTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR));

		if(this.transferenciasresumidosConstantesFunciones.mostrarnombre_bodega_enviarTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodega_enviarTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_bodega_enviarTransferenciasResumidos,iSizeTabla,this,true,"nombre_bodega_enviarTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodega_enviarTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarnombre_bodega_enviarTransferenciasResumidos,this,true,"nombre_bodega_enviarTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.transferenciasresumidosConstantesFunciones.mostrarcodigo_productoTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcodigo_productoTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcodigo_productoTransferenciasResumidos,iSizeTabla,this,true,"codigo_productoTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltarcodigo_productoTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activarcodigo_productoTransferenciasResumidos,this,true,"codigo_productoTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,TransferenciasResumidosConstantesFunciones.LABEL_TIPO));

		if(this.transferenciasresumidosConstantesFunciones.mostrartipoTransferenciasResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransferenciasResumidosConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transferenciasresumidosConstantesFunciones.resaltartipoTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activartipoTransferenciasResumidos,iSizeTabla,this,true,"tipoTransferenciasResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transferenciasresumidosConstantesFunciones.resaltartipoTransferenciasResumidos,this.transferenciasresumidosConstantesFunciones.activartipoTransferenciasResumidos,this,true,"tipoTransferenciasResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransferenciasResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransferenciasResumidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransferenciasResumidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransferenciasResumidos.addColumn(tableColumn);
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
			
			this.jTableDatosTransferenciasResumidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransferenciasResumidos.moveColumn(this.jTableDatosTransferenciasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransferenciasResumidos.moveColumn(this.jTableDatosTransferenciasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransferenciasResumidos.moveColumn(this.jTableDatosTransferenciasResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransferenciasResumidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransferenciasResumidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransferenciasResumidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransferenciasResumidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransferenciasResumidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransferenciasResumidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransferenciasResumidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=transferenciasresumidosLogic.getTransferenciasResumidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transferenciasresumidoss.size()-1;
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
		//this.jTableDatosTransferenciasResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransferenciasResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransferenciasResumidos();
			
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
				
				//this.isEsNuevoTransferenciasResumidos=false;
					
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
				if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransferenciasResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transferenciasresumidos.getsType().equals("DUPLICADO")
				   || this.transferenciasresumidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransferenciasResumidos=true;
				
				} else {
					this.isEsNuevoTransferenciasResumidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
					if(this.transferenciasresumidos.getId()>=0 && !this.transferenciasresumidos.getIsNew()) {						
						this.isEsNuevoTransferenciasResumidos=false;
						
					} else {
						this.isEsNuevoTransferenciasResumidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransferenciasResumidos(esRelaciones);						
				
				this.seleccionarTransferenciasResumidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transferenciasresumidos.getId()<0) {
					this.isEsNuevoTransferenciasResumidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransferenciasResumidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransferenciasResumidos(evt,rowIndex);
				}	
				
				if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TransferenciasResumidos: " + this.dDif); 
					}
				}								
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransferenciasResumidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transferenciasresumidos)) {
					if(this.transferenciasresumidos.getId()>0) {
						this.transferenciasresumidos.setIsDeleted(true);
						
						this.transferenciasresumidossEliminados.add(this.transferenciasresumidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transferenciasresumidosLogic.getTransferenciasResumidoss().remove(this.transferenciasresumidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidoss.remove(this.transferenciasresumidos);				
					}
					
					
					((TransferenciasResumidosModel) this.jTableDatosTransferenciasResumidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransferenciasResumidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransferenciasResumidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransferenciasResumidos) {
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransferenciasResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransferenciasResumidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransferenciasResumidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransferenciasResumidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransferenciasResumidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransferenciasResumidos(transferenciasresumidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransferenciasResumidos(transferenciasresumidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransferenciasResumidos(transferenciasresumidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransferenciasResumidos(transferenciasresumidos);
	}
	
	public void setVariablesObjetoActualToFormularioTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setText(transferenciasresumidos.getId().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setText(transferenciasresumidos.getnombre_transaccion());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setText(transferenciasresumidos.getnombre_bodega());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setText(transferenciasresumidos.getnombre_producto());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setText(transferenciasresumidos.getnombre_unidad());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setText(transferenciasresumidos.getcantidad().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setText(transferenciasresumidos.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setText(transferenciasresumidos.getcosto_total().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setText(transferenciasresumidos.getnombre_bodega_enviar());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setText(transferenciasresumidos.getcodigo_producto());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setText(transferenciasresumidos.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TransferenciasResumidos transferenciasresumidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transferenciasresumidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TransferenciasResumidos transferenciasresumidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transferenciasresumidosLocal=this.transferenciasresumidos;
			} else {
				transferenciasresumidosLocal=this.transferenciasresumidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transferenciasresumidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransferenciasResumidos(transferenciasresumidosLocal,true);
					
					if(transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transferenciasresumidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transferenciasresumidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransferenciasResumidos(transferenciasresumidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(transferenciasresumidos);
	}
	
	public void setVariablesFormularioToObjetoActualTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransferenciasResumidos(transferenciasresumidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.getText()==null || this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.getText()=="" || this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.getText()=="Id") {
				this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setText("0");
			}

			if(conColumnasBase) {transferenciasresumidos.setId(Long.parseLong(this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelIdTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setnombre_transaccion(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_transaccionTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setnombre_bodega(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_bodegaTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setnombre_producto(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_productoTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setnombre_unidad(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_unidadTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcantidadTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcosto_unitarioTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcosto_totalTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setnombre_bodega_enviar(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelnombre_bodega_enviarTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.setcodigo_producto(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelcodigo_productoTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transferenciasresumidos.settipo(this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransferenciasResumidosConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransferenciasResumidos.jLabeltipoTransferenciasResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransferenciasResumidos(TransferenciasResumidos transferenciasresumidosBean,TransferenciasResumidos transferenciasresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransferenciasResumidos(TransferenciasResumidos transferenciasresumidosOrigen,TransferenciasResumidos transferenciasresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transferenciasresumidosOrigen.getId()!=null && !transferenciasresumidosOrigen.getId().equals(0L))) {transferenciasresumidos.setId(transferenciasresumidosOrigen.getId());}}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getfecha_emision_desde()!=null && !transferenciasresumidosOrigen.getfecha_emision_desde().equals(new Date()))) {transferenciasresumidos.setfecha_emision_desde(transferenciasresumidosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getfecha_emision_hasta()!=null && !transferenciasresumidosOrigen.getfecha_emision_hasta().equals(new Date()))) {transferenciasresumidos.setfecha_emision_hasta(transferenciasresumidosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getnombre_transaccion()!=null && !transferenciasresumidosOrigen.getnombre_transaccion().equals(""))) {transferenciasresumidos.setnombre_transaccion(transferenciasresumidosOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getnombre_bodega()!=null && !transferenciasresumidosOrigen.getnombre_bodega().equals(""))) {transferenciasresumidos.setnombre_bodega(transferenciasresumidosOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getnombre_producto()!=null && !transferenciasresumidosOrigen.getnombre_producto().equals(""))) {transferenciasresumidos.setnombre_producto(transferenciasresumidosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getnombre_unidad()!=null && !transferenciasresumidosOrigen.getnombre_unidad().equals(""))) {transferenciasresumidos.setnombre_unidad(transferenciasresumidosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getcantidad()!=null && !transferenciasresumidosOrigen.getcantidad().equals(0))) {transferenciasresumidos.setcantidad(transferenciasresumidosOrigen.getcantidad());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getcosto_unitario()!=null && !transferenciasresumidosOrigen.getcosto_unitario().equals(0.0))) {transferenciasresumidos.setcosto_unitario(transferenciasresumidosOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getcosto_total()!=null && !transferenciasresumidosOrigen.getcosto_total().equals(0.0))) {transferenciasresumidos.setcosto_total(transferenciasresumidosOrigen.getcosto_total());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getnombre_bodega_enviar()!=null && !transferenciasresumidosOrigen.getnombre_bodega_enviar().equals(""))) {transferenciasresumidos.setnombre_bodega_enviar(transferenciasresumidosOrigen.getnombre_bodega_enviar());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.getcodigo_producto()!=null && !transferenciasresumidosOrigen.getcodigo_producto().equals(""))) {transferenciasresumidos.setcodigo_producto(transferenciasresumidosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && transferenciasresumidosOrigen.gettipo()!=null && !transferenciasresumidosOrigen.gettipo().equals(""))) {transferenciasresumidos.settipo(transferenciasresumidosOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setText(transferenciasresumidos.getId().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setText(transferenciasresumidos.getnombre_transaccion());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setText(transferenciasresumidos.getnombre_bodega());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setText(transferenciasresumidos.getnombre_producto());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setText(transferenciasresumidos.getnombre_unidad());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setText(transferenciasresumidos.getcantidad().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setText(transferenciasresumidos.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setText(transferenciasresumidos.getcosto_total().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setText(transferenciasresumidos.getnombre_bodega_enviar());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setText(transferenciasresumidos.getcodigo_producto());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setText(transferenciasresumidos.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransferenciasResumidos(TransferenciasResumidosBean transferenciasresumidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setText(transferenciasresumidosBean.getId().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setText(transferenciasresumidosBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setText(transferenciasresumidosBean.getnombre_bodega());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setText(transferenciasresumidosBean.getnombre_producto());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setText(transferenciasresumidosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setText(transferenciasresumidosBean.getcantidad().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setText(transferenciasresumidosBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setText(transferenciasresumidosBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setText(transferenciasresumidosBean.getnombre_bodega_enviar());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setText(transferenciasresumidosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setText(transferenciasresumidosBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransferenciasResumidos(TransferenciasResumidosParameterReturnGeneral transferenciasresumidosReturnGeneral,TransferenciasResumidosBean transferenciasresumidosBean,Boolean conDefault) throws Exception { 
		try {
			TransferenciasResumidos transferenciasresumidosLocal=new TransferenciasResumidos();
			
			transferenciasresumidosLocal=transferenciasresumidosReturnGeneral.getTransferenciasResumidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transferenciasresumidosLocal.getId()!=null && !transferenciasresumidosLocal.getId().equals(0L))) {transferenciasresumidosBean.setId(transferenciasresumidosLocal.getId());}}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getnombre_transaccion()!=null && !transferenciasresumidosLocal.getnombre_transaccion().equals(""))) {transferenciasresumidosBean.setnombre_transaccion(transferenciasresumidosLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getnombre_bodega()!=null && !transferenciasresumidosLocal.getnombre_bodega().equals(""))) {transferenciasresumidosBean.setnombre_bodega(transferenciasresumidosLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getnombre_producto()!=null && !transferenciasresumidosLocal.getnombre_producto().equals(""))) {transferenciasresumidosBean.setnombre_producto(transferenciasresumidosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getnombre_unidad()!=null && !transferenciasresumidosLocal.getnombre_unidad().equals(""))) {transferenciasresumidosBean.setnombre_unidad(transferenciasresumidosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getcantidad()!=null && !transferenciasresumidosLocal.getcantidad().equals(0))) {transferenciasresumidosBean.setcantidad(transferenciasresumidosLocal.getcantidad());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getcosto_unitario()!=null && !transferenciasresumidosLocal.getcosto_unitario().equals(0.0))) {transferenciasresumidosBean.setcosto_unitario(transferenciasresumidosLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getcosto_total()!=null && !transferenciasresumidosLocal.getcosto_total().equals(0.0))) {transferenciasresumidosBean.setcosto_total(transferenciasresumidosLocal.getcosto_total());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getnombre_bodega_enviar()!=null && !transferenciasresumidosLocal.getnombre_bodega_enviar().equals(""))) {transferenciasresumidosBean.setnombre_bodega_enviar(transferenciasresumidosLocal.getnombre_bodega_enviar());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.getcodigo_producto()!=null && !transferenciasresumidosLocal.getcodigo_producto().equals(""))) {transferenciasresumidosBean.setcodigo_producto(transferenciasresumidosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && transferenciasresumidosLocal.gettipo()!=null && !transferenciasresumidosLocal.gettipo().equals(""))) {transferenciasresumidosBean.settipo(transferenciasresumidosLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransferenciasResumidosGenerico(Long idTransferenciasResumidosSeleccionado,JComboBox jComboBoxTransferenciasResumidos,List<TransferenciasResumidos> transferenciasresumidossLocal)throws Exception {
		try {
			TransferenciasResumidos  transferenciasresumidosTemp=null;

			for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossLocal) {
				if(transferenciasresumidosAux.getId()!=null && transferenciasresumidosAux.getId().equals(idTransferenciasResumidosSeleccionado)) {
					transferenciasresumidosTemp=transferenciasresumidosAux;
					break;
				}
			}

			jComboBoxTransferenciasResumidos.setSelectedItem(transferenciasresumidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransferenciasResumidosGenerico(JComboBox jComboBoxTransferenciasResumidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransferenciasResumidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransferenciasResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransferenciasResumidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransferenciasResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransferenciasResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransferenciasResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transferenciasresumidos=(TransferenciasResumidos) transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transferenciasresumidos =(TransferenciasResumidos) transferenciasresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!transferenciasresumidos.getIsNew() && !transferenciasresumidos.getIsChanged() && !transferenciasresumidos.getIsDeleted()) {
				sDescripcion=transferenciasresumidos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=transferenciasresumidos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TransferenciasResumidos transferenciasresumidosRow=new TransferenciasResumidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transferenciasresumidosRow=(TransferenciasResumidos) transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transferenciasresumidosRow=(TransferenciasResumidos) transferenciasresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransferenciasResumidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos));			
			this.jButtonDuplicarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaDuplicarTransferenciasResumidos && this.isPermisoDuplicarTransferenciasResumidos));			
			this.jButtonCopiarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaCopiarTransferenciasResumidos && this.isPermisoCopiarTransferenciasResumidos));
			this.jButtonVerFormTransferenciasResumidos.setVisible((this.isVisibilidadCeldaVerFormTransferenciasResumidos && this.isPermisoVerFormTransferenciasResumidos));
			
			this.jButtonAbrirOrderByTransferenciasResumidos.setVisible((this.isVisibilidadCeldaOrdenTransferenciasResumidos && this.isPermisoOrdenTransferenciasResumidos));			
			
			this.jButtonNuevoRelacionesTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos));			
			this.jButtonNuevoGuardarCambiosTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaModificarTransferenciasResumidos && this.isPermisoActualizarTransferenciasResumidos));	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaActualizarTransferenciasResumidos && this.isPermisoActualizarTransferenciasResumidos));	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaEliminarTransferenciasResumidos && this.isPermisoEliminarTransferenciasResumidos));
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarTransferenciasResumidos.setVisible(this.isVisibilidadCeldaCancelarTransferenciasResumidos);							
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos));						
			this.jButtonDuplicarToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaDuplicarTransferenciasResumidos && this.isPermisoDuplicarTransferenciasResumidos));						
			this.jButtonCopiarToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaCopiarTransferenciasResumidos && this.isPermisoCopiarTransferenciasResumidos));			
			this.jButtonVerFormToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaVerFormTransferenciasResumidos && this.isPermisoVerFormTransferenciasResumidos));			
			this.jButtonAbrirOrderByToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaOrdenTransferenciasResumidos && this.isPermisoOrdenTransferenciasResumidos));
			this.jButtonNuevoRelacionesToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos));			
			this.jButtonNuevoGuardarCambiosToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));			
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaModificarTransferenciasResumidos && this.isPermisoActualizarTransferenciasResumidos));	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaActualizarTransferenciasResumidos  && this.isPermisoActualizarTransferenciasResumidos));	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaEliminarTransferenciasResumidos && this.isPermisoEliminarTransferenciasResumidos));
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarToolBarTransferenciasResumidos.setVisible(this.isVisibilidadCeldaCancelarTransferenciasResumidos);				
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos));			
			this.jMenuItemDuplicarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaDuplicarTransferenciasResumidos && this.isPermisoDuplicarTransferenciasResumidos));			
			this.jMenuItemCopiarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaCopiarTransferenciasResumidos && this.isPermisoCopiarTransferenciasResumidos));			
			this.jMenuItemVerFormTransferenciasResumidos.setVisible((this.isVisibilidadCeldaVerFormTransferenciasResumidos && this.isPermisoVerFormTransferenciasResumidos));			
			this.jMenuItemAbrirOrderByTransferenciasResumidos.setVisible((this.isVisibilidadCeldaOrdenTransferenciasResumidos && this.isPermisoOrdenTransferenciasResumidos));			
			//this.jMenuItemMostrarOcultarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaOrdenTransferenciasResumidos && this.isPermisoOrdenTransferenciasResumidos));
			this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos.setVisible((this.isVisibilidadCeldaOrdenTransferenciasResumidos && this.isPermisoOrdenTransferenciasResumidos));			
			//this.jMenuItemDetalleMostrarOcultarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaOrdenTransferenciasResumidos && this.isPermisoOrdenTransferenciasResumidos));			
			this.jMenuItemNuevoRelacionesTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos));			
			this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos.setVisible((this.isVisibilidadCeldaNuevoTransferenciasResumidos && this.isPermisoNuevoTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));									
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemModificarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaModificarTransferenciasResumidos && this.isPermisoActualizarTransferenciasResumidos));	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemActualizarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaActualizarTransferenciasResumidos && this.isPermisoActualizarTransferenciasResumidos));	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemEliminarTransferenciasResumidos.setVisible((this.isVisibilidadCeldaEliminarTransferenciasResumidos && this.isPermisoEliminarTransferenciasResumidos));
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemCancelarTransferenciasResumidos.setVisible(this.isVisibilidadCeldaCancelarTransferenciasResumidos);				
			}
			
			this.jMenuItemGuardarCambiosTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));						
			this.jMenuItemGuardarCambiosTablaTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=this.jButtonNuevoTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaDuplicarTransferenciasResumidos=this.jButtonDuplicarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaCopiarTransferenciasResumidos=this.jButtonCopiarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaVerFormTransferenciasResumidos=this.jButtonVerFormTransferenciasResumidos.isVisible();
			
			this.isVisibilidadCeldaOrdenTransferenciasResumidos=this.jButtonAbrirOrderByTransferenciasResumidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=this.jButtonNuevoRelacionesTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaModificarTransferenciasResumidos=this.jButtonModificarTransferenciasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=this.jButtonGuardarCambiosTablaTransferenciasResumidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=this.jButtonNuevoToolBarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=this.jButtonNuevoRelacionesToolBarTransferenciasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.isVisibilidadCeldaModificarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarToolBarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarToolBarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarToolBarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarToolBarTransferenciasResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransferenciasResumidos=this.jButtonGuardarCambiosToolBarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=this.jButtonGuardarCambiosTablaToolBarTransferenciasResumidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=this.jMenuItemNuevoTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=this.jMenuItemNuevoRelacionesTransferenciasResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.isVisibilidadCeldaModificarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemModificarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemActualizarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemEliminarTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemCancelarTransferenciasResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransferenciasResumidos=this.jMenuItemGuardarCambiosTransferenciasResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=this.jMenuItemGuardarCambiosTablaTransferenciasResumidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransferenciasResumidos(Boolean esInicializar) {
		if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
				//if(this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransferenciasResumidos();
			}
			
			this.inicializarActualizarBindingBotonesManualTransferenciasResumidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransferenciasResumidos() {
		this.jButtonNuevoTransferenciasResumidos.setVisible(this.isPermisoNuevoTransferenciasResumidos);			
		this.jButtonDuplicarTransferenciasResumidos.setVisible(this.isPermisoDuplicarTransferenciasResumidos);			
		this.jButtonCopiarTransferenciasResumidos.setVisible(this.isPermisoCopiarTransferenciasResumidos);			
		this.jButtonVerFormTransferenciasResumidos.setVisible(this.isPermisoVerFormTransferenciasResumidos);			
		
		this.jButtonAbrirOrderByTransferenciasResumidos.setVisible(this.isPermisoOrdenTransferenciasResumidos);					
		
		this.jButtonNuevoRelacionesTransferenciasResumidos.setVisible(this.isPermisoNuevoTransferenciasResumidos);			
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarTransferenciasResumidos.setVisible(this.isPermisoActualizarTransferenciasResumidos);	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarTransferenciasResumidos.setVisible(this.isPermisoActualizarTransferenciasResumidos);	
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarTransferenciasResumidos.setVisible(this.isPermisoEliminarTransferenciasResumidos);
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarTransferenciasResumidos.setVisible(this.isVisibilidadCeldaCancelarTransferenciasResumidos);						
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.setVisible(this.isPermisoGuardarCambiosTransferenciasResumidos);							
		}
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.setVisible(this.isPermisoActualizarTransferenciasResumidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransferenciasResumidos() {
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarTransferenciasResumidos.setVisible(this.isPermisoActualizarTransferenciasResumidos);	
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarTransferenciasResumidos.setVisible(this.isPermisoActualizarTransferenciasResumidos);	
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarTransferenciasResumidos.setVisible(this.isPermisoEliminarTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarTransferenciasResumidos.setVisible(this.isVisibilidadCeldaCancelarTransferenciasResumidos);							
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.setVisible((this.isVisibilidadCeldaGuardarTransferenciasResumidos && this.isPermisoGuardarCambiosTransferenciasResumidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransferenciasResumidos() {
		if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransferenciasResumidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransferenciasResumidos() {
	}
	
	public void jTableDatosTransferenciasResumidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransferenciasResumidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transferenciasresumidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transferenciasresumidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.transferenciasresumidos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.transferenciasresumidos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.transferenciasresumidos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.transferenciasresumidos.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.transferenciasresumidos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.transferenciasresumidos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.transferenciasresumidos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaTransferenciasResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebTransferenciasResumidos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransferenciasResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransferenciasResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.transferenciasresumidosLogic.getConnexion());

				if(this.transferenciasresumidos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.transferenciasresumidos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransferenciasResumidos=(TitledBorder)this.jScrollPanelDatosTransferenciasResumidos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderTransferenciasResumidos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.transferenciasresumidos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.transferenciasresumidos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.transferenciasresumidos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.transferenciasresumidos.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.transferenciasresumidos.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.transferenciasresumidos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.transferenciasresumidos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.transferenciasresumidos.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.transferenciasresumidos.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.transferenciasresumidos.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodega_enviarTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getnombre_bodega_enviar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega_enviar like '%"+this.transferenciasresumidos.getnombre_bodega_enviar()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.transferenciasresumidos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoTransferenciasResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.gettransferenciasresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transferenciasresumidos==null) {
						this.transferenciasresumidos = new TransferenciasResumidos();
					}

					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);
				}

				if(this.transferenciasresumidos.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.transferenciasresumidos.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransferenciasResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaTransferenciasResumidosTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossBusquedaTransferenciasResumidos();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdBodega();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdEmpresa();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdLinea();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdLineaCategoria();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdLineaGrupo();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdLineaMarca();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdProducto();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdSucursal();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionTransferenciasResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);

			this.getTransferenciasResumidossFK_IdTransaccion();

			this.inicializarActualizarBindingTransferenciasResumidos(false);

			//if(TransferenciasResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transferenciasresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransferenciasResumidos() {
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransferenciasResumidos.dispose();
			this.jInternalFrameDetalleFormTransferenciasResumidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
			this.jInternalFrameReporteDinamicoTransferenciasResumidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransferenciasResumidos.dispose();
			this.jInternalFrameReporteDinamicoTransferenciasResumidos=null;
		}
		
		if(this.jInternalFrameImportacionTransferenciasResumidos!=null) {
			this.jInternalFrameImportacionTransferenciasResumidos.setVisible(false);	    			
			this.jInternalFrameImportacionTransferenciasResumidos.dispose();
			this.jInternalFrameImportacionTransferenciasResumidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransferenciasResumidos();
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransferenciasResumidos")) {
				jButtonDuplicarTransferenciasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransferenciasResumidos")) {
				jButtonCopiarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransferenciasResumidos")) {
				jButtonVerFormTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransferenciasResumidos")) {
				jButtonDuplicarTransferenciasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransferenciasResumidos")) {
				jButtonDuplicarTransferenciasResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransferenciasResumidos")) {
				jButtonModificarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransferenciasResumidos")) {
				jButtonModificarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransferenciasResumidos")) {
				jButtonModificarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransferenciasResumidos")) {
				jButtonActualizarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransferenciasResumidos")) {
				jButtonActualizarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransferenciasResumidos")) {
				jButtonActualizarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransferenciasResumidos")) {
				jButtonEliminarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransferenciasResumidos")) {
				jButtonEliminarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransferenciasResumidos")) {
				jButtonEliminarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransferenciasResumidos")) {
				jButtonCancelarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransferenciasResumidos")) {
				jButtonCancelarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransferenciasResumidos")) {
				jButtonCancelarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransferenciasResumidos")) {
				jButtonCerrarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransferenciasResumidos")) {
				jButtonCerrarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransferenciasResumidos")) {
				jButtonCerrarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransferenciasResumidos")) {
				jButtonMostrarOcultarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransferenciasResumidos")) {
				jButtonCancelarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransferenciasResumidos")) {
				jButtonCopiarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransferenciasResumidos")) {
				jButtonVerFormTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransferenciasResumidos")) {
				jButtonCopiarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransferenciasResumidos")) {
				jButtonVerFormTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransferenciasResumidos")) {
				jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransferenciasResumidos")) {
				jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransferenciasResumidos")) {
				jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransferenciasResumidos")) {
				jButtonAnterioresTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransferenciasResumidos")) {
				jButtonAnterioresTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransferenciasResumidos")) {
				jButtonAnterioresTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransferenciasResumidos")) {
				jButtonSiguientesTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransferenciasResumidos")) {
				jButtonSiguientesTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransferenciasResumidos")) {
				jButtonSiguientesTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransferenciasResumidos") || sTipo.equals("MenuItemDetalleAbrirOrderByTransferenciasResumidos")) {
				jButtonAbrirOrderByTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransferenciasResumidos") || sTipo.equals("MenuItemDetalleMostrarOcultarTransferenciasResumidos")) {
				jButtonMostrarOcultarTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransferenciasResumidos")) {
				jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransferenciasResumidos")) {
				jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransferenciasResumidos")) {
				jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransferenciasResumidos")) {
				jButtonCerrarReporteDinamicoTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransferenciasResumidos")) {
				jButtonGenerarReporteDinamicoTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransferenciasResumidos")) {
				
				jButtonGenerarExcelReporteDinamicoTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransferenciasResumidos")) {
				jButtonCerrarImportacionTransferenciasResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransferenciasResumidos")) {
				
				jButtonGenerarImportacionTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransferenciasResumidos")) {
				
				jButtonAbrirImportacionTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransferenciasResumidos")) {
				jComboBoxTiposAccionesTransferenciasResumidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransferenciasResumidos")) {
				jComboBoxTiposRelacionesTransferenciasResumidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransferenciasResumidos")) {
				jComboBoxTiposAccionesTransferenciasResumidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransferenciasResumidos")) {
				
				jComboBoxTiposSeleccionarTransferenciasResumidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransferenciasResumidos")) {
				jTextFieldValorCampoGeneralTransferenciasResumidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransferenciasResumidos")) {
				jButtonAbrirOrderByTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransferenciasResumidos")) {
				jButtonAbrirOrderByTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransferenciasResumidos")) {
				jButtonCerrarOrderByTransferenciasResumidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransferenciasResumidosBusqueda")) {
				this.jButtonidTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransferenciasResumidosUpdate")) {
				this.jButtonid_empresaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransferenciasResumidosBusqueda")) {
				this.jButtonid_empresaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTransferenciasResumidosUpdate")) {
				this.jButtonid_sucursalTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTransferenciasResumidosBusqueda")) {
				this.jButtonid_sucursalTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaTransferenciasResumidosUpdate")) {
				this.jButtonid_bodegaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaTransferenciasResumidosBusqueda")) {
				this.jButtonid_bodegaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoTransferenciasResumidosUpdate")) {
				this.jButtonid_productoTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoTransferenciasResumidosBusqueda")) {
				this.jButtonid_productoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionTransferenciasResumidosUpdate")) {
				this.jButtonid_transaccionTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionTransferenciasResumidosBusqueda")) {
				this.jButtonid_transaccionTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaTransferenciasResumidosUpdate")) {
				this.jButtonid_lineaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaTransferenciasResumidosBusqueda")) {
				this.jButtonid_lineaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoTransferenciasResumidosUpdate")) {
				this.jButtonid_linea_grupoTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoTransferenciasResumidosBusqueda")) {
				this.jButtonid_linea_grupoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaTransferenciasResumidosUpdate")) {
				this.jButtonid_linea_categoriaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaTransferenciasResumidosBusqueda")) {
				this.jButtonid_linea_categoriaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaTransferenciasResumidosUpdate")) {
				this.jButtonid_linea_marcaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaTransferenciasResumidosBusqueda")) {
				this.jButtonid_linea_marcaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeTransferenciasResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaTransferenciasResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_transaccionTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_bodegaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_productoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_unidadTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadTransferenciasResumidosBusqueda")) {
				this.jButtoncantidadTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioTransferenciasResumidosBusqueda")) {
				this.jButtoncosto_unitarioTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalTransferenciasResumidosBusqueda")) {
				this.jButtoncosto_totalTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodega_enviarTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_bodega_enviarTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoTransferenciasResumidosBusqueda")) {
				this.jButtoncodigo_productoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoTransferenciasResumidosBusqueda")) {
				this.jButtontipoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaTransferenciasResumidosTransferenciasResumidos")) {
				this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidosActionPerformed(evt);
			}
			
			;
			
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransferenciasResumidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TransferenciasResumidos transferenciasresumidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				transferenciasresumidosLocal=this.transferenciasresumidos;
			} else {
				transferenciasresumidosLocal=this.transferenciasresumidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
							
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
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
			
			


			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
								
						
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
								
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
							
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
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
			
			


			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
								
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransferenciasResumidos")) {
					jCheckBoxSeleccionarTodosTransferenciasResumidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransferenciasResumidos")) {
					jCheckBoxSeleccionadosTransferenciasResumidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransferenciasResumidos")) {
					
				}
				
				


				
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
												
				
				


				
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
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
			
			


			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransferenciasResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transferenciasresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transferenciasresumidos);
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
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
				
				


				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TransferenciasResumidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TransferenciasResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransferenciasResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transferenciasresumidosAnterior =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransferenciasResumidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransferenciasResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransferenciasResumidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transferenciasresumidos =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transferenciasresumidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransferenciasResumidos")) {
				
				}
				
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransferenciasResumidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransferenciasResumidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransferenciasResumidos")) {
			
			}
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransferenciasResumidos();
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			if(sTipo.equals("NuevoTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransferenciasResumidos")) {
				jButtonDuplicarTransferenciasResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransferenciasResumidos")) {
				jButtonCopiarTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransferenciasResumidos")) {
				jButtonVerFormTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransferenciasResumidos")) {
				jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransferenciasResumidos")) {
				jButtonModificarTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransferenciasResumidos")) {
				jButtonActualizarTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransferenciasResumidos")) {
				jButtonEliminarTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransferenciasResumidos")) {
				jButtonCancelarTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransferenciasResumidos")) {
				jButtonCerrarTransferenciasResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransferenciasResumidos")) {
				jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransferenciasResumidos")) {
				jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransferenciasResumidos")) {
				jButtonAbrirOrderByTransferenciasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransferenciasResumidos")) {
				jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransferenciasResumidos")) {
				jButtonAnterioresTransferenciasResumidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransferenciasResumidos")) {
				jButtonSiguientesTransferenciasResumidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransferenciasResumidosBusqueda")) {
				this.jButtonidTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransferenciasResumidosUpdate")) {
				this.jButtonid_empresaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransferenciasResumidosBusqueda")) {
				this.jButtonid_empresaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTransferenciasResumidosUpdate")) {
				this.jButtonid_sucursalTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTransferenciasResumidosBusqueda")) {
				this.jButtonid_sucursalTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaTransferenciasResumidosUpdate")) {
				this.jButtonid_bodegaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaTransferenciasResumidosBusqueda")) {
				this.jButtonid_bodegaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoTransferenciasResumidosUpdate")) {
				this.jButtonid_productoTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoTransferenciasResumidosBusqueda")) {
				this.jButtonid_productoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionTransferenciasResumidosUpdate")) {
				this.jButtonid_transaccionTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionTransferenciasResumidosBusqueda")) {
				this.jButtonid_transaccionTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaTransferenciasResumidosUpdate")) {
				this.jButtonid_lineaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaTransferenciasResumidosBusqueda")) {
				this.jButtonid_lineaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoTransferenciasResumidosUpdate")) {
				this.jButtonid_linea_grupoTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoTransferenciasResumidosBusqueda")) {
				this.jButtonid_linea_grupoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaTransferenciasResumidosUpdate")) {
				this.jButtonid_linea_categoriaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaTransferenciasResumidosBusqueda")) {
				this.jButtonid_linea_categoriaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaTransferenciasResumidosUpdate")) {
				this.jButtonid_linea_marcaTransferenciasResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaTransferenciasResumidosBusqueda")) {
				this.jButtonid_linea_marcaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeTransferenciasResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaTransferenciasResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_transaccionTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_bodegaTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_productoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_unidadTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadTransferenciasResumidosBusqueda")) {
				this.jButtoncantidadTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioTransferenciasResumidosBusqueda")) {
				this.jButtoncosto_unitarioTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalTransferenciasResumidosBusqueda")) {
				this.jButtoncosto_totalTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodega_enviarTransferenciasResumidosBusqueda")) {
				this.jButtonnombre_bodega_enviarTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoTransferenciasResumidosBusqueda")) {
				this.jButtoncodigo_productoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoTransferenciasResumidosBusqueda")) {
				this.jButtontipoTransferenciasResumidosBusquedaActionPerformed(evt);
			}
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransferenciasResumidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransferenciasResumidos")) {
				closingInternalFrameTransferenciasResumidos();
				
			} else if(sTipo.equals("jButtonCancelarTransferenciasResumidos")) {
				JInternalFrameBase jInternalFrameDetalleFormTransferenciasResumidos = (JInternalFrameBase)evt.getSource();
	            	
	            TransferenciasResumidosBeanSwingJInternalFrame jInternalFrameParent=(TransferenciasResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormTransferenciasResumidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransferenciasResumidosActionPerformed(null);
			}
			
			TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transferenciasresumidos,new Object(),this.transferenciasresumidosParameterGeneral,this.transferenciasresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransferenciasResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransferenciasResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransferenciasResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transferenciasresumidos)) {
			if(!esControlTabla) {
				if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);			
				}
				
				if(this.transferenciasresumidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransferenciasResumidos(this.transferenciasresumidosReturnGeneral,this.transferenciasresumidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transferenciasresumidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransferenciasResumidos(classes,this.transferenciasresumidosReturnGeneral,this.transferenciasresumidosBean,false);
					}
						
					if(this.transferenciasresumidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransferenciasResumidos(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos());	
					}
						
					if(this.transferenciasresumidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos(),classes);//this.transferenciasresumidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransferenciasResumidos(this.transferenciasresumidos,classes);//this.transferenciasresumidosBean);									
				}
			
				if(TransferenciasResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransferenciasResumidos(this.transferenciasresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransferenciasResumidos(this.transferenciasresumidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transferenciasresumidosAnterior!=null) {
						this.transferenciasresumidos=this.transferenciasresumidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transferenciasresumidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transferenciasresumidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos(),transferenciasresumidosLogic.getTransferenciasResumidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidos(),this.transferenciasresumidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransferenciasResumidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransferenciasResumidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransferenciasResumidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransferenciasResumidos() throws Exception {
		
		TransferenciasResumidosModel transferenciasresumidosModel=(TransferenciasResumidosModel)this.jTableDatosTransferenciasResumidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transferenciasresumidosModel.transferenciasresumidoss=this.transferenciasresumidosLogic.getTransferenciasResumidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transferenciasresumidosModel.transferenciasresumidoss=this.transferenciasresumidoss;
		}
		
		
		((TransferenciasResumidosModel) this.jTableDatosTransferenciasResumidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransferenciasResumidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransferenciasresumidosAnterior(),this.transferenciasresumidosLogic.getTransferenciasResumidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransferenciasresumidosAnterior(),this.transferenciasresumidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransferenciasResumidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
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
										
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transferenciasresumidos,new Object(),generalEntityParameterGeneral,this.transferenciasresumidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransferenciasResumidosConstantesFunciones.getClassesRelationshipsOfTransferenciasResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransferenciasResumidosConstantesFunciones.getClassesRelationshipsFromStringsOfTransferenciasResumidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransferenciasResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransferenciasResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transferenciasresumidos,new Object(),generalEntityParameterGeneral,this.transferenciasresumidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransferenciasResumidos(TransferenciasResumidosBean transferenciasresumidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransferenciasResumidos(ArrayList<Classe> classes,TransferenciasResumidosReturnGeneral transferenciasresumidosReturnGeneral,TransferenciasResumidosBean transferenciasresumidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transferenciasresumidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransferenciasResumidos = new TransferenciasResumidosDetalleFormJInternalFrame(jDesktopPane,this.transferenciasresumidosSessionBean.getConGuardarRelaciones(),this.transferenciasresumidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.setVisible(false);
		this.jInternalFrameDetalleFormTransferenciasResumidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.transferenciasresumidosLogic=this.transferenciasresumidosLogic;
		
		this.cargarCombosFrameForeignKeyTransferenciasResumidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransferenciasResumidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransferenciasResumidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransferenciasResumidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransferenciasResumidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransferenciasResumidos"));
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"ModificarTransferenciasResumidos"));

		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransferenciasResumidos"));
					
		this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemModificarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransferenciasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"ActualizarTransferenciasResumidos"));
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransferenciasResumidos"));
						
		this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemActualizarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransferenciasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"EliminarTransferenciasResumidos"));
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransferenciasResumidos"));
								
		this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemEliminarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransferenciasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CancelarTransferenciasResumidos"));
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransferenciasResumidos"));
					
		this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemCancelarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransferenciasResumidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemDetalleCerrarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransferenciasResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransferenciasResumidos"));
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransferenciasResumidos"));
		
		
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransferenciasResumidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonidTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_empresaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_empresaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_sucursalTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_sucursalTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_bodegaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_bodegaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_productoTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_productoTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_transaccionTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_transaccionTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_lineaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_lineaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_grupoTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_grupoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_categoriaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_marcaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_marcaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_transaccionTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_bodegaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_unidadTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncantidadTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncosto_unitarioTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncosto_totalTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodega_enviarTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncodigo_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtontipoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tipoTransferenciasResumidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransferenciasResumidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransferenciasResumidos"));
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransferenciasResumidos"));
		}
		
		this.jTableDatosTransferenciasResumidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransferenciasResumidos"));
		
		this.jTableDatosTransferenciasResumidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransferenciasResumidos"));
		
		this.jButtonNuevoTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"NuevoTransferenciasResumidos"));
		
		this.jButtonDuplicarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"DuplicarTransferenciasResumidos"));
		
		this.jButtonCopiarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"CopiarTransferenciasResumidos"));
		
		this.jButtonVerFormTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"VerFormTransferenciasResumidos"));
		
		
		this.jButtonNuevoToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransferenciasResumidos"));
			
		this.jButtonDuplicarToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransferenciasResumidos"));
			
		this.jMenuItemNuevoTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransferenciasResumidos"));
			
		this.jMenuItemDuplicarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransferenciasResumidos"));		
		
		
		this.jButtonNuevoRelacionesTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransferenciasResumidos"));
		
		
		this.jButtonNuevoRelacionesToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransferenciasResumidos"));
			
		this.jMenuItemNuevoRelacionesTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransferenciasResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"ModificarTransferenciasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonModificarToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransferenciasResumidos"));
			
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemModificarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransferenciasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"ActualizarTransferenciasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonActualizarToolBarTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransferenciasResumidos"));
				
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemActualizarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransferenciasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"EliminarTransferenciasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonEliminarToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransferenciasResumidos"));
						
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemEliminarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransferenciasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CancelarTransferenciasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonCancelarToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransferenciasResumidos"));
			
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemCancelarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransferenciasResumidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransferenciasResumidos"));		
		
		
		this.jButtonCerrarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CerrarTransferenciasResumidos"));
		
		
		this.jButtonCerrarToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransferenciasResumidos"));
			
		this.jMenuItemCerrarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransferenciasResumidos"));
			
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jMenuItemDetalleCerrarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransferenciasResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransferenciasResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransferenciasResumidos"));
		}
		
		this.jButtonCopiarToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransferenciasResumidos"));
			
		this.jButtonVerFormToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransferenciasResumidos"));
		
		this.jMenuItemGuardarCambiosTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransferenciasResumidos"));
			
		this.jMenuItemCopiarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransferenciasResumidos"));		
		
		this.jMenuItemVerFormTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransferenciasResumidos"));		
		
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransferenciasResumidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransferenciasResumidos"));
			
		this.jMenuItemGuardarCambiosTablaTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransferenciasResumidos"));		
		
		
		
		this.jButtonRecargarInformacionTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransferenciasResumidos"));
					
		this.jButtonRecargarInformacionToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransferenciasResumidos"));
		
		this.jMenuItemRecargarInformacionTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransferenciasResumidos"));		
		
		
		
		this.jButtonAnterioresTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"AnterioresTransferenciasResumidos"));
		
		
		this.jButtonAnterioresToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransferenciasResumidos"));
		
		this.jMenuItemAnterioresTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransferenciasResumidos"));		
		
		
		this.jButtonSiguientesTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"SiguientesTransferenciasResumidos"));
		
		
		this.jButtonSiguientesToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransferenciasResumidos"));
			
		this.jMenuItemSiguientesTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransferenciasResumidos"));
			
		this.jMenuItemAbrirOrderByTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransferenciasResumidos"));
			
		this.jMenuItemMostrarOcultarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransferenciasResumidos"));
			
		this.jMenuItemDetalleAbrirOrderByTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransferenciasResumidos"));
			
		this.jMenuItemDetalleMostarOcultarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransferenciasResumidos"));		
		
		
		this.jButtonNuevoGuardarCambiosTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransferenciasResumidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransferenciasResumidos"));
			
		this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransferenciasResumidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransferenciasResumidos"));

		this.jCheckBoxSeleccionadosTransferenciasResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransferenciasResumidos"));
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransferenciasResumidos"));
		}
		
		
		this.jComboBoxTiposRelacionesTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransferenciasResumidos"));
			
		this.jComboBoxTiposAccionesTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesTransferenciasResumidos"));
					
		this.jComboBoxTiposSeleccionarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransferenciasResumidos"));
			
		this.jTextFieldValorCampoGeneralTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransferenciasResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonidTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_empresaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_empresaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_sucursalTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_sucursalTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_bodegaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_bodegaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_productoTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_productoTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_transaccionTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_transaccionTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_lineaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_lineaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_grupoTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_grupoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_categoriaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_marcaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_marcaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_transaccionTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_bodegaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_unidadTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncantidadTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncosto_unitarioTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncosto_totalTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodega_enviarTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncodigo_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtontipoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tipoTransferenciasResumidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"BusquedaTransferenciasResumidosTransferenciasResumidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransferenciasResumidos!=null) {
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransferenciasResumidos"));
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransferenciasResumidos"));
				this.jInternalFrameReporteDinamicoTransferenciasResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransferenciasResumidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransferenciasResumidos"));				
			//this.jButtonGenerarReporteDinamicoTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransferenciasResumidos"));
			//this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransferenciasResumidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransferenciasResumidos!=null) {
				this.jInternalFrameImportacionTransferenciasResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransferenciasResumidos"));
				this.jInternalFrameImportacionTransferenciasResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransferenciasResumidos"));
				this.jInternalFrameImportacionTransferenciasResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransferenciasResumidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransferenciasResumidos"));
			
			this.jButtonAbrirOrderByToolBarTransferenciasResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransferenciasResumidos"));			
			
			if(this.jInternalFrameOrderByTransferenciasResumidos!=null) {
				this.jInternalFrameOrderByTransferenciasResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransferenciasResumidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransferenciasResumidos.jTabbedPaneRelacionesTransferenciasResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransferenciasResumidos"));
		
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
            		closingInternalFrameTransferenciasResumidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransferenciasResumidos = (JInternalFrameBase)event.getSource();
	            	
	            TransferenciasResumidosBeanSwingJInternalFrame jInternalFrameParent=(TransferenciasResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormTransferenciasResumidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransferenciasResumidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransferenciasResumidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransferenciasResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransferenciasResumidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransferenciasResumidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransferenciasResumidos";
		inputMap = this.jButtonNuevoTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransferenciasResumidos";
		inputMap = this.jButtonNuevoRelacionesTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransferenciasResumidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransferenciasResumidos";
		inputMap = this.jButtonModificarTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransferenciasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransferenciasResumidos";
		inputMap = this.jButtonActualizarTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransferenciasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransferenciasResumidos";
		inputMap = this.jButtonEliminarTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransferenciasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransferenciasResumidos";
		inputMap = this.jButtonCancelarTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransferenciasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransferenciasResumidos";
		inputMap = this.jButtonCerrarTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransferenciasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransferenciasResumidos";
		inputMap = this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonGuardarCambiosTransferenciasResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransferenciasResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransferenciasResumidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransferenciasResumidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransferenciasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransferenciasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransferenciasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransferenciasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransferenciasResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransferenciasResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonidTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_empresaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_empresaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_sucursalTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_sucursalTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_bodegaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_bodegaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_productoTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_productoTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_transaccionTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_transaccionTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_lineaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_lineaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_grupoTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_grupoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_categoriaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_categoriaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaTransferenciasResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_marcaTransferenciasResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaTransferenciasResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonid_linea_marcaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonfecha_emision_desdeTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonfecha_emision_hastaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_transaccionTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_bodegaTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_unidadTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncantidadTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncosto_unitarioTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncosto_totalTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtonnombre_bodega_enviarTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodega_enviarTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtoncodigo_productoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoTransferenciasResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransferenciasResumidos.jButtontipoTransferenciasResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tipoTransferenciasResumidosBusqueda"));
		
		
		this.jButtonBusquedaTransferenciasResumidosTransferenciasResumidos.addActionListener(new ButtonActionListener(this,"BusquedaTransferenciasResumidosTransferenciasResumidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransferenciasResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransferenciasResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransferenciasResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransferenciasResumidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransferenciasResumidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
					transferenciasresumidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidoss) {
					transferenciasresumidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransferenciasResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
						transferenciasresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidoss) {
						transferenciasresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransferenciasResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransferenciasResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransferenciasResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransferenciasResumidos.getSelectedRows();
			
			TransferenciasResumidos transferenciasresumidosLocal=new TransferenciasResumidos();
			
			//this.seleccionarTodosTransferenciasResumidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transferenciasresumidosLocal =(TransferenciasResumidos) this.transferenciasresumidosLogic.getTransferenciasResumidoss().toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transferenciasresumidosLocal =(TransferenciasResumidos) this.transferenciasresumidoss.toArray()[this.jTableDatosTransferenciasResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transferenciasresumidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
						transferenciasresumidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidoss) {
						transferenciasresumidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransferenciasResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransferenciasResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransferenciasResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransferenciasResumidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransferenciasResumidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransferenciasResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransferenciasResumidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidosLogic.getTransferenciasResumidoss()) {
				
						if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							transferenciasresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							transferenciasresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							transferenciasresumidosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							transferenciasresumidosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							transferenciasresumidosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							transferenciasresumidosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							transferenciasresumidosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							transferenciasresumidosAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							transferenciasresumidosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR)) {
							existe=true;
							transferenciasresumidosAux.setnombre_bodega_enviar(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							transferenciasresumidosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							transferenciasresumidosAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidoss) {
					
						if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							transferenciasresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							transferenciasresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							transferenciasresumidosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							transferenciasresumidosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							transferenciasresumidosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							transferenciasresumidosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							transferenciasresumidosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							transferenciasresumidosAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							transferenciasresumidosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR)) {
							existe=true;
							transferenciasresumidosAux.setnombre_bodega_enviar(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							transferenciasresumidosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							transferenciasresumidosAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransferenciasResumidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransferenciasResumidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransferenciasResumidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransferenciasResumidos) {				
					conSplash=true;//false;										
					
					//this.startProcessTransferenciasResumidos(conSplash);
				
					this.generarReporteTransferenciasResumidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransferenciasResumidossSeleccionados();
				//this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransferenciasResumidossSeleccionados(false);
				//this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransferenciasResumidossSeleccionados(true);
				//this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransferenciasResumidos();
				
				this.exportarTransferenciasResumidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransferenciasResumidoss();
				//this.importarTransferenciasResumidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransferenciasResumidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransferenciasResumidossSeleccionados();
				//this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transferencias Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransferenciasResumidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransferenciasResumidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransferenciasResumidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
				}	
			} 			
			else if(TransferenciasResumidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransferenciasResumidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransferenciasResumidos(conSplash);
					
						//this.actualizarParametrosGeneralTransferenciasResumidos();
						
						this.generarReporteProcesoAccionTransferenciasResumidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransferenciasResumidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Transferencias ResumidosES SELECCIONADOS?", "MANTENIMIENTO DE Transferencias Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransferenciasResumidos();
				
						this.actualizarParametrosGeneralTransferenciasResumidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transferenciasresumidosReturnGeneral=transferenciasresumidosLogic.procesarAccionTransferenciasResumidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transferenciasresumidosLogic.getTransferenciasResumidoss(),this.transferenciasresumidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransferenciasResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransferenciasResumidos();
					
					TransferenciasResumidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransferenciasResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransferenciasResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxTiposAccionesFormularioTransferenciasResumidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransferenciasResumidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransferenciasResumidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransferenciasResumidos();
			
			if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
			TransferenciasResumidos transferenciasresumidos=new TransferenciasResumidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransferenciasResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransferenciasResumidos.getSelectedItem();
			
			
			
			
			transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(transferenciasresumidossSeleccionados.size()==1) {
				for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossSeleccionados) {
					transferenciasresumidos=transferenciasresumidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransferenciasResumidos();
			
      		//this.finishProcessTransferenciasResumidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransferenciasResumidosReturnGeneral() throws Exception {
		if(this.transferenciasresumidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transferenciasresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transferenciasresumidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transferenciasresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transferenciasresumidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transferenciasresumidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransferenciasResumidos(false);
		}
		
		if(this.transferenciasresumidosReturnGeneral.getConRetornoLista() || this.transferenciasresumidosReturnGeneral.getConRetornoObjeto()) {
			if(this.transferenciasresumidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transferenciasresumidosLogic.setTransferenciasResumidoss(this.transferenciasresumidosReturnGeneral.getTransferenciasResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingTransferenciasResumidos(false);
		}
	}
	
	public void actualizarParametrosGeneralTransferenciasResumidos() throws Exception {
		
		
	}
	
	public ArrayList<TransferenciasResumidos> getTransferenciasResumidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransferenciasResumidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidosLogic.getTransferenciasResumidoss()) {
					if(transferenciasresumidosAux.getIsSelected()) {
						transferenciasresumidossSeleccionados.add(transferenciasresumidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TransferenciasResumidos transferenciasresumidosAux:this.transferenciasresumidoss) {
					if(transferenciasresumidosAux.getIsSelected()) {
						transferenciasresumidossSeleccionados.add(transferenciasresumidosAux);				
					}
				}
			}
			
			if(transferenciasresumidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transferenciasresumidossSeleccionados.addAll(this.transferenciasresumidosLogic.getTransferenciasResumidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transferenciasresumidossSeleccionados.addAll(this.transferenciasresumidoss);				
					}
				}
			}
		} else {
			transferenciasresumidossSeleccionados.add(this.transferenciasresumidos);
		}
		
		return transferenciasresumidossSeleccionados;
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
	
	public void generarReporteTransferenciasResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransferenciasResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransferenciasResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransferenciasResumidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransferenciasResumidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transferencias Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransferenciasResumidossSeleccionados() throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados);
		
	}	
	
	public void generarReporteNormalTransferenciasResumidossSeleccionados() throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransferenciasResumidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransferenciasResumidossSeleccionados() throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransferenciasResumidos();
		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransferenciasResumidos();
		
		
		//this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados ,transferenciasresumidosImplementable,transferenciasresumidosImplementableHome);
	}
	
	public void mostrarImportacionTransferenciasResumidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransferenciasResumidos();
		
		this.abrirFrameImportacionTransferenciasResumidos();		
		
			
		//this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados ,transferenciasresumidosImplementable,transferenciasresumidosImplementableHome);
	}
	
	public void importarTransferenciasResumidoss() throws Exception {		
	
	}
	
	public void exportarTransferenciasResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransferenciasResumidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransferenciasResumidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransferenciasResumidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transferencias Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransferenciasResumidossSeleccionados() throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransferenciasResumidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransferenciasResumidos(transferenciasresumidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transferenciasresumidosAux.setsDetalleGeneralEntityReporte(transferenciasresumidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransferenciasResumidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransferenciasResumidosConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transferenciasresumidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getnombre_bodega_enviar();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transferenciasresumidos.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransferenciasResumidossSeleccionados() throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransferenciasResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransferenciasResumidos(row);				
				iRow++;
			}				
			
			for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransferenciasResumidos(transferenciasresumidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransferenciasResumidossSeleccionados() throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();		
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transferenciasresumidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transferenciasresumidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transferenciasresumidos");
			//elementRoot.appendChild(element);
		
			for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossSeleccionados) {
				element = document.createElement("transferenciasresumidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransferenciasResumidos(transferenciasresumidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transferencias Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransferenciasResumidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransferenciasResumidosConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getnombre_bodega_enviar());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(transferenciasresumidos.gettipo());				
	}
	
	public void setFilaDatosExportarXmlTransferenciasResumidos(TransferenciasResumidos transferenciasresumidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransferenciasResumidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transferenciasresumidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransferenciasResumidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transferenciasresumidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementtransaccion_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(transferenciasresumidos.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementlinea_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(TransferenciasResumidosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(transferenciasresumidos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_desde = document.createElement(TransferenciasResumidosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(transferenciasresumidos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(TransferenciasResumidosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(transferenciasresumidos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_transaccion = document.createElement(TransferenciasResumidosConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(transferenciasresumidos.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementnombre_bodega = document.createElement(TransferenciasResumidosConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(transferenciasresumidos.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_producto = document.createElement(TransferenciasResumidosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(transferenciasresumidos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(TransferenciasResumidosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(transferenciasresumidos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad = document.createElement(TransferenciasResumidosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(transferenciasresumidos.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto_unitario = document.createElement(TransferenciasResumidosConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(transferenciasresumidos.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcosto_total = document.createElement(TransferenciasResumidosConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(transferenciasresumidos.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementnombre_bodega_enviar = document.createElement(TransferenciasResumidosConstantesFunciones.NOMBREBODEGAENVIAR);
		elementnombre_bodega_enviar.appendChild(document.createTextNode(transferenciasresumidos.getnombre_bodega_enviar().trim()));
		element.appendChild(elementnombre_bodega_enviar);

		Element elementcodigo_producto = document.createElement(TransferenciasResumidosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(transferenciasresumidos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementtipo = document.createElement(TransferenciasResumidosConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(transferenciasresumidos.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoTransferenciasResumidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados=new ArrayList<TransferenciasResumidos>();
		
		transferenciasresumidossSeleccionados=this.getTransferenciasResumidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTransferenciasResumidos(transferenciasresumidossSeleccionados);
		
		this.generarReporteTransferenciasResumidoss("Todos",transferenciasresumidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransferenciasResumidos(ArrayList<TransferenciasResumidos> transferenciasresumidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TransferenciasResumidos transferenciasresumidosAux:transferenciasresumidossSeleccionados) {
				transferenciasresumidosAux.setsDetalleGeneralEntityReporte(transferenciasresumidosAux.toString());
			
				if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transferenciasresumidosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(transferenciasresumidosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_NOMBREBODEGAENVIAR)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getnombre_bodega_enviar());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(TransferenciasResumidosConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					transferenciasresumidosAux.setsDescripcionGeneralEntityReporte1(transferenciasresumidosAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransferenciasResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransferenciasResumidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransferenciasResumidos=true;
				this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=true;
				this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=true;
			}
			
			this.isVisibilidadCeldaModificarTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
			this.isVisibilidadCeldaModificarTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=true;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
			this.isVisibilidadCeldaModificarTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=true;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=true;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
			this.isVisibilidadCeldaModificarTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=true;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=true;
			this.isVisibilidadCeldaModificarTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
			this.isVisibilidadCeldaModificarTransferenciasResumidos=true;
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
			this.isVisibilidadCeldaCancelarTransferenciasResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransferenciasResumidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=true;
		} else {
			this.actualizarEstadoPanelsTransferenciasResumidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransferenciasResumidos=false;
			//this.isVisibilidadCeldaVerFormTransferenciasResumidos=false;
			this.isVisibilidadCeldaDuplicarTransferenciasResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transferenciasresumidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
		} else {
			this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!transferenciasresumidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;												
			}
			
			this.jButtonCerrarTransferenciasResumidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
		}
		
		if(!this.permiteMantenimiento(this.transferenciasresumidos)) {
			this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
			this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoTransferenciasResumidos=false;
		this.isVisibilidadCeldaNuevoRelacionesTransferenciasResumidos=false;
		this.isVisibilidadCeldaGuardarCambiosTransferenciasResumidos=false;
		//this.isVisibilidadCeldaModificarTransferenciasResumidos=true;
		this.isVisibilidadCeldaActualizarTransferenciasResumidos=false;
		this.isVisibilidadCeldaEliminarTransferenciasResumidos=false;
		//this.isVisibilidadCeldaCancelarTransferenciasResumidos=true;			
		this.isVisibilidadCeldaGuardarTransferenciasResumidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransferenciasResumidos() {
	}
	
	public void actualizarEstadoPanelsTransferenciasResumidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransferenciasResumidos!=null) {
				this.jScrollPanelDatosEdicionTransferenciasResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransferenciasResumidos!=null) {
				this.jScrollPanelDatosTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransferenciasResumidos!=null) {
				this.jPanelPaginacionTransferenciasResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
					this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transferenciasresumidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransferenciasResumidos!=null) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransferenciasResumidos!=null) {
				this.jPanelParametrosReportesTransferenciasResumidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaBodega;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaProducto;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaTransaccion;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaLinea;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaTransferenciasResumidos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaTransferenciasResumidos) {this.jTabbedPaneBusquedasTransferenciasResumidos.remove(jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransferenciasResumidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransferenciasResumidos() {
		this.updateBorderResaltarBusquedasFormularioTransferenciasResumidos();
		this.updateVisibilidadBusquedasFormularioTransferenciasResumidos();
		this.updateHabilitarBusquedasFormularioTransferenciasResumidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransferenciasResumidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransferenciasResumidos.getComponents().length>0) {
	

		if(this.transferenciasresumidosConstantesFunciones.resaltarBusquedaTransferenciasResumidosTransferenciasResumidos!=null) {
			index= this.jTabbedPaneBusquedasTransferenciasResumidos.indexOfComponent(this.jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransferenciasResumidos.getComponent(index);
				jPanel.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarBusquedaTransferenciasResumidosTransferenciasResumidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransferenciasResumidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransferenciasResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransferenciasResumidos.indexOfComponent(this.jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransferenciasResumidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarBusquedaTransferenciasResumidosTransferenciasResumidos);
			if(!this.transferenciasresumidosConstantesFunciones.mostrarBusquedaTransferenciasResumidosTransferenciasResumidos && index>-1) {
				this.jTabbedPaneBusquedasTransferenciasResumidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransferenciasResumidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransferenciasResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransferenciasResumidos.indexOfComponent(this.jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransferenciasResumidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transferenciasresumidosConstantesFunciones.activarBusquedaTransferenciasResumidosTransferenciasResumidos);
				this.jTabbedPaneBusquedasTransferenciasResumidos.setEnabledAt(index,this.transferenciasresumidosConstantesFunciones.activarBusquedaTransferenciasResumidosTransferenciasResumidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransferenciasResumidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaTransferenciasResumidos")) {
			index= this.jTabbedPaneBusquedasTransferenciasResumidos.indexOfComponent(this.jPanelBusquedaTransferenciasResumidosTransferenciasResumidos);

			this.jTabbedPaneBusquedasTransferenciasResumidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransferenciasResumidos.getComponent(index);

			this.transferenciasresumidosConstantesFunciones.setResaltarBusquedaTransferenciasResumidosTransferenciasResumidos(resaltar);

			jPanel.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarBusquedaTransferenciasResumidosTransferenciasResumidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransferenciasResumidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTransferenciasResumidos() throws Exception {

		if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransferenciasResumidos();
		this.updateVisibilidadResaltarControlesFormularioTransferenciasResumidos();
		this.updateHabilitarResaltarControlesFormularioTransferenciasResumidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransferenciasResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transferenciasresumidosConstantesFunciones.resaltaridTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltaridTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_empresaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_empresaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_sucursalTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_sucursalTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_bodegaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_bodegaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_productoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_productoTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_transaccionTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_transaccionTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_lineaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_lineaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_linea_grupoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_linea_grupoTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_linea_categoriaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_linea_categoriaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarid_linea_marcaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarid_linea_marcaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarfecha_emision_desdeTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_desdeTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarfecha_emision_desdeTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarfecha_emision_hastaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_hastaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarfecha_emision_hastaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarnombre_transaccionTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarnombre_transaccionTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodegaTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodegaTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarnombre_productoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarnombre_productoTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarnombre_unidadTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarnombre_unidadTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarcantidadTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarcantidadTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarcosto_unitarioTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarcosto_unitarioTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarcosto_totalTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarcosto_totalTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodega_enviarTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarnombre_bodega_enviarTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltarcodigo_productoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltarcodigo_productoTransferenciasResumidos);}
		if(this.transferenciasresumidosConstantesFunciones.resaltartipoTransferenciasResumidos!=null && this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setBorder(this.transferenciasresumidosConstantesFunciones.resaltartipoTransferenciasResumidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransferenciasResumidos() throws Exception {		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
	
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostraridTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelidTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostraridTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_empresaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_empresaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_empresaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_sucursalTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_sucursalTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_sucursalTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_bodegaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_bodegaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_bodegaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_productoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_productoTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_transaccionTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_transaccionTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_transaccionTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_lineaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_lineaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_lineaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_linea_grupoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_linea_grupoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_linea_grupoTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_linea_categoriaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_linea_categoriaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_linea_categoriaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_linea_marcaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelid_linea_marcaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarid_linea_marcaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_desdeTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarfecha_emision_desdeTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelfecha_emision_desdeTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarfecha_emision_desdeTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_hastaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarfecha_emision_hastaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelfecha_emision_hastaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarfecha_emision_hastaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_transaccionTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelnombre_transaccionTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_transaccionTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_bodegaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelnombre_bodegaTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_bodegaTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelnombre_productoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_productoTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_unidadTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelnombre_unidadTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_unidadTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcantidadTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelcantidadTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcantidadTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcosto_unitarioTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelcosto_unitarioTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcosto_unitarioTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcosto_totalTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelcosto_totalTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcosto_totalTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_bodega_enviarTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelnombre_bodega_enviarTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarnombre_bodega_enviarTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcodigo_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPanelcodigo_productoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrarcodigo_productoTransferenciasResumidos);
		//this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrartipoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jPaneltipoTransferenciasResumidos.setVisible(this.transferenciasresumidosConstantesFunciones.mostrartipoTransferenciasResumidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransferenciasResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormTransferenciasResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransferenciasResumidos!=null) {
	
		this.jInternalFrameDetalleFormTransferenciasResumidos.jLabelidTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activaridTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_empresaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_empresaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_sucursalTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_sucursalTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_bodegaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_bodegaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_productoTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_transaccionTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_transaccionTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_lineaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_lineaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_grupoTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_linea_grupoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_categoriaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_linea_categoriaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jComboBoxid_linea_marcaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarid_linea_marcaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_desdeTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarfecha_emision_desdeTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jDateChooserfecha_emision_hastaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarfecha_emision_hastaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_transaccionTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarnombre_transaccionTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodegaTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarnombre_bodegaTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_productoTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarnombre_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldnombre_unidadTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarnombre_unidadTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcantidadTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarcantidadTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_unitarioTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarcosto_unitarioTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcosto_totalTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarcosto_totalTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextAreanombre_bodega_enviarTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarnombre_bodega_enviarTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldcodigo_productoTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activarcodigo_productoTransferenciasResumidos);
		this.jInternalFrameDetalleFormTransferenciasResumidos.jTextFieldtipoTransferenciasResumidos.setEnabled(this.transferenciasresumidosConstantesFunciones.activartipoTransferenciasResumidos);
		}
	}
	
		
}