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

import com.bydan.erp.produccion.util.PedidoDetaProduConstantesFunciones;
import com.bydan.erp.produccion.util.PedidoDetaProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.PedidoDetaProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.PedidoDetaProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PedidoDetaProduBeanSwingJInternalFrame extends PedidoDetaProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PedidoDetaProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PedidoDetaProdu> pedidodetaproduValidator = new ClassValidator<PedidoDetaProdu>(PedidoDetaProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PedidoDetaProdu pedidodetaprodu;	
	public PedidoDetaProdu pedidodetaproduAux;
	public PedidoDetaProdu pedidodetaproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PedidoDetaProdu pedidodetaproduTotales;
	public Long idPedidoDetaProduActual;
	public Long iIdNuevoPedidoDetaProdu=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboPedidoProdu="";

	public List<PedidoProdu> pedidoprodusForeignKey;

	public List<PedidoProdu> getpedidoprodusForeignKey() {
		return pedidoprodusForeignKey;
	}

	public void setpedidoprodusForeignKey(List<PedidoProdu> pedidoprodusForeignKey) {
		this.pedidoprodusForeignKey = pedidoprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public PedidoProdu pedidoproduForeignKey;

	public PedidoProdu getpedidoproduForeignKey() {
		return pedidoproduForeignKey;
	}

	public void setpedidoproduForeignKey(PedidoProdu pedidoproduForeignKey) {
		this.pedidoproduForeignKey = pedidoproduForeignKey;
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

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
	}

	public String sFinalQueryComboBodegaDestino="";

	public List<Bodega> bodegadestinosForeignKey;

	public List<Bodega> getbodegadestinosForeignKey() {
		return bodegadestinosForeignKey;
	}

	public void setbodegadestinosForeignKey(List<Bodega> bodegadestinosForeignKey) {
		this.bodegadestinosForeignKey = bodegadestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegadestinoForeignKey;

	public Bodega getbodegadestinoForeignKey() {
		return bodegadestinoForeignKey;
	}

	public void setbodegadestinoForeignKey(Bodega bodegadestinoForeignKey) {
		this.bodegadestinoForeignKey = bodegadestinoForeignKey;
	}

	public String sFinalQueryComboTipoProcesoProdu="";

	public List<TipoProcesoProdu> tipoprocesoprodusForeignKey;

	public List<TipoProcesoProdu> gettipoprocesoprodusForeignKey() {
		return tipoprocesoprodusForeignKey;
	}

	public void settipoprocesoprodusForeignKey(List<TipoProcesoProdu> tipoprocesoprodusForeignKey) {
		this.tipoprocesoprodusForeignKey = tipoprocesoprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProcesoProdu tipoprocesoproduForeignKey;

	public TipoProcesoProdu gettipoprocesoproduForeignKey() {
		return tipoprocesoproduForeignKey;
	}

	public void settipoprocesoproduForeignKey(TipoProcesoProdu tipoprocesoproduForeignKey) {
		this.tipoprocesoproduForeignKey = tipoprocesoproduForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
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
	
	public Boolean isPermisoTodoPedidoDetaProdu;
	public Boolean isPermisoNuevoPedidoDetaProdu;
	public Boolean isPermisoActualizarPedidoDetaProdu;
	public Boolean isPermisoActualizarOriginalPedidoDetaProdu;
	public Boolean isPermisoEliminarPedidoDetaProdu;
	public Boolean isPermisoGuardarCambiosPedidoDetaProdu;
	public Boolean isPermisoConsultaPedidoDetaProdu;
	public Boolean isPermisoBusquedaPedidoDetaProdu;
	public Boolean isPermisoReportePedidoDetaProdu;
	public Boolean isPermisoPaginacionMedioPedidoDetaProdu;
	public Boolean isPermisoPaginacionAltoPedidoDetaProdu;
	public Boolean isPermisoPaginacionTodoPedidoDetaProdu;
	public Boolean isPermisoCopiarPedidoDetaProdu;
	public Boolean isPermisoVerFormPedidoDetaProdu;
	public Boolean isPermisoDuplicarPedidoDetaProdu;
	public Boolean isPermisoOrdenPedidoDetaProdu;
	
	
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
	
	public PedidoDetaProduParameterReturnGeneral pedidodetaproduReturnGeneral;
	public PedidoDetaProduParameterReturnGeneral pedidodetaproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPedidoDetaProdu=false;
	public Boolean esParaAccionDesdeFormularioPedidoDetaProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PedidoDetaProduSessionBeanAdditional pedidodetaproduSessionBeanAdditional=null;
	
	public PedidoDetaProduSessionBeanAdditional getPedidoDetaProduSessionBeanAdditional() {
		return this.pedidodetaproduSessionBeanAdditional;
	}
	
	public void setPedidoDetaProduSessionBeanAdditional(PedidoDetaProduSessionBeanAdditional pedidodetaproduSessionBeanAdditional) {
		try {
			this.pedidodetaproduSessionBeanAdditional=pedidodetaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PedidoDetaProduBeanSwingJInternalFrameAdditional pedidodetaproduBeanSwingJInternalFrameAdditional=null;
	//public class PedidoDetaProduBeanSwingJInternalFrame
	
	public PedidoDetaProduBeanSwingJInternalFrameAdditional getPedidoDetaProduBeanSwingJInternalFrameAdditional() {
		return this.pedidodetaproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setPedidoDetaProduBeanSwingJInternalFrameAdditional(PedidoDetaProduBeanSwingJInternalFrameAdditional pedidodetaproduBeanSwingJInternalFrameAdditional) {
		try {
			this.pedidodetaproduBeanSwingJInternalFrameAdditional=pedidodetaproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PedidoDetaProduLogic pedidodetaproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PedidoDetaProdu pedidodetaproduBean;
	public PedidoDetaProduConstantesFunciones pedidodetaproduConstantesFunciones;
	//public PedidoDetaProduParameterReturnGeneral pedidodetaproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public PedidoProduLogic pedidoproduLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	public BodegaLogic bodegadestinoLogic;
	public TipoProcesoProduLogic tipoprocesoproduLogic;
	
	//PARAMETROS
	
	
	//public List<PedidoDetaProdu> pedidodetaprodus;	
	//public List<PedidoDetaProdu> pedidodetaprodusEliminados;
	//public List<PedidoDetaProdu> pedidodetaprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPedidoDetaProdu=false;
	public Boolean isVisibilidadCeldaDuplicarPedidoDetaProdu=true;
	public Boolean isVisibilidadCeldaCopiarPedidoDetaProdu=true;
	public Boolean isVisibilidadCeldaVerFormPedidoDetaProdu=true;
	public Boolean isVisibilidadCeldaOrdenPedidoDetaProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
	public Boolean isVisibilidadCeldaModificarPedidoDetaProdu=false;
	public Boolean isVisibilidadCeldaActualizarPedidoDetaProdu=false;
	public Boolean isVisibilidadCeldaEliminarPedidoDetaProdu=false;
	public Boolean isVisibilidadCeldaCancelarPedidoDetaProdu=false;
	public Boolean isVisibilidadCeldaGuardarPedidoDetaProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdBodegaDestino=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPedidoProdu=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoProcesoProdu=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoPedidoDetaProdu() {
		return this.iIdNuevoPedidoDetaProdu;
	}

	public void setiIdNuevoPedidoDetaProdu(Long iIdNuevoPedidoDetaProdu) {
		this.iIdNuevoPedidoDetaProdu = iIdNuevoPedidoDetaProdu;
	}
	
	public Long getidPedidoDetaProduActual() {
		return this.idPedidoDetaProduActual;
	}

	public void setidPedidoDetaProduActual(Long idPedidoDetaProduActual) {
		this.idPedidoDetaProduActual = idPedidoDetaProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PedidoDetaProdu getpedidodetaprodu() {
		return this.pedidodetaprodu;
	}

	public void setpedidodetaprodu(PedidoDetaProdu pedidodetaprodu) {
		this.pedidodetaprodu = pedidodetaprodu;
	}
	
	public PedidoDetaProdu getpedidodetaproduAux() {
		return this.pedidodetaproduAux;
	}

	public void setpedidodetaproduAux(PedidoDetaProdu pedidodetaproduAux) {
		this.pedidodetaproduAux = pedidodetaproduAux;
	}				
	
	public PedidoDetaProdu getpedidodetaproduAnterior() {
		return this.pedidodetaproduAnterior;
	}

	public void setpedidodetaproduAnterior(PedidoDetaProdu pedidodetaproduAnterior) {
		this.pedidodetaproduAnterior = pedidodetaproduAnterior;
	}	
	
	public PedidoDetaProdu getpedidodetaproduTotales() {
		return this.pedidodetaproduTotales;
	}

	public void setpedidodetaproduTotales(PedidoDetaProdu pedidodetaproduTotales) {
		this.pedidodetaproduTotales = pedidodetaproduTotales;
	}	
	
	public PedidoDetaProdu getpedidodetaproduBean() {
		return this.pedidodetaproduBean;
	}

	public void setpedidodetaproduBean(PedidoDetaProdu pedidodetaproduBean) {
		this.pedidodetaproduBean = pedidodetaproduBean;
	}	
	
	public PedidoDetaProduParameterReturnGeneral getpedidodetaproduReturnGeneral() {
		return this.pedidodetaproduReturnGeneral;
	}

	public void setpedidodetaproduReturnGeneral(PedidoDetaProduParameterReturnGeneral pedidodetaproduReturnGeneral) {
		this.pedidodetaproduReturnGeneral = pedidodetaproduReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_bodega_destinoFK_IdBodegaDestino=-1L;

	public Long getid_bodega_destinoFK_IdBodegaDestino() {
		return this.id_bodega_destinoFK_IdBodegaDestino;
	}

	public void setid_bodega_destinoFK_IdBodegaDestino(Long id_bodega_destinoFK_IdBodegaDestino) {
		this.id_bodega_destinoFK_IdBodegaDestino = id_bodega_destinoFK_IdBodegaDestino;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_pedido_produFK_IdPedidoProdu=-1L;

	public Long getid_pedido_produFK_IdPedidoProdu() {
		return this.id_pedido_produFK_IdPedidoProdu;
	}

	public void setid_pedido_produFK_IdPedidoProdu(Long id_pedido_produFK_IdPedidoProdu) {
		this.id_pedido_produFK_IdPedidoProdu = id_pedido_produFK_IdPedidoProdu;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
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

	public Long id_tipo_proceso_produFK_IdTipoProcesoProdu=-1L;

	public Long getid_tipo_proceso_produFK_IdTipoProcesoProdu() {
		return this.id_tipo_proceso_produFK_IdTipoProcesoProdu;
	}

	public void setid_tipo_proceso_produFK_IdTipoProcesoProdu(Long id_tipo_proceso_produFK_IdTipoProcesoProdu) {
		this.id_tipo_proceso_produFK_IdTipoProcesoProdu = id_tipo_proceso_produFK_IdTipoProcesoProdu;
	}

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PedidoDetaProduLogic getPedidoDetaProduLogic()	{		
		return pedidodetaproduLogic;
	}

	public void setPedidoDetaProduLogic(PedidoDetaProduLogic pedidodetaproduLogic) {
		this.pedidodetaproduLogic = pedidodetaproduLogic;
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
	
	public Boolean getIsEsNuevoPedidoDetaProdu() {
		return isEsNuevoPedidoDetaProdu;
	}

	public void setIsEsNuevoPedidoDetaProdu(Boolean isEsNuevoPedidoDetaProdu) {
		this.isEsNuevoPedidoDetaProdu = isEsNuevoPedidoDetaProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioPedidoDetaProdu() {
		return esParaAccionDesdeFormularioPedidoDetaProdu;
	}
	
	public void setEsParaAccionDesdeFormularioPedidoDetaProdu(Boolean esParaAccionDesdeFormularioPedidoDetaProdu) {
		this.esParaAccionDesdeFormularioPedidoDetaProdu = esParaAccionDesdeFormularioPedidoDetaProdu;
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

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidEmpresaActual());
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

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosPedidoProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.pedidoprodusForeignKey=new ArrayList<PedidoProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PedidoProduLogic pedidoproduLogic=new PedidoProduLogic();

			//pedidoproduLogic.getPedidoProduDataAccess().setIsForForeingKeyData(true);

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionPedidoProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pedidoproduLogic.getPedidoProduDataAccess().setIsForForeingKeyData(true);

					pedidoproduLogic.getTodosPedidoProdusWithConnection(sFinalQuery,new Pagination());

					this.pedidoprodusForeignKey=pedidoproduLogic.getPedidoProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPedidoProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidPedidoProduActual());
					this.pedidoprodusForeignKey.add(pedidoproduLogic.getPedidoProdu());
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

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidBodegaActual());
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

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidProductoActual());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

	public void cargarCombosBodegaDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegadestinosForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodegaDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegadestinoLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegadestinosForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodegaDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidBodegaDestinoActual());
					this.bodegadestinosForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosTipoProcesoProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprocesoprodusForeignKey=new ArrayList<TipoProcesoProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProcesoProduLogic tipoprocesoproduLogic=new TipoProcesoProduLogic();

			//tipoprocesoproduLogic.getTipoProcesoProduDataAccess().setIsForForeingKeyData(true);

			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprocesoproduLogic.getTipoProcesoProduDataAccess().setIsForForeingKeyData(true);

					tipoprocesoproduLogic.getTodosTipoProcesoProdusWithConnection(sFinalQuery,new Pagination());

					this.tipoprocesoprodusForeignKey=tipoprocesoproduLogic.getTipoProcesoProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProcesoProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprocesoproduLogic.getEntityWithConnection(pedidodetaproduSessionBean.getlidTipoProcesoProduActual());
					this.tipoprocesoprodusForeignKey.add(tipoprocesoproduLogic.getTipoProcesoProdu());
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

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPedidoDetaProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPedidoDetaProduGenerico)throws Exception
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
				jComboBoxid_empresaPedidoDetaProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPedidoDetaProduGenerico!=null && jComboBoxid_empresaPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaPedidoDetaProduGenerico.setSelectedIndex(0);
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

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPedidoDetaProdu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPedidoDetaProduGenerico)throws Exception
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
				jComboBoxid_sucursalPedidoDetaProduGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPedidoDetaProduGenerico!=null && jComboBoxid_sucursalPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPedidoDetaProdu.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioPedidoDetaProduGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPedidoDetaProduGenerico!=null && jComboBoxid_ejercicioPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPedidoDetaProdu.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoPedidoDetaProduGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPedidoDetaProduGenerico!=null && jComboBoxid_periodoPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_periodoPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPedidoProduForeignKey(Long idPedidoProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			PedidoProdu  pedidoproduTemp=null;

			for(PedidoProdu pedidoproduAux:pedidoprodusForeignKey) {
				if(pedidoproduAux.getId()!=null && pedidoproduAux.getId().equals(idPedidoProduSeleccionado)) {
					pedidoproduTemp=pedidoproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(pedidoproduTemp!=null) {

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setPedidoProdu(pedidoproduTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setSelectedItem(pedidoproduTemp);
					}
				} else {
					//jComboBoxid_pedido_produPedidoDetaProdu.setSelectedItem(pedidoproduTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPedidoProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(pedidoproduTemp!=null && jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu!=null) {
						jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setSelectedItem(pedidoproduTemp);
					} else {
						if(jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu!=null) {
							//jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setSelectedItem(pedidoproduTemp);
							if(jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.getItemCount()>0) {
								jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setSelectedIndex(0);
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

	public String getActualPedidoProduForeignKeyDescripcion(Long idPedidoProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			PedidoProdu  pedidoproduTemp=null;

			for(PedidoProdu pedidoproduAux:pedidoprodusForeignKey) {
				if(pedidoproduAux.getId()!=null && pedidoproduAux.getId().equals(idPedidoProduSeleccionado)) {
					pedidoproduTemp=pedidoproduAux;
					break;
				}
			}


			sDescripcion=PedidoProduConstantesFunciones.getPedidoProduDescripcion(pedidoproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPedidoProduForeignKeyGenerico(Long idPedidoProduSeleccionado,JComboBox jComboBoxid_pedido_produPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			PedidoProdu  pedidoproduTemp=null;

			for(PedidoProdu pedidoproduAux:pedidoprodusForeignKey) {
				if(pedidoproduAux.getId()!=null && pedidoproduAux.getId().equals(idPedidoProduSeleccionado)) {
					pedidoproduTemp=pedidoproduAux;
					break;
				}
			}

			if(pedidoproduTemp!=null) {
				jComboBoxid_pedido_produPedidoDetaProduGenerico.setSelectedItem(pedidoproduTemp);
			} else {
				if(jComboBoxid_pedido_produPedidoDetaProduGenerico!=null && jComboBoxid_pedido_produPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_pedido_produPedidoDetaProduGenerico.setSelectedIndex(0);
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

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaPedidoDetaProdu.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu!=null) {
						jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu!=null) {
							//jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaPedidoDetaProduGenerico)throws Exception
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
				jComboBoxid_bodegaPedidoDetaProduGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaPedidoDetaProduGenerico!=null && jComboBoxid_bodegaPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_bodegaPedidoDetaProduGenerico.setSelectedIndex(0);
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

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoPedidoDetaProdu.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoPedidoDetaProdu!=null) {
						jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoPedidoDetaProdu!=null) {
							//jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoPedidoDetaProdu.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoPedidoDetaProduGenerico)throws Exception
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
				jComboBoxid_productoPedidoDetaProduGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoPedidoDetaProduGenerico!=null && jComboBoxid_productoPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_productoPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadPedidoDetaProdu.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu!=null) {
						jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu!=null) {
							//jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setSelectedIndex(0);
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

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadPedidoDetaProduGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadPedidoDetaProduGenerico!=null && jComboBoxid_unidadPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_unidadPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaDestinoForeignKey(Long idBodegaDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegadestinoTemp=null;

			for(Bodega bodegadestinoAux:bodegadestinosForeignKey) {
				if(bodegadestinoAux.getId()!=null && bodegadestinoAux.getId().equals(idBodegaDestinoSeleccionado)) {
					bodegadestinoTemp=bodegadestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegadestinoTemp!=null) {

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setBodegaDestino(bodegadestinoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setSelectedItem(bodegadestinoTemp);
					}
				} else {
					//jComboBoxid_bodega_destinoPedidoDetaProdu.setSelectedItem(bodegadestinoTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodegaDestino") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegadestinoTemp!=null && jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu!=null) {
						jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setSelectedItem(bodegadestinoTemp);
					} else {
						if(jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu!=null) {
							//jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setSelectedItem(bodegadestinoTemp);
							if(jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.getItemCount()>0) {
								jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setSelectedIndex(0);
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

	public String getActualBodegaDestinoForeignKeyDescripcion(Long idBodegaDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegadestinoTemp=null;

			for(Bodega bodegadestinoAux:bodegadestinosForeignKey) {
				if(bodegadestinoAux.getId()!=null && bodegadestinoAux.getId().equals(idBodegaDestinoSeleccionado)) {
					bodegadestinoTemp=bodegadestinoAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegadestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaDestinoForeignKeyGenerico(Long idBodegaDestinoSeleccionado,JComboBox jComboBoxid_bodega_destinoPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegadestinoTemp=null;

			for(Bodega bodegadestinoAux:bodegadestinosForeignKey) {
				if(bodegadestinoAux.getId()!=null && bodegadestinoAux.getId().equals(idBodegaDestinoSeleccionado)) {
					bodegadestinoTemp=bodegadestinoAux;
					break;
				}
			}

			if(bodegadestinoTemp!=null) {
				jComboBoxid_bodega_destinoPedidoDetaProduGenerico.setSelectedItem(bodegadestinoTemp);
			} else {
				if(jComboBoxid_bodega_destinoPedidoDetaProduGenerico!=null && jComboBoxid_bodega_destinoPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_bodega_destinoPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProcesoProduForeignKey(Long idTipoProcesoProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProcesoProdu  tipoprocesoproduTemp=null;

			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusForeignKey) {
				if(tipoprocesoproduAux.getId()!=null && tipoprocesoproduAux.getId().equals(idTipoProcesoProduSeleccionado)) {
					tipoprocesoproduTemp=tipoprocesoproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprocesoproduTemp!=null) {

					if(this.pedidodetaprodu!=null) {
						this.pedidodetaprodu.setTipoProcesoProdu(tipoprocesoproduTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setSelectedItem(tipoprocesoproduTemp);
					}
				} else {
					//jComboBoxid_tipo_proceso_produPedidoDetaProdu.setSelectedItem(tipoprocesoproduTemp);
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprocesoproduTemp!=null && jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu!=null) {
						jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setSelectedItem(tipoprocesoproduTemp);
					} else {
						if(jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu!=null) {
							//jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setSelectedItem(tipoprocesoproduTemp);
							if(jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.getItemCount()>0) {
								jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setSelectedIndex(0);
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

	public String getActualTipoProcesoProduForeignKeyDescripcion(Long idTipoProcesoProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProcesoProdu  tipoprocesoproduTemp=null;

			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusForeignKey) {
				if(tipoprocesoproduAux.getId()!=null && tipoprocesoproduAux.getId().equals(idTipoProcesoProduSeleccionado)) {
					tipoprocesoproduTemp=tipoprocesoproduAux;
					break;
				}
			}


			sDescripcion=TipoProcesoProduConstantesFunciones.getTipoProcesoProduDescripcion(tipoprocesoproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProcesoProduForeignKeyGenerico(Long idTipoProcesoProduSeleccionado,JComboBox jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			TipoProcesoProdu  tipoprocesoproduTemp=null;

			for(TipoProcesoProdu tipoprocesoproduAux:tipoprocesoprodusForeignKey) {
				if(tipoprocesoproduAux.getId()!=null && tipoprocesoproduAux.getId().equals(idTipoProcesoProduSeleccionado)) {
					tipoprocesoproduTemp=tipoprocesoproduAux;
					break;
				}
			}

			if(tipoprocesoproduTemp!=null) {
				jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico.setSelectedItem(tipoprocesoproduTemp);
			} else {
				if(jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico!=null && jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_empresaPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPedidoDetaProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPedidoDetaProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pedidodetaprodu.setid_empresa(empresaAux.getId());
				pedidodetaprodu.setempresa_descripcion(PedidoDetaProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pedidodetaprodu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_sucursalPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPedidoDetaProduGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPedidoDetaProduGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				pedidodetaprodu.setid_sucursal(sucursalAux.getId());
				pedidodetaprodu.setsucursal_descripcion(PedidoDetaProduConstantesFunciones.getSucursalDescripcion(sucursalAux));
				pedidodetaprodu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_ejercicioPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPedidoDetaProduGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPedidoDetaProduGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				pedidodetaprodu.setid_ejercicio(ejercicioAux.getId());
				pedidodetaprodu.setejercicio_descripcion(PedidoDetaProduConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				pedidodetaprodu.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_periodoPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPedidoDetaProduGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPedidoDetaProduGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				pedidodetaprodu.setid_periodo(periodoAux.getId());
				pedidodetaprodu.setperiodo_descripcion(PedidoDetaProduConstantesFunciones.getPeriodoDescripcion(periodoAux));
				pedidodetaprodu.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPedidoProduForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_pedido_produPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			PedidoProdu  pedidoproduAux=new PedidoProdu();

			if(jComboBoxid_pedido_produPedidoDetaProduGenerico==null) {
				pedidoproduAux=(PedidoProdu)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.getSelectedItem();
			} else {
				pedidoproduAux=(PedidoProdu)jComboBoxid_pedido_produPedidoDetaProduGenerico.getSelectedItem();
			}

			if(pedidoproduAux!=null && pedidoproduAux.getId()!=null) {
				pedidodetaprodu.setid_pedido_produ(pedidoproduAux.getId());
				pedidodetaprodu.setpedidoprodu_descripcion(PedidoDetaProduConstantesFunciones.getPedidoProduDescripcion(pedidoproduAux));
				pedidodetaprodu.setPedidoProdu(pedidoproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_bodegaPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaPedidoDetaProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaPedidoDetaProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				pedidodetaprodu.setid_bodega(bodegaAux.getId());
				pedidodetaprodu.setbodega_descripcion(PedidoDetaProduConstantesFunciones.getBodegaDescripcion(bodegaAux));
				pedidodetaprodu.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_productoPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoPedidoDetaProduGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoPedidoDetaProduGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				pedidodetaprodu.setid_producto(productoAux.getId());
				pedidodetaprodu.setproducto_descripcion(PedidoDetaProduConstantesFunciones.getProductoDescripcion(productoAux));
				pedidodetaprodu.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_unidadPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadPedidoDetaProduGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadPedidoDetaProduGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				pedidodetaprodu.setid_unidad(unidadAux.getId());
				pedidodetaprodu.setunidad_descripcion(PedidoDetaProduConstantesFunciones.getUnidadDescripcion(unidadAux));
				pedidodetaprodu.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaDestinoForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_bodega_destinoPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodega_destinoPedidoDetaProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodega_destinoPedidoDetaProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				pedidodetaprodu.setid_bodega_destino(bodegaAux.getId());
				pedidodetaprodu.setbodegadestino_descripcion(PedidoDetaProduConstantesFunciones.getBodegaDestinoDescripcion(bodegaAux));
				pedidodetaprodu.setBodegaDestino(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProcesoProduForeignKey(PedidoDetaProdu pedidodetaprodu,JComboBox jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico)throws Exception
	{
		try
		{
			TipoProcesoProdu  tipoprocesoproduAux=new TipoProcesoProdu();

			if(jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico==null) {
				tipoprocesoproduAux=(TipoProcesoProdu)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.getSelectedItem();
			} else {
				tipoprocesoproduAux=(TipoProcesoProdu)jComboBoxid_tipo_proceso_produPedidoDetaProduGenerico.getSelectedItem();
			}

			if(tipoprocesoproduAux!=null && tipoprocesoproduAux.getId()!=null) {
				pedidodetaprodu.setid_tipo_proceso_produ(tipoprocesoproduAux.getId());
				pedidodetaprodu.settipoprocesoprodu_descripcion(PedidoDetaProduConstantesFunciones.getTipoProcesoProduDescripcion(tipoprocesoproduAux));
				pedidodetaprodu.setTipoProcesoProdu(tipoprocesoproduAux);			}
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

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePedidoProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPedidoProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.removeAllItems();

							for(PedidoProdu pedidoprodu:this.pedidoprodusForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.addItem(pedidoprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPedidoProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.removeAllItems();

							for(PedidoProdu pedidoprodu:this.pedidoprodusForeignKey) {
								this.jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.addItem(pedidoprodu);
							}
						}

						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.addItem(bodega);
							}
						}

						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.addItem(producto);
							}
						}

						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.addItem(unidad);
							}
						}

						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegaDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.removeAllItems();

							for(Bodega bodegadestino:this.bodegadestinosForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.addItem(bodegadestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodegaDestino") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.removeAllItems();

							for(Bodega bodegadestino:this.bodegadestinosForeignKey) {
								this.jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.addItem(bodegadestino);
							}
						}

						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProcesoProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProcesoProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.removeAllItems();

							for(TipoProcesoProdu tipoprocesoprodu:this.tipoprocesoprodusForeignKey) {
								this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.addItem(tipoprocesoprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { 
					}

					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoProcesoProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.removeAllItems();

							for(TipoProcesoProdu tipoprocesoprodu:this.tipoprocesoprodusForeignKey) {
								this.jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.addItem(tipoprocesoprodu);
							}
						}

						if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePedidoProduForeignKey(PedidoProdu pedidoprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setSelectedItem(pedidoprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setSelectedItem(pedidoprodu);
						} else {
							this.jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaDestinoForeignKey(Bodega bodegadestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setSelectedItem(bodegadestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setSelectedItem(bodegadestino);
						} else {
							this.jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProcesoProduForeignKey(TipoProcesoProdu tipoprocesoprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setSelectedItem(tipoprocesoprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setSelectedItem(tipoprocesoprodu);
						} else {
							this.jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPedidoDetaProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PedidoDetaProduConstantesFunciones.refrescarForeignKeysDescripcionesPedidoDetaProdu(this.pedidodetaproduLogic.getPedidoDetaProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PedidoDetaProduConstantesFunciones.refrescarForeignKeysDescripcionesPedidoDetaProdu(this.pedidodetaprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(PedidoProdu.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
		classes.add(new Classe(TipoProcesoProdu.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//pedidodetaproduLogic.setPedidoDetaProdus(this.pedidodetaprodus);
			pedidodetaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PedidoDetaProduParameterReturnGeneral getPedidoDetaProduParameterGeneral() {
		return this.pedidodetaproduParameterGeneral;
	}
	
	public void setPedidoDetaProduParameterGeneral(PedidoDetaProduParameterReturnGeneral pedidodetaproduParameterGeneral) {
		this.pedidodetaproduParameterGeneral = pedidodetaproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPedidoDetaProdu() {
		return isPermisoTodoPedidoDetaProdu;
	}

	public void setIsPermisoTodoPedidoDetaProdu(Boolean isPermisoTodoPedidoDetaProdu) {
		this.isPermisoTodoPedidoDetaProdu = isPermisoTodoPedidoDetaProdu;
	}

	public Boolean getIsPermisoNuevoPedidoDetaProdu() {
		return isPermisoNuevoPedidoDetaProdu;
	}

	public void setIsPermisoNuevoPedidoDetaProdu(Boolean isPermisoNuevoPedidoDetaProdu) {
		this.isPermisoNuevoPedidoDetaProdu = isPermisoNuevoPedidoDetaProdu;
	}

	public Boolean getIsPermisoActualizarPedidoDetaProdu() {
		return isPermisoActualizarPedidoDetaProdu;
	}

	public void setIsPermisoActualizarPedidoDetaProdu(Boolean isPermisoActualizarPedidoDetaProdu) {
		this.isPermisoActualizarPedidoDetaProdu = isPermisoActualizarPedidoDetaProdu;
	}

	public Boolean getIsPermisoEliminarPedidoDetaProdu() {
		return isPermisoEliminarPedidoDetaProdu;
	}

	public void setIsPermisoEliminarPedidoDetaProdu(Boolean isPermisoEliminarPedidoDetaProdu) {
		this.isPermisoEliminarPedidoDetaProdu = isPermisoEliminarPedidoDetaProdu;
	}

	public Boolean getIsPermisoGuardarCambiosPedidoDetaProdu() {
		return isPermisoGuardarCambiosPedidoDetaProdu;
	}

	public void setIsPermisoGuardarCambiosPedidoDetaProdu(Boolean isPermisoGuardarCambiosPedidoDetaProdu) {
		this.isPermisoGuardarCambiosPedidoDetaProdu = isPermisoGuardarCambiosPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoConsultaPedidoDetaProdu() {
		return isPermisoConsultaPedidoDetaProdu;
	}

	public void setIsPermisoConsultaPedidoDetaProdu(Boolean isPermisoConsultaPedidoDetaProdu) {
		this.isPermisoConsultaPedidoDetaProdu = isPermisoConsultaPedidoDetaProdu;
	}

	public Boolean getIsPermisoBusquedaPedidoDetaProdu() {
		return isPermisoBusquedaPedidoDetaProdu;
	}

	public void setIsPermisoBusquedaPedidoDetaProdu(Boolean isPermisoBusquedaPedidoDetaProdu) {
		this.isPermisoBusquedaPedidoDetaProdu = isPermisoBusquedaPedidoDetaProdu;
	}

	public Boolean getIsPermisoReportePedidoDetaProdu() {
		return isPermisoReportePedidoDetaProdu;
	}

	public void setIsPermisoReportePedidoDetaProdu(Boolean isPermisoReportePedidoDetaProdu) {
		this.isPermisoReportePedidoDetaProdu = isPermisoReportePedidoDetaProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioPedidoDetaProdu() {
		return isPermisoPaginacionMedioPedidoDetaProdu;
	}

	public void setIsPermisoPaginacionMedioPedidoDetaProdu(Boolean isPermisoPaginacionMedioPedidoDetaProdu) {
		this.isPermisoPaginacionMedioPedidoDetaProdu = isPermisoPaginacionMedioPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoPedidoDetaProdu() {
		return isPermisoPaginacionTodoPedidoDetaProdu;
	}

	public void setIsPermisoPaginacionTodoPedidoDetaProdu(Boolean isPermisoPaginacionTodoPedidoDetaProdu) {
		this.isPermisoPaginacionTodoPedidoDetaProdu = isPermisoPaginacionTodoPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoPedidoDetaProdu() {
		return isPermisoPaginacionAltoPedidoDetaProdu;
	}

	public void setIsPermisoPaginacionAltoPedidoDetaProdu(Boolean isPermisoPaginacionAltoPedidoDetaProdu) {
		this.isPermisoPaginacionAltoPedidoDetaProdu = isPermisoPaginacionAltoPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoCopiarPedidoDetaProdu() {
		return isPermisoCopiarPedidoDetaProdu;
	}

	public void setIsPermisoCopiarPedidoDetaProdu(Boolean isPermisoCopiarPedidoDetaProdu) {
		this.isPermisoCopiarPedidoDetaProdu = isPermisoCopiarPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoVerFormPedidoDetaProdu() {
		return isPermisoVerFormPedidoDetaProdu;
	}

	public void setIsPermisoVerFormPedidoDetaProdu(Boolean isPermisoVerFormPedidoDetaProdu) {
		this.isPermisoVerFormPedidoDetaProdu = isPermisoVerFormPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoDuplicarPedidoDetaProdu() {
		return isPermisoDuplicarPedidoDetaProdu;
	}

	public void setIsPermisoDuplicarPedidoDetaProdu(Boolean isPermisoDuplicarPedidoDetaProdu) {
		this.isPermisoDuplicarPedidoDetaProdu = isPermisoDuplicarPedidoDetaProdu;
	}
	
	public Boolean getIsPermisoOrdenPedidoDetaProdu() {
		return isPermisoOrdenPedidoDetaProdu;
	}

	public void setIsPermisoOrdenPedidoDetaProdu(Boolean isPermisoOrdenPedidoDetaProdu) {
		this.isPermisoOrdenPedidoDetaProdu = isPermisoOrdenPedidoDetaProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPedidoDetaProdu() {
		return isVisibilidadCeldaNuevoPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaNuevoPedidoDetaProdu(Boolean isVisibilidadCeldaNuevoPedidoDetaProdu) {
		this.isVisibilidadCeldaNuevoPedidoDetaProdu = isVisibilidadCeldaNuevoPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPedidoDetaProdu() {
		return isVisibilidadCeldaDuplicarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaDuplicarPedidoDetaProdu(Boolean isVisibilidadCeldaDuplicarPedidoDetaProdu) {
		this.isVisibilidadCeldaDuplicarPedidoDetaProdu = isVisibilidadCeldaDuplicarPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPedidoDetaProdu() {
		return isVisibilidadCeldaCopiarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaCopiarPedidoDetaProdu(Boolean isVisibilidadCeldaCopiarPedidoDetaProdu) {
		this.isVisibilidadCeldaCopiarPedidoDetaProdu = isVisibilidadCeldaCopiarPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPedidoDetaProdu() {
		return isVisibilidadCeldaVerFormPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaVerFormPedidoDetaProdu(Boolean isVisibilidadCeldaVerFormPedidoDetaProdu) {
		this.isVisibilidadCeldaVerFormPedidoDetaProdu = isVisibilidadCeldaVerFormPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPedidoDetaProdu() {
		return isVisibilidadCeldaOrdenPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaOrdenPedidoDetaProdu(Boolean isVisibilidadCeldaOrdenPedidoDetaProdu) {
		this.isVisibilidadCeldaOrdenPedidoDetaProdu = isVisibilidadCeldaOrdenPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPedidoDetaProdu() {
		return isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPedidoDetaProdu(Boolean isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu) {
		this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu = isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPedidoDetaProdu() {
		return isVisibilidadCeldaModificarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaModificarPedidoDetaProdu(Boolean isVisibilidadCeldaModificarPedidoDetaProdu) {
		this.isVisibilidadCeldaModificarPedidoDetaProdu = isVisibilidadCeldaModificarPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPedidoDetaProdu() {
		return isVisibilidadCeldaActualizarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaActualizarPedidoDetaProdu(Boolean isVisibilidadCeldaActualizarPedidoDetaProdu) {
		this.isVisibilidadCeldaActualizarPedidoDetaProdu = isVisibilidadCeldaActualizarPedidoDetaProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarPedidoDetaProdu() {
		return isVisibilidadCeldaEliminarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaEliminarPedidoDetaProdu(Boolean isVisibilidadCeldaEliminarPedidoDetaProdu) {
		this.isVisibilidadCeldaEliminarPedidoDetaProdu = isVisibilidadCeldaEliminarPedidoDetaProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarPedidoDetaProdu() {
		return isVisibilidadCeldaCancelarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaCancelarPedidoDetaProdu(Boolean isVisibilidadCeldaCancelarPedidoDetaProdu) {
		this.isVisibilidadCeldaCancelarPedidoDetaProdu = isVisibilidadCeldaCancelarPedidoDetaProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarPedidoDetaProdu() {
		return isVisibilidadCeldaGuardarPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaGuardarPedidoDetaProdu(Boolean isVisibilidadCeldaGuardarPedidoDetaProdu) {
		this.isVisibilidadCeldaGuardarPedidoDetaProdu = isVisibilidadCeldaGuardarPedidoDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPedidoDetaProdu() {
		return isVisibilidadCeldaGuardarCambiosPedidoDetaProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPedidoDetaProdu(Boolean isVisibilidadCeldaGuardarCambiosPedidoDetaProdu) {
		this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu = isVisibilidadCeldaGuardarCambiosPedidoDetaProdu;
	}
		
	public PedidoDetaProduSessionBean getpedidodetaproduSessionBean() {
		return this.pedidodetaproduSessionBean;
	}
	
	public void setpedidodetaproduSessionBean(PedidoDetaProduSessionBean pedidodetaproduSessionBean) {
		this.pedidodetaproduSessionBean=pedidodetaproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdBodegaDestino() {
		return this.isVisibilidadFK_IdBodegaDestino;
	}

	public void setisVisibilidadFK_IdBodegaDestino(Boolean isVisibilidadFK_IdBodegaDestino) {
		this.isVisibilidadFK_IdBodegaDestino=isVisibilidadFK_IdBodegaDestino;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPedidoProdu() {
		return this.isVisibilidadFK_IdPedidoProdu;
	}

	public void setisVisibilidadFK_IdPedidoProdu(Boolean isVisibilidadFK_IdPedidoProdu) {
		this.isVisibilidadFK_IdPedidoProdu=isVisibilidadFK_IdPedidoProdu;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
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

	public Boolean getisVisibilidadFK_IdTipoProcesoProdu() {
		return this.isVisibilidadFK_IdTipoProcesoProdu;
	}

	public void setisVisibilidadFK_IdTipoProcesoProdu(Boolean isVisibilidadFK_IdTipoProcesoProdu) {
		this.isVisibilidadFK_IdTipoProcesoProdu=isVisibilidadFK_IdTipoProcesoProdu;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarSucursalForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarEjercicioForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarPeriodoForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarPedidoProduForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarBodegaForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarProductoForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarUnidadForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarBodegaDestinoForeignKey(pedidodetaprodu,null);
				this.setActualParaGuardarTipoProcesoProduForeignKey(pedidodetaprodu,null);
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
	
	public void bugActualizarReferenciaActual(PedidoDetaProdu pedidodetaprodu,PedidoDetaProdu pedidodetaproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPedidoDetaProdu(pedidodetaprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pedidodetaproduAux.setId(pedidodetaprodu.getId());
		pedidodetaproduAux.setVersionRow(pedidodetaprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPedidoDetaProdu();
		
			int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = pedidodetaproduValidator.getInvalidValues(this.pedidodetaprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			pedidodetaproduLogic.setDatosCliente(datosCliente);
			pedidodetaproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				pedidodetaproduAux=new  PedidoDetaProdu();
				
				pedidodetaproduAux.setIsNew(true);
				pedidodetaproduAux.setIsChanged(true);
				
				pedidodetaproduAux.setPedidoDetaProduOriginal(this.pedidodetaprodu);
				
				pedidodetaproduAux.setId(this.pedidodetaprodu.getId());	
				pedidodetaproduAux.setVersionRow(this.pedidodetaprodu.getVersionRow());	
				pedidodetaproduAux.setid_empresa(this.pedidodetaprodu.getid_empresa());	
				pedidodetaproduAux.setid_sucursal(this.pedidodetaprodu.getid_sucursal());	
				pedidodetaproduAux.setid_ejercicio(this.pedidodetaprodu.getid_ejercicio());	
				pedidodetaproduAux.setid_periodo(this.pedidodetaprodu.getid_periodo());	
				pedidodetaproduAux.setid_pedido_produ(this.pedidodetaprodu.getid_pedido_produ());	
				pedidodetaproduAux.setid_bodega(this.pedidodetaprodu.getid_bodega());	
				pedidodetaproduAux.setid_producto(this.pedidodetaprodu.getid_producto());	
				pedidodetaproduAux.setid_unidad(this.pedidodetaprodu.getid_unidad());	
				pedidodetaproduAux.setid_bodega_destino(this.pedidodetaprodu.getid_bodega_destino());	
				pedidodetaproduAux.setid_tipo_proceso_produ(this.pedidodetaprodu.getid_tipo_proceso_produ());	
				pedidodetaproduAux.setcantidad(this.pedidodetaprodu.getcantidad());	
				pedidodetaproduAux.setcantidad_pendiente(this.pedidodetaprodu.getcantidad_pendiente());	
				pedidodetaproduAux.setdescripcion(this.pedidodetaprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(pedidodetaproduAux,pedidodetaproduLogic.getPedidoDetaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidodetaproduAux,pedidodetaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.savePedidoDetaProdus();//WithConnection
						//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pedidodetaprodu,pedidodetaproduAux);
					
					this.refrescarForeignKeysDescripcionesPedidoDetaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								pedidodetaproduLogic.savePedidoDetaProduRelaciones(pedidodetaproduAux);//WithConnection
								//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.pedidodetaprodu,pedidodetaproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(pedidodetaproduAux,pedidodetaproduLogic.getPedidoDetaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(pedidodetaproduAux,pedidodetaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.pedidodetaprodu,pedidodetaproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				pedidodetaproduAux=new  PedidoDetaProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado() 
					|| (this.pedidodetaproduSessionBean.getEsGuardarRelacionado() && this.pedidodetaprodu.getId()>=0)) {
						
					pedidodetaproduAux.setIsNew(false);
				}
				
				pedidodetaproduAux.setIsDeleted(false);
			
				pedidodetaproduAux.setId(this.pedidodetaprodu.getId());	
				pedidodetaproduAux.setVersionRow(this.pedidodetaprodu.getVersionRow());	
				pedidodetaproduAux.setid_empresa(this.pedidodetaprodu.getid_empresa());	
				pedidodetaproduAux.setid_sucursal(this.pedidodetaprodu.getid_sucursal());	
				pedidodetaproduAux.setid_ejercicio(this.pedidodetaprodu.getid_ejercicio());	
				pedidodetaproduAux.setid_periodo(this.pedidodetaprodu.getid_periodo());	
				pedidodetaproduAux.setid_pedido_produ(this.pedidodetaprodu.getid_pedido_produ());	
				pedidodetaproduAux.setid_bodega(this.pedidodetaprodu.getid_bodega());	
				pedidodetaproduAux.setid_producto(this.pedidodetaprodu.getid_producto());	
				pedidodetaproduAux.setid_unidad(this.pedidodetaprodu.getid_unidad());	
				pedidodetaproduAux.setid_bodega_destino(this.pedidodetaprodu.getid_bodega_destino());	
				pedidodetaproduAux.setid_tipo_proceso_produ(this.pedidodetaprodu.getid_tipo_proceso_produ());	
				pedidodetaproduAux.setcantidad(this.pedidodetaprodu.getcantidad());	
				pedidodetaproduAux.setcantidad_pendiente(this.pedidodetaprodu.getcantidad_pendiente());	
				pedidodetaproduAux.setdescripcion(this.pedidodetaprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pedidodetaproduAux,pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidodetaproduAux,pedidodetaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.savePedidoDetaProdus();//WithConnection
						//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pedidodetaprodu,pedidodetaproduAux);
					
					this.refrescarForeignKeysDescripcionesPedidoDetaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								pedidodetaproduLogic.savePedidoDetaProduRelaciones(pedidodetaproduAux);//WithConnection
								//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.pedidodetaprodu,pedidodetaproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(pedidodetaproduAux,pedidodetaproduLogic.getPedidoDetaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(pedidodetaproduAux,pedidodetaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.pedidodetaprodu,pedidodetaproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				pedidodetaproduAux=new  PedidoDetaProdu();
				
				pedidodetaproduAux.setIsNew(false);
				pedidodetaproduAux.setIsChanged(false);
				
				pedidodetaproduAux.setIsDeleted(true);
				
				pedidodetaproduAux.setId(this.pedidodetaprodu.getId());	
				pedidodetaproduAux.setVersionRow(this.pedidodetaprodu.getVersionRow());	
				pedidodetaproduAux.setid_empresa(this.pedidodetaprodu.getid_empresa());	
				pedidodetaproduAux.setid_sucursal(this.pedidodetaprodu.getid_sucursal());	
				pedidodetaproduAux.setid_ejercicio(this.pedidodetaprodu.getid_ejercicio());	
				pedidodetaproduAux.setid_periodo(this.pedidodetaprodu.getid_periodo());	
				pedidodetaproduAux.setid_pedido_produ(this.pedidodetaprodu.getid_pedido_produ());	
				pedidodetaproduAux.setid_bodega(this.pedidodetaprodu.getid_bodega());	
				pedidodetaproduAux.setid_producto(this.pedidodetaprodu.getid_producto());	
				pedidodetaproduAux.setid_unidad(this.pedidodetaprodu.getid_unidad());	
				pedidodetaproduAux.setid_bodega_destino(this.pedidodetaprodu.getid_bodega_destino());	
				pedidodetaproduAux.setid_tipo_proceso_produ(this.pedidodetaprodu.getid_tipo_proceso_produ());	
				pedidodetaproduAux.setcantidad(this.pedidodetaprodu.getcantidad());	
				pedidodetaproduAux.setcantidad_pendiente(this.pedidodetaprodu.getcantidad_pendiente());	
				pedidodetaproduAux.setdescripcion(this.pedidodetaprodu.getdescripcion());	
				
				if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.pedidodetaproduAux.getId()>=0) {	
						this.pedidodetaprodusEliminados.add(pedidodetaproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(pedidodetaproduAux,pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidodetaproduAux,pedidodetaprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.savePedidoDetaProdus();//WithConnection
						//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								pedidodetaproduLogic.savePedidoDetaProduRelaciones(pedidodetaproduAux);//WithConnection
								//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(pedidodetaproduAux,pedidodetaproduLogic.getPedidoDetaProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(pedidodetaproduAux,pedidodetaprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getPedidoDetaProdus().addAll(this.pedidodetaprodusEliminados);
					
					pedidodetaproduLogic.savePedidoDetaProdus();//WithConnection
					//pedidodetaproduLogic.getSetVersionRowPedidoDetaProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPedidoDetaProdu();
				
				this.pedidodetaprodusEliminados= new ArrayList<PedidoDetaProdu>();		
			}
			
			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pedido Detalle Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.pedidodetaprodu=pedidodetaproduAux;
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
      		//this.finishProcessPedidoDetaProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(PedidoDetaProdu pedidodetaproduLocal) throws Exception {
		
		if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PedidoDetaProdu pedidodetaproduLocal) throws Exception {	
		if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pedidodetaproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				pedidodetaproduLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				pedidodetaproduLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				pedidodetaproduLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PedidoProduDetalleFormJInternalFrame.class)) {
				PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrameLocal=(PedidoProduBeanSwingJInternalFrame) ((PedidoProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				pedidoproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPedidoProdu(pedidoproduBeanSwingJInternalFrameLocal.getpedidoprodu(),true);
				pedidoproduBeanSwingJInternalFrameLocal.actualizarLista(pedidoproduBeanSwingJInternalFrameLocal.pedidoprodu,this.pedidoprodusForeignKey);

				pedidoproduBeanSwingJInternalFrameLocal.actualizarRelaciones(pedidoproduBeanSwingJInternalFrameLocal.pedidoprodu);

				pedidodetaproduLocal.setPedidoProdu(pedidoproduBeanSwingJInternalFrameLocal.pedidoprodu);

				this.addItemDefectoCombosForeignKeyPedidoProdu();
				this.cargarCombosFramePedidoProdusForeignKey("Formulario");
				this.setActualPedidoProduForeignKey(pedidoproduBeanSwingJInternalFrameLocal.pedidoprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				pedidodetaproduLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				pedidodetaproduLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				pedidodetaproduLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegadestinoBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegadestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegadestinoBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegadestinoBeanSwingJInternalFrameLocal.actualizarLista(bodegadestinoBeanSwingJInternalFrameLocal.bodega,this.bodegadestinosForeignKey);

				bodegadestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegadestinoBeanSwingJInternalFrameLocal.bodega);

				pedidodetaproduLocal.setBodegaDestino(bodegadestinoBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodegaDestino();
				this.cargarCombosFrameBodegaDestinosForeignKey("Formulario");
				this.setActualBodegaDestinoForeignKey(bodegadestinoBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProcesoProduDetalleFormJInternalFrame.class)) {
				TipoProcesoProduBeanSwingJInternalFrame tipoprocesoproduBeanSwingJInternalFrameLocal=(TipoProcesoProduBeanSwingJInternalFrame) ((TipoProcesoProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprocesoproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProcesoProdu(tipoprocesoproduBeanSwingJInternalFrameLocal.gettipoprocesoprodu(),true);
				tipoprocesoproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprocesoproduBeanSwingJInternalFrameLocal.tipoprocesoprodu,this.tipoprocesoprodusForeignKey);

				tipoprocesoproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprocesoproduBeanSwingJInternalFrameLocal.tipoprocesoprodu);

				pedidodetaproduLocal.setTipoProcesoProdu(tipoprocesoproduBeanSwingJInternalFrameLocal.tipoprocesoprodu);

				this.addItemDefectoCombosForeignKeyTipoProcesoProdu();
				this.cargarCombosFrameTipoProcesoProdusForeignKey("Formulario");
				this.setActualTipoProcesoProduForeignKey(tipoprocesoproduBeanSwingJInternalFrameLocal.tipoprocesoprodu.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPedidoDetaProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pedidodetaproduValidator.getInvalidValues(this.pedidodetaprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PedidoDetaProdu pedidodetaprodu,List<PedidoDetaProdu> pedidodetaprodus) throws Exception {
		try	{		
			PedidoDetaProduConstantesFunciones.actualizarLista(pedidodetaprodu,pedidodetaprodus,this.pedidodetaproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PedidoDetaProdu pedidodetaprodu,List<PedidoDetaProdu> pedidodetaprodus) throws Exception {
		try	{			
			PedidoDetaProduConstantesFunciones.actualizarSelectedLista(pedidodetaprodu,pedidodetaprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PedidoDetaProdu> pedidodetaprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pedidodetaprodusLocal=this.pedidodetaproduLogic.getPedidoDetaProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pedidodetaprodusLocal=this.pedidodetaprodus;
			}
			//ARCHITECTURE
		
			for(PedidoDetaProdu pedidodetaproduLocal:pedidodetaprodusLocal) {
				if(this.permiteMantenimiento(pedidodetaproduLocal) && pedidodetaproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PedidoDetaProduConstantesFunciones.getPedidoDetaProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_empresaPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_sucursalPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_ejercicioPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_periodoPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDPEDIDOPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_pedido_produPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_bodegaPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_productoPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_unidadPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDBODEGADESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_bodega_destinoPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.IDTIPOPROCESOPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_tipo_proceso_produPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelcantidadPedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.CANTIDADPENDIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelcantidad_pendientePedidoDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoDetaProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabeldescripcionPedidoDetaProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_empresaPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_sucursalPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_ejercicioPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_periodoPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_pedido_produPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_bodegaPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_productoPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_unidadPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_bodega_destinoPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelid_tipo_proceso_produPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelcantidadPedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelcantidad_pendientePedidoDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabeldescripcionPedidoDetaProdu,"");
		
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
		this.iIdNuevoPedidoDetaProdu--;	
		
		
		this.pedidodetaproduAux=new PedidoDetaProdu();
		
		this.pedidodetaproduAux.setId(this.iIdNuevoPedidoDetaProdu);
		this.pedidodetaproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidodetaproduLogic.getPedidoDetaProdus().add(this.pedidodetaproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pedidodetaprodus.add(this.pedidodetaproduAux);
		}
		//ARCHITECTURE
		
		this.pedidodetaprodu=this.pedidodetaproduAux;
		
		if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyPedidoDetaProdu(this.pedidodetaprodu);
		}
				
		//this.setDefaultControlesPedidoDetaProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPedidoDetaProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPedidoDetaProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidoDetaProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidoDetaProdu(this.pedidodetaproduBean,this.pedidodetaprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PedidoDetaProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
			classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.pedidodetaproduReturnGeneral=pedidodetaproduLogic.procesarEventosPedidoDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidodetaproduLogic.getPedidoDetaProdus(),this.pedidodetaprodu,this.pedidodetaproduParameterGeneral,this.isEsNuevoPedidoDetaProdu,classes);//this.pedidodetaproduLogic.getPedidoDetaProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPedidoDetaProdu(this.pedidodetaproduReturnGeneral,this.pedidodetaproduBean,false);
		
		if(this.pedidodetaproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu());
		}
		
		if(this.pedidodetaproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu(),classes);//this.pedidodetaproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPedidoDetaProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPedidoDetaProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.RecargarFormPedidoDetaProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPedidoDetaProdu(false);
						
			if(pedidodetaproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidoDetaProdu();
			}
			
			this.actualizarVisualTableDatosPedidoDetaProdu();
			
			this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoDetaProdu(), this.getIndiceNuevoPedidoDetaProdu());
			
			this.seleccionarFilaTablaPedidoDetaProduActual();
						
			this.actualizarEstadoCeldasBotonesPedidoDetaProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPedidoDetaProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarcantidadPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarcantidad_pendientePedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activardescripcionPedidoDetaProdu);	
		//
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_empresaPedidoDetaProdu);//
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_sucursalPedidoDetaProdu);//
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_ejercicioPedidoDetaProdu);//
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_periodoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_pedido_produPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_bodegaPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_productoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_unidadPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_bodega_destinoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setEnabled(isHabilitar && this.pedidodetaproduConstantesFunciones.activarid_tipo_proceso_produPedidoDetaProdu);
	};
	
	public void setDefaultControlesPedidoDetaProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPedidoDetaProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pedidodetaproduSessionBean.setConGuardarRelaciones(true);			
			this.pedidodetaproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.setVisible(true);
			
					
		} else {
			//this.pedidodetaproduSessionBean.setConGuardarRelaciones(false);			
			this.pedidodetaproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPedidoDetaProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
				if(pedidodetaproduAux.getId().equals(this.iIdNuevoPedidoDetaProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaprodus) {
				if(pedidodetaproduAux.getId().equals(this.iIdNuevoPedidoDetaProdu)) {
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
	
	public int getIndiceActualPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
				if(pedidodetaproduAux.getId().equals(pedidodetaprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaprodus) {
				if(pedidodetaproduAux.getId().equals(pedidodetaprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPedidoDetaProdu(PedidoDetaProdu pedidodetaproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
				if(pedidodetaproduAux.getPedidoDetaProduOriginal().getId().equals(pedidodetaproduOriginal.getId())) {
					existe=true;
					pedidodetaproduOriginal.setId(pedidodetaproduAux.getId());
					pedidodetaproduOriginal.setVersionRow(pedidodetaproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaprodus) {
				if(pedidodetaproduAux.getPedidoDetaProduOriginal().getId().equals(pedidodetaproduOriginal.getId())) {
					existe=true;
					pedidodetaproduOriginal.setId(pedidodetaproduAux.getId());
					pedidodetaproduOriginal.setVersionRow(pedidodetaproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPedidoDetaProdu(Boolean esParaCancelar) throws Exception {
		pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
		pedidodetaproduAux=new PedidoDetaProdu();
		
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
					if(pedidodetaproduAux.getId()<0) {
						pedidodetaprodusAux.add(pedidodetaproduAux);
					}		
				}
				this.iIdNuevoPedidoDetaProdu=0L;
				this.pedidodetaproduLogic.getPedidoDetaProdus().removeAll(pedidodetaprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaprodus) {
					if(pedidodetaproduAux.getId()<0) {
						pedidodetaprodusAux.add(pedidodetaproduAux);
					}		
				}
				this.iIdNuevoPedidoDetaProdu=0L;
				this.pedidodetaprodus.removeAll(pedidodetaprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPedidoDetaProdu 
					&& this.pedidodetaproduLogic.getPedidoDetaProdus().size()>0
					) {
					pedidodetaproduAux=this.pedidodetaproduLogic.getPedidoDetaProdus().get(this.pedidodetaproduLogic.getPedidoDetaProdus().size() - 1);
				
					if(pedidodetaproduAux.getId()<0) {
						this.pedidodetaproduLogic.getPedidoDetaProdus().remove(pedidodetaproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPedidoDetaProdu && this.pedidodetaprodus.size()>0) {
					pedidodetaproduAux=this.pedidodetaprodus.get(this.pedidodetaprodus.size() - 1);
				
					if(pedidodetaproduAux.getId()<0) {
						this.pedidodetaprodus.remove(pedidodetaproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPedidoDetaProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pedidodetaprodu.getId()<0) {
				this.pedidodetaproduLogic.getPedidoDetaProdus().remove(this.pedidodetaprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pedidodetaprodu.getId()<0) {
				this.pedidodetaprodus.remove(this.pedidodetaprodu);
			}
		}			
	}
	
	public void setEstadosInicialesPedidoDetaProdu(List<PedidoDetaProdu> pedidodetaprodusAux) throws Exception {
		PedidoDetaProduConstantesFunciones.setEstadosInicialesPedidoDetaProdu(pedidodetaprodusAux);
	}
	
	public void setEstadosInicialesPedidoDetaProdu(PedidoDetaProdu pedidodetaproduAux) throws Exception {
		PedidoDetaProduConstantesFunciones.setEstadosInicialesPedidoDetaProdu(pedidodetaproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPedidoDetaProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPedidoDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPedidoDetaProduActual()) {
				if(!this.isEsNuevoPedidoDetaProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPedidoDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPedidoDetaProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPedidoDetaProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pedido Detalle Produccion ?", "MANTENIMIENTO DE Pedido Detalle Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPedidoDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PedidoDetaProdu pedidodetaprodu) throws Exception {
		PedidoDetaProduConstantesFunciones.seleccionarAsignar(this.pedidodetaprodu,pedidodetaprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPedidoDetaProdu=this.isPermisoActualizarOriginalPedidoDetaProdu;
			
			
			this.seleccionarAsignar(pedidodetaprodu);
			
			

			idProductoActual=pedidodetaprodu.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PedidoDetaProduConstantesFunciones.quitarEspaciosPedidoDetaProdu(this.pedidodetaprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPedidoDetaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pedidodetaproduSessionBean.setsFuncionBusquedaRapida(this.pedidodetaproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
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
			if(this.isEsNuevoPedidoDetaProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPedidoDetaProdu(esParaCancelar);				
				this.cancelarNuevoPedidoDetaProdu(esParaCancelar);								
			}
			
			this.pedidodetaprodu=new PedidoDetaProdu();
			
			this.inicializarPedidoDetaProdu();
			
			this.actualizarEstadoCeldasBotonesPedidoDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPedidoDetaProdu() throws Exception {
		try {
			PedidoDetaProduConstantesFunciones.inicializarPedidoDetaProdu(this.pedidodetaprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pedidodetaproduLogic.getPedidoDetaProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePedidoDetaProdus(String sAccionBusqueda,List<PedidoDetaProdu> pedidodetaprodusParaReportes) throws Exception {
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
					sPathReporteFinal="PedidoDetaProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PedidoDetaProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PedidoDetaProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PedidoDetaProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pedido Detalle Producciones");		
		parameters.put("busquedapor", PedidoDetaProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePedidoDetaProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PedidoDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PedidoDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePedidoDetaProdu=new JRBeanArrayDataSource(PedidoDetaProduJInternalFrame.TraerPedidoDetaProduBeans(pedidodetaprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePedidoDetaProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PedidoDetaProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PedidoDetaProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PedidoDetaProduBean.TraerPedidoDetaProduBeans(pedidodetaprodusParaReportes).toArray()));
							
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
				this.generarExcelReportePedidoDetaProdus(sAccionBusqueda,sTipoArchivoReporte,pedidodetaprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPedidoDetaProdus(sAccionBusqueda,sTipoArchivoReporte,pedidodetaprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPedidoDetaProduActionPerformed(null);
					//this.generarExcelReportePedidoDetaProdus(sAccionBusqueda,sTipoArchivoReporte,pedidodetaprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPedidoDetaProdus(sAccionBusqueda,sTipoArchivoReporte,pedidodetaprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPedidoDetaProdus(sAccionBusqueda,sTipoArchivoReporte,pedidodetaprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPedidoDetaProdus(sAccionBusqueda,sTipoArchivoReporte,pedidodetaprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePedidoDetaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidoDetaProdu> pedidodetaprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidoDetaProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidoDetaProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PedidoDetaProdu pedidodetaprodu : pedidodetaprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PedidoDetaProduConstantesFunciones.generarExcelReporteDataPedidoDetaProdu("NORMAL",row,workbook,pedidodetaprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPedidoDetaProdu(String sTipo,Row row,Workbook workbook) {
		
		PedidoDetaProduConstantesFunciones.generarExcelReporteHeaderPedidoDetaProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPedidoDetaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidoDetaProdu> pedidodetaprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidoDetaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PedidoDetaProdu pedidodetaprodu : pedidodetaprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PedidoDetaProduConstantesFunciones.getPedidoDetaProduDescripcion(pedidodetaprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getpedidoprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getbodegadestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.gettipoprocesoprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getcantidad_pendiente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidodetaprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPedidoDetaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidoDetaProdu> pedidodetaprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PedidoDetaProdu> pedidodetaprodusRespaldo=null;
		
		classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pedidodetaproduLogic.setDatosCliente(this.datosCliente);
		this.pedidodetaproduLogic.setDatosDeep(this.datosDeep);
		this.pedidodetaproduLogic.setIsConDeep(true);
		
		pedidodetaprodusRespaldo=this.pedidodetaproduLogic.getPedidoDetaProdus();
		
		this.pedidodetaproduLogic.setPedidoDetaProdus(pedidodetaprodusParaReportes);	
		this.pedidodetaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pedidodetaprodusParaReportes=this.pedidodetaproduLogic.getPedidoDetaProdus();
		this.pedidodetaproduLogic.setPedidoDetaProdus(pedidodetaprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidoDetaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidoDetaProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PedidoDetaProdu pedidodetaprodu : pedidodetaprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPedidoDetaProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PedidoDetaProduConstantesFunciones.generarExcelReporteDataPedidoDetaProdu("NORMAL",row,workbook,pedidodetaprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PedidoDetaProduConstantesFunciones.getPedidoDetaProduDescripcion(pedidodetaprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPedidoDetaProdu() throws Exception {		
		this.startProcessPedidoDetaProdu(true);
	}
	
	public void startProcessPedidoDetaProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPedidoDetaProdu ,this.jPanelParametrosReportesPedidoDetaProdu, this.jScrollPanelDatosPedidoDetaProdu,this.jPanelPaginacionPedidoDetaProdu, this.jScrollPanelDatosEdicionPedidoDetaProdu, this.jPanelAccionesPedidoDetaProdu,this.jPanelAccionesFormularioPedidoDetaProdu,this.jmenuBarPedidoDetaProdu,this.jmenuBarDetallePedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,this.jTtoolBarDetallePedidoDetaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidoDetaProdu=this.jTabbedPaneBusquedasPedidoDetaProdu; 
		
		final JPanel jPanelParametrosReportesPedidoDetaProdu=this.jPanelParametrosReportesPedidoDetaProdu;
		//final JScrollPane jScrollPanelDatosPedidoDetaProdu=this.jScrollPanelDatosPedidoDetaProdu;
		final JTable jTableDatosPedidoDetaProdu=this.jTableDatosPedidoDetaProdu;		
		final JPanel jPanelPaginacionPedidoDetaProdu=this.jPanelPaginacionPedidoDetaProdu;
		//final JScrollPane jScrollPanelDatosEdicionPedidoDetaProdu=this.jScrollPanelDatosEdicionPedidoDetaProdu;
		final JPanel jPanelAccionesPedidoDetaProdu=this.jPanelAccionesPedidoDetaProdu;
		
		JPanel jPanelCamposAuxiliarPedidoDetaProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPedidoDetaProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			jPanelCamposAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelCamposPedidoDetaProdu;
			jPanelAccionesFormularioAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelAccionesFormularioPedidoDetaProdu;
		}
		
		final JPanel jPanelCamposPedidoDetaProdu=jPanelCamposAuxiliarPedidoDetaProdu;
		final JPanel jPanelAccionesFormularioPedidoDetaProdu=jPanelAccionesFormularioAuxiliarPedidoDetaProdu;
		
		
		final JMenuBar jmenuBarPedidoDetaProdu=this.jmenuBarPedidoDetaProdu;
		final JToolBar jTtoolBarPedidoDetaProdu=this.jTtoolBarPedidoDetaProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPedidoDetaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidoDetaProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			jmenuBarDetalleAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jmenuBarDetallePedidoDetaProdu;
			jTtoolBarDetalleAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jTtoolBarDetallePedidoDetaProdu;
		}
		
		final JMenuBar jmenuBarDetallePedidoDetaProdu=jmenuBarDetalleAuxiliarPedidoDetaProdu;
		final JToolBar jTtoolBarDetallePedidoDetaProdu=jTtoolBarDetalleAuxiliarPedidoDetaProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidoDetaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidoDetaProdu;
			processRunnable.jTableDatos=jTableDatosPedidoDetaProdu;
			processRunnable.jPanelCampos=jPanelCamposPedidoDetaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidoDetaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesPedidoDetaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidoDetaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarPedidoDetaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidoDetaProdu;
			processRunnable.jTtoolBar=jTtoolBarPedidoDetaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidoDetaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidoDetaProdu ,jPanelParametrosReportesPedidoDetaProdu,jTableDatosPedidoDetaProdu, /*jScrollPanelDatosPedidoDetaProdu,*/jPanelCamposPedidoDetaProdu,jPanelPaginacionPedidoDetaProdu, /*jScrollPanelDatosEdicionPedidoDetaProdu,*/ jPanelAccionesPedidoDetaProdu,jPanelAccionesFormularioPedidoDetaProdu,jmenuBarPedidoDetaProdu,jmenuBarDetallePedidoDetaProdu,jTtoolBarPedidoDetaProdu,jTtoolBarDetallePedidoDetaProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidoDetaProdu ,jPanelParametrosReportesPedidoDetaProdu, jScrollPanelDatosPedidoDetaProdu,jPanelPaginacionPedidoDetaProdu, jScrollPanelDatosEdicionPedidoDetaProdu, jPanelAccionesPedidoDetaProdu,jPanelAccionesFormularioPedidoDetaProdu,jmenuBarPedidoDetaProdu,jmenuBarDetallePedidoDetaProdu,jTtoolBarPedidoDetaProdu,jTtoolBarDetallePedidoDetaProdu);
						
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
	
	public void finishProcessPedidoDetaProdu() {// throws Exception 
		this.finishProcessPedidoDetaProdu(true);
	}
	
	public void finishProcessPedidoDetaProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPedidoDetaProdu ,this.jPanelParametrosReportesPedidoDetaProdu, this.jScrollPanelDatosPedidoDetaProdu,this.jPanelPaginacionPedidoDetaProdu, this.jScrollPanelDatosEdicionPedidoDetaProdu, this.jPanelAccionesPedidoDetaProdu,this.jPanelAccionesFormularioPedidoDetaProdu,this.jmenuBarPedidoDetaProdu,this.jmenuBarDetallePedidoDetaProdu,this.jTtoolBarPedidoDetaProdu,this.jTtoolBarDetallePedidoDetaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidoDetaProdu=this.jTabbedPaneBusquedasPedidoDetaProdu; 
		
		final JPanel jPanelParametrosReportesPedidoDetaProdu=this.jPanelParametrosReportesPedidoDetaProdu;
		//final JScrollPane jScrollPanelDatosPedidoDetaProdu=this.jScrollPanelDatosPedidoDetaProdu;
		final JTable jTableDatosPedidoDetaProdu=this.jTableDatosPedidoDetaProdu;		
		final JPanel jPanelPaginacionPedidoDetaProdu=this.jPanelPaginacionPedidoDetaProdu;
		//final JScrollPane jScrollPanelDatosEdicionPedidoDetaProdu=this.jScrollPanelDatosEdicionPedidoDetaProdu;
		final JPanel jPanelAccionesPedidoDetaProdu=this.jPanelAccionesPedidoDetaProdu;
		
		JPanel jPanelCamposAuxiliarPedidoDetaProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPedidoDetaProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			jPanelCamposAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelCamposPedidoDetaProdu;
			jPanelAccionesFormularioAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelAccionesFormularioPedidoDetaProdu;
		}
		
		final JPanel jPanelCamposPedidoDetaProdu=jPanelCamposAuxiliarPedidoDetaProdu;
		final JPanel jPanelAccionesFormularioPedidoDetaProdu=jPanelAccionesFormularioAuxiliarPedidoDetaProdu;
		
		
		final JMenuBar jmenuBarPedidoDetaProdu=this.jmenuBarPedidoDetaProdu;		
		final JToolBar jTtoolBarPedidoDetaProdu=this.jTtoolBarPedidoDetaProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarPedidoDetaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidoDetaProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			jmenuBarDetalleAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jmenuBarDetallePedidoDetaProdu;
			jTtoolBarDetalleAuxiliarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jTtoolBarDetallePedidoDetaProdu;		
		}
		
		final JMenuBar jmenuBarDetallePedidoDetaProdu=jmenuBarDetalleAuxiliarPedidoDetaProdu;
		final JToolBar jTtoolBarDetallePedidoDetaProdu=jTtoolBarDetalleAuxiliarPedidoDetaProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidoDetaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidoDetaProdu;
			processRunnable.jTableDatos=jTableDatosPedidoDetaProdu;
			processRunnable.jPanelCampos=jPanelCamposPedidoDetaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidoDetaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesPedidoDetaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidoDetaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarPedidoDetaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidoDetaProdu;
			processRunnable.jTtoolBar=jTtoolBarPedidoDetaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidoDetaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPedidoDetaProdu ,jPanelParametrosReportesPedidoDetaProdu, jTableDatosPedidoDetaProdu,/*jScrollPanelDatosPedidoDetaProdu,*/jPanelCamposPedidoDetaProdu,jPanelPaginacionPedidoDetaProdu, /*jScrollPanelDatosEdicionPedidoDetaProdu,*/ jPanelAccionesPedidoDetaProdu,jPanelAccionesFormularioPedidoDetaProdu,jmenuBarPedidoDetaProdu,jmenuBarDetallePedidoDetaProdu,jTtoolBarPedidoDetaProdu,jTtoolBarDetallePedidoDetaProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPedidoDetaProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPedidoDetaProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPedidoDetaProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPedidoDetaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPedidoDetaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePedidoDetaProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPedidoDetaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPedidoDetaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePedidoDetaProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pedidodetaproduConstantesFunciones.getsFinalQueryPedidoDetaProdu();
		String  finalQueryPaginacionTodos=this.pedidodetaproduConstantesFunciones.getsFinalQueryPedidoDetaProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PedidoDetaProduConstantesFunciones.getArrayColumnasGlobalesNoPedidoDetaProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PedidoDetaProduConstantesFunciones.getArrayColumnasGlobalesPedidoDetaProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PedidoDetaProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pedidodetaprodusEliminados= new ArrayList<PedidoDetaProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPedidoDetaProdu();
		
				///*PedidoDetaProduSessionBean*/this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			
			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
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
					this.iNumeroPaginacion=PedidoDetaProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PedidoDetaProduConstantesFunciones.getClassesForeignKeysOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pedidodetaprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pedidodetaprodusAux= new ArrayList<PedidoDetaProdu>();
			
				
			pedidodetaproduLogic.setDatosCliente(this.datosCliente);
			pedidodetaproduLogic.setDatosDeep(this.datosDeep);
			pedidodetaproduLogic.setIsConDeep(true);
			
			
			pedidodetaproduLogic.getPedidoDetaProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					pedidodetaproduLogic.getTodosPedidoDetaProdus(finalQueryGlobal,pagination);
					
					//pedidodetaproduLogic.getTodosPedidoDetaProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(pedidodetaproduLogic.getPedidoDetaProdus()==null|| pedidodetaproduLogic.getPedidoDetaProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							pedidodetaprodusAux= new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux= new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							pedidodetaproduLogic.getTodosPedidoDetaProdus(finalQueryGlobal+"",this.pagination);												
							
							//pedidodetaproduLogic.getTodosPedidoDetaProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePedidoDetaProdus("Todos",pedidodetaproduLogic.getPedidoDetaProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());					
							pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPedidoDetaProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPedidoDetaProdu=this.idActual;
				
				} else if(this.idPedidoDetaProduActual!=null && this.idPedidoDetaProduActual!=0L) {
					idPedidoDetaProdu=idPedidoDetaProduActual;
				}
				
					
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndicePorId(idPedidoDetaProdu);
				
				this.pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					pedidodetaproduLogic.getEntity(idPedidoDetaProdu);
					
					//pedidodetaproduLogic.getEntityWithConnection(idPedidoDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
					pedidodetaproduLogic.getPedidoDetaProdus().add(pedidodetaproduLogic.getPedidoDetaProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
					this.pedidodetaprodus.add(pedidodetaprodu);
				}
				
				if(pedidodetaproduLogic.getPedidoDetaProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdBodega",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdBodega",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodegaDestino")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodegaDestino(id_bodega_destinoFK_IdBodegaDestino);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdBodegaDestino(finalQueryGlobal,pagination,id_bodega_destinoFK_IdBodegaDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodegaDestino(id_bodega_destinoFK_IdBodegaDestino);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodegaDestino(id_bodega_destinoFK_IdBodegaDestino);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdBodegaDestino(finalQueryGlobal,pagination,id_bodega_destinoFK_IdBodegaDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodegaDestino(id_bodega_destinoFK_IdBodegaDestino);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodegaDestino(id_bodega_destinoFK_IdBodegaDestino);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdBodegaDestino",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdBodegaDestino",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdEjercicio",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdEjercicio",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdEmpresa",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdEmpresa",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPedidoProdu")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPedidoProdu(id_pedido_produFK_IdPedidoProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdPedidoProdu(finalQueryGlobal,pagination,id_pedido_produFK_IdPedidoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPedidoProdu(id_pedido_produFK_IdPedidoProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPedidoProdu(id_pedido_produFK_IdPedidoProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdPedidoProdu(finalQueryGlobal,pagination,id_pedido_produFK_IdPedidoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPedidoProdu(id_pedido_produFK_IdPedidoProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPedidoProdu(id_pedido_produFK_IdPedidoProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdPedidoProdu",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdPedidoProdu",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdPeriodo",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdPeriodo",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdProducto",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdProducto",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdSucursal",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdSucursal",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoProcesoProdu")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoProdu(id_tipo_proceso_produFK_IdTipoProcesoProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdTipoProcesoProdu(finalQueryGlobal,pagination,id_tipo_proceso_produFK_IdTipoProcesoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoProdu(id_tipo_proceso_produFK_IdTipoProcesoProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoProdu(id_tipo_proceso_produFK_IdTipoProcesoProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdTipoProcesoProdu(finalQueryGlobal,pagination,id_tipo_proceso_produFK_IdTipoProcesoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoProdu(id_tipo_proceso_produFK_IdTipoProcesoProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdTipoProcesoProdu(id_tipo_proceso_produFK_IdTipoProcesoProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdTipoProcesoProdu",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdTipoProcesoProdu",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidodetaproduLogic.getPedidoDetaProdusFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus()==null||pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidodetaprodus==null|| pedidodetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
						pedidodetaprodusAux.addAll(pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodusAux=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodusAux.addAll(pedidodetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidodetaproduLogic.getPedidoDetaProdusFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoDetaProdus("FK_IdUnidad",pedidodetaproduLogic.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoDetaProdus("FK_IdUnidad",pedidodetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
						pedidodetaproduLogic.getPedidoDetaProdus().addAll(pedidodetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaprodus=new ArrayList<PedidoDetaProdu>();
							pedidodetaprodus.addAll(pedidodetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPedidoDetaProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPedidoDetaProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidodetaproduLogic.getPedidoDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidodetaprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidodetaproduLogic.getPedidoDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidodetaprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PedidoDetaProdu pedidodetaprodu) {
		Boolean permite=true;
		
		if(this.pedidodetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PedidoDetaProduConstantesFunciones.getOrderByListaPedidoDetaProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PedidoDetaProduConstantesFunciones.getOrderByListaPedidoDetaProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoDetaProdu pedidodetaprodu:pedidodetaproduLogic.getPedidoDetaProdus()) {
				if(pedidodetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidodetaproduTotales=pedidodetaprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoDetaProdu pedidodetaprodu:this.pedidodetaprodus) {
				if(pedidodetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidodetaproduTotales=pedidodetaprodu;
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
			this.pedidodetaproduAux=new PedidoDetaProdu();
			this.pedidodetaproduAux.setsType(Constantes2.S_TOTALES);
			this.pedidodetaproduAux.setIsNew(false);
			this.pedidodetaproduAux.setIsChanged(false);
			this.pedidodetaproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PedidoDetaProduConstantesFunciones.TotalizarValoresFilaPedidoDetaProdu(this.pedidodetaproduLogic.getPedidoDetaProdus(),this.pedidodetaproduAux);
				
				this.pedidodetaproduLogic.getPedidoDetaProdus().add(this.pedidodetaproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PedidoDetaProduConstantesFunciones.TotalizarValoresFilaPedidoDetaProdu(this.pedidodetaprodus,this.pedidodetaproduAux);
				
				this.pedidodetaprodus.add(this.pedidodetaproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pedidodetaproduTotales=new PedidoDetaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidodetaproduLogic.getPedidoDetaProdus().remove(pedidodetaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidodetaprodus.remove(pedidodetaproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pedidodetaproduTotales=new PedidoDetaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoDetaProdu pedidodetaprodu:pedidodetaproduLogic.getPedidoDetaProdus()) {
				if(pedidodetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidodetaproduTotales=pedidodetaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidoDetaProduConstantesFunciones.TotalizarValoresFilaPedidoDetaProdu(this.pedidodetaproduLogic.getPedidoDetaProdus(),pedidodetaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoDetaProdu pedidodetaprodu:this.pedidodetaprodus) {
				if(pedidodetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidodetaproduTotales=pedidodetaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidoDetaProduConstantesFunciones.TotalizarValoresFilaPedidoDetaProdu(this.pedidodetaprodus,pedidodetaproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPedidoDetaProdusFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdBodegaDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodegaDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdPedidoProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdPedidoProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdTipoProcesoProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProcesoProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoDetaProdusFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPedidoDetaProdusFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdBodegaDestino(String sFinalQuery,Long id_bodega_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdBodegaDestino(sFinalQuery,this.pagination,id_bodega_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdPedidoProdu(String sFinalQuery,Long id_pedido_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdPedidoProdu(sFinalQuery,this.pagination,id_pedido_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdTipoProcesoProdu(String sFinalQuery,Long id_tipo_proceso_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdTipoProcesoProdu(sFinalQuery,this.pagination,id_tipo_proceso_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoDetaProdusFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLogic.getPedidoDetaProdusFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosPedidoDetaProdu() {
		this.isPermisoTodoPedidoDetaProdu=false;
		this.isPermisoNuevoPedidoDetaProdu=false;
		this.isPermisoActualizarPedidoDetaProdu=false;
		this.isPermisoActualizarOriginalPedidoDetaProdu=false;
		this.isPermisoEliminarPedidoDetaProdu=false;
		this.isPermisoGuardarCambiosPedidoDetaProdu=false;
		this.isPermisoConsultaPedidoDetaProdu=false;
		this.isPermisoBusquedaPedidoDetaProdu=false;
		this.isPermisoReportePedidoDetaProdu=false;		
		this.isPermisoOrdenPedidoDetaProdu=false;		
		this.isPermisoPaginacionMedioPedidoDetaProdu=false;		
		this.isPermisoPaginacionAltoPedidoDetaProdu=false;
		this.isPermisoPaginacionTodoPedidoDetaProdu=false;
		this.isPermisoCopiarPedidoDetaProdu=false;		
		this.isPermisoVerFormPedidoDetaProdu=false;		
		this.isPermisoDuplicarPedidoDetaProdu=false;		
		this.isPermisoOrdenPedidoDetaProdu=false;		
	}
	
	public void setPermisosUsuarioPedidoDetaProdu(Boolean isPermiso) {
		this.isPermisoTodoPedidoDetaProdu=isPermiso;
		this.isPermisoNuevoPedidoDetaProdu=isPermiso;
		this.isPermisoActualizarPedidoDetaProdu=isPermiso;
		this.isPermisoActualizarOriginalPedidoDetaProdu=isPermiso;
		this.isPermisoEliminarPedidoDetaProdu=isPermiso;
		this.isPermisoGuardarCambiosPedidoDetaProdu=isPermiso;
		this.isPermisoConsultaPedidoDetaProdu=isPermiso;
		this.isPermisoBusquedaPedidoDetaProdu=isPermiso;
		this.isPermisoReportePedidoDetaProdu=isPermiso;
		this.isPermisoOrdenPedidoDetaProdu=isPermiso;		
		this.isPermisoPaginacionMedioPedidoDetaProdu=isPermiso;		
		this.isPermisoPaginacionAltoPedidoDetaProdu=isPermiso;		
		this.isPermisoPaginacionTodoPedidoDetaProdu=isPermiso;		
		this.isPermisoCopiarPedidoDetaProdu=isPermiso;		
		this.isPermisoVerFormPedidoDetaProdu=isPermiso;		
		this.isPermisoDuplicarPedidoDetaProdu=isPermiso;
		this.isPermisoOrdenPedidoDetaProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPedidoDetaProdu(Boolean isPermiso) {
		//this.isPermisoTodoPedidoDetaProdu=isPermiso;
		this.isPermisoNuevoPedidoDetaProdu=isPermiso;
		this.isPermisoActualizarPedidoDetaProdu=isPermiso;
		this.isPermisoActualizarOriginalPedidoDetaProdu=isPermiso;
		this.isPermisoEliminarPedidoDetaProdu=isPermiso;
		this.isPermisoGuardarCambiosPedidoDetaProdu=isPermiso;
		//this.isPermisoConsultaPedidoDetaProdu=isPermiso;
		//this.isPermisoBusquedaPedidoDetaProdu=isPermiso;
		//this.isPermisoReportePedidoDetaProdu=isPermiso;
		//this.isPermisoOrdenPedidoDetaProdu=isPermiso;		
		//this.isPermisoPaginacionMedioPedidoDetaProdu=isPermiso;		
		//this.isPermisoPaginacionAltoPedidoDetaProdu=isPermiso;		
		//this.isPermisoPaginacionTodoPedidoDetaProdu=isPermiso;		
		//this.isPermisoCopiarPedidoDetaProdu=isPermiso;		
		//this.isPermisoDuplicarPedidoDetaProdu=isPermiso;
		//this.isPermisoOrdenPedidoDetaProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPedidoDetaProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PedidoDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPedidoDetaProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPedidoDetaProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPedidoDetaProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPedidoDetaProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPedidoDetaProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PedidoDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PedidoDetaProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPedidoDetaProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPedidoDetaProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPedidoDetaProdu=this.isPermisoActualizarPedidoDetaProdu;
			this.isPermisoEliminarPedidoDetaProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPedidoDetaProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPedidoDetaProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPedidoDetaProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPedidoDetaProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePedidoDetaProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidoDetaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPedidoDetaProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPedidoDetaProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPedidoDetaProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPedidoDetaProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPedidoDetaProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPedidoDetaProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidoDetaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPedidoDetaProdu.setToolTipText(this.jTableDatosPedidoDetaProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPedidoDetaProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPedidoDetaProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PedidoDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PedidoDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPedidoDetaProdu() throws Exception {
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
	public void inicializarCombosForeignKeyPedidoDetaProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.pedidoprodusForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
				this.bodegadestinosForeignKey=new ArrayList();
				this.tipoprocesoprodusForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPedidoDetaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PedidoDetaProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPedidoDetaProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPedidoProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProcesoProduListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPedidoProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.pedidoprodusForeignKey==null||this.pedidoprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PedidoProduConstantesFunciones.getArrayColumnasGlobalesPedidoProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PedidoProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosPedidoProdusForeignKeyLista(finalQueryGlobal);
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

			if(cargarCombosDependencia && (this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegadestinosForeignKey==null||this.bodegadestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegaDestinosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprocesoprodusForeignKey==null||this.tipoprocesoprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProcesoProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProcesoProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProcesoProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPedidoDetaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PedidoDetaProduParameterReturnGeneral pedidodetaproduReturnGeneral=new PedidoDetaProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_empresaPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_empresaPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_sucursalPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_sucursalPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_ejercicioPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_ejercicioPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_periodoPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_periodoPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalPedidoProdu="";

				if(((this.pedidoprodusForeignKey==null||this.pedidoprodusForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_pedido_produPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_pedido_produPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionPedidoProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PedidoProduConstantesFunciones.getArrayColumnasGlobalesPedidoProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPedidoProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PedidoProduConstantesFunciones.TABLENAME);

						finalQueryGlobalPedidoProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalPedidoProdu, "");
						finalQueryGlobalPedidoProdu+=PedidoProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPedidoProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPedidoProdu=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidPedidoProduActual();
					}
				} else {
					finalQueryGlobalPedidoProdu="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_bodegaPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_bodegaPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_productoPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_productoPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_unidadPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_unidadPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}


				String finalQueryGlobalBodegaDestino="";

				if(((this.bodegadestinosForeignKey==null||this.bodegadestinosForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_bodega_destinoPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_bodega_destinoPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodegaDestino()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodegaDestino=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodegaDestino=Funciones.GetFinalQueryAppend(finalQueryGlobalBodegaDestino, "");
						finalQueryGlobalBodegaDestino+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegaDestinosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodegaDestino=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidBodegaDestinoActual();
					}
				} else {
					finalQueryGlobalBodegaDestino="NONE";
				}


				String finalQueryGlobalTipoProcesoProdu="";

				if(((this.tipoprocesoprodusForeignKey==null||this.tipoprocesoprodusForeignKey.size()<=0) && this.pedidodetaproduConstantesFunciones.cargarid_tipo_proceso_produPedidoDetaProdu)
					 || (this.esRecargarFks && this.pedidodetaproduConstantesFunciones.cargarid_tipo_proceso_produPedidoDetaProdu)) {

					if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoProcesoProduConstantesFunciones.getArrayColumnasGlobalesTipoProcesoProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoProcesoProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProcesoProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoProcesoProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoProcesoProdu, "");
						finalQueryGlobalTipoProcesoProdu+=TipoProcesoProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoProcesoProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoProcesoProdu=" WHERE " + ConstantesSql.ID + "="+pedidodetaproduSessionBean.getlidTipoProcesoProduActual();
					}
				} else {
					finalQueryGlobalTipoProcesoProdu="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				pedidodetaproduReturnGeneral=pedidodetaproduLogic.cargarCombosLoteForeignKeyPedidoDetaProdu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalPedidoProdu,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad,finalQueryGlobalBodegaDestino,finalQueryGlobalTipoProcesoProdu);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=pedidodetaproduReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=pedidodetaproduReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=pedidodetaproduReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=pedidodetaproduReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalPedidoProdu.equals("NONE")) {
				this.pedidoprodusForeignKey=pedidodetaproduReturnGeneral.getpedidoprodusForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=pedidodetaproduReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=pedidodetaproduReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=pedidodetaproduReturnGeneral.getunidadsForeignKey();
			}

			if(!finalQueryGlobalBodegaDestino.equals("NONE")) {
				this.bodegadestinosForeignKey=pedidodetaproduReturnGeneral.getbodegadestinosForeignKey();
			}

			if(!finalQueryGlobalTipoProcesoProdu.equals("NONE")) {
				this.tipoprocesoprodusForeignKey=pedidodetaproduReturnGeneral.gettipoprocesoprodusForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPedidoDetaProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyPedidoProdu();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
			this.addItemDefectoCombosForeignKeyBodegaDestino();
			this.addItemDefectoCombosForeignKeyTipoProcesoProdu();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pedidodetaproduSessionBean==null) {
				this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPedidoProdu()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionPedidoProdu()) {
				PedidoProdu pedidoprodu=new PedidoProdu();
				PedidoProduConstantesFunciones.setPedidoProduDescripcion(pedidoprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				pedidoprodu.setId(null);

				if(!PedidoProduConstantesFunciones.ExisteEnLista(this.pedidoprodusForeignKey,pedidoprodu,true)) {

					this.pedidoprodusForeignKey.add(0,pedidoprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodegaDestino()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodegaDestino()) {
				Bodega bodegadestino=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodegadestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodegadestino.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegadestinosForeignKey,bodegadestino,true)) {

					this.bodegadestinosForeignKey.add(0,bodegadestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoProcesoProdu()throws Exception {
		try {

			if(!this.pedidodetaproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoProcesoProdu()) {
				TipoProcesoProdu tipoprocesoprodu=new TipoProcesoProdu();
				TipoProcesoProduConstantesFunciones.setTipoProcesoProduDescripcion(tipoprocesoprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprocesoprodu.setId(null);

				if(!TipoProcesoProduConstantesFunciones.ExisteEnLista(this.tipoprocesoprodusForeignKey,tipoprocesoprodu,true)) {

					this.tipoprocesoprodusForeignKey.add(0,tipoprocesoprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPedidoDetaProdu()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPedidoDetaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyProducto(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyBodega(JComboBox jComboBoxBodegaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Bodega bodegaLocal=(Bodega)jComboBoxBodegaGenerico.getSelectedItem();

			if(bodegaLocal!=null  && bodegaLocal.getId()!=null  && bodegaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_bodega="+bodegaLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryProductoFromBodega(bodegaLocal);

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboProducto=sFinalQueryCombo;

			this.productosForeignKey=new ArrayList<Producto>();
			this.cargarCombosForeignKeyProducto(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyProducto(JComboBox jComboBoxProductoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Producto productoLocal=(Producto)jComboBoxProductoGenerico.getSelectedItem();

			if(productoLocal!=null  && productoLocal.getId()!=null  && productoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_producto="+productoLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.pedidodetaprodu.getid_bodega());

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboUnidad=sFinalQueryCombo;

			this.unidadsForeignKey=new ArrayList<Unidad>();
			this.cargarCombosForeignKeyUnidad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyBodega(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.addItemListener(new ComboBoxItemListener(this,"id_bodegaPedidoDetaProdu"));
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaPedidoDetaProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.addActionListener(new ComboBoxActionListener(this,"id_bodegaPedidoDetaProdu"));
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaPedidoDetaProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu"));

						this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu"));

						this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.addItemListener(new ComboBoxItemListener(this,"id_productoPedidoDetaProdu"));
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoPedidoDetaProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.addActionListener(new ComboBoxActionListener(this,"id_productoPedidoDetaProdu"));
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoPedidoDetaProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoPedidoDetaProdu"));

						this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoPedidoDetaProdu"));

					} else {
						this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoPedidoDetaProdu"));

						this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoPedidoDetaProdu"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyPedidoDetaProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidoDetaProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu)throws Exception {	
		try {
			
			this.setActualPedidoProduForeignKey(pedidodetaprodu.getid_pedido_produ(),false,"Formulario");
			this.setActualBodegaForeignKey(pedidodetaprodu.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(pedidodetaprodu.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(pedidodetaprodu.getid_unidad(),false,"Formulario");
			this.setActualBodegaDestinoForeignKey(pedidodetaprodu.getid_bodega_destino(),false,"Formulario");
			this.setActualTipoProcesoProduForeignKey(pedidodetaprodu.getid_tipo_proceso_produ(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(pedidodetaprodu.getProducto()!=null && !sTipoEvento.equals("id_productoPedidoDetaProdu")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(pedidodetaprodu.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPedidoDetaProdu()throws Exception {	
		try {
			
			this.setActualPedidoProduForeignKey(this.pedidodetaproduConstantesFunciones.getid_pedido_produ(),false,"Formulario");
			this.setActualBodegaForeignKey(this.pedidodetaproduConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.pedidodetaproduConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.pedidodetaproduConstantesFunciones.getid_unidad(),false,"Formulario");
			this.setActualBodegaDestinoForeignKey(this.pedidodetaproduConstantesFunciones.getid_bodega_destino(),false,"Formulario");
			this.setActualTipoProcesoProduForeignKey(this.pedidodetaproduConstantesFunciones.getid_tipo_proceso_produ(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPedidoDetaProdu()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPedidoDetaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPedidoDetaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPedidoDetaProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPedidoDetaProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFramePedidoProdusForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");
			this.cargarCombosFrameBodegaDestinosForeignKey("Todos");
			this.cargarCombosFrameTipoProcesoProdusForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPedidoDetaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePedidoProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegaDestinosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProcesoProdusForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPedidoDetaProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	











	public void recargarFormPedidoDetaProduBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormPedidoDetaProduid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormPedidoDetaProduProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormPedidoDetaProduid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}






	
	



	public void recargarFormPedidoDetaProduid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.pedidodetaprodu,jComboBoxGenericoProducto);
			}

			if(this.pedidodetaprodu.getid_bodega()!=null && this.pedidodetaprodu.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.pedidodetaprodu.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.pedidodetaprodu.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormPedidoDetaProduid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.pedidodetaprodu,jComboBoxGenericoUnidad);
			}

			if(this.pedidodetaprodu.getid_producto()!=null && this.pedidodetaprodu.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.pedidodetaprodu.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.pedidodetaprodu.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public PedidoDetaProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PedidoDetaProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PedidoDetaProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean(); 
		this.pedidodetaproduConstantesFunciones=new PedidoDetaProduConstantesFunciones(); 
		this.pedidodetaproduBean=new PedidoDetaProdu();//(this.pedidodetaproduConstantesFunciones); 		
		this.pedidodetaproduReturnGeneral=new PedidoDetaProduParameterReturnGeneral(); 
		
		this.pedidodetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidodetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PedidoDetaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PedidoDetaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PedidoDetaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPedidoDetaProdu(true);
			
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
			
			this.pedidodetaproduConstantesFunciones=new PedidoDetaProduConstantesFunciones(); 
			this.pedidodetaproduBean=new PedidoDetaProdu();//this.pedidodetaproduConstantesFunciones); 			
			this.pedidodetaproduReturnGeneral=new PedidoDetaProduParameterReturnGeneral(); 
		
			PedidoDetaProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Detalle Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pedidodetaprodu=new PedidoDetaProdu();
			this.pedidodetaprodus = new ArrayList<PedidoDetaProdu>();
			this.pedidodetaprodusAux = new ArrayList<PedidoDetaProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic=new PedidoDetaProduLogic();
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.pedidodetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pedidodetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPedidoDetaProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidoDetaProdu);	
					}
					
					if(this.jInternalFrameImportacionPedidoDetaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidoDetaProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPedidoDetaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPedidoDetaProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidoDetaProdu);
				this.jInternalFrameDetalleFormPedidoDetaProdu.setVisible(false);
				this.jInternalFrameDetalleFormPedidoDetaProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidoDetaProdu);
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPedidoDetaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPedidoDetaProdu);
					this.jInternalFrameImportacionPedidoDetaProdu.setVisible(false);
					this.jInternalFrameImportacionPedidoDetaProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPedidoDetaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPedidoDetaProdu);
					this.jInternalFrameOrderByPedidoDetaProdu.setVisible(false);
					this.jInternalFrameOrderByPedidoDetaProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPedidoDetaProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PedidoDetaProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pedidodetaproduReturnGeneral=new PedidoDetaProduParameterReturnGeneral();
			
			this.pedidodetaproduParameterGeneral=new PedidoDetaProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pedidodetaproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PedidoDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidoDetaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidodetaproduSessionBean.getEsGuardarRelacionado(),this.pedidodetaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidoDetaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidodetaproduSessionBean.getEsGuardarRelacionado(),this.pedidodetaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaDuplicarPedidoDetaProdu=true;
			this.isVisibilidadCeldaCopiarPedidoDetaProdu=true;
			this.isVisibilidadCeldaVerFormPedidoDetaProdu=true;
			this.isVisibilidadCeldaOrdenPedidoDetaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
			this.isVisibilidadCeldaModificarPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=false;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdBodegaDestino=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPedidoProdu=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoProcesoProdu=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPedidoDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPedidoDetaProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPedidoDetaProdu(false);
			
			this.setPermisosUsuarioPedidoDetaProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado() 
				|| (this.pedidodetaproduSessionBean.getEsGuardarRelacionado() && this.pedidodetaproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPedidoDetaProduClasesRelacionadas();
			}
			
			if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPedidoDetaProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPedidoDetaProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPedidoDetaProdu();
			}
			
			if(!this.isPermisoBusquedaPedidoDetaProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPedidoDetaProdu,this.isPermisoPaginacionMedioPedidoDetaProdu,this.isPermisoPaginacionTodoPedidoDetaProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PedidoDetaProduConstantesFunciones.getTiposSeleccionarPedidoDetaProdu());
				
				this.tiposColumnasSelect=PedidoDetaProduConstantesFunciones.getTiposSeleccionarPedidoDetaProdu(true);
				
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
			//if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPedidoDetaProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPedidoDetaProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPedidoDetaProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidoDetaProdu() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.pedidoproduLogic=new PedidoProduLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.unidadLogic=new UnidadLogic();
			this.bodegadestinoLogic=new BodegaLogic();
			this.tipoprocesoproduLogic=new TipoProcesoProduLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				pedidodetaproduImplementable= (PedidoDetaProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidoDetaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pedidodetaproduImplementableHome= (PedidoDetaProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidoDetaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pedidodetaprodus= new ArrayList<PedidoDetaProdu>();
			this.pedidodetaprodusEliminados= new ArrayList<PedidoDetaProdu>();
						
			this.isEsNuevoPedidoDetaProdu=false;
			this.esParaAccionDesdeFormularioPedidoDetaProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.pedidoprodusForeignKey=new ArrayList<PedidoProdu>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			this.bodegadestinosForeignKey=new ArrayList<Bodega>() ;
			this.tipoprocesoprodusForeignKey=new ArrayList<TipoProcesoProdu>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPedidoDetaProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPedidoDetaProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PedidoDetaProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PedidoDetaProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPedidoDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPedidoDetaProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPedidoDetaProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPedidoDetaProdu();
			}
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPedidoDetaProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPedidoDetaProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PedidoDetaProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPedidoDetaProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPedidoDetaProdu")) {
				iIndex=this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPedidoDetaProdu();	
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
	
	public void cargarCombosForeignKeyPedidoDetaProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPedidoDetaProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPedidoDetaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPedidoDetaProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPedidoDetaProdu();
		
		this.cargarCombosFrameForeignKeyPedidoDetaProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPedidoDetaProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPedidoDetaProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyPedidoProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPedidoProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPedidoProdu();
				this.cargarCombosFramePedidoProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPedidoProdu(this.pedidoprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
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
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodegaDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodegaDestino();
				this.cargarCombosFrameBodegaDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaBodegaDestino(this.bodegadestinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoProcesoProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProcesoProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProcesoProdu();
				this.cargarCombosFrameTipoProcesoProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaTipoProcesoProdu(this.tipoprocesoprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPedidoDetaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			
			if(jTableDatosPedidoDetaProdu.getRowCount()>=1) {
				jTableDatosPedidoDetaProdu.removeRowSelectionInterval(0, jTableDatosPedidoDetaProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoPedidoDetaProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPedidoDetaProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPedidoDetaProdu(true);			
			//this.pedidodetaprodu=new PedidoDetaProdu();
			//this.pedidodetaprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidoDetaProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu() ;
			
			if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidoDetaProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pedidodetaprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);				
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PedidoDetaProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPedidoDetaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPedidoDetaProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPedidoDetaProdu.getSelectedRows().length;			
			}
			
			pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPedidoDetaProdu--;			
				//PedidoDetaProdu pedidodetaproduAux= new PedidoDetaProdu();			
				//pedidodetaproduAux.setId(this.iIdNuevoPedidoDetaProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PedidoDetaProdu pedidodetaproduOrigen=new PedidoDetaProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PedidoDetaProdu pedidodetaproduOrigen : pedidodetaprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pedidodetaproduOrigen =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidodetaproduOrigen =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPedidoDetaProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pedidodetaprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPedidoDetaProdu(pedidodetaproduOrigen,this.pedidodetaprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidodetaproduLogic.getPedidoDetaProdus().add(this.pedidodetaproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodus.add(this.pedidodetaproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
				
				this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoDetaProdu(), this.getIndiceNuevoPedidoDetaProdu());
				
				int iLastRow =  this.jTableDatosPedidoDetaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidoDetaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidoDetaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();									
		
			PedidoDetaProdu pedidodetaproduOrigen=new PedidoDetaProdu();
			PedidoDetaProdu pedidodetaproduDestino=new PedidoDetaProdu();
				
			pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPedidoDetaProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pedidodetaprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPedidoDetaProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduOrigen =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidodetaproduOrigen =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidodetaproduDestino =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidodetaproduDestino =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pedidodetaproduOrigen =pedidodetaprodusSeleccionados.get(0);
				pedidodetaproduDestino =pedidodetaprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPedidoDetaProdu(pedidodetaproduOrigen,pedidodetaproduDestino,true,false);
				
				pedidodetaproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pedidodetaproduDestino,pedidodetaproduLogic.getPedidoDetaProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidodetaproduDestino,pedidodetaprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
				
				//this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoDetaProdu(), this.getIndiceNuevoPedidoDetaProdu());
				
				int iLastRow =  this.jTableDatosPedidoDetaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidoDetaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidoDetaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPedidoDetaProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPedidoDetaProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPedidoDetaProdu.setVisible(!isVisible);
			this.jPanelPaginacionPedidoDetaProdu.setVisible(!isVisible);
			this.jPanelAccionesPedidoDetaProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePedidoDetaProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPedidoDetaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPedidoDetaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPedidoDetaProdu();
			
			this.abrirFrameOrderByPedidoDetaProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPedidoDetaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePedidoDetaProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidoDetaProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPedidoDetaProdu.isMaximum()) {
					this.jInternalFrameDetalleFormPedidoDetaProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPedidoDetaProdu.setSize(this.jInternalFrameDetalleFormPedidoDetaProdu.iWidthFormulario,this.jInternalFrameDetalleFormPedidoDetaProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPedidoDetaProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPedidoDetaProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPedidoDetaProdu.isMaximum()) {
						this.jInternalFrameDetalleFormPedidoDetaProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPedidoDetaProdu.jContentPaneDetallePedidoDetaProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPedidoDetaProdu.jContentPaneDetallePedidoDetaProdu.getWidth(),PedidoDetaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPedidoDetaProdu.jContentPaneDetallePedidoDetaProdu.getWidth(),PedidoDetaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPedidoDetaProdu.jContentPaneDetallePedidoDetaProdu.getWidth(),PedidoDetaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPedidoDetaProdu.setVisible(true);
	        this.jInternalFrameDetalleFormPedidoDetaProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPedidoDetaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPedidoDetaProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPedidoDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoDetaProdu,false,this);
				} else {
					this.jInternalFrameOrderByPedidoDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoDetaProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPedidoDetaProdu);
				this.jInternalFrameOrderByPedidoDetaProdu.setVisible(false);
				this.jInternalFrameOrderByPedidoDetaProdu.setSelected(false);
				
				this.jInternalFrameOrderByPedidoDetaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidoDetaProdu"));
				
				this.inicializarActualizarBindingTablaOrderByPedidoDetaProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPedidoDetaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPedidoDetaProdu==null) {
				
				this.jInternalFrameImportacionPedidoDetaProdu=new ImportacionJInternalFrame(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidoDetaProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPedidoDetaProdu);
				this.jInternalFrameImportacionPedidoDetaProdu.setVisible(false);
				this.jInternalFrameImportacionPedidoDetaProdu.setSelected(false);


				this.jInternalFrameImportacionPedidoDetaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidoDetaProdu"));
				this.jInternalFrameImportacionPedidoDetaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidoDetaProdu"));
				this.jInternalFrameImportacionPedidoDetaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidoDetaProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPedidoDetaProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPedidoDetaProdu==null) {
				this.jInternalFrameReporteDinamicoPedidoDetaProdu=new ReporteDinamicoJInternalFrame(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidoDetaProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidoDetaProdu);
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidoDetaProdu"));
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidoDetaProdu"));
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidoDetaProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidoDetaProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePedidoDetaProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidoDetaProdu);
			
	       	this.jInternalFrameDetalleFormPedidoDetaProdu.setVisible(false);
	        this.jInternalFrameDetalleFormPedidoDetaProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormPedidoDetaProdu.dispose();
			//this.jInternalFrameDetalleFormPedidoDetaProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPedidoDetaProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPedidoDetaProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoPedidoDetaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPedidoDetaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPedidoDetaProdu.setVisible(true);
	        this.jInternalFrameImportacionPedidoDetaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPedidoDetaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPedidoDetaProdu.setVisible(true);
	        this.jInternalFrameOrderByPedidoDetaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPedidoDetaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPedidoDetaProdu.setVisible(false);
	        this.jInternalFrameOrderByPedidoDetaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPedidoDetaProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPedidoDetaProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoPedidoDetaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPedidoDetaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPedidoDetaProdu.setVisible(false);
	        this.jInternalFrameImportacionPedidoDetaProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPedidoDetaProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPedidoDetaProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPedidoDetaProdu(true);
			//this.isEsNuevoPedidoDetaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPedidoDetaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidoDetaProdu(false) ;
			
			if(pedidodetaproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidoDetaProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPedidoDetaProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPedidoDetaProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPedidoDetaProdu(true);
			//this.isEsNuevoPedidoDetaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pedidodetaprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPedidoDetaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPedidoDetaProdu(false) ;
			
			if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidoDetaProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.pedidodetaproduConstantesFunciones.cargarid_productoPedidoDetaProdu) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaPedidoProdu(List<PedidoProdu> pedidoprodusForeignKey)throws Exception{
		TableColumn tableColumnPedidoProdu=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU));
		TableCellEditor tableCellEditorPedidoProdu =tableColumnPedidoProdu.getCellEditor();

		PedidoProduTableCell pedidoproduTableCellFk=(PedidoProduTableCell)tableCellEditorPedidoProdu;

		if(pedidoproduTableCellFk!=null) {
			pedidoproduTableCellFk.setpedidoprodusForeignKey(pedidoprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//pedidoproduTableCellFk.setRowActual(intSelectedRow);
			//pedidoproduTableCellFk.setpedidoprodusForeignKeyActual(pedidoprodusForeignKey);
		//}


		if(pedidoproduTableCellFk!=null) {
			pedidoproduTableCellFk.RecargarPedidoProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodegaDestino(List<Bodega> bodegadestinosForeignKey)throws Exception{
		TableColumn tableColumnBodegaDestino=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO));
		TableCellEditor tableCellEditorBodegaDestino =tableColumnBodegaDestino.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodegaDestino;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegadestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegadestinosForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProcesoProdu(List<TipoProcesoProdu> tipoprocesoprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoProcesoProdu=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU));
		TableCellEditor tableCellEditorTipoProcesoProdu =tableColumnTipoProcesoProdu.getCellEditor();

		TipoProcesoProduTableCell tipoprocesoproduTableCellFk=(TipoProcesoProduTableCell)tableCellEditorTipoProcesoProdu;

		if(tipoprocesoproduTableCellFk!=null) {
			tipoprocesoproduTableCellFk.settipoprocesoprodusForeignKey(tipoprocesoprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprocesoproduTableCellFk.setRowActual(intSelectedRow);
			//tipoprocesoproduTableCellFk.settipoprocesoprodusForeignKeyActual(tipoprocesoprodusForeignKey);
		//}


		if(tipoprocesoproduTableCellFk!=null) {
			tipoprocesoproduTableCellFk.RecargarTipoProcesoProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPedidoDetaProdu(false);
			
			//if(!this.isEsNuevoPedidoDetaProdu) {								
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				
			}
			
			if(this.permiteMantenimiento(this.pedidodetaprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPedidoDetaProdu=true;
					this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
					this.isEsNuevoPedidoDetaProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPedidoDetaProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPedidoDetaProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidoDetaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(false);
				
				this.habilitarDeshabilitarControlesPedidoDetaProdu(false);
			
												
				
				if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePedidoDetaProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPedidoDetaProduActionPerformed(evt,pedidodetaproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPedidoDetaProdu(this.pedidodetaprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pedidodetaproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pedidodetaprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				this.pedidodetaprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				this.pedidodetaprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pedidodetaprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PedidoDetaProduModel) this.jTableDatosPedidoDetaProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPedidoDetaProdu=true;
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
				this.isEsNuevoPedidoDetaProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidoDetaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(false);
				
				this.habilitarDeshabilitarControlesPedidoDetaProdu(false);
				
				
				
				if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePedidoDetaProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPedidoDetaProdu.getRowCount()>=1) {
				jTableDatosPedidoDetaProdu.removeRowSelectionInterval(0, jTableDatosPedidoDetaProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPedidoDetaProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidoDetaProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(false) ;
			
			this.isEsNuevoPedidoDetaProdu=false;
			
			if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePedidoDetaProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPedidoDetaProdu(false);
				
				//SI ES MANUAL
				if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPedidoDetaProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPedidoDetaProdu--;			
			//PedidoDetaProdu pedidodetaproduAux= new PedidoDetaProdu();			
			//pedidodetaproduAux.setId(this.iIdNuevoPedidoDetaProdu);
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPedidoDetaProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
			
			this.pedidodetaprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pedidodetaproduLogic.getPedidoDetaProdus().add(this.pedidodetaproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pedidodetaprodus.add(this.pedidodetaproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			
			this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoDetaProdu(), this.getIndiceNuevoPedidoDetaProdu());
			
			int iLastRow =  this.jTableDatosPedidoDetaProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPedidoDetaProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPedidoDetaProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoDetaProdu(false);
			
			//SI ES MANUAL
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidoDetaProdu();
			}
			
			//this.abrirFrameTreePedidoDetaProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Pedido Detalle ProduccionES ?", "MANTENIMIENTO DE Pedido Detalle Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPedidoDetaProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPedidoDetaProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.pedidodetaproduReturnGeneral=pedidodetaproduLogic.procesarImportacionPedidoDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.pedidodetaproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPedidoDetaProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPedidoDetaProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPedidoDetaProdu.setFileImportacion(this.jInternalFrameImportacionPedidoDetaProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPedidoDetaProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPedidoDetaProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPedidoDetaProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPedidoDetaProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		

		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PedidoDetaProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PedidoDetaProduBaseDesign.jrxml";
			
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
			
			this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_PedidoProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_PedidoProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_PedidoProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_PedidoProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_BodegaDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_BodegaDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_BodegaDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_BodegaDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoProcesoProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoProcesoProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoProcesoProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoProcesoProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadPendiente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadPendiente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadPendiente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadPendiente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU:
					sNombreCampoCategoria="id_pedido_produ";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO:
					sNombreCampoCategoria="id_bodega_destino";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU:
					sNombreCampoCategoria="id_tipo_proceso_produ";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					sNombreCampoCategoria="cantidad_pendiente";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU:
					sNombreCampoCategoriaValor="id_pedido_produ";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO:
					sNombreCampoCategoriaValor="id_bodega_destino";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU:
					sNombreCampoCategoriaValor="id_tipo_proceso_produ";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					sNombreCampoCategoriaValor="cantidad_pendiente";
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pedido Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pedido_produ");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega_destino");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Proceso Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_proceso_produ");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Pendiente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_pendiente");
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PedidoDetaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getpedidoprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getbodegadestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.gettipoprocesoprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getcantidad_pendiente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PedidoDetaProdu pedidodetaprodu:pedidodetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidodetaprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelPedidoDetaProdu(row);				
			//	iRow++;
			//}				
			
			//for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPedidoDetaProdu(pedidodetaproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoDetaProdu(false);
			
			//SI ES MANUAL
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidoDetaProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoDetaProdu(false);
			
			//SI ES MANUAL
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidoDetaProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoDetaProdu(false);
			
			//SI ES MANUAL
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidoDetaProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPedidoDetaProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPedidoDetaProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPedidoDetaProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPedidoDetaProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPedidoDetaProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPedidoDetaProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosPedidoDetaProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosPedidoDetaProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPedidoDetaProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPedidoDetaProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPedidoDetaProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPedidoDetaProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPedidoDetaProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPedidoDetaProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidoDetaProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPedidoDetaProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPedidoDetaProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPedidoDetaProdu();
		
		this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPedidoDetaProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidoDetaProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPedidoDetaProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPedidoDetaProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPedidoDetaProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPedidoDetaProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePedidoDetaProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPedidoDetaProdu.jCheckBoxPostAccionNuevoPedidoDetaProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPedidoDetaProdu.jCheckBoxPostAccionSinCerrarPedidoDetaProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPedidoDetaProdu.jCheckBoxPostAccionSinMensajePedidoDetaProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPedidoDetaProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPedidoDetaProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePedidoDetaProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jCheckBoxPostAccionNuevoPedidoDetaProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPedidoDetaProdu.jCheckBoxPostAccionSinCerrarPedidoDetaProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPedidoDetaProdu.jCheckBoxPostAccionSinMensajePedidoDetaProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPedidoDetaProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPedidoDetaProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPedidoDetaProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPedidoDetaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPedidoDetaProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPedidoDetaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPedidoDetaProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPedidoDetaProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPedidoDetaProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPedidoDetaProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPedidoDetaProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPedidoDetaProdu() throws Exception {
		try	{
			if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidoDetaProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidoDetaProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidoDetaProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPedidoDetaProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPedidoDetaProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPedidoDetaProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPedidoDetaProdu.addItem(reporte);
			}
			
			
			if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPedidoDetaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPedidoDetaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPedidoDetaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPedidoDetaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPedidoDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPedidoDetaProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPedidoDetaProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidoDetaProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidoDetaProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPedidoDetaProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.getSelectedItem()!=null){this.id_bodega_destinoFK_IdBodegaDestino=((Bodega)this.jComboBoxid_bodega_destinoFK_IdBodegaDestinoPedidoDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.getSelectedItem()!=null){this.id_pedido_produFK_IdPedidoProdu=((PedidoProdu)this.jComboBoxid_pedido_produFK_IdPedidoProduPedidoDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoPedidoDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.getSelectedItem()!=null){this.id_tipo_proceso_produFK_IdTipoProcesoProdu=((TipoProcesoProdu)this.jComboBoxid_tipo_proceso_produFK_IdTipoProcesoProduPedidoDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadPedidoDetaProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPedidoDetaProdu(Boolean esInicializar) throws Exception {				
		if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPedidoDetaProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPedidoDetaProdu() throws Exception {
		this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPedidoDetaProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPedidoDetaProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPedidoDetaProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pedidodetaproduLogic.getPedidoDetaProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pedidodetaprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPedidoDetaProdu.setModel(new PedidoDetaProduModel(this.pedidodetaproduLogic.getPedidoDetaProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPedidoDetaProdu.setModel(new PedidoDetaProduModel(this.pedidodetaprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPedidoDetaProdu!=null && this.jInternalFrameOrderByPedidoDetaProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPedidoDetaProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO,pedidodetaproduConstantesFunciones.resaltarSeleccionarPedidoDetaProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO,pedidodetaproduConstantesFunciones.resaltarSeleccionarPedidoDetaProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_ID));

		if(this.pedidodetaproduConstantesFunciones.mostraridPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidodetaproduConstantesFunciones.resaltaridPedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activaridPedidoDetaProdu,this,true,"idPedidoDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidodetaproduConstantesFunciones.resaltaridPedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activaridPedidoDetaProdu,this,true,"idPedidoDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_empresaPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_empresaPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_empresaPedidoDetaProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_empresaPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_empresaPedidoDetaProdu,false,"id_empresaPedidoDetaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_sucursalPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_sucursalPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_sucursalPedidoDetaProdu));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_sucursalPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_sucursalPedidoDetaProdu,false,"id_sucursalPedidoDetaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_ejercicioPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_ejercicioPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_ejercicioPedidoDetaProdu));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_ejercicioPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_ejercicioPedidoDetaProdu,false,"id_ejercicioPedidoDetaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_periodoPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_periodoPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_periodoPedidoDetaProdu));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_periodoPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_periodoPedidoDetaProdu,false,"id_periodoPedidoDetaProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_pedido_produPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PedidoProduTableCell(this.pedidoprodusForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_pedido_produPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_pedido_produPedidoDetaProdu));
			tableColumn.setCellEditor(new PedidoProduTableCell(this.pedidoprodusForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_pedido_produPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_pedido_produPedidoDetaProdu,true,"id_pedido_produPedidoDetaProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_bodegaPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_bodegaPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_bodegaPedidoDetaProdu));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_bodegaPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_bodegaPedidoDetaProdu,true,"id_bodegaPedidoDetaProdu","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_productoPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_productoPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_productoPedidoDetaProdu));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_productoPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_productoPedidoDetaProdu,true,"id_productoPedidoDetaProdu","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_unidadPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_unidadPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_unidadPedidoDetaProdu));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_unidadPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_unidadPedidoDetaProdu,true,"id_unidadPedidoDetaProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_bodega_destinoPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegadestinosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_bodega_destinoPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_bodega_destinoPedidoDetaProdu));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegadestinosForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_bodega_destinoPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_bodega_destinoPedidoDetaProdu,true,"id_bodega_destinoPedidoDetaProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU));

		if(this.pedidodetaproduConstantesFunciones.mostrarid_tipo_proceso_produPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoProcesoProduTableCell(this.tipoprocesoprodusForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_tipo_proceso_produPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_tipo_proceso_produPedidoDetaProdu));
			tableColumn.setCellEditor(new TipoProcesoProduTableCell(this.tipoprocesoprodusForeignKey,this.pedidodetaproduConstantesFunciones.resaltarid_tipo_proceso_produPedidoDetaProdu,this,this.pedidodetaproduConstantesFunciones.activarid_tipo_proceso_produPedidoDetaProdu,true,"id_tipo_proceso_produPedidoDetaProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD));

		if(this.pedidodetaproduConstantesFunciones.mostrarcantidadPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidodetaproduConstantesFunciones.resaltarcantidadPedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activarcantidadPedidoDetaProdu,this,true,"cantidadPedidoDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidodetaproduConstantesFunciones.resaltarcantidadPedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activarcantidadPedidoDetaProdu,this,true,"cantidadPedidoDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE));

		if(this.pedidodetaproduConstantesFunciones.mostrarcantidad_pendientePedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidodetaproduConstantesFunciones.resaltarcantidad_pendientePedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activarcantidad_pendientePedidoDetaProdu,this,true,"cantidad_pendientePedidoDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidodetaproduConstantesFunciones.resaltarcantidad_pendientePedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activarcantidad_pendientePedidoDetaProdu,this,true,"cantidad_pendientePedidoDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.pedidodetaproduConstantesFunciones.mostrardescripcionPedidoDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidodetaproduConstantesFunciones.resaltardescripcionPedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activardescripcionPedidoDetaProdu,this,true,"descripcionPedidoDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidodetaproduConstantesFunciones.resaltardescripcionPedidoDetaProdu,this.pedidodetaproduConstantesFunciones.activardescripcionPedidoDetaProdu,this,true,"descripcionPedidoDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidodetaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidodetaproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidoDetaProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidodetaproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidodetaproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidoDetaProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pedidodetaproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pedidodetaproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPedidoDetaProdu.addColumn(tableColumn);
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
			
			this.jTableDatosPedidoDetaProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPedidoDetaProdu.moveColumn(this.jTableDatosPedidoDetaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPedidoDetaProdu.moveColumn(this.jTableDatosPedidoDetaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPedidoDetaProdu.moveColumn(this.jTableDatosPedidoDetaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPedidoDetaProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPedidoDetaProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPedidoDetaProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPedidoDetaProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPedidoDetaProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPedidoDetaProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPedidoDetaProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=pedidodetaproduLogic.getPedidoDetaProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pedidodetaprodus.size()-1;
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
		//this.jTableDatosPedidoDetaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPedidoDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPedidoDetaProdu();
			
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
				
				//this.isEsNuevoPedidoDetaProdu=false;
					
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidoDetaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pedidodetaprodu.getsType().equals("DUPLICADO")
				   || this.pedidodetaprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPedidoDetaProdu=true;
				
				} else {
					this.isEsNuevoPedidoDetaProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
					if(this.pedidodetaprodu.getId()>=0 && !this.pedidodetaprodu.getIsNew()) {						
						this.isEsNuevoPedidoDetaProdu=false;
						
					} else {
						this.isEsNuevoPedidoDetaProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPedidoDetaProdu(esRelaciones);						
				
				this.seleccionarPedidoDetaProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pedidodetaprodu.getId()<0) {
					this.isEsNuevoPedidoDetaProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPedidoDetaProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPedidoDetaProdu(evt,rowIndex);
				}	
				
				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PedidoDetaProdu: " + this.dDif); 
					}
				}								
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPedidoDetaProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pedidodetaprodu)) {
					if(this.pedidodetaprodu.getId()>0) {
						this.pedidodetaprodu.setIsDeleted(true);
						
						this.pedidodetaprodusEliminados.add(this.pedidodetaprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidodetaproduLogic.getPedidoDetaProdus().remove(this.pedidodetaprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodus.remove(this.pedidodetaprodu);				
					}
					
					
					((PedidoDetaProduModel) this.jTableDatosPedidoDetaProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidoDetaProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPedidoDetaProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPedidoDetaProdu) {
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidoDetaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidoDetaProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.pedidodetaproduConstantesFunciones.cargarid_empresaPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_empresaPedidoDetaProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.pedidodetaprodu.getid_empresa());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(pedidodetaprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(pedidodetaprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.pedidodetaprodu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.pedidodetaproduConstantesFunciones.cargarid_sucursalPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_sucursalPedidoDetaProdu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.pedidodetaprodu.getid_sucursal());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(pedidodetaprodu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(pedidodetaprodu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.pedidodetaprodu.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.pedidodetaproduConstantesFunciones.cargarid_ejercicioPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_ejercicioPedidoDetaProdu) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.pedidodetaprodu.getid_ejercicio());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(pedidodetaprodu.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(pedidodetaprodu.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.pedidodetaprodu.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.pedidodetaproduConstantesFunciones.cargarid_periodoPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_periodoPedidoDetaProdu) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.pedidodetaprodu.getid_periodo());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(pedidodetaprodu.getPeriodo()!=null) {
							this.periodosForeignKey.add(pedidodetaprodu.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.pedidodetaprodu.getid_periodo(),false,"Formulario");

					//PedidoProdu
					if(!this.pedidodetaproduConstantesFunciones.cargarid_pedido_produPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_pedido_produPedidoDetaProdu) {
						//this.cargarCombosPedidoProdusForeignKeyLista(" where id="+this.pedidodetaprodu.getid_pedido_produ());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.pedidoprodusForeignKey=new ArrayList<PedidoProdu>();

						if(pedidodetaprodu.getPedidoProdu()!=null) {
							this.pedidoprodusForeignKey.add(pedidodetaprodu.getPedidoProdu());
						}

						this.addItemDefectoCombosForeignKeyPedidoProdu();
						this.cargarCombosFramePedidoProdusForeignKey("Todos");
					}
					this.setActualPedidoProduForeignKey(this.pedidodetaprodu.getid_pedido_produ(),false,"Formulario");

					//Bodega
					if(!this.pedidodetaproduConstantesFunciones.cargarid_bodegaPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_bodegaPedidoDetaProdu) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.pedidodetaprodu.getid_bodega());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(pedidodetaprodu.getBodega()!=null) {
							this.bodegasForeignKey.add(pedidodetaprodu.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.pedidodetaprodu.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.pedidodetaproduConstantesFunciones.cargarid_productoPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_productoPedidoDetaProdu) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.pedidodetaprodu.getid_producto());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(pedidodetaprodu.getProducto()!=null) {
							this.productosForeignKey.add(pedidodetaprodu.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.pedidodetaprodu.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.pedidodetaproduConstantesFunciones.cargarid_unidadPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_unidadPedidoDetaProdu) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.pedidodetaprodu.getid_unidad());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(pedidodetaprodu.getUnidad()!=null) {
							this.unidadsForeignKey.add(pedidodetaprodu.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.pedidodetaprodu.getid_unidad(),false,"Formulario");

					//BodegaDestino
					if(!this.pedidodetaproduConstantesFunciones.cargarid_bodega_destinoPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_bodega_destinoPedidoDetaProdu) {
						//this.cargarCombosBodegaDestinosForeignKeyLista(" where id="+this.pedidodetaprodu.getid_bodega_destino());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.bodegadestinosForeignKey=new ArrayList<Bodega>();

						if(pedidodetaprodu.getBodegaDestino()!=null) {
							this.bodegadestinosForeignKey.add(pedidodetaprodu.getBodegaDestino());
						}

						this.addItemDefectoCombosForeignKeyBodegaDestino();
						this.cargarCombosFrameBodegaDestinosForeignKey("Todos");
					}
					this.setActualBodegaDestinoForeignKey(this.pedidodetaprodu.getid_bodega_destino(),false,"Formulario");

					//TipoProcesoProdu
					if(!this.pedidodetaproduConstantesFunciones.cargarid_tipo_proceso_produPedidoDetaProdu || this.pedidodetaproduConstantesFunciones.event_dependid_tipo_proceso_produPedidoDetaProdu) {
						//this.cargarCombosTipoProcesoProdusForeignKeyLista(" where id="+this.pedidodetaprodu.getid_tipo_proceso_produ());
									//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
						this.tipoprocesoprodusForeignKey=new ArrayList<TipoProcesoProdu>();

						if(pedidodetaprodu.getTipoProcesoProdu()!=null) {
							this.tipoprocesoprodusForeignKey.add(pedidodetaprodu.getTipoProcesoProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoProcesoProdu();
						this.cargarCombosFrameTipoProcesoProdusForeignKey("Todos");
					}
					this.setActualTipoProcesoProduForeignKey(this.pedidodetaprodu.getid_tipo_proceso_produ(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPedidoDetaProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPedidoDetaProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidoDetaProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPedidoDetaProdu(pedidodetaprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPedidoDetaProdu(pedidodetaprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPedidoDetaProdu(pedidodetaprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPedidoDetaProdu(pedidodetaprodu);
	}
	
	public void setVariablesObjetoActualToFormularioPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setText(pedidodetaprodu.getId().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setText(pedidodetaprodu.getcantidad().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setText(pedidodetaprodu.getcantidad_pendiente().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setText(pedidodetaprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PedidoDetaProdu pedidodetaproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pedidodetaproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PedidoDetaProdu pedidodetaproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pedidodetaproduLocal=this.pedidodetaprodu;
			} else {
				pedidodetaproduLocal=this.pedidodetaproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pedidodetaproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPedidoDetaProdu(pedidodetaproduLocal,true);
					
					if(pedidodetaproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pedidodetaproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pedidodetaproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidoDetaProdu(pedidodetaprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(pedidodetaprodu);
	}
	
	public void setVariablesFormularioToObjetoActualPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidoDetaProdu(pedidodetaprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.getText()==null || this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.getText()=="" || this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setText("0");
			}

			if(conColumnasBase) {pedidodetaprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoDetaProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelIdPedidoDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidodetaprodu.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelcantidadPedidoDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidodetaprodu.setcantidad_pendiente(Integer.parseInt(this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelcantidad_pendientePedidoDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidodetaprodu.setdescripcion(this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoDetaProdu.jLabeldescripcionPedidoDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidoDetaProdu(PedidoDetaProdu pedidodetaproduBean,PedidoDetaProdu pedidodetaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && pedidodetaproduBean.getid_pedido_produ()!=null && !pedidodetaproduBean.getid_pedido_produ().equals(-1L))) {pedidodetaprodu.setid_pedido_produ(pedidodetaproduBean.getid_pedido_produ());}
			if(conDefault || (!conDefault && pedidodetaproduBean.getid_bodega()!=null && !pedidodetaproduBean.getid_bodega().equals(-1L))) {pedidodetaprodu.setid_bodega(pedidodetaproduBean.getid_bodega());}
			if(conDefault || (!conDefault && pedidodetaproduBean.getid_producto()!=null && !pedidodetaproduBean.getid_producto().equals(-1L))) {pedidodetaprodu.setid_producto(pedidodetaproduBean.getid_producto());}
			if(conDefault || (!conDefault && pedidodetaproduBean.getid_unidad()!=null && !pedidodetaproduBean.getid_unidad().equals(-1L))) {pedidodetaprodu.setid_unidad(pedidodetaproduBean.getid_unidad());}
			if(conDefault || (!conDefault && pedidodetaproduBean.getid_bodega_destino()!=null && !pedidodetaproduBean.getid_bodega_destino().equals(-1L))) {pedidodetaprodu.setid_bodega_destino(pedidodetaproduBean.getid_bodega_destino());}
			if(conDefault || (!conDefault && pedidodetaproduBean.getid_tipo_proceso_produ()!=null && !pedidodetaproduBean.getid_tipo_proceso_produ().equals(-1L))) {pedidodetaprodu.setid_tipo_proceso_produ(pedidodetaproduBean.getid_tipo_proceso_produ());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPedidoDetaProdu(PedidoDetaProdu pedidodetaproduOrigen,PedidoDetaProdu pedidodetaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidodetaproduOrigen.getId()!=null && !pedidodetaproduOrigen.getId().equals(0L))) {pedidodetaprodu.setId(pedidodetaproduOrigen.getId());}}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getid_pedido_produ()!=null && !pedidodetaproduOrigen.getid_pedido_produ().equals(-1L))) {pedidodetaprodu.setid_pedido_produ(pedidodetaproduOrigen.getid_pedido_produ());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getid_bodega()!=null && !pedidodetaproduOrigen.getid_bodega().equals(-1L))) {pedidodetaprodu.setid_bodega(pedidodetaproduOrigen.getid_bodega());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getid_producto()!=null && !pedidodetaproduOrigen.getid_producto().equals(-1L))) {pedidodetaprodu.setid_producto(pedidodetaproduOrigen.getid_producto());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getid_unidad()!=null && !pedidodetaproduOrigen.getid_unidad().equals(-1L))) {pedidodetaprodu.setid_unidad(pedidodetaproduOrigen.getid_unidad());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getid_bodega_destino()!=null && !pedidodetaproduOrigen.getid_bodega_destino().equals(-1L))) {pedidodetaprodu.setid_bodega_destino(pedidodetaproduOrigen.getid_bodega_destino());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getid_tipo_proceso_produ()!=null && !pedidodetaproduOrigen.getid_tipo_proceso_produ().equals(-1L))) {pedidodetaprodu.setid_tipo_proceso_produ(pedidodetaproduOrigen.getid_tipo_proceso_produ());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getcantidad()!=null && !pedidodetaproduOrigen.getcantidad().equals(0))) {pedidodetaprodu.setcantidad(pedidodetaproduOrigen.getcantidad());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getcantidad_pendiente()!=null && !pedidodetaproduOrigen.getcantidad_pendiente().equals(0))) {pedidodetaprodu.setcantidad_pendiente(pedidodetaproduOrigen.getcantidad_pendiente());}
			if(conDefault || (!conDefault && pedidodetaproduOrigen.getdescripcion()!=null && !pedidodetaproduOrigen.getdescripcion().equals(""))) {pedidodetaprodu.setdescripcion(pedidodetaproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setText(pedidodetaprodu.getId().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setText(pedidodetaprodu.getcantidad().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setText(pedidodetaprodu.getcantidad_pendiente().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setText(pedidodetaprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidoDetaProdu(PedidoDetaProduBean pedidodetaproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setText(pedidodetaproduBean.getId().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setText(pedidodetaproduBean.getcantidad().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setText(pedidodetaproduBean.getcantidad_pendiente().toString());
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setText(pedidodetaproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPedidoDetaProdu(PedidoDetaProduParameterReturnGeneral pedidodetaproduReturnGeneral,PedidoDetaProduBean pedidodetaproduBean,Boolean conDefault) throws Exception { 
		try {
			PedidoDetaProdu pedidodetaproduLocal=new PedidoDetaProdu();
			
			pedidodetaproduLocal=pedidodetaproduReturnGeneral.getPedidoDetaProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidodetaproduLocal.getId()!=null && !pedidodetaproduLocal.getId().equals(0L))) {pedidodetaproduBean.setId(pedidodetaproduLocal.getId());}}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getid_pedido_produ()!=null && !pedidodetaproduLocal.getid_pedido_produ().equals(-1L))) {pedidodetaproduBean.setid_pedido_produ(pedidodetaproduLocal.getid_pedido_produ());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getid_bodega()!=null && !pedidodetaproduLocal.getid_bodega().equals(-1L))) {pedidodetaproduBean.setid_bodega(pedidodetaproduLocal.getid_bodega());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getid_producto()!=null && !pedidodetaproduLocal.getid_producto().equals(-1L))) {pedidodetaproduBean.setid_producto(pedidodetaproduLocal.getid_producto());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getid_unidad()!=null && !pedidodetaproduLocal.getid_unidad().equals(-1L))) {pedidodetaproduBean.setid_unidad(pedidodetaproduLocal.getid_unidad());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getid_bodega_destino()!=null && !pedidodetaproduLocal.getid_bodega_destino().equals(-1L))) {pedidodetaproduBean.setid_bodega_destino(pedidodetaproduLocal.getid_bodega_destino());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getid_tipo_proceso_produ()!=null && !pedidodetaproduLocal.getid_tipo_proceso_produ().equals(-1L))) {pedidodetaproduBean.setid_tipo_proceso_produ(pedidodetaproduLocal.getid_tipo_proceso_produ());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getcantidad()!=null && !pedidodetaproduLocal.getcantidad().equals(0))) {pedidodetaproduBean.setcantidad(pedidodetaproduLocal.getcantidad());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getcantidad_pendiente()!=null && !pedidodetaproduLocal.getcantidad_pendiente().equals(0))) {pedidodetaproduBean.setcantidad_pendiente(pedidodetaproduLocal.getcantidad_pendiente());}
			if(conDefault || (!conDefault && pedidodetaproduLocal.getdescripcion()!=null && !pedidodetaproduLocal.getdescripcion().equals(""))) {pedidodetaproduBean.setdescripcion(pedidodetaproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPedidoDetaProduGenerico(Long idPedidoDetaProduSeleccionado,JComboBox jComboBoxPedidoDetaProdu,List<PedidoDetaProdu> pedidodetaprodusLocal)throws Exception {
		try {
			PedidoDetaProdu  pedidodetaproduTemp=null;

			for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusLocal) {
				if(pedidodetaproduAux.getId()!=null && pedidodetaproduAux.getId().equals(idPedidoDetaProduSeleccionado)) {
					pedidodetaproduTemp=pedidodetaproduAux;
					break;
				}
			}

			jComboBoxPedidoDetaProdu.setSelectedItem(pedidodetaproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPedidoDetaProduGenerico(JComboBox jComboBoxPedidoDetaProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidoDetaProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPedidoDetaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidoDetaProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPedidoDetaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPedidoDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPedidoDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidodetaprodu=(PedidoDetaProdu) pedidodetaproduLogic.getPedidoDetaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidodetaprodu =(PedidoDetaProdu) pedidodetaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("PedidoProdu")) {
			//sDescripcion=this.getActualPedidoProduForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getpedidoprodu_descripcion();
			} else {
				//sDescripcion=this.getActualPedidoProduForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getpedidoprodu_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=pedidodetaprodu.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=pedidodetaprodu.getunidad_descripcion();
			}
		}

		if(sTipo.equals("BodegaDestino")) {
			//sDescripcion=this.getActualBodegaDestinoForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.getbodegadestino_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.getbodegadestino_descripcion();
			}
		}

		if(sTipo.equals("TipoProcesoProdu")) {
			//sDescripcion=this.getActualTipoProcesoProduForeignKeyDescripcion((Long)value);
			if(!pedidodetaprodu.getIsNew() && !pedidodetaprodu.getIsChanged() && !pedidodetaprodu.getIsDeleted()) {
				sDescripcion=pedidodetaprodu.gettipoprocesoprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProcesoProduForeignKeyDescripcion((Long)value);
				sDescripcion=pedidodetaprodu.gettipoprocesoprodu_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PedidoDetaProdu pedidodetaproduRow=new PedidoDetaProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidodetaproduRow=(PedidoDetaProdu) pedidodetaproduLogic.getPedidoDetaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidodetaproduRow=(PedidoDetaProdu) pedidodetaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPedidoDetaProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu));			
			this.jButtonDuplicarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaDuplicarPedidoDetaProdu && this.isPermisoDuplicarPedidoDetaProdu));			
			this.jButtonCopiarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaCopiarPedidoDetaProdu && this.isPermisoCopiarPedidoDetaProdu));
			this.jButtonVerFormPedidoDetaProdu.setVisible((this.isVisibilidadCeldaVerFormPedidoDetaProdu && this.isPermisoVerFormPedidoDetaProdu));
			
			this.jButtonAbrirOrderByPedidoDetaProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoDetaProdu && this.isPermisoOrdenPedidoDetaProdu));			
			
			this.jButtonNuevoRelacionesPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu));			
			this.jButtonNuevoGuardarCambiosPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaModificarPedidoDetaProdu && this.isPermisoActualizarPedidoDetaProdu));	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaActualizarPedidoDetaProdu && this.isPermisoActualizarPedidoDetaProdu));	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaEliminarPedidoDetaProdu && this.isPermisoEliminarPedidoDetaProdu));
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarPedidoDetaProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoDetaProdu);							
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu));						
			this.jButtonDuplicarToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaDuplicarPedidoDetaProdu && this.isPermisoDuplicarPedidoDetaProdu));						
			this.jButtonCopiarToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaCopiarPedidoDetaProdu && this.isPermisoCopiarPedidoDetaProdu));			
			this.jButtonVerFormToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaVerFormPedidoDetaProdu && this.isPermisoVerFormPedidoDetaProdu));			
			this.jButtonAbrirOrderByToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoDetaProdu && this.isPermisoOrdenPedidoDetaProdu));
			this.jButtonNuevoRelacionesToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu));			
			this.jButtonNuevoGuardarCambiosToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));			
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaModificarPedidoDetaProdu && this.isPermisoActualizarPedidoDetaProdu));	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaActualizarPedidoDetaProdu  && this.isPermisoActualizarPedidoDetaProdu));	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaEliminarPedidoDetaProdu && this.isPermisoEliminarPedidoDetaProdu));
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarToolBarPedidoDetaProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoDetaProdu);				
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu));			
			this.jMenuItemDuplicarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaDuplicarPedidoDetaProdu && this.isPermisoDuplicarPedidoDetaProdu));			
			this.jMenuItemCopiarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaCopiarPedidoDetaProdu && this.isPermisoCopiarPedidoDetaProdu));			
			this.jMenuItemVerFormPedidoDetaProdu.setVisible((this.isVisibilidadCeldaVerFormPedidoDetaProdu && this.isPermisoVerFormPedidoDetaProdu));			
			this.jMenuItemAbrirOrderByPedidoDetaProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoDetaProdu && this.isPermisoOrdenPedidoDetaProdu));			
			//this.jMenuItemMostrarOcultarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoDetaProdu && this.isPermisoOrdenPedidoDetaProdu));
			this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoDetaProdu && this.isPermisoOrdenPedidoDetaProdu));			
			//this.jMenuItemDetalleMostrarOcultarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoDetaProdu && this.isPermisoOrdenPedidoDetaProdu));			
			this.jMenuItemNuevoRelacionesPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu));			
			this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoDetaProdu && this.isPermisoNuevoPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));									
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemModificarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaModificarPedidoDetaProdu && this.isPermisoActualizarPedidoDetaProdu));	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemActualizarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaActualizarPedidoDetaProdu && this.isPermisoActualizarPedidoDetaProdu));	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemEliminarPedidoDetaProdu.setVisible((this.isVisibilidadCeldaEliminarPedidoDetaProdu && this.isPermisoEliminarPedidoDetaProdu));
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemCancelarPedidoDetaProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoDetaProdu);				
			}
			
			this.jMenuItemGuardarCambiosPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));						
			this.jMenuItemGuardarCambiosTablaPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=this.jButtonNuevoPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaDuplicarPedidoDetaProdu=this.jButtonDuplicarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaCopiarPedidoDetaProdu=this.jButtonCopiarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaVerFormPedidoDetaProdu=this.jButtonVerFormPedidoDetaProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenPedidoDetaProdu=this.jButtonAbrirOrderByPedidoDetaProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=this.jButtonNuevoRelacionesPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaModificarPedidoDetaProdu=this.jButtonModificarPedidoDetaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaGuardarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=this.jButtonGuardarCambiosTablaPedidoDetaProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=this.jButtonNuevoToolBarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=this.jButtonNuevoRelacionesToolBarPedidoDetaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.isVisibilidadCeldaModificarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarToolBarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarToolBarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarToolBarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarToolBarPedidoDetaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidoDetaProdu=this.jButtonGuardarCambiosToolBarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=this.jButtonGuardarCambiosTablaToolBarPedidoDetaProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=this.jMenuItemNuevoPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=this.jMenuItemNuevoRelacionesPedidoDetaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.isVisibilidadCeldaModificarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemModificarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemActualizarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemEliminarPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemCancelarPedidoDetaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidoDetaProdu=this.jMenuItemGuardarCambiosPedidoDetaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=this.jMenuItemGuardarCambiosTablaPedidoDetaProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPedidoDetaProdu(Boolean esInicializar) {
		if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
				//if(this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPedidoDetaProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualPedidoDetaProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPedidoDetaProdu() {
		this.jButtonNuevoPedidoDetaProdu.setVisible(this.isPermisoNuevoPedidoDetaProdu);			
		this.jButtonDuplicarPedidoDetaProdu.setVisible(this.isPermisoDuplicarPedidoDetaProdu);			
		this.jButtonCopiarPedidoDetaProdu.setVisible(this.isPermisoCopiarPedidoDetaProdu);			
		this.jButtonVerFormPedidoDetaProdu.setVisible(this.isPermisoVerFormPedidoDetaProdu);			
		
		this.jButtonAbrirOrderByPedidoDetaProdu.setVisible(this.isPermisoOrdenPedidoDetaProdu);					
		
		this.jButtonNuevoRelacionesPedidoDetaProdu.setVisible(this.isPermisoNuevoPedidoDetaProdu);			
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarPedidoDetaProdu.setVisible(this.isPermisoActualizarPedidoDetaProdu);	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarPedidoDetaProdu.setVisible(this.isPermisoActualizarPedidoDetaProdu);	
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarPedidoDetaProdu.setVisible(this.isPermisoEliminarPedidoDetaProdu);
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarPedidoDetaProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoDetaProdu);						
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.setVisible(this.isPermisoGuardarCambiosPedidoDetaProdu);							
		}
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.setVisible(this.isPermisoActualizarPedidoDetaProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePedidoDetaProdu() {
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarPedidoDetaProdu.setVisible(this.isPermisoActualizarPedidoDetaProdu);	
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarPedidoDetaProdu.setVisible(this.isPermisoActualizarPedidoDetaProdu);	
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarPedidoDetaProdu.setVisible(this.isPermisoEliminarPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarPedidoDetaProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoDetaProdu);							
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoDetaProdu && this.isPermisoGuardarCambiosPedidoDetaProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPedidoDetaProdu() {
		if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPedidoDetaProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPedidoDetaProdu() {
	}
	
	public void jTableDatosPedidoDetaProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPedidoDetaProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pedidodetaprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pedidodetaprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.pedidodetaprodu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.pedidodetaprodu.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.pedidodetaprodu.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_pedido_produPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopedidoprodu=true;

			idTienePermisopedidoprodu=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(PedidoProduConstantesFunciones.CLASSNAME);

			if(idTienePermisopedidoprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.pedidoproduBeanSwingJInternalFrame=new PedidoProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.pedidoproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.pedidoproduBeanSwingJInternalFrame.getPedidoProduLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_pedido_produ()!=null) {
					this.pedidoproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.pedidoproduBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_pedido_produ());
					this.pedidoproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.pedidoproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu();
				}

				JInternalFrameBase jinternalFrame =this.pedidoproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderpedidoprodu=(TitledBorder)this.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.getBorder();

				titledBorderpedidoprodu.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Pedido Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_pedido_produPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_pedido_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pedido_produ = "+this.pedidodetaprodu.getid_pedido_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.pedidodetaprodu.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoPedidoDetaProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPedidoDetaProdu=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosPedidoDetaProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.pedidodetaprodu.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.pedidodetaprodu.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodega_destinoPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodegadestino=true;

			idTienePermisobodegadestino=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodegadestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.bodegadestinoBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegadestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegadestinoBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_bodega_destino()!=null) {
					this.bodegadestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegadestinoBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_bodega_destino());
					this.bodegadestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegadestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegadestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegadestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBorderbodegadestino=(TitledBorder)this.bodegadestinoBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodegadestino.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodega_destinoPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_bodega_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega_destino = "+this.pedidodetaprodu.getid_bodega_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_proceso_produPedidoDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprocesoprodu=true;

			idTienePermisotipoprocesoprodu=this.tienePermisosUsuarioEnPaginaWebPedidoDetaProdu(TipoProcesoProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprocesoprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);

				this.tipoprocesoproduBeanSwingJInternalFrame=new TipoProcesoProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprocesoproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprocesoproduBeanSwingJInternalFrame.getTipoProcesoProduLogic().setConnexion(this.pedidodetaproduLogic.getConnexion());

				if(this.pedidodetaprodu.getid_tipo_proceso_produ()!=null) {
					this.tipoprocesoproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprocesoproduBeanSwingJInternalFrame.setIdActual(this.pedidodetaprodu.getid_tipo_proceso_produ());
					this.tipoprocesoproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprocesoproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprocesoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProcesoProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprocesoproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)this.jScrollPanelDatosPedidoDetaProdu.getBorder();
				TitledBorder titledBordertipoprocesoprodu=(TitledBorder)this.tipoprocesoproduBeanSwingJInternalFrame.jScrollPanelDatosTipoProcesoProdu.getBorder();

				titledBordertipoprocesoprodu.setTitle(titledBorderPedidoDetaProdu.getTitle() + " -> Tipo Proceso Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_proceso_produPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getid_tipo_proceso_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_proceso_produ = "+this.pedidodetaprodu.getid_tipo_proceso_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.pedidodetaprodu.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_pendientePedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getcantidad_pendiente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_pendiente = "+this.pedidodetaprodu.getcantidad_pendiente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPedidoDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.getpedidodetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidodetaprodu==null) {
						this.pedidodetaprodu = new PedidoDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);
				}

				if(this.pedidodetaprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.pedidodetaprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdBodega();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaDestinoPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdBodegaDestino();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdEjercicio();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdEmpresa();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPedidoProduPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdPedidoProdu();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdPeriodo();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdProducto();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdSucursal();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProcesoProduPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdTipoProcesoProdu();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadPedidoDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);

			this.getPedidoDetaProdusFK_IdUnidad();

			this.inicializarActualizarBindingPedidoDetaProdu(false);

			//if(PedidoDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidodetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePedidoDetaProdu() {
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormPedidoDetaProdu.dispose();
			this.jInternalFrameDetalleFormPedidoDetaProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
			this.jInternalFrameReporteDinamicoPedidoDetaProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPedidoDetaProdu.dispose();
			this.jInternalFrameReporteDinamicoPedidoDetaProdu=null;
		}
		
		if(this.jInternalFrameImportacionPedidoDetaProdu!=null) {
			this.jInternalFrameImportacionPedidoDetaProdu.setVisible(false);	    			
			this.jInternalFrameImportacionPedidoDetaProdu.dispose();
			this.jInternalFrameImportacionPedidoDetaProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPedidoDetaProdu();
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPedidoDetaProdu")) {
				jButtonDuplicarPedidoDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPedidoDetaProdu")) {
				jButtonCopiarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormPedidoDetaProdu")) {
				jButtonVerFormPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPedidoDetaProdu")) {
				jButtonDuplicarPedidoDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPedidoDetaProdu")) {
				jButtonDuplicarPedidoDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPedidoDetaProdu")) {
				jButtonModificarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPedidoDetaProdu")) {
				jButtonModificarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPedidoDetaProdu")) {
				jButtonModificarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPedidoDetaProdu")) {
				jButtonActualizarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPedidoDetaProdu")) {
				jButtonActualizarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPedidoDetaProdu")) {
				jButtonActualizarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarPedidoDetaProdu")) {
				jButtonEliminarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPedidoDetaProdu")) {
				jButtonEliminarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPedidoDetaProdu")) {
				jButtonEliminarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarPedidoDetaProdu")) {
				jButtonCancelarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPedidoDetaProdu")) {
				jButtonCancelarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPedidoDetaProdu")) {
				jButtonCancelarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarPedidoDetaProdu")) {
				jButtonCerrarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPedidoDetaProdu")) {
				jButtonCerrarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPedidoDetaProdu")) {
				jButtonCerrarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPedidoDetaProdu")) {
				jButtonMostrarOcultarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPedidoDetaProdu")) {
				jButtonCancelarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPedidoDetaProdu")) {
				jButtonCopiarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPedidoDetaProdu")) {
				jButtonVerFormPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPedidoDetaProdu")) {
				jButtonCopiarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPedidoDetaProdu")) {
				jButtonVerFormPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPedidoDetaProdu")) {
				jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPedidoDetaProdu")) {
				jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPedidoDetaProdu")) {
				jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPedidoDetaProdu")) {
				jButtonAnterioresPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPedidoDetaProdu")) {
				jButtonAnterioresPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePedidoDetaProdu")) {
				jButtonAnterioresPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPedidoDetaProdu")) {
				jButtonSiguientesPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPedidoDetaProdu")) {
				jButtonSiguientesPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPedidoDetaProdu")) {
				jButtonSiguientesPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPedidoDetaProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByPedidoDetaProdu")) {
				jButtonAbrirOrderByPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPedidoDetaProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarPedidoDetaProdu")) {
				jButtonMostrarOcultarPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPedidoDetaProdu")) {
				jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPedidoDetaProdu")) {
				jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPedidoDetaProdu")) {
				jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPedidoDetaProdu")) {
				jButtonCerrarReporteDinamicoPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPedidoDetaProdu")) {
				jButtonGenerarReporteDinamicoPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPedidoDetaProdu")) {
				
				jButtonGenerarExcelReporteDinamicoPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPedidoDetaProdu")) {
				jButtonCerrarImportacionPedidoDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPedidoDetaProdu")) {
				
				jButtonGenerarImportacionPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPedidoDetaProdu")) {
				
				jButtonAbrirImportacionPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPedidoDetaProdu")) {
				jComboBoxTiposAccionesPedidoDetaProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPedidoDetaProdu")) {
				jComboBoxTiposRelacionesPedidoDetaProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPedidoDetaProdu")) {
				jComboBoxTiposAccionesPedidoDetaProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPedidoDetaProdu")) {
				
				jComboBoxTiposSeleccionarPedidoDetaProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPedidoDetaProdu")) {
				jTextFieldValorCampoGeneralPedidoDetaProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPedidoDetaProdu")) {
				jButtonAbrirOrderByPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPedidoDetaProdu")) {
				jButtonAbrirOrderByPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPedidoDetaProdu")) {
				jButtonCerrarOrderByPedidoDetaProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidoDetaProduBusqueda")) {
				this.jButtonidPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidoDetaProduUpdate")) {
				this.jButtonid_empresaPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidoDetaProduBusqueda")) {
				this.jButtonid_empresaPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPedidoDetaProduUpdate")) {
				this.jButtonid_sucursalPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPedidoDetaProduBusqueda")) {
				this.jButtonid_sucursalPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPedidoDetaProduUpdate")) {
				this.jButtonid_ejercicioPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPedidoDetaProduBusqueda")) {
				this.jButtonid_ejercicioPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPedidoDetaProduUpdate")) {
				this.jButtonid_periodoPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPedidoDetaProduBusqueda")) {
				this.jButtonid_periodoPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedido_produPedidoDetaProduUpdate")) {
				this.jButtonid_pedido_produPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedido_produPedidoDetaProduBusqueda")) {
				this.jButtonid_pedido_produPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPedidoDetaProduUpdate")) {
				this.jButtonid_bodegaPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPedidoDetaProduBusqueda")) {
				this.jButtonid_bodegaPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPedidoDetaProdu")) {
				this.jButtonid_productoPedidoDetaProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPedidoDetaProduUpdate")) {
				this.jButtonid_productoPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPedidoDetaProduBusqueda")) {
				this.jButtonid_productoPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadPedidoDetaProduUpdate")) {
				this.jButtonid_unidadPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadPedidoDetaProduBusqueda")) {
				this.jButtonid_unidadPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_destinoPedidoDetaProduUpdate")) {
				this.jButtonid_bodega_destinoPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_destinoPedidoDetaProduBusqueda")) {
				this.jButtonid_bodega_destinoPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_produPedidoDetaProduUpdate")) {
				this.jButtonid_tipo_proceso_produPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_produPedidoDetaProduBusqueda")) {
				this.jButtonid_tipo_proceso_produPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadPedidoDetaProduBusqueda")) {
				this.jButtoncantidadPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_pendientePedidoDetaProduBusqueda")) {
				this.jButtoncantidad_pendientePedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPedidoDetaProduBusqueda")) {
				this.jButtondescripcionPedidoDetaProduBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoPedidoDetaProdu")) {
				this.jButtonid_productoPedidoDetaProduActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaPedidoDetaProdu")) {
				this.jButtonFK_IdBodegaPedidoDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaDestinoPedidoDetaProdu")) {
				this.jButtonFK_IdBodegaDestinoPedidoDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPedidoProduPedidoDetaProdu")) {
				this.jButtonFK_IdPedidoProduPedidoDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoPedidoDetaProdu")) {
				this.jButtonFK_IdProductoPedidoDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoProcesoProduPedidoDetaProdu")) {
				this.jButtonFK_IdTipoProcesoProduPedidoDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadPedidoDetaProdu")) {
				this.jButtonFK_IdUnidadPedidoDetaProduActionPerformed(evt);
			}
			
			;
			
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPedidoDetaProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				


				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PedidoDetaProdu pedidodetaproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				pedidodetaproduLocal=this.pedidodetaprodu;
			} else {
				pedidodetaproduLocal=this.pedidodetaproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
							
				
				


				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
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
			
			


			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
								
						
				


				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
								
				
				


				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
							
				
				


				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
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
			
			


			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
								
				
				


				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPedidoDetaProdu")) {
					jCheckBoxSeleccionarTodosPedidoDetaProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPedidoDetaProdu")) {
					jCheckBoxSeleccionadosPedidoDetaProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPedidoDetaProdu")) {
					
				}
				
				


				
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
												
				
				


				
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaPedidoDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu;
				}

				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormPedidoDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,"FK_IdBodega");
				//recargarFormPedidoDetaProduBodega(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoPedidoDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu;
				}

				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormPedidoDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoPedidoDetaProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,"FK_IdProducto");
				//recargarFormPedidoDetaProduProducto(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,"FK_IdProducto");
			}
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoDetaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaPedidoDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu;
				}

				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormPedidoDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,"FK_IdBodega");
				//recargarFormPedidoDetaProduBodega(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoPedidoDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu;
				}

				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormPedidoDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoPedidoDetaProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,"FK_IdProducto");
				//recargarFormPedidoDetaProduProducto(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,"FK_IdProducto");
			}
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidodetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidodetaprodu);
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaPedidoDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu;
				}

				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormPedidoDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,"FK_IdBodega");
				//recargarFormPedidoDetaProduBodega(jComboBoxid_bodegaFK_IdBodegaPedidoDetaProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoPedidoDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu;
				}

				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormPedidoDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoPedidoDetaProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,"FK_IdProducto");
				//recargarFormPedidoDetaProduProducto(jComboBoxid_productoFK_IdProductoPedidoDetaProdu,"FK_IdProducto");
			}
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoDetaProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidodetaproduAnterior =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPedidoDetaProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPedidoDetaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPedidoDetaProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pedidodetaprodu =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pedidodetaprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPedidoDetaProdu")) {
				
				}
				
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPedidoDetaProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPedidoDetaProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPedidoDetaProdu")) {
			
			}
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPedidoDetaProdu();
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			if(sTipo.equals("NuevoPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPedidoDetaProdu")) {
				jButtonDuplicarPedidoDetaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPedidoDetaProdu")) {
				jButtonCopiarPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPedidoDetaProdu")) {
				jButtonVerFormPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPedidoDetaProdu")) {
				jButtonNuevoPedidoDetaProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPedidoDetaProdu")) {
				jButtonModificarPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPedidoDetaProdu")) {
				jButtonActualizarPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPedidoDetaProdu")) {
				jButtonEliminarPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPedidoDetaProdu")) {
				jButtonCancelarPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPedidoDetaProdu")) {
				jButtonCerrarPedidoDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPedidoDetaProdu")) {
				jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPedidoDetaProdu")) {
				jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPedidoDetaProdu")) {
				jButtonAbrirOrderByPedidoDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPedidoDetaProdu")) {
				jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPedidoDetaProdu")) {
				jButtonAnterioresPedidoDetaProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPedidoDetaProdu")) {
				jButtonSiguientesPedidoDetaProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidoDetaProduBusqueda")) {
				this.jButtonidPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidoDetaProduUpdate")) {
				this.jButtonid_empresaPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidoDetaProduBusqueda")) {
				this.jButtonid_empresaPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPedidoDetaProduUpdate")) {
				this.jButtonid_sucursalPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPedidoDetaProduBusqueda")) {
				this.jButtonid_sucursalPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPedidoDetaProduUpdate")) {
				this.jButtonid_ejercicioPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPedidoDetaProduBusqueda")) {
				this.jButtonid_ejercicioPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPedidoDetaProduUpdate")) {
				this.jButtonid_periodoPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPedidoDetaProduBusqueda")) {
				this.jButtonid_periodoPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_pedido_produPedidoDetaProduUpdate")) {
				this.jButtonid_pedido_produPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_pedido_produPedidoDetaProduBusqueda")) {
				this.jButtonid_pedido_produPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaPedidoDetaProduUpdate")) {
				this.jButtonid_bodegaPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaPedidoDetaProduBusqueda")) {
				this.jButtonid_bodegaPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoPedidoDetaProdu")) {
				this.jButtonid_productoPedidoDetaProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoPedidoDetaProduUpdate")) {
				this.jButtonid_productoPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoPedidoDetaProduBusqueda")) {
				this.jButtonid_productoPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadPedidoDetaProduUpdate")) {
				this.jButtonid_unidadPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadPedidoDetaProduBusqueda")) {
				this.jButtonid_unidadPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_destinoPedidoDetaProduUpdate")) {
				this.jButtonid_bodega_destinoPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_destinoPedidoDetaProduBusqueda")) {
				this.jButtonid_bodega_destinoPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_proceso_produPedidoDetaProduUpdate")) {
				this.jButtonid_tipo_proceso_produPedidoDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_proceso_produPedidoDetaProduBusqueda")) {
				this.jButtonid_tipo_proceso_produPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadPedidoDetaProduBusqueda")) {
				this.jButtoncantidadPedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_pendientePedidoDetaProduBusqueda")) {
				this.jButtoncantidad_pendientePedidoDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPedidoDetaProduBusqueda")) {
				this.jButtondescripcionPedidoDetaProduBusquedaActionPerformed(evt);
			}
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPedidoDetaProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePedidoDetaProdu")) {
				closingInternalFramePedidoDetaProdu();
				
			} else if(sTipo.equals("jButtonCancelarPedidoDetaProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormPedidoDetaProdu = (JInternalFrameBase)evt.getSource();
	            	
	            PedidoDetaProduBeanSwingJInternalFrame jInternalFrameParent=(PedidoDetaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidoDetaProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPedidoDetaProduActionPerformed(null);
			}
			
			PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidodetaprodu,new Object(),this.pedidodetaproduParameterGeneral,this.pedidodetaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPedidoDetaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPedidoDetaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPedidoDetaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pedidodetaprodu)) {
			if(!esControlTabla) {
				if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);			
				}
				
				if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.pedidodetaproduReturnGeneral=pedidodetaproduLogic.procesarEventosPedidoDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidodetaproduLogic.getPedidoDetaProdus(),this.pedidodetaprodu,this.pedidodetaproduParameterGeneral,this.isEsNuevoPedidoDetaProdu,classes);//this.pedidodetaproduLogic.getPedidoDetaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPedidoDetaProdu(this.pedidodetaproduReturnGeneral,this.pedidodetaproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPedidoDetaProdu(classes,this.pedidodetaproduReturnGeneral,this.pedidodetaproduBean,false);
					}
						
					if(this.pedidodetaproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu());	
					}
						
					if(this.pedidodetaproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu(),classes);//this.pedidodetaproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPedidoDetaProdu(this.pedidodetaprodu,classes);//this.pedidodetaproduBean);									
				}
			
				if(PedidoDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPedidoDetaProdu(this.pedidodetaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoDetaProdu(this.pedidodetaprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pedidodetaproduAnterior!=null) {
						this.pedidodetaprodu=this.pedidodetaproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.pedidodetaproduReturnGeneral=pedidodetaproduLogic.procesarEventosPedidoDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidodetaproduLogic.getPedidoDetaProdus(),this.pedidodetaprodu,this.pedidodetaproduParameterGeneral,this.isEsNuevoPedidoDetaProdu,classes);//this.pedidodetaproduLogic.getPedidoDetaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pedidodetaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pedidodetaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu(),pedidodetaproduLogic.getPedidoDetaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu(),this.pedidodetaprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPedidoDetaProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosPedidoDetaProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPedidoDetaProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosPedidoDetaProdu() throws Exception {
		
		PedidoDetaProduModel pedidodetaproduModel=(PedidoDetaProduModel)this.jTableDatosPedidoDetaProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidodetaproduModel.pedidodetaprodus=this.pedidodetaproduLogic.getPedidoDetaProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pedidodetaproduModel.pedidodetaprodus=this.pedidodetaprodus;
		}
		
		
		((PedidoDetaProduModel) this.jTableDatosPedidoDetaProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPedidoDetaProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpedidodetaproduAnterior(),this.pedidodetaproduLogic.getPedidoDetaProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpedidodetaproduAnterior(),this.pedidodetaprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPedidoDetaProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
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
										
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidodetaprodu,new Object(),generalEntityParameterGeneral,this.pedidodetaproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pedidodetaproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsOfPedidoDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PedidoDetaProduConstantesFunciones.getClassesRelationshipsFromStringsOfPedidoDetaProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPedidoDetaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PedidoDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidodetaprodu,new Object(),generalEntityParameterGeneral,this.pedidodetaproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPedidoDetaProdu(PedidoDetaProduBean pedidodetaproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPedidoDetaProdu(ArrayList<Classe> classes,PedidoDetaProduReturnGeneral pedidodetaproduReturnGeneral,PedidoDetaProduBean pedidodetaproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pedidodetaprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPedidoDetaProdu = new PedidoDetaProduDetalleFormJInternalFrame(jDesktopPane,this.pedidodetaproduSessionBean.getConGuardarRelaciones(),this.pedidodetaproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.setVisible(false);
		this.jInternalFrameDetalleFormPedidoDetaProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.pedidodetaproduLogic=this.pedidodetaproduLogic;
		
		this.cargarCombosFrameForeignKeyPedidoDetaProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePedidoDetaProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidoDetaProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPedidoDetaProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPedidoDetaProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidoDetaProdu"));
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarPedidoDetaProdu"));

		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidoDetaProdu"));
					
		this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemModificarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidoDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"ActualizarPedidoDetaProdu"));
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidoDetaProdu"));
						
		this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemActualizarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidoDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarPedidoDetaProdu"));
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidoDetaProdu"));
								
		this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemEliminarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidoDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarPedidoDetaProdu"));
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidoDetaProdu"));
					
		this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemCancelarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidoDetaProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemDetalleCerrarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidoDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidoDetaProdu"));
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidoDetaProdu"));
		
		
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidoDetaProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonidPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"idPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_empresaPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_empresaPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_sucursalPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_sucursalPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_ejercicioPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_ejercicioPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_periodoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_periodoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_pedido_produPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_produPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_pedido_produPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_produPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodegaPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodegaPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPedidoDetaProduBusqueda"));
		//jButtonid_productoPedidoDetaProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPedidoDetaProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_unidadPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_unidadPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodega_destinoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_destinoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodega_destinoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_destinoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_produPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_produPedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtoncantidadPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtoncantidad_pendientePedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pendientePedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtondescripcionPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPedidoDetaProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidoDetaProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePedidoDetaProdu"));
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidoDetaProdu"));
		}
		
		this.jTableDatosPedidoDetaProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPedidoDetaProdu"));
		
		this.jTableDatosPedidoDetaProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPedidoDetaProdu"));
		
		this.jButtonNuevoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"NuevoPedidoDetaProdu"));
		
		this.jButtonDuplicarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"DuplicarPedidoDetaProdu"));
		
		this.jButtonCopiarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"CopiarPedidoDetaProdu"));
		
		this.jButtonVerFormPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"VerFormPedidoDetaProdu"));
		
		
		this.jButtonNuevoToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarPedidoDetaProdu"));
			
		this.jButtonDuplicarToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPedidoDetaProdu"));
			
		this.jMenuItemNuevoPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPedidoDetaProdu"));
			
		this.jMenuItemDuplicarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPedidoDetaProdu"));		
		
		
		this.jButtonNuevoRelacionesPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPedidoDetaProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPedidoDetaProdu"));
			
		this.jMenuItemNuevoRelacionesPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPedidoDetaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarPedidoDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonModificarToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidoDetaProdu"));
			
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemModificarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidoDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"ActualizarPedidoDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonActualizarToolBarPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidoDetaProdu"));
				
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemActualizarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidoDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarPedidoDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonEliminarToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidoDetaProdu"));
						
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemEliminarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidoDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarPedidoDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonCancelarToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidoDetaProdu"));
			
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemCancelarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidoDetaProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPedidoDetaProdu"));		
		
		
		this.jButtonCerrarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CerrarPedidoDetaProdu"));
		
		
		this.jButtonCerrarToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarPedidoDetaProdu"));
			
		this.jMenuItemCerrarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPedidoDetaProdu"));
			
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jMenuItemDetalleCerrarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidoDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosPedidoDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidoDetaProdu"));
		}
		
		this.jButtonCopiarToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarPedidoDetaProdu"));
			
		this.jButtonVerFormToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarPedidoDetaProdu"));
		
		this.jMenuItemGuardarCambiosPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPedidoDetaProdu"));
			
		this.jMenuItemCopiarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPedidoDetaProdu"));		
		
		this.jMenuItemVerFormPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPedidoDetaProdu"));		
		
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidoDetaProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPedidoDetaProdu"));
			
		this.jMenuItemGuardarCambiosTablaPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidoDetaProdu"));		
		
		
		
		this.jButtonRecargarInformacionPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionPedidoDetaProdu"));
					
		this.jButtonRecargarInformacionToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPedidoDetaProdu"));
		
		this.jMenuItemRecargarInformacionPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPedidoDetaProdu"));		
		
		
		
		this.jButtonAnterioresPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"AnterioresPedidoDetaProdu"));
		
		
		this.jButtonAnterioresToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPedidoDetaProdu"));
		
		this.jMenuItemAnterioresPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPedidoDetaProdu"));		
		
		
		this.jButtonSiguientesPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"SiguientesPedidoDetaProdu"));
		
		
		this.jButtonSiguientesToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPedidoDetaProdu"));
			
		this.jMenuItemSiguientesPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPedidoDetaProdu"));
			
		this.jMenuItemAbrirOrderByPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPedidoDetaProdu"));
			
		this.jMenuItemMostrarOcultarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPedidoDetaProdu"));
			
		this.jMenuItemDetalleAbrirOrderByPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPedidoDetaProdu"));
			
		this.jMenuItemDetalleMostarOcultarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPedidoDetaProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPedidoDetaProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPedidoDetaProdu"));
			
		this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPedidoDetaProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPedidoDetaProdu"));

		this.jCheckBoxSeleccionadosPedidoDetaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPedidoDetaProdu"));
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidoDetaProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesPedidoDetaProdu"));
			
		this.jComboBoxTiposAccionesPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesPedidoDetaProdu"));
					
		this.jComboBoxTiposSeleccionarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPedidoDetaProdu"));
			
		this.jTextFieldValorCampoGeneralPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPedidoDetaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonidPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"idPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_empresaPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_empresaPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_sucursalPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_sucursalPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_ejercicioPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_ejercicioPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_periodoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_periodoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_pedido_produPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_produPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_pedido_produPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_produPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodegaPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodegaPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPedidoDetaProduBusqueda"));
		//jButtonid_productoPedidoDetaProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPedidoDetaProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_unidadPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_unidadPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodega_destinoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_destinoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodega_destinoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_destinoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_produPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_produPedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtoncantidadPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtoncantidad_pendientePedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pendientePedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtondescripcionPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPedidoDetaProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPedidoDetaProdu"));

			this.jButtonFK_IdBodegaDestinoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDestinoPedidoDetaProdu"));

			this.jButtonFK_IdPedidoProduPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdPedidoProduPedidoDetaProdu"));

			this.jButtonFK_IdProductoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoPedidoDetaProdu"));

			this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProdu"));

			this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoProduPedidoDetaProdu"));

			this.jButtonFK_IdUnidadPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdUnidadPedidoDetaProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPedidoDetaProdu!=null) {
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidoDetaProdu"));
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidoDetaProdu"));
				this.jInternalFrameReporteDinamicoPedidoDetaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidoDetaProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidoDetaProdu"));				
			//this.jButtonGenerarReporteDinamicoPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidoDetaProdu"));
			//this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidoDetaProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPedidoDetaProdu!=null) {
				this.jInternalFrameImportacionPedidoDetaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidoDetaProdu"));
				this.jInternalFrameImportacionPedidoDetaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidoDetaProdu"));
				this.jInternalFrameImportacionPedidoDetaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidoDetaProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByPedidoDetaProdu"));
			
			this.jButtonAbrirOrderByToolBarPedidoDetaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPedidoDetaProdu"));			
			
			if(this.jInternalFrameOrderByPedidoDetaProdu!=null) {
				this.jInternalFrameOrderByPedidoDetaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidoDetaProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoDetaProdu.jTabbedPaneRelacionesPedidoDetaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidoDetaProdu"));
		
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
            		closingInternalFramePedidoDetaProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPedidoDetaProdu = (JInternalFrameBase)event.getSource();
	            	
	            PedidoDetaProduBeanSwingJInternalFrame jInternalFrameParent=(PedidoDetaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidoDetaProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPedidoDetaProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPedidoDetaProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPedidoDetaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPedidoDetaProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPedidoDetaProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoDetaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoDetaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoDetaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPedidoDetaProdu";
		inputMap = this.jButtonNuevoPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidoDetaProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoDetaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoDetaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoDetaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPedidoDetaProdu";
		inputMap = this.jButtonNuevoRelacionesPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidoDetaProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPedidoDetaProdu";
		inputMap = this.jButtonModificarPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPedidoDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPedidoDetaProdu";
		inputMap = this.jButtonActualizarPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPedidoDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPedidoDetaProdu";
		inputMap = this.jButtonEliminarPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPedidoDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPedidoDetaProdu";
		inputMap = this.jButtonCancelarPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPedidoDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPedidoDetaProdu";
		inputMap = this.jButtonCerrarPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPedidoDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPedidoDetaProdu";
		inputMap = this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonGuardarCambiosPedidoDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPedidoDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPedidoDetaProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPedidoDetaProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPedidoDetaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPedidoDetaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPedidoDetaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPedidoDetaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPedidoDetaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPedidoDetaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonidPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"idPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_empresaPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_empresaPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_sucursalPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_sucursalPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_ejercicioPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_ejercicioPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_periodoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_periodoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_pedido_produPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_pedido_produPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_pedido_produPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_pedido_produPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodegaPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodegaPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaPedidoDetaProduBusqueda"));
		//jButtonid_productoPedidoDetaProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoPedidoDetaProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_unidadPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_unidadPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodega_destinoPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_destinoPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_bodega_destinoPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_destinoPedidoDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_tipo_proceso_produPedidoDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_produPedidoDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_tipo_proceso_produPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_proceso_produPedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtoncantidadPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadPedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtoncantidad_pendientePedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_pendientePedidoDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoDetaProdu.jButtondescripcionPedidoDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPedidoDetaProduBusqueda"));
		
		
		this.jButtonFK_IdBodegaPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaPedidoDetaProdu"));

		this.jButtonFK_IdBodegaDestinoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDestinoPedidoDetaProdu"));

		this.jButtonFK_IdPedidoProduPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdPedidoProduPedidoDetaProdu"));

		this.jButtonFK_IdProductoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoPedidoDetaProdu"));

		this.jButtonBuscarFK_IdProductoid_productoPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoPedidoDetaProdu"));

		this.jButtonFK_IdTipoProcesoProduPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdTipoProcesoProduPedidoDetaProdu"));

		this.jButtonFK_IdUnidadPedidoDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdUnidadPedidoDetaProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPedidoDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPedidoDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPedidoDetaProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPedidoDetaProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPedidoDetaProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
					pedidodetaproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodus) {
					pedidodetaproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPedidoDetaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
						pedidodetaproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodus) {
						pedidodetaproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidoDetaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidoDetaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPedidoDetaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPedidoDetaProdu.getSelectedRows();
			
			PedidoDetaProdu pedidodetaproduLocal=new PedidoDetaProdu();
			
			//this.seleccionarTodosPedidoDetaProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidodetaproduLocal =(PedidoDetaProdu) this.pedidodetaproduLogic.getPedidoDetaProdus().toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pedidodetaproduLocal =(PedidoDetaProdu) this.pedidodetaprodus.toArray()[this.jTableDatosPedidoDetaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pedidodetaproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
						pedidodetaproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodus) {
						pedidodetaproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidoDetaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidoDetaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidoDetaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPedidoDetaProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPedidoDetaProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPedidoDetaProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPedidoDetaProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaproduLogic.getPedidoDetaProdus()) {
				
						if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							pedidodetaproduAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE)) {
							existe=true;
							pedidodetaproduAux.setcantidad_pendiente(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pedidodetaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodus) {
					
						if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							pedidodetaproduAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE)) {
							existe=true;
							pedidodetaproduAux.setcantidad_pendiente(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pedidodetaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPedidoDetaProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPedidoDetaProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPedidoDetaProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePedidoDetaProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessPedidoDetaProdu(conSplash);
				
					this.generarReportePedidoDetaProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPedidoDetaProdusSeleccionados();
				//this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidoDetaProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidoDetaProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidoDetaProdu();
				
				this.exportarPedidoDetaProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPedidoDetaProdus();
				//this.importarPedidoDetaProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidoDetaProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPedidoDetaProdusSeleccionados();
				//this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pedido Detalle Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPedidoDetaProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPedidoDetaProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPedidoDetaProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(PedidoDetaProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePedidoDetaProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPedidoDetaProdu(conSplash);
					
						//this.actualizarParametrosGeneralPedidoDetaProdu();
						
						this.generarReporteProcesoAccionPedidoDetaProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PedidoDetaProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pedido Detalle ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Pedido Detalle Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPedidoDetaProdu();
				
						this.actualizarParametrosGeneralPedidoDetaProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pedidodetaproduReturnGeneral=pedidodetaproduLogic.procesarAccionPedidoDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pedidodetaproduLogic.getPedidoDetaProdus(),this.pedidodetaproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPedidoDetaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPedidoDetaProdu();
					
					PedidoDetaProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPedidoDetaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidoDetaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxTiposAccionesFormularioPedidoDetaProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPedidoDetaProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPedidoDetaProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPedidoDetaProdu();
			
			if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
			PedidoDetaProdu pedidodetaprodu=new PedidoDetaProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPedidoDetaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPedidoDetaProdu.getSelectedItem();
			
			
			
			
			pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(pedidodetaprodusSeleccionados.size()==1) {
				for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusSeleccionados) {
					pedidodetaprodu=pedidodetaproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPedidoDetaProdu();
			
      		//this.finishProcessPedidoDetaProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPedidoDetaProduReturnGeneral() throws Exception {
		if(this.pedidodetaproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pedidodetaproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pedidodetaproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pedidodetaproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pedidodetaproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pedidodetaproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPedidoDetaProdu(false);
		}
		
		if(this.pedidodetaproduReturnGeneral.getConRetornoLista() || this.pedidodetaproduReturnGeneral.getConRetornoObjeto()) {
			if(this.pedidodetaproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pedidodetaproduLogic.setPedidoDetaProdus(this.pedidodetaproduReturnGeneral.getPedidoDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.pedidodetaproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pedidodetaproduLogic.setPedidoDetaProdu(this.pedidodetaproduReturnGeneral.getPedidoDetaProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPedidoDetaProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralPedidoDetaProdu() throws Exception {
		
		
	}
	
	public ArrayList<PedidoDetaProdu> getPedidoDetaProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPedidoDetaProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PedidoDetaProdu pedidodetaproduAux:pedidodetaproduLogic.getPedidoDetaProdus()) {
					if(pedidodetaproduAux.getIsSelected()) {
						pedidodetaprodusSeleccionados.add(pedidodetaproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoDetaProdu pedidodetaproduAux:this.pedidodetaprodus) {
					if(pedidodetaproduAux.getIsSelected()) {
						pedidodetaprodusSeleccionados.add(pedidodetaproduAux);				
					}
				}
			}
			
			if(pedidodetaprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pedidodetaprodusSeleccionados.addAll(this.pedidodetaproduLogic.getPedidoDetaProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pedidodetaprodusSeleccionados.addAll(this.pedidodetaprodus);				
					}
				}
			}
		} else {
			pedidodetaprodusSeleccionados.add(this.pedidodetaprodu);
		}
		
		return pedidodetaprodusSeleccionados;
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
	
	public void generarReportePedidoDetaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPedidoDetaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPedidoDetaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidoDetaProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidoDetaProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pedido Detalle Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPedidoDetaProdusSeleccionados() throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalPedidoDetaProdusSeleccionados() throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPedidoDetaProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPedidoDetaProdusSeleccionados() throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPedidoDetaProdu();
		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPedidoDetaProdu();
		
		
		//this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados ,pedidodetaproduImplementable,pedidodetaproduImplementableHome);
	}
	
	public void mostrarImportacionPedidoDetaProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPedidoDetaProdu();
		
		this.abrirFrameImportacionPedidoDetaProdu();		
		
			
		//this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados ,pedidodetaproduImplementable,pedidodetaproduImplementableHome);
	}
	
	public void importarPedidoDetaProdus() throws Exception {		
	
	}
	
	public void exportarPedidoDetaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPedidoDetaProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPedidoDetaProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPedidoDetaProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pedido Detalle Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPedidoDetaProdusSeleccionados() throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPedidoDetaProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPedidoDetaProdu(pedidodetaproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pedidodetaproduAux.setsDetalleGeneralEntityReporte(pedidodetaproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPedidoDetaProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pedidodetaprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getpedidoprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getbodegadestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.gettipoprocesoprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getcantidad_pendiente().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidodetaprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPedidoDetaProdusSeleccionados() throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PedidoDetaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPedidoDetaProdu(row);				
				iRow++;
			}				
			
			for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPedidoDetaProdu(pedidodetaproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPedidoDetaProdusSeleccionados() throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();		
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidodetaprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pedidodetaprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pedidodetaprodu");
			//elementRoot.appendChild(element);
		
			for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusSeleccionados) {
				element = document.createElement("pedidodetaprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPedidoDetaProdu(pedidodetaproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Detalle Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPedidoDetaProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getpedidoprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getbodegadestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.gettipoprocesoprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getcantidad_pendiente());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidodetaprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlPedidoDetaProdu(PedidoDetaProdu pedidodetaprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PedidoDetaProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pedidodetaprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PedidoDetaProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pedidodetaprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementpedidoprodu_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDPEDIDOPRODU);
		elementpedidoprodu_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getpedidoprodu_descripcion()));
		element.appendChild(elementpedidoprodu_descripcion);

		Element elementbodega_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementbodegadestino_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDBODEGADESTINO);
		elementbodegadestino_descripcion.appendChild(document.createTextNode(pedidodetaprodu.getbodegadestino_descripcion()));
		element.appendChild(elementbodegadestino_descripcion);

		Element elementtipoprocesoprodu_descripcion = document.createElement(PedidoDetaProduConstantesFunciones.IDTIPOPROCESOPRODU);
		elementtipoprocesoprodu_descripcion.appendChild(document.createTextNode(pedidodetaprodu.gettipoprocesoprodu_descripcion()));
		element.appendChild(elementtipoprocesoprodu_descripcion);

		Element elementcantidad = document.createElement(PedidoDetaProduConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(pedidodetaprodu.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcantidad_pendiente = document.createElement(PedidoDetaProduConstantesFunciones.CANTIDADPENDIENTE);
		elementcantidad_pendiente.appendChild(document.createTextNode(pedidodetaprodu.getcantidad_pendiente().toString().trim()));
		element.appendChild(elementcantidad_pendiente);

		Element elementdescripcion = document.createElement(PedidoDetaProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(pedidodetaprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoPedidoDetaProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados=new ArrayList<PedidoDetaProdu>();
		
		pedidodetaprodusSeleccionados=this.getPedidoDetaProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPedidoDetaProdu(pedidodetaprodusSeleccionados);
		
		this.generarReportePedidoDetaProdus("Todos",pedidodetaprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPedidoDetaProdu(ArrayList<PedidoDetaProdu> pedidodetaprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PedidoDetaProdu pedidodetaproduAux:pedidodetaprodusSeleccionados) {
				pedidodetaproduAux.setsDetalleGeneralEntityReporte(pedidodetaproduAux.toString());
			
				if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDPEDIDOPRODU)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getpedidoprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDBODEGADESTINO)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getbodegadestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_IDTIPOPROCESOPRODU)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.gettipoprocesoprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_CANTIDADPENDIENTE)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getcantidad_pendiente().toString());
				}
				 else if(sTipoSeleccionar.equals(PedidoDetaProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					pedidodetaproduAux.setsDescripcionGeneralEntityReporte1(pedidodetaproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPedidoDetaProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPedidoDetaProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=true;
				this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=true;
			}
			
			this.isVisibilidadCeldaModificarPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=false;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
			this.isVisibilidadCeldaModificarPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=true;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
			this.isVisibilidadCeldaModificarPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=true;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=true;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
			this.isVisibilidadCeldaModificarPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=true;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=true;
			this.isVisibilidadCeldaModificarPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=false;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=false;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
			this.isVisibilidadCeldaModificarPedidoDetaProdu=true;
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=false;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
			this.isVisibilidadCeldaCancelarPedidoDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidoDetaProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PedidoDetaProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=true;
		} else {
			this.actualizarEstadoPanelsPedidoDetaProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPedidoDetaProdu=false;
			//this.isVisibilidadCeldaVerFormPedidoDetaProdu=false;
			this.isVisibilidadCeldaDuplicarPedidoDetaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pedidodetaproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoPedidoDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoDetaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			if(!pedidodetaproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;												
			}
			
			this.jButtonCerrarPedidoDetaProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPedidoDetaProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.pedidodetaprodu)) {
			this.isVisibilidadCeldaActualizarPedidoDetaProdu=false;
			this.isVisibilidadCeldaEliminarPedidoDetaProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPedidoDetaProdu() {
	}
	
	public void actualizarEstadoPanelsPedidoDetaProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPedidoDetaProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoDetaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoDetaProdu!=null) {
				this.jScrollPanelDatosPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoDetaProdu!=null) {
				this.jPanelPaginacionPedidoDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
					this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pedidodetaproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoDetaProdu!=null) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPedidoDetaProdu!=null) {
				this.jPanelParametrosReportesPedidoDetaProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdBodega=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdBodega=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaPedidoProdu(Boolean isParaPedidoProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPedidoProduNegation=!isParaPedidoProdu;

			this.isVisibilidadFK_IdBodega=isParaPedidoProduNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaPedidoProduNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaPedidoProdu;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaPedidoProduNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaPedidoProduNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaPedidoProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodegaDestino(Boolean isParaBodegaDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaDestinoNegation=!isParaBodegaDestino;

			this.isVisibilidadFK_IdBodega=isParaBodegaDestinoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaBodegaDestino;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaBodegaDestinoNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaBodegaDestinoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaBodegaDestinoNegation;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaDestinoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProcesoProdu(Boolean isParaTipoProcesoProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProcesoProduNegation=!isParaTipoProcesoProdu;

			this.isVisibilidadFK_IdBodega=isParaTipoProcesoProduNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaPedidoDetaProdu);}

			this.isVisibilidadFK_IdBodegaDestino=isParaTipoProcesoProduNegation;
			if(!this.isVisibilidadFK_IdBodegaDestino) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdBodegaDestinoPedidoDetaProdu);}

			this.isVisibilidadFK_IdPedidoProdu=isParaTipoProcesoProduNegation;
			if(!this.isVisibilidadFK_IdPedidoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdPedidoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaTipoProcesoProduNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdProductoPedidoDetaProdu);}

			this.isVisibilidadFK_IdTipoProcesoProdu=isParaTipoProcesoProdu;
			if(!this.isVisibilidadFK_IdTipoProcesoProdu) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdTipoProcesoProduPedidoDetaProdu);}

			this.isVisibilidadFK_IdUnidad=isParaTipoProcesoProduNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasPedidoDetaProdu.remove(jPanelFK_IdUnidadPedidoDetaProdu);}
		}
		
	}
	
	
	
	

	public String registrarSesionPedidoDetaProduParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(pedidodetaproduSessionBean==null) {
				pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(pedidodetaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.pedidodetaproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionPedidoDetaProdu(true);
			//productoSessionBean.setlidPedidoDetaProduActual(this.idPedidoDetaProduActual);

			pedidodetaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPedidoDetaProdu(true);
			pedidodetaproduSessionBean.setlIdPedidoDetaProduActualForeignKey(this.idPedidoDetaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PedidoDetaProduSessionBean pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		
		if(this.pedidodetaproduSessionBean==null) {
			this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		}
		
		this.pedidodetaproduSessionBean.setsUltimaBusquedaPedidoDetaProdu(this.getsAccionBusqueda());
		this.pedidodetaproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.pedidodetaproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			pedidodetaproduSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodegaDestino")) {
			pedidodetaproduSessionBean.setid_bodega_destino(this.getid_bodega_destinoFK_IdBodegaDestino());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			pedidodetaproduSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			pedidodetaproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPedidoProdu")) {
			pedidodetaproduSessionBean.setid_pedido_produ(this.getid_pedido_produFK_IdPedidoProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			pedidodetaproduSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			pedidodetaproduSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			pedidodetaproduSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoProdu")) {
			pedidodetaproduSessionBean.setid_tipo_proceso_produ(this.getid_tipo_proceso_produFK_IdTipoProcesoProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			pedidodetaproduSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PedidoDetaProduSessionBean pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		
		if(this.pedidodetaproduSessionBean==null) {
			this.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
		}
		
		if(this.pedidodetaproduSessionBean.getsUltimaBusquedaPedidoDetaProdu()!=null&&!this.pedidodetaproduSessionBean.getsUltimaBusquedaPedidoDetaProdu().equals("")) {
			this.setsAccionBusqueda(pedidodetaproduSessionBean.getsUltimaBusquedaPedidoDetaProdu());
			this.setiNumeroPaginacion(pedidodetaproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(pedidodetaproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(pedidodetaproduSessionBean.getid_bodega());
				pedidodetaproduSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodegaDestino")) {
				this.setid_bodega_destinoFK_IdBodegaDestino(pedidodetaproduSessionBean.getid_bodega_destino());
				pedidodetaproduSessionBean.setid_bodega_destino(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(pedidodetaproduSessionBean.getid_ejercicio());
				pedidodetaproduSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(pedidodetaproduSessionBean.getid_empresa());
				pedidodetaproduSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPedidoProdu")) {
				this.setid_pedido_produFK_IdPedidoProdu(pedidodetaproduSessionBean.getid_pedido_produ());
				pedidodetaproduSessionBean.setid_pedido_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(pedidodetaproduSessionBean.getid_periodo());
				pedidodetaproduSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(pedidodetaproduSessionBean.getid_producto());
				pedidodetaproduSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(pedidodetaproduSessionBean.getid_sucursal());
				pedidodetaproduSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoProcesoProdu")) {
				this.setid_tipo_proceso_produFK_IdTipoProcesoProdu(pedidodetaproduSessionBean.getid_tipo_proceso_produ());
				pedidodetaproduSessionBean.setid_tipo_proceso_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(pedidodetaproduSessionBean.getid_unidad());
				pedidodetaproduSessionBean.setid_unidad(-1L);
			}
		}
		
		this.pedidodetaproduSessionBean.setsUltimaBusquedaPedidoDetaProdu("");
		this.pedidodetaproduSessionBean.setiNumeroPaginacion(PedidoDetaProduConstantesFunciones.INUMEROPAGINACION);
		this.pedidodetaproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPedidoDetaProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPedidoDetaProdu() {
		this.updateBorderResaltarBusquedasFormularioPedidoDetaProdu();
		this.updateVisibilidadBusquedasFormularioPedidoDetaProdu();
		this.updateHabilitarBusquedasFormularioPedidoDetaProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioPedidoDetaProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPedidoDetaProdu.getComponents().length>0) {
	

		if(this.pedidodetaproduConstantesFunciones.resaltarFK_IdBodegaPedidoDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaPedidoDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdBodegaPedidoDetaProdu);
			}
		}

		if(this.pedidodetaproduConstantesFunciones.resaltarFK_IdBodegaDestinoPedidoDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaDestinoPedidoDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdBodegaDestinoPedidoDetaProdu);
			}
		}

		if(this.pedidodetaproduConstantesFunciones.resaltarFK_IdPedidoProduPedidoDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdPedidoProduPedidoDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdPedidoProduPedidoDetaProdu);
			}
		}

		if(this.pedidodetaproduConstantesFunciones.resaltarFK_IdProductoPedidoDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdProductoPedidoDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdProductoPedidoDetaProdu);
			}
		}

		if(this.pedidodetaproduConstantesFunciones.resaltarFK_IdTipoProcesoProduPedidoDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdTipoProcesoProduPedidoDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdTipoProcesoProduPedidoDetaProdu);
			}
		}

		if(this.pedidodetaproduConstantesFunciones.resaltarFK_IdUnidadPedidoDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadPedidoDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdUnidadPedidoDetaProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPedidoDetaProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPedidoDetaProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaPedidoDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidodetaproduConstantesFunciones.mostrarFK_IdBodegaPedidoDetaProdu);
			if(!this.pedidodetaproduConstantesFunciones.mostrarFK_IdBodegaPedidoDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaDestinoPedidoDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidodetaproduConstantesFunciones.mostrarFK_IdBodegaDestinoPedidoDetaProdu);
			if(!this.pedidodetaproduConstantesFunciones.mostrarFK_IdBodegaDestinoPedidoDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdPedidoProduPedidoDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidodetaproduConstantesFunciones.mostrarFK_IdPedidoProduPedidoDetaProdu);
			if(!this.pedidodetaproduConstantesFunciones.mostrarFK_IdPedidoProduPedidoDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdProductoPedidoDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidodetaproduConstantesFunciones.mostrarFK_IdProductoPedidoDetaProdu);
			if(!this.pedidodetaproduConstantesFunciones.mostrarFK_IdProductoPedidoDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdTipoProcesoProduPedidoDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidodetaproduConstantesFunciones.mostrarFK_IdTipoProcesoProduPedidoDetaProdu);
			if(!this.pedidodetaproduConstantesFunciones.mostrarFK_IdTipoProcesoProduPedidoDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadPedidoDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidodetaproduConstantesFunciones.mostrarFK_IdUnidadPedidoDetaProdu);
			if(!this.pedidodetaproduConstantesFunciones.mostrarFK_IdUnidadPedidoDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoDetaProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPedidoDetaProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPedidoDetaProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaPedidoDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidodetaproduConstantesFunciones.activarFK_IdBodegaPedidoDetaProdu);
				this.jTabbedPaneBusquedasPedidoDetaProdu.setEnabledAt(index,this.pedidodetaproduConstantesFunciones.activarFK_IdBodegaPedidoDetaProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaDestinoPedidoDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidodetaproduConstantesFunciones.activarFK_IdBodegaDestinoPedidoDetaProdu);
				this.jTabbedPaneBusquedasPedidoDetaProdu.setEnabledAt(index,this.pedidodetaproduConstantesFunciones.activarFK_IdBodegaDestinoPedidoDetaProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdPedidoProduPedidoDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidodetaproduConstantesFunciones.activarFK_IdPedidoProduPedidoDetaProdu);
				this.jTabbedPaneBusquedasPedidoDetaProdu.setEnabledAt(index,this.pedidodetaproduConstantesFunciones.activarFK_IdPedidoProduPedidoDetaProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdProductoPedidoDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidodetaproduConstantesFunciones.activarFK_IdProductoPedidoDetaProdu);
				this.jTabbedPaneBusquedasPedidoDetaProdu.setEnabledAt(index,this.pedidodetaproduConstantesFunciones.activarFK_IdProductoPedidoDetaProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdTipoProcesoProduPedidoDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidodetaproduConstantesFunciones.activarFK_IdTipoProcesoProduPedidoDetaProdu);
				this.jTabbedPaneBusquedasPedidoDetaProdu.setEnabledAt(index,this.pedidodetaproduConstantesFunciones.activarFK_IdTipoProcesoProduPedidoDetaProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadPedidoDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidodetaproduConstantesFunciones.activarFK_IdUnidadPedidoDetaProdu);
				this.jTabbedPaneBusquedasPedidoDetaProdu.setEnabledAt(index,this.pedidodetaproduConstantesFunciones.activarFK_IdUnidadPedidoDetaProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPedidoDetaProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaPedidoDetaProdu);

			this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);

			this.pedidodetaproduConstantesFunciones.setResaltarFK_IdBodegaPedidoDetaProdu(resaltar);

			jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdBodegaPedidoDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodegaDestino")) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaDestinoPedidoDetaProdu);

			this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);

			this.pedidodetaproduConstantesFunciones.setResaltarFK_IdBodegaDestinoPedidoDetaProdu(resaltar);

			jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdBodegaDestinoPedidoDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPedidoProdu")) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdPedidoProduPedidoDetaProdu);

			this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);

			this.pedidodetaproduConstantesFunciones.setResaltarFK_IdPedidoProduPedidoDetaProdu(resaltar);

			jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdPedidoProduPedidoDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdProductoPedidoDetaProdu);

			this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);

			this.pedidodetaproduConstantesFunciones.setResaltarFK_IdProductoPedidoDetaProdu(resaltar);

			jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdProductoPedidoDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoProcesoProdu")) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdTipoProcesoProduPedidoDetaProdu);

			this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);

			this.pedidodetaproduConstantesFunciones.setResaltarFK_IdTipoProcesoProduPedidoDetaProdu(resaltar);

			jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdTipoProcesoProduPedidoDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasPedidoDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadPedidoDetaProdu);

			this.jTabbedPaneBusquedasPedidoDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoDetaProdu.getComponent(index);

			this.pedidodetaproduConstantesFunciones.setResaltarFK_IdUnidadPedidoDetaProdu(resaltar);

			jPanel.setBorder(this.pedidodetaproduConstantesFunciones.resaltarFK_IdUnidadPedidoDetaProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPedidoDetaProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPedidoDetaProdu() throws Exception {

		if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPedidoDetaProdu();
		this.updateVisibilidadResaltarControlesFormularioPedidoDetaProdu();
		this.updateHabilitarResaltarControlesFormularioPedidoDetaProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioPedidoDetaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pedidodetaproduConstantesFunciones.resaltaridPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltaridPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_empresaPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_empresaPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_sucursalPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_sucursalPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_ejercicioPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_ejercicioPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_periodoPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_periodoPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_pedido_produPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_pedido_produPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_bodegaPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_bodegaPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_productoPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_productoPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_unidadPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_unidadPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_bodega_destinoPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_bodega_destinoPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarid_tipo_proceso_produPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarid_tipo_proceso_produPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarcantidadPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarcantidadPedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltarcantidad_pendientePedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltarcantidad_pendientePedidoDetaProdu);}
		if(this.pedidodetaproduConstantesFunciones.resaltardescripcionPedidoDetaProdu!=null && this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setBorder(this.pedidodetaproduConstantesFunciones.resaltardescripcionPedidoDetaProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPedidoDetaProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
	
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostraridPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelidPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostraridPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_empresaPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_empresaPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_empresaPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_sucursalPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_sucursalPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_sucursalPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_ejercicioPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_ejercicioPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_ejercicioPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_periodoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_periodoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_periodoPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_pedido_produPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_pedido_produPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_pedido_produPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_bodegaPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_bodegaPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_bodegaPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_productoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_productoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_productoPedidoDetaProdu);
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_productoPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_unidadPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_unidadPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_unidadPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_bodega_destinoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_bodega_destinoPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_bodega_destinoPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_tipo_proceso_produPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelid_tipo_proceso_produPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarid_tipo_proceso_produPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarcantidadPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelcantidadPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarcantidadPedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarcantidad_pendientePedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPanelcantidad_pendientePedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrarcantidad_pendientePedidoDetaProdu);
		//this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrardescripcionPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jPaneldescripcionPedidoDetaProdu.setVisible(this.pedidodetaproduConstantesFunciones.mostrardescripcionPedidoDetaProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPedidoDetaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormPedidoDetaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidoDetaProdu!=null) {
	
		this.jInternalFrameDetalleFormPedidoDetaProdu.jLabelidPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activaridPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_empresaPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_empresaPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_sucursalPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_sucursalPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_ejercicioPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_ejercicioPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_periodoPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_periodoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_pedido_produPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_pedido_produPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodegaPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_bodegaPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_productoPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_productoPedidoDetaProdu);
			this.jInternalFrameDetalleFormPedidoDetaProdu.jButtonid_productoPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_productoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_unidadPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_unidadPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_bodega_destinoPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_bodega_destinoPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jComboBoxid_tipo_proceso_produPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarid_tipo_proceso_produPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidadPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarcantidadPedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTextFieldcantidad_pendientePedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activarcantidad_pendientePedidoDetaProdu);
		this.jInternalFrameDetalleFormPedidoDetaProdu.jTextAreadescripcionPedidoDetaProdu.setEnabled(this.pedidodetaproduConstantesFunciones.activardescripcionPedidoDetaProdu);
		}
	}
	
		
}