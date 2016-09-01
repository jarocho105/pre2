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

import com.bydan.erp.inventario.util.SerieProductoConstantesFunciones;
import com.bydan.erp.inventario.util.SerieProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.SerieProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.SerieProductoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SerieProductoBeanSwingJInternalFrame extends SerieProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SerieProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SerieProducto> serieproductoValidator = new ClassValidator<SerieProducto>(SerieProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SerieProducto serieproducto;	
	public SerieProducto serieproductoAux;
	public SerieProducto serieproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SerieProducto serieproductoTotales;
	public Long idSerieProductoActual;
	public Long iIdNuevoSerieProducto=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	
	

	public Boolean isTienePermisosDetalleSerieProducto=false;

	public Boolean getIsTienePermisosDetalleSerieProducto() {
		return isTienePermisosDetalleSerieProducto;
	}

	public void setIsTienePermisosDetalleSerieProducto(Boolean isTienePermisosDetalleSerieProducto) {
		this.isTienePermisosDetalleSerieProducto= isTienePermisosDetalleSerieProducto;
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
	
	public Boolean isPermisoTodoSerieProducto;
	public Boolean isPermisoNuevoSerieProducto;
	public Boolean isPermisoActualizarSerieProducto;
	public Boolean isPermisoActualizarOriginalSerieProducto;
	public Boolean isPermisoEliminarSerieProducto;
	public Boolean isPermisoGuardarCambiosSerieProducto;
	public Boolean isPermisoConsultaSerieProducto;
	public Boolean isPermisoBusquedaSerieProducto;
	public Boolean isPermisoReporteSerieProducto;
	public Boolean isPermisoPaginacionMedioSerieProducto;
	public Boolean isPermisoPaginacionAltoSerieProducto;
	public Boolean isPermisoPaginacionTodoSerieProducto;
	public Boolean isPermisoCopiarSerieProducto;
	public Boolean isPermisoVerFormSerieProducto;
	public Boolean isPermisoDuplicarSerieProducto;
	public Boolean isPermisoOrdenSerieProducto;
	
	
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
	
	public SerieProductoParameterReturnGeneral serieproductoReturnGeneral;
	public SerieProductoParameterReturnGeneral serieproductoParameterGeneral;
	
	

	public DetalleSerieProductoLogic detalleserieproductoLogic=null;

	public DetalleSerieProductoLogic getDetalleSerieProductoLogic() {
		return detalleserieproductoLogic;
	}

	public void setDetalleSerieProductoLogic(DetalleSerieProductoLogic detalleserieproductoLogic) {
		this.detalleserieproductoLogic = detalleserieproductoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSerieProducto=false;
	public Boolean esParaAccionDesdeFormularioSerieProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SerieProductoSessionBeanAdditional serieproductoSessionBeanAdditional=null;
	
	public SerieProductoSessionBeanAdditional getSerieProductoSessionBeanAdditional() {
		return this.serieproductoSessionBeanAdditional;
	}
	
	public void setSerieProductoSessionBeanAdditional(SerieProductoSessionBeanAdditional serieproductoSessionBeanAdditional) {
		try {
			this.serieproductoSessionBeanAdditional=serieproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SerieProductoBeanSwingJInternalFrameAdditional serieproductoBeanSwingJInternalFrameAdditional=null;
	//public class SerieProductoBeanSwingJInternalFrame
	
	public SerieProductoBeanSwingJInternalFrameAdditional getSerieProductoBeanSwingJInternalFrameAdditional() {
		return this.serieproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setSerieProductoBeanSwingJInternalFrameAdditional(SerieProductoBeanSwingJInternalFrameAdditional serieproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.serieproductoBeanSwingJInternalFrameAdditional=serieproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SerieProductoLogic serieproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SerieProducto serieproductoBean;
	public SerieProductoConstantesFunciones serieproductoConstantesFunciones;
	//public SerieProductoParameterReturnGeneral serieproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<SerieProducto> serieproductos;	
	//public List<SerieProducto> serieproductosEliminados;
	//public List<SerieProducto> serieproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSerieProducto=false;
	public Boolean isVisibilidadCeldaDuplicarSerieProducto=true;
	public Boolean isVisibilidadCeldaCopiarSerieProducto=true;
	public Boolean isVisibilidadCeldaVerFormSerieProducto=true;
	public Boolean isVisibilidadCeldaOrdenSerieProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
	public Boolean isVisibilidadCeldaModificarSerieProducto=false;
	public Boolean isVisibilidadCeldaActualizarSerieProducto=false;
	public Boolean isVisibilidadCeldaEliminarSerieProducto=false;
	public Boolean isVisibilidadCeldaCancelarSerieProducto=false;
	public Boolean isVisibilidadCeldaGuardarSerieProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSerieProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorFechaCompra=false;
	public Boolean isVisibilidadBusquedaPorFechaEntrega=false;
	public Boolean isVisibilidadBusquedaPorFechaVenta=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	
	public Long getiIdNuevoSerieProducto() {
		return this.iIdNuevoSerieProducto;
	}

	public void setiIdNuevoSerieProducto(Long iIdNuevoSerieProducto) {
		this.iIdNuevoSerieProducto = iIdNuevoSerieProducto;
	}
	
	public Long getidSerieProductoActual() {
		return this.idSerieProductoActual;
	}

	public void setidSerieProductoActual(Long idSerieProductoActual) {
		this.idSerieProductoActual = idSerieProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SerieProducto getserieproducto() {
		return this.serieproducto;
	}

	public void setserieproducto(SerieProducto serieproducto) {
		this.serieproducto = serieproducto;
	}
	
	public SerieProducto getserieproductoAux() {
		return this.serieproductoAux;
	}

	public void setserieproductoAux(SerieProducto serieproductoAux) {
		this.serieproductoAux = serieproductoAux;
	}				
	
	public SerieProducto getserieproductoAnterior() {
		return this.serieproductoAnterior;
	}

	public void setserieproductoAnterior(SerieProducto serieproductoAnterior) {
		this.serieproductoAnterior = serieproductoAnterior;
	}	
	
	public SerieProducto getserieproductoTotales() {
		return this.serieproductoTotales;
	}

	public void setserieproductoTotales(SerieProducto serieproductoTotales) {
		this.serieproductoTotales = serieproductoTotales;
	}	
	
	public SerieProducto getserieproductoBean() {
		return this.serieproductoBean;
	}

	public void setserieproductoBean(SerieProducto serieproductoBean) {
		this.serieproductoBean = serieproductoBean;
	}	
	
	public SerieProductoParameterReturnGeneral getserieproductoReturnGeneral() {
		return this.serieproductoReturnGeneral;
	}

	public void setserieproductoReturnGeneral(SerieProductoParameterReturnGeneral serieproductoReturnGeneral) {
		this.serieproductoReturnGeneral = serieproductoReturnGeneral;
	}	
	
	
	public Double codigoBusquedaPorCodigo=0.0;

	public Double getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(Double codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Date fecha_compraBusquedaPorFechaCompra=new Date();

	public Date getfecha_compraBusquedaPorFechaCompra() {
		return this.fecha_compraBusquedaPorFechaCompra;
	}

	public void setfecha_compraBusquedaPorFechaCompra(Date fecha_compraBusquedaPorFechaCompra) {
		this.fecha_compraBusquedaPorFechaCompra = fecha_compraBusquedaPorFechaCompra;
	}

	public Date fecha_entregaBusquedaPorFechaEntrega=new Date();

	public Date getfecha_entregaBusquedaPorFechaEntrega() {
		return this.fecha_entregaBusquedaPorFechaEntrega;
	}

	public void setfecha_entregaBusquedaPorFechaEntrega(Date fecha_entregaBusquedaPorFechaEntrega) {
		this.fecha_entregaBusquedaPorFechaEntrega = fecha_entregaBusquedaPorFechaEntrega;
	}

	public Date fecha_ventaBusquedaPorFechaVenta=new Date();

	public Date getfecha_ventaBusquedaPorFechaVenta() {
		return this.fecha_ventaBusquedaPorFechaVenta;
	}

	public void setfecha_ventaBusquedaPorFechaVenta(Date fecha_ventaBusquedaPorFechaVenta) {
		this.fecha_ventaBusquedaPorFechaVenta = fecha_ventaBusquedaPorFechaVenta;
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

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SerieProductoLogic getSerieProductoLogic()	{		
		return serieproductoLogic;
	}

	public void setSerieProductoLogic(SerieProductoLogic serieproductoLogic) {
		this.serieproductoLogic = serieproductoLogic;
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
	
	public Boolean getIsEsNuevoSerieProducto() {
		return isEsNuevoSerieProducto;
	}

	public void setIsEsNuevoSerieProducto(Boolean isEsNuevoSerieProducto) {
		this.isEsNuevoSerieProducto = isEsNuevoSerieProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioSerieProducto() {
		return esParaAccionDesdeFormularioSerieProducto;
	}
	
	public void setEsParaAccionDesdeFormularioSerieProducto(Boolean esParaAccionDesdeFormularioSerieProducto) {
		this.esParaAccionDesdeFormularioSerieProducto = esParaAccionDesdeFormularioSerieProducto;
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

			if(this.serieproductoSessionBean==null) {
				this.serieproductoSessionBean=new SerieProductoSessionBean();
			}

			if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(serieproductoSessionBean.getlidEmpresaActual());
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

			if(this.serieproductoSessionBean==null) {
				this.serieproductoSessionBean=new SerieProductoSessionBean();
			}

			if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(serieproductoSessionBean.getlidBodegaActual());
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

			if(this.serieproductoSessionBean==null) {
				this.serieproductoSessionBean=new SerieProductoSessionBean();
			}

			if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(serieproductoSessionBean.getlidProductoActual());
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

					if(this.serieproducto!=null) {
						this.serieproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSerieProducto!=null) {
						this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSerieProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSerieProducto!=null) {
						if(this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSerieProductoGenerico)throws Exception
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
				jComboBoxid_empresaSerieProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSerieProductoGenerico!=null && jComboBoxid_empresaSerieProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaSerieProductoGenerico.setSelectedIndex(0);
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

					if(this.serieproducto!=null) {
						this.serieproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormSerieProducto!=null) {
						this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaSerieProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormSerieProducto!=null) {
						if(this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaSerieProducto!=null) {
						jComboBoxid_bodegaFK_IdBodegaSerieProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaSerieProducto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaSerieProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaSerieProducto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaSerieProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaSerieProductoGenerico)throws Exception
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
				jComboBoxid_bodegaSerieProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaSerieProductoGenerico!=null && jComboBoxid_bodegaSerieProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaSerieProductoGenerico.setSelectedIndex(0);
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

					if(this.serieproducto!=null) {
						this.serieproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormSerieProducto!=null) {
						this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoSerieProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormSerieProducto!=null) {
						if(this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoSerieProductoGenerico)throws Exception
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
				jComboBoxid_productoSerieProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoSerieProductoGenerico!=null && jComboBoxid_productoSerieProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoSerieProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SerieProducto serieproducto,JComboBox jComboBoxid_empresaSerieProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSerieProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSerieProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				serieproducto.setid_empresa(empresaAux.getId());
				serieproducto.setempresa_descripcion(SerieProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				serieproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(SerieProducto serieproducto,JComboBox jComboBoxid_bodegaSerieProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaSerieProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaSerieProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				serieproducto.setid_bodega(bodegaAux.getId());
				serieproducto.setbodega_descripcion(SerieProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				serieproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(SerieProducto serieproducto,JComboBox jComboBoxid_productoSerieProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoSerieProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoSerieProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				serieproducto.setid_producto(productoAux.getId());
				serieproducto.setproducto_descripcion(SerieProductoConstantesFunciones.getProductoDescripcion(productoAux));
				serieproducto.setProducto(productoAux);			}
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

					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) { 
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSerieProducto!=null) { 
					}

					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) { 
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSerieProducto!=null) { 
					}

					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaSerieProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaSerieProducto.addItem(bodega);
							}
						}

						if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) { 
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSerieProducto!=null) { 
					}

					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSerieProducto!=null) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaSerieProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaSerieProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSerieProducto!=null) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormSerieProducto!=null) {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSerieProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SerieProductoConstantesFunciones.refrescarForeignKeysDescripcionesSerieProducto(this.serieproductoLogic.getSerieProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SerieProductoConstantesFunciones.refrescarForeignKeysDescripcionesSerieProducto(this.serieproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//serieproductoLogic.setSerieProductos(this.serieproductos);
			serieproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SerieProductoParameterReturnGeneral getSerieProductoParameterGeneral() {
		return this.serieproductoParameterGeneral;
	}
	
	public void setSerieProductoParameterGeneral(SerieProductoParameterReturnGeneral serieproductoParameterGeneral) {
		this.serieproductoParameterGeneral = serieproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSerieProducto() {
		return isPermisoTodoSerieProducto;
	}

	public void setIsPermisoTodoSerieProducto(Boolean isPermisoTodoSerieProducto) {
		this.isPermisoTodoSerieProducto = isPermisoTodoSerieProducto;
	}

	public Boolean getIsPermisoNuevoSerieProducto() {
		return isPermisoNuevoSerieProducto;
	}

	public void setIsPermisoNuevoSerieProducto(Boolean isPermisoNuevoSerieProducto) {
		this.isPermisoNuevoSerieProducto = isPermisoNuevoSerieProducto;
	}

	public Boolean getIsPermisoActualizarSerieProducto() {
		return isPermisoActualizarSerieProducto;
	}

	public void setIsPermisoActualizarSerieProducto(Boolean isPermisoActualizarSerieProducto) {
		this.isPermisoActualizarSerieProducto = isPermisoActualizarSerieProducto;
	}

	public Boolean getIsPermisoEliminarSerieProducto() {
		return isPermisoEliminarSerieProducto;
	}

	public void setIsPermisoEliminarSerieProducto(Boolean isPermisoEliminarSerieProducto) {
		this.isPermisoEliminarSerieProducto = isPermisoEliminarSerieProducto;
	}

	public Boolean getIsPermisoGuardarCambiosSerieProducto() {
		return isPermisoGuardarCambiosSerieProducto;
	}

	public void setIsPermisoGuardarCambiosSerieProducto(Boolean isPermisoGuardarCambiosSerieProducto) {
		this.isPermisoGuardarCambiosSerieProducto = isPermisoGuardarCambiosSerieProducto;
	}
	
	public Boolean getIsPermisoConsultaSerieProducto() {
		return isPermisoConsultaSerieProducto;
	}

	public void setIsPermisoConsultaSerieProducto(Boolean isPermisoConsultaSerieProducto) {
		this.isPermisoConsultaSerieProducto = isPermisoConsultaSerieProducto;
	}

	public Boolean getIsPermisoBusquedaSerieProducto() {
		return isPermisoBusquedaSerieProducto;
	}

	public void setIsPermisoBusquedaSerieProducto(Boolean isPermisoBusquedaSerieProducto) {
		this.isPermisoBusquedaSerieProducto = isPermisoBusquedaSerieProducto;
	}

	public Boolean getIsPermisoReporteSerieProducto() {
		return isPermisoReporteSerieProducto;
	}

	public void setIsPermisoReporteSerieProducto(Boolean isPermisoReporteSerieProducto) {
		this.isPermisoReporteSerieProducto = isPermisoReporteSerieProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioSerieProducto() {
		return isPermisoPaginacionMedioSerieProducto;
	}

	public void setIsPermisoPaginacionMedioSerieProducto(Boolean isPermisoPaginacionMedioSerieProducto) {
		this.isPermisoPaginacionMedioSerieProducto = isPermisoPaginacionMedioSerieProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoSerieProducto() {
		return isPermisoPaginacionTodoSerieProducto;
	}

	public void setIsPermisoPaginacionTodoSerieProducto(Boolean isPermisoPaginacionTodoSerieProducto) {
		this.isPermisoPaginacionTodoSerieProducto = isPermisoPaginacionTodoSerieProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoSerieProducto() {
		return isPermisoPaginacionAltoSerieProducto;
	}

	public void setIsPermisoPaginacionAltoSerieProducto(Boolean isPermisoPaginacionAltoSerieProducto) {
		this.isPermisoPaginacionAltoSerieProducto = isPermisoPaginacionAltoSerieProducto;
	}
	
	public Boolean getIsPermisoCopiarSerieProducto() {
		return isPermisoCopiarSerieProducto;
	}

	public void setIsPermisoCopiarSerieProducto(Boolean isPermisoCopiarSerieProducto) {
		this.isPermisoCopiarSerieProducto = isPermisoCopiarSerieProducto;
	}
	
	public Boolean getIsPermisoVerFormSerieProducto() {
		return isPermisoVerFormSerieProducto;
	}

	public void setIsPermisoVerFormSerieProducto(Boolean isPermisoVerFormSerieProducto) {
		this.isPermisoVerFormSerieProducto = isPermisoVerFormSerieProducto;
	}
	
	public Boolean getIsPermisoDuplicarSerieProducto() {
		return isPermisoDuplicarSerieProducto;
	}

	public void setIsPermisoDuplicarSerieProducto(Boolean isPermisoDuplicarSerieProducto) {
		this.isPermisoDuplicarSerieProducto = isPermisoDuplicarSerieProducto;
	}
	
	public Boolean getIsPermisoOrdenSerieProducto() {
		return isPermisoOrdenSerieProducto;
	}

	public void setIsPermisoOrdenSerieProducto(Boolean isPermisoOrdenSerieProducto) {
		this.isPermisoOrdenSerieProducto = isPermisoOrdenSerieProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSerieProducto() {
		return isVisibilidadCeldaNuevoSerieProducto;
	}

	public void setIsVisibilidadCeldaNuevoSerieProducto(Boolean isVisibilidadCeldaNuevoSerieProducto) {
		this.isVisibilidadCeldaNuevoSerieProducto = isVisibilidadCeldaNuevoSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSerieProducto() {
		return isVisibilidadCeldaDuplicarSerieProducto;
	}

	public void setIsVisibilidadCeldaDuplicarSerieProducto(Boolean isVisibilidadCeldaDuplicarSerieProducto) {
		this.isVisibilidadCeldaDuplicarSerieProducto = isVisibilidadCeldaDuplicarSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSerieProducto() {
		return isVisibilidadCeldaCopiarSerieProducto;
	}

	public void setIsVisibilidadCeldaCopiarSerieProducto(Boolean isVisibilidadCeldaCopiarSerieProducto) {
		this.isVisibilidadCeldaCopiarSerieProducto = isVisibilidadCeldaCopiarSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSerieProducto() {
		return isVisibilidadCeldaVerFormSerieProducto;
	}

	public void setIsVisibilidadCeldaVerFormSerieProducto(Boolean isVisibilidadCeldaVerFormSerieProducto) {
		this.isVisibilidadCeldaVerFormSerieProducto = isVisibilidadCeldaVerFormSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSerieProducto() {
		return isVisibilidadCeldaOrdenSerieProducto;
	}

	public void setIsVisibilidadCeldaOrdenSerieProducto(Boolean isVisibilidadCeldaOrdenSerieProducto) {
		this.isVisibilidadCeldaOrdenSerieProducto = isVisibilidadCeldaOrdenSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSerieProducto() {
		return isVisibilidadCeldaNuevoRelacionesSerieProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSerieProducto(Boolean isVisibilidadCeldaNuevoRelacionesSerieProducto) {
		this.isVisibilidadCeldaNuevoRelacionesSerieProducto = isVisibilidadCeldaNuevoRelacionesSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSerieProducto() {
		return isVisibilidadCeldaModificarSerieProducto;
	}

	public void setIsVisibilidadCeldaModificarSerieProducto(Boolean isVisibilidadCeldaModificarSerieProducto) {
		this.isVisibilidadCeldaModificarSerieProducto = isVisibilidadCeldaModificarSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSerieProducto() {
		return isVisibilidadCeldaActualizarSerieProducto;
	}

	public void setIsVisibilidadCeldaActualizarSerieProducto(Boolean isVisibilidadCeldaActualizarSerieProducto) {
		this.isVisibilidadCeldaActualizarSerieProducto = isVisibilidadCeldaActualizarSerieProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarSerieProducto() {
		return isVisibilidadCeldaEliminarSerieProducto;
	}

	public void setIsVisibilidadCeldaEliminarSerieProducto(Boolean isVisibilidadCeldaEliminarSerieProducto) {
		this.isVisibilidadCeldaEliminarSerieProducto = isVisibilidadCeldaEliminarSerieProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarSerieProducto() {
		return isVisibilidadCeldaCancelarSerieProducto;
	}

	public void setIsVisibilidadCeldaCancelarSerieProducto(Boolean isVisibilidadCeldaCancelarSerieProducto) {
		this.isVisibilidadCeldaCancelarSerieProducto = isVisibilidadCeldaCancelarSerieProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarSerieProducto() {
		return isVisibilidadCeldaGuardarSerieProducto;
	}

	public void setIsVisibilidadCeldaGuardarSerieProducto(Boolean isVisibilidadCeldaGuardarSerieProducto) {
		this.isVisibilidadCeldaGuardarSerieProducto = isVisibilidadCeldaGuardarSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSerieProducto() {
		return isVisibilidadCeldaGuardarCambiosSerieProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSerieProducto(Boolean isVisibilidadCeldaGuardarCambiosSerieProducto) {
		this.isVisibilidadCeldaGuardarCambiosSerieProducto = isVisibilidadCeldaGuardarCambiosSerieProducto;
	}
		
	public SerieProductoSessionBean getserieproductoSessionBean() {
		return this.serieproductoSessionBean;
	}
	
	public void setserieproductoSessionBean(SerieProductoSessionBean serieproductoSessionBean) {
		this.serieproductoSessionBean=serieproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorFechaCompra() {
		return this.isVisibilidadBusquedaPorFechaCompra;
	}

	public void setisVisibilidadBusquedaPorFechaCompra(Boolean isVisibilidadBusquedaPorFechaCompra) {
		this.isVisibilidadBusquedaPorFechaCompra=isVisibilidadBusquedaPorFechaCompra;
	}

	public Boolean getisVisibilidadBusquedaPorFechaEntrega() {
		return this.isVisibilidadBusquedaPorFechaEntrega;
	}

	public void setisVisibilidadBusquedaPorFechaEntrega(Boolean isVisibilidadBusquedaPorFechaEntrega) {
		this.isVisibilidadBusquedaPorFechaEntrega=isVisibilidadBusquedaPorFechaEntrega;
	}

	public Boolean getisVisibilidadBusquedaPorFechaVenta() {
		return this.isVisibilidadBusquedaPorFechaVenta;
	}

	public void setisVisibilidadBusquedaPorFechaVenta(Boolean isVisibilidadBusquedaPorFechaVenta) {
		this.isVisibilidadBusquedaPorFechaVenta=isVisibilidadBusquedaPorFechaVenta;
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

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSerieProducto(SerieProducto serieproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(serieproducto,null);
				this.setActualParaGuardarBodegaForeignKey(serieproducto,null);
				this.setActualParaGuardarProductoForeignKey(serieproducto,null);
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
	
	public void bugActualizarReferenciaActual(SerieProducto serieproducto,SerieProducto serieproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSerieProducto(serieproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		serieproductoAux.setId(serieproducto.getId());
		serieproductoAux.setVersionRow(serieproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSerieProducto();
		
			int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = serieproductoValidator.getInvalidValues(this.serieproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			serieproductoLogic.setDatosCliente(datosCliente);
			serieproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				serieproductoAux=new  SerieProducto();
				
				serieproductoAux.setIsNew(true);
				serieproductoAux.setIsChanged(true);
				
				serieproductoAux.setSerieProductoOriginal(this.serieproducto);
				
				serieproductoAux.setId(this.serieproducto.getId());	
				serieproductoAux.setVersionRow(this.serieproducto.getVersionRow());	
				serieproductoAux.setid_empresa(this.serieproducto.getid_empresa());	
				serieproductoAux.setid_bodega(this.serieproducto.getid_bodega());	
				serieproductoAux.setid_producto(this.serieproducto.getid_producto());	
				serieproductoAux.setcodigo(this.serieproducto.getcodigo());	
				serieproductoAux.setfecha_compra(this.serieproducto.getfecha_compra());	
				serieproductoAux.setfecha_entrega(this.serieproducto.getfecha_entrega());	
				serieproductoAux.setfecha_venta(this.serieproducto.getfecha_venta());	
				serieproductoAux.setdescripcion(this.serieproducto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.serieproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(serieproductoAux,serieproductoLogic.getSerieProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(serieproductoAux,serieproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.serieproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.saveSerieProductos();//WithConnection
						//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.serieproducto,serieproductoAux);
					
					this.refrescarForeignKeysDescripcionesSerieProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos().addAll(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos.addAll(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								serieproductoLogic.saveSerieProductoRelaciones(serieproductoAux,this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());//WithConnection
								//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.serieproducto,serieproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos= new ArrayList<DetalleSerieProducto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							serieproductoAux.setDetalleSerieProductos(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.serieproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(serieproductoAux,serieproductoLogic.getSerieProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(serieproductoAux,serieproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.serieproducto,serieproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				serieproductoAux=new  SerieProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.serieproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.serieproductoSessionBean.getEsGuardarRelacionado() && this.serieproducto.getId()>=0)) {
						
					serieproductoAux.setIsNew(false);
				}
				
				serieproductoAux.setIsDeleted(false);
			
				serieproductoAux.setId(this.serieproducto.getId());	
				serieproductoAux.setVersionRow(this.serieproducto.getVersionRow());	
				serieproductoAux.setid_empresa(this.serieproducto.getid_empresa());	
				serieproductoAux.setid_bodega(this.serieproducto.getid_bodega());	
				serieproductoAux.setid_producto(this.serieproducto.getid_producto());	
				serieproductoAux.setcodigo(this.serieproducto.getcodigo());	
				serieproductoAux.setfecha_compra(this.serieproducto.getfecha_compra());	
				serieproductoAux.setfecha_entrega(this.serieproducto.getfecha_entrega());	
				serieproductoAux.setfecha_venta(this.serieproducto.getfecha_venta());	
				serieproductoAux.setdescripcion(this.serieproducto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(serieproductoAux,serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(serieproductoAux,serieproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.serieproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.saveSerieProductos();//WithConnection
						//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.serieproducto,serieproductoAux);
					
					this.refrescarForeignKeysDescripcionesSerieProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos().addAll(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos.addAll(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								serieproductoLogic.saveSerieProductoRelaciones(serieproductoAux,this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());//WithConnection
								//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.serieproducto,serieproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos= new ArrayList<DetalleSerieProducto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							serieproductoAux.setDetalleSerieProductos(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.serieproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(serieproductoAux,serieproductoLogic.getSerieProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(serieproductoAux,serieproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.serieproducto,serieproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				serieproductoAux=new  SerieProducto();
				
				serieproductoAux.setIsNew(false);
				serieproductoAux.setIsChanged(false);
				
				serieproductoAux.setIsDeleted(true);
				
				serieproductoAux.setId(this.serieproducto.getId());	
				serieproductoAux.setVersionRow(this.serieproducto.getVersionRow());	
				serieproductoAux.setid_empresa(this.serieproducto.getid_empresa());	
				serieproductoAux.setid_bodega(this.serieproducto.getid_bodega());	
				serieproductoAux.setid_producto(this.serieproducto.getid_producto());	
				serieproductoAux.setcodigo(this.serieproducto.getcodigo());	
				serieproductoAux.setfecha_compra(this.serieproducto.getfecha_compra());	
				serieproductoAux.setfecha_entrega(this.serieproducto.getfecha_entrega());	
				serieproductoAux.setfecha_venta(this.serieproducto.getfecha_venta());	
				serieproductoAux.setdescripcion(this.serieproducto.getdescripcion());	
				
				if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.serieproductoAux.getId()>=0) {	
						this.serieproductosEliminados.add(serieproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(serieproductoAux,serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(serieproductoAux,serieproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.serieproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.saveSerieProductos();//WithConnection
						//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos().addAll(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos.addAll(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								serieproductoLogic.saveSerieProductoRelaciones(serieproductoAux,this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());//WithConnection
								//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos= new ArrayList<DetalleSerieProducto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.quitarFilaTotales();}
							serieproductoAux.setDetalleSerieProductos(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.serieproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(serieproductoAux,serieproductoLogic.getSerieProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(serieproductoAux,serieproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getSerieProductos().addAll(this.serieproductosEliminados);
					
					serieproductoLogic.saveSerieProductos();//WithConnection
					//serieproductoLogic.getSetVersionRowSerieProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSerieProducto();
				
				this.serieproductosEliminados= new ArrayList<SerieProducto>();		
			}
			
			if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Serie Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.serieproducto=serieproductoAux;
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
      		//this.finishProcessSerieProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(SerieProducto serieproductoLocal) throws Exception {
		
		if(this.serieproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				serieproductoLocal.setDetalleSerieProductos(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());
			
			} else {
			
				serieproductoLocal.setDetalleSerieProductos(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SerieProducto serieproductoLocal) throws Exception {	
		if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				serieproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				serieproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				serieproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSerieProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = serieproductoValidator.getInvalidValues(this.serieproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SerieProducto serieproducto,List<SerieProducto> serieproductos) throws Exception {
		try	{		
			SerieProductoConstantesFunciones.actualizarLista(serieproducto,serieproductos,this.serieproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SerieProducto serieproducto,List<SerieProducto> serieproductos) throws Exception {
		try	{			
			SerieProductoConstantesFunciones.actualizarSelectedLista(serieproducto,serieproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SerieProducto> serieproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				serieproductosLocal=this.serieproductoLogic.getSerieProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				serieproductosLocal=this.serieproductos;
			}
			//ARCHITECTURE
		
			for(SerieProducto serieproductoLocal:serieproductosLocal) {
				if(this.permiteMantenimiento(serieproductoLocal) && serieproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SerieProductoConstantesFunciones.getSerieProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelid_empresaSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelid_bodegaSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelid_productoSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelcodigoSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_compraSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_entregaSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.FECHAVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_ventaSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SerieProductoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabeldescripcionSerieProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelid_empresaSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelid_bodegaSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelid_productoSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelcodigoSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_compraSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_entregaSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_ventaSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSerieProducto.jLabeldescripcionSerieProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleSerieProducto")) {
			if(this.serieproducto==null) {
				this.serieproducto= new SerieProducto();
			}

			if(this.serieproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSerieProducto
				this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);

				this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.getdetalleserieproducto().setSerieProducto(this.serieproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSerieProducto--;	
		
		
		this.serieproductoAux=new SerieProducto();
		
		this.serieproductoAux.setId(this.iIdNuevoSerieProducto);
		this.serieproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.serieproductoLogic.getSerieProductos().add(this.serieproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.serieproductos.add(this.serieproductoAux);
		}
		//ARCHITECTURE
		
		this.serieproducto=this.serieproductoAux;
		
		if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSerieProducto(this.serieproducto);
			this.setVariablesObjetoActualToFormularioForeignKeySerieProducto(this.serieproducto);
		}
				
		//this.setDefaultControlesSerieProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySerieProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySerieProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySerieProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSerieProducto(this.serieproductoBean,this.serieproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SerieProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
			classes=SerieProductoConstantesFunciones.getClassesRelationshipsOfSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.serieproductoReturnGeneral=serieproductoLogic.procesarEventosSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.serieproductoLogic.getSerieProductos(),this.serieproducto,this.serieproductoParameterGeneral,this.isEsNuevoSerieProducto,classes);//this.serieproductoLogic.getSerieProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSerieProducto(this.serieproductoReturnGeneral,this.serieproductoBean,false);
		
		if(this.serieproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySerieProducto(this.serieproductoReturnGeneral.getSerieProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSerieProducto(this.serieproductoReturnGeneral.getSerieProducto());
		}
		
		if(this.serieproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSerieProducto(this.serieproductoReturnGeneral.getSerieProducto(),classes);//this.serieproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySerieProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySerieProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SerieProductoBeanSwingJInternalFrameAdditional.RecargarFormSerieProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSerieProducto(false);
						
			if(serieproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.getEsGuardarRelacionado() && DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleSerieProductoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSerieProducto();
			}
			
			this.actualizarVisualTableDatosSerieProducto();
			
			this.jTableDatosSerieProducto.setRowSelectionInterval(this.getIndiceNuevoSerieProducto(), this.getIndiceNuevoSerieProducto());
			
			this.seleccionarFilaTablaSerieProductoActual();
						
			this.actualizarEstadoCeldasBotonesSerieProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSerieProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarcodigoSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarfecha_compraSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarfecha_entregaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarfecha_ventaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activardescripcionSerieProducto);	
		//
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarid_empresaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarid_bodegaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setEnabled(isHabilitar && this.serieproductoConstantesFunciones.activarid_productoSerieProducto);
	};
	
	public void setDefaultControlesSerieProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSerieProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.serieproductoSessionBean.setConGuardarRelaciones(true);			
			this.serieproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.serieproductoSessionBean.setConGuardarRelaciones(false);			
			this.serieproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSerieProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
				if(serieproductoAux.getId().equals(this.iIdNuevoSerieProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SerieProducto serieproductoAux:this.serieproductos) {
				if(serieproductoAux.getId().equals(this.iIdNuevoSerieProducto)) {
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
	
	public int getIndiceActualSerieProducto(SerieProducto serieproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
				if(serieproductoAux.getId().equals(serieproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SerieProducto serieproductoAux:this.serieproductos) {
				if(serieproductoAux.getId().equals(serieproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSerieProducto(SerieProducto serieproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
				if(serieproductoAux.getSerieProductoOriginal().getId().equals(serieproductoOriginal.getId())) {
					existe=true;
					serieproductoOriginal.setId(serieproductoAux.getId());
					serieproductoOriginal.setVersionRow(serieproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SerieProducto serieproductoAux:this.serieproductos) {
				if(serieproductoAux.getSerieProductoOriginal().getId().equals(serieproductoOriginal.getId())) {
					existe=true;
					serieproductoOriginal.setId(serieproductoAux.getId());
					serieproductoOriginal.setVersionRow(serieproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSerieProducto(Boolean esParaCancelar) throws Exception {
		serieproductosAux=new ArrayList<SerieProducto>();
		serieproductoAux=new SerieProducto();
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
					if(serieproductoAux.getId()<0) {
						serieproductosAux.add(serieproductoAux);
					}		
				}
				this.iIdNuevoSerieProducto=0L;
				this.serieproductoLogic.getSerieProductos().removeAll(serieproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SerieProducto serieproductoAux:this.serieproductos) {
					if(serieproductoAux.getId()<0) {
						serieproductosAux.add(serieproductoAux);
					}		
				}
				this.iIdNuevoSerieProducto=0L;
				this.serieproductos.removeAll(serieproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSerieProducto 
					&& this.serieproductoLogic.getSerieProductos().size()>0
					) {
					serieproductoAux=this.serieproductoLogic.getSerieProductos().get(this.serieproductoLogic.getSerieProductos().size() - 1);
				
					if(serieproductoAux.getId()<0) {
						this.serieproductoLogic.getSerieProductos().remove(serieproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSerieProducto && this.serieproductos.size()>0) {
					serieproductoAux=this.serieproductos.get(this.serieproductos.size() - 1);
				
					if(serieproductoAux.getId()<0) {
						this.serieproductos.remove(serieproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSerieProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(serieproducto.getId()<0) {
				this.serieproductoLogic.getSerieProductos().remove(this.serieproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(serieproducto.getId()<0) {
				this.serieproductos.remove(this.serieproducto);
			}
		}			
	}
	
	public void setEstadosInicialesSerieProducto(List<SerieProducto> serieproductosAux) throws Exception {
		SerieProductoConstantesFunciones.setEstadosInicialesSerieProducto(serieproductosAux);
	}
	
	public void setEstadosInicialesSerieProducto(SerieProducto serieproductoAux) throws Exception {
		SerieProductoConstantesFunciones.setEstadosInicialesSerieProducto(serieproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSerieProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSerieProductoActual()) {
				if(!this.isEsNuevoSerieProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSerieProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSerieProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Serie Producto ?", "MANTENIMIENTO DE Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SerieProducto serieproducto) throws Exception {
		SerieProductoConstantesFunciones.seleccionarAsignar(this.serieproducto,serieproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSerieProducto=this.isPermisoActualizarOriginalSerieProducto;
			
			
			this.seleccionarAsignar(serieproducto);
			
			

			idProductoActual=serieproducto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SerieProductoConstantesFunciones.quitarEspaciosSerieProducto(this.serieproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSerieProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.serieproductoSessionBean.setsFuncionBusquedaRapida(this.serieproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoSerieProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSerieProducto(esParaCancelar);				
				this.cancelarNuevoSerieProducto(esParaCancelar);								
			}
			
			this.serieproducto=new SerieProducto();
			
			this.inicializarSerieProducto();
			
			this.actualizarEstadoCeldasBotonesSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSerieProducto() throws Exception {
		try {
			SerieProductoConstantesFunciones.inicializarSerieProducto(this.serieproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.serieproductoLogic.getSerieProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSerieProductos(String sAccionBusqueda,List<SerieProducto> serieproductosParaReportes) throws Exception {
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
					sPathReporteFinal="SerieProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SerieProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SerieProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SerieProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Serie Productos");		
		parameters.put("busquedapor", SerieProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleSerieProducto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					SerieProductoLogic serieproductoLogicAuxiliar=new SerieProductoLogic();
					serieproductoLogicAuxiliar.setDatosCliente(serieproductoLogic.getDatosCliente());				
					serieproductoLogicAuxiliar.setSerieProductos(serieproductosParaReportes);
					
					serieproductoLogicAuxiliar.cargarRelacionesLoteForeignKeySerieProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					serieproductosParaReportes=serieproductoLogicAuxiliar.getSerieProductos();
					
					//serieproductoLogic.getNewConnexionToDeep();
					
					//for (SerieProducto serieproducto:serieproductosParaReportes) {
					//	serieproductoLogic.deepLoad(serieproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//serieproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//serieproductoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleSerieProducto = AuxiliarReportes.class.getResourceAsStream("DetalleSerieProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleserieproducto", reportFileDetalleSerieProducto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSerieProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSerieProducto=new JRBeanArrayDataSource(SerieProductoJInternalFrame.TraerSerieProductoBeans(serieproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSerieProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SerieProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SerieProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SerieProductoBean.TraerSerieProductoBeans(serieproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteSerieProductos(sAccionBusqueda,sTipoArchivoReporte,serieproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSerieProductos(sAccionBusqueda,sTipoArchivoReporte,serieproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSerieProductoActionPerformed(null);
					//this.generarExcelReporteSerieProductos(sAccionBusqueda,sTipoArchivoReporte,serieproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSerieProductos(sAccionBusqueda,sTipoArchivoReporte,serieproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSerieProductos(sAccionBusqueda,sTipoArchivoReporte,serieproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSerieProductos(sAccionBusqueda,sTipoArchivoReporte,serieproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSerieProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SerieProducto> serieproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SerieProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSerieProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SerieProducto serieproducto : serieproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SerieProductoConstantesFunciones.generarExcelReporteDataSerieProducto("NORMAL",row,workbook,serieproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSerieProducto(String sTipo,Row row,Workbook workbook) {
		
		SerieProductoConstantesFunciones.generarExcelReporteHeaderSerieProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSerieProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SerieProducto> serieproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SerieProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SerieProducto serieproducto : serieproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SerieProductoConstantesFunciones.getSerieProductoDescripcion(serieproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_FECHAVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHAVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getfecha_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SerieProductoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SerieProductoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(serieproducto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSerieProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<SerieProducto> serieproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SerieProducto> serieproductosRespaldo=null;
		
		classes=SerieProductoConstantesFunciones.getClassesRelationshipsOfSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.serieproductoLogic.setDatosCliente(this.datosCliente);
		this.serieproductoLogic.setDatosDeep(this.datosDeep);
		this.serieproductoLogic.setIsConDeep(true);
		
		serieproductosRespaldo=this.serieproductoLogic.getSerieProductos();
		
		this.serieproductoLogic.setSerieProductos(serieproductosParaReportes);	
		this.serieproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		serieproductosParaReportes=this.serieproductoLogic.getSerieProductos();
		this.serieproductoLogic.setSerieProductos(serieproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SerieProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSerieProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SerieProducto serieproducto : serieproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSerieProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SerieProductoConstantesFunciones.generarExcelReporteDataSerieProducto("NORMAL",row,workbook,serieproducto,cellStyleDataAux);
		
			
			


				//DetalleSerieProducto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(serieproducto.getDetalleSerieProductos()!=null && serieproducto.getDetalleSerieProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleSerieProductoConstantesFunciones.generarExcelReporteHeaderDetalleSerieProducto("RELACIONADO",row,workbook);
				}

				if(serieproducto.getDetalleSerieProductos()!=null) {
					i2=0;
					for(DetalleSerieProducto detalleserieproducto : serieproducto.getDetalleSerieProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleSerieProductoConstantesFunciones.generarExcelReporteDataDetalleSerieProducto("RELACIONADO",row,workbook,detalleserieproducto,cellStyleDataAuxHijo);
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
		cell.setCellValue(SerieProductoConstantesFunciones.getSerieProductoDescripcion(serieproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSerieProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSerieProducto() throws Exception {		
		this.startProcessSerieProducto(true);
	}
	
	public void startProcessSerieProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSerieProducto ,this.jPanelParametrosReportesSerieProducto, this.jScrollPanelDatosSerieProducto,this.jPanelPaginacionSerieProducto, this.jScrollPanelDatosEdicionSerieProducto, this.jPanelAccionesSerieProducto,this.jPanelAccionesFormularioSerieProducto,this.jmenuBarSerieProducto,this.jmenuBarDetalleSerieProducto,this.jTtoolBarSerieProducto,this.jTtoolBarDetalleSerieProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasSerieProducto=this.jTabbedPaneBusquedasSerieProducto; 
		
		final JPanel jPanelParametrosReportesSerieProducto=this.jPanelParametrosReportesSerieProducto;
		//final JScrollPane jScrollPanelDatosSerieProducto=this.jScrollPanelDatosSerieProducto;
		final JTable jTableDatosSerieProducto=this.jTableDatosSerieProducto;		
		final JPanel jPanelPaginacionSerieProducto=this.jPanelPaginacionSerieProducto;
		//final JScrollPane jScrollPanelDatosEdicionSerieProducto=this.jScrollPanelDatosEdicionSerieProducto;
		final JPanel jPanelAccionesSerieProducto=this.jPanelAccionesSerieProducto;
		
		JPanel jPanelCamposAuxiliarSerieProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSerieProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			jPanelCamposAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jPanelCamposSerieProducto;
			jPanelAccionesFormularioAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jPanelAccionesFormularioSerieProducto;
		}
		
		final JPanel jPanelCamposSerieProducto=jPanelCamposAuxiliarSerieProducto;
		final JPanel jPanelAccionesFormularioSerieProducto=jPanelAccionesFormularioAuxiliarSerieProducto;
		
		
		final JMenuBar jmenuBarSerieProducto=this.jmenuBarSerieProducto;
		final JToolBar jTtoolBarSerieProducto=this.jTtoolBarSerieProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSerieProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSerieProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			jmenuBarDetalleAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jmenuBarDetalleSerieProducto;
			jTtoolBarDetalleAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jTtoolBarDetalleSerieProducto;
		}
		
		final JMenuBar jmenuBarDetalleSerieProducto=jmenuBarDetalleAuxiliarSerieProducto;
		final JToolBar jTtoolBarDetalleSerieProducto=jTtoolBarDetalleAuxiliarSerieProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSerieProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSerieProducto;
			processRunnable.jTableDatos=jTableDatosSerieProducto;
			processRunnable.jPanelCampos=jPanelCamposSerieProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionSerieProducto;
			processRunnable.jPanelAcciones=jPanelAccionesSerieProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSerieProducto;
			
			
			processRunnable.jmenuBar=jmenuBarSerieProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSerieProducto;
			processRunnable.jTtoolBar=jTtoolBarSerieProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSerieProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSerieProducto ,jPanelParametrosReportesSerieProducto,jTableDatosSerieProducto, /*jScrollPanelDatosSerieProducto,*/jPanelCamposSerieProducto,jPanelPaginacionSerieProducto, /*jScrollPanelDatosEdicionSerieProducto,*/ jPanelAccionesSerieProducto,jPanelAccionesFormularioSerieProducto,jmenuBarSerieProducto,jmenuBarDetalleSerieProducto,jTtoolBarSerieProducto,jTtoolBarDetalleSerieProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSerieProducto ,jPanelParametrosReportesSerieProducto, jScrollPanelDatosSerieProducto,jPanelPaginacionSerieProducto, jScrollPanelDatosEdicionSerieProducto, jPanelAccionesSerieProducto,jPanelAccionesFormularioSerieProducto,jmenuBarSerieProducto,jmenuBarDetalleSerieProducto,jTtoolBarSerieProducto,jTtoolBarDetalleSerieProducto);
						
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
	
	public void finishProcessSerieProducto() {// throws Exception 
		this.finishProcessSerieProducto(true);
	}
	
	public void finishProcessSerieProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSerieProducto ,this.jPanelParametrosReportesSerieProducto, this.jScrollPanelDatosSerieProducto,this.jPanelPaginacionSerieProducto, this.jScrollPanelDatosEdicionSerieProducto, this.jPanelAccionesSerieProducto,this.jPanelAccionesFormularioSerieProducto,this.jmenuBarSerieProducto,this.jmenuBarDetalleSerieProducto,this.jTtoolBarSerieProducto,this.jTtoolBarDetalleSerieProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasSerieProducto=this.jTabbedPaneBusquedasSerieProducto; 
		
		final JPanel jPanelParametrosReportesSerieProducto=this.jPanelParametrosReportesSerieProducto;
		//final JScrollPane jScrollPanelDatosSerieProducto=this.jScrollPanelDatosSerieProducto;
		final JTable jTableDatosSerieProducto=this.jTableDatosSerieProducto;		
		final JPanel jPanelPaginacionSerieProducto=this.jPanelPaginacionSerieProducto;
		//final JScrollPane jScrollPanelDatosEdicionSerieProducto=this.jScrollPanelDatosEdicionSerieProducto;
		final JPanel jPanelAccionesSerieProducto=this.jPanelAccionesSerieProducto;
		
		JPanel jPanelCamposAuxiliarSerieProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSerieProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			jPanelCamposAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jPanelCamposSerieProducto;
			jPanelAccionesFormularioAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jPanelAccionesFormularioSerieProducto;
		}
		
		final JPanel jPanelCamposSerieProducto=jPanelCamposAuxiliarSerieProducto;
		final JPanel jPanelAccionesFormularioSerieProducto=jPanelAccionesFormularioAuxiliarSerieProducto;
		
		
		final JMenuBar jmenuBarSerieProducto=this.jmenuBarSerieProducto;		
		final JToolBar jTtoolBarSerieProducto=this.jTtoolBarSerieProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarSerieProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSerieProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			jmenuBarDetalleAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jmenuBarDetalleSerieProducto;
			jTtoolBarDetalleAuxiliarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jTtoolBarDetalleSerieProducto;		
		}
		
		final JMenuBar jmenuBarDetalleSerieProducto=jmenuBarDetalleAuxiliarSerieProducto;
		final JToolBar jTtoolBarDetalleSerieProducto=jTtoolBarDetalleAuxiliarSerieProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSerieProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSerieProducto;
			processRunnable.jTableDatos=jTableDatosSerieProducto;
			processRunnable.jPanelCampos=jPanelCamposSerieProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionSerieProducto;
			processRunnable.jPanelAcciones=jPanelAccionesSerieProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSerieProducto;
			
			
			processRunnable.jmenuBar=jmenuBarSerieProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSerieProducto;
			processRunnable.jTtoolBar=jTtoolBarSerieProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSerieProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSerieProducto ,jPanelParametrosReportesSerieProducto, jTableDatosSerieProducto,/*jScrollPanelDatosSerieProducto,*/jPanelCamposSerieProducto,jPanelPaginacionSerieProducto, /*jScrollPanelDatosEdicionSerieProducto,*/ jPanelAccionesSerieProducto,jPanelAccionesFormularioSerieProducto,jmenuBarSerieProducto,jmenuBarDetalleSerieProducto,jTtoolBarSerieProducto,jTtoolBarDetalleSerieProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSerieProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSerieProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSerieProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSerieProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSerieProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSerieProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSerieProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSerieProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSerieProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.serieproductoConstantesFunciones.getsFinalQuerySerieProducto();
		String  finalQueryPaginacionTodos=this.serieproductoConstantesFunciones.getsFinalQuerySerieProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SerieProductoConstantesFunciones.getArrayColumnasGlobalesNoSerieProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SerieProductoConstantesFunciones.getArrayColumnasGlobalesSerieProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SerieProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.serieproductosEliminados= new ArrayList<SerieProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSerieProducto();
		
				///*SerieProductoSessionBean*/this.serieproductoSessionBean=new SerieProductoSessionBean();
			
			if(this.serieproductoSessionBean==null) {
				this.serieproductoSessionBean=new SerieProductoSessionBean();
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
					this.iNumeroPaginacion=SerieProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SerieProductoConstantesFunciones.getClassesForeignKeysOfSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/serieproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			serieproductosAux= new ArrayList<SerieProducto>();
			
				
			serieproductoLogic.setDatosCliente(this.datosCliente);
			serieproductoLogic.setDatosDeep(this.datosDeep);
			serieproductoLogic.setIsConDeep(true);
			
			
			serieproductoLogic.getSerieProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					serieproductoLogic.getTodosSerieProductos(finalQueryGlobal,pagination);
					
					//serieproductoLogic.getTodosSerieProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(serieproductoLogic.getSerieProductos()==null|| serieproductoLogic.getSerieProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							serieproductosAux= new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductoLogic.getSerieProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux= new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							serieproductoLogic.getTodosSerieProductos(finalQueryGlobal+"",this.pagination);												
							
							//serieproductoLogic.getTodosSerieProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSerieProductos("Todos",serieproductoLogic.getSerieProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());					
							serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSerieProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSerieProducto=this.idActual;
				
				} else if(this.idSerieProductoActual!=null && this.idSerieProductoActual!=0L) {
					idSerieProducto=idSerieProductoActual;
				}
				
					
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndicePorId(idSerieProducto);
				
				this.serieproductos=new ArrayList<SerieProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					serieproductoLogic.getEntity(idSerieProducto);
					
					//serieproductoLogic.getEntityWithConnection(idSerieProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
					serieproductoLogic.getSerieProductos().add(serieproductoLogic.getSerieProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serieproductos=new ArrayList<SerieProducto>();
					this.serieproductos.add(serieproducto);
				}
				
				if(serieproductoLogic.getSerieProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					serieproductoLogic.getSerieProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=serieproductoLogic.getSerieProductos()==null||serieproductoLogic.getSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=serieproductos==null|| serieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductosAux=new ArrayList<SerieProducto>();
						serieproductosAux.addAll(serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux=new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							serieproductoLogic.getSerieProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSerieProductos("BusquedaPorCodigo",serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSerieProductos("BusquedaPorCodigo",serieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
						serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaCompra")) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaCompra(fecha_compraBusquedaPorFechaCompra);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					serieproductoLogic.getSerieProductosBusquedaPorFechaCompra(finalQueryGlobal,pagination,fecha_compraBusquedaPorFechaCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaCompra(fecha_compraBusquedaPorFechaCompra);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaCompra(fecha_compraBusquedaPorFechaCompra);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=serieproductoLogic.getSerieProductos()==null||serieproductoLogic.getSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=serieproductos==null|| serieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductosAux=new ArrayList<SerieProducto>();
						serieproductosAux.addAll(serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux=new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							serieproductoLogic.getSerieProductosBusquedaPorFechaCompra(finalQueryGlobal,pagination,fecha_compraBusquedaPorFechaCompra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaCompra(fecha_compraBusquedaPorFechaCompra);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaCompra(fecha_compraBusquedaPorFechaCompra);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSerieProductos("BusquedaPorFechaCompra",serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSerieProductos("BusquedaPorFechaCompra",serieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
						serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaEntrega")) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrega(fecha_entregaBusquedaPorFechaEntrega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					serieproductoLogic.getSerieProductosBusquedaPorFechaEntrega(finalQueryGlobal,pagination,fecha_entregaBusquedaPorFechaEntrega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrega(fecha_entregaBusquedaPorFechaEntrega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrega(fecha_entregaBusquedaPorFechaEntrega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=serieproductoLogic.getSerieProductos()==null||serieproductoLogic.getSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=serieproductos==null|| serieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductosAux=new ArrayList<SerieProducto>();
						serieproductosAux.addAll(serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux=new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							serieproductoLogic.getSerieProductosBusquedaPorFechaEntrega(finalQueryGlobal,pagination,fecha_entregaBusquedaPorFechaEntrega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrega(fecha_entregaBusquedaPorFechaEntrega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaEntrega(fecha_entregaBusquedaPorFechaEntrega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSerieProductos("BusquedaPorFechaEntrega",serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSerieProductos("BusquedaPorFechaEntrega",serieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
						serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorFechaVenta")) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaVenta(fecha_ventaBusquedaPorFechaVenta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					serieproductoLogic.getSerieProductosBusquedaPorFechaVenta(finalQueryGlobal,pagination,fecha_ventaBusquedaPorFechaVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaVenta(fecha_ventaBusquedaPorFechaVenta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaVenta(fecha_ventaBusquedaPorFechaVenta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=serieproductoLogic.getSerieProductos()==null||serieproductoLogic.getSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=serieproductos==null|| serieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductosAux=new ArrayList<SerieProducto>();
						serieproductosAux.addAll(serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux=new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							serieproductoLogic.getSerieProductosBusquedaPorFechaVenta(finalQueryGlobal,pagination,fecha_ventaBusquedaPorFechaVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaVenta(fecha_ventaBusquedaPorFechaVenta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorFechaVenta(fecha_ventaBusquedaPorFechaVenta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSerieProductos("BusquedaPorFechaVenta",serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSerieProductos("BusquedaPorFechaVenta",serieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
						serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					serieproductoLogic.getSerieProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=serieproductoLogic.getSerieProductos()==null||serieproductoLogic.getSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=serieproductos==null|| serieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductosAux=new ArrayList<SerieProducto>();
						serieproductosAux.addAll(serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux=new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							serieproductoLogic.getSerieProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSerieProductos("FK_IdBodega",serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSerieProductos("FK_IdBodega",serieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
						serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					serieproductoLogic.getSerieProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=serieproductoLogic.getSerieProductos()==null||serieproductoLogic.getSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=serieproductos==null|| serieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductosAux=new ArrayList<SerieProducto>();
						serieproductosAux.addAll(serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductosAux=new ArrayList<SerieProducto>();
							serieproductosAux.addAll(serieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							serieproductoLogic.getSerieProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SerieProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSerieProductos("FK_IdEmpresa",serieproductoLogic.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSerieProductos("FK_IdEmpresa",serieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoLogic.setSerieProductos(new ArrayList<SerieProducto>());
						serieproductoLogic.getSerieProductos().addAll(serieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductos=new ArrayList<SerieProducto>();
							serieproductos.addAll(serieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSerieProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSerieProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=serieproductoLogic.getSerieProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=serieproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=serieproductoLogic.getSerieProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=serieproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SerieProducto serieproducto) {
		Boolean permite=true;
		
		if(this.serieproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SerieProductoConstantesFunciones.getOrderByListaSerieProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SerieProductoConstantesFunciones.getOrderByListaSerieProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SerieProducto serieproducto:serieproductoLogic.getSerieProductos()) {
				if(serieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					serieproductoTotales=serieproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SerieProducto serieproducto:this.serieproductos) {
				if(serieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					serieproductoTotales=serieproducto;
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
			this.serieproductoAux=new SerieProducto();
			this.serieproductoAux.setsType(Constantes2.S_TOTALES);
			this.serieproductoAux.setIsNew(false);
			this.serieproductoAux.setIsChanged(false);
			this.serieproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SerieProductoConstantesFunciones.TotalizarValoresFilaSerieProducto(this.serieproductoLogic.getSerieProductos(),this.serieproductoAux);
				
				this.serieproductoLogic.getSerieProductos().add(this.serieproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SerieProductoConstantesFunciones.TotalizarValoresFilaSerieProducto(this.serieproductos,this.serieproductoAux);
				
				this.serieproductos.add(this.serieproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		serieproductoTotales=new SerieProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.serieproductoLogic.getSerieProductos().remove(serieproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.serieproductos.remove(serieproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		serieproductoTotales=new SerieProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SerieProducto serieproducto:serieproductoLogic.getSerieProductos()) {
				if(serieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					serieproductoTotales=serieproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SerieProductoConstantesFunciones.TotalizarValoresFilaSerieProducto(this.serieproductoLogic.getSerieProductos(),serieproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SerieProducto serieproducto:this.serieproductos) {
				if(serieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					serieproductoTotales=serieproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SerieProductoConstantesFunciones.TotalizarValoresFilaSerieProducto(this.serieproductos,serieproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSerieProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSerieProductosBusquedaPorFechaCompra()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaCompra";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSerieProductosBusquedaPorFechaEntrega()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaEntrega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSerieProductosBusquedaPorFechaVenta()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorFechaVenta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSerieProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSerieProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSerieProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSerieProductosBusquedaPorCodigo(String sFinalQuery,Double codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSerieProductosBusquedaPorFechaCompra(String sFinalQuery,Date fecha_compra)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosBusquedaPorFechaCompra(sFinalQuery,this.pagination,fecha_compra);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSerieProductosBusquedaPorFechaEntrega(String sFinalQuery,Date fecha_entrega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosBusquedaPorFechaEntrega(sFinalQuery,this.pagination,fecha_entrega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSerieProductosBusquedaPorFechaVenta(String sFinalQuery,Date fecha_venta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosBusquedaPorFechaVenta(sFinalQuery,this.pagination,fecha_venta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSerieProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSerieProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSerieProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
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
	
	public void inicializarPermisosSerieProducto() {
		this.isPermisoTodoSerieProducto=false;
		this.isPermisoNuevoSerieProducto=false;
		this.isPermisoActualizarSerieProducto=false;
		this.isPermisoActualizarOriginalSerieProducto=false;
		this.isPermisoEliminarSerieProducto=false;
		this.isPermisoGuardarCambiosSerieProducto=false;
		this.isPermisoConsultaSerieProducto=false;
		this.isPermisoBusquedaSerieProducto=false;
		this.isPermisoReporteSerieProducto=false;		
		this.isPermisoOrdenSerieProducto=false;		
		this.isPermisoPaginacionMedioSerieProducto=false;		
		this.isPermisoPaginacionAltoSerieProducto=false;
		this.isPermisoPaginacionTodoSerieProducto=false;
		this.isPermisoCopiarSerieProducto=false;		
		this.isPermisoVerFormSerieProducto=false;		
		this.isPermisoDuplicarSerieProducto=false;		
		this.isPermisoOrdenSerieProducto=false;		
	}
	
	public void setPermisosUsuarioSerieProducto(Boolean isPermiso) {
		this.isPermisoTodoSerieProducto=isPermiso;
		this.isPermisoNuevoSerieProducto=isPermiso;
		this.isPermisoActualizarSerieProducto=isPermiso;
		this.isPermisoActualizarOriginalSerieProducto=isPermiso;
		this.isPermisoEliminarSerieProducto=isPermiso;
		this.isPermisoGuardarCambiosSerieProducto=isPermiso;
		this.isPermisoConsultaSerieProducto=isPermiso;
		this.isPermisoBusquedaSerieProducto=isPermiso;
		this.isPermisoReporteSerieProducto=isPermiso;
		this.isPermisoOrdenSerieProducto=isPermiso;		
		this.isPermisoPaginacionMedioSerieProducto=isPermiso;		
		this.isPermisoPaginacionAltoSerieProducto=isPermiso;		
		this.isPermisoPaginacionTodoSerieProducto=isPermiso;		
		this.isPermisoCopiarSerieProducto=isPermiso;		
		this.isPermisoVerFormSerieProducto=isPermiso;		
		this.isPermisoDuplicarSerieProducto=isPermiso;
		this.isPermisoOrdenSerieProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSerieProducto(Boolean isPermiso) {
		//this.isPermisoTodoSerieProducto=isPermiso;
		this.isPermisoNuevoSerieProducto=isPermiso;
		this.isPermisoActualizarSerieProducto=isPermiso;
		this.isPermisoActualizarOriginalSerieProducto=isPermiso;
		this.isPermisoEliminarSerieProducto=isPermiso;
		this.isPermisoGuardarCambiosSerieProducto=isPermiso;
		//this.isPermisoConsultaSerieProducto=isPermiso;
		//this.isPermisoBusquedaSerieProducto=isPermiso;
		//this.isPermisoReporteSerieProducto=isPermiso;
		//this.isPermisoOrdenSerieProducto=isPermiso;		
		//this.isPermisoPaginacionMedioSerieProducto=isPermiso;		
		//this.isPermisoPaginacionAltoSerieProducto=isPermiso;		
		//this.isPermisoPaginacionTodoSerieProducto=isPermiso;		
		//this.isPermisoCopiarSerieProducto=isPermiso;		
		//this.isPermisoDuplicarSerieProducto=isPermiso;
		//this.isPermisoOrdenSerieProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSerieProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleSerieProductoConstantesFunciones.SNOMBREOPCION);
		
		if(SerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleSerieProducto=false;
		this.isTienePermisosDetalleSerieProducto=this.verificarGetPermisosUsuarioOpcionSerieProductoClaseRelacionada(this.opcionsRelacionadas,DetalleSerieProductoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSerieProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSerieProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleSerieProducto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSerieProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSerieProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSerieProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleSerieProducto && this.jInternalFrameDetalleFormSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.remove(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSerieProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SerieProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSerieProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSerieProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSerieProducto=this.isPermisoActualizarSerieProducto;
			this.isPermisoEliminarSerieProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSerieProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSerieProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSerieProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSerieProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSerieProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSerieProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSerieProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSerieProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSerieProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSerieProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSerieProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSerieProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSerieProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSerieProducto.setToolTipText(this.jTableDatosSerieProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSerieProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSerieProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSerieProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleSerieProducto && this.serieproductoConstantesFunciones.mostrarDetalleSerieProductoSerieProducto && !SerieProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Serie Producto");
			reporte.setsDescripcion("Detalle Serie Producto");
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
	public void inicializarCombosForeignKeySerieProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySerieProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SerieProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySerieProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeySerieProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SerieProductoParameterReturnGeneral serieproductoReturnGeneral=new SerieProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.serieproductoConstantesFunciones.cargarid_empresaSerieProducto)
					 || (this.esRecargarFks && this.serieproductoConstantesFunciones.cargarid_empresaSerieProducto)) {

					if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+serieproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.serieproductoConstantesFunciones.cargarid_bodegaSerieProducto)
					 || (this.esRecargarFks && this.serieproductoConstantesFunciones.cargarid_bodegaSerieProducto)) {

					if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+serieproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.serieproductoConstantesFunciones.cargarid_productoSerieProducto)
					 || (this.esRecargarFks && this.serieproductoConstantesFunciones.cargarid_productoSerieProducto)) {

					if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+serieproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				serieproductoReturnGeneral=serieproductoLogic.cargarCombosLoteForeignKeySerieProducto(finalQueryGlobalEmpresa,finalQueryGlobalBodega,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=serieproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=serieproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=serieproductoReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySerieProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.serieproductoSessionBean==null) {
				this.serieproductoSessionBean=new SerieProductoSessionBean();
			}

			if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.serieproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeySerieProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySerieProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySerieProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.serieproducto.setfecha_compra(this.parametroGeneralUsuario.getfecha_sistema());
				this.serieproducto.setfecha_entrega(this.parametroGeneralUsuario.getfecha_sistema());
				this.serieproducto.setfecha_venta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySerieProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySerieProducto(SerieProducto serieproducto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(serieproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(serieproducto.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySerieProducto(SerieProducto serieproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(serieproducto.getProducto()!=null && !sTipoEvento.equals("id_productoSerieProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(serieproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySerieProducto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.serieproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.serieproductoConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySerieProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySerieProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySerieProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSerieProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySerieProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySerieProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySerieProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public SerieProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SerieProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SerieProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.serieproductoSessionBean=new SerieProductoSessionBean(); 
		this.serieproductoConstantesFunciones=new SerieProductoConstantesFunciones(); 
		this.serieproductoBean=new SerieProducto();//(this.serieproductoConstantesFunciones); 		
		this.serieproductoReturnGeneral=new SerieProductoParameterReturnGeneral(); 
		
		this.serieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.serieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SerieProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SerieProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SerieProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSerieProducto(true);
			
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
			
			this.serieproductoConstantesFunciones=new SerieProductoConstantesFunciones(); 
			this.serieproductoBean=new SerieProducto();//this.serieproductoConstantesFunciones); 			
			this.serieproductoReturnGeneral=new SerieProductoParameterReturnGeneral(); 
		
			SerieProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Serie Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.serieproducto=new SerieProducto();
			this.serieproductos = new ArrayList<SerieProducto>();
			this.serieproductosAux = new ArrayList<SerieProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic=new SerieProductoLogic();
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.serieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.serieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSerieProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSerieProducto);	
					}
					
					if(this.jInternalFrameImportacionSerieProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSerieProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySerieProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySerieProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSerieProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSerieProducto);
				this.jInternalFrameDetalleFormSerieProducto.setVisible(false);
				this.jInternalFrameDetalleFormSerieProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSerieProducto);
					this.jInternalFrameReporteDinamicoSerieProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoSerieProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSerieProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSerieProducto);
					this.jInternalFrameImportacionSerieProducto.setVisible(false);
					this.jInternalFrameImportacionSerieProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySerieProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySerieProducto);
					this.jInternalFrameOrderBySerieProducto.setVisible(false);
					this.jInternalFrameOrderBySerieProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSerieProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SerieProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.serieproductoReturnGeneral=new SerieProductoParameterReturnGeneral();
			
			this.serieproductoParameterGeneral=new SerieProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.serieproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleSerieProductoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SerieProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.serieproductoSessionBean.getEsGuardarRelacionado(),this.serieproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SerieProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.serieproductoSessionBean.getEsGuardarRelacionado(),this.serieproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaDuplicarSerieProducto=true;
			this.isVisibilidadCeldaCopiarSerieProducto=true;
			this.isVisibilidadCeldaVerFormSerieProducto=true;
			this.isVisibilidadCeldaOrdenSerieProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
			this.isVisibilidadCeldaModificarSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=false;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=false;
			this.isVisibilidadCeldaGuardarSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorFechaCompra=true;
			this.isVisibilidadBusquedaPorFechaEntrega=true;
			this.isVisibilidadBusquedaPorFechaVenta=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSerieProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSerieProducto(false);
			
			this.setPermisosUsuarioSerieProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.serieproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.serieproductoSessionBean.getEsGuardarRelacionado() && this.serieproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSerieProductoClasesRelacionadas();
			}
			
			if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSerieProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSerieProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSerieProducto();
			}
			
			if(!this.isPermisoBusquedaSerieProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSerieProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSerieProducto,this.isPermisoPaginacionMedioSerieProducto,this.isPermisoPaginacionTodoSerieProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SerieProductoConstantesFunciones.getTiposSeleccionarSerieProducto());
				
				this.tiposColumnasSelect=SerieProductoConstantesFunciones.getTiposSeleccionarSerieProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSerieProducto();				
				//this.tiposRelacionesSelect=SerieProductoConstantesFunciones.getTiposRelacionesSerieProducto(true);
				
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
			//if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSerieProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioSerieProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioSerieProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSerieProducto() ;
			
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
			
			
			this.detalleserieproductoLogic=new DetalleSerieProductoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				serieproductoImplementable= (SerieProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SerieProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				serieproductoImplementableHome= (SerieProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SerieProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.serieproductos= new ArrayList<SerieProducto>();
			this.serieproductosEliminados= new ArrayList<SerieProducto>();
						
			this.isEsNuevoSerieProducto=false;
			this.esParaAccionDesdeFormularioSerieProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySerieProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSerieProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SerieProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SerieProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSerieProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSerieProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSerieProducto();
			}
			
			SerieProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSerieProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSerieProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SerieProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSerieProducto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSerieProducto")) {
				iIndex=this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Serie Productos")) {
					if(!DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSerieProducto();

						this.cargarParteTabPanelRelacionadaDetalleSerieProducto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSerieProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleSerieProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSerieProducto.cargarSessionConBeanSwingJInternalFrameDetalleSerieProducto(false,true,iIndex);
		this.jButtonDetalleSerieProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleSerieProducto();

		//this.jTabbedPaneRelacionesSerieProducto.updateUI();
		//this.jTabbedPaneRelacionesSerieProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSerieProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleSerieProducto")) {
				int row=this.jTableDatosSerieProducto.getSelectedRow();
				jButtonDetalleSerieProductoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Serie Producto")) {

					if(this.isTienePermisosDetalleSerieProducto && this.serieproductoConstantesFunciones.mostrarDetalleSerieProductoSerieProducto && !SerieProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Serie Productos"+"("+DetalleSerieProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Serie Productos");

						if(serieproductoConstantesFunciones.resaltarDetalleSerieProductoSerieProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(serieproductoConstantesFunciones.resaltarDetalleSerieProductoSerieProducto);
						}

						jmenuItem.setEnabled(this.serieproductoConstantesFunciones.activarDetalleSerieProductoSerieProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleSerieProducto"));

						

						this.jInternalFrameDetalleFormSerieProducto.jmenuDetalleSerieProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySerieProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySerieProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySerieProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySerieProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySerieProducto();
		
		this.cargarCombosFrameForeignKeySerieProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySerieProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySerieProducto();
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
	
	public void jButtonNuevoSerieProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			
			if(jTableDatosSerieProducto.getRowCount()>=1) {
				jTableDatosSerieProducto.removeRowSelectionInterval(0, jTableDatosSerieProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoSerieProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSerieProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSerieProducto(true);			
			//this.serieproducto=new SerieProducto();
			//this.serieproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSerieProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSerieProducto() ;
			
			if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSerieProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.serieproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);				
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SerieProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSerieProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSerieProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSerieProducto.getSelectedRows().length;			
			}
			
			serieproductosSeleccionados=this.getSerieProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSerieProducto--;			
				//SerieProducto serieproductoAux= new SerieProducto();			
				//serieproductoAux.setId(this.iIdNuevoSerieProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SerieProducto serieproductoOrigen=new SerieProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SerieProducto serieproductoOrigen : serieproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							serieproductoOrigen =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							serieproductoOrigen =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSerieProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.serieproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSerieProducto(serieproductoOrigen,this.serieproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.serieproductoLogic.getSerieProductos().add(this.serieproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.serieproductos.add(this.serieproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSerieProducto(false);
				
				this.jTableDatosSerieProducto.setRowSelectionInterval(this.getIndiceNuevoSerieProducto(), this.getIndiceNuevoSerieProducto());
				
				int iLastRow =  this.jTableDatosSerieProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSerieProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSerieProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSerieProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();									
		
			SerieProducto serieproductoOrigen=new SerieProducto();
			SerieProducto serieproductoDestino=new SerieProducto();
				
			serieproductosSeleccionados=this.getSerieProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSerieProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || serieproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSerieProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoOrigen =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						serieproductoOrigen =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						serieproductoDestino =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						serieproductoDestino =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				serieproductoOrigen =serieproductosSeleccionados.get(0);
				serieproductoDestino =serieproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSerieProducto(serieproductoOrigen,serieproductoDestino,true,false);
				
				serieproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(serieproductoDestino,serieproductoLogic.getSerieProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(serieproductoDestino,serieproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSerieProducto(false);
				
				//this.jTableDatosSerieProducto.setRowSelectionInterval(this.getIndiceNuevoSerieProducto(), this.getIndiceNuevoSerieProducto());
				
				int iLastRow =  this.jTableDatosSerieProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSerieProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSerieProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSerieProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSerieProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSerieProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSerieProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSerieProducto.setVisible(!isVisible);
			this.jPanelPaginacionSerieProducto.setVisible(!isVisible);
			this.jPanelAccionesSerieProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSerieProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSerieProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSerieProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySerieProducto();
			
			this.abrirFrameOrderBySerieProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySerieProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSerieProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSerieProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSerieProducto.isMaximum()) {
					this.jInternalFrameDetalleFormSerieProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSerieProducto.setSize(this.jInternalFrameDetalleFormSerieProducto.iWidthFormulario,this.jInternalFrameDetalleFormSerieProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSerieProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSerieProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSerieProducto.isMaximum()) {
						this.jInternalFrameDetalleFormSerieProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSerieProducto.jContentPaneDetalleSerieProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSerieProducto.jContentPaneDetalleSerieProducto.getWidth(),SerieProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSerieProducto.jContentPaneDetalleSerieProducto.getWidth(),SerieProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSerieProducto.jContentPaneDetalleSerieProducto.getWidth(),SerieProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleSerieProducto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSerieProducto.setVisible(true);
	        this.jInternalFrameDetalleFormSerieProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySerieProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySerieProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySerieProducto,false,this);
				} else {
					this.jInternalFrameOrderBySerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySerieProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySerieProducto);
				this.jInternalFrameOrderBySerieProducto.setVisible(false);
				this.jInternalFrameOrderBySerieProducto.setSelected(false);
				
				this.jInternalFrameOrderBySerieProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySerieProducto"));
				
				this.inicializarActualizarBindingTablaOrderBySerieProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSerieProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSerieProducto==null) {
				
				this.jInternalFrameImportacionSerieProducto=new ImportacionJInternalFrame(SerieProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSerieProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSerieProducto);
				this.jInternalFrameImportacionSerieProducto.setVisible(false);
				this.jInternalFrameImportacionSerieProducto.setSelected(false);


				this.jInternalFrameImportacionSerieProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSerieProducto"));
				this.jInternalFrameImportacionSerieProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSerieProducto"));
				this.jInternalFrameImportacionSerieProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSerieProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSerieProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSerieProducto==null) {
				this.jInternalFrameReporteDinamicoSerieProducto=new ReporteDinamicoJInternalFrame(SerieProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSerieProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSerieProducto);
				this.jInternalFrameReporteDinamicoSerieProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoSerieProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSerieProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSerieProducto"));
				this.jInternalFrameReporteDinamicoSerieProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSerieProducto"));
				this.jInternalFrameReporteDinamicoSerieProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSerieProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSerieProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleSerieProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleSerieProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSerieProducto.jContentPaneDetalleSerieProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleSerieProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleSerieProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleSerieProducto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSerieProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSerieProducto);
			
	       	this.jInternalFrameDetalleFormSerieProducto.setVisible(false);
	        this.jInternalFrameDetalleFormSerieProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormSerieProducto.dispose();
			//this.jInternalFrameDetalleFormSerieProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSerieProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSerieProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoSerieProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSerieProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSerieProducto.setVisible(true);
	        this.jInternalFrameImportacionSerieProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySerieProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySerieProducto.setVisible(true);
	        this.jInternalFrameOrderBySerieProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySerieProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySerieProducto.setVisible(false);
	        this.jInternalFrameOrderBySerieProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSerieProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSerieProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoSerieProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSerieProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSerieProducto.setVisible(false);
	        this.jInternalFrameImportacionSerieProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSerieProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSerieProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSerieProducto(true);
			//this.isEsNuevoSerieProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSerieProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSerieProducto(false) ;
			
			if(serieproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.getEsGuardarRelacionado() && DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleSerieProductoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSerieProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSerieProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSerieProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSerieProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSerieProducto(true);
			//this.isEsNuevoSerieProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.serieproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSerieProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSerieProducto(false) ;
			
			if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSerieProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSerieProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.serieproductoConstantesFunciones.cargarid_productoSerieProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingSerieProducto(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSerieProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSerieProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSerieProducto(false);
			
			//if(!this.isEsNuevoSerieProducto) {								
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				
			}
			
			if(this.permiteMantenimiento(this.serieproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSerieProducto=true;
					this.inicializarActualizarBindingTablaSerieProducto(false);
					this.isEsNuevoSerieProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSerieProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSerieProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSerieProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSerieProducto(false);
				
				this.habilitarDeshabilitarControlesSerieProducto(false);
			
												
				
				if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSerieProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSerieProductoActionPerformed(evt,serieproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSerieProducto(this.serieproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSerieProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,serieproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.serieproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				this.serieproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				this.serieproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.serieproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SerieProductoModel) this.jTableDatosSerieProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSerieProducto=true;
				this.inicializarActualizarBindingTablaSerieProducto(false);
				this.isEsNuevoSerieProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSerieProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSerieProducto(false);
				
				this.habilitarDeshabilitarControlesSerieProducto(false);
				
				
				
				if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSerieProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSerieProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSerieProducto.getRowCount()>=1) {
				jTableDatosSerieProducto.removeRowSelectionInterval(0, jTableDatosSerieProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSerieProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSerieProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSerieProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSerieProducto(false) ;
			
			this.isEsNuevoSerieProducto=false;
			
			if(SerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSerieProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSerieProducto(false);
				
				//SI ES MANUAL
				if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSerieProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSerieProducto--;			
			//SerieProducto serieproductoAux= new SerieProducto();			
			//serieproductoAux.setId(this.iIdNuevoSerieProducto);
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSerieProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
			
			this.serieproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.serieproductoLogic.getSerieProductos().add(this.serieproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.serieproductos.add(this.serieproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSerieProducto(false);
			
			this.jTableDatosSerieProducto.setRowSelectionInterval(this.getIndiceNuevoSerieProducto(), this.getIndiceNuevoSerieProducto());
			
			int iLastRow =  this.jTableDatosSerieProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSerieProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSerieProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSerieProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSerieProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSerieProducto(false);
			
			//SI ES MANUAL
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSerieProducto();
			}
			
			//this.abrirFrameTreeSerieProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSerieProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Serie ProductoS ?", "MANTENIMIENTO DE Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSerieProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSerieProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.serieproductoReturnGeneral=serieproductoLogic.procesarImportacionSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.serieproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSerieProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSerieProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSerieProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSerieProducto.setFileImportacion(this.jInternalFrameImportacionSerieProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSerieProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSerieProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSerieProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSerieProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		

		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SerieProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SerieProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteSerieProductos("Todos",serieproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SerieProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SerieProductoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoSerieProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SerieProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SerieProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case SerieProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case SerieProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoria="fecha_venta";
					break;

				case SerieProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SerieProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SerieProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case SerieProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case SerieProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAVENTA:
					sNombreCampoCategoriaValor="fecha_venta";
					break;

				case SerieProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SerieProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SerieProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case SerieProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case SerieProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_venta");
					break;

				case SerieProductoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoSerieProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SerieProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SerieProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_FECHAVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHAVENTA);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getfecha_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SerieProductoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SerieProductoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(SerieProducto serieproducto:serieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(serieproducto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSerieProducto(row);				
			//	iRow++;
			//}				
			
			//for(SerieProducto serieproductoAux:serieproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSerieProducto(serieproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSerieProducto(false);
			
			//SI ES MANUAL
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSerieProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSerieProducto(false);
			
			//SI ES MANUAL
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSerieProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSerieProducto(false);
			
			//SI ES MANUAL
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSerieProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSerieProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSerieProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSerieProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSerieProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSerieProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSerieProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosSerieProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosSerieProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSerieProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSerieProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSerieProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSerieProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSerieProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSerieProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSerieProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSerieProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SerieProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSerieProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSerieProducto();
		
		this.inicializarActualizarBindingBotonesManualSerieProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSerieProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSerieProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSerieProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSerieProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSerieProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSerieProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSerieProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSerieProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSerieProducto.jCheckBoxPostAccionNuevoSerieProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSerieProducto.jCheckBoxPostAccionSinCerrarSerieProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSerieProducto.jCheckBoxPostAccionSinMensajeSerieProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSerieProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSerieProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSerieProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSerieProducto!=null) {
				this.jInternalFrameDetalleFormSerieProducto.jCheckBoxPostAccionNuevoSerieProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSerieProducto.jCheckBoxPostAccionSinCerrarSerieProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSerieProducto.jCheckBoxPostAccionSinMensajeSerieProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSerieProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSerieProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSerieProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSerieProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSerieProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSerieProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSerieProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSerieProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSerieProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSerieProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSerieProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSerieProducto() throws Exception {
		try	{
			if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSerieProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSerieProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSerieProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSerieProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSerieProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSerieProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSerieProducto.addItem(reporte);
			}
			
			
			if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSerieProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSerieProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSerieProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSerieProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSerieProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSerieProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSerieProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSerieProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
				this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
				this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSerieProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSerieProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=SerieProductoConstantesFunciones.getTiposSeleccionarSerieProducto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=SerieProductoConstantesFunciones.getTiposSeleccionarSerieProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=SerieProductoConstantesFunciones.getTiposSeleccionarSerieProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSerieProducto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoSerieProducto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSerieProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=Double.parseDouble(this.jTextFieldcodigoBusquedaPorCodigoSerieProducto.getText());
		this.fecha_compraBusquedaPorFechaCompra=new Date(this.jDateChooserfecha_compraBusquedaPorFechaCompraSerieProducto.getDate().getTime());
		this.fecha_entregaBusquedaPorFechaEntrega=new Date(this.jDateChooserfecha_entregaBusquedaPorFechaEntregaSerieProducto.getDate().getTime());
		this.fecha_ventaBusquedaPorFechaVenta=new Date(this.jDateChooserfecha_ventaBusquedaPorFechaVentaSerieProducto.getDate().getTime());
		if(this.jComboBoxid_bodegaFK_IdBodegaSerieProducto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaSerieProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSerieProducto(Boolean esInicializar) throws Exception {				
		if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSerieProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSerieProducto() throws Exception {
		this.inicializarActualizarBindingTablaSerieProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySerieProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSerieProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSerieProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=serieproductoLogic.getSerieProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=serieproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSerieProducto.setModel(new SerieProductoModel(this.serieproductoLogic.getSerieProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSerieProducto.setModel(new SerieProductoModel(this.serieproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySerieProducto!=null && this.jInternalFrameOrderBySerieProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySerieProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SerieProductoConstantesFunciones.SCLASSWEBTITULO,serieproductoConstantesFunciones.resaltarSeleccionarSerieProducto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SerieProductoConstantesFunciones.SCLASSWEBTITULO,serieproductoConstantesFunciones.resaltarSeleccionarSerieProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_ID));

		if(this.serieproductoConstantesFunciones.mostraridSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.serieproductoConstantesFunciones.resaltaridSerieProducto,this.serieproductoConstantesFunciones.activaridSerieProducto,iSizeTabla,this,true,"idSerieProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.serieproductoConstantesFunciones.resaltaridSerieProducto,this.serieproductoConstantesFunciones.activaridSerieProducto,this,true,"idSerieProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.serieproductoConstantesFunciones.mostrarid_empresaSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.serieproductoConstantesFunciones.resaltarid_empresaSerieProducto,this,this.serieproductoConstantesFunciones.activarid_empresaSerieProducto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.serieproductoConstantesFunciones.resaltarid_empresaSerieProducto,this,this.serieproductoConstantesFunciones.activarid_empresaSerieProducto,false,"id_empresaSerieProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.serieproductoConstantesFunciones.mostrarid_bodegaSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.serieproductoConstantesFunciones.resaltarid_bodegaSerieProducto,this,this.serieproductoConstantesFunciones.activarid_bodegaSerieProducto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.serieproductoConstantesFunciones.resaltarid_bodegaSerieProducto,this,this.serieproductoConstantesFunciones.activarid_bodegaSerieProducto,true,"id_bodegaSerieProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.serieproductoConstantesFunciones.mostrarid_productoSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.serieproductoConstantesFunciones.resaltarid_productoSerieProducto,this,this.serieproductoConstantesFunciones.activarid_productoSerieProducto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.serieproductoConstantesFunciones.resaltarid_productoSerieProducto,this,this.serieproductoConstantesFunciones.activarid_productoSerieProducto,true,"id_productoSerieProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_CODIGO));

		if(this.serieproductoConstantesFunciones.mostrarcodigoSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.serieproductoConstantesFunciones.resaltarcodigoSerieProducto,this.serieproductoConstantesFunciones.activarcodigoSerieProducto,iSizeTabla,this,true,"codigoSerieProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.serieproductoConstantesFunciones.resaltarcodigoSerieProducto,this.serieproductoConstantesFunciones.activarcodigoSerieProducto,this,true,"codigoSerieProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.serieproductoConstantesFunciones.mostrarfecha_compraSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.serieproductoConstantesFunciones.resaltarfecha_compraSerieProducto,this.serieproductoConstantesFunciones.activarfecha_compraSerieProducto,iSizeTabla,this,true,"fecha_compraSerieProducto","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.serieproductoConstantesFunciones.resaltarfecha_compraSerieProducto,this.serieproductoConstantesFunciones.activarfecha_compraSerieProducto,this,true,"fecha_compraSerieProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.serieproductoConstantesFunciones.mostrarfecha_entregaSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.serieproductoConstantesFunciones.resaltarfecha_entregaSerieProducto,this.serieproductoConstantesFunciones.activarfecha_entregaSerieProducto,iSizeTabla,this,true,"fecha_entregaSerieProducto","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.serieproductoConstantesFunciones.resaltarfecha_entregaSerieProducto,this.serieproductoConstantesFunciones.activarfecha_entregaSerieProducto,this,true,"fecha_entregaSerieProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_FECHAVENTA));

		if(this.serieproductoConstantesFunciones.mostrarfecha_ventaSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_FECHAVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.serieproductoConstantesFunciones.resaltarfecha_ventaSerieProducto,this.serieproductoConstantesFunciones.activarfecha_ventaSerieProducto,iSizeTabla,this,true,"fecha_ventaSerieProducto","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.serieproductoConstantesFunciones.resaltarfecha_ventaSerieProducto,this.serieproductoConstantesFunciones.activarfecha_ventaSerieProducto,this,true,"fecha_ventaSerieProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,SerieProductoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.serieproductoConstantesFunciones.mostrardescripcionSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SerieProductoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.serieproductoConstantesFunciones.resaltardescripcionSerieProducto,this.serieproductoConstantesFunciones.activardescripcionSerieProducto,iSizeTabla,this,true,"descripcionSerieProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.serieproductoConstantesFunciones.resaltardescripcionSerieProducto,this.serieproductoConstantesFunciones.activardescripcionSerieProducto,this,true,"descripcionSerieProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.serieproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleSerieProducto && this.serieproductoConstantesFunciones.mostrarDetalleSerieProductoSerieProducto && !SerieProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Serie Productos");
				tableColumn.setHeaderValue("Detalle Serie Productos");
				tableColumn.setCellRenderer(new DetalleSerieProductoTableCell(serieproductoConstantesFunciones.resaltarDetalleSerieProductoSerieProducto,this,this.serieproductoConstantesFunciones.activarDetalleSerieProductoSerieProducto));
				tableColumn.setCellEditor(new DetalleSerieProductoTableCell(serieproductoConstantesFunciones.resaltarDetalleSerieProductoSerieProducto,this,this.serieproductoConstantesFunciones.activarDetalleSerieProductoSerieProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSerieProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.serieproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.serieproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSerieProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.serieproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.serieproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSerieProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSerieProducto && this.isPermisoGuardarCambiosSerieProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.serieproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.serieproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSerieProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.serieproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosSerieProducto.addColumn(tableColumn);
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
			
			this.jTableDatosSerieProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSerieProducto && this.isPermisoGuardarCambiosSerieProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.serieproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSerieProducto && this.isPermisoGuardarCambiosSerieProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSerieProducto.moveColumn(this.jTableDatosSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSerieProducto.moveColumn(this.jTableDatosSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.serieproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSerieProducto.moveColumn(this.jTableDatosSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSerieProducto.moveColumn(this.jTableDatosSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSerieProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSerieProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSerieProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSerieProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSerieProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSerieProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSerieProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSerieProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=serieproductoLogic.getSerieProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=serieproductos.size()-1;
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
		//this.jTableDatosSerieProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSerieProducto();
			
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
				
				//this.isEsNuevoSerieProducto=false;
					
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
				if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSerieProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSerieProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSerieProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.serieproducto.getsType().equals("DUPLICADO")
				   || this.serieproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSerieProducto=true;
				
				} else {
					this.isEsNuevoSerieProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.serieproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.serieproducto.getId()>=0 && !this.serieproducto.getIsNew()) {						
						this.isEsNuevoSerieProducto=false;
						
					} else {
						this.isEsNuevoSerieProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSerieProducto(esRelaciones);						
				
				this.seleccionarSerieProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.serieproducto.getId()<0) {
					this.isEsNuevoSerieProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSerieProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSerieProducto(evt,rowIndex);
				}	
				
				if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SerieProducto: " + this.dDif); 
					}
				}								
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSerieProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.serieproducto)) {
					if(this.serieproducto.getId()>0) {
						this.serieproducto.setIsDeleted(true);
						
						this.serieproductosEliminados.add(this.serieproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.serieproductoLogic.getSerieProductos().remove(this.serieproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.serieproductos.remove(this.serieproducto);				
					}
					
					
					((SerieProductoModel) this.jTableDatosSerieProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSerieProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSerieProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSerieProducto) {
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSerieProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSerieProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSerieProducto(this.serieproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.serieproductoConstantesFunciones.cargarid_empresaSerieProducto || this.serieproductoConstantesFunciones.event_dependid_empresaSerieProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.serieproducto.getid_empresa());
									//this.inicializarActualizarBindingSerieProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(serieproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(serieproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.serieproducto.getid_empresa(),false,"Formulario");

					//Bodega
					if(!this.serieproductoConstantesFunciones.cargarid_bodegaSerieProducto || this.serieproductoConstantesFunciones.event_dependid_bodegaSerieProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.serieproducto.getid_bodega());
									//this.inicializarActualizarBindingSerieProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(serieproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(serieproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.serieproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.serieproductoConstantesFunciones.cargarid_productoSerieProducto || this.serieproductoConstantesFunciones.event_dependid_productoSerieProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.serieproducto.getid_producto());
									//this.inicializarActualizarBindingSerieProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(serieproducto.getProducto()!=null) {
							this.productosForeignKey.add(serieproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.serieproducto.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSerieProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSerieProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSerieProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSerieProducto(SerieProducto serieproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSerieProducto(serieproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSerieProducto(SerieProducto serieproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSerieProducto(serieproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySerieProducto(serieproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySerieProducto(serieproducto);
	}
	
	public void setVariablesObjetoActualToFormularioSerieProducto(SerieProducto serieproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setText(serieproducto.getId().toString());
			this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setText(serieproducto.getcodigo().toString());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setDate(serieproducto.getfecha_compra());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setDate(serieproducto.getfecha_entrega());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setDate(serieproducto.getfecha_venta());
			this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setText(serieproducto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SerieProducto serieproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,serieproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SerieProducto serieproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				serieproductoLocal=this.serieproducto;
			} else {
				serieproductoLocal=this.serieproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(serieproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSerieProducto(serieproductoLocal,true);
					
					if(serieproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(serieproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(serieproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSerieProducto(SerieProducto serieproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSerieProducto(serieproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(serieproducto);
	}
	
	public void setVariablesFormularioToObjetoActualSerieProducto(SerieProducto serieproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSerieProducto(serieproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSerieProducto(SerieProducto serieproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.getText()==null || this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.getText()=="" || this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setText("0");
			}

			if(conColumnasBase) {serieproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SerieProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelIdSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serieproducto.setcodigo(Double.parseDouble(this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SerieProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelcodigoSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serieproducto.setfecha_compra(this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SerieProductoConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_compraSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serieproducto.setfecha_entrega(this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SerieProductoConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_entregaSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serieproducto.setfecha_venta(this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SerieProductoConstantesFunciones.LABEL_FECHAVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabelfecha_ventaSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			serieproducto.setdescripcion(this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SerieProductoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSerieProducto.jLabeldescripcionSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSerieProducto(SerieProducto serieproductoBean,SerieProducto serieproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && serieproductoBean.getid_bodega()!=null && !serieproductoBean.getid_bodega().equals(-1L))) {serieproducto.setid_bodega(serieproductoBean.getid_bodega());}
			if(conDefault || (!conDefault && serieproductoBean.getid_producto()!=null && !serieproductoBean.getid_producto().equals(-1L))) {serieproducto.setid_producto(serieproductoBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSerieProducto(SerieProducto serieproductoOrigen,SerieProducto serieproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && serieproductoOrigen.getId()!=null && !serieproductoOrigen.getId().equals(0L))) {serieproducto.setId(serieproductoOrigen.getId());}}
			if(conDefault || (!conDefault && serieproductoOrigen.getid_bodega()!=null && !serieproductoOrigen.getid_bodega().equals(-1L))) {serieproducto.setid_bodega(serieproductoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && serieproductoOrigen.getid_producto()!=null && !serieproductoOrigen.getid_producto().equals(-1L))) {serieproducto.setid_producto(serieproductoOrigen.getid_producto());}
			if(conDefault || (!conDefault && serieproductoOrigen.getcodigo()!=null && !serieproductoOrigen.getcodigo().equals(0.0))) {serieproducto.setcodigo(serieproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && serieproductoOrigen.getfecha_compra()!=null && !serieproductoOrigen.getfecha_compra().equals(new Date()))) {serieproducto.setfecha_compra(serieproductoOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && serieproductoOrigen.getfecha_entrega()!=null && !serieproductoOrigen.getfecha_entrega().equals(new Date()))) {serieproducto.setfecha_entrega(serieproductoOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && serieproductoOrigen.getfecha_venta()!=null && !serieproductoOrigen.getfecha_venta().equals(new Date()))) {serieproducto.setfecha_venta(serieproductoOrigen.getfecha_venta());}
			if(conDefault || (!conDefault && serieproductoOrigen.getdescripcion()!=null && !serieproductoOrigen.getdescripcion().equals(""))) {serieproducto.setdescripcion(serieproductoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSerieProducto(SerieProducto serieproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setText(serieproducto.getId().toString());
			this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setText(serieproducto.getcodigo().toString());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setDate(serieproducto.getfecha_compra());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setDate(serieproducto.getfecha_entrega());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setDate(serieproducto.getfecha_venta());
			this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setText(serieproducto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSerieProducto(SerieProductoBean serieproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setText(serieproductoBean.getId().toString());
			this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setText(serieproductoBean.getcodigo().toString());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setDate(serieproductoBean.getfecha_compra());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setDate(serieproductoBean.getfecha_entrega());
			this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setDate(serieproductoBean.getfecha_venta());
			this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setText(serieproductoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSerieProducto(SerieProductoParameterReturnGeneral serieproductoReturnGeneral,SerieProductoBean serieproductoBean,Boolean conDefault) throws Exception { 
		try {
			SerieProducto serieproductoLocal=new SerieProducto();
			
			serieproductoLocal=serieproductoReturnGeneral.getSerieProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && serieproductoLocal.getId()!=null && !serieproductoLocal.getId().equals(0L))) {serieproductoBean.setId(serieproductoLocal.getId());}}
			if(conDefault || (!conDefault && serieproductoLocal.getid_bodega()!=null && !serieproductoLocal.getid_bodega().equals(-1L))) {serieproductoBean.setid_bodega(serieproductoLocal.getid_bodega());}
			if(conDefault || (!conDefault && serieproductoLocal.getid_producto()!=null && !serieproductoLocal.getid_producto().equals(-1L))) {serieproductoBean.setid_producto(serieproductoLocal.getid_producto());}
			if(conDefault || (!conDefault && serieproductoLocal.getcodigo()!=null && !serieproductoLocal.getcodigo().equals(0.0))) {serieproductoBean.setcodigo(serieproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && serieproductoLocal.getfecha_compra()!=null && !serieproductoLocal.getfecha_compra().equals(new Date()))) {serieproductoBean.setfecha_compra(serieproductoLocal.getfecha_compra());}
			if(conDefault || (!conDefault && serieproductoLocal.getfecha_entrega()!=null && !serieproductoLocal.getfecha_entrega().equals(new Date()))) {serieproductoBean.setfecha_entrega(serieproductoLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && serieproductoLocal.getfecha_venta()!=null && !serieproductoLocal.getfecha_venta().equals(new Date()))) {serieproductoBean.setfecha_venta(serieproductoLocal.getfecha_venta());}
			if(conDefault || (!conDefault && serieproductoLocal.getdescripcion()!=null && !serieproductoLocal.getdescripcion().equals(""))) {serieproductoBean.setdescripcion(serieproductoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSerieProductoGenerico(Long idSerieProductoSeleccionado,JComboBox jComboBoxSerieProducto,List<SerieProducto> serieproductosLocal)throws Exception {
		try {
			SerieProducto  serieproductoTemp=null;

			for(SerieProducto serieproductoAux:serieproductosLocal) {
				if(serieproductoAux.getId()!=null && serieproductoAux.getId().equals(idSerieProductoSeleccionado)) {
					serieproductoTemp=serieproductoAux;
					break;
				}
			}

			jComboBoxSerieProducto.setSelectedItem(serieproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSerieProductoGenerico(JComboBox jComboBoxSerieProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSerieProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSerieProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSerieProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSerieProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleSerieProducto")) {
			jButtonDetalleSerieProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			serieproducto=(SerieProducto) serieproductoLogic.getSerieProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			serieproducto =(SerieProducto) serieproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!serieproducto.getIsNew() && !serieproducto.getIsChanged() && !serieproducto.getIsDeleted()) {
				sDescripcion=serieproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=serieproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!serieproducto.getIsNew() && !serieproducto.getIsChanged() && !serieproducto.getIsDeleted()) {
				sDescripcion=serieproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=serieproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!serieproducto.getIsNew() && !serieproducto.getIsChanged() && !serieproducto.getIsDeleted()) {
				sDescripcion=serieproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=serieproducto.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SerieProducto serieproductoRow=new SerieProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			serieproductoRow=(SerieProducto) serieproductoLogic.getSerieProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			serieproductoRow=(SerieProducto) serieproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleSerieProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,SerieProducto serieproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSerieProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto = (SerieProducto)this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.serieproducto = (SerieProducto)this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(serieproducto!=null) {
						this.serieproducto = serieproducto;
					} else {
						this.serieproducto = new SerieProducto();
					}
				}

				if(this.isTienePermisosDetalleSerieProducto && this.permiteMantenimiento(this.serieproducto)) {
					DetalleSerieProductoBeanSwingJInternalFrame detalleserieproductoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup=new DetalleSerieProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleserieproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup;
					} else {
						detalleserieproductoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame;
					}

					List<SerieProducto> serieproductos=new ArrayList<SerieProducto>();
					serieproductos.add(this.serieproducto);
					if(!esRelacionado) {
						//detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.setConGuardarRelaciones(false);
						//detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleserieproductoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSerieProducto.cargarDetalleSerieProductoBeanSwingJInternalFrame(serieproductos,this.serieproducto,detalleserieproductoBeanSwingJInternalFrame,/*conInicializar,*/detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.getConGuardarRelaciones(),detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoSessionBean.getEsGuardarRelacionado());
					detalleserieproductoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleserieproductoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleSerieProducto("no_relacionado");

						detalleserieproductoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleSerieProductoConstantesFunciones.ITAMANIOFILATABLA + (DetalleSerieProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleserieproductoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSerieProducto=(TitledBorder)this.jScrollPanelDatosSerieProducto.getBorder();
						TitledBorder titledBorderDetalleSerieProducto=(TitledBorder)detalleserieproductoBeanSwingJInternalFrame.jScrollPanelDatosDetalleSerieProducto.getBorder();

						titledBorderDetalleSerieProducto.setTitle(titledBorderSerieProducto.getTitle() + " -> Detalle Serie Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleserieproductoBeanSwingJInternalFrame);
						}

						detalleserieproductoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleserieproductoBeanSwingJInternalFrame);

						detalleserieproductoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.serieproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Serie Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSerieProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSerieProducto.setVisible((this.isVisibilidadCeldaNuevoSerieProducto && this.isPermisoNuevoSerieProducto));			
			this.jButtonDuplicarSerieProducto.setVisible((this.isVisibilidadCeldaDuplicarSerieProducto && this.isPermisoDuplicarSerieProducto));			
			this.jButtonCopiarSerieProducto.setVisible((this.isVisibilidadCeldaCopiarSerieProducto && this.isPermisoCopiarSerieProducto));
			this.jButtonVerFormSerieProducto.setVisible((this.isVisibilidadCeldaVerFormSerieProducto && this.isPermisoVerFormSerieProducto));
			
			this.jButtonAbrirOrderBySerieProducto.setVisible((this.isVisibilidadCeldaOrdenSerieProducto && this.isPermisoOrdenSerieProducto));			
			
			this.jButtonNuevoRelacionesSerieProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSerieProducto && this.isPermisoNuevoSerieProducto));			
			this.jButtonNuevoGuardarCambiosSerieProducto.setVisible((this.isVisibilidadCeldaNuevoSerieProducto && this.isPermisoNuevoSerieProducto && this.isPermisoGuardarCambiosSerieProducto));
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonModificarSerieProducto.setVisible((this.isVisibilidadCeldaModificarSerieProducto && this.isPermisoActualizarSerieProducto));	
			this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarSerieProducto.setVisible((this.isVisibilidadCeldaActualizarSerieProducto && this.isPermisoActualizarSerieProducto));	
			this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarSerieProducto.setVisible((this.isVisibilidadCeldaEliminarSerieProducto && this.isPermisoEliminarSerieProducto));
			this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarSerieProducto.setVisible(this.isVisibilidadCeldaCancelarSerieProducto);							
			this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.setVisible((this.isVisibilidadCeldaGuardarSerieProducto && this.isPermisoGuardarCambiosSerieProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaSerieProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSerieProducto && this.isPermisoGuardarCambiosSerieProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSerieProducto.setVisible((this.isVisibilidadCeldaNuevoSerieProducto && this.isPermisoNuevoSerieProducto));						
			this.jButtonDuplicarToolBarSerieProducto.setVisible((this.isVisibilidadCeldaDuplicarSerieProducto && this.isPermisoDuplicarSerieProducto));						
			this.jButtonCopiarToolBarSerieProducto.setVisible((this.isVisibilidadCeldaCopiarSerieProducto && this.isPermisoCopiarSerieProducto));			
			this.jButtonVerFormToolBarSerieProducto.setVisible((this.isVisibilidadCeldaVerFormSerieProducto && this.isPermisoVerFormSerieProducto));			
			this.jButtonAbrirOrderByToolBarSerieProducto.setVisible((this.isVisibilidadCeldaOrdenSerieProducto && this.isPermisoOrdenSerieProducto));
			this.jButtonNuevoRelacionesToolBarSerieProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSerieProducto && this.isPermisoNuevoSerieProducto));			
			this.jButtonNuevoGuardarCambiosToolBarSerieProducto.setVisible((this.isVisibilidadCeldaNuevoSerieProducto && this.isPermisoNuevoSerieProducto && this.isPermisoGuardarCambiosSerieProducto));			
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonModificarToolBarSerieProducto.setVisible((this.isVisibilidadCeldaModificarSerieProducto && this.isPermisoActualizarSerieProducto));	
			this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarToolBarSerieProducto.setVisible((this.isVisibilidadCeldaActualizarSerieProducto  && this.isPermisoActualizarSerieProducto));	
			this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarToolBarSerieProducto.setVisible((this.isVisibilidadCeldaEliminarSerieProducto && this.isPermisoEliminarSerieProducto));
			this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarToolBarSerieProducto.setVisible(this.isVisibilidadCeldaCancelarSerieProducto);				
			this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosToolBarSerieProducto.setVisible((this.isVisibilidadCeldaGuardarSerieProducto && this.isPermisoGuardarCambiosSerieProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSerieProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSerieProducto && this.isPermisoGuardarCambiosSerieProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSerieProducto.setVisible((this.isVisibilidadCeldaNuevoSerieProducto && this.isPermisoNuevoSerieProducto));			
			this.jMenuItemDuplicarSerieProducto.setVisible((this.isVisibilidadCeldaDuplicarSerieProducto && this.isPermisoDuplicarSerieProducto));			
			this.jMenuItemCopiarSerieProducto.setVisible((this.isVisibilidadCeldaCopiarSerieProducto && this.isPermisoCopiarSerieProducto));			
			this.jMenuItemVerFormSerieProducto.setVisible((this.isVisibilidadCeldaVerFormSerieProducto && this.isPermisoVerFormSerieProducto));			
			this.jMenuItemAbrirOrderBySerieProducto.setVisible((this.isVisibilidadCeldaOrdenSerieProducto && this.isPermisoOrdenSerieProducto));			
			//this.jMenuItemMostrarOcultarSerieProducto.setVisible((this.isVisibilidadCeldaOrdenSerieProducto && this.isPermisoOrdenSerieProducto));
			this.jMenuItemDetalleAbrirOrderBySerieProducto.setVisible((this.isVisibilidadCeldaOrdenSerieProducto && this.isPermisoOrdenSerieProducto));			
			//this.jMenuItemDetalleMostrarOcultarSerieProducto.setVisible((this.isVisibilidadCeldaOrdenSerieProducto && this.isPermisoOrdenSerieProducto));			
			this.jMenuItemNuevoRelacionesSerieProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesSerieProducto && this.isPermisoNuevoSerieProducto));			
			this.jMenuItemNuevoGuardarCambiosSerieProducto.setVisible((this.isVisibilidadCeldaNuevoSerieProducto && this.isPermisoNuevoSerieProducto && this.isPermisoGuardarCambiosSerieProducto));									
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemModificarSerieProducto.setVisible((this.isVisibilidadCeldaModificarSerieProducto && this.isPermisoActualizarSerieProducto));	
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemActualizarSerieProducto.setVisible((this.isVisibilidadCeldaActualizarSerieProducto && this.isPermisoActualizarSerieProducto));	
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemEliminarSerieProducto.setVisible((this.isVisibilidadCeldaEliminarSerieProducto && this.isPermisoEliminarSerieProducto));
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemCancelarSerieProducto.setVisible(this.isVisibilidadCeldaCancelarSerieProducto);				
			}
			
			this.jMenuItemGuardarCambiosSerieProducto.setVisible((this.isVisibilidadCeldaGuardarSerieProducto && this.isPermisoGuardarCambiosSerieProducto));						
			this.jMenuItemGuardarCambiosTablaSerieProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosSerieProducto && this.isPermisoGuardarCambiosSerieProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSerieProducto=this.jButtonNuevoSerieProducto.isVisible();
			this.isVisibilidadCeldaDuplicarSerieProducto=this.jButtonDuplicarSerieProducto.isVisible();
			this.isVisibilidadCeldaCopiarSerieProducto=this.jButtonCopiarSerieProducto.isVisible();
			this.isVisibilidadCeldaVerFormSerieProducto=this.jButtonVerFormSerieProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenSerieProducto=this.jButtonAbrirOrderBySerieProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=this.jButtonNuevoRelacionesSerieProducto.isVisible();
			this.isVisibilidadCeldaModificarSerieProducto=this.jButtonModificarSerieProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.isVisibilidadCeldaActualizarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarSerieProducto.isVisible();
			this.isVisibilidadCeldaEliminarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarSerieProducto.isVisible();
			this.isVisibilidadCeldaCancelarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarSerieProducto.isVisible();
			this.isVisibilidadCeldaGuardarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=this.jButtonGuardarCambiosTablaSerieProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSerieProducto=this.jButtonNuevoToolBarSerieProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=this.jButtonNuevoRelacionesToolBarSerieProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.isVisibilidadCeldaModificarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonModificarToolBarSerieProducto.isVisible();
			this.isVisibilidadCeldaActualizarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarToolBarSerieProducto.isVisible();
			this.isVisibilidadCeldaEliminarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarToolBarSerieProducto.isVisible();
			this.isVisibilidadCeldaCancelarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarToolBarSerieProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSerieProducto=this.jButtonGuardarCambiosToolBarSerieProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=this.jButtonGuardarCambiosTablaToolBarSerieProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSerieProducto=this.jMenuItemNuevoSerieProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=this.jMenuItemNuevoRelacionesSerieProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.isVisibilidadCeldaModificarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jMenuItemModificarSerieProducto.isVisible();
			this.isVisibilidadCeldaActualizarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jMenuItemActualizarSerieProducto.isVisible();
			this.isVisibilidadCeldaEliminarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jMenuItemEliminarSerieProducto.isVisible();
			this.isVisibilidadCeldaCancelarSerieProducto=this.jInternalFrameDetalleFormSerieProducto.jMenuItemCancelarSerieProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSerieProducto=this.jMenuItemGuardarCambiosSerieProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=this.jMenuItemGuardarCambiosTablaSerieProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSerieProducto(Boolean esInicializar) {
		if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.serieproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSerieProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualSerieProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSerieProducto() {
		this.jButtonNuevoSerieProducto.setVisible(this.isPermisoNuevoSerieProducto);			
		this.jButtonDuplicarSerieProducto.setVisible(this.isPermisoDuplicarSerieProducto);			
		this.jButtonCopiarSerieProducto.setVisible(this.isPermisoCopiarSerieProducto);			
		this.jButtonVerFormSerieProducto.setVisible(this.isPermisoVerFormSerieProducto);			
		
		this.jButtonAbrirOrderBySerieProducto.setVisible(this.isPermisoOrdenSerieProducto);					
		
		this.jButtonNuevoRelacionesSerieProducto.setVisible(this.isPermisoNuevoSerieProducto);			
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonModificarSerieProducto.setVisible(this.isPermisoActualizarSerieProducto);	
			this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarSerieProducto.setVisible(this.isPermisoActualizarSerieProducto);	
			this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarSerieProducto.setVisible(this.isPermisoEliminarSerieProducto);
			this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarSerieProducto.setVisible(this.isVisibilidadCeldaCancelarSerieProducto);						
			this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.setVisible(this.isPermisoGuardarCambiosSerieProducto);							
		}
		
		this.jButtonGuardarCambiosTablaSerieProducto.setVisible(this.isPermisoActualizarSerieProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSerieProducto() {
		this.jInternalFrameDetalleFormSerieProducto.jButtonModificarSerieProducto.setVisible(this.isPermisoActualizarSerieProducto);	
		this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarSerieProducto.setVisible(this.isPermisoActualizarSerieProducto);	
		this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarSerieProducto.setVisible(this.isPermisoEliminarSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarSerieProducto.setVisible(this.isVisibilidadCeldaCancelarSerieProducto);							
		this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.setVisible((this.isVisibilidadCeldaGuardarSerieProducto && this.isPermisoGuardarCambiosSerieProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSerieProducto() {
		if(SerieProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSerieProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSerieProducto() {
	}
	
	public void jTableDatosSerieProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSerieProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.serieproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSerieProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSerieProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSerieProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSerieProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.serieproductoLogic.getConnexion());

				if(this.serieproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.serieproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSerieProducto=(TitledBorder)this.jScrollPanelDatosSerieProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSerieProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.serieproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaSerieProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebSerieProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSerieProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSerieProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.serieproductoLogic.getConnexion());

				if(this.serieproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.serieproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSerieProducto=(TitledBorder)this.jScrollPanelDatosSerieProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderSerieProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.serieproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoSerieProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderSerieProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosSerieProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderSerieProducto=(TitledBorder)this.jScrollPanelDatosSerieProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderSerieProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoSerieProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebSerieProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSerieProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSerieProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.serieproductoLogic.getConnexion());

				if(this.serieproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.serieproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSerieProducto=(TitledBorder)this.jScrollPanelDatosSerieProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderSerieProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.serieproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo = "+this.serieproducto.getcodigo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.serieproducto.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.serieproducto.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ventaSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getfecha_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_venta = '"+Funciones2.getStringPostgresDate(this.serieproducto.getfecha_venta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.getserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.serieproducto==null) {
						this.serieproducto = new SerieProducto();
					}

					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);
				}

				if(this.serieproducto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.serieproducto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaCompraSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosBusquedaPorFechaCompra();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaEntregaSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosBusquedaPorFechaEntrega();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorFechaVentaSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosBusquedaPorFechaVenta();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosFK_IdBodega();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosFK_IdEmpresa();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSerieProducto(false,false);

			this.getSerieProductosFK_IdProducto();

			this.inicializarActualizarBindingSerieProducto(false);

			//if(SerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.serieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSerieProducto() {
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
		

		if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
			this.jInternalFrameDetalleFormSerieProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormSerieProducto.dispose();
			this.jInternalFrameDetalleFormSerieProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
			this.jInternalFrameReporteDinamicoSerieProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSerieProducto.dispose();
			this.jInternalFrameReporteDinamicoSerieProducto=null;
		}
		
		if(this.jInternalFrameImportacionSerieProducto!=null) {
			this.jInternalFrameImportacionSerieProducto.setVisible(false);	    			
			this.jInternalFrameImportacionSerieProducto.dispose();
			this.jInternalFrameImportacionSerieProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSerieProducto();
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSerieProducto")) {
				jButtonDuplicarSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSerieProducto")) {
				jButtonCopiarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormSerieProducto")) {
				jButtonVerFormSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSerieProducto")) {
				jButtonDuplicarSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSerieProducto")) {
				jButtonDuplicarSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSerieProducto")) {
				jButtonModificarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSerieProducto")) {
				jButtonModificarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSerieProducto")) {
				jButtonModificarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSerieProducto")) {
				jButtonActualizarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSerieProducto")) {
				jButtonActualizarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSerieProducto")) {
				jButtonActualizarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarSerieProducto")) {
				jButtonEliminarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSerieProducto")) {
				jButtonEliminarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSerieProducto")) {
				jButtonEliminarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarSerieProducto")) {
				jButtonCancelarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSerieProducto")) {
				jButtonCancelarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSerieProducto")) {
				jButtonCancelarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarSerieProducto")) {
				jButtonCerrarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSerieProducto")) {
				jButtonCerrarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSerieProducto")) {
				jButtonCerrarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSerieProducto")) {
				jButtonMostrarOcultarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSerieProducto")) {
				jButtonCancelarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSerieProducto")) {
				jButtonCopiarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSerieProducto")) {
				jButtonVerFormSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSerieProducto")) {
				jButtonCopiarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSerieProducto")) {
				jButtonVerFormSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSerieProducto")) {
				jButtonRecargarInformacionSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSerieProducto")) {
				jButtonRecargarInformacionSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSerieProducto")) {
				jButtonRecargarInformacionSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSerieProducto")) {
				jButtonAnterioresSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSerieProducto")) {
				jButtonAnterioresSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSerieProducto")) {
				jButtonAnterioresSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSerieProducto")) {
				jButtonSiguientesSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSerieProducto")) {
				jButtonSiguientesSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSerieProducto")) {
				jButtonSiguientesSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySerieProducto") || sTipo.equals("MenuItemDetalleAbrirOrderBySerieProducto")) {
				jButtonAbrirOrderBySerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSerieProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarSerieProducto")) {
				jButtonMostrarOcultarSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSerieProducto")) {
				jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSerieProducto")) {
				jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSerieProducto")) {
				jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSerieProducto")) {
				jButtonCerrarReporteDinamicoSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSerieProducto")) {
				jButtonGenerarReporteDinamicoSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSerieProducto")) {
				
				jButtonGenerarExcelReporteDinamicoSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSerieProducto")) {
				jButtonCerrarImportacionSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSerieProducto")) {
				
				jButtonGenerarImportacionSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSerieProducto")) {
				
				jButtonAbrirImportacionSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSerieProducto")) {
				jComboBoxTiposAccionesSerieProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSerieProducto")) {
				jComboBoxTiposRelacionesSerieProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSerieProducto")) {
				jComboBoxTiposAccionesSerieProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSerieProducto")) {
				
				jComboBoxTiposSeleccionarSerieProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSerieProducto")) {
				jTextFieldValorCampoGeneralSerieProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySerieProducto")) {
				jButtonAbrirOrderBySerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSerieProducto")) {
				jButtonAbrirOrderBySerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySerieProducto")) {
				jButtonCerrarOrderBySerieProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSerieProductoBusqueda")) {
				this.jButtonidSerieProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSerieProductoUpdate")) {
				this.jButtonid_empresaSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSerieProductoBusqueda")) {
				this.jButtonid_empresaSerieProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaSerieProductoUpdate")) {
				this.jButtonid_bodegaSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaSerieProductoBusqueda")) {
				this.jButtonid_bodegaSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoSerieProducto")) {
				this.jButtonid_productoSerieProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoSerieProductoUpdate")) {
				this.jButtonid_productoSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoSerieProductoBusqueda")) {
				this.jButtonid_productoSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSerieProductoBusqueda")) {
				this.jButtoncodigoSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraSerieProductoBusqueda")) {
				this.jButtonfecha_compraSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaSerieProductoBusqueda")) {
				this.jButtonfecha_entregaSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaSerieProductoBusqueda")) {
				this.jButtonfecha_ventaSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSerieProductoBusqueda")) {
				this.jButtondescripcionSerieProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoSerieProducto")) {
				this.jButtonBusquedaPorCodigoSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaCompraSerieProducto")) {
				this.jButtonBusquedaPorFechaCompraSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaEntregaSerieProducto")) {
				this.jButtonBusquedaPorFechaEntregaSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorFechaVentaSerieProducto")) {
				this.jButtonBusquedaPorFechaVentaSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaSerieProducto")) {
				this.jButtonFK_IdBodegaSerieProductoActionPerformed(evt);
			}
			
			;
			
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSerieProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SerieProducto serieproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				serieproductoLocal=this.serieproducto;
			} else {
				serieproductoLocal=this.serieproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
							
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
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
			
			


			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
								
						
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
								
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
							
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
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
			
			


			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
								
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSerieProducto")) {
					jCheckBoxSeleccionarTodosSerieProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSerieProducto")) {
					jCheckBoxSeleccionadosSerieProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSerieProducto")) {
					
				}
				
				


				
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
												
				
				


				
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
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
			
			


			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSerieProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.serieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.serieproducto);
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
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
				
				


				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SerieProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.serieproductoAnterior =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSerieProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSerieProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSerieProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.serieproducto =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.serieproducto =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.serieproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSerieProducto")) {
				
				}
				
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSerieProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSerieProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSerieProducto")) {
			
			}
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSerieProducto();
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			if(sTipo.equals("NuevoSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSerieProducto")) {
				jButtonDuplicarSerieProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSerieProducto")) {
				jButtonCopiarSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSerieProducto")) {
				jButtonVerFormSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSerieProducto")) {
				jButtonNuevoSerieProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSerieProducto")) {
				jButtonModificarSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSerieProducto")) {
				jButtonActualizarSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSerieProducto")) {
				jButtonEliminarSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSerieProducto")) {
				jButtonCancelarSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSerieProducto")) {
				jButtonCerrarSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSerieProducto")) {
				jButtonGuardarCambiosSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSerieProducto")) {
				jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySerieProducto")) {
				jButtonAbrirOrderBySerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSerieProducto")) {
				jButtonRecargarInformacionSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSerieProducto")) {
				jButtonAnterioresSerieProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSerieProducto")) {
				jButtonSiguientesSerieProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSerieProductoBusqueda")) {
				this.jButtonidSerieProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSerieProductoUpdate")) {
				this.jButtonid_empresaSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSerieProductoBusqueda")) {
				this.jButtonid_empresaSerieProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaSerieProductoUpdate")) {
				this.jButtonid_bodegaSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaSerieProductoBusqueda")) {
				this.jButtonid_bodegaSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoSerieProducto")) {
				this.jButtonid_productoSerieProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoSerieProductoUpdate")) {
				this.jButtonid_productoSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoSerieProductoBusqueda")) {
				this.jButtonid_productoSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSerieProductoBusqueda")) {
				this.jButtoncodigoSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraSerieProductoBusqueda")) {
				this.jButtonfecha_compraSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaSerieProductoBusqueda")) {
				this.jButtonfecha_entregaSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ventaSerieProductoBusqueda")) {
				this.jButtonfecha_ventaSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSerieProductoBusqueda")) {
				this.jButtondescripcionSerieProductoBusquedaActionPerformed(evt);
			}
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSerieProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSerieProducto")) {
				closingInternalFrameSerieProducto();
				
			} else if(sTipo.equals("jButtonCancelarSerieProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormSerieProducto = (JInternalFrameBase)evt.getSource();
	            	
	            SerieProductoBeanSwingJInternalFrame jInternalFrameParent=(SerieProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormSerieProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSerieProductoActionPerformed(null);
			}
			
			SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.serieproducto,new Object(),this.serieproductoParameterGeneral,this.serieproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSerieProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSerieProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSerieProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.serieproducto)) {
			if(!esControlTabla) {
				if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);			
				}
				
				if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSerieProducto(this.serieproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.serieproductoReturnGeneral=serieproductoLogic.procesarEventosSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.serieproductoLogic.getSerieProductos(),this.serieproducto,this.serieproductoParameterGeneral,this.isEsNuevoSerieProducto,classes);//this.serieproductoLogic.getSerieProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSerieProducto(this.serieproductoReturnGeneral,this.serieproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSerieProducto(classes,this.serieproductoReturnGeneral,this.serieproductoBean,false);
					}
						
					if(this.serieproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySerieProducto(this.serieproductoReturnGeneral.getSerieProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSerieProducto(this.serieproductoReturnGeneral.getSerieProducto());	
					}
						
					if(this.serieproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSerieProducto(this.serieproductoReturnGeneral.getSerieProducto(),classes);//this.serieproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSerieProducto(this.serieproducto,classes);//this.serieproductoBean);									
				}
			
				if(SerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSerieProducto(this.serieproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSerieProducto(this.serieproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.serieproductoAnterior!=null) {
						this.serieproducto=this.serieproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.serieproductoReturnGeneral=serieproductoLogic.procesarEventosSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.serieproductoLogic.getSerieProductos(),this.serieproducto,this.serieproductoParameterGeneral,this.isEsNuevoSerieProducto,classes);//this.serieproductoLogic.getSerieProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.serieproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.serieproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.serieproductoReturnGeneral.getSerieProducto(),serieproductoLogic.getSerieProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.serieproductoReturnGeneral.getSerieProducto(),this.serieproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSerieProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosSerieProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSerieProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosSerieProducto() throws Exception {
		
		SerieProductoModel serieproductoModel=(SerieProductoModel)this.jTableDatosSerieProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			serieproductoModel.serieproductos=this.serieproductoLogic.getSerieProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			serieproductoModel.serieproductos=this.serieproductos;
		}
		
		
		((SerieProductoModel) this.jTableDatosSerieProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSerieProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getserieproductoAnterior(),this.serieproductoLogic.getSerieProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getserieproductoAnterior(),this.serieproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSerieProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSerieProducto(SerieProducto serieproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleSerieProducto.class)) {
					this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.setDetalleSerieProductos(serieproducto.getDetalleSerieProductos());
					this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleSerieProducto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
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
										
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.serieproducto,new Object(),generalEntityParameterGeneral,this.serieproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.serieproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SerieProductoConstantesFunciones.getClassesRelationshipsOfSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SerieProductoConstantesFunciones.getClassesRelationshipsFromStringsOfSerieProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSerieProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.serieproducto,new Object(),generalEntityParameterGeneral,this.serieproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSerieProducto(SerieProductoBean serieproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleSerieProducto.class)) {
					this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.setDetalleSerieProductos(serieproducto.getDetalleSerieProductos());
					this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleSerieProducto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSerieProducto(ArrayList<Classe> classes,SerieProductoReturnGeneral serieproductoReturnGeneral,SerieProductoBean serieproductoBean,Boolean conDefault) throws Exception {
		
			this.serieproductoBean.setDetalleSerieProductos(serieproductoReturnGeneral.getSerieProducto().getDetalleSerieProductos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSerieProducto(SerieProducto serieproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleSerieProducto.class)) {
					serieproducto.setDetalleSerieProductos(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoBeanSwingJInternalFrame.detalleserieproductoLogic.getDetalleSerieProductos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.serieproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSerieProducto = new SerieProductoDetalleFormJInternalFrame(jDesktopPane,this.serieproductoSessionBean.getConGuardarRelaciones(),this.serieproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.setVisible(false);
		this.jInternalFrameDetalleFormSerieProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormSerieProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSerieProducto.serieproductoLogic=this.serieproductoLogic;
		
		this.cargarCombosFrameForeignKeySerieProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSerieProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSerieProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySerieProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySerieProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSerieProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSerieProducto"));
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonModificarSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarSerieProducto"));

		
		this.jInternalFrameDetalleFormSerieProducto.jButtonModificarToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarSerieProducto"));
					
		this.jInternalFrameDetalleFormSerieProducto.jMenuItemModificarSerieProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarSerieProducto.addActionListener (new ButtonActionListener(this,"ActualizarSerieProducto"));
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSerieProducto"));
						
		this.jInternalFrameDetalleFormSerieProducto.jMenuItemActualizarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarSerieProducto"));
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarSerieProducto"));
								
		this.jInternalFrameDetalleFormSerieProducto.jMenuItemEliminarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarSerieProducto"));
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarSerieProducto"));
					
		this.jInternalFrameDetalleFormSerieProducto.jMenuItemCancelarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSerieProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jMenuItemDetalleCerrarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSerieProducto"));
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSerieProducto"));
		
		
		
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSerieProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonidSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_empresaSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_empresaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_bodegaSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_bodegaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaSerieProductoBusqueda"));
		//jButtonid_productoSerieProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoSerieProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProducto.addActionListener(new ButtonActionListener(this,"id_productoSerieProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtoncodigoSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_compraSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_entregaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_ventaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtondescripcionSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSerieProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSerieProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSerieProducto"));
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSerieProducto"));
		}
		
		this.jTableDatosSerieProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSerieProducto"));
		
		this.jTableDatosSerieProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSerieProducto"));
		
		this.jButtonNuevoSerieProducto.addActionListener(new ButtonActionListener(this,"NuevoSerieProducto"));
		
		this.jButtonDuplicarSerieProducto.addActionListener(new ButtonActionListener(this,"DuplicarSerieProducto"));
		
		this.jButtonCopiarSerieProducto.addActionListener(new ButtonActionListener(this,"CopiarSerieProducto"));
		
		this.jButtonVerFormSerieProducto.addActionListener(new ButtonActionListener(this,"VerFormSerieProducto"));
		
		
		this.jButtonNuevoToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarSerieProducto"));
			
		this.jButtonDuplicarToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSerieProducto"));
			
		this.jMenuItemNuevoSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSerieProducto"));
			
		this.jMenuItemDuplicarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSerieProducto"));		
		
		
		this.jButtonNuevoRelacionesSerieProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSerieProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSerieProducto"));
			
		this.jMenuItemNuevoRelacionesSerieProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSerieProducto"));		
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonModificarSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonModificarToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarSerieProducto"));
			
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemModificarSerieProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarSerieProducto.addActionListener (new ButtonActionListener(this,"ActualizarSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonActualizarToolBarSerieProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSerieProducto"));
				
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemActualizarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonEliminarToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarSerieProducto"));
						
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemEliminarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonCancelarToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarSerieProducto"));
			
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemCancelarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSerieProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSerieProducto"));		
		
		
		this.jButtonCerrarSerieProducto.addActionListener (new ButtonActionListener(this,"CerrarSerieProducto"));
		
		
		this.jButtonCerrarToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarSerieProducto"));
			
		this.jMenuItemCerrarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSerieProducto"));
			
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jMenuItemDetalleCerrarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSerieProducto"));
		}
		
		this.jButtonCopiarToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarSerieProducto"));
			
		this.jButtonVerFormToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarSerieProducto"));
		
		this.jMenuItemGuardarCambiosSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSerieProducto"));
			
		this.jMenuItemCopiarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSerieProducto"));		
		
		this.jMenuItemVerFormSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSerieProducto"));		
		
		
		this.jButtonGuardarCambiosTablaSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSerieProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSerieProducto"));
			
		this.jMenuItemGuardarCambiosTablaSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSerieProducto"));		
		
		
		
		this.jButtonRecargarInformacionSerieProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionSerieProducto"));
					
		this.jButtonRecargarInformacionToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSerieProducto"));
		
		this.jMenuItemRecargarInformacionSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSerieProducto"));		
		
		
		
		this.jButtonAnterioresSerieProducto.addActionListener (new ButtonActionListener(this,"AnterioresSerieProducto"));
		
		
		this.jButtonAnterioresToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSerieProducto"));
		
		this.jMenuItemAnterioresSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSerieProducto"));		
		
		
		this.jButtonSiguientesSerieProducto.addActionListener (new ButtonActionListener(this,"SiguientesSerieProducto"));
		
		
		this.jButtonSiguientesToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSerieProducto"));
			
		this.jMenuItemSiguientesSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSerieProducto"));
			
		this.jMenuItemAbrirOrderBySerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySerieProducto"));
			
		this.jMenuItemMostrarOcultarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSerieProducto"));
			
		this.jMenuItemDetalleAbrirOrderBySerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySerieProducto"));
			
		this.jMenuItemDetalleMostarOcultarSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSerieProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosSerieProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSerieProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSerieProducto"));
			
		this.jMenuItemNuevoGuardarCambiosSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSerieProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSerieProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSerieProducto"));

		this.jCheckBoxSeleccionadosSerieProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSerieProducto"));
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSerieProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesSerieProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesSerieProducto"));
			
		this.jComboBoxTiposAccionesSerieProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesSerieProducto"));
					
		this.jComboBoxTiposSeleccionarSerieProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSerieProducto"));
			
		this.jTextFieldValorCampoGeneralSerieProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSerieProducto"));		
		
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonidSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_empresaSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_empresaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_bodegaSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_bodegaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaSerieProductoBusqueda"));
		//jButtonid_productoSerieProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoSerieProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProducto.addActionListener(new ButtonActionListener(this,"id_productoSerieProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtoncodigoSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_compraSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_entregaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_ventaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtondescripcionSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSerieProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSerieProducto"));

			this.jButtonBusquedaPorFechaCompraSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaCompraSerieProducto"));

			this.jButtonBusquedaPorFechaEntregaSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaEntregaSerieProducto"));

			this.jButtonBusquedaPorFechaVentaSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaVentaSerieProducto"));

			this.jButtonFK_IdBodegaSerieProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSerieProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSerieProducto!=null) {
				this.jInternalFrameReporteDinamicoSerieProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSerieProducto"));
				this.jInternalFrameReporteDinamicoSerieProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSerieProducto"));
				this.jInternalFrameReporteDinamicoSerieProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSerieProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoSerieProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSerieProducto"));				
			//this.jButtonGenerarReporteDinamicoSerieProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSerieProducto"));
			//this.jButtonGenerarExcelReporteDinamicoSerieProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSerieProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSerieProducto!=null) {
				this.jInternalFrameImportacionSerieProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSerieProducto"));
				this.jInternalFrameImportacionSerieProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSerieProducto"));
				this.jInternalFrameImportacionSerieProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSerieProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySerieProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderBySerieProducto"));
			
			this.jButtonAbrirOrderByToolBarSerieProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSerieProducto"));			
			
			if(this.jInternalFrameOrderBySerieProducto!=null) {
				this.jInternalFrameOrderBySerieProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySerieProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSerieProducto.jTabbedPaneRelacionesSerieProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSerieProducto"));
		
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
            		closingInternalFrameSerieProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSerieProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSerieProducto = (JInternalFrameBase)event.getSource();
	            	
	            SerieProductoBeanSwingJInternalFrame jInternalFrameParent=(SerieProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormSerieProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSerieProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSerieProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSerieProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSerieProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSerieProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSerieProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSerieProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSerieProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSerieProducto";
		inputMap = this.jButtonNuevoSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSerieProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSerieProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSerieProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSerieProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSerieProducto";
		inputMap = this.jButtonNuevoRelacionesSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSerieProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSerieProducto";
		inputMap = this.jButtonModificarSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSerieProducto";
		inputMap = this.jButtonActualizarSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSerieProducto";
		inputMap = this.jButtonEliminarSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSerieProducto";
		inputMap = this.jButtonCancelarSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSerieProducto";
		inputMap = this.jButtonCerrarSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSerieProducto";
		inputMap = this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSerieProducto.jButtonGuardarCambiosSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSerieProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSerieProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSerieProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSerieProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSerieProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSerieProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSerieProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSerieProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonidSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"idSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_empresaSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_empresaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_bodegaSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_bodegaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaSerieProductoBusqueda"));
		//jButtonid_productoSerieProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoSerieProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProducto.addActionListener(new ButtonActionListener(this,"id_productoSerieProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtoncodigoSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_compraSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_entregaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtonfecha_ventaSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ventaSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSerieProducto.jButtondescripcionSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSerieProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoSerieProducto"));

		this.jButtonBusquedaPorFechaCompraSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaCompraSerieProducto"));

		this.jButtonBusquedaPorFechaEntregaSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaEntregaSerieProducto"));

		this.jButtonBusquedaPorFechaVentaSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorFechaVentaSerieProducto"));

		this.jButtonFK_IdBodegaSerieProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaSerieProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSerieProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSerieProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSerieProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
					serieproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SerieProducto serieproductoAux:serieproductos) {
					serieproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSerieProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSerieProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
						serieproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SerieProducto serieproductoAux:serieproductos) {
						serieproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SerieProducto serieproductoAux:serieproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSerieProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSerieProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSerieProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSerieProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSerieProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSerieProducto.getSelectedRows();
			
			SerieProducto serieproductoLocal=new SerieProducto();
			
			//this.seleccionarTodosSerieProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLocal =(SerieProducto) this.serieproductoLogic.getSerieProductos().toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					serieproductoLocal =(SerieProducto) this.serieproductos.toArray()[this.jTableDatosSerieProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				serieproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
						serieproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SerieProducto serieproductoAux:serieproductos) {
						serieproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSerieProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSerieProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSerieProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSerieProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSerieProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSerieProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSerieProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSerieProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSerieProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SerieProducto serieproductoAux:this.serieproductoLogic.getSerieProductos()) {
				
						if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							serieproductoAux.setcodigo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							serieproductoAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							serieproductoAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							serieproductoAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							serieproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SerieProducto serieproductoAux:serieproductos) {
					
						if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							serieproductoAux.setcodigo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							serieproductoAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							serieproductoAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHAVENTA)) {
							existe=true;
							serieproductoAux.setfecha_venta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							serieproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSerieProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSerieProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSerieProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSerieProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSerieProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSerieProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessSerieProducto(conSplash);
				
					this.generarReporteSerieProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSerieProductosSeleccionados();
				//this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSerieProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSerieProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSerieProducto();
				
				this.exportarSerieProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSerieProductos();
				//this.importarSerieProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSerieProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSerieProductosSeleccionados();
				//this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSerieProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSerieProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySerieProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(SerieProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSerieProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSerieProducto(conSplash);
					
						//this.actualizarParametrosGeneralSerieProducto();
						
						this.generarReporteProcesoAccionSerieProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SerieProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Serie ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSerieProducto();
				
						this.actualizarParametrosGeneralSerieProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.serieproductoReturnGeneral=serieproductoLogic.procesarAccionSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.serieproductoLogic.getSerieProductos(),this.serieproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSerieProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSerieProducto();
					
					SerieProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSerieProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSerieProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSerieProducto.jComboBoxTiposAccionesFormularioSerieProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSerieProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSerieProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSerieProducto();
			
			if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
			SerieProducto serieproducto=new SerieProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSerieProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSerieProducto.getSelectedItem();
			
			
			
			
			serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(serieproductosSeleccionados.size()==1) {
				for(SerieProducto serieproductoAux:serieproductosSeleccionados) {
					serieproducto=serieproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Serie Producto")) {
					jButtonDetalleSerieProductoActionPerformed(null,rowIndex,true,false,serieproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSerieProducto();
			
      		//this.finishProcessSerieProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSerieProductoReturnGeneral() throws Exception {
		if(this.serieproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.serieproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.serieproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.serieproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.serieproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.serieproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSerieProducto(false);
		}
		
		if(this.serieproductoReturnGeneral.getConRetornoLista() || this.serieproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.serieproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.serieproductoLogic.setSerieProductos(this.serieproductoReturnGeneral.getSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.serieproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.serieproductoLogic.setSerieProducto(this.serieproductoReturnGeneral.getSerieProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSerieProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralSerieProducto() throws Exception {
		
		
	}
	
	public ArrayList<SerieProducto> getSerieProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSerieProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SerieProducto serieproductoAux:serieproductoLogic.getSerieProductos()) {
					if(serieproductoAux.getIsSelected()) {
						serieproductosSeleccionados.add(serieproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SerieProducto serieproductoAux:this.serieproductos) {
					if(serieproductoAux.getIsSelected()) {
						serieproductosSeleccionados.add(serieproductoAux);				
					}
				}
			}
			
			if(serieproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						serieproductosSeleccionados.addAll(this.serieproductoLogic.getSerieProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						serieproductosSeleccionados.addAll(this.serieproductos);				
					}
				}
			}
		} else {
			serieproductosSeleccionados.add(this.serieproducto);
		}
		
		return serieproductosSeleccionados;
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
	
	public void generarReporteSerieProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSerieProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSerieProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSerieProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSerieProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSerieProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Serie Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSerieProductosSeleccionados() throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSerieProductos("Todos",serieproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalSerieProductosSeleccionados() throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSerieProductos("Todos",serieproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSerieProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSerieProductos("Todos",serieproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSerieProductosSeleccionados() throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSerieProducto();
		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSerieProducto();
		
		
		//this.generarReporteSerieProductos("Todos",serieproductosSeleccionados ,serieproductoImplementable,serieproductoImplementableHome);
	}
	
	public void mostrarImportacionSerieProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSerieProducto();
		
		this.abrirFrameImportacionSerieProducto();		
		
			
		//this.generarReporteSerieProductos("Todos",serieproductosSeleccionados ,serieproductoImplementable,serieproductoImplementableHome);
	}
	
	public void importarSerieProductos() throws Exception {		
	
	}
	
	public void exportarSerieProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSerieProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSerieProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSerieProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Serie Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSerieProductosSeleccionados() throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSerieProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SerieProducto serieproductoAux:serieproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSerieProducto(serieproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//serieproductoAux.setsDetalleGeneralEntityReporte(serieproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSerieProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_FECHAVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SerieProductoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSerieProducto(SerieProducto serieproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=serieproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getcodigo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getfecha_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=serieproducto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSerieProductosSeleccionados() throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SerieProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSerieProducto(row);				
				iRow++;
			}				
			
			for(SerieProducto serieproductoAux:serieproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSerieProducto(serieproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSerieProductosSeleccionados() throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();		
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"serieproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("serieproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("serieproducto");
			//elementRoot.appendChild(element);
		
			for(SerieProducto serieproductoAux:serieproductosSeleccionados) {
				element = document.createElement("serieproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSerieProducto(serieproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSerieProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_FECHAVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(SerieProductoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSerieProducto(SerieProducto serieproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getfecha_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(serieproducto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSerieProducto(SerieProducto serieproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SerieProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(serieproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SerieProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(serieproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SerieProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(serieproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementbodega_descripcion = document.createElement(SerieProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(serieproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(SerieProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(serieproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementcodigo = document.createElement(SerieProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(serieproducto.getcodigo().toString().trim()));
		element.appendChild(elementcodigo);

		Element elementfecha_compra = document.createElement(SerieProductoConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(serieproducto.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementfecha_entrega = document.createElement(SerieProductoConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(serieproducto.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementfecha_venta = document.createElement(SerieProductoConstantesFunciones.FECHAVENTA);
		elementfecha_venta.appendChild(document.createTextNode(serieproducto.getfecha_venta().toString().trim()));
		element.appendChild(elementfecha_venta);

		Element elementdescripcion = document.createElement(SerieProductoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(serieproducto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSerieProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SerieProducto> serieproductosSeleccionados=new ArrayList<SerieProducto>();
		
		serieproductosSeleccionados=this.getSerieProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSerieProducto(serieproductosSeleccionados);
		
		this.generarReporteSerieProductos("Todos",serieproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSerieProducto(ArrayList<SerieProducto> serieproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SerieProducto serieproductoAux:serieproductosSeleccionados) {
				serieproductoAux.setsDetalleGeneralEntityReporte(serieproductoAux.toString());
			
				if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(serieproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(serieproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(serieproductoAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(serieproductoAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(serieproductoAux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_FECHAVENTA)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(serieproductoAux.getfecha_venta()));
				}
				 else if(sTipoSeleccionar.equals(SerieProductoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					serieproductoAux.setsDescripcionGeneralEntityReporte1(serieproductoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSerieProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSerieProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesSerieProducto=true;
				this.isVisibilidadCeldaGuardarCambiosSerieProducto=true;
			}
			
			this.isVisibilidadCeldaModificarSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=false;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
			this.isVisibilidadCeldaModificarSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=true;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
			this.isVisibilidadCeldaModificarSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=true;
			this.isVisibilidadCeldaEliminarSerieProducto=true;
			this.isVisibilidadCeldaCancelarSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
			this.isVisibilidadCeldaModificarSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=true;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSerieProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=true;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=true;
			this.isVisibilidadCeldaModificarSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=false;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
			this.isVisibilidadCeldaActualizarSerieProducto=false;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
			this.isVisibilidadCeldaModificarSerieProducto=true;
			this.isVisibilidadCeldaActualizarSerieProducto=false;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
			this.isVisibilidadCeldaCancelarSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarSerieProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SerieProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSerieProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=true;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=true;
		} else {
			this.actualizarEstadoPanelsSerieProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSerieProducto=false;
			//this.isVisibilidadCeldaVerFormSerieProducto=false;
			this.isVisibilidadCeldaDuplicarSerieProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!serieproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(serieproductoSessionBean.getEsGuardarRelacionado()) {
			if(!serieproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;												
			}
			
			this.jButtonCerrarSerieProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSerieProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.serieproducto)) {
			this.isVisibilidadCeldaActualizarSerieProducto=false;
			this.isVisibilidadCeldaEliminarSerieProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSerieProducto() {
		this.isVisibilidadCeldaNuevoSerieProducto=false;
		this.isVisibilidadCeldaGuardarCambiosSerieProducto=false;
	}
	
	public void actualizarEstadoPanelsSerieProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSerieProducto!=null) {
				this.jScrollPanelDatosEdicionSerieProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSerieProducto!=null) {
				this.jScrollPanelDatosSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionSerieProducto!=null) {
				this.jPanelPaginacionSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSerieProducto!=null) {
					this.jTabbedPaneBusquedasSerieProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.serieproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSerieProducto!=null) {
				this.jTabbedPaneBusquedasSerieProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSerieProducto!=null) {
				this.jPanelParametrosReportesSerieProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorCodigoSerieProducto);}

			this.isVisibilidadBusquedaPorFechaCompra=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaCompra) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaCompraSerieProducto);}

			this.isVisibilidadBusquedaPorFechaEntrega=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaEntrega) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaEntregaSerieProducto);}

			this.isVisibilidadBusquedaPorFechaVenta=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorFechaVenta) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaVentaSerieProducto);}

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelFK_IdBodegaSerieProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaPorCodigo=isParaBodegaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorCodigoSerieProducto);}

			this.isVisibilidadBusquedaPorFechaCompra=isParaBodegaNegation;
			if(!this.isVisibilidadBusquedaPorFechaCompra) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaCompraSerieProducto);}

			this.isVisibilidadBusquedaPorFechaEntrega=isParaBodegaNegation;
			if(!this.isVisibilidadBusquedaPorFechaEntrega) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaEntregaSerieProducto);}

			this.isVisibilidadBusquedaPorFechaVenta=isParaBodegaNegation;
			if(!this.isVisibilidadBusquedaPorFechaVenta) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaVentaSerieProducto);}

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelFK_IdBodegaSerieProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaPorCodigo=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorCodigoSerieProducto);}

			this.isVisibilidadBusquedaPorFechaCompra=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaPorFechaCompra) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaCompraSerieProducto);}

			this.isVisibilidadBusquedaPorFechaEntrega=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaPorFechaEntrega) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaEntregaSerieProducto);}

			this.isVisibilidadBusquedaPorFechaVenta=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaPorFechaVenta) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelBusquedaPorFechaVentaSerieProducto);}

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasSerieProducto.remove(jPanelFK_IdBodegaSerieProducto);}
		}
		
	}
	
	

	public String registrarSesionSerieProductoParaDetalleSerieProductos() throws Exception {
		Boolean isPaginaPopupDetalleSerieProducto=false;

		try {

			if(this.serieproductoSessionBean==null) {
				this.serieproductoSessionBean=new SerieProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean==null) {
				this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
			}

			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.setsPathNavegacionActual(serieproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleSerieProducto=this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleSerieProducto(true);
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleSerieProducto(SerieProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.setisBusquedaDesdeForeignKeySesionSerieProducto(true);
			this.jInternalFrameDetalleFormSerieProducto.detalleserieproductoSessionBean.setlidSerieProductoActual(this.idSerieProductoActual);

			serieproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySerieProducto(true);
			serieproductoSessionBean.setlIdSerieProductoActualForeignKey(this.idSerieProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionSerieProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(serieproductoSessionBean==null) {
				serieproductoSessionBean=new SerieProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(serieproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.serieproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(SerieProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionSerieProducto(true);
			//productoSessionBean.setlidSerieProductoActual(this.idSerieProductoActual);

			serieproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySerieProducto(true);
			serieproductoSessionBean.setlIdSerieProductoActualForeignKey(this.idSerieProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SerieProductoSessionBean serieproductoSessionBean=new SerieProductoSessionBean();
		
		if(this.serieproductoSessionBean==null) {
			this.serieproductoSessionBean=new SerieProductoSessionBean();
		}
		
		this.serieproductoSessionBean.setsUltimaBusquedaSerieProducto(this.getsAccionBusqueda());
		this.serieproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.serieproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			serieproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaCompra")) {
			serieproductoSessionBean.setfecha_compra(this.getfecha_compraBusquedaPorFechaCompra());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaEntrega")) {
			serieproductoSessionBean.setfecha_entrega(this.getfecha_entregaBusquedaPorFechaEntrega());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorFechaVenta")) {
			serieproductoSessionBean.setfecha_venta(this.getfecha_ventaBusquedaPorFechaVenta());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			serieproductoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			serieproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SerieProductoSessionBean serieproductoSessionBean=new SerieProductoSessionBean();
		
		if(this.serieproductoSessionBean==null) {
			this.serieproductoSessionBean=new SerieProductoSessionBean();
		}
		
		if(this.serieproductoSessionBean.getsUltimaBusquedaSerieProducto()!=null&&!this.serieproductoSessionBean.getsUltimaBusquedaSerieProducto().equals("")) {
			this.setsAccionBusqueda(serieproductoSessionBean.getsUltimaBusquedaSerieProducto());
			this.setiNumeroPaginacion(serieproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(serieproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(serieproductoSessionBean.getcodigo());
				serieproductoSessionBean.setcodigo(0.0);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaCompra")) {
				this.setfecha_compraBusquedaPorFechaCompra(serieproductoSessionBean.getfecha_compra());
				serieproductoSessionBean.setfecha_compra(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaEntrega")) {
				this.setfecha_entregaBusquedaPorFechaEntrega(serieproductoSessionBean.getfecha_entrega());
				serieproductoSessionBean.setfecha_entrega(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorFechaVenta")) {
				this.setfecha_ventaBusquedaPorFechaVenta(serieproductoSessionBean.getfecha_venta());
				serieproductoSessionBean.setfecha_venta(new Date());
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(serieproductoSessionBean.getid_bodega());
				serieproductoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(serieproductoSessionBean.getid_empresa());
				serieproductoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.serieproductoSessionBean.setsUltimaBusquedaSerieProducto("");
		this.serieproductoSessionBean.setiNumeroPaginacion(SerieProductoConstantesFunciones.INUMEROPAGINACION);
		this.serieproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSerieProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSerieProducto() {
		this.updateBorderResaltarBusquedasFormularioSerieProducto();
		this.updateVisibilidadBusquedasFormularioSerieProducto();
		this.updateHabilitarBusquedasFormularioSerieProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioSerieProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSerieProducto.getComponents().length>0) {
	

		if(this.serieproductoConstantesFunciones.resaltarBusquedaPorCodigoSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorCodigoSerieProducto);
			}
		}

		if(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaCompraSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaCompraSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaCompraSerieProducto);
			}
		}

		if(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaEntregaSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaEntregaSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaEntregaSerieProducto);
			}
		}

		if(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaVentaSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaVentaSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaVentaSerieProducto);
			}
		}

		if(this.serieproductoConstantesFunciones.resaltarFK_IdBodegaSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelFK_IdBodegaSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarFK_IdBodegaSerieProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSerieProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSerieProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.serieproductoConstantesFunciones.mostrarBusquedaPorCodigoSerieProducto);
			if(!this.serieproductoConstantesFunciones.mostrarBusquedaPorCodigoSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasSerieProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaCompraSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.serieproductoConstantesFunciones.mostrarBusquedaPorFechaCompraSerieProducto);
			if(!this.serieproductoConstantesFunciones.mostrarBusquedaPorFechaCompraSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasSerieProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaEntregaSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.serieproductoConstantesFunciones.mostrarBusquedaPorFechaEntregaSerieProducto);
			if(!this.serieproductoConstantesFunciones.mostrarBusquedaPorFechaEntregaSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasSerieProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaVentaSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.serieproductoConstantesFunciones.mostrarBusquedaPorFechaVentaSerieProducto);
			if(!this.serieproductoConstantesFunciones.mostrarBusquedaPorFechaVentaSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasSerieProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelFK_IdBodegaSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.serieproductoConstantesFunciones.mostrarFK_IdBodegaSerieProducto);
			if(!this.serieproductoConstantesFunciones.mostrarFK_IdBodegaSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasSerieProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSerieProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSerieProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.serieproductoConstantesFunciones.activarBusquedaPorCodigoSerieProducto);
				this.jTabbedPaneBusquedasSerieProducto.setEnabledAt(index,this.serieproductoConstantesFunciones.activarBusquedaPorCodigoSerieProducto);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaCompraSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.serieproductoConstantesFunciones.activarBusquedaPorFechaCompraSerieProducto);
				this.jTabbedPaneBusquedasSerieProducto.setEnabledAt(index,this.serieproductoConstantesFunciones.activarBusquedaPorFechaCompraSerieProducto);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaEntregaSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.serieproductoConstantesFunciones.activarBusquedaPorFechaEntregaSerieProducto);
				this.jTabbedPaneBusquedasSerieProducto.setEnabledAt(index,this.serieproductoConstantesFunciones.activarBusquedaPorFechaEntregaSerieProducto);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaVentaSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.serieproductoConstantesFunciones.activarBusquedaPorFechaVentaSerieProducto);
				this.jTabbedPaneBusquedasSerieProducto.setEnabledAt(index,this.serieproductoConstantesFunciones.activarBusquedaPorFechaVentaSerieProducto);
			}

			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelFK_IdBodegaSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.serieproductoConstantesFunciones.activarFK_IdBodegaSerieProducto);
				this.jTabbedPaneBusquedasSerieProducto.setEnabledAt(index,this.serieproductoConstantesFunciones.activarFK_IdBodegaSerieProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSerieProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorCodigoSerieProducto);

			this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);

			this.serieproductoConstantesFunciones.setResaltarBusquedaPorCodigoSerieProducto(resaltar);

			jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorCodigoSerieProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaCompra")) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaCompraSerieProducto);

			this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);

			this.serieproductoConstantesFunciones.setResaltarBusquedaPorFechaCompraSerieProducto(resaltar);

			jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaCompraSerieProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaEntrega")) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaEntregaSerieProducto);

			this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);

			this.serieproductoConstantesFunciones.setResaltarBusquedaPorFechaEntregaSerieProducto(resaltar);

			jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaEntregaSerieProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorFechaVenta")) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelBusquedaPorFechaVentaSerieProducto);

			this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);

			this.serieproductoConstantesFunciones.setResaltarBusquedaPorFechaVentaSerieProducto(resaltar);

			jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarBusquedaPorFechaVentaSerieProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasSerieProducto.indexOfComponent(this.jPanelFK_IdBodegaSerieProducto);

			this.jTabbedPaneBusquedasSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSerieProducto.getComponent(index);

			this.serieproductoConstantesFunciones.setResaltarFK_IdBodegaSerieProducto(resaltar);

			jPanel.setBorder(this.serieproductoConstantesFunciones.resaltarFK_IdBodegaSerieProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSerieProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSerieProducto() throws Exception {

		if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSerieProducto();
		this.updateVisibilidadResaltarControlesFormularioSerieProducto();
		this.updateHabilitarResaltarControlesFormularioSerieProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioSerieProducto() throws Exception {
		if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.serieproductoConstantesFunciones.resaltaridSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltaridSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarid_empresaSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarid_empresaSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarid_bodegaSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarid_bodegaSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarid_productoSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarid_productoSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarcodigoSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarcodigoSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarfecha_compraSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarfecha_compraSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarfecha_entregaSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarfecha_entregaSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltarfecha_ventaSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltarfecha_ventaSerieProducto);}
		if(this.serieproductoConstantesFunciones.resaltardescripcionSerieProducto!=null && this.jInternalFrameDetalleFormSerieProducto!=null) {this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setBorder(this.serieproductoConstantesFunciones.resaltardescripcionSerieProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSerieProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
	
		//this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostraridSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelidSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostraridSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_empresaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelid_empresaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_empresaSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_bodegaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelid_bodegaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_bodegaSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_productoSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelid_productoSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_productoSerieProducto);
			this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarid_productoSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarcodigoSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelcodigoSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarcodigoSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarfecha_compraSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelfecha_compraSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarfecha_compraSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarfecha_entregaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelfecha_entregaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarfecha_entregaSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarfecha_ventaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPanelfecha_ventaSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrarfecha_ventaSerieProducto);
		//this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrardescripcionSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jPaneldescripcionSerieProducto.setVisible(this.serieproductoConstantesFunciones.mostrardescripcionSerieProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSerieProducto() throws Exception {
		if(this.jInternalFrameDetalleFormSerieProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSerieProducto!=null) {
	
		this.jInternalFrameDetalleFormSerieProducto.jLabelidSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activaridSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_empresaSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarid_empresaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_bodegaSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarid_bodegaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jComboBoxid_productoSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarid_productoSerieProducto);
			this.jInternalFrameDetalleFormSerieProducto.jButtonid_productoSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarid_productoSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jTextFieldcodigoSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarcodigoSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_compraSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarfecha_compraSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_entregaSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarfecha_entregaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jDateChooserfecha_ventaSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activarfecha_ventaSerieProducto);
		this.jInternalFrameDetalleFormSerieProducto.jTextAreadescripcionSerieProducto.setEnabled(this.serieproductoConstantesFunciones.activardescripcionSerieProducto);
		}
	}
	
		
}