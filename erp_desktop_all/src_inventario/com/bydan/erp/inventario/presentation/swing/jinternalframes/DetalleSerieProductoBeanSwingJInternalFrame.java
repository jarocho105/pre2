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

import com.bydan.erp.inventario.util.DetalleSerieProductoConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleSerieProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleSerieProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DetalleSerieProductoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class DetalleSerieProductoBeanSwingJInternalFrame extends DetalleSerieProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleSerieProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleSerieProducto> detalleserieproductoValidator = new ClassValidator<DetalleSerieProducto>(DetalleSerieProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleSerieProducto detalleserieproducto;	
	public DetalleSerieProducto detalleserieproductoAux;
	public DetalleSerieProducto detalleserieproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleSerieProducto detalleserieproductoTotales;
	public Long idDetalleSerieProductoActual;
	public Long iIdNuevoDetalleSerieProducto=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboSerieProducto="";

	public List<SerieProducto> serieproductosForeignKey;

	public List<SerieProducto> getserieproductosForeignKey() {
		return serieproductosForeignKey;
	}

	public void setserieproductosForeignKey(List<SerieProducto> serieproductosForeignKey) {
		this.serieproductosForeignKey = serieproductosForeignKey;
	}

	//OBJETO FK ACTUAL
	public SerieProducto serieproductoForeignKey;

	public SerieProducto getserieproductoForeignKey() {
		return serieproductoForeignKey;
	}

	public void setserieproductoForeignKey(SerieProducto serieproductoForeignKey) {
		this.serieproductoForeignKey = serieproductoForeignKey;
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
	
	public Boolean isPermisoTodoDetalleSerieProducto;
	public Boolean isPermisoNuevoDetalleSerieProducto;
	public Boolean isPermisoActualizarDetalleSerieProducto;
	public Boolean isPermisoActualizarOriginalDetalleSerieProducto;
	public Boolean isPermisoEliminarDetalleSerieProducto;
	public Boolean isPermisoGuardarCambiosDetalleSerieProducto;
	public Boolean isPermisoConsultaDetalleSerieProducto;
	public Boolean isPermisoBusquedaDetalleSerieProducto;
	public Boolean isPermisoReporteDetalleSerieProducto;
	public Boolean isPermisoPaginacionMedioDetalleSerieProducto;
	public Boolean isPermisoPaginacionAltoDetalleSerieProducto;
	public Boolean isPermisoPaginacionTodoDetalleSerieProducto;
	public Boolean isPermisoCopiarDetalleSerieProducto;
	public Boolean isPermisoVerFormDetalleSerieProducto;
	public Boolean isPermisoDuplicarDetalleSerieProducto;
	public Boolean isPermisoOrdenDetalleSerieProducto;
	
	
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
	
	public DetalleSerieProductoParameterReturnGeneral detalleserieproductoReturnGeneral;
	public DetalleSerieProductoParameterReturnGeneral detalleserieproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleSerieProducto=false;
	public Boolean esParaAccionDesdeFormularioDetalleSerieProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleSerieProductoSessionBeanAdditional detalleserieproductoSessionBeanAdditional=null;
	
	public DetalleSerieProductoSessionBeanAdditional getDetalleSerieProductoSessionBeanAdditional() {
		return this.detalleserieproductoSessionBeanAdditional;
	}
	
	public void setDetalleSerieProductoSessionBeanAdditional(DetalleSerieProductoSessionBeanAdditional detalleserieproductoSessionBeanAdditional) {
		try {
			this.detalleserieproductoSessionBeanAdditional=detalleserieproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleSerieProductoBeanSwingJInternalFrameAdditional detalleserieproductoBeanSwingJInternalFrameAdditional=null;
	//public class DetalleSerieProductoBeanSwingJInternalFrame
	
	public DetalleSerieProductoBeanSwingJInternalFrameAdditional getDetalleSerieProductoBeanSwingJInternalFrameAdditional() {
		return this.detalleserieproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleSerieProductoBeanSwingJInternalFrameAdditional(DetalleSerieProductoBeanSwingJInternalFrameAdditional detalleserieproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleserieproductoBeanSwingJInternalFrameAdditional=detalleserieproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleSerieProductoLogic detalleserieproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleSerieProducto detalleserieproductoBean;
	public DetalleSerieProductoConstantesFunciones detalleserieproductoConstantesFunciones;
	//public DetalleSerieProductoParameterReturnGeneral detalleserieproductoReturnGeneral;
	
	//FK
	
	public SerieProductoLogic serieproductoLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleSerieProducto> detalleserieproductos;	
	//public List<DetalleSerieProducto> detalleserieproductosEliminados;
	//public List<DetalleSerieProducto> detalleserieproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleSerieProducto=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleSerieProducto=true;
	public Boolean isVisibilidadCeldaCopiarDetalleSerieProducto=true;
	public Boolean isVisibilidadCeldaVerFormDetalleSerieProducto=true;
	public Boolean isVisibilidadCeldaOrdenDetalleSerieProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
	public Boolean isVisibilidadCeldaModificarDetalleSerieProducto=false;
	public Boolean isVisibilidadCeldaActualizarDetalleSerieProducto=false;
	public Boolean isVisibilidadCeldaEliminarDetalleSerieProducto=false;
	public Boolean isVisibilidadCeldaCancelarDetalleSerieProducto=false;
	public Boolean isVisibilidadCeldaGuardarDetalleSerieProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdSerieProducto=false;
	
	public Long getiIdNuevoDetalleSerieProducto() {
		return this.iIdNuevoDetalleSerieProducto;
	}

	public void setiIdNuevoDetalleSerieProducto(Long iIdNuevoDetalleSerieProducto) {
		this.iIdNuevoDetalleSerieProducto = iIdNuevoDetalleSerieProducto;
	}
	
	public Long getidDetalleSerieProductoActual() {
		return this.idDetalleSerieProductoActual;
	}

	public void setidDetalleSerieProductoActual(Long idDetalleSerieProductoActual) {
		this.idDetalleSerieProductoActual = idDetalleSerieProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleSerieProducto getdetalleserieproducto() {
		return this.detalleserieproducto;
	}

	public void setdetalleserieproducto(DetalleSerieProducto detalleserieproducto) {
		this.detalleserieproducto = detalleserieproducto;
	}
	
	public DetalleSerieProducto getdetalleserieproductoAux() {
		return this.detalleserieproductoAux;
	}

	public void setdetalleserieproductoAux(DetalleSerieProducto detalleserieproductoAux) {
		this.detalleserieproductoAux = detalleserieproductoAux;
	}				
	
	public DetalleSerieProducto getdetalleserieproductoAnterior() {
		return this.detalleserieproductoAnterior;
	}

	public void setdetalleserieproductoAnterior(DetalleSerieProducto detalleserieproductoAnterior) {
		this.detalleserieproductoAnterior = detalleserieproductoAnterior;
	}	
	
	public DetalleSerieProducto getdetalleserieproductoTotales() {
		return this.detalleserieproductoTotales;
	}

	public void setdetalleserieproductoTotales(DetalleSerieProducto detalleserieproductoTotales) {
		this.detalleserieproductoTotales = detalleserieproductoTotales;
	}	
	
	public DetalleSerieProducto getdetalleserieproductoBean() {
		return this.detalleserieproductoBean;
	}

	public void setdetalleserieproductoBean(DetalleSerieProducto detalleserieproductoBean) {
		this.detalleserieproductoBean = detalleserieproductoBean;
	}	
	
	public DetalleSerieProductoParameterReturnGeneral getdetalleserieproductoReturnGeneral() {
		return this.detalleserieproductoReturnGeneral;
	}

	public void setdetalleserieproductoReturnGeneral(DetalleSerieProductoParameterReturnGeneral detalleserieproductoReturnGeneral) {
		this.detalleserieproductoReturnGeneral = detalleserieproductoReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_serie_productoFK_IdSerieProducto=-1L;

	public Long getid_serie_productoFK_IdSerieProducto() {
		return this.id_serie_productoFK_IdSerieProducto;
	}

	public void setid_serie_productoFK_IdSerieProducto(Long id_serie_productoFK_IdSerieProducto) {
		this.id_serie_productoFK_IdSerieProducto = id_serie_productoFK_IdSerieProducto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleSerieProductoLogic getDetalleSerieProductoLogic()	{		
		return detalleserieproductoLogic;
	}

	public void setDetalleSerieProductoLogic(DetalleSerieProductoLogic detalleserieproductoLogic) {
		this.detalleserieproductoLogic = detalleserieproductoLogic;
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
	
	public Boolean getIsEsNuevoDetalleSerieProducto() {
		return isEsNuevoDetalleSerieProducto;
	}

	public void setIsEsNuevoDetalleSerieProducto(Boolean isEsNuevoDetalleSerieProducto) {
		this.isEsNuevoDetalleSerieProducto = isEsNuevoDetalleSerieProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleSerieProducto() {
		return esParaAccionDesdeFormularioDetalleSerieProducto;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleSerieProducto(Boolean esParaAccionDesdeFormularioDetalleSerieProducto) {
		this.esParaAccionDesdeFormularioDetalleSerieProducto = esParaAccionDesdeFormularioDetalleSerieProducto;
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
	
	
	public void cargarCombosSerieProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.serieproductosForeignKey=new ArrayList<SerieProducto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SerieProductoLogic serieproductoLogic=new SerieProductoLogic();

			serieproductoLogic.getSerieProductoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleserieproductoSessionBean==null) {
				this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
			}

			if(!this.detalleserieproductoSessionBean.getisBusquedaDesdeForeignKeySesionSerieProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getSerieProductoDataAccess().setIsForForeingKeyData(true);

					serieproductoLogic.getTodosSerieProductosWithConnection(sFinalQuery,new Pagination());

					this.serieproductosForeignKey=serieproductoLogic.getSerieProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSerieProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					serieproductoLogic.getEntityWithConnection(detalleserieproductoSessionBean.getlidSerieProductoActual());
					this.serieproductosForeignKey.add(serieproductoLogic.getSerieProducto());
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

	
	
	public void setActualSerieProductoForeignKey(Long idSerieProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			SerieProducto  serieproductoTemp=null;

			for(SerieProducto serieproductoAux:serieproductosForeignKey) {
				if(serieproductoAux.getId()!=null && serieproductoAux.getId().equals(idSerieProductoSeleccionado)) {
					serieproductoTemp=serieproductoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(serieproductoTemp!=null) {

					if(this.detalleserieproducto!=null) {
						this.detalleserieproducto.setSerieProducto(serieproductoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
						this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setSelectedItem(serieproductoTemp);
					}
				} else {
					//jComboBoxid_serie_productoDetalleSerieProducto.setSelectedItem(serieproductoTemp);
					if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
						if(this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSerieProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(serieproductoTemp!=null && jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto!=null) {
						jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setSelectedItem(serieproductoTemp);
					} else {
						if(jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto!=null) {
							//jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setSelectedItem(serieproductoTemp);
							if(jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.getItemCount()>0) {
								jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setSelectedIndex(0);
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

	public String getActualSerieProductoForeignKeyDescripcion(Long idSerieProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			SerieProducto  serieproductoTemp=null;

			for(SerieProducto serieproductoAux:serieproductosForeignKey) {
				if(serieproductoAux.getId()!=null && serieproductoAux.getId().equals(idSerieProductoSeleccionado)) {
					serieproductoTemp=serieproductoAux;
					break;
				}
			}


			sDescripcion=SerieProductoConstantesFunciones.getSerieProductoDescripcion(serieproductoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSerieProductoForeignKeyGenerico(Long idSerieProductoSeleccionado,JComboBox jComboBoxid_serie_productoDetalleSerieProductoGenerico)throws Exception
	{
		try
		{
			SerieProducto  serieproductoTemp=null;

			for(SerieProducto serieproductoAux:serieproductosForeignKey) {
				if(serieproductoAux.getId()!=null && serieproductoAux.getId().equals(idSerieProductoSeleccionado)) {
					serieproductoTemp=serieproductoAux;
					break;
				}
			}

			if(serieproductoTemp!=null) {
				jComboBoxid_serie_productoDetalleSerieProductoGenerico.setSelectedItem(serieproductoTemp);
			} else {
				if(jComboBoxid_serie_productoDetalleSerieProductoGenerico!=null && jComboBoxid_serie_productoDetalleSerieProductoGenerico.getItemCount()>0) {
					jComboBoxid_serie_productoDetalleSerieProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSerieProductoForeignKey(DetalleSerieProducto detalleserieproducto,JComboBox jComboBoxid_serie_productoDetalleSerieProductoGenerico)throws Exception
	{
		try
		{
			SerieProducto  serieproductoAux=new SerieProducto();

			if(jComboBoxid_serie_productoDetalleSerieProductoGenerico==null) {
				serieproductoAux=(SerieProducto)this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.getSelectedItem();
			} else {
				serieproductoAux=(SerieProducto)jComboBoxid_serie_productoDetalleSerieProductoGenerico.getSelectedItem();
			}

			if(serieproductoAux!=null && serieproductoAux.getId()!=null) {
				detalleserieproducto.setid_serie_producto(serieproductoAux.getId());
				detalleserieproducto.setserieproducto_descripcion(DetalleSerieProductoConstantesFunciones.getSerieProductoDescripcion(serieproductoAux));
				detalleserieproducto.setSerieProducto(serieproductoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSerieProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSerieProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { 
							this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.removeAllItems();

							for(SerieProducto serieproducto:this.serieproductosForeignKey) {
								this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.addItem(serieproducto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { 
					}

					if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSerieProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.removeAllItems();

							for(SerieProducto serieproducto:this.serieproductosForeignKey) {
								this.jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.addItem(serieproducto);
							}
						}

						if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameSerieProductoForeignKey(SerieProducto serieproducto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
							this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setSelectedItem(serieproducto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
							this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setSelectedItem(serieproducto);
						} else {
							this.jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleSerieProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleSerieProductoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleSerieProducto(this.detalleserieproductoLogic.getDetalleSerieProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleSerieProductoConstantesFunciones.refrescarForeignKeysDescripcionesDetalleSerieProducto(this.detalleserieproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(SerieProducto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleserieproductoLogic.setDetalleSerieProductos(this.detalleserieproductos);
			detalleserieproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleSerieProductoParameterReturnGeneral getDetalleSerieProductoParameterGeneral() {
		return this.detalleserieproductoParameterGeneral;
	}
	
	public void setDetalleSerieProductoParameterGeneral(DetalleSerieProductoParameterReturnGeneral detalleserieproductoParameterGeneral) {
		this.detalleserieproductoParameterGeneral = detalleserieproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleSerieProducto() {
		return isPermisoTodoDetalleSerieProducto;
	}

	public void setIsPermisoTodoDetalleSerieProducto(Boolean isPermisoTodoDetalleSerieProducto) {
		this.isPermisoTodoDetalleSerieProducto = isPermisoTodoDetalleSerieProducto;
	}

	public Boolean getIsPermisoNuevoDetalleSerieProducto() {
		return isPermisoNuevoDetalleSerieProducto;
	}

	public void setIsPermisoNuevoDetalleSerieProducto(Boolean isPermisoNuevoDetalleSerieProducto) {
		this.isPermisoNuevoDetalleSerieProducto = isPermisoNuevoDetalleSerieProducto;
	}

	public Boolean getIsPermisoActualizarDetalleSerieProducto() {
		return isPermisoActualizarDetalleSerieProducto;
	}

	public void setIsPermisoActualizarDetalleSerieProducto(Boolean isPermisoActualizarDetalleSerieProducto) {
		this.isPermisoActualizarDetalleSerieProducto = isPermisoActualizarDetalleSerieProducto;
	}

	public Boolean getIsPermisoEliminarDetalleSerieProducto() {
		return isPermisoEliminarDetalleSerieProducto;
	}

	public void setIsPermisoEliminarDetalleSerieProducto(Boolean isPermisoEliminarDetalleSerieProducto) {
		this.isPermisoEliminarDetalleSerieProducto = isPermisoEliminarDetalleSerieProducto;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleSerieProducto() {
		return isPermisoGuardarCambiosDetalleSerieProducto;
	}

	public void setIsPermisoGuardarCambiosDetalleSerieProducto(Boolean isPermisoGuardarCambiosDetalleSerieProducto) {
		this.isPermisoGuardarCambiosDetalleSerieProducto = isPermisoGuardarCambiosDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoConsultaDetalleSerieProducto() {
		return isPermisoConsultaDetalleSerieProducto;
	}

	public void setIsPermisoConsultaDetalleSerieProducto(Boolean isPermisoConsultaDetalleSerieProducto) {
		this.isPermisoConsultaDetalleSerieProducto = isPermisoConsultaDetalleSerieProducto;
	}

	public Boolean getIsPermisoBusquedaDetalleSerieProducto() {
		return isPermisoBusquedaDetalleSerieProducto;
	}

	public void setIsPermisoBusquedaDetalleSerieProducto(Boolean isPermisoBusquedaDetalleSerieProducto) {
		this.isPermisoBusquedaDetalleSerieProducto = isPermisoBusquedaDetalleSerieProducto;
	}

	public Boolean getIsPermisoReporteDetalleSerieProducto() {
		return isPermisoReporteDetalleSerieProducto;
	}

	public void setIsPermisoReporteDetalleSerieProducto(Boolean isPermisoReporteDetalleSerieProducto) {
		this.isPermisoReporteDetalleSerieProducto = isPermisoReporteDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleSerieProducto() {
		return isPermisoPaginacionMedioDetalleSerieProducto;
	}

	public void setIsPermisoPaginacionMedioDetalleSerieProducto(Boolean isPermisoPaginacionMedioDetalleSerieProducto) {
		this.isPermisoPaginacionMedioDetalleSerieProducto = isPermisoPaginacionMedioDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleSerieProducto() {
		return isPermisoPaginacionTodoDetalleSerieProducto;
	}

	public void setIsPermisoPaginacionTodoDetalleSerieProducto(Boolean isPermisoPaginacionTodoDetalleSerieProducto) {
		this.isPermisoPaginacionTodoDetalleSerieProducto = isPermisoPaginacionTodoDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleSerieProducto() {
		return isPermisoPaginacionAltoDetalleSerieProducto;
	}

	public void setIsPermisoPaginacionAltoDetalleSerieProducto(Boolean isPermisoPaginacionAltoDetalleSerieProducto) {
		this.isPermisoPaginacionAltoDetalleSerieProducto = isPermisoPaginacionAltoDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoCopiarDetalleSerieProducto() {
		return isPermisoCopiarDetalleSerieProducto;
	}

	public void setIsPermisoCopiarDetalleSerieProducto(Boolean isPermisoCopiarDetalleSerieProducto) {
		this.isPermisoCopiarDetalleSerieProducto = isPermisoCopiarDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoVerFormDetalleSerieProducto() {
		return isPermisoVerFormDetalleSerieProducto;
	}

	public void setIsPermisoVerFormDetalleSerieProducto(Boolean isPermisoVerFormDetalleSerieProducto) {
		this.isPermisoVerFormDetalleSerieProducto = isPermisoVerFormDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoDuplicarDetalleSerieProducto() {
		return isPermisoDuplicarDetalleSerieProducto;
	}

	public void setIsPermisoDuplicarDetalleSerieProducto(Boolean isPermisoDuplicarDetalleSerieProducto) {
		this.isPermisoDuplicarDetalleSerieProducto = isPermisoDuplicarDetalleSerieProducto;
	}
	
	public Boolean getIsPermisoOrdenDetalleSerieProducto() {
		return isPermisoOrdenDetalleSerieProducto;
	}

	public void setIsPermisoOrdenDetalleSerieProducto(Boolean isPermisoOrdenDetalleSerieProducto) {
		this.isPermisoOrdenDetalleSerieProducto = isPermisoOrdenDetalleSerieProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleSerieProducto() {
		return isVisibilidadCeldaNuevoDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaNuevoDetalleSerieProducto(Boolean isVisibilidadCeldaNuevoDetalleSerieProducto) {
		this.isVisibilidadCeldaNuevoDetalleSerieProducto = isVisibilidadCeldaNuevoDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleSerieProducto() {
		return isVisibilidadCeldaDuplicarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleSerieProducto(Boolean isVisibilidadCeldaDuplicarDetalleSerieProducto) {
		this.isVisibilidadCeldaDuplicarDetalleSerieProducto = isVisibilidadCeldaDuplicarDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleSerieProducto() {
		return isVisibilidadCeldaCopiarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaCopiarDetalleSerieProducto(Boolean isVisibilidadCeldaCopiarDetalleSerieProducto) {
		this.isVisibilidadCeldaCopiarDetalleSerieProducto = isVisibilidadCeldaCopiarDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleSerieProducto() {
		return isVisibilidadCeldaVerFormDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaVerFormDetalleSerieProducto(Boolean isVisibilidadCeldaVerFormDetalleSerieProducto) {
		this.isVisibilidadCeldaVerFormDetalleSerieProducto = isVisibilidadCeldaVerFormDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleSerieProducto() {
		return isVisibilidadCeldaOrdenDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaOrdenDetalleSerieProducto(Boolean isVisibilidadCeldaOrdenDetalleSerieProducto) {
		this.isVisibilidadCeldaOrdenDetalleSerieProducto = isVisibilidadCeldaOrdenDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleSerieProducto() {
		return isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleSerieProducto(Boolean isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto = isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleSerieProducto() {
		return isVisibilidadCeldaModificarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaModificarDetalleSerieProducto(Boolean isVisibilidadCeldaModificarDetalleSerieProducto) {
		this.isVisibilidadCeldaModificarDetalleSerieProducto = isVisibilidadCeldaModificarDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleSerieProducto() {
		return isVisibilidadCeldaActualizarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaActualizarDetalleSerieProducto(Boolean isVisibilidadCeldaActualizarDetalleSerieProducto) {
		this.isVisibilidadCeldaActualizarDetalleSerieProducto = isVisibilidadCeldaActualizarDetalleSerieProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleSerieProducto() {
		return isVisibilidadCeldaEliminarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaEliminarDetalleSerieProducto(Boolean isVisibilidadCeldaEliminarDetalleSerieProducto) {
		this.isVisibilidadCeldaEliminarDetalleSerieProducto = isVisibilidadCeldaEliminarDetalleSerieProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleSerieProducto() {
		return isVisibilidadCeldaCancelarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaCancelarDetalleSerieProducto(Boolean isVisibilidadCeldaCancelarDetalleSerieProducto) {
		this.isVisibilidadCeldaCancelarDetalleSerieProducto = isVisibilidadCeldaCancelarDetalleSerieProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleSerieProducto() {
		return isVisibilidadCeldaGuardarDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaGuardarDetalleSerieProducto(Boolean isVisibilidadCeldaGuardarDetalleSerieProducto) {
		this.isVisibilidadCeldaGuardarDetalleSerieProducto = isVisibilidadCeldaGuardarDetalleSerieProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleSerieProducto() {
		return isVisibilidadCeldaGuardarCambiosDetalleSerieProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleSerieProducto(Boolean isVisibilidadCeldaGuardarCambiosDetalleSerieProducto) {
		this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto = isVisibilidadCeldaGuardarCambiosDetalleSerieProducto;
	}
		
	public DetalleSerieProductoSessionBean getdetalleserieproductoSessionBean() {
		return this.detalleserieproductoSessionBean;
	}
	
	public void setdetalleserieproductoSessionBean(DetalleSerieProductoSessionBean detalleserieproductoSessionBean) {
		this.detalleserieproductoSessionBean=detalleserieproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdSerieProducto() {
		return this.isVisibilidadFK_IdSerieProducto;
	}

	public void setisVisibilidadFK_IdSerieProducto(Boolean isVisibilidadFK_IdSerieProducto) {
		this.isVisibilidadFK_IdSerieProducto=isVisibilidadFK_IdSerieProducto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(DetalleSerieProducto detalleserieproducto)throws Exception {
		try {
			
				this.setActualParaGuardarSerieProductoForeignKey(detalleserieproducto,null);
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
	
	public void bugActualizarReferenciaActual(DetalleSerieProducto detalleserieproducto,DetalleSerieProducto detalleserieproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleSerieProducto(detalleserieproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleserieproductoAux.setId(detalleserieproducto.getId());
		detalleserieproductoAux.setVersionRow(detalleserieproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleSerieProducto();
		
			int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleserieproductoValidator.getInvalidValues(this.detalleserieproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleserieproductoLogic.setDatosCliente(datosCliente);
			detalleserieproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleserieproductoAux=new  DetalleSerieProducto();
				
				detalleserieproductoAux.setIsNew(true);
				detalleserieproductoAux.setIsChanged(true);
				
				detalleserieproductoAux.setDetalleSerieProductoOriginal(this.detalleserieproducto);
				
				detalleserieproductoAux.setId(this.detalleserieproducto.getId());	
				detalleserieproductoAux.setVersionRow(this.detalleserieproducto.getVersionRow());	
				detalleserieproductoAux.setid_serie_producto(this.detalleserieproducto.getid_serie_producto());	
				detalleserieproductoAux.setnombre(this.detalleserieproducto.getnombre());	
				detalleserieproductoAux.setdescripcion(this.detalleserieproducto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleserieproductoAux,detalleserieproductoLogic.getDetalleSerieProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserieproductoAux,detalleserieproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoLogic.saveDetalleSerieProductos();//WithConnection
						//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleserieproducto,detalleserieproductoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleSerieProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleserieproductoLogic.saveDetalleSerieProductoRelaciones(detalleserieproductoAux);//WithConnection
								//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleserieproducto,detalleserieproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleserieproductoAux,detalleserieproductoLogic.getDetalleSerieProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleserieproductoAux,detalleserieproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleserieproducto,detalleserieproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleserieproductoAux=new  DetalleSerieProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleserieproductoSessionBean.getEsGuardarRelacionado() && this.detalleserieproducto.getId()>=0)) {
						
					detalleserieproductoAux.setIsNew(false);
				}
				
				detalleserieproductoAux.setIsDeleted(false);
			
				detalleserieproductoAux.setId(this.detalleserieproducto.getId());	
				detalleserieproductoAux.setVersionRow(this.detalleserieproducto.getVersionRow());	
				detalleserieproductoAux.setid_serie_producto(this.detalleserieproducto.getid_serie_producto());	
				detalleserieproductoAux.setnombre(this.detalleserieproducto.getnombre());	
				detalleserieproductoAux.setdescripcion(this.detalleserieproducto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleserieproductoAux,detalleserieproductoLogic.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserieproductoAux,detalleserieproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoLogic.saveDetalleSerieProductos();//WithConnection
						//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleserieproducto,detalleserieproductoAux);
					
					this.refrescarForeignKeysDescripcionesDetalleSerieProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleserieproductoLogic.saveDetalleSerieProductoRelaciones(detalleserieproductoAux);//WithConnection
								//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleserieproducto,detalleserieproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleserieproductoAux,detalleserieproductoLogic.getDetalleSerieProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleserieproductoAux,detalleserieproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleserieproducto,detalleserieproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleserieproductoAux=new  DetalleSerieProducto();
				
				detalleserieproductoAux.setIsNew(false);
				detalleserieproductoAux.setIsChanged(false);
				
				detalleserieproductoAux.setIsDeleted(true);
				
				detalleserieproductoAux.setId(this.detalleserieproducto.getId());	
				detalleserieproductoAux.setVersionRow(this.detalleserieproducto.getVersionRow());	
				detalleserieproductoAux.setid_serie_producto(this.detalleserieproducto.getid_serie_producto());	
				detalleserieproductoAux.setnombre(this.detalleserieproducto.getnombre());	
				detalleserieproductoAux.setdescripcion(this.detalleserieproducto.getdescripcion());	
				
				if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleserieproductoAux.getId()>=0) {	
						this.detalleserieproductosEliminados.add(detalleserieproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleserieproductoAux,detalleserieproductoLogic.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserieproductoAux,detalleserieproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoLogic.saveDetalleSerieProductos();//WithConnection
						//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleserieproductoLogic.saveDetalleSerieProductoRelaciones(detalleserieproductoAux);//WithConnection
								//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
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
							if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleserieproductoAux,detalleserieproductoLogic.getDetalleSerieProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleserieproductoAux,detalleserieproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.getDetalleSerieProductos().addAll(this.detalleserieproductosEliminados);
					
					detalleserieproductoLogic.saveDetalleSerieProductos();//WithConnection
					//detalleserieproductoLogic.getSetVersionRowDetalleSerieProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleSerieProducto();
				
				this.detalleserieproductosEliminados= new ArrayList<DetalleSerieProducto>();		
			}
			
			if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Serie Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleserieproducto=detalleserieproductoAux;
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
      		//this.finishProcessDetalleSerieProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleSerieProducto detalleserieproductoLocal) throws Exception {
		
		if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleSerieProducto detalleserieproductoLocal) throws Exception {	
		if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(SerieProductoDetalleFormJInternalFrame.class)) {
				SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFrameLocal=(SerieProductoBeanSwingJInternalFrame) ((SerieProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				serieproductoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSerieProducto(serieproductoBeanSwingJInternalFrameLocal.getserieproducto(),true);
				serieproductoBeanSwingJInternalFrameLocal.actualizarLista(serieproductoBeanSwingJInternalFrameLocal.serieproducto,this.serieproductosForeignKey);

				serieproductoBeanSwingJInternalFrameLocal.actualizarRelaciones(serieproductoBeanSwingJInternalFrameLocal.serieproducto);

				detalleserieproductoLocal.setSerieProducto(serieproductoBeanSwingJInternalFrameLocal.serieproducto);

				this.addItemDefectoCombosForeignKeySerieProducto();
				this.cargarCombosFrameSerieProductosForeignKey("Formulario");
				this.setActualSerieProductoForeignKey(serieproductoBeanSwingJInternalFrameLocal.serieproducto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleSerieProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleserieproductoValidator.getInvalidValues(this.detalleserieproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleSerieProducto detalleserieproducto,List<DetalleSerieProducto> detalleserieproductos) throws Exception {
		try	{		
			DetalleSerieProductoConstantesFunciones.actualizarLista(detalleserieproducto,detalleserieproductos,this.detalleserieproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleSerieProducto detalleserieproducto,List<DetalleSerieProducto> detalleserieproductos) throws Exception {
		try	{			
			DetalleSerieProductoConstantesFunciones.actualizarSelectedLista(detalleserieproducto,detalleserieproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleSerieProducto> detalleserieproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleserieproductosLocal=this.detalleserieproductoLogic.getDetalleSerieProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleserieproductosLocal=this.detalleserieproductos;
			}
			//ARCHITECTURE
		
			for(DetalleSerieProducto detalleserieproductoLocal:detalleserieproductosLocal) {
				if(this.permiteMantenimiento(detalleserieproductoLocal) && detalleserieproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleSerieProductoConstantesFunciones.getDetalleSerieProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleSerieProductoConstantesFunciones.IDSERIEPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelid_serie_productoDetalleSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleSerieProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelnombreDetalleSerieProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleSerieProductoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabeldescripcionDetalleSerieProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelid_serie_productoDetalleSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelnombreDetalleSerieProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabeldescripcionDetalleSerieProducto,"");
		
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
		this.iIdNuevoDetalleSerieProducto--;	
		
		
		this.detalleserieproductoAux=new DetalleSerieProducto();
		
		this.detalleserieproductoAux.setId(this.iIdNuevoDetalleSerieProducto);
		this.detalleserieproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleserieproductoLogic.getDetalleSerieProductos().add(this.detalleserieproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleserieproductos.add(this.detalleserieproductoAux);
		}
		//ARCHITECTURE
		
		this.detalleserieproducto=this.detalleserieproductoAux;
		
		if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleSerieProducto(this.detalleserieproducto);
		}
				
		//this.setDefaultControlesDetalleSerieProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleSerieProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleSerieProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleSerieProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleSerieProducto(this.detalleserieproductoBean,this.detalleserieproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
			classes=DetalleSerieProductoConstantesFunciones.getClassesRelationshipsOfDetalleSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleserieproductoReturnGeneral=detalleserieproductoLogic.procesarEventosDetalleSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleserieproductoLogic.getDetalleSerieProductos(),this.detalleserieproducto,this.detalleserieproductoParameterGeneral,this.isEsNuevoDetalleSerieProducto,classes);//this.detalleserieproductoLogic.getDetalleSerieProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleSerieProducto(this.detalleserieproductoReturnGeneral,this.detalleserieproductoBean,false);
		
		if(this.detalleserieproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto());
		}
		
		if(this.detalleserieproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto(),classes);//this.detalleserieproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleSerieProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleSerieProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.RecargarFormDetalleSerieProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleSerieProducto(false);
						
			if(detalleserieproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleSerieProducto();
			}
			
			this.actualizarVisualTableDatosDetalleSerieProducto();
			
			this.jTableDatosDetalleSerieProducto.setRowSelectionInterval(this.getIndiceNuevoDetalleSerieProducto(), this.getIndiceNuevoDetalleSerieProducto());
			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
						
			this.actualizarEstadoCeldasBotonesDetalleSerieProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleSerieProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setEnabled(isHabilitar && this.detalleserieproductoConstantesFunciones.activarnombreDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setEnabled(isHabilitar && this.detalleserieproductoConstantesFunciones.activardescripcionDetalleSerieProducto);	
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setEnabled(isHabilitar && this.detalleserieproductoConstantesFunciones.activarid_serie_productoDetalleSerieProducto);
	};
	
	public void setDefaultControlesDetalleSerieProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleSerieProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleserieproductoSessionBean.setConGuardarRelaciones(true);			
			this.detalleserieproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.setVisible(true);
			
					
		} else {
			//this.detalleserieproductoSessionBean.setConGuardarRelaciones(false);			
			this.detalleserieproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleSerieProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
				if(detalleserieproductoAux.getId().equals(this.iIdNuevoDetalleSerieProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductos) {
				if(detalleserieproductoAux.getId().equals(this.iIdNuevoDetalleSerieProducto)) {
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
	
	public int getIndiceActualDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
				if(detalleserieproductoAux.getId().equals(detalleserieproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductos) {
				if(detalleserieproductoAux.getId().equals(detalleserieproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleSerieProducto(DetalleSerieProducto detalleserieproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
				if(detalleserieproductoAux.getDetalleSerieProductoOriginal().getId().equals(detalleserieproductoOriginal.getId())) {
					existe=true;
					detalleserieproductoOriginal.setId(detalleserieproductoAux.getId());
					detalleserieproductoOriginal.setVersionRow(detalleserieproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductos) {
				if(detalleserieproductoAux.getDetalleSerieProductoOriginal().getId().equals(detalleserieproductoOriginal.getId())) {
					existe=true;
					detalleserieproductoOriginal.setId(detalleserieproductoAux.getId());
					detalleserieproductoOriginal.setVersionRow(detalleserieproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleSerieProducto(Boolean esParaCancelar) throws Exception {
		detalleserieproductosAux=new ArrayList<DetalleSerieProducto>();
		detalleserieproductoAux=new DetalleSerieProducto();
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
					if(detalleserieproductoAux.getId()<0) {
						detalleserieproductosAux.add(detalleserieproductoAux);
					}		
				}
				this.iIdNuevoDetalleSerieProducto=0L;
				this.detalleserieproductoLogic.getDetalleSerieProductos().removeAll(detalleserieproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductos) {
					if(detalleserieproductoAux.getId()<0) {
						detalleserieproductosAux.add(detalleserieproductoAux);
					}		
				}
				this.iIdNuevoDetalleSerieProducto=0L;
				this.detalleserieproductos.removeAll(detalleserieproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleSerieProducto 
					&& this.detalleserieproductoLogic.getDetalleSerieProductos().size()>0
					) {
					detalleserieproductoAux=this.detalleserieproductoLogic.getDetalleSerieProductos().get(this.detalleserieproductoLogic.getDetalleSerieProductos().size() - 1);
				
					if(detalleserieproductoAux.getId()<0) {
						this.detalleserieproductoLogic.getDetalleSerieProductos().remove(detalleserieproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleSerieProducto && this.detalleserieproductos.size()>0) {
					detalleserieproductoAux=this.detalleserieproductos.get(this.detalleserieproductos.size() - 1);
				
					if(detalleserieproductoAux.getId()<0) {
						this.detalleserieproductos.remove(detalleserieproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleSerieProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleserieproducto.getId()<0) {
				this.detalleserieproductoLogic.getDetalleSerieProductos().remove(this.detalleserieproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleserieproducto.getId()<0) {
				this.detalleserieproductos.remove(this.detalleserieproducto);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleSerieProducto(List<DetalleSerieProducto> detalleserieproductosAux) throws Exception {
		DetalleSerieProductoConstantesFunciones.setEstadosInicialesDetalleSerieProducto(detalleserieproductosAux);
	}
	
	public void setEstadosInicialesDetalleSerieProducto(DetalleSerieProducto detalleserieproductoAux) throws Exception {
		DetalleSerieProductoConstantesFunciones.setEstadosInicialesDetalleSerieProducto(detalleserieproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleSerieProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleSerieProductoActual()) {
				if(!this.isEsNuevoDetalleSerieProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleSerieProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleSerieProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Serie Producto ?", "MANTENIMIENTO DE Detalle Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleSerieProducto detalleserieproducto) throws Exception {
		DetalleSerieProductoConstantesFunciones.seleccionarAsignar(this.detalleserieproducto,detalleserieproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleSerieProducto=this.isPermisoActualizarOriginalDetalleSerieProducto;
			
			
			this.seleccionarAsignar(detalleserieproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleSerieProductoConstantesFunciones.quitarEspaciosDetalleSerieProducto(this.detalleserieproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleSerieProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleserieproductoSessionBean.setsFuncionBusquedaRapida(this.detalleserieproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleSerieProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleSerieProducto(esParaCancelar);				
				this.cancelarNuevoDetalleSerieProducto(esParaCancelar);								
			}
			
			this.detalleserieproducto=new DetalleSerieProducto();
			
			this.inicializarDetalleSerieProducto();
			
			this.actualizarEstadoCeldasBotonesDetalleSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleSerieProducto() throws Exception {
		try {
			DetalleSerieProductoConstantesFunciones.inicializarDetalleSerieProducto(this.detalleserieproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleserieproductoLogic.getDetalleSerieProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleSerieProductos(String sAccionBusqueda,List<DetalleSerieProducto> detalleserieproductosParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleSerieProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleSerieProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleSerieProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleSerieProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Serie Productos");		
		parameters.put("busquedapor", DetalleSerieProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleSerieProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleSerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleSerieProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleSerieProducto=new JRBeanArrayDataSource(DetalleSerieProductoJInternalFrame.TraerDetalleSerieProductoBeans(detalleserieproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleSerieProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleSerieProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleSerieProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleSerieProductoBean.TraerDetalleSerieProductoBeans(detalleserieproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleSerieProductos(sAccionBusqueda,sTipoArchivoReporte,detalleserieproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleSerieProductos(sAccionBusqueda,sTipoArchivoReporte,detalleserieproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleSerieProductoActionPerformed(null);
					//this.generarExcelReporteDetalleSerieProductos(sAccionBusqueda,sTipoArchivoReporte,detalleserieproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleSerieProductos(sAccionBusqueda,sTipoArchivoReporte,detalleserieproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleSerieProductos(sAccionBusqueda,sTipoArchivoReporte,detalleserieproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleSerieProductos(sAccionBusqueda,sTipoArchivoReporte,detalleserieproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleSerieProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleSerieProducto> detalleserieproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleSerieProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleSerieProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleSerieProducto detalleserieproducto : detalleserieproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleSerieProductoConstantesFunciones.generarExcelReporteDataDetalleSerieProducto("NORMAL",row,workbook,detalleserieproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleSerieProducto(String sTipo,Row row,Workbook workbook) {
		
		DetalleSerieProductoConstantesFunciones.generarExcelReporteHeaderDetalleSerieProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleSerieProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleSerieProducto> detalleserieproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleSerieProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleSerieProducto detalleserieproducto : detalleserieproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleSerieProductoConstantesFunciones.getDetalleSerieProductoDescripcion(detalleserieproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserieproducto.getserieproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserieproducto.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleserieproducto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleSerieProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleSerieProducto> detalleserieproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleSerieProducto> detalleserieproductosRespaldo=null;
		
		classes=DetalleSerieProductoConstantesFunciones.getClassesRelationshipsOfDetalleSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleserieproductoLogic.setDatosCliente(this.datosCliente);
		this.detalleserieproductoLogic.setDatosDeep(this.datosDeep);
		this.detalleserieproductoLogic.setIsConDeep(true);
		
		detalleserieproductosRespaldo=this.detalleserieproductoLogic.getDetalleSerieProductos();
		
		this.detalleserieproductoLogic.setDetalleSerieProductos(detalleserieproductosParaReportes);	
		this.detalleserieproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleserieproductosParaReportes=this.detalleserieproductoLogic.getDetalleSerieProductos();
		this.detalleserieproductoLogic.setDetalleSerieProductos(detalleserieproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleSerieProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleSerieProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleSerieProducto detalleserieproducto : detalleserieproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleSerieProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleSerieProductoConstantesFunciones.generarExcelReporteDataDetalleSerieProducto("NORMAL",row,workbook,detalleserieproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleSerieProductoConstantesFunciones.getDetalleSerieProductoDescripcion(detalleserieproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleSerieProducto() throws Exception {		
		this.startProcessDetalleSerieProducto(true);
	}
	
	public void startProcessDetalleSerieProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleSerieProducto ,this.jPanelParametrosReportesDetalleSerieProducto, this.jScrollPanelDatosDetalleSerieProducto,this.jPanelPaginacionDetalleSerieProducto, this.jScrollPanelDatosEdicionDetalleSerieProducto, this.jPanelAccionesDetalleSerieProducto,this.jPanelAccionesFormularioDetalleSerieProducto,this.jmenuBarDetalleSerieProducto,this.jmenuBarDetalleDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,this.jTtoolBarDetalleDetalleSerieProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleSerieProducto=this.jTabbedPaneBusquedasDetalleSerieProducto; 
		
		final JPanel jPanelParametrosReportesDetalleSerieProducto=this.jPanelParametrosReportesDetalleSerieProducto;
		//final JScrollPane jScrollPanelDatosDetalleSerieProducto=this.jScrollPanelDatosDetalleSerieProducto;
		final JTable jTableDatosDetalleSerieProducto=this.jTableDatosDetalleSerieProducto;		
		final JPanel jPanelPaginacionDetalleSerieProducto=this.jPanelPaginacionDetalleSerieProducto;
		//final JScrollPane jScrollPanelDatosEdicionDetalleSerieProducto=this.jScrollPanelDatosEdicionDetalleSerieProducto;
		final JPanel jPanelAccionesDetalleSerieProducto=this.jPanelAccionesDetalleSerieProducto;
		
		JPanel jPanelCamposAuxiliarDetalleSerieProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleSerieProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			jPanelCamposAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelCamposDetalleSerieProducto;
			jPanelAccionesFormularioAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelAccionesFormularioDetalleSerieProducto;
		}
		
		final JPanel jPanelCamposDetalleSerieProducto=jPanelCamposAuxiliarDetalleSerieProducto;
		final JPanel jPanelAccionesFormularioDetalleSerieProducto=jPanelAccionesFormularioAuxiliarDetalleSerieProducto;
		
		
		final JMenuBar jmenuBarDetalleSerieProducto=this.jmenuBarDetalleSerieProducto;
		final JToolBar jTtoolBarDetalleSerieProducto=this.jTtoolBarDetalleSerieProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleSerieProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleSerieProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			jmenuBarDetalleAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jmenuBarDetalleDetalleSerieProducto;
			jTtoolBarDetalleAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jTtoolBarDetalleDetalleSerieProducto;
		}
		
		final JMenuBar jmenuBarDetalleDetalleSerieProducto=jmenuBarDetalleAuxiliarDetalleSerieProducto;
		final JToolBar jTtoolBarDetalleDetalleSerieProducto=jTtoolBarDetalleAuxiliarDetalleSerieProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleSerieProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleSerieProducto;
			processRunnable.jTableDatos=jTableDatosDetalleSerieProducto;
			processRunnable.jPanelCampos=jPanelCamposDetalleSerieProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleSerieProducto;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleSerieProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleSerieProducto;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleSerieProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleSerieProducto;
			processRunnable.jTtoolBar=jTtoolBarDetalleSerieProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleSerieProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleSerieProducto ,jPanelParametrosReportesDetalleSerieProducto,jTableDatosDetalleSerieProducto, /*jScrollPanelDatosDetalleSerieProducto,*/jPanelCamposDetalleSerieProducto,jPanelPaginacionDetalleSerieProducto, /*jScrollPanelDatosEdicionDetalleSerieProducto,*/ jPanelAccionesDetalleSerieProducto,jPanelAccionesFormularioDetalleSerieProducto,jmenuBarDetalleSerieProducto,jmenuBarDetalleDetalleSerieProducto,jTtoolBarDetalleSerieProducto,jTtoolBarDetalleDetalleSerieProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleSerieProducto ,jPanelParametrosReportesDetalleSerieProducto, jScrollPanelDatosDetalleSerieProducto,jPanelPaginacionDetalleSerieProducto, jScrollPanelDatosEdicionDetalleSerieProducto, jPanelAccionesDetalleSerieProducto,jPanelAccionesFormularioDetalleSerieProducto,jmenuBarDetalleSerieProducto,jmenuBarDetalleDetalleSerieProducto,jTtoolBarDetalleSerieProducto,jTtoolBarDetalleDetalleSerieProducto);
						
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
	
	public void finishProcessDetalleSerieProducto() {// throws Exception 
		this.finishProcessDetalleSerieProducto(true);
	}
	
	public void finishProcessDetalleSerieProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleSerieProducto ,this.jPanelParametrosReportesDetalleSerieProducto, this.jScrollPanelDatosDetalleSerieProducto,this.jPanelPaginacionDetalleSerieProducto, this.jScrollPanelDatosEdicionDetalleSerieProducto, this.jPanelAccionesDetalleSerieProducto,this.jPanelAccionesFormularioDetalleSerieProducto,this.jmenuBarDetalleSerieProducto,this.jmenuBarDetalleDetalleSerieProducto,this.jTtoolBarDetalleSerieProducto,this.jTtoolBarDetalleDetalleSerieProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleSerieProducto=this.jTabbedPaneBusquedasDetalleSerieProducto; 
		
		final JPanel jPanelParametrosReportesDetalleSerieProducto=this.jPanelParametrosReportesDetalleSerieProducto;
		//final JScrollPane jScrollPanelDatosDetalleSerieProducto=this.jScrollPanelDatosDetalleSerieProducto;
		final JTable jTableDatosDetalleSerieProducto=this.jTableDatosDetalleSerieProducto;		
		final JPanel jPanelPaginacionDetalleSerieProducto=this.jPanelPaginacionDetalleSerieProducto;
		//final JScrollPane jScrollPanelDatosEdicionDetalleSerieProducto=this.jScrollPanelDatosEdicionDetalleSerieProducto;
		final JPanel jPanelAccionesDetalleSerieProducto=this.jPanelAccionesDetalleSerieProducto;
		
		JPanel jPanelCamposAuxiliarDetalleSerieProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleSerieProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			jPanelCamposAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelCamposDetalleSerieProducto;
			jPanelAccionesFormularioAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelAccionesFormularioDetalleSerieProducto;
		}
		
		final JPanel jPanelCamposDetalleSerieProducto=jPanelCamposAuxiliarDetalleSerieProducto;
		final JPanel jPanelAccionesFormularioDetalleSerieProducto=jPanelAccionesFormularioAuxiliarDetalleSerieProducto;
		
		
		final JMenuBar jmenuBarDetalleSerieProducto=this.jmenuBarDetalleSerieProducto;		
		final JToolBar jTtoolBarDetalleSerieProducto=this.jTtoolBarDetalleSerieProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleSerieProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleSerieProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			jmenuBarDetalleAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jmenuBarDetalleDetalleSerieProducto;
			jTtoolBarDetalleAuxiliarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jTtoolBarDetalleDetalleSerieProducto;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleSerieProducto=jmenuBarDetalleAuxiliarDetalleSerieProducto;
		final JToolBar jTtoolBarDetalleDetalleSerieProducto=jTtoolBarDetalleAuxiliarDetalleSerieProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleSerieProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleSerieProducto;
			processRunnable.jTableDatos=jTableDatosDetalleSerieProducto;
			processRunnable.jPanelCampos=jPanelCamposDetalleSerieProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleSerieProducto;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleSerieProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleSerieProducto;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleSerieProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleSerieProducto;
			processRunnable.jTtoolBar=jTtoolBarDetalleSerieProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleSerieProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleSerieProducto ,jPanelParametrosReportesDetalleSerieProducto, jTableDatosDetalleSerieProducto,/*jScrollPanelDatosDetalleSerieProducto,*/jPanelCamposDetalleSerieProducto,jPanelPaginacionDetalleSerieProducto, /*jScrollPanelDatosEdicionDetalleSerieProducto,*/ jPanelAccionesDetalleSerieProducto,jPanelAccionesFormularioDetalleSerieProducto,jmenuBarDetalleSerieProducto,jmenuBarDetalleDetalleSerieProducto,jTtoolBarDetalleSerieProducto,jTtoolBarDetalleDetalleSerieProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleSerieProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleSerieProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleSerieProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleSerieProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSerieProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleSerieProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleSerieProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSerieProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleSerieProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleserieproductoConstantesFunciones.getsFinalQueryDetalleSerieProducto();
		String  finalQueryPaginacionTodos=this.detalleserieproductoConstantesFunciones.getsFinalQueryDetalleSerieProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleSerieProductoConstantesFunciones.getArrayColumnasGlobalesNoDetalleSerieProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleSerieProductoConstantesFunciones.getArrayColumnasGlobalesDetalleSerieProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleSerieProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleserieproductosEliminados= new ArrayList<DetalleSerieProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleSerieProducto();
		
				///*DetalleSerieProductoSessionBean*/this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
			
			if(this.detalleserieproductoSessionBean==null) {
				this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
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
					this.iNumeroPaginacion=DetalleSerieProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleSerieProductoConstantesFunciones.getClassesForeignKeysOfDetalleSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleserieproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleserieproductosAux= new ArrayList<DetalleSerieProducto>();
			
				
			detalleserieproductoLogic.setDatosCliente(this.datosCliente);
			detalleserieproductoLogic.setDatosDeep(this.datosDeep);
			detalleserieproductoLogic.setIsConDeep(true);
			
			
			detalleserieproductoLogic.getDetalleSerieProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleserieproductoLogic.getTodosDetalleSerieProductos(finalQueryGlobal,pagination);
					
					//detalleserieproductoLogic.getTodosDetalleSerieProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleserieproductoLogic.getDetalleSerieProductos()==null|| detalleserieproductoLogic.getDetalleSerieProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleserieproductosAux= new ArrayList<DetalleSerieProducto>();
							detalleserieproductosAux.addAll(detalleserieproductoLogic.getDetalleSerieProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductosAux= new ArrayList<DetalleSerieProducto>();
							detalleserieproductosAux.addAll(detalleserieproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleserieproductoLogic.getTodosDetalleSerieProductos(finalQueryGlobal+"",this.pagination);												
							
							//detalleserieproductoLogic.getTodosDetalleSerieProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleSerieProductos("Todos",detalleserieproductoLogic.getDetalleSerieProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());					
							detalleserieproductoLogic.getDetalleSerieProductos().addAll(detalleserieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductos=new ArrayList<DetalleSerieProducto>();
							detalleserieproductos.addAll(detalleserieproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleSerieProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleSerieProducto=this.idActual;
				
				} else if(this.idDetalleSerieProductoActual!=null && this.idDetalleSerieProductoActual!=0L) {
					idDetalleSerieProducto=idDetalleSerieProductoActual;
				}
				
					
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndicePorId(idDetalleSerieProducto);
				
				this.detalleserieproductos=new ArrayList<DetalleSerieProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleserieproductoLogic.getEntity(idDetalleSerieProducto);
					
					//detalleserieproductoLogic.getEntityWithConnection(idDetalleSerieProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());
					detalleserieproductoLogic.getDetalleSerieProductos().add(detalleserieproductoLogic.getDetalleSerieProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserieproductos=new ArrayList<DetalleSerieProducto>();
					this.detalleserieproductos.add(detalleserieproducto);
				}
				
				if(detalleserieproductoLogic.getDetalleSerieProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserieproductoLogic.getDetalleSerieProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserieproductoLogic.getDetalleSerieProductos()==null||detalleserieproductoLogic.getDetalleSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserieproductos==null|| detalleserieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductosAux=new ArrayList<DetalleSerieProducto>();
						detalleserieproductosAux.addAll(detalleserieproductoLogic.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductosAux=new ArrayList<DetalleSerieProducto>();
							detalleserieproductosAux.addAll(detalleserieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserieproductoLogic.getDetalleSerieProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleSerieProductos("BusquedaPorNombre",detalleserieproductoLogic.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleSerieProductos("BusquedaPorNombre",detalleserieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());
						detalleserieproductoLogic.getDetalleSerieProductos().addAll(detalleserieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductos=new ArrayList<DetalleSerieProducto>();
							detalleserieproductos.addAll(detalleserieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSerieProducto")) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceFK_IdSerieProducto(id_serie_productoFK_IdSerieProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleserieproductoLogic.getDetalleSerieProductosFK_IdSerieProducto(finalQueryGlobal,pagination,id_serie_productoFK_IdSerieProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceFK_IdSerieProducto(id_serie_productoFK_IdSerieProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceFK_IdSerieProducto(id_serie_productoFK_IdSerieProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleserieproductoLogic.getDetalleSerieProductos()==null||detalleserieproductoLogic.getDetalleSerieProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleserieproductos==null|| detalleserieproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductosAux=new ArrayList<DetalleSerieProducto>();
						detalleserieproductosAux.addAll(detalleserieproductoLogic.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductosAux=new ArrayList<DetalleSerieProducto>();
							detalleserieproductosAux.addAll(detalleserieproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleserieproductoLogic.getDetalleSerieProductosFK_IdSerieProducto(finalQueryGlobal,pagination,id_serie_productoFK_IdSerieProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceFK_IdSerieProducto(id_serie_productoFK_IdSerieProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleSerieProductoConstantesFunciones.getDetalleIndiceFK_IdSerieProducto(id_serie_productoFK_IdSerieProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleSerieProductos("FK_IdSerieProducto",detalleserieproductoLogic.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleSerieProductos("FK_IdSerieProducto",detalleserieproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoLogic.setDetalleSerieProductos(new ArrayList<DetalleSerieProducto>());
						detalleserieproductoLogic.getDetalleSerieProductos().addAll(detalleserieproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductos=new ArrayList<DetalleSerieProducto>();
							detalleserieproductos.addAll(detalleserieproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleSerieProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleSerieProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleserieproductoLogic.getDetalleSerieProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleserieproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleserieproductoLogic.getDetalleSerieProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleserieproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleSerieProducto detalleserieproducto) {
		Boolean permite=true;
		
		if(this.detalleserieproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleSerieProductoConstantesFunciones.getOrderByListaDetalleSerieProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleSerieProductoConstantesFunciones.getOrderByListaDetalleSerieProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleSerieProducto detalleserieproducto:detalleserieproductoLogic.getDetalleSerieProductos()) {
				if(detalleserieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserieproductoTotales=detalleserieproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleSerieProducto detalleserieproducto:this.detalleserieproductos) {
				if(detalleserieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserieproductoTotales=detalleserieproducto;
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
			this.detalleserieproductoAux=new DetalleSerieProducto();
			this.detalleserieproductoAux.setsType(Constantes2.S_TOTALES);
			this.detalleserieproductoAux.setIsNew(false);
			this.detalleserieproductoAux.setIsChanged(false);
			this.detalleserieproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleSerieProductoConstantesFunciones.TotalizarValoresFilaDetalleSerieProducto(this.detalleserieproductoLogic.getDetalleSerieProductos(),this.detalleserieproductoAux);
				
				this.detalleserieproductoLogic.getDetalleSerieProductos().add(this.detalleserieproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleSerieProductoConstantesFunciones.TotalizarValoresFilaDetalleSerieProducto(this.detalleserieproductos,this.detalleserieproductoAux);
				
				this.detalleserieproductos.add(this.detalleserieproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleserieproductoTotales=new DetalleSerieProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleserieproductoLogic.getDetalleSerieProductos().remove(detalleserieproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleserieproductos.remove(detalleserieproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleserieproductoTotales=new DetalleSerieProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleSerieProducto detalleserieproducto:detalleserieproductoLogic.getDetalleSerieProductos()) {
				if(detalleserieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserieproductoTotales=detalleserieproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleSerieProductoConstantesFunciones.TotalizarValoresFilaDetalleSerieProducto(this.detalleserieproductoLogic.getDetalleSerieProductos(),detalleserieproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleSerieProducto detalleserieproducto:this.detalleserieproductos) {
				if(detalleserieproducto.getsType().equals(Constantes2.S_TOTALES)) {
					detalleserieproductoTotales=detalleserieproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleSerieProductoConstantesFunciones.TotalizarValoresFilaDetalleSerieProducto(this.detalleserieproductos,detalleserieproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleSerieProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleSerieProductosFK_IdSerieProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdSerieProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleSerieProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserieproductoLogic.getDetalleSerieProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleSerieProductosFK_IdSerieProducto(String sFinalQuery,Long id_serie_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserieproductoLogic.getDetalleSerieProductosFK_IdSerieProducto(sFinalQuery,this.pagination,id_serie_producto);
				
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
	
	public void inicializarPermisosDetalleSerieProducto() {
		this.isPermisoTodoDetalleSerieProducto=false;
		this.isPermisoNuevoDetalleSerieProducto=false;
		this.isPermisoActualizarDetalleSerieProducto=false;
		this.isPermisoActualizarOriginalDetalleSerieProducto=false;
		this.isPermisoEliminarDetalleSerieProducto=false;
		this.isPermisoGuardarCambiosDetalleSerieProducto=false;
		this.isPermisoConsultaDetalleSerieProducto=false;
		this.isPermisoBusquedaDetalleSerieProducto=false;
		this.isPermisoReporteDetalleSerieProducto=false;		
		this.isPermisoOrdenDetalleSerieProducto=false;		
		this.isPermisoPaginacionMedioDetalleSerieProducto=false;		
		this.isPermisoPaginacionAltoDetalleSerieProducto=false;
		this.isPermisoPaginacionTodoDetalleSerieProducto=false;
		this.isPermisoCopiarDetalleSerieProducto=false;		
		this.isPermisoVerFormDetalleSerieProducto=false;		
		this.isPermisoDuplicarDetalleSerieProducto=false;		
		this.isPermisoOrdenDetalleSerieProducto=false;		
	}
	
	public void setPermisosUsuarioDetalleSerieProducto(Boolean isPermiso) {
		this.isPermisoTodoDetalleSerieProducto=isPermiso;
		this.isPermisoNuevoDetalleSerieProducto=isPermiso;
		this.isPermisoActualizarDetalleSerieProducto=isPermiso;
		this.isPermisoActualizarOriginalDetalleSerieProducto=isPermiso;
		this.isPermisoEliminarDetalleSerieProducto=isPermiso;
		this.isPermisoGuardarCambiosDetalleSerieProducto=isPermiso;
		this.isPermisoConsultaDetalleSerieProducto=isPermiso;
		this.isPermisoBusquedaDetalleSerieProducto=isPermiso;
		this.isPermisoReporteDetalleSerieProducto=isPermiso;
		this.isPermisoOrdenDetalleSerieProducto=isPermiso;		
		this.isPermisoPaginacionMedioDetalleSerieProducto=isPermiso;		
		this.isPermisoPaginacionAltoDetalleSerieProducto=isPermiso;		
		this.isPermisoPaginacionTodoDetalleSerieProducto=isPermiso;		
		this.isPermisoCopiarDetalleSerieProducto=isPermiso;		
		this.isPermisoVerFormDetalleSerieProducto=isPermiso;		
		this.isPermisoDuplicarDetalleSerieProducto=isPermiso;
		this.isPermisoOrdenDetalleSerieProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleSerieProducto(Boolean isPermiso) {
		//this.isPermisoTodoDetalleSerieProducto=isPermiso;
		this.isPermisoNuevoDetalleSerieProducto=isPermiso;
		this.isPermisoActualizarDetalleSerieProducto=isPermiso;
		this.isPermisoActualizarOriginalDetalleSerieProducto=isPermiso;
		this.isPermisoEliminarDetalleSerieProducto=isPermiso;
		this.isPermisoGuardarCambiosDetalleSerieProducto=isPermiso;
		//this.isPermisoConsultaDetalleSerieProducto=isPermiso;
		//this.isPermisoBusquedaDetalleSerieProducto=isPermiso;
		//this.isPermisoReporteDetalleSerieProducto=isPermiso;
		//this.isPermisoOrdenDetalleSerieProducto=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleSerieProducto=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleSerieProducto=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleSerieProducto=isPermiso;		
		//this.isPermisoCopiarDetalleSerieProducto=isPermiso;		
		//this.isPermisoDuplicarDetalleSerieProducto=isPermiso;
		//this.isPermisoOrdenDetalleSerieProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleSerieProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleSerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleSerieProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleSerieProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleSerieProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleSerieProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleSerieProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleSerieProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleSerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleSerieProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleSerieProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleSerieProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleSerieProducto=this.isPermisoActualizarDetalleSerieProducto;
			this.isPermisoEliminarDetalleSerieProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleSerieProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleSerieProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleSerieProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleSerieProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleSerieProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleSerieProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleSerieProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleSerieProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleSerieProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleSerieProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleSerieProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleSerieProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleSerieProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleSerieProducto.setToolTipText(this.jTableDatosDetalleSerieProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleSerieProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleSerieProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleSerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleSerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleSerieProducto() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleSerieProductoListas()throws Exception {
		try	{						
			
				this.serieproductosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleSerieProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleSerieProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleSerieProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeySerieProductoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeySerieProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.serieproductosForeignKey==null||this.serieproductosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SerieProductoConstantesFunciones.getArrayColumnasGlobalesSerieProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SerieProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SerieProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosSerieProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleSerieProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleSerieProductoParameterReturnGeneral detalleserieproductoReturnGeneral=new DetalleSerieProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalSerieProducto="";

				if(((this.serieproductosForeignKey==null||this.serieproductosForeignKey.size()<=0) && this.detalleserieproductoConstantesFunciones.cargarid_serie_productoDetalleSerieProducto)
					 || (this.esRecargarFks && this.detalleserieproductoConstantesFunciones.cargarid_serie_productoDetalleSerieProducto)) {

					if(!this.detalleserieproductoSessionBean.getisBusquedaDesdeForeignKeySesionSerieProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SerieProductoConstantesFunciones.getArrayColumnasGlobalesSerieProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSerieProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SerieProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalSerieProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalSerieProducto, "");
						finalQueryGlobalSerieProducto+=SerieProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSerieProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSerieProducto=" WHERE " + ConstantesSql.ID + "="+detalleserieproductoSessionBean.getlidSerieProductoActual();
					}
				} else {
					finalQueryGlobalSerieProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleserieproductoReturnGeneral=detalleserieproductoLogic.cargarCombosLoteForeignKeyDetalleSerieProducto(finalQueryGlobalSerieProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalSerieProducto.equals("NONE")) {
				this.serieproductosForeignKey=detalleserieproductoReturnGeneral.getserieproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleSerieProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeySerieProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeySerieProducto()throws Exception {
		try {
			if(this.detalleserieproductoSessionBean==null) {
				this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
			}

			if(!this.detalleserieproductoSessionBean.getisBusquedaDesdeForeignKeySesionSerieProducto()) {
				SerieProducto serieproducto=new SerieProducto();
				SerieProductoConstantesFunciones.setSerieProductoDescripcion(serieproducto,Constantes.SMENSAJE_ESCOJA_OPCION);
				serieproducto.setId(null);

				if(!SerieProductoConstantesFunciones.ExisteEnLista(this.serieproductosForeignKey,serieproducto,true)) {

					this.serieproductosForeignKey.add(0,serieproducto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleSerieProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleSerieProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleSerieProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleSerieProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleSerieProducto(DetalleSerieProducto detalleserieproducto)throws Exception {	
		try {
			
			this.setActualSerieProductoForeignKey(detalleserieproducto.getid_serie_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleSerieProducto()throws Exception {	
		try {
			
			this.setActualSerieProductoForeignKey(this.detalleserieproductoConstantesFunciones.getid_serie_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleSerieProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleSerieProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleSerieProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleSerieProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleSerieProducto()throws Exception {
		try {
			

			this.cargarCombosFrameSerieProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleSerieProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameSerieProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleSerieProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto!=null && this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public DetalleSerieProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleSerieProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleSerieProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean(); 
		this.detalleserieproductoConstantesFunciones=new DetalleSerieProductoConstantesFunciones(); 
		this.detalleserieproductoBean=new DetalleSerieProducto();//(this.detalleserieproductoConstantesFunciones); 		
		this.detalleserieproductoReturnGeneral=new DetalleSerieProductoParameterReturnGeneral(); 
		
		this.detalleserieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleserieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleSerieProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleSerieProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleSerieProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleSerieProducto(true);
			
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
			
			this.detalleserieproductoConstantesFunciones=new DetalleSerieProductoConstantesFunciones(); 
			this.detalleserieproductoBean=new DetalleSerieProducto();//this.detalleserieproductoConstantesFunciones); 			
			this.detalleserieproductoReturnGeneral=new DetalleSerieProductoParameterReturnGeneral(); 
		
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Serie Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.detalleserieproducto=new DetalleSerieProducto();
			this.detalleserieproductos = new ArrayList<DetalleSerieProducto>();
			this.detalleserieproductosAux = new ArrayList<DetalleSerieProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic=new DetalleSerieProductoLogic();
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleserieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleserieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleSerieProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleSerieProducto);	
					}
					
					if(this.jInternalFrameImportacionDetalleSerieProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleSerieProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleSerieProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleSerieProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleSerieProducto);
				this.jInternalFrameDetalleFormDetalleSerieProducto.setVisible(false);
				this.jInternalFrameDetalleFormDetalleSerieProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleSerieProducto);
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleSerieProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleSerieProducto);
					this.jInternalFrameImportacionDetalleSerieProducto.setVisible(false);
					this.jInternalFrameImportacionDetalleSerieProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleSerieProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleSerieProducto);
					this.jInternalFrameOrderByDetalleSerieProducto.setVisible(false);
					this.jInternalFrameOrderByDetalleSerieProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleSerieProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleSerieProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleserieproductoReturnGeneral=new DetalleSerieProductoParameterReturnGeneral();
			
			this.detalleserieproductoParameterGeneral=new DetalleSerieProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleserieproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleSerieProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleSerieProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleserieproductoSessionBean.getEsGuardarRelacionado(),this.detalleserieproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleSerieProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleserieproductoSessionBean.getEsGuardarRelacionado(),this.detalleserieproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaDuplicarDetalleSerieProducto=true;
			this.isVisibilidadCeldaCopiarDetalleSerieProducto=true;
			this.isVisibilidadCeldaVerFormDetalleSerieProducto=true;
			this.isVisibilidadCeldaOrdenDetalleSerieProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
			this.isVisibilidadCeldaModificarDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=false;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdSerieProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleSerieProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleSerieProducto(false);
			
			this.setPermisosUsuarioDetalleSerieProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleserieproductoSessionBean.getEsGuardarRelacionado() && this.detalleserieproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleSerieProductoClasesRelacionadas();
			}
			
			if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleSerieProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleSerieProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleSerieProducto();
			}
			
			if(!this.isPermisoBusquedaDetalleSerieProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleSerieProducto,this.isPermisoPaginacionMedioDetalleSerieProducto,this.isPermisoPaginacionTodoDetalleSerieProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleSerieProductoConstantesFunciones.getTiposSeleccionarDetalleSerieProducto());
				
				this.tiposColumnasSelect=DetalleSerieProductoConstantesFunciones.getTiposSeleccionarDetalleSerieProducto(true);
				
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
			//if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleSerieProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleSerieProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleSerieProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleSerieProducto() ;
			
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
			
			this.serieproductoLogic=new SerieProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleserieproductoImplementable= (DetalleSerieProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleSerieProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleserieproductoImplementableHome= (DetalleSerieProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleSerieProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleserieproductos= new ArrayList<DetalleSerieProducto>();
			this.detalleserieproductosEliminados= new ArrayList<DetalleSerieProducto>();
						
			this.isEsNuevoDetalleSerieProducto=false;
			this.esParaAccionDesdeFormularioDetalleSerieProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.serieproductosForeignKey=new ArrayList<SerieProducto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleSerieProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleSerieProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleSerieProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleSerieProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleSerieProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleSerieProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleSerieProducto();
			}
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleSerieProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleSerieProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleSerieProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleSerieProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleSerieProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleSerieProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleSerieProducto")) {
				iIndex=this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleSerieProducto();	
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
	
	public void cargarCombosForeignKeyDetalleSerieProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleSerieProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleSerieProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleSerieProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleSerieProducto();
		
		this.cargarCombosFrameForeignKeyDetalleSerieProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleSerieProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleSerieProducto();
		}
	}
	
	

	public void cargarCombosForeignKeySerieProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySerieProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySerieProducto();
				this.cargarCombosFrameSerieProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSerieProducto(this.serieproductosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleSerieProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			
			if(jTableDatosDetalleSerieProducto.getRowCount()>=1) {
				jTableDatosDetalleSerieProducto.removeRowSelectionInterval(0, jTableDatosDetalleSerieProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleSerieProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleSerieProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleSerieProducto(true);			
			//this.detalleserieproducto=new DetalleSerieProducto();
			//this.detalleserieproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleSerieProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto() ;
			
			if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleSerieProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleserieproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);				
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleSerieProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleSerieProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleSerieProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleSerieProducto.getSelectedRows().length;			
			}
			
			detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleSerieProducto--;			
				//DetalleSerieProducto detalleserieproductoAux= new DetalleSerieProducto();			
				//detalleserieproductoAux.setId(this.iIdNuevoDetalleSerieProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleSerieProducto detalleserieproductoOrigen=new DetalleSerieProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleSerieProducto detalleserieproductoOrigen : detalleserieproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleserieproductoOrigen =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleserieproductoOrigen =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleSerieProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleserieproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleSerieProducto(detalleserieproductoOrigen,this.detalleserieproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleserieproductoLogic.getDetalleSerieProductos().add(this.detalleserieproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleserieproductos.add(this.detalleserieproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
				
				this.jTableDatosDetalleSerieProducto.setRowSelectionInterval(this.getIndiceNuevoDetalleSerieProducto(), this.getIndiceNuevoDetalleSerieProducto());
				
				int iLastRow =  this.jTableDatosDetalleSerieProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleSerieProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleSerieProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();									
		
			DetalleSerieProducto detalleserieproductoOrigen=new DetalleSerieProducto();
			DetalleSerieProducto detalleserieproductoDestino=new DetalleSerieProducto();
				
			detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleSerieProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleserieproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleSerieProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoOrigen =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleserieproductoOrigen =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleserieproductoDestino =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleserieproductoDestino =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleserieproductoOrigen =detalleserieproductosSeleccionados.get(0);
				detalleserieproductoDestino =detalleserieproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleSerieProducto(detalleserieproductoOrigen,detalleserieproductoDestino,true,false);
				
				detalleserieproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleserieproductoDestino,detalleserieproductoLogic.getDetalleSerieProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleserieproductoDestino,detalleserieproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
				
				//this.jTableDatosDetalleSerieProducto.setRowSelectionInterval(this.getIndiceNuevoDetalleSerieProducto(), this.getIndiceNuevoDetalleSerieProducto());
				
				int iLastRow =  this.jTableDatosDetalleSerieProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleSerieProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleSerieProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleSerieProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleSerieProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleSerieProducto.setVisible(!isVisible);
			this.jPanelPaginacionDetalleSerieProducto.setVisible(!isVisible);
			this.jPanelAccionesDetalleSerieProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleSerieProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleSerieProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleSerieProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleSerieProducto();
			
			this.abrirFrameOrderByDetalleSerieProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleSerieProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleSerieProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleSerieProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleSerieProducto.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleSerieProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleSerieProducto.setSize(this.jInternalFrameDetalleFormDetalleSerieProducto.iWidthFormulario,this.jInternalFrameDetalleFormDetalleSerieProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleSerieProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleSerieProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleSerieProducto.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleSerieProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleSerieProducto.jContentPaneDetalleDetalleSerieProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleSerieProducto.jContentPaneDetalleDetalleSerieProducto.getWidth(),DetalleSerieProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleSerieProducto.jContentPaneDetalleDetalleSerieProducto.getWidth(),DetalleSerieProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleSerieProducto.jContentPaneDetalleDetalleSerieProducto.getWidth(),DetalleSerieProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleSerieProducto.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleSerieProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleSerieProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleSerieProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleSerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleSerieProducto,false,this);
				} else {
					this.jInternalFrameOrderByDetalleSerieProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleSerieProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleSerieProducto);
				this.jInternalFrameOrderByDetalleSerieProducto.setVisible(false);
				this.jInternalFrameOrderByDetalleSerieProducto.setSelected(false);
				
				this.jInternalFrameOrderByDetalleSerieProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleSerieProducto"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleSerieProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleSerieProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleSerieProducto==null) {
				
				this.jInternalFrameImportacionDetalleSerieProducto=new ImportacionJInternalFrame(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleSerieProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleSerieProducto);
				this.jInternalFrameImportacionDetalleSerieProducto.setVisible(false);
				this.jInternalFrameImportacionDetalleSerieProducto.setSelected(false);


				this.jInternalFrameImportacionDetalleSerieProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleSerieProducto"));
				this.jInternalFrameImportacionDetalleSerieProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleSerieProducto"));
				this.jInternalFrameImportacionDetalleSerieProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleSerieProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleSerieProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleSerieProducto==null) {
				this.jInternalFrameReporteDinamicoDetalleSerieProducto=new ReporteDinamicoJInternalFrame(DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleSerieProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleSerieProducto);
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleSerieProducto"));
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleSerieProducto"));
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleSerieProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleSerieProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleSerieProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleSerieProducto);
			
	       	this.jInternalFrameDetalleFormDetalleSerieProducto.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleSerieProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleSerieProducto.dispose();
			//this.jInternalFrameDetalleFormDetalleSerieProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleSerieProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleSerieProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleSerieProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleSerieProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleSerieProducto.setVisible(true);
	        this.jInternalFrameImportacionDetalleSerieProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleSerieProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleSerieProducto.setVisible(true);
	        this.jInternalFrameOrderByDetalleSerieProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleSerieProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleSerieProducto.setVisible(false);
	        this.jInternalFrameOrderByDetalleSerieProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleSerieProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleSerieProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleSerieProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleSerieProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleSerieProducto.setVisible(false);
	        this.jInternalFrameImportacionDetalleSerieProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleSerieProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleSerieProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleSerieProducto(true);
			//this.isEsNuevoDetalleSerieProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleSerieProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleSerieProducto(false) ;
			
			if(detalleserieproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleSerieProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleSerieProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleSerieProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleSerieProducto(true);
			//this.isEsNuevoDetalleSerieProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleserieproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleSerieProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleSerieProducto(false) ;
			
			if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleSerieProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaSerieProducto(List<SerieProducto> serieproductosForeignKey)throws Exception{
		TableColumn tableColumnSerieProducto=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO));
		TableCellEditor tableCellEditorSerieProducto =tableColumnSerieProducto.getCellEditor();

		SerieProductoTableCell serieproductoTableCellFk=(SerieProductoTableCell)tableCellEditorSerieProducto;

		if(serieproductoTableCellFk!=null) {
			serieproductoTableCellFk.setserieproductosForeignKey(serieproductosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleSerieProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//serieproductoTableCellFk.setRowActual(intSelectedRow);
			//serieproductoTableCellFk.setserieproductosForeignKeyActual(serieproductosForeignKey);
		//}


		if(serieproductoTableCellFk!=null) {
			serieproductoTableCellFk.RecargarSerieProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleSerieProducto(false);
			
			//if(!this.isEsNuevoDetalleSerieProducto) {								
				int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
				
			}
			
			if(this.permiteMantenimiento(this.detalleserieproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleSerieProducto=true;
					this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
					this.isEsNuevoDetalleSerieProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleSerieProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleSerieProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleSerieProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(false);
				
				this.habilitarDeshabilitarControlesDetalleSerieProducto(false);
			
												
				
				if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleSerieProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleSerieProductoActionPerformed(evt,detalleserieproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleSerieProducto(this.detalleserieproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleSerieProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleserieproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleserieproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				this.detalleserieproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				this.detalleserieproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleserieproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleSerieProductoModel) this.jTableDatosDetalleSerieProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleSerieProducto=true;
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
				this.isEsNuevoDetalleSerieProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleSerieProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(false);
				
				this.habilitarDeshabilitarControlesDetalleSerieProducto(false);
				
				
				
				if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleSerieProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleSerieProducto.getRowCount()>=1) {
				jTableDatosDetalleSerieProducto.removeRowSelectionInterval(0, jTableDatosDetalleSerieProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleSerieProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleSerieProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(false) ;
			
			this.isEsNuevoDetalleSerieProducto=false;
			
			if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleSerieProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleSerieProducto(false);
				
				//SI ES MANUAL
				if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleSerieProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleSerieProducto--;			
			//DetalleSerieProducto detalleserieproductoAux= new DetalleSerieProducto();			
			//detalleserieproductoAux.setId(this.iIdNuevoDetalleSerieProducto);
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleSerieProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
			
			this.detalleserieproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleserieproductoLogic.getDetalleSerieProductos().add(this.detalleserieproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleserieproductos.add(this.detalleserieproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			
			this.jTableDatosDetalleSerieProducto.setRowSelectionInterval(this.getIndiceNuevoDetalleSerieProducto(), this.getIndiceNuevoDetalleSerieProducto());
			
			int iLastRow =  this.jTableDatosDetalleSerieProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleSerieProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleSerieProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleSerieProducto(false);
			
			//SI ES MANUAL
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleSerieProducto();
			}
			
			//this.abrirFrameTreeDetalleSerieProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Serie ProductoS ?", "MANTENIMIENTO DE Detalle Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleSerieProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleSerieProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleserieproductoReturnGeneral=detalleserieproductoLogic.procesarImportacionDetalleSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleserieproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleSerieProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleSerieProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleSerieProducto.setFileImportacion(this.jInternalFrameImportacionDetalleSerieProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleSerieProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleSerieProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleSerieProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleSerieProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		

		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleSerieProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleSerieProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_SerieProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_SerieProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_SerieProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_SerieProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO:
					sNombreCampoCategoria="id_serie_producto";
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO:
					sNombreCampoCategoriaValor="id_serie_producto";
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_serie_producto");
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleSerieProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO);
					iRow++;

					for(DetalleSerieProducto detalleserieproducto:detalleserieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserieproducto.getserieproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DetalleSerieProducto detalleserieproducto:detalleserieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserieproducto.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleSerieProducto detalleserieproducto:detalleserieproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleserieproducto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleSerieProducto(row);				
			//	iRow++;
			//}				
			
			//for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleSerieProducto(detalleserieproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleSerieProducto(false);
			
			//SI ES MANUAL
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleSerieProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleSerieProducto(false);
			
			//SI ES MANUAL
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleSerieProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleSerieProducto(false);
			
			//SI ES MANUAL
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleSerieProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleSerieProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleSerieProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleSerieProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleSerieProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleSerieProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleSerieProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleSerieProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleSerieProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleSerieProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleSerieProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleSerieProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleSerieProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleSerieProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleSerieProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleSerieProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleSerieProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleSerieProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleSerieProducto();
		
		this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleSerieProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleSerieProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleSerieProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleSerieProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleSerieProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleSerieProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleSerieProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleSerieProducto.jCheckBoxPostAccionNuevoDetalleSerieProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleSerieProducto.jCheckBoxPostAccionSinCerrarDetalleSerieProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleSerieProducto.jCheckBoxPostAccionSinMensajeDetalleSerieProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleSerieProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleSerieProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleSerieProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
				this.jInternalFrameDetalleFormDetalleSerieProducto.jCheckBoxPostAccionNuevoDetalleSerieProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleSerieProducto.jCheckBoxPostAccionSinCerrarDetalleSerieProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleSerieProducto.jCheckBoxPostAccionSinMensajeDetalleSerieProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleSerieProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleSerieProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleSerieProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleSerieProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleSerieProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleSerieProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleSerieProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleSerieProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleSerieProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleSerieProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleSerieProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleSerieProducto() throws Exception {
		try	{
			if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleSerieProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleSerieProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleSerieProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleSerieProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleSerieProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleSerieProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleSerieProducto.addItem(reporte);
			}
			
			
			if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleSerieProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleSerieProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleSerieProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleSerieProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleSerieProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleSerieProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleSerieProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleSerieProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleSerieProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleSerieProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreDetalleSerieProducto.getText();
		if(this.jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.getSelectedItem()!=null){this.id_serie_productoFK_IdSerieProducto=((SerieProducto)this.jComboBoxid_serie_productoFK_IdSerieProductoDetalleSerieProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleSerieProducto(Boolean esInicializar) throws Exception {				
		if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleSerieProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleSerieProducto() throws Exception {
		this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleSerieProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleSerieProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleSerieProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleserieproductoLogic.getDetalleSerieProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleserieproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleSerieProducto.setModel(new DetalleSerieProductoModel(this.detalleserieproductoLogic.getDetalleSerieProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleSerieProducto.setModel(new DetalleSerieProductoModel(this.detalleserieproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleSerieProducto!=null && this.jInternalFrameOrderByDetalleSerieProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleSerieProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO,detalleserieproductoConstantesFunciones.resaltarSeleccionarDetalleSerieProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO,detalleserieproductoConstantesFunciones.resaltarSeleccionarDetalleSerieProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,DetalleSerieProductoConstantesFunciones.LABEL_ID));

		if(this.detalleserieproductoConstantesFunciones.mostraridDetalleSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleSerieProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleserieproductoConstantesFunciones.resaltaridDetalleSerieProducto,this.detalleserieproductoConstantesFunciones.activaridDetalleSerieProducto,this,true,"idDetalleSerieProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserieproductoConstantesFunciones.resaltaridDetalleSerieProducto,this.detalleserieproductoConstantesFunciones.activaridDetalleSerieProducto,this,true,"idDetalleSerieProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO));

		if(this.detalleserieproductoConstantesFunciones.mostrarid_serie_productoDetalleSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SerieProductoTableCell(this.serieproductosForeignKey,this.detalleserieproductoConstantesFunciones.resaltarid_serie_productoDetalleSerieProducto,this,this.detalleserieproductoConstantesFunciones.activarid_serie_productoDetalleSerieProducto));
			tableColumn.setCellEditor(new SerieProductoTableCell(this.serieproductosForeignKey,this.detalleserieproductoConstantesFunciones.resaltarid_serie_productoDetalleSerieProducto,this,this.detalleserieproductoConstantesFunciones.activarid_serie_productoDetalleSerieProducto,true,"id_serie_productoDetalleSerieProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.detalleserieproductoConstantesFunciones.mostrarnombreDetalleSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleserieproductoConstantesFunciones.resaltarnombreDetalleSerieProducto,this.detalleserieproductoConstantesFunciones.activarnombreDetalleSerieProducto,this,true,"nombreDetalleSerieProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserieproductoConstantesFunciones.resaltarnombreDetalleSerieProducto,this.detalleserieproductoConstantesFunciones.activarnombreDetalleSerieProducto,this,true,"nombreDetalleSerieProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalleserieproductoConstantesFunciones.mostrardescripcionDetalleSerieProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleserieproductoConstantesFunciones.resaltardescripcionDetalleSerieProducto,this.detalleserieproductoConstantesFunciones.activardescripcionDetalleSerieProducto,this,true,"descripcionDetalleSerieProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleserieproductoConstantesFunciones.resaltardescripcionDetalleSerieProducto,this.detalleserieproductoConstantesFunciones.activardescripcionDetalleSerieProducto,this,true,"descripcionDetalleSerieProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleSerieProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleserieproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleserieproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleSerieProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleserieproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleserieproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleSerieProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleserieproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleserieproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleSerieProducto.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleSerieProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleSerieProducto.moveColumn(this.jTableDatosDetalleSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleSerieProducto.moveColumn(this.jTableDatosDetalleSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleSerieProducto.moveColumn(this.jTableDatosDetalleSerieProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleSerieProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleSerieProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleSerieProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleSerieProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleSerieProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleSerieProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleSerieProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleserieproductoLogic.getDetalleSerieProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleserieproductos.size()-1;
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
		//this.jTableDatosDetalleSerieProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleSerieProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleSerieProducto();
			
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
				
				//this.isEsNuevoDetalleSerieProducto=false;
					
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
				if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleSerieProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleSerieProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleserieproducto.getsType().equals("DUPLICADO")
				   || this.detalleserieproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleSerieProducto=true;
				
				} else {
					this.isEsNuevoDetalleSerieProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleserieproducto.getId()>=0 && !this.detalleserieproducto.getIsNew()) {						
						this.isEsNuevoDetalleSerieProducto=false;
						
					} else {
						this.isEsNuevoDetalleSerieProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleSerieProducto(esRelaciones);						
				
				this.seleccionarDetalleSerieProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleserieproducto.getId()<0) {
					this.isEsNuevoDetalleSerieProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleSerieProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleSerieProducto(evt,rowIndex);
				}	
				
				if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleSerieProducto: " + this.dDif); 
					}
				}								
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleSerieProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleserieproducto)) {
					if(this.detalleserieproducto.getId()>0) {
						this.detalleserieproducto.setIsDeleted(true);
						
						this.detalleserieproductosEliminados.add(this.detalleserieproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleserieproductoLogic.getDetalleSerieProductos().remove(this.detalleserieproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleserieproductos.remove(this.detalleserieproducto);				
					}
					
					
					((DetalleSerieProductoModel) this.jTableDatosDetalleSerieProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleSerieProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleSerieProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleSerieProducto) {
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleSerieProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleSerieProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//SerieProducto
					if(!this.detalleserieproductoConstantesFunciones.cargarid_serie_productoDetalleSerieProducto || this.detalleserieproductoConstantesFunciones.event_dependid_serie_productoDetalleSerieProducto) {
						//this.cargarCombosSerieProductosForeignKeyLista(" where id="+this.detalleserieproducto.getid_serie_producto());
									//this.inicializarActualizarBindingDetalleSerieProducto(false,false);
						this.serieproductosForeignKey=new ArrayList<SerieProducto>();

						if(detalleserieproducto.getSerieProducto()!=null) {
							this.serieproductosForeignKey.add(detalleserieproducto.getSerieProducto());
						}

						this.addItemDefectoCombosForeignKeySerieProducto();
						this.cargarCombosFrameSerieProductosForeignKey("Todos");
					}
					this.setActualSerieProductoForeignKey(this.detalleserieproducto.getid_serie_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleSerieProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleSerieProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleSerieProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleSerieProducto(DetalleSerieProducto detalleserieproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleSerieProducto(detalleserieproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleSerieProducto(detalleserieproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleSerieProducto(detalleserieproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleSerieProducto(detalleserieproducto);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleSerieProducto(DetalleSerieProducto detalleserieproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setText(detalleserieproducto.getId().toString());
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setText(detalleserieproducto.getnombre());
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setText(detalleserieproducto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleSerieProducto detalleserieproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleserieproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleSerieProducto detalleserieproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleserieproductoLocal=this.detalleserieproducto;
			} else {
				detalleserieproductoLocal=this.detalleserieproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleserieproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleSerieProducto(detalleserieproductoLocal,true);
					
					if(detalleserieproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleserieproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleserieproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleSerieProducto(detalleserieproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(detalleserieproducto);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleSerieProducto(detalleserieproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.getText()==null || this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.getText()=="" || this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setText("0");
			}

			if(conColumnasBase) {detalleserieproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleSerieProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelIdDetalleSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleserieproducto.setnombre(this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelnombreDetalleSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleserieproducto.setdescripcion(this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleSerieProducto.jLabeldescripcionDetalleSerieProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleSerieProducto(DetalleSerieProducto detalleserieproductoBean,DetalleSerieProducto detalleserieproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleserieproductoBean.getid_serie_producto()!=null && !detalleserieproductoBean.getid_serie_producto().equals(-1L))) {detalleserieproducto.setid_serie_producto(detalleserieproductoBean.getid_serie_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleSerieProducto(DetalleSerieProducto detalleserieproductoOrigen,DetalleSerieProducto detalleserieproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleserieproductoOrigen.getId()!=null && !detalleserieproductoOrigen.getId().equals(0L))) {detalleserieproducto.setId(detalleserieproductoOrigen.getId());}}
			if(conDefault || (!conDefault && detalleserieproductoOrigen.getid_serie_producto()!=null && !detalleserieproductoOrigen.getid_serie_producto().equals(-1L))) {detalleserieproducto.setid_serie_producto(detalleserieproductoOrigen.getid_serie_producto());}
			if(conDefault || (!conDefault && detalleserieproductoOrigen.getnombre()!=null && !detalleserieproductoOrigen.getnombre().equals(""))) {detalleserieproducto.setnombre(detalleserieproductoOrigen.getnombre());}
			if(conDefault || (!conDefault && detalleserieproductoOrigen.getdescripcion()!=null && !detalleserieproductoOrigen.getdescripcion().equals(""))) {detalleserieproducto.setdescripcion(detalleserieproductoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleSerieProducto(DetalleSerieProducto detalleserieproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setText(detalleserieproducto.getId().toString());
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setText(detalleserieproducto.getnombre());
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setText(detalleserieproducto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleSerieProducto(DetalleSerieProductoBean detalleserieproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setText(detalleserieproductoBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setText(detalleserieproductoBean.getnombre());
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setText(detalleserieproductoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleSerieProducto(DetalleSerieProductoParameterReturnGeneral detalleserieproductoReturnGeneral,DetalleSerieProductoBean detalleserieproductoBean,Boolean conDefault) throws Exception { 
		try {
			DetalleSerieProducto detalleserieproductoLocal=new DetalleSerieProducto();
			
			detalleserieproductoLocal=detalleserieproductoReturnGeneral.getDetalleSerieProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleserieproductoLocal.getId()!=null && !detalleserieproductoLocal.getId().equals(0L))) {detalleserieproductoBean.setId(detalleserieproductoLocal.getId());}}
			if(conDefault || (!conDefault && detalleserieproductoLocal.getid_serie_producto()!=null && !detalleserieproductoLocal.getid_serie_producto().equals(-1L))) {detalleserieproductoBean.setid_serie_producto(detalleserieproductoLocal.getid_serie_producto());}
			if(conDefault || (!conDefault && detalleserieproductoLocal.getnombre()!=null && !detalleserieproductoLocal.getnombre().equals(""))) {detalleserieproductoBean.setnombre(detalleserieproductoLocal.getnombre());}
			if(conDefault || (!conDefault && detalleserieproductoLocal.getdescripcion()!=null && !detalleserieproductoLocal.getdescripcion().equals(""))) {detalleserieproductoBean.setdescripcion(detalleserieproductoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleSerieProductoGenerico(Long idDetalleSerieProductoSeleccionado,JComboBox jComboBoxDetalleSerieProducto,List<DetalleSerieProducto> detalleserieproductosLocal)throws Exception {
		try {
			DetalleSerieProducto  detalleserieproductoTemp=null;

			for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosLocal) {
				if(detalleserieproductoAux.getId()!=null && detalleserieproductoAux.getId().equals(idDetalleSerieProductoSeleccionado)) {
					detalleserieproductoTemp=detalleserieproductoAux;
					break;
				}
			}

			jComboBoxDetalleSerieProducto.setSelectedItem(detalleserieproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleSerieProductoGenerico(JComboBox jComboBoxDetalleSerieProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleSerieProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleSerieProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleSerieProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleSerieProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleserieproducto=(DetalleSerieProducto) detalleserieproductoLogic.getDetalleSerieProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleserieproducto =(DetalleSerieProducto) detalleserieproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("SerieProducto")) {
			//sDescripcion=this.getActualSerieProductoForeignKeyDescripcion((Long)value);
			if(!detalleserieproducto.getIsNew() && !detalleserieproducto.getIsChanged() && !detalleserieproducto.getIsDeleted()) {
				sDescripcion=detalleserieproducto.getserieproducto_descripcion();
			} else {
				//sDescripcion=this.getActualSerieProductoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleserieproducto.getserieproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleSerieProducto detalleserieproductoRow=new DetalleSerieProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleserieproductoRow=(DetalleSerieProducto) detalleserieproductoLogic.getDetalleSerieProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleserieproductoRow=(DetalleSerieProducto) detalleserieproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleSerieProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto));			
			this.jButtonDuplicarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaDuplicarDetalleSerieProducto && this.isPermisoDuplicarDetalleSerieProducto));			
			this.jButtonCopiarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaCopiarDetalleSerieProducto && this.isPermisoCopiarDetalleSerieProducto));
			this.jButtonVerFormDetalleSerieProducto.setVisible((this.isVisibilidadCeldaVerFormDetalleSerieProducto && this.isPermisoVerFormDetalleSerieProducto));
			
			this.jButtonAbrirOrderByDetalleSerieProducto.setVisible((this.isVisibilidadCeldaOrdenDetalleSerieProducto && this.isPermisoOrdenDetalleSerieProducto));			
			
			this.jButtonNuevoRelacionesDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto));			
			this.jButtonNuevoGuardarCambiosDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaModificarDetalleSerieProducto && this.isPermisoActualizarDetalleSerieProducto));	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaActualizarDetalleSerieProducto && this.isPermisoActualizarDetalleSerieProducto));	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaEliminarDetalleSerieProducto && this.isPermisoEliminarDetalleSerieProducto));
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarDetalleSerieProducto.setVisible(this.isVisibilidadCeldaCancelarDetalleSerieProducto);							
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto));						
			this.jButtonDuplicarToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaDuplicarDetalleSerieProducto && this.isPermisoDuplicarDetalleSerieProducto));						
			this.jButtonCopiarToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaCopiarDetalleSerieProducto && this.isPermisoCopiarDetalleSerieProducto));			
			this.jButtonVerFormToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaVerFormDetalleSerieProducto && this.isPermisoVerFormDetalleSerieProducto));			
			this.jButtonAbrirOrderByToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaOrdenDetalleSerieProducto && this.isPermisoOrdenDetalleSerieProducto));
			this.jButtonNuevoRelacionesToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));			
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaModificarDetalleSerieProducto && this.isPermisoActualizarDetalleSerieProducto));	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaActualizarDetalleSerieProducto  && this.isPermisoActualizarDetalleSerieProducto));	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaEliminarDetalleSerieProducto && this.isPermisoEliminarDetalleSerieProducto));
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarToolBarDetalleSerieProducto.setVisible(this.isVisibilidadCeldaCancelarDetalleSerieProducto);				
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto));			
			this.jMenuItemDuplicarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaDuplicarDetalleSerieProducto && this.isPermisoDuplicarDetalleSerieProducto));			
			this.jMenuItemCopiarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaCopiarDetalleSerieProducto && this.isPermisoCopiarDetalleSerieProducto));			
			this.jMenuItemVerFormDetalleSerieProducto.setVisible((this.isVisibilidadCeldaVerFormDetalleSerieProducto && this.isPermisoVerFormDetalleSerieProducto));			
			this.jMenuItemAbrirOrderByDetalleSerieProducto.setVisible((this.isVisibilidadCeldaOrdenDetalleSerieProducto && this.isPermisoOrdenDetalleSerieProducto));			
			//this.jMenuItemMostrarOcultarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaOrdenDetalleSerieProducto && this.isPermisoOrdenDetalleSerieProducto));
			this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto.setVisible((this.isVisibilidadCeldaOrdenDetalleSerieProducto && this.isPermisoOrdenDetalleSerieProducto));			
			//this.jMenuItemDetalleMostrarOcultarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaOrdenDetalleSerieProducto && this.isPermisoOrdenDetalleSerieProducto));			
			this.jMenuItemNuevoRelacionesDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto));			
			this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto.setVisible((this.isVisibilidadCeldaNuevoDetalleSerieProducto && this.isPermisoNuevoDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));									
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemModificarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaModificarDetalleSerieProducto && this.isPermisoActualizarDetalleSerieProducto));	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemActualizarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaActualizarDetalleSerieProducto && this.isPermisoActualizarDetalleSerieProducto));	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemEliminarDetalleSerieProducto.setVisible((this.isVisibilidadCeldaEliminarDetalleSerieProducto && this.isPermisoEliminarDetalleSerieProducto));
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemCancelarDetalleSerieProducto.setVisible(this.isVisibilidadCeldaCancelarDetalleSerieProducto);				
			}
			
			this.jMenuItemGuardarCambiosDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));						
			this.jMenuItemGuardarCambiosTablaDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=this.jButtonNuevoDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleSerieProducto=this.jButtonDuplicarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaCopiarDetalleSerieProducto=this.jButtonCopiarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaVerFormDetalleSerieProducto=this.jButtonVerFormDetalleSerieProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleSerieProducto=this.jButtonAbrirOrderByDetalleSerieProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=this.jButtonNuevoRelacionesDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaModificarDetalleSerieProducto=this.jButtonModificarDetalleSerieProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaGuardarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=this.jButtonGuardarCambiosTablaDetalleSerieProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=this.jButtonNuevoToolBarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=this.jButtonNuevoRelacionesToolBarDetalleSerieProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.isVisibilidadCeldaModificarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarToolBarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarToolBarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarToolBarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarToolBarDetalleSerieProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleSerieProducto=this.jButtonGuardarCambiosToolBarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=this.jButtonGuardarCambiosTablaToolBarDetalleSerieProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=this.jMenuItemNuevoDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=this.jMenuItemNuevoRelacionesDetalleSerieProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.isVisibilidadCeldaModificarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemModificarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemActualizarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemEliminarDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemCancelarDetalleSerieProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleSerieProducto=this.jMenuItemGuardarCambiosDetalleSerieProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=this.jMenuItemGuardarCambiosTablaDetalleSerieProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleSerieProducto(Boolean esInicializar) {
		if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleSerieProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleSerieProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleSerieProducto() {
		this.jButtonNuevoDetalleSerieProducto.setVisible(this.isPermisoNuevoDetalleSerieProducto);			
		this.jButtonDuplicarDetalleSerieProducto.setVisible(this.isPermisoDuplicarDetalleSerieProducto);			
		this.jButtonCopiarDetalleSerieProducto.setVisible(this.isPermisoCopiarDetalleSerieProducto);			
		this.jButtonVerFormDetalleSerieProducto.setVisible(this.isPermisoVerFormDetalleSerieProducto);			
		
		this.jButtonAbrirOrderByDetalleSerieProducto.setVisible(this.isPermisoOrdenDetalleSerieProducto);					
		
		this.jButtonNuevoRelacionesDetalleSerieProducto.setVisible(this.isPermisoNuevoDetalleSerieProducto);			
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarDetalleSerieProducto.setVisible(this.isPermisoActualizarDetalleSerieProducto);	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarDetalleSerieProducto.setVisible(this.isPermisoActualizarDetalleSerieProducto);	
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarDetalleSerieProducto.setVisible(this.isPermisoEliminarDetalleSerieProducto);
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarDetalleSerieProducto.setVisible(this.isVisibilidadCeldaCancelarDetalleSerieProducto);						
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.setVisible(this.isPermisoGuardarCambiosDetalleSerieProducto);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.setVisible(this.isPermisoActualizarDetalleSerieProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleSerieProducto() {
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarDetalleSerieProducto.setVisible(this.isPermisoActualizarDetalleSerieProducto);	
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarDetalleSerieProducto.setVisible(this.isPermisoActualizarDetalleSerieProducto);	
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarDetalleSerieProducto.setVisible(this.isPermisoEliminarDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarDetalleSerieProducto.setVisible(this.isVisibilidadCeldaCancelarDetalleSerieProducto);							
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.setVisible((this.isVisibilidadCeldaGuardarDetalleSerieProducto && this.isPermisoGuardarCambiosDetalleSerieProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleSerieProducto() {
		if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleSerieProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleSerieProducto() {
	}
	
	public void jTableDatosDetalleSerieProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleSerieProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.getdetalleserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserieproducto==null) {
						this.detalleserieproducto = new DetalleSerieProducto();
					}

					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
				}

				if(this.detalleserieproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleserieproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_serie_productoDetalleSerieProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoserieproducto=true;

			idTienePermisoserieproducto=this.tienePermisosUsuarioEnPaginaWebDetalleSerieProducto(SerieProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoserieproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleSerieProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleSerieProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.getdetalleserieproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);

				this.serieproductoBeanSwingJInternalFrame=new SerieProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.serieproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.serieproductoBeanSwingJInternalFrame.getSerieProductoLogic().setConnexion(this.detalleserieproductoLogic.getConnexion());

				if(this.detalleserieproducto.getid_serie_producto()!=null) {
					this.serieproductoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.serieproductoBeanSwingJInternalFrame.setIdActual(this.detalleserieproducto.getid_serie_producto());
					this.serieproductoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.serieproductoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.serieproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSerieProducto();
				}

				JInternalFrameBase jinternalFrame =this.serieproductoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleSerieProducto=(TitledBorder)this.jScrollPanelDatosDetalleSerieProducto.getBorder();
				TitledBorder titledBorderserieproducto=(TitledBorder)this.serieproductoBeanSwingJInternalFrame.jScrollPanelDatosSerieProducto.getBorder();

				titledBorderserieproducto.setTitle(titledBorderDetalleSerieProducto.getTitle() + " -> Serie Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_serie_productoDetalleSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.getdetalleserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserieproducto==null) {
						this.detalleserieproducto = new DetalleSerieProducto();
					}

					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
				}

				if(this.detalleserieproducto.getid_serie_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_serie_producto = "+this.detalleserieproducto.getid_serie_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDetalleSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.getdetalleserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserieproducto==null) {
						this.detalleserieproducto = new DetalleSerieProducto();
					}

					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
				}

				if(this.detalleserieproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.detalleserieproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleSerieProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.getdetalleserieproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleserieproducto==null) {
						this.detalleserieproducto = new DetalleSerieProducto();
					}

					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);
				}

				if(this.detalleserieproducto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalleserieproducto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleSerieProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);

			this.getDetalleSerieProductosBusquedaPorNombre();

			this.inicializarActualizarBindingDetalleSerieProducto(false);

			//if(DetalleSerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSerieProductoDetalleSerieProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);

			this.getDetalleSerieProductosFK_IdSerieProducto();

			this.inicializarActualizarBindingDetalleSerieProducto(false);

			//if(DetalleSerieProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleserieproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleSerieProducto() {
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleSerieProducto.dispose();
			this.jInternalFrameDetalleFormDetalleSerieProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
			this.jInternalFrameReporteDinamicoDetalleSerieProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleSerieProducto.dispose();
			this.jInternalFrameReporteDinamicoDetalleSerieProducto=null;
		}
		
		if(this.jInternalFrameImportacionDetalleSerieProducto!=null) {
			this.jInternalFrameImportacionDetalleSerieProducto.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleSerieProducto.dispose();
			this.jInternalFrameImportacionDetalleSerieProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleSerieProducto();
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleSerieProducto")) {
				jButtonDuplicarDetalleSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleSerieProducto")) {
				jButtonCopiarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleSerieProducto")) {
				jButtonVerFormDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleSerieProducto")) {
				jButtonDuplicarDetalleSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleSerieProducto")) {
				jButtonDuplicarDetalleSerieProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleSerieProducto")) {
				jButtonModificarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleSerieProducto")) {
				jButtonModificarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleSerieProducto")) {
				jButtonModificarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleSerieProducto")) {
				jButtonActualizarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleSerieProducto")) {
				jButtonActualizarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleSerieProducto")) {
				jButtonActualizarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleSerieProducto")) {
				jButtonEliminarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleSerieProducto")) {
				jButtonEliminarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleSerieProducto")) {
				jButtonEliminarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleSerieProducto")) {
				jButtonCancelarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleSerieProducto")) {
				jButtonCancelarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleSerieProducto")) {
				jButtonCancelarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleSerieProducto")) {
				jButtonCerrarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleSerieProducto")) {
				jButtonCerrarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleSerieProducto")) {
				jButtonCerrarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleSerieProducto")) {
				jButtonMostrarOcultarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleSerieProducto")) {
				jButtonCancelarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleSerieProducto")) {
				jButtonCopiarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleSerieProducto")) {
				jButtonVerFormDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleSerieProducto")) {
				jButtonCopiarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleSerieProducto")) {
				jButtonVerFormDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleSerieProducto")) {
				jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleSerieProducto")) {
				jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleSerieProducto")) {
				jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleSerieProducto")) {
				jButtonAnterioresDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleSerieProducto")) {
				jButtonAnterioresDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleSerieProducto")) {
				jButtonAnterioresDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleSerieProducto")) {
				jButtonSiguientesDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleSerieProducto")) {
				jButtonSiguientesDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleSerieProducto")) {
				jButtonSiguientesDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleSerieProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleSerieProducto")) {
				jButtonAbrirOrderByDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleSerieProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleSerieProducto")) {
				jButtonMostrarOcultarDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleSerieProducto")) {
				jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleSerieProducto")) {
				jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleSerieProducto")) {
				jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleSerieProducto")) {
				jButtonCerrarReporteDinamicoDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleSerieProducto")) {
				jButtonGenerarReporteDinamicoDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleSerieProducto")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleSerieProducto")) {
				jButtonCerrarImportacionDetalleSerieProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleSerieProducto")) {
				
				jButtonGenerarImportacionDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleSerieProducto")) {
				
				jButtonAbrirImportacionDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleSerieProducto")) {
				jComboBoxTiposAccionesDetalleSerieProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleSerieProducto")) {
				jComboBoxTiposRelacionesDetalleSerieProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleSerieProducto")) {
				jComboBoxTiposAccionesDetalleSerieProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleSerieProducto")) {
				
				jComboBoxTiposSeleccionarDetalleSerieProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleSerieProducto")) {
				jTextFieldValorCampoGeneralDetalleSerieProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleSerieProducto")) {
				jButtonAbrirOrderByDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleSerieProducto")) {
				jButtonAbrirOrderByDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleSerieProducto")) {
				jButtonCerrarOrderByDetalleSerieProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleSerieProductoBusqueda")) {
				this.jButtonidDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_serie_productoDetalleSerieProductoUpdate")) {
				this.jButtonid_serie_productoDetalleSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_serie_productoDetalleSerieProductoBusqueda")) {
				this.jButtonid_serie_productoDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleSerieProductoBusqueda")) {
				this.jButtonnombreDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleSerieProductoBusqueda")) {
				this.jButtondescripcionDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreDetalleSerieProducto")) {
				this.jButtonBusquedaPorNombreDetalleSerieProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSerieProductoDetalleSerieProducto")) {
				this.jButtonFK_IdSerieProductoDetalleSerieProductoActionPerformed(evt);
			}
			
			;
			
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleSerieProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleSerieProducto detalleserieproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleserieproductoLocal=this.detalleserieproducto;
			} else {
				detalleserieproductoLocal=this.detalleserieproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
							
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
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
			
			


			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
								
						
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
								
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
							
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
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
			
			


			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
								
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleSerieProducto")) {
					jCheckBoxSeleccionarTodosDetalleSerieProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleSerieProducto")) {
					jCheckBoxSeleccionadosDetalleSerieProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleSerieProducto")) {
					
				}
				
				


				
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
												
				
				


				
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
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
			
			


			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleSerieProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleserieproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleserieproducto);
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
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
				
				


				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleSerieProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleSerieProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleSerieProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleserieproductoAnterior =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleSerieProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleSerieProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleSerieProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleserieproducto =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleserieproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleSerieProducto")) {
				
				}
				
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleSerieProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleSerieProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleSerieProducto")) {
			
			}
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleSerieProducto();
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleSerieProducto")) {
				jButtonDuplicarDetalleSerieProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleSerieProducto")) {
				jButtonCopiarDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleSerieProducto")) {
				jButtonVerFormDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleSerieProducto")) {
				jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleSerieProducto")) {
				jButtonModificarDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleSerieProducto")) {
				jButtonActualizarDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleSerieProducto")) {
				jButtonEliminarDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleSerieProducto")) {
				jButtonCancelarDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleSerieProducto")) {
				jButtonCerrarDetalleSerieProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleSerieProducto")) {
				jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleSerieProducto")) {
				jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleSerieProducto")) {
				jButtonAbrirOrderByDetalleSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleSerieProducto")) {
				jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleSerieProducto")) {
				jButtonAnterioresDetalleSerieProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleSerieProducto")) {
				jButtonSiguientesDetalleSerieProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleSerieProductoBusqueda")) {
				this.jButtonidDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_serie_productoDetalleSerieProductoUpdate")) {
				this.jButtonid_serie_productoDetalleSerieProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_serie_productoDetalleSerieProductoBusqueda")) {
				this.jButtonid_serie_productoDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleSerieProductoBusqueda")) {
				this.jButtonnombreDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleSerieProductoBusqueda")) {
				this.jButtondescripcionDetalleSerieProductoBusquedaActionPerformed(evt);
			}
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleSerieProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleSerieProducto")) {
				closingInternalFrameDetalleSerieProducto();
				
			} else if(sTipo.equals("jButtonCancelarDetalleSerieProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleSerieProducto = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleSerieProductoBeanSwingJInternalFrame jInternalFrameParent=(DetalleSerieProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleSerieProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleSerieProductoActionPerformed(null);
			}
			
			DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleserieproducto,new Object(),this.detalleserieproductoParameterGeneral,this.detalleserieproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleSerieProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleSerieProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleSerieProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleserieproducto)) {
			if(!esControlTabla) {
				if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);			
				}
				
				if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleSerieProducto(this.detalleserieproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleserieproductoReturnGeneral=detalleserieproductoLogic.procesarEventosDetalleSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserieproductoLogic.getDetalleSerieProductos(),this.detalleserieproducto,this.detalleserieproductoParameterGeneral,this.isEsNuevoDetalleSerieProducto,classes);//this.detalleserieproductoLogic.getDetalleSerieProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleSerieProducto(this.detalleserieproductoReturnGeneral,this.detalleserieproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleSerieProducto(classes,this.detalleserieproductoReturnGeneral,this.detalleserieproductoBean,false);
					}
						
					if(this.detalleserieproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto());	
					}
						
					if(this.detalleserieproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto(),classes);//this.detalleserieproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleSerieProducto(this.detalleserieproducto,classes);//this.detalleserieproductoBean);									
				}
			
				if(DetalleSerieProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleSerieProducto(this.detalleserieproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleSerieProducto(this.detalleserieproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleserieproductoAnterior!=null) {
						this.detalleserieproducto=this.detalleserieproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleserieproductoReturnGeneral=detalleserieproductoLogic.procesarEventosDetalleSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserieproductoLogic.getDetalleSerieProductos(),this.detalleserieproducto,this.detalleserieproductoParameterGeneral,this.isEsNuevoDetalleSerieProducto,classes);//this.detalleserieproductoLogic.getDetalleSerieProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleserieproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto(),detalleserieproductoLogic.getDetalleSerieProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto(),this.detalleserieproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleSerieProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleSerieProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleSerieProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleSerieProducto() throws Exception {
		
		DetalleSerieProductoModel detalleserieproductoModel=(DetalleSerieProductoModel)this.jTableDatosDetalleSerieProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleserieproductoModel.detalleserieproductos=this.detalleserieproductoLogic.getDetalleSerieProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleserieproductoModel.detalleserieproductos=this.detalleserieproductos;
		}
		
		
		((DetalleSerieProductoModel) this.jTableDatosDetalleSerieProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleSerieProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleserieproductoAnterior(),this.detalleserieproductoLogic.getDetalleSerieProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleserieproductoAnterior(),this.detalleserieproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleSerieProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
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
										
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserieproducto,new Object(),generalEntityParameterGeneral,this.detalleserieproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleSerieProductoConstantesFunciones.getClassesRelationshipsOfDetalleSerieProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleSerieProductoConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleSerieProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleSerieProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleSerieProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleserieproducto,new Object(),generalEntityParameterGeneral,this.detalleserieproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleSerieProducto(DetalleSerieProductoBean detalleserieproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleSerieProducto(ArrayList<Classe> classes,DetalleSerieProductoReturnGeneral detalleserieproductoReturnGeneral,DetalleSerieProductoBean detalleserieproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleserieproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleSerieProducto = new DetalleSerieProductoDetalleFormJInternalFrame(jDesktopPane,this.detalleserieproductoSessionBean.getConGuardarRelaciones(),this.detalleserieproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.setVisible(false);
		this.jInternalFrameDetalleFormDetalleSerieProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.detalleserieproductoLogic=this.detalleserieproductoLogic;
		
		this.cargarCombosFrameForeignKeyDetalleSerieProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleSerieProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleSerieProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleSerieProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleSerieProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleSerieProducto"));
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarDetalleSerieProducto"));

		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleSerieProducto"));
					
		this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemModificarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"ActualizarDetalleSerieProducto"));
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleSerieProducto"));
						
		this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemActualizarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarDetalleSerieProducto"));
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleSerieProducto"));
								
		this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemEliminarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarDetalleSerieProducto"));
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleSerieProducto"));
					
		this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemCancelarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleSerieProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemDetalleCerrarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleSerieProducto"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleSerieProducto"));
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleSerieProducto"));
		
		
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleSerieProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonidDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonid_serie_productoDetalleSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_serie_productoDetalleSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonid_serie_productoDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_serie_productoDetalleSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonnombreDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtondescripcionDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleSerieProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleSerieProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleSerieProducto"));
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleSerieProducto"));
		}
		
		this.jTableDatosDetalleSerieProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleSerieProducto"));
		
		this.jTableDatosDetalleSerieProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleSerieProducto"));
		
		this.jButtonNuevoDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"NuevoDetalleSerieProducto"));
		
		this.jButtonDuplicarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"DuplicarDetalleSerieProducto"));
		
		this.jButtonCopiarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"CopiarDetalleSerieProducto"));
		
		this.jButtonVerFormDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"VerFormDetalleSerieProducto"));
		
		
		this.jButtonNuevoToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleSerieProducto"));
			
		this.jButtonDuplicarToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleSerieProducto"));
			
		this.jMenuItemNuevoDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleSerieProducto"));
			
		this.jMenuItemDuplicarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleSerieProducto"));		
		
		
		this.jButtonNuevoRelacionesDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleSerieProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleSerieProducto"));
			
		this.jMenuItemNuevoRelacionesDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleSerieProducto"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarDetalleSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonModificarToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleSerieProducto"));
			
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemModificarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"ActualizarDetalleSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonActualizarToolBarDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleSerieProducto"));
				
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemActualizarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarDetalleSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonEliminarToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleSerieProducto"));
						
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemEliminarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarDetalleSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonCancelarToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleSerieProducto"));
			
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemCancelarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleSerieProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleSerieProducto"));		
		
		
		this.jButtonCerrarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CerrarDetalleSerieProducto"));
		
		
		this.jButtonCerrarToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleSerieProducto"));
			
		this.jMenuItemCerrarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleSerieProducto"));
			
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jMenuItemDetalleCerrarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleSerieProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleSerieProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleSerieProducto"));
		}
		
		this.jButtonCopiarToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleSerieProducto"));
			
		this.jButtonVerFormToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleSerieProducto"));
		
		this.jMenuItemGuardarCambiosDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleSerieProducto"));
			
		this.jMenuItemCopiarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleSerieProducto"));		
		
		this.jMenuItemVerFormDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleSerieProducto"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleSerieProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleSerieProducto"));
			
		this.jMenuItemGuardarCambiosTablaDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleSerieProducto"));		
		
		
		
		this.jButtonRecargarInformacionDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleSerieProducto"));
					
		this.jButtonRecargarInformacionToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleSerieProducto"));
		
		this.jMenuItemRecargarInformacionDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleSerieProducto"));		
		
		
		
		this.jButtonAnterioresDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"AnterioresDetalleSerieProducto"));
		
		
		this.jButtonAnterioresToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleSerieProducto"));
		
		this.jMenuItemAnterioresDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleSerieProducto"));		
		
		
		this.jButtonSiguientesDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"SiguientesDetalleSerieProducto"));
		
		
		this.jButtonSiguientesToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleSerieProducto"));
			
		this.jMenuItemSiguientesDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleSerieProducto"));
			
		this.jMenuItemAbrirOrderByDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleSerieProducto"));
			
		this.jMenuItemMostrarOcultarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleSerieProducto"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleSerieProducto"));
			
		this.jMenuItemDetalleMostarOcultarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleSerieProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleSerieProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleSerieProducto"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleSerieProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleSerieProducto"));

		this.jCheckBoxSeleccionadosDetalleSerieProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleSerieProducto"));
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleSerieProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleSerieProducto"));
			
		this.jComboBoxTiposAccionesDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleSerieProducto"));
					
		this.jComboBoxTiposSeleccionarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleSerieProducto"));
			
		this.jTextFieldValorCampoGeneralDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleSerieProducto"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonidDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonid_serie_productoDetalleSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_serie_productoDetalleSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonid_serie_productoDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_serie_productoDetalleSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonnombreDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtondescripcionDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleSerieProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreDetalleSerieProducto"));

			this.jButtonFK_IdSerieProductoDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"FK_IdSerieProductoDetalleSerieProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleSerieProducto!=null) {
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleSerieProducto"));
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleSerieProducto"));
				this.jInternalFrameReporteDinamicoDetalleSerieProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleSerieProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleSerieProducto"));				
			//this.jButtonGenerarReporteDinamicoDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleSerieProducto"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleSerieProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleSerieProducto!=null) {
				this.jInternalFrameImportacionDetalleSerieProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleSerieProducto"));
				this.jInternalFrameImportacionDetalleSerieProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleSerieProducto"));
				this.jInternalFrameImportacionDetalleSerieProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleSerieProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleSerieProducto"));
			
			this.jButtonAbrirOrderByToolBarDetalleSerieProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleSerieProducto"));			
			
			if(this.jInternalFrameOrderByDetalleSerieProducto!=null) {
				this.jInternalFrameOrderByDetalleSerieProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleSerieProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleSerieProducto.jTabbedPaneRelacionesDetalleSerieProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleSerieProducto"));
		
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
            		closingInternalFrameDetalleSerieProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleSerieProducto = (JInternalFrameBase)event.getSource();
	            	
	            DetalleSerieProductoBeanSwingJInternalFrame jInternalFrameParent=(DetalleSerieProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleSerieProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleSerieProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleSerieProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleSerieProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleSerieProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleSerieProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleSerieProducto";
		inputMap = this.jButtonNuevoDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleSerieProducto";
		inputMap = this.jButtonNuevoRelacionesDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleSerieProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleSerieProducto";
		inputMap = this.jButtonModificarDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleSerieProducto";
		inputMap = this.jButtonActualizarDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleSerieProducto";
		inputMap = this.jButtonEliminarDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleSerieProducto";
		inputMap = this.jButtonCancelarDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleSerieProducto";
		inputMap = this.jButtonCerrarDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleSerieProducto";
		inputMap = this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonGuardarCambiosDetalleSerieProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleSerieProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleSerieProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleSerieProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleSerieProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleSerieProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleSerieProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleSerieProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleSerieProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleSerieProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonidDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleSerieProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonid_serie_productoDetalleSerieProductoUpdate.addActionListener(new ButtonActionListener(this,"id_serie_productoDetalleSerieProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonid_serie_productoDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_serie_productoDetalleSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtonnombreDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleSerieProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleSerieProducto.jButtondescripcionDetalleSerieProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleSerieProductoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreDetalleSerieProducto"));

		this.jButtonFK_IdSerieProductoDetalleSerieProducto.addActionListener(new ButtonActionListener(this,"FK_IdSerieProductoDetalleSerieProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleSerieProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleSerieProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleSerieProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleSerieProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleSerieProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
					detalleserieproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductos) {
					detalleserieproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleSerieProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
						detalleserieproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductos) {
						detalleserieproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleSerieProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleSerieProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleSerieProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleSerieProducto.getSelectedRows();
			
			DetalleSerieProducto detalleserieproductoLocal=new DetalleSerieProducto();
			
			//this.seleccionarTodosDetalleSerieProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleserieproductoLocal =(DetalleSerieProducto) this.detalleserieproductoLogic.getDetalleSerieProductos().toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleserieproductoLocal =(DetalleSerieProducto) this.detalleserieproductos.toArray()[this.jTableDatosDetalleSerieProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleserieproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
						detalleserieproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductos) {
						detalleserieproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleSerieProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleSerieProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleSerieProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleSerieProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleSerieProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleSerieProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleSerieProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductoLogic.getDetalleSerieProductos()) {
				
						if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detalleserieproductoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleserieproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductos) {
					
						if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detalleserieproductoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleserieproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleSerieProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleSerieProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleSerieProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleSerieProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleSerieProducto(conSplash);
				
					this.generarReporteDetalleSerieProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleSerieProductosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleSerieProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleSerieProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleSerieProducto();
				
				this.exportarDetalleSerieProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleSerieProductos();
				//this.importarDetalleSerieProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleSerieProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleSerieProductosSeleccionados();
				//this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleSerieProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleSerieProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleSerieProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleSerieProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleSerieProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleSerieProducto(conSplash);
					
						//this.actualizarParametrosGeneralDetalleSerieProducto();
						
						this.generarReporteProcesoAccionDetalleSerieProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleSerieProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Serie ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Serie Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleSerieProducto();
				
						this.actualizarParametrosGeneralDetalleSerieProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleserieproductoReturnGeneral=detalleserieproductoLogic.procesarAccionDetalleSerieProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleserieproductoLogic.getDetalleSerieProductos(),this.detalleserieproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleSerieProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleSerieProducto();
					
					DetalleSerieProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleSerieProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleSerieProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleSerieProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleSerieProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleSerieProducto();
			
			if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
			DetalleSerieProducto detalleserieproducto=new DetalleSerieProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleSerieProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleSerieProducto.getSelectedItem();
			
			
			
			
			detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleserieproductosSeleccionados.size()==1) {
				for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosSeleccionados) {
					detalleserieproducto=detalleserieproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleSerieProducto();
			
      		//this.finishProcessDetalleSerieProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleSerieProductoReturnGeneral() throws Exception {
		if(this.detalleserieproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleserieproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleserieproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleserieproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleserieproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleserieproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleSerieProducto(false);
		}
		
		if(this.detalleserieproductoReturnGeneral.getConRetornoLista() || this.detalleserieproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleserieproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleserieproductoLogic.setDetalleSerieProductos(this.detalleserieproductoReturnGeneral.getDetalleSerieProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleserieproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleserieproductoLogic.setDetalleSerieProducto(this.detalleserieproductoReturnGeneral.getDetalleSerieProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleSerieProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleSerieProducto() throws Exception {
		
		
	}
	
	public ArrayList<DetalleSerieProducto> getDetalleSerieProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleSerieProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductoLogic.getDetalleSerieProductos()) {
					if(detalleserieproductoAux.getIsSelected()) {
						detalleserieproductosSeleccionados.add(detalleserieproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleSerieProducto detalleserieproductoAux:this.detalleserieproductos) {
					if(detalleserieproductoAux.getIsSelected()) {
						detalleserieproductosSeleccionados.add(detalleserieproductoAux);				
					}
				}
			}
			
			if(detalleserieproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleserieproductosSeleccionados.addAll(this.detalleserieproductoLogic.getDetalleSerieProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleserieproductosSeleccionados.addAll(this.detalleserieproductos);				
					}
				}
			}
		} else {
			detalleserieproductosSeleccionados.add(this.detalleserieproducto);
		}
		
		return detalleserieproductosSeleccionados;
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
	
	public void generarReporteDetalleSerieProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleSerieProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleSerieProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleSerieProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleSerieProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Serie Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleSerieProductosSeleccionados() throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleSerieProductosSeleccionados() throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleSerieProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleSerieProductosSeleccionados() throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleSerieProducto();
		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleSerieProducto();
		
		
		//this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados ,detalleserieproductoImplementable,detalleserieproductoImplementableHome);
	}
	
	public void mostrarImportacionDetalleSerieProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleSerieProducto();
		
		this.abrirFrameImportacionDetalleSerieProducto();		
		
			
		//this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados ,detalleserieproductoImplementable,detalleserieproductoImplementableHome);
	}
	
	public void importarDetalleSerieProductos() throws Exception {		
	
	}
	
	public void exportarDetalleSerieProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleSerieProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleSerieProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleSerieProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Serie Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleSerieProductosSeleccionados() throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleSerieProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleSerieProducto(detalleserieproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleserieproductoAux.setsDetalleGeneralEntityReporte(detalleserieproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleSerieProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleSerieProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleSerieProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleserieproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserieproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserieproducto.getserieproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserieproducto.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleserieproducto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleSerieProductosSeleccionados() throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleSerieProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleSerieProducto(row);				
				iRow++;
			}				
			
			for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleSerieProducto(detalleserieproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleSerieProductosSeleccionados() throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();		
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleserieproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleserieproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleserieproducto");
			//elementRoot.appendChild(element);
		
			for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosSeleccionados) {
				element = document.createElement("detalleserieproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleSerieProducto(detalleserieproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Serie Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleSerieProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserieproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserieproducto.getserieproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserieproducto.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleserieproducto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleSerieProducto(DetalleSerieProducto detalleserieproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleSerieProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleserieproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleSerieProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleserieproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementserieproducto_descripcion = document.createElement(DetalleSerieProductoConstantesFunciones.IDSERIEPRODUCTO);
		elementserieproducto_descripcion.appendChild(document.createTextNode(detalleserieproducto.getserieproducto_descripcion()));
		element.appendChild(elementserieproducto_descripcion);

		Element elementnombre = document.createElement(DetalleSerieProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(detalleserieproducto.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(DetalleSerieProductoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalleserieproducto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleSerieProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados=new ArrayList<DetalleSerieProducto>();
		
		detalleserieproductosSeleccionados=this.getDetalleSerieProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleSerieProducto(detalleserieproductosSeleccionados);
		
		this.generarReporteDetalleSerieProductos("Todos",detalleserieproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleSerieProducto(ArrayList<DetalleSerieProducto> detalleserieproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleSerieProducto detalleserieproductoAux:detalleserieproductosSeleccionados) {
				detalleserieproductoAux.setsDetalleGeneralEntityReporte(detalleserieproductoAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO)) {
					existe=true;
					detalleserieproductoAux.setsDescripcionGeneralEntityReporte1(detalleserieproductoAux.getserieproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					detalleserieproductoAux.setsDescripcionGeneralEntityReporte1(detalleserieproductoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalleserieproductoAux.setsDescripcionGeneralEntityReporte1(detalleserieproductoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleSerieProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleSerieProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleSerieProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=false;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
			this.isVisibilidadCeldaModificarDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=true;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
			this.isVisibilidadCeldaModificarDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=true;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=true;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
			this.isVisibilidadCeldaModificarDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=true;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=true;
			this.isVisibilidadCeldaModificarDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=false;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=false;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
			this.isVisibilidadCeldaModificarDetalleSerieProducto=true;
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=false;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
			this.isVisibilidadCeldaCancelarDetalleSerieProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleSerieProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=true;
		} else {
			this.actualizarEstadoPanelsDetalleSerieProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleSerieProducto=false;
			//this.isVisibilidadCeldaVerFormDetalleSerieProducto=false;
			this.isVisibilidadCeldaDuplicarDetalleSerieProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleserieproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleSerieProducto=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleSerieProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			if(!detalleserieproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;												
			}
			
			this.jButtonCerrarDetalleSerieProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleSerieProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleserieproducto)) {
			this.isVisibilidadCeldaActualizarDetalleSerieProducto=false;
			this.isVisibilidadCeldaEliminarDetalleSerieProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleSerieProducto() {
	}
	
	public void actualizarEstadoPanelsDetalleSerieProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleSerieProducto!=null) {
				this.jScrollPanelDatosEdicionDetalleSerieProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleSerieProducto!=null) {
				this.jScrollPanelDatosDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleSerieProducto!=null) {
				this.jPanelPaginacionDetalleSerieProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
					this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleSerieProducto!=null) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleSerieProducto!=null) {
				this.jPanelParametrosReportesDetalleSerieProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaSerieProducto(Boolean isParaSerieProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSerieProductoNegation=!isParaSerieProducto;

			this.isVisibilidadBusquedaPorNombre=isParaSerieProductoNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasDetalleSerieProducto.remove(jPanelBusquedaPorNombreDetalleSerieProducto);}

			this.isVisibilidadFK_IdSerieProducto=isParaSerieProducto;
			if(!this.isVisibilidadFK_IdSerieProducto) {this.jTabbedPaneBusquedasDetalleSerieProducto.remove(jPanelFK_IdSerieProductoDetalleSerieProducto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleSerieProductoSessionBean detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		
		if(this.detalleserieproductoSessionBean==null) {
			this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		}
		
		this.detalleserieproductoSessionBean.setsUltimaBusquedaDetalleSerieProducto(this.getsAccionBusqueda());
		this.detalleserieproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleserieproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			detalleserieproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSerieProducto")) {
			detalleserieproductoSessionBean.setid_serie_producto(this.getid_serie_productoFK_IdSerieProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleSerieProductoSessionBean detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		
		if(this.detalleserieproductoSessionBean==null) {
			this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		}
		
		if(this.detalleserieproductoSessionBean.getsUltimaBusquedaDetalleSerieProducto()!=null&&!this.detalleserieproductoSessionBean.getsUltimaBusquedaDetalleSerieProducto().equals("")) {
			this.setsAccionBusqueda(detalleserieproductoSessionBean.getsUltimaBusquedaDetalleSerieProducto());
			this.setiNumeroPaginacion(detalleserieproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleserieproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(detalleserieproductoSessionBean.getnombre());
				detalleserieproductoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSerieProducto")) {
				this.setid_serie_productoFK_IdSerieProducto(detalleserieproductoSessionBean.getid_serie_producto());
				detalleserieproductoSessionBean.setid_serie_producto(-1L);
			}
		}
		
		this.detalleserieproductoSessionBean.setsUltimaBusquedaDetalleSerieProducto("");
		this.detalleserieproductoSessionBean.setiNumeroPaginacion(DetalleSerieProductoConstantesFunciones.INUMEROPAGINACION);
		this.detalleserieproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleSerieProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleSerieProducto() {
		this.updateBorderResaltarBusquedasFormularioDetalleSerieProducto();
		this.updateVisibilidadBusquedasFormularioDetalleSerieProducto();
		this.updateHabilitarBusquedasFormularioDetalleSerieProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleSerieProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleSerieProducto.getComponents().length>0) {
	

		if(this.detalleserieproductoConstantesFunciones.resaltarBusquedaPorNombreDetalleSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelBusquedaPorNombreDetalleSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);
				jPanel.setBorder(this.detalleserieproductoConstantesFunciones.resaltarBusquedaPorNombreDetalleSerieProducto);
			}
		}

		if(this.detalleserieproductoConstantesFunciones.resaltarFK_IdSerieProductoDetalleSerieProducto!=null) {
			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelFK_IdSerieProductoDetalleSerieProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);
				jPanel.setBorder(this.detalleserieproductoConstantesFunciones.resaltarFK_IdSerieProductoDetalleSerieProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleSerieProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleSerieProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelBusquedaPorNombreDetalleSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserieproductoConstantesFunciones.mostrarBusquedaPorNombreDetalleSerieProducto);
			if(!this.detalleserieproductoConstantesFunciones.mostrarBusquedaPorNombreDetalleSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelFK_IdSerieProductoDetalleSerieProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleserieproductoConstantesFunciones.mostrarFK_IdSerieProductoDetalleSerieProducto);
			if(!this.detalleserieproductoConstantesFunciones.mostrarFK_IdSerieProductoDetalleSerieProducto && index>-1) {
				this.jTabbedPaneBusquedasDetalleSerieProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleSerieProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleSerieProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelBusquedaPorNombreDetalleSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserieproductoConstantesFunciones.activarBusquedaPorNombreDetalleSerieProducto);
				this.jTabbedPaneBusquedasDetalleSerieProducto.setEnabledAt(index,this.detalleserieproductoConstantesFunciones.activarBusquedaPorNombreDetalleSerieProducto);
			}

			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelFK_IdSerieProductoDetalleSerieProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleserieproductoConstantesFunciones.activarFK_IdSerieProductoDetalleSerieProducto);
				this.jTabbedPaneBusquedasDetalleSerieProducto.setEnabledAt(index,this.detalleserieproductoConstantesFunciones.activarFK_IdSerieProductoDetalleSerieProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleSerieProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelBusquedaPorNombreDetalleSerieProducto);

			this.jTabbedPaneBusquedasDetalleSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);

			this.detalleserieproductoConstantesFunciones.setResaltarBusquedaPorNombreDetalleSerieProducto(resaltar);

			jPanel.setBorder(this.detalleserieproductoConstantesFunciones.resaltarBusquedaPorNombreDetalleSerieProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSerieProducto")) {
			index= this.jTabbedPaneBusquedasDetalleSerieProducto.indexOfComponent(this.jPanelFK_IdSerieProductoDetalleSerieProducto);

			this.jTabbedPaneBusquedasDetalleSerieProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleSerieProducto.getComponent(index);

			this.detalleserieproductoConstantesFunciones.setResaltarFK_IdSerieProductoDetalleSerieProducto(resaltar);

			jPanel.setBorder(this.detalleserieproductoConstantesFunciones.resaltarFK_IdSerieProductoDetalleSerieProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleSerieProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleSerieProducto() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleSerieProducto();
		this.updateVisibilidadResaltarControlesFormularioDetalleSerieProducto();
		this.updateHabilitarResaltarControlesFormularioDetalleSerieProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleSerieProducto() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleserieproductoConstantesFunciones.resaltaridDetalleSerieProducto!=null && this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setBorder(this.detalleserieproductoConstantesFunciones.resaltaridDetalleSerieProducto);}
		if(this.detalleserieproductoConstantesFunciones.resaltarid_serie_productoDetalleSerieProducto!=null && this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setBorder(this.detalleserieproductoConstantesFunciones.resaltarid_serie_productoDetalleSerieProducto);}
		if(this.detalleserieproductoConstantesFunciones.resaltarnombreDetalleSerieProducto!=null && this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setBorder(this.detalleserieproductoConstantesFunciones.resaltarnombreDetalleSerieProducto);}
		if(this.detalleserieproductoConstantesFunciones.resaltardescripcionDetalleSerieProducto!=null && this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setBorder(this.detalleserieproductoConstantesFunciones.resaltardescripcionDetalleSerieProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleSerieProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
	
		//this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostraridDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelidDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostraridDetalleSerieProducto);
		//this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostrarid_serie_productoDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelid_serie_productoDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostrarid_serie_productoDetalleSerieProducto);
		//this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostrarnombreDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jPanelnombreDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostrarnombreDetalleSerieProducto);
		//this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostrardescripcionDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jPaneldescripcionDetalleSerieProducto.setVisible(this.detalleserieproductoConstantesFunciones.mostrardescripcionDetalleSerieProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleSerieProducto() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleSerieProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleSerieProducto!=null) {
	
		this.jInternalFrameDetalleFormDetalleSerieProducto.jLabelidDetalleSerieProducto.setEnabled(this.detalleserieproductoConstantesFunciones.activaridDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jComboBoxid_serie_productoDetalleSerieProducto.setEnabled(this.detalleserieproductoConstantesFunciones.activarid_serie_productoDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreanombreDetalleSerieProducto.setEnabled(this.detalleserieproductoConstantesFunciones.activarnombreDetalleSerieProducto);
		this.jInternalFrameDetalleFormDetalleSerieProducto.jTextAreadescripcionDetalleSerieProducto.setEnabled(this.detalleserieproductoConstantesFunciones.activardescripcionDetalleSerieProducto);
		}
	}
	
		
}