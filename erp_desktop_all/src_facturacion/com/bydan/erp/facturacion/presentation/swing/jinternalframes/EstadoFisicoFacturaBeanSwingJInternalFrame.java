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

import com.bydan.erp.facturacion.util.EstadoFisicoFacturaConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoFisicoFacturaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoFisicoFacturaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoFisicoFacturaBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class EstadoFisicoFacturaBeanSwingJInternalFrame extends EstadoFisicoFacturaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoFisicoFacturaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoFisicoFactura> estadofisicofacturaValidator = new ClassValidator<EstadoFisicoFactura>(EstadoFisicoFactura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoFisicoFactura estadofisicofactura;	
	public EstadoFisicoFactura estadofisicofacturaAux;
	public EstadoFisicoFactura estadofisicofacturaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoFisicoFactura estadofisicofacturaTotales;
	public Long idEstadoFisicoFacturaActual;
	public Long iIdNuevoEstadoFisicoFactura=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoEstadoFisicoFactura;
	public Boolean isPermisoNuevoEstadoFisicoFactura;
	public Boolean isPermisoActualizarEstadoFisicoFactura;
	public Boolean isPermisoActualizarOriginalEstadoFisicoFactura;
	public Boolean isPermisoEliminarEstadoFisicoFactura;
	public Boolean isPermisoGuardarCambiosEstadoFisicoFactura;
	public Boolean isPermisoConsultaEstadoFisicoFactura;
	public Boolean isPermisoBusquedaEstadoFisicoFactura;
	public Boolean isPermisoReporteEstadoFisicoFactura;
	public Boolean isPermisoPaginacionMedioEstadoFisicoFactura;
	public Boolean isPermisoPaginacionAltoEstadoFisicoFactura;
	public Boolean isPermisoPaginacionTodoEstadoFisicoFactura;
	public Boolean isPermisoCopiarEstadoFisicoFactura;
	public Boolean isPermisoVerFormEstadoFisicoFactura;
	public Boolean isPermisoDuplicarEstadoFisicoFactura;
	public Boolean isPermisoOrdenEstadoFisicoFactura;
	
	
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
	
	public EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaReturnGeneral;
	public EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoFisicoFactura=false;
	public Boolean esParaAccionDesdeFormularioEstadoFisicoFactura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoFisicoFacturaLogic estadofisicofacturaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoFisicoFactura estadofisicofacturaBean;
	public EstadoFisicoFacturaConstantesFunciones estadofisicofacturaConstantesFunciones;
	//public EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<EstadoFisicoFactura> estadofisicofacturas;	
	//public List<EstadoFisicoFactura> estadofisicofacturasEliminados;
	//public List<EstadoFisicoFactura> estadofisicofacturasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoFisicoFactura=true;
	public Boolean isVisibilidadCeldaCopiarEstadoFisicoFactura=true;
	public Boolean isVisibilidadCeldaVerFormEstadoFisicoFactura=true;
	public Boolean isVisibilidadCeldaOrdenEstadoFisicoFactura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
	public Boolean isVisibilidadCeldaModificarEstadoFisicoFactura=false;
	public Boolean isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
	public Boolean isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
	public Boolean isVisibilidadCeldaCancelarEstadoFisicoFactura=false;
	public Boolean isVisibilidadCeldaGuardarEstadoFisicoFactura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoEstadoFisicoFactura() {
		return this.iIdNuevoEstadoFisicoFactura;
	}

	public void setiIdNuevoEstadoFisicoFactura(Long iIdNuevoEstadoFisicoFactura) {
		this.iIdNuevoEstadoFisicoFactura = iIdNuevoEstadoFisicoFactura;
	}
	
	public Long getidEstadoFisicoFacturaActual() {
		return this.idEstadoFisicoFacturaActual;
	}

	public void setidEstadoFisicoFacturaActual(Long idEstadoFisicoFacturaActual) {
		this.idEstadoFisicoFacturaActual = idEstadoFisicoFacturaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoFisicoFactura getestadofisicofactura() {
		return this.estadofisicofactura;
	}

	public void setestadofisicofactura(EstadoFisicoFactura estadofisicofactura) {
		this.estadofisicofactura = estadofisicofactura;
	}
	
	public EstadoFisicoFactura getestadofisicofacturaAux() {
		return this.estadofisicofacturaAux;
	}

	public void setestadofisicofacturaAux(EstadoFisicoFactura estadofisicofacturaAux) {
		this.estadofisicofacturaAux = estadofisicofacturaAux;
	}				
	
	public EstadoFisicoFactura getestadofisicofacturaAnterior() {
		return this.estadofisicofacturaAnterior;
	}

	public void setestadofisicofacturaAnterior(EstadoFisicoFactura estadofisicofacturaAnterior) {
		this.estadofisicofacturaAnterior = estadofisicofacturaAnterior;
	}	
	
	public EstadoFisicoFactura getestadofisicofacturaTotales() {
		return this.estadofisicofacturaTotales;
	}

	public void setestadofisicofacturaTotales(EstadoFisicoFactura estadofisicofacturaTotales) {
		this.estadofisicofacturaTotales = estadofisicofacturaTotales;
	}	
	
	public EstadoFisicoFactura getestadofisicofacturaBean() {
		return this.estadofisicofacturaBean;
	}

	public void setestadofisicofacturaBean(EstadoFisicoFactura estadofisicofacturaBean) {
		this.estadofisicofacturaBean = estadofisicofacturaBean;
	}	
	
	public EstadoFisicoFacturaParameterReturnGeneral getestadofisicofacturaReturnGeneral() {
		return this.estadofisicofacturaReturnGeneral;
	}

	public void setestadofisicofacturaReturnGeneral(EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaReturnGeneral) {
		this.estadofisicofacturaReturnGeneral = estadofisicofacturaReturnGeneral;
	}	
	
	
	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoFisicoFacturaLogic getEstadoFisicoFacturaLogic()	{		
		return estadofisicofacturaLogic;
	}

	public void setEstadoFisicoFacturaLogic(EstadoFisicoFacturaLogic estadofisicofacturaLogic) {
		this.estadofisicofacturaLogic = estadofisicofacturaLogic;
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
	
	public Boolean getIsEsNuevoEstadoFisicoFactura() {
		return isEsNuevoEstadoFisicoFactura;
	}

	public void setIsEsNuevoEstadoFisicoFactura(Boolean isEsNuevoEstadoFisicoFactura) {
		this.isEsNuevoEstadoFisicoFactura = isEsNuevoEstadoFisicoFactura;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoFisicoFactura() {
		return esParaAccionDesdeFormularioEstadoFisicoFactura;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoFisicoFactura(Boolean esParaAccionDesdeFormularioEstadoFisicoFactura) {
		this.esParaAccionDesdeFormularioEstadoFisicoFactura = esParaAccionDesdeFormularioEstadoFisicoFactura;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.estadofisicofacturaSessionBean==null) {
				this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
			}

			if(!this.estadofisicofacturaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(estadofisicofacturaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.estadofisicofactura!=null) {
						this.estadofisicofactura.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
						this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisEstadoFisicoFactura.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
						if(this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisEstadoFisicoFactura!=null) {
						jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisEstadoFisicoFactura!=null) {
							//jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisEstadoFisicoFacturaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisEstadoFisicoFacturaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisEstadoFisicoFacturaGenerico!=null && jComboBoxid_paisEstadoFisicoFacturaGenerico.getItemCount()>0) {
					jComboBoxid_paisEstadoFisicoFacturaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(EstadoFisicoFactura estadofisicofactura,JComboBox jComboBoxid_paisEstadoFisicoFacturaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisEstadoFisicoFacturaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisEstadoFisicoFacturaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				estadofisicofactura.setid_pais(paisAux.getId());
				estadofisicofactura.setpais_descripcion(EstadoFisicoFacturaConstantesFunciones.getPaisDescripcion(paisAux));
				estadofisicofactura.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { 
							this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { 
					}

					if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.addItem(pais);
							}
						}

						if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
							this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
							this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadoFisicoFactura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoFisicoFacturaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFisicoFactura(this.estadofisicofacturaLogic.getEstadoFisicoFacturas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoFisicoFacturaConstantesFunciones.refrescarForeignKeysDescripcionesEstadoFisicoFactura(this.estadofisicofacturas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadofisicofacturaLogic.setEstadoFisicoFacturas(this.estadofisicofacturas);
			estadofisicofacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoFisicoFacturaParameterReturnGeneral getEstadoFisicoFacturaParameterGeneral() {
		return this.estadofisicofacturaParameterGeneral;
	}
	
	public void setEstadoFisicoFacturaParameterGeneral(EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaParameterGeneral) {
		this.estadofisicofacturaParameterGeneral = estadofisicofacturaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoFisicoFactura() {
		return isPermisoTodoEstadoFisicoFactura;
	}

	public void setIsPermisoTodoEstadoFisicoFactura(Boolean isPermisoTodoEstadoFisicoFactura) {
		this.isPermisoTodoEstadoFisicoFactura = isPermisoTodoEstadoFisicoFactura;
	}

	public Boolean getIsPermisoNuevoEstadoFisicoFactura() {
		return isPermisoNuevoEstadoFisicoFactura;
	}

	public void setIsPermisoNuevoEstadoFisicoFactura(Boolean isPermisoNuevoEstadoFisicoFactura) {
		this.isPermisoNuevoEstadoFisicoFactura = isPermisoNuevoEstadoFisicoFactura;
	}

	public Boolean getIsPermisoActualizarEstadoFisicoFactura() {
		return isPermisoActualizarEstadoFisicoFactura;
	}

	public void setIsPermisoActualizarEstadoFisicoFactura(Boolean isPermisoActualizarEstadoFisicoFactura) {
		this.isPermisoActualizarEstadoFisicoFactura = isPermisoActualizarEstadoFisicoFactura;
	}

	public Boolean getIsPermisoEliminarEstadoFisicoFactura() {
		return isPermisoEliminarEstadoFisicoFactura;
	}

	public void setIsPermisoEliminarEstadoFisicoFactura(Boolean isPermisoEliminarEstadoFisicoFactura) {
		this.isPermisoEliminarEstadoFisicoFactura = isPermisoEliminarEstadoFisicoFactura;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoFisicoFactura() {
		return isPermisoGuardarCambiosEstadoFisicoFactura;
	}

	public void setIsPermisoGuardarCambiosEstadoFisicoFactura(Boolean isPermisoGuardarCambiosEstadoFisicoFactura) {
		this.isPermisoGuardarCambiosEstadoFisicoFactura = isPermisoGuardarCambiosEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoConsultaEstadoFisicoFactura() {
		return isPermisoConsultaEstadoFisicoFactura;
	}

	public void setIsPermisoConsultaEstadoFisicoFactura(Boolean isPermisoConsultaEstadoFisicoFactura) {
		this.isPermisoConsultaEstadoFisicoFactura = isPermisoConsultaEstadoFisicoFactura;
	}

	public Boolean getIsPermisoBusquedaEstadoFisicoFactura() {
		return isPermisoBusquedaEstadoFisicoFactura;
	}

	public void setIsPermisoBusquedaEstadoFisicoFactura(Boolean isPermisoBusquedaEstadoFisicoFactura) {
		this.isPermisoBusquedaEstadoFisicoFactura = isPermisoBusquedaEstadoFisicoFactura;
	}

	public Boolean getIsPermisoReporteEstadoFisicoFactura() {
		return isPermisoReporteEstadoFisicoFactura;
	}

	public void setIsPermisoReporteEstadoFisicoFactura(Boolean isPermisoReporteEstadoFisicoFactura) {
		this.isPermisoReporteEstadoFisicoFactura = isPermisoReporteEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoFisicoFactura() {
		return isPermisoPaginacionMedioEstadoFisicoFactura;
	}

	public void setIsPermisoPaginacionMedioEstadoFisicoFactura(Boolean isPermisoPaginacionMedioEstadoFisicoFactura) {
		this.isPermisoPaginacionMedioEstadoFisicoFactura = isPermisoPaginacionMedioEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoFisicoFactura() {
		return isPermisoPaginacionTodoEstadoFisicoFactura;
	}

	public void setIsPermisoPaginacionTodoEstadoFisicoFactura(Boolean isPermisoPaginacionTodoEstadoFisicoFactura) {
		this.isPermisoPaginacionTodoEstadoFisicoFactura = isPermisoPaginacionTodoEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoFisicoFactura() {
		return isPermisoPaginacionAltoEstadoFisicoFactura;
	}

	public void setIsPermisoPaginacionAltoEstadoFisicoFactura(Boolean isPermisoPaginacionAltoEstadoFisicoFactura) {
		this.isPermisoPaginacionAltoEstadoFisicoFactura = isPermisoPaginacionAltoEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoCopiarEstadoFisicoFactura() {
		return isPermisoCopiarEstadoFisicoFactura;
	}

	public void setIsPermisoCopiarEstadoFisicoFactura(Boolean isPermisoCopiarEstadoFisicoFactura) {
		this.isPermisoCopiarEstadoFisicoFactura = isPermisoCopiarEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoVerFormEstadoFisicoFactura() {
		return isPermisoVerFormEstadoFisicoFactura;
	}

	public void setIsPermisoVerFormEstadoFisicoFactura(Boolean isPermisoVerFormEstadoFisicoFactura) {
		this.isPermisoVerFormEstadoFisicoFactura = isPermisoVerFormEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoDuplicarEstadoFisicoFactura() {
		return isPermisoDuplicarEstadoFisicoFactura;
	}

	public void setIsPermisoDuplicarEstadoFisicoFactura(Boolean isPermisoDuplicarEstadoFisicoFactura) {
		this.isPermisoDuplicarEstadoFisicoFactura = isPermisoDuplicarEstadoFisicoFactura;
	}
	
	public Boolean getIsPermisoOrdenEstadoFisicoFactura() {
		return isPermisoOrdenEstadoFisicoFactura;
	}

	public void setIsPermisoOrdenEstadoFisicoFactura(Boolean isPermisoOrdenEstadoFisicoFactura) {
		this.isPermisoOrdenEstadoFisicoFactura = isPermisoOrdenEstadoFisicoFactura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoFisicoFactura() {
		return isVisibilidadCeldaNuevoEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaNuevoEstadoFisicoFactura(Boolean isVisibilidadCeldaNuevoEstadoFisicoFactura) {
		this.isVisibilidadCeldaNuevoEstadoFisicoFactura = isVisibilidadCeldaNuevoEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoFisicoFactura() {
		return isVisibilidadCeldaDuplicarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoFisicoFactura(Boolean isVisibilidadCeldaDuplicarEstadoFisicoFactura) {
		this.isVisibilidadCeldaDuplicarEstadoFisicoFactura = isVisibilidadCeldaDuplicarEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoFisicoFactura() {
		return isVisibilidadCeldaCopiarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaCopiarEstadoFisicoFactura(Boolean isVisibilidadCeldaCopiarEstadoFisicoFactura) {
		this.isVisibilidadCeldaCopiarEstadoFisicoFactura = isVisibilidadCeldaCopiarEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoFisicoFactura() {
		return isVisibilidadCeldaVerFormEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaVerFormEstadoFisicoFactura(Boolean isVisibilidadCeldaVerFormEstadoFisicoFactura) {
		this.isVisibilidadCeldaVerFormEstadoFisicoFactura = isVisibilidadCeldaVerFormEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoFisicoFactura() {
		return isVisibilidadCeldaOrdenEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaOrdenEstadoFisicoFactura(Boolean isVisibilidadCeldaOrdenEstadoFisicoFactura) {
		this.isVisibilidadCeldaOrdenEstadoFisicoFactura = isVisibilidadCeldaOrdenEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura() {
		return isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura(Boolean isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura = isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoFisicoFactura() {
		return isVisibilidadCeldaModificarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaModificarEstadoFisicoFactura(Boolean isVisibilidadCeldaModificarEstadoFisicoFactura) {
		this.isVisibilidadCeldaModificarEstadoFisicoFactura = isVisibilidadCeldaModificarEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoFisicoFactura() {
		return isVisibilidadCeldaActualizarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaActualizarEstadoFisicoFactura(Boolean isVisibilidadCeldaActualizarEstadoFisicoFactura) {
		this.isVisibilidadCeldaActualizarEstadoFisicoFactura = isVisibilidadCeldaActualizarEstadoFisicoFactura;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoFisicoFactura() {
		return isVisibilidadCeldaEliminarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaEliminarEstadoFisicoFactura(Boolean isVisibilidadCeldaEliminarEstadoFisicoFactura) {
		this.isVisibilidadCeldaEliminarEstadoFisicoFactura = isVisibilidadCeldaEliminarEstadoFisicoFactura;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoFisicoFactura() {
		return isVisibilidadCeldaCancelarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaCancelarEstadoFisicoFactura(Boolean isVisibilidadCeldaCancelarEstadoFisicoFactura) {
		this.isVisibilidadCeldaCancelarEstadoFisicoFactura = isVisibilidadCeldaCancelarEstadoFisicoFactura;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoFisicoFactura() {
		return isVisibilidadCeldaGuardarEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaGuardarEstadoFisicoFactura(Boolean isVisibilidadCeldaGuardarEstadoFisicoFactura) {
		this.isVisibilidadCeldaGuardarEstadoFisicoFactura = isVisibilidadCeldaGuardarEstadoFisicoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoFisicoFactura() {
		return isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoFisicoFactura(Boolean isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura) {
		this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura = isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura;
	}
		
	public EstadoFisicoFacturaSessionBean getestadofisicofacturaSessionBean() {
		return this.estadofisicofacturaSessionBean;
	}
	
	public void setestadofisicofacturaSessionBean(EstadoFisicoFacturaSessionBean estadofisicofacturaSessionBean) {
		this.estadofisicofacturaSessionBean=estadofisicofacturaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(estadofisicofactura,null);
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
	
	public void bugActualizarReferenciaActual(EstadoFisicoFactura estadofisicofactura,EstadoFisicoFactura estadofisicofacturaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoFisicoFactura(estadofisicofactura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadofisicofacturaAux.setId(estadofisicofactura.getId());
		estadofisicofacturaAux.setVersionRow(estadofisicofactura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoFisicoFactura();
		
			int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadofisicofacturaValidator.getInvalidValues(this.estadofisicofactura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadofisicofacturaLogic.setDatosCliente(datosCliente);
			estadofisicofacturaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadofisicofacturaAux=new  EstadoFisicoFactura();
				
				estadofisicofacturaAux.setIsNew(true);
				estadofisicofacturaAux.setIsChanged(true);
				
				estadofisicofacturaAux.setEstadoFisicoFacturaOriginal(this.estadofisicofactura);
				
				estadofisicofacturaAux.setId(this.estadofisicofactura.getId());	
				estadofisicofacturaAux.setVersionRow(this.estadofisicofactura.getVersionRow());	
				estadofisicofacturaAux.setid_pais(this.estadofisicofactura.getid_pais());	
				estadofisicofacturaAux.setnombre(this.estadofisicofactura.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofisicofacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadofisicofacturaAux,estadofisicofacturaLogic.getEstadoFisicoFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaAux,estadofisicofacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaLogic.saveEstadoFisicoFacturas();//WithConnection
						//estadofisicofacturaLogic.getSetVersionRowEstadoFisicoFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofisicofactura,estadofisicofacturaAux);
					
					this.refrescarForeignKeysDescripcionesEstadoFisicoFactura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadofisicofacturaAux=new  EstadoFisicoFactura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado() 
					|| (this.estadofisicofacturaSessionBean.getEsGuardarRelacionado() && this.estadofisicofactura.getId()>=0)) {
						
					estadofisicofacturaAux.setIsNew(false);
				}
				
				estadofisicofacturaAux.setIsDeleted(false);
			
				estadofisicofacturaAux.setId(this.estadofisicofactura.getId());	
				estadofisicofacturaAux.setVersionRow(this.estadofisicofactura.getVersionRow());	
				estadofisicofacturaAux.setid_pais(this.estadofisicofactura.getid_pais());	
				estadofisicofacturaAux.setnombre(this.estadofisicofactura.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofisicofacturaAux,estadofisicofacturaLogic.getEstadoFisicoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaAux,estadofisicofacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaLogic.saveEstadoFisicoFacturas();//WithConnection
						//estadofisicofacturaLogic.getSetVersionRowEstadoFisicoFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadofisicofactura,estadofisicofacturaAux);
					
					this.refrescarForeignKeysDescripcionesEstadoFisicoFactura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadofisicofacturaAux=new  EstadoFisicoFactura();
				
				estadofisicofacturaAux.setIsNew(false);
				estadofisicofacturaAux.setIsChanged(false);
				
				estadofisicofacturaAux.setIsDeleted(true);
				
				estadofisicofacturaAux.setId(this.estadofisicofactura.getId());	
				estadofisicofacturaAux.setVersionRow(this.estadofisicofactura.getVersionRow());	
				estadofisicofacturaAux.setid_pais(this.estadofisicofactura.getid_pais());	
				estadofisicofacturaAux.setnombre(this.estadofisicofactura.getnombre());	
				
				if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadofisicofacturaAux.getId()>=0) {	
						this.estadofisicofacturasEliminados.add(estadofisicofacturaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadofisicofacturaAux,estadofisicofacturaLogic.getEstadoFisicoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaAux,estadofisicofacturas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaLogic.saveEstadoFisicoFacturas();//WithConnection
						//estadofisicofacturaLogic.getSetVersionRowEstadoFisicoFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadofisicofacturaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadofisicofacturaAux,estadofisicofacturaLogic.getEstadoFisicoFacturas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadofisicofacturaAux,estadofisicofacturas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.getEstadoFisicoFacturas().addAll(this.estadofisicofacturasEliminados);
					
					estadofisicofacturaLogic.saveEstadoFisicoFacturas();//WithConnection
					//estadofisicofacturaLogic.getSetVersionRowEstadoFisicoFacturas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEstadoFisicoFactura();
				
				this.estadofisicofacturasEliminados= new ArrayList<EstadoFisicoFactura>();		
			}
			
			if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Fisico Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadofisicofactura=estadofisicofacturaAux;
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
      		//this.finishProcessEstadoFisicoFactura();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoFisicoFactura estadofisicofacturaLocal) throws Exception {
		
		if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoFisicoFactura estadofisicofacturaLocal) throws Exception {	
		if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				estadofisicofacturaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadoFisicoFacturaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadofisicofacturaValidator.getInvalidValues(this.estadofisicofactura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoFisicoFactura estadofisicofactura,List<EstadoFisicoFactura> estadofisicofacturas) throws Exception {
		try	{		
			EstadoFisicoFacturaConstantesFunciones.actualizarLista(estadofisicofactura,estadofisicofacturas,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoFisicoFactura estadofisicofactura,List<EstadoFisicoFactura> estadofisicofacturas) throws Exception {
		try	{			
			EstadoFisicoFacturaConstantesFunciones.actualizarSelectedLista(estadofisicofactura,estadofisicofacturas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoFisicoFactura> estadofisicofacturasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadofisicofacturasLocal=this.estadofisicofacturaLogic.getEstadoFisicoFacturas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadofisicofacturasLocal=this.estadofisicofacturas;
			}
			//ARCHITECTURE
		
			for(EstadoFisicoFactura estadofisicofacturaLocal:estadofisicofacturasLocal) {
				if(this.permiteMantenimiento(estadofisicofacturaLocal) && estadofisicofacturaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoFisicoFacturaConstantesFunciones.getEstadoFisicoFacturaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoFisicoFacturaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFactura.jLabelid_paisEstadoFisicoFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoFisicoFacturaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFactura.jLabelnombreEstadoFisicoFactura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFisicoFactura.jLabelid_paisEstadoFisicoFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoFisicoFactura.jLabelnombreEstadoFisicoFactura,"");
		
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
		this.iIdNuevoEstadoFisicoFactura--;	
		
		
		this.estadofisicofacturaAux=new EstadoFisicoFactura();
		
		this.estadofisicofacturaAux.setId(this.iIdNuevoEstadoFisicoFactura);
		this.estadofisicofacturaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadofisicofacturaLogic.getEstadoFisicoFacturas().add(this.estadofisicofacturaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadofisicofacturas.add(this.estadofisicofacturaAux);
		}
		//ARCHITECTURE
		
		this.estadofisicofactura=this.estadofisicofacturaAux;
		
		if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofactura);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFactura(this.estadofisicofactura);
		}
				
		//this.setDefaultControlesEstadoFisicoFactura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoFisicoFactura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoFisicoFactura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFisicoFactura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFisicoFactura(this.estadofisicofacturaBean,this.estadofisicofactura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
			classes=EstadoFisicoFacturaConstantesFunciones.getClassesRelationshipsOfEstadoFisicoFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadofisicofacturaReturnGeneral=estadofisicofacturaLogic.procesarEventosEstadoFisicoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofisicofacturaLogic.getEstadoFisicoFacturas(),this.estadofisicofactura,this.estadofisicofacturaParameterGeneral,this.isEsNuevoEstadoFisicoFactura,classes);//this.estadofisicofacturaLogic.getEstadoFisicoFactura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral,this.estadofisicofacturaBean,false);
		
		if(this.estadofisicofacturaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura());
		}
		
		if(this.estadofisicofacturaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura(),classes);//this.estadofisicofacturaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoFisicoFactura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoFisicoFactura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
						
			if(estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFisicoFactura();
			}
			
			this.actualizarVisualTableDatosEstadoFisicoFactura();
			
			this.jTableDatosEstadoFisicoFactura.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFactura(), this.getIndiceNuevoEstadoFisicoFactura());
			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
						
			this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoFisicoFactura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setEnabled(isHabilitar && this.estadofisicofacturaConstantesFunciones.activarnombreEstadoFisicoFactura);	
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setEnabled(isHabilitar && this.estadofisicofacturaConstantesFunciones.activarid_paisEstadoFisicoFactura);
	};
	
	public void setDefaultControlesEstadoFisicoFactura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoFisicoFactura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadofisicofacturaSessionBean.setConGuardarRelaciones(true);			
			this.estadofisicofacturaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.setVisible(true);
			
					
		} else {
			//this.estadofisicofacturaSessionBean.setConGuardarRelaciones(false);			
			this.estadofisicofacturaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoFisicoFactura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
				if(estadofisicofacturaAux.getId().equals(this.iIdNuevoEstadoFisicoFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturas) {
				if(estadofisicofacturaAux.getId().equals(this.iIdNuevoEstadoFisicoFactura)) {
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
	
	public int getIndiceActualEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
				if(estadofisicofacturaAux.getId().equals(estadofisicofactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturas) {
				if(estadofisicofacturaAux.getId().equals(estadofisicofactura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoFisicoFactura(EstadoFisicoFactura estadofisicofacturaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
				if(estadofisicofacturaAux.getEstadoFisicoFacturaOriginal().getId().equals(estadofisicofacturaOriginal.getId())) {
					existe=true;
					estadofisicofacturaOriginal.setId(estadofisicofacturaAux.getId());
					estadofisicofacturaOriginal.setVersionRow(estadofisicofacturaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturas) {
				if(estadofisicofacturaAux.getEstadoFisicoFacturaOriginal().getId().equals(estadofisicofacturaOriginal.getId())) {
					existe=true;
					estadofisicofacturaOriginal.setId(estadofisicofacturaAux.getId());
					estadofisicofacturaOriginal.setVersionRow(estadofisicofacturaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoFisicoFactura(Boolean esParaCancelar) throws Exception {
		estadofisicofacturasAux=new ArrayList<EstadoFisicoFactura>();
		estadofisicofacturaAux=new EstadoFisicoFactura();
		
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
					if(estadofisicofacturaAux.getId()<0) {
						estadofisicofacturasAux.add(estadofisicofacturaAux);
					}		
				}
				this.iIdNuevoEstadoFisicoFactura=0L;
				this.estadofisicofacturaLogic.getEstadoFisicoFacturas().removeAll(estadofisicofacturasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturas) {
					if(estadofisicofacturaAux.getId()<0) {
						estadofisicofacturasAux.add(estadofisicofacturaAux);
					}		
				}
				this.iIdNuevoEstadoFisicoFactura=0L;
				this.estadofisicofacturas.removeAll(estadofisicofacturasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoFisicoFactura 
					&& this.estadofisicofacturaLogic.getEstadoFisicoFacturas().size()>0
					) {
					estadofisicofacturaAux=this.estadofisicofacturaLogic.getEstadoFisicoFacturas().get(this.estadofisicofacturaLogic.getEstadoFisicoFacturas().size() - 1);
				
					if(estadofisicofacturaAux.getId()<0) {
						this.estadofisicofacturaLogic.getEstadoFisicoFacturas().remove(estadofisicofacturaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoFisicoFactura && this.estadofisicofacturas.size()>0) {
					estadofisicofacturaAux=this.estadofisicofacturas.get(this.estadofisicofacturas.size() - 1);
				
					if(estadofisicofacturaAux.getId()<0) {
						this.estadofisicofacturas.remove(estadofisicofacturaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoFisicoFactura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadofisicofactura.getId()<0) {
				this.estadofisicofacturaLogic.getEstadoFisicoFacturas().remove(this.estadofisicofactura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadofisicofactura.getId()<0) {
				this.estadofisicofacturas.remove(this.estadofisicofactura);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoFisicoFactura(List<EstadoFisicoFactura> estadofisicofacturasAux) throws Exception {
		EstadoFisicoFacturaConstantesFunciones.setEstadosInicialesEstadoFisicoFactura(estadofisicofacturasAux);
	}
	
	public void setEstadosInicialesEstadoFisicoFactura(EstadoFisicoFactura estadofisicofacturaAux) throws Exception {
		EstadoFisicoFacturaConstantesFunciones.setEstadosInicialesEstadoFisicoFactura(estadofisicofacturaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoFisicoFacturaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoFisicoFacturaActual()) {
				if(!this.isEsNuevoEstadoFisicoFactura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoFisicoFactura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoFisicoFacturaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Fisico Factura ?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoFisicoFactura estadofisicofactura) throws Exception {
		EstadoFisicoFacturaConstantesFunciones.seleccionarAsignar(this.estadofisicofactura,estadofisicofactura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoFisicoFactura=this.isPermisoActualizarOriginalEstadoFisicoFactura;
			
			
			this.seleccionarAsignar(estadofisicofactura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoFisicoFacturaConstantesFunciones.quitarEspaciosEstadoFisicoFactura(this.estadofisicofactura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadofisicofacturaSessionBean.setsFuncionBusquedaRapida(this.estadofisicofacturaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoFisicoFactura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoFisicoFactura(esParaCancelar);				
				this.cancelarNuevoEstadoFisicoFactura(esParaCancelar);								
			}
			
			this.estadofisicofactura=new EstadoFisicoFactura();
			
			this.inicializarEstadoFisicoFactura();
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoFisicoFactura() throws Exception {
		try {
			EstadoFisicoFacturaConstantesFunciones.inicializarEstadoFisicoFactura(this.estadofisicofactura);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadofisicofacturaLogic.getEstadoFisicoFacturas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoFisicoFacturas(String sAccionBusqueda,List<EstadoFisicoFactura> estadofisicofacturasParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoFisicoFactura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoFisicoFacturaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoFisicoFacturaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoFisicoFactura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Fisico Facturas");		
		parameters.put("busquedapor", EstadoFisicoFacturaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoFisicoFactura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoFisicoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoFisicoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoFisicoFactura=new JRBeanArrayDataSource(EstadoFisicoFacturaJInternalFrame.TraerEstadoFisicoFacturaBeans(estadofisicofacturasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoFisicoFactura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoFisicoFacturaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoFisicoFacturaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoFisicoFacturaBean.TraerEstadoFisicoFacturaBeans(estadofisicofacturasParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoFisicoFacturas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoFisicoFacturas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaActionPerformed(null);
					//this.generarExcelReporteEstadoFisicoFacturas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoFisicoFacturas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoFisicoFacturas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoFisicoFacturas(sAccionBusqueda,sTipoArchivoReporte,estadofisicofacturasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoFisicoFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFisicoFactura> estadofisicofacturasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFisicoFacturas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFisicoFactura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoFisicoFactura estadofisicofactura : estadofisicofacturasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoFisicoFacturaConstantesFunciones.generarExcelReporteDataEstadoFisicoFactura("NORMAL",row,workbook,estadofisicofactura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoFisicoFactura(String sTipo,Row row,Workbook workbook) {
		
		EstadoFisicoFacturaConstantesFunciones.generarExcelReporteHeaderEstadoFisicoFactura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoFisicoFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFisicoFactura> estadofisicofacturasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFisicoFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoFisicoFactura estadofisicofactura : estadofisicofacturasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.getEstadoFisicoFacturaDescripcion(estadofisicofactura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofisicofactura.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadofisicofactura.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoFisicoFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoFisicoFactura> estadofisicofacturasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoFisicoFactura> estadofisicofacturasRespaldo=null;
		
		classes=EstadoFisicoFacturaConstantesFunciones.getClassesRelationshipsOfEstadoFisicoFactura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadofisicofacturaLogic.setDatosCliente(this.datosCliente);
		this.estadofisicofacturaLogic.setDatosDeep(this.datosDeep);
		this.estadofisicofacturaLogic.setIsConDeep(true);
		
		estadofisicofacturasRespaldo=this.estadofisicofacturaLogic.getEstadoFisicoFacturas();
		
		this.estadofisicofacturaLogic.setEstadoFisicoFacturas(estadofisicofacturasParaReportes);	
		this.estadofisicofacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadofisicofacturasParaReportes=this.estadofisicofacturaLogic.getEstadoFisicoFacturas();
		this.estadofisicofacturaLogic.setEstadoFisicoFacturas(estadofisicofacturasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoFisicoFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoFisicoFactura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoFisicoFactura estadofisicofactura : estadofisicofacturasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoFisicoFactura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoFisicoFacturaConstantesFunciones.generarExcelReporteDataEstadoFisicoFactura("NORMAL",row,workbook,estadofisicofactura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.getEstadoFisicoFacturaDescripcion(estadofisicofactura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoFisicoFactura() throws Exception {		
		this.startProcessEstadoFisicoFactura(true);
	}
	
	public void startProcessEstadoFisicoFactura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadoFisicoFactura ,this.jPanelParametrosReportesEstadoFisicoFactura, this.jScrollPanelDatosEstadoFisicoFactura,this.jPanelPaginacionEstadoFisicoFactura, this.jScrollPanelDatosEdicionEstadoFisicoFactura, this.jPanelAccionesEstadoFisicoFactura,this.jPanelAccionesFormularioEstadoFisicoFactura,this.jmenuBarEstadoFisicoFactura,this.jmenuBarDetalleEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,this.jTtoolBarDetalleEstadoFisicoFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFisicoFactura=this.jTabbedPaneBusquedasEstadoFisicoFactura; 
		
		final JPanel jPanelParametrosReportesEstadoFisicoFactura=this.jPanelParametrosReportesEstadoFisicoFactura;
		//final JScrollPane jScrollPanelDatosEstadoFisicoFactura=this.jScrollPanelDatosEstadoFisicoFactura;
		final JTable jTableDatosEstadoFisicoFactura=this.jTableDatosEstadoFisicoFactura;		
		final JPanel jPanelPaginacionEstadoFisicoFactura=this.jPanelPaginacionEstadoFisicoFactura;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFisicoFactura=this.jScrollPanelDatosEdicionEstadoFisicoFactura;
		final JPanel jPanelAccionesEstadoFisicoFactura=this.jPanelAccionesEstadoFisicoFactura;
		
		JPanel jPanelCamposAuxiliarEstadoFisicoFactura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFisicoFactura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			jPanelCamposAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelCamposEstadoFisicoFactura;
			jPanelAccionesFormularioAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelAccionesFormularioEstadoFisicoFactura;
		}
		
		final JPanel jPanelCamposEstadoFisicoFactura=jPanelCamposAuxiliarEstadoFisicoFactura;
		final JPanel jPanelAccionesFormularioEstadoFisicoFactura=jPanelAccionesFormularioAuxiliarEstadoFisicoFactura;
		
		
		final JMenuBar jmenuBarEstadoFisicoFactura=this.jmenuBarEstadoFisicoFactura;
		final JToolBar jTtoolBarEstadoFisicoFactura=this.jTtoolBarEstadoFisicoFactura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoFisicoFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFisicoFactura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			jmenuBarDetalleAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jmenuBarDetalleEstadoFisicoFactura;
			jTtoolBarDetalleAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jTtoolBarDetalleEstadoFisicoFactura;
		}
		
		final JMenuBar jmenuBarDetalleEstadoFisicoFactura=jmenuBarDetalleAuxiliarEstadoFisicoFactura;
		final JToolBar jTtoolBarDetalleEstadoFisicoFactura=jTtoolBarDetalleAuxiliarEstadoFisicoFactura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFisicoFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFisicoFactura;
			processRunnable.jTableDatos=jTableDatosEstadoFisicoFactura;
			processRunnable.jPanelCampos=jPanelCamposEstadoFisicoFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFisicoFactura;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFisicoFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFisicoFactura;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFisicoFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFisicoFactura;
			processRunnable.jTtoolBar=jTtoolBarEstadoFisicoFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFisicoFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoFisicoFactura ,jPanelParametrosReportesEstadoFisicoFactura,jTableDatosEstadoFisicoFactura, /*jScrollPanelDatosEstadoFisicoFactura,*/jPanelCamposEstadoFisicoFactura,jPanelPaginacionEstadoFisicoFactura, /*jScrollPanelDatosEdicionEstadoFisicoFactura,*/ jPanelAccionesEstadoFisicoFactura,jPanelAccionesFormularioEstadoFisicoFactura,jmenuBarEstadoFisicoFactura,jmenuBarDetalleEstadoFisicoFactura,jTtoolBarEstadoFisicoFactura,jTtoolBarDetalleEstadoFisicoFactura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoFisicoFactura ,jPanelParametrosReportesEstadoFisicoFactura, jScrollPanelDatosEstadoFisicoFactura,jPanelPaginacionEstadoFisicoFactura, jScrollPanelDatosEdicionEstadoFisicoFactura, jPanelAccionesEstadoFisicoFactura,jPanelAccionesFormularioEstadoFisicoFactura,jmenuBarEstadoFisicoFactura,jmenuBarDetalleEstadoFisicoFactura,jTtoolBarEstadoFisicoFactura,jTtoolBarDetalleEstadoFisicoFactura);
						
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
	
	public void finishProcessEstadoFisicoFactura() {// throws Exception 
		this.finishProcessEstadoFisicoFactura(true);
	}
	
	public void finishProcessEstadoFisicoFactura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadoFisicoFactura ,this.jPanelParametrosReportesEstadoFisicoFactura, this.jScrollPanelDatosEstadoFisicoFactura,this.jPanelPaginacionEstadoFisicoFactura, this.jScrollPanelDatosEdicionEstadoFisicoFactura, this.jPanelAccionesEstadoFisicoFactura,this.jPanelAccionesFormularioEstadoFisicoFactura,this.jmenuBarEstadoFisicoFactura,this.jmenuBarDetalleEstadoFisicoFactura,this.jTtoolBarEstadoFisicoFactura,this.jTtoolBarDetalleEstadoFisicoFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoFisicoFactura=this.jTabbedPaneBusquedasEstadoFisicoFactura; 
		
		final JPanel jPanelParametrosReportesEstadoFisicoFactura=this.jPanelParametrosReportesEstadoFisicoFactura;
		//final JScrollPane jScrollPanelDatosEstadoFisicoFactura=this.jScrollPanelDatosEstadoFisicoFactura;
		final JTable jTableDatosEstadoFisicoFactura=this.jTableDatosEstadoFisicoFactura;		
		final JPanel jPanelPaginacionEstadoFisicoFactura=this.jPanelPaginacionEstadoFisicoFactura;
		//final JScrollPane jScrollPanelDatosEdicionEstadoFisicoFactura=this.jScrollPanelDatosEdicionEstadoFisicoFactura;
		final JPanel jPanelAccionesEstadoFisicoFactura=this.jPanelAccionesEstadoFisicoFactura;
		
		JPanel jPanelCamposAuxiliarEstadoFisicoFactura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoFisicoFactura=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			jPanelCamposAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelCamposEstadoFisicoFactura;
			jPanelAccionesFormularioAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelAccionesFormularioEstadoFisicoFactura;
		}
		
		final JPanel jPanelCamposEstadoFisicoFactura=jPanelCamposAuxiliarEstadoFisicoFactura;
		final JPanel jPanelAccionesFormularioEstadoFisicoFactura=jPanelAccionesFormularioAuxiliarEstadoFisicoFactura;
		
		
		final JMenuBar jmenuBarEstadoFisicoFactura=this.jmenuBarEstadoFisicoFactura;		
		final JToolBar jTtoolBarEstadoFisicoFactura=this.jTtoolBarEstadoFisicoFactura;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoFisicoFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoFisicoFactura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			jmenuBarDetalleAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jmenuBarDetalleEstadoFisicoFactura;
			jTtoolBarDetalleAuxiliarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jTtoolBarDetalleEstadoFisicoFactura;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoFisicoFactura=jmenuBarDetalleAuxiliarEstadoFisicoFactura;
		final JToolBar jTtoolBarDetalleEstadoFisicoFactura=jTtoolBarDetalleAuxiliarEstadoFisicoFactura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoFisicoFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoFisicoFactura;
			processRunnable.jTableDatos=jTableDatosEstadoFisicoFactura;
			processRunnable.jPanelCampos=jPanelCamposEstadoFisicoFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoFisicoFactura;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoFisicoFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoFisicoFactura;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoFisicoFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoFisicoFactura;
			processRunnable.jTtoolBar=jTtoolBarEstadoFisicoFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoFisicoFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoFisicoFactura ,jPanelParametrosReportesEstadoFisicoFactura, jTableDatosEstadoFisicoFactura,/*jScrollPanelDatosEstadoFisicoFactura,*/jPanelCamposEstadoFisicoFactura,jPanelPaginacionEstadoFisicoFactura, /*jScrollPanelDatosEdicionEstadoFisicoFactura,*/ jPanelAccionesEstadoFisicoFactura,jPanelAccionesFormularioEstadoFisicoFactura,jmenuBarEstadoFisicoFactura,jmenuBarDetalleEstadoFisicoFactura,jTtoolBarEstadoFisicoFactura,jTtoolBarDetalleEstadoFisicoFactura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoFisicoFactura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoFisicoFactura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoFisicoFactura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoFisicoFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoFisicoFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoFisicoFactura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoFisicoFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoFisicoFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoFisicoFactura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadofisicofacturaConstantesFunciones.getsFinalQueryEstadoFisicoFactura();
		String  finalQueryPaginacionTodos=this.estadofisicofacturaConstantesFunciones.getsFinalQueryEstadoFisicoFactura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoFisicoFacturaConstantesFunciones.getArrayColumnasGlobalesNoEstadoFisicoFactura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoFisicoFacturaConstantesFunciones.getArrayColumnasGlobalesEstadoFisicoFactura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoFisicoFacturaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadofisicofacturasEliminados= new ArrayList<EstadoFisicoFactura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoFisicoFactura();
		
				///*EstadoFisicoFacturaSessionBean*/this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
			
			if(this.estadofisicofacturaSessionBean==null) {
				this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
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
					this.iNumeroPaginacion=EstadoFisicoFacturaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoFisicoFacturaConstantesFunciones.getClassesForeignKeysOfEstadoFisicoFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadofisicofactura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadofisicofacturasAux= new ArrayList<EstadoFisicoFactura>();
			
				
			estadofisicofacturaLogic.setDatosCliente(this.datosCliente);
			estadofisicofacturaLogic.setDatosDeep(this.datosDeep);
			estadofisicofacturaLogic.setIsConDeep(true);
			
			
			estadofisicofacturaLogic.getEstadoFisicoFacturaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadofisicofacturaLogic.getTodosEstadoFisicoFacturas(finalQueryGlobal,pagination);
					
					//estadofisicofacturaLogic.getTodosEstadoFisicoFacturasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadofisicofacturaLogic.getEstadoFisicoFacturas()==null|| estadofisicofacturaLogic.getEstadoFisicoFacturas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofisicofacturasAux= new ArrayList<EstadoFisicoFactura>();
							estadofisicofacturasAux.addAll(estadofisicofacturaLogic.getEstadoFisicoFacturas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturasAux= new ArrayList<EstadoFisicoFactura>();
							estadofisicofacturasAux.addAll(estadofisicofacturas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofisicofacturaLogic.getTodosEstadoFisicoFacturas(finalQueryGlobal+"",this.pagination);												
							
							//estadofisicofacturaLogic.getTodosEstadoFisicoFacturasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturaLogic.getEstadoFisicoFacturas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadofisicofacturaLogic.setEstadoFisicoFacturas(new ArrayList<EstadoFisicoFactura>());					
							estadofisicofacturaLogic.getEstadoFisicoFacturas().addAll(estadofisicofacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturas=new ArrayList<EstadoFisicoFactura>();
							estadofisicofacturas.addAll(estadofisicofacturasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoFisicoFactura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoFisicoFactura=this.idActual;
				
				} else if(this.idEstadoFisicoFacturaActual!=null && this.idEstadoFisicoFacturaActual!=0L) {
					idEstadoFisicoFactura=idEstadoFisicoFacturaActual;
				}
				
					
				this.sDetalleReporte=EstadoFisicoFacturaConstantesFunciones.getDetalleIndicePorId(idEstadoFisicoFactura);
				
				this.estadofisicofacturas=new ArrayList<EstadoFisicoFactura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadofisicofacturaLogic.getEntity(idEstadoFisicoFactura);
					
					//estadofisicofacturaLogic.getEntityWithConnection(idEstadoFisicoFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaLogic.setEstadoFisicoFacturas(new ArrayList<EstadoFisicoFactura>());
					estadofisicofacturaLogic.getEstadoFisicoFacturas().add(estadofisicofacturaLogic.getEstadoFisicoFactura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofisicofacturas=new ArrayList<EstadoFisicoFactura>();
					this.estadofisicofacturas.add(estadofisicofactura);
				}
				
				if(estadofisicofacturaLogic.getEstadoFisicoFactura()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=EstadoFisicoFacturaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadofisicofacturaLogic.getEstadoFisicoFacturasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoFisicoFacturaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoFisicoFacturaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadofisicofacturaLogic.getEstadoFisicoFacturas()==null||estadofisicofacturaLogic.getEstadoFisicoFacturas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadofisicofacturas==null|| estadofisicofacturas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturasAux=new ArrayList<EstadoFisicoFactura>();
						estadofisicofacturasAux.addAll(estadofisicofacturaLogic.getEstadoFisicoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturasAux=new ArrayList<EstadoFisicoFactura>();
							estadofisicofacturasAux.addAll(estadofisicofacturas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadofisicofacturaLogic.getEstadoFisicoFacturasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadoFisicoFacturaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadoFisicoFacturaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadoFisicoFacturas("FK_IdPais",estadofisicofacturaLogic.getEstadoFisicoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadoFisicoFacturas("FK_IdPais",estadofisicofacturas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaLogic.setEstadoFisicoFacturas(new ArrayList<EstadoFisicoFactura>());
						estadofisicofacturaLogic.getEstadoFisicoFacturas().addAll(estadofisicofacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturas=new ArrayList<EstadoFisicoFactura>();
							estadofisicofacturas.addAll(estadofisicofacturasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoFisicoFactura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoFisicoFactura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofisicofacturaLogic.getEstadoFisicoFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofisicofacturas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadofisicofacturaLogic.getEstadoFisicoFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadofisicofacturas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoFisicoFactura estadofisicofactura) {
		Boolean permite=true;
		
		if(this.estadofisicofactura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoFisicoFacturaConstantesFunciones.getOrderByListaEstadoFisicoFactura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoFisicoFacturaConstantesFunciones.getOrderByListaEstadoFisicoFactura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFactura estadofisicofactura:estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
				if(estadofisicofactura.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaTotales=estadofisicofactura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFactura estadofisicofactura:this.estadofisicofacturas) {
				if(estadofisicofactura.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaTotales=estadofisicofactura;
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
			this.estadofisicofacturaAux=new EstadoFisicoFactura();
			this.estadofisicofacturaAux.setsType(Constantes2.S_TOTALES);
			this.estadofisicofacturaAux.setIsNew(false);
			this.estadofisicofacturaAux.setIsChanged(false);
			this.estadofisicofacturaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoFisicoFacturaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFactura(this.estadofisicofacturaLogic.getEstadoFisicoFacturas(),this.estadofisicofacturaAux);
				
				this.estadofisicofacturaLogic.getEstadoFisicoFacturas().add(this.estadofisicofacturaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoFisicoFacturaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFactura(this.estadofisicofacturas,this.estadofisicofacturaAux);
				
				this.estadofisicofacturas.add(this.estadofisicofacturaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadofisicofacturaTotales=new EstadoFisicoFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofisicofacturaLogic.getEstadoFisicoFacturas().remove(estadofisicofacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadofisicofacturas.remove(estadofisicofacturaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadofisicofacturaTotales=new EstadoFisicoFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoFisicoFactura estadofisicofactura:estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
				if(estadofisicofactura.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaTotales=estadofisicofactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFisicoFacturaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFactura(this.estadofisicofacturaLogic.getEstadoFisicoFacturas(),estadofisicofacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoFisicoFactura estadofisicofactura:this.estadofisicofacturas) {
				if(estadofisicofactura.getsType().equals(Constantes2.S_TOTALES)) {
					estadofisicofacturaTotales=estadofisicofactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoFisicoFacturaConstantesFunciones.TotalizarValoresFilaEstadoFisicoFactura(this.estadofisicofacturas,estadofisicofacturaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoFisicoFacturasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadoFisicoFacturaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoFisicoFacturasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaLogic.getEstadoFisicoFacturasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadoFisicoFacturaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaLogic.getEstadoFisicoFacturaPorNombre(nombre);
				
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
	
	public void inicializarPermisosEstadoFisicoFactura() {
		this.isPermisoTodoEstadoFisicoFactura=false;
		this.isPermisoNuevoEstadoFisicoFactura=false;
		this.isPermisoActualizarEstadoFisicoFactura=false;
		this.isPermisoActualizarOriginalEstadoFisicoFactura=false;
		this.isPermisoEliminarEstadoFisicoFactura=false;
		this.isPermisoGuardarCambiosEstadoFisicoFactura=false;
		this.isPermisoConsultaEstadoFisicoFactura=false;
		this.isPermisoBusquedaEstadoFisicoFactura=false;
		this.isPermisoReporteEstadoFisicoFactura=false;		
		this.isPermisoOrdenEstadoFisicoFactura=false;		
		this.isPermisoPaginacionMedioEstadoFisicoFactura=false;		
		this.isPermisoPaginacionAltoEstadoFisicoFactura=false;
		this.isPermisoPaginacionTodoEstadoFisicoFactura=false;
		this.isPermisoCopiarEstadoFisicoFactura=false;		
		this.isPermisoVerFormEstadoFisicoFactura=false;		
		this.isPermisoDuplicarEstadoFisicoFactura=false;		
		this.isPermisoOrdenEstadoFisicoFactura=false;		
	}
	
	public void setPermisosUsuarioEstadoFisicoFactura(Boolean isPermiso) {
		this.isPermisoTodoEstadoFisicoFactura=isPermiso;
		this.isPermisoNuevoEstadoFisicoFactura=isPermiso;
		this.isPermisoActualizarEstadoFisicoFactura=isPermiso;
		this.isPermisoActualizarOriginalEstadoFisicoFactura=isPermiso;
		this.isPermisoEliminarEstadoFisicoFactura=isPermiso;
		this.isPermisoGuardarCambiosEstadoFisicoFactura=isPermiso;
		this.isPermisoConsultaEstadoFisicoFactura=isPermiso;
		this.isPermisoBusquedaEstadoFisicoFactura=isPermiso;
		this.isPermisoReporteEstadoFisicoFactura=isPermiso;
		this.isPermisoOrdenEstadoFisicoFactura=isPermiso;		
		this.isPermisoPaginacionMedioEstadoFisicoFactura=isPermiso;		
		this.isPermisoPaginacionAltoEstadoFisicoFactura=isPermiso;		
		this.isPermisoPaginacionTodoEstadoFisicoFactura=isPermiso;		
		this.isPermisoCopiarEstadoFisicoFactura=isPermiso;		
		this.isPermisoVerFormEstadoFisicoFactura=isPermiso;		
		this.isPermisoDuplicarEstadoFisicoFactura=isPermiso;
		this.isPermisoOrdenEstadoFisicoFactura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoFisicoFactura(Boolean isPermiso) {
		//this.isPermisoTodoEstadoFisicoFactura=isPermiso;
		this.isPermisoNuevoEstadoFisicoFactura=isPermiso;
		this.isPermisoActualizarEstadoFisicoFactura=isPermiso;
		this.isPermisoActualizarOriginalEstadoFisicoFactura=isPermiso;
		this.isPermisoEliminarEstadoFisicoFactura=isPermiso;
		this.isPermisoGuardarCambiosEstadoFisicoFactura=isPermiso;
		//this.isPermisoConsultaEstadoFisicoFactura=isPermiso;
		//this.isPermisoBusquedaEstadoFisicoFactura=isPermiso;
		//this.isPermisoReporteEstadoFisicoFactura=isPermiso;
		//this.isPermisoOrdenEstadoFisicoFactura=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoFisicoFactura=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoFisicoFactura=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoFisicoFactura=isPermiso;		
		//this.isPermisoCopiarEstadoFisicoFactura=isPermiso;		
		//this.isPermisoDuplicarEstadoFisicoFactura=isPermiso;
		//this.isPermisoOrdenEstadoFisicoFactura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFisicoFacturaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoFisicoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoFisicoFactura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoFisicoFacturaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoFisicoFacturaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoFisicoFacturaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoFisicoFacturaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoFisicoFactura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoFisicoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoFisicoFacturaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoFisicoFactura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoFisicoFactura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoFisicoFactura=this.isPermisoActualizarEstadoFisicoFactura;
			this.isPermisoEliminarEstadoFisicoFactura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoFisicoFactura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoFisicoFactura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoFisicoFactura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoFisicoFactura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoFisicoFactura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFisicoFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoFisicoFactura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoFisicoFactura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoFisicoFactura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoFisicoFactura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoFisicoFactura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoFisicoFactura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoFisicoFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoFisicoFactura.setToolTipText(this.jTableDatosEstadoFisicoFactura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoFisicoFactura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoFisicoFactura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoFisicoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoFisicoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoFisicoFactura() throws Exception {
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
	public void inicializarCombosForeignKeyEstadoFisicoFacturaListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoFisicoFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoFisicoFacturaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoFisicoFacturaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEstadoFisicoFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaReturnGeneral=new EstadoFisicoFacturaParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.estadofisicofacturaConstantesFunciones.cargarid_paisEstadoFisicoFactura)
					 || (this.esRecargarFks && this.estadofisicofacturaConstantesFunciones.cargarid_paisEstadoFisicoFactura)) {

					if(!this.estadofisicofacturaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+estadofisicofacturaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				estadofisicofacturaReturnGeneral=estadofisicofacturaLogic.cargarCombosLoteForeignKeyEstadoFisicoFactura(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=estadofisicofacturaReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoFisicoFactura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.estadofisicofacturaSessionBean==null) {
				this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
			}

			if(!this.estadofisicofacturaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEstadoFisicoFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoFisicoFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoFisicoFactura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFisicoFactura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(estadofisicofactura.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoFisicoFactura()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.estadofisicofacturaConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoFisicoFactura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoFisicoFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoFisicoFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoFisicoFactura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoFisicoFactura()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoFisicoFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoFisicoFactura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura!=null && this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public EstadoFisicoFacturaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoFisicoFacturaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoFisicoFacturaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean(); 
		this.estadofisicofacturaConstantesFunciones=new EstadoFisicoFacturaConstantesFunciones(); 
		this.estadofisicofacturaBean=new EstadoFisicoFactura();//(this.estadofisicofacturaConstantesFunciones); 		
		this.estadofisicofacturaReturnGeneral=new EstadoFisicoFacturaParameterReturnGeneral(); 
		
		this.estadofisicofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofisicofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoFisicoFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoFisicoFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoFisicoFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoFisicoFactura(true);
			
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
			
			this.estadofisicofacturaConstantesFunciones=new EstadoFisicoFacturaConstantesFunciones(); 
			this.estadofisicofacturaBean=new EstadoFisicoFactura();//this.estadofisicofacturaConstantesFunciones); 			
			this.estadofisicofacturaReturnGeneral=new EstadoFisicoFacturaParameterReturnGeneral(); 
		
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Fisico Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadofisicofactura=new EstadoFisicoFactura();
			this.estadofisicofacturas = new ArrayList<EstadoFisicoFactura>();
			this.estadofisicofacturasAux = new ArrayList<EstadoFisicoFactura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic=new EstadoFisicoFacturaLogic();
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estadofisicofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadofisicofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoFisicoFactura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFisicoFactura);	
					}
					
					if(this.jInternalFrameImportacionEstadoFisicoFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFisicoFactura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoFisicoFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoFisicoFactura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFisicoFactura);
				this.jInternalFrameDetalleFormEstadoFisicoFactura.setVisible(false);
				this.jInternalFrameDetalleFormEstadoFisicoFactura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFisicoFactura);
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoFisicoFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFisicoFactura);
					this.jInternalFrameImportacionEstadoFisicoFactura.setVisible(false);
					this.jInternalFrameImportacionEstadoFisicoFactura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoFisicoFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFisicoFactura);
					this.jInternalFrameOrderByEstadoFisicoFactura.setVisible(false);
					this.jInternalFrameOrderByEstadoFisicoFactura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoFisicoFacturaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoFisicoFacturaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadofisicofacturaReturnGeneral=new EstadoFisicoFacturaParameterReturnGeneral();
			
			this.estadofisicofacturaParameterGeneral=new EstadoFisicoFacturaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadofisicofacturaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoFisicoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFisicoFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado(),this.estadofisicofacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoFisicoFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado(),this.estadofisicofacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaDuplicarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaCopiarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaVerFormEstadoFisicoFactura=true;
			this.isVisibilidadCeldaOrdenEstadoFisicoFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoFisicoFactura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoFisicoFactura(false);
			
			this.setPermisosUsuarioEstadoFisicoFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado() 
				|| (this.estadofisicofacturaSessionBean.getEsGuardarRelacionado() && this.estadofisicofacturaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoFisicoFacturaClasesRelacionadas();
			}
			
			if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoFisicoFacturaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoFisicoFactura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoFisicoFactura();
			}
			
			if(!this.isPermisoBusquedaEstadoFisicoFactura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoFisicoFactura,this.isPermisoPaginacionMedioEstadoFisicoFactura,this.isPermisoPaginacionTodoEstadoFisicoFactura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoFisicoFacturaConstantesFunciones.getTiposSeleccionarEstadoFisicoFactura());
				
				this.tiposColumnasSelect=EstadoFisicoFacturaConstantesFunciones.getTiposSeleccionarEstadoFisicoFactura(true);
				
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
			//if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoFisicoFactura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEstadoFisicoFactura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEstadoFisicoFactura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFactura() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadofisicofacturaImplementable= (EstadoFisicoFacturaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFisicoFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadofisicofacturaImplementableHome= (EstadoFisicoFacturaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoFisicoFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadofisicofacturas= new ArrayList<EstadoFisicoFactura>();
			this.estadofisicofacturasEliminados= new ArrayList<EstadoFisicoFactura>();
						
			this.isEsNuevoEstadoFisicoFactura=false;
			this.esParaAccionDesdeFormularioEstadoFisicoFactura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoFisicoFactura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoFisicoFactura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoFisicoFacturaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoFisicoFactura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoFisicoFactura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoFisicoFactura();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadoFisicoFactura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadoFisicoFactura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadoFisicoFactura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoFisicoFactura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoFisicoFactura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoFisicoFactura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoFisicoFactura")) {
				iIndex=this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoFisicoFactura();	
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
	
	public void cargarCombosForeignKeyEstadoFisicoFactura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoFisicoFactura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoFisicoFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoFisicoFacturaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoFisicoFactura();
		
		this.cargarCombosFrameForeignKeyEstadoFisicoFactura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoFisicoFactura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoFisicoFactura();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEstadoFisicoFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			
			if(jTableDatosEstadoFisicoFactura.getRowCount()>=1) {
				jTableDatosEstadoFisicoFactura.removeRowSelectionInterval(0, jTableDatosEstadoFisicoFactura.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoFisicoFactura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoFisicoFactura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoFisicoFactura(true);			
			//this.estadofisicofactura=new EstadoFisicoFactura();
			//this.estadofisicofactura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura() ;
			
			if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFisicoFactura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadofisicofactura);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);				
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoFisicoFactura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoFisicoFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoFisicoFactura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoFisicoFactura.getSelectedRows().length;			
			}
			
			estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoFisicoFactura--;			
				//EstadoFisicoFactura estadofisicofacturaAux= new EstadoFisicoFactura();			
				//estadofisicofacturaAux.setId(this.iIdNuevoEstadoFisicoFactura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoFisicoFactura estadofisicofacturaOrigen=new EstadoFisicoFactura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoFisicoFactura estadofisicofacturaOrigen : estadofisicofacturasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadofisicofacturaOrigen =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadofisicofacturaOrigen =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoFisicoFactura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadofisicofactura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoFisicoFactura(estadofisicofacturaOrigen,this.estadofisicofactura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofisicofacturaLogic.getEstadoFisicoFacturas().add(this.estadofisicofacturaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturas.add(this.estadofisicofacturaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
				
				this.jTableDatosEstadoFisicoFactura.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFactura(), this.getIndiceNuevoEstadoFisicoFactura());
				
				int iLastRow =  this.jTableDatosEstadoFisicoFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFisicoFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFisicoFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();									
		
			EstadoFisicoFactura estadofisicofacturaOrigen=new EstadoFisicoFactura();
			EstadoFisicoFactura estadofisicofacturaDestino=new EstadoFisicoFactura();
				
			estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoFisicoFactura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadofisicofacturasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoFisicoFactura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaOrigen =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofisicofacturaOrigen =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadofisicofacturaDestino =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadofisicofacturaDestino =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadofisicofacturaOrigen =estadofisicofacturasSeleccionados.get(0);
				estadofisicofacturaDestino =estadofisicofacturasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoFisicoFactura(estadofisicofacturaOrigen,estadofisicofacturaDestino,true,false);
				
				estadofisicofacturaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadofisicofacturaDestino,estadofisicofacturaLogic.getEstadoFisicoFacturas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadofisicofacturaDestino,estadofisicofacturas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
				
				//this.jTableDatosEstadoFisicoFactura.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFactura(), this.getIndiceNuevoEstadoFisicoFactura());
				
				int iLastRow =  this.jTableDatosEstadoFisicoFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoFisicoFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoFisicoFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoFisicoFactura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(!isVisible);
			this.jPanelPaginacionEstadoFisicoFactura.setVisible(!isVisible);
			this.jPanelAccionesEstadoFisicoFactura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoFisicoFactura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoFisicoFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoFisicoFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoFisicoFactura();
			
			this.abrirFrameOrderByEstadoFisicoFactura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoFisicoFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoFisicoFactura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFisicoFactura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoFisicoFactura.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoFisicoFactura.setSize(this.jInternalFrameDetalleFormEstadoFisicoFactura.iWidthFormulario,this.jInternalFrameDetalleFormEstadoFisicoFactura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoFisicoFactura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoFisicoFactura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoFisicoFactura.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoFisicoFactura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFactura.jContentPaneDetalleEstadoFisicoFactura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFisicoFactura.jContentPaneDetalleEstadoFisicoFactura.getWidth(),EstadoFisicoFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoFisicoFactura.jContentPaneDetalleEstadoFisicoFactura.getWidth(),EstadoFisicoFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoFisicoFactura.jContentPaneDetalleEstadoFisicoFactura.getWidth(),EstadoFisicoFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoFisicoFactura.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoFisicoFactura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoFisicoFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoFisicoFactura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoFisicoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFactura,false,this);
				} else {
					this.jInternalFrameOrderByEstadoFisicoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoFisicoFactura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoFisicoFactura);
				this.jInternalFrameOrderByEstadoFisicoFactura.setVisible(false);
				this.jInternalFrameOrderByEstadoFisicoFactura.setSelected(false);
				
				this.jInternalFrameOrderByEstadoFisicoFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFisicoFactura"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoFisicoFactura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoFisicoFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoFisicoFactura==null) {
				
				this.jInternalFrameImportacionEstadoFisicoFactura=new ImportacionJInternalFrame(EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoFisicoFactura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoFisicoFactura);
				this.jInternalFrameImportacionEstadoFisicoFactura.setVisible(false);
				this.jInternalFrameImportacionEstadoFisicoFactura.setSelected(false);


				this.jInternalFrameImportacionEstadoFisicoFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFisicoFactura"));
				this.jInternalFrameImportacionEstadoFisicoFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFisicoFactura"));
				this.jInternalFrameImportacionEstadoFisicoFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFisicoFactura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoFisicoFactura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura==null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura=new ReporteDinamicoJInternalFrame(EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoFisicoFactura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoFisicoFactura);
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFisicoFactura"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFisicoFactura"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFisicoFactura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFisicoFactura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoFisicoFactura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoFisicoFactura);
			
	       	this.jInternalFrameDetalleFormEstadoFisicoFactura.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoFisicoFactura.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoFisicoFactura.dispose();
			//this.jInternalFrameDetalleFormEstadoFisicoFactura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoFisicoFactura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoFisicoFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoFisicoFactura.setVisible(true);
	        this.jInternalFrameImportacionEstadoFisicoFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoFisicoFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoFisicoFactura.setVisible(true);
	        this.jInternalFrameOrderByEstadoFisicoFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoFisicoFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoFisicoFactura.setVisible(false);
	        this.jInternalFrameOrderByEstadoFisicoFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoFisicoFactura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoFisicoFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoFisicoFactura.setVisible(false);
	        this.jInternalFrameImportacionEstadoFisicoFactura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoFisicoFactura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoFisicoFactura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoFisicoFactura(true);
			//this.isEsNuevoEstadoFisicoFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false) ;
			
			if(estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFisicoFactura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoFisicoFacturaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoFisicoFactura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoFisicoFactura(true);
			//this.isEsNuevoEstadoFisicoFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadofisicofactura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false) ;
			
			if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoFisicoFactura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadoFisicoFactura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoFisicoFactura(false);
			
			//if(!this.isEsNuevoEstadoFisicoFactura) {								
				int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
				
			}
			
			if(this.permiteMantenimiento(this.estadofisicofactura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoFisicoFactura=true;
					this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
					this.isEsNuevoEstadoFisicoFactura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoFisicoFactura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoFisicoFactura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(false);
				
				this.habilitarDeshabilitarControlesEstadoFisicoFactura(false);
			
												
				
				if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoFisicoFactura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,estadofisicofacturaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoFisicoFactura(this.estadofisicofactura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoFisicoFactura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadofisicofacturaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadofisicofactura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				this.estadofisicofactura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				this.estadofisicofactura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadofisicofactura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoFisicoFacturaModel) this.jTableDatosEstadoFisicoFactura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoFisicoFactura=true;
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
				this.isEsNuevoEstadoFisicoFactura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(false);
				
				this.habilitarDeshabilitarControlesEstadoFisicoFactura(false);
				
				
				
				if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoFisicoFactura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoFisicoFactura.getRowCount()>=1) {
				jTableDatosEstadoFisicoFactura.removeRowSelectionInterval(0, jTableDatosEstadoFisicoFactura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoFisicoFactura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(false) ;
			
			this.isEsNuevoEstadoFisicoFactura=false;
			
			if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoFisicoFactura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoFisicoFactura(false);
				
				//SI ES MANUAL
				if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoFisicoFactura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoFisicoFactura--;			
			//EstadoFisicoFactura estadofisicofacturaAux= new EstadoFisicoFactura();			
			//estadofisicofacturaAux.setId(this.iIdNuevoEstadoFisicoFactura);
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoFisicoFactura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
			
			this.estadofisicofactura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadofisicofacturaLogic.getEstadoFisicoFacturas().add(this.estadofisicofacturaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadofisicofacturas.add(this.estadofisicofacturaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			
			this.jTableDatosEstadoFisicoFactura.setRowSelectionInterval(this.getIndiceNuevoEstadoFisicoFactura(), this.getIndiceNuevoEstadoFisicoFactura());
			
			int iLastRow =  this.jTableDatosEstadoFisicoFactura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoFisicoFactura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoFisicoFactura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFisicoFactura();
			}
			
			//this.abrirFrameTreeEstadoFisicoFactura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Fisico FacturaS ?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoFisicoFactura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoFisicoFactura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadofisicofacturaReturnGeneral=estadofisicofacturaLogic.procesarImportacionEstadoFisicoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadofisicofacturaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoFisicoFacturaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoFisicoFactura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoFisicoFactura.setFileImportacion(this.jInternalFrameImportacionEstadoFisicoFactura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoFisicoFactura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoFisicoFactura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoFisicoFactura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoFisicoFactura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		

		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoFisicoFacturaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoFisicoFacturaBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoFisicoFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(EstadoFisicoFactura estadofisicofactura:estadofisicofacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofisicofactura.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoFisicoFactura estadofisicofactura:estadofisicofacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadofisicofactura.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoFisicoFactura(row);				
			//	iRow++;
			//}				
			
			//for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoFisicoFactura(estadofisicofacturaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoFisicoFactura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFisicoFactura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
			
			//SI ES MANUAL
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoFisicoFactura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoFisicoFactura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoFisicoFactura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoFisicoFactura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoFisicoFactura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoFisicoFactura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoFisicoFactura.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoFisicoFactura.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoFisicoFactura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoFisicoFactura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoFisicoFactura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoFisicoFactura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoFisicoFactura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoFisicoFactura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoFisicoFactura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFactura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoFisicoFactura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoFisicoFactura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoFisicoFactura();
		
		this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFisicoFactura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFactura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFisicoFactura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFisicoFactura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoFisicoFactura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoFisicoFactura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoFisicoFactura.jCheckBoxPostAccionNuevoEstadoFisicoFactura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoFisicoFactura.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoFisicoFactura.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoFisicoFactura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoFisicoFactura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
				this.jInternalFrameDetalleFormEstadoFisicoFactura.jCheckBoxPostAccionNuevoEstadoFisicoFactura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoFisicoFactura.jCheckBoxPostAccionSinCerrarEstadoFisicoFactura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoFisicoFactura.jCheckBoxPostAccionSinMensajeEstadoFisicoFactura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoFisicoFactura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoFisicoFactura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoFisicoFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoFisicoFactura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoFisicoFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoFisicoFactura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoFisicoFactura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoFisicoFactura(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoFisicoFactura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoFisicoFactura() throws Exception {
		try	{
			if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFisicoFactura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFisicoFactura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoFisicoFactura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoFisicoFactura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoFisicoFactura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoFisicoFactura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoFisicoFactura.addItem(reporte);
			}
			
			
			if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoFisicoFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoFisicoFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoFisicoFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoFisicoFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoFisicoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoFisicoFactura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoFisicoFactura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFisicoFactura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoFisicoFactura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoFisicoFactura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisEstadoFisicoFactura.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoFisicoFactura(Boolean esInicializar) throws Exception {				
		if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoFisicoFactura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoFisicoFactura() throws Exception {
		this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoFisicoFactura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoFisicoFacturaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFacturaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoFisicoFactura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadofisicofacturaLogic.getEstadoFisicoFacturas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadofisicofacturas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoFisicoFactura.setModel(new EstadoFisicoFacturaModel(this.estadofisicofacturaLogic.getEstadoFisicoFacturas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoFisicoFactura.setModel(new EstadoFisicoFacturaModel(this.estadofisicofacturas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoFisicoFactura!=null && this.jInternalFrameOrderByEstadoFisicoFactura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoFisicoFactura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO,estadofisicofacturaConstantesFunciones.resaltarSeleccionarEstadoFisicoFactura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoFisicoFacturaConstantesFunciones.SCLASSWEBTITULO,estadofisicofacturaConstantesFunciones.resaltarSeleccionarEstadoFisicoFactura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,EstadoFisicoFacturaConstantesFunciones.LABEL_ID));

		if(this.estadofisicofacturaConstantesFunciones.mostraridEstadoFisicoFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadofisicofacturaConstantesFunciones.resaltaridEstadoFisicoFactura,this.estadofisicofacturaConstantesFunciones.activaridEstadoFisicoFactura,this,true,"idEstadoFisicoFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofisicofacturaConstantesFunciones.resaltaridEstadoFisicoFactura,this.estadofisicofacturaConstantesFunciones.activaridEstadoFisicoFactura,this,true,"idEstadoFisicoFactura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS));

		if(this.estadofisicofacturaConstantesFunciones.mostrarid_paisEstadoFisicoFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.estadofisicofacturaConstantesFunciones.resaltarid_paisEstadoFisicoFactura,this,this.estadofisicofacturaConstantesFunciones.activarid_paisEstadoFisicoFactura));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.estadofisicofacturaConstantesFunciones.resaltarid_paisEstadoFisicoFactura,this,this.estadofisicofacturaConstantesFunciones.activarid_paisEstadoFisicoFactura,true,"id_paisEstadoFisicoFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE));

		if(this.estadofisicofacturaConstantesFunciones.mostrarnombreEstadoFisicoFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadofisicofacturaConstantesFunciones.resaltarnombreEstadoFisicoFactura,this.estadofisicofacturaConstantesFunciones.activarnombreEstadoFisicoFactura,this,true,"nombreEstadoFisicoFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadofisicofacturaConstantesFunciones.resaltarnombreEstadoFisicoFactura,this.estadofisicofacturaConstantesFunciones.activarnombreEstadoFisicoFactura,this,true,"nombreEstadoFisicoFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoFisicoFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFisicoFactura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoFisicoFactura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoFisicoFactura.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoFisicoFactura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoFisicoFactura.moveColumn(this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoFisicoFactura.moveColumn(this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoFisicoFactura.moveColumn(this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoFisicoFactura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoFisicoFactura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoFisicoFactura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoFisicoFactura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoFisicoFactura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoFisicoFactura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadofisicofacturaLogic.getEstadoFisicoFacturas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadofisicofacturas.size()-1;
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
		//this.jTableDatosEstadoFisicoFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoFisicoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoFisicoFactura();
			
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
				
				//this.isEsNuevoEstadoFisicoFactura=false;
					
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
				if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFisicoFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFisicoFactura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadofisicofactura.getsType().equals("DUPLICADO")
				   || this.estadofisicofactura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoFisicoFactura=true;
				
				} else {
					this.isEsNuevoEstadoFisicoFactura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
					if(this.estadofisicofactura.getId()>=0 && !this.estadofisicofactura.getIsNew()) {						
						this.isEsNuevoEstadoFisicoFactura=false;
						
					} else {
						this.isEsNuevoEstadoFisicoFactura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoFisicoFactura(esRelaciones);						
				
				this.seleccionarEstadoFisicoFactura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadofisicofactura.getId()<0) {
					this.isEsNuevoEstadoFisicoFactura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoFisicoFactura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoFisicoFactura(evt,rowIndex);
				}	
				
				if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoFisicoFactura: " + this.dDif); 
					}
				}								
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoFisicoFactura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadofisicofactura)) {
					if(this.estadofisicofactura.getId()>0) {
						this.estadofisicofactura.setIsDeleted(true);
						
						this.estadofisicofacturasEliminados.add(this.estadofisicofactura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadofisicofacturaLogic.getEstadoFisicoFacturas().remove(this.estadofisicofactura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadofisicofacturas.remove(this.estadofisicofactura);				
					}
					
					
					((EstadoFisicoFacturaModel) this.jTableDatosEstadoFisicoFactura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoFisicoFactura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoFisicoFactura) {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoFisicoFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoFisicoFactura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofactura);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.estadofisicofacturaConstantesFunciones.cargarid_paisEstadoFisicoFactura || this.estadofisicofacturaConstantesFunciones.event_dependid_paisEstadoFisicoFactura) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.estadofisicofactura.getid_pais());
									//this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(estadofisicofactura.getPais()!=null) {
							this.paissForeignKey.add(estadofisicofactura.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.estadofisicofactura.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoFisicoFactura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoFisicoFactura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoFisicoFactura(estadofisicofactura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoFisicoFactura(estadofisicofactura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoFisicoFactura(estadofisicofactura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFactura(estadofisicofactura);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setText(estadofisicofactura.getId().toString());
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setText(estadofisicofactura.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoFisicoFactura estadofisicofacturaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadofisicofacturaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoFisicoFactura estadofisicofacturaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadofisicofacturaLocal=this.estadofisicofactura;
			} else {
				estadofisicofacturaLocal=this.estadofisicofacturaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadofisicofacturaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoFisicoFactura(estadofisicofacturaLocal,true);
					
					if(estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadofisicofacturaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadofisicofacturaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(estadofisicofactura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(estadofisicofactura);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(estadofisicofactura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.getText()==null || this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.getText()=="" || this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setText("0");
			}

			if(conColumnasBase) {estadofisicofactura.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFisicoFacturaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFactura.jLabelIdEstadoFisicoFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadofisicofactura.setnombre(this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoFisicoFactura.jLabelnombreEstadoFisicoFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoFisicoFactura(EstadoFisicoFactura estadofisicofacturaBean,EstadoFisicoFactura estadofisicofactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && estadofisicofacturaBean.getid_pais()!=null && !estadofisicofacturaBean.getid_pais().equals(-1L))) {estadofisicofactura.setid_pais(estadofisicofacturaBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoFisicoFactura(EstadoFisicoFactura estadofisicofacturaOrigen,EstadoFisicoFactura estadofisicofactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofisicofacturaOrigen.getId()!=null && !estadofisicofacturaOrigen.getId().equals(0L))) {estadofisicofactura.setId(estadofisicofacturaOrigen.getId());}}
			if(conDefault || (!conDefault && estadofisicofacturaOrigen.getid_pais()!=null && !estadofisicofacturaOrigen.getid_pais().equals(-1L))) {estadofisicofactura.setid_pais(estadofisicofacturaOrigen.getid_pais());}
			if(conDefault || (!conDefault && estadofisicofacturaOrigen.getnombre()!=null && !estadofisicofacturaOrigen.getnombre().equals(""))) {estadofisicofactura.setnombre(estadofisicofacturaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setText(estadofisicofactura.getId().toString());
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setText(estadofisicofactura.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoFisicoFactura(EstadoFisicoFacturaBean estadofisicofacturaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setText(estadofisicofacturaBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setText(estadofisicofacturaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoFisicoFactura(EstadoFisicoFacturaParameterReturnGeneral estadofisicofacturaReturnGeneral,EstadoFisicoFacturaBean estadofisicofacturaBean,Boolean conDefault) throws Exception { 
		try {
			EstadoFisicoFactura estadofisicofacturaLocal=new EstadoFisicoFactura();
			
			estadofisicofacturaLocal=estadofisicofacturaReturnGeneral.getEstadoFisicoFactura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadofisicofacturaLocal.getId()!=null && !estadofisicofacturaLocal.getId().equals(0L))) {estadofisicofacturaBean.setId(estadofisicofacturaLocal.getId());}}
			if(conDefault || (!conDefault && estadofisicofacturaLocal.getid_pais()!=null && !estadofisicofacturaLocal.getid_pais().equals(-1L))) {estadofisicofacturaBean.setid_pais(estadofisicofacturaLocal.getid_pais());}
			if(conDefault || (!conDefault && estadofisicofacturaLocal.getnombre()!=null && !estadofisicofacturaLocal.getnombre().equals(""))) {estadofisicofacturaBean.setnombre(estadofisicofacturaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoFisicoFacturaGenerico(Long idEstadoFisicoFacturaSeleccionado,JComboBox jComboBoxEstadoFisicoFactura,List<EstadoFisicoFactura> estadofisicofacturasLocal)throws Exception {
		try {
			EstadoFisicoFactura  estadofisicofacturaTemp=null;

			for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasLocal) {
				if(estadofisicofacturaAux.getId()!=null && estadofisicofacturaAux.getId().equals(idEstadoFisicoFacturaSeleccionado)) {
					estadofisicofacturaTemp=estadofisicofacturaAux;
					break;
				}
			}

			jComboBoxEstadoFisicoFactura.setSelectedItem(estadofisicofacturaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoFisicoFacturaGenerico(JComboBox jComboBoxEstadoFisicoFactura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFisicoFactura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoFisicoFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoFisicoFactura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoFisicoFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoFisicoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoFisicoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofisicofactura=(EstadoFisicoFactura) estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofisicofactura =(EstadoFisicoFactura) estadofisicofacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!estadofisicofactura.getIsNew() && !estadofisicofactura.getIsChanged() && !estadofisicofactura.getIsDeleted()) {
				sDescripcion=estadofisicofactura.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=estadofisicofactura.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoFisicoFactura estadofisicofacturaRow=new EstadoFisicoFactura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofisicofacturaRow=(EstadoFisicoFactura) estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadofisicofacturaRow=(EstadoFisicoFactura) estadofisicofacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoFisicoFactura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura));			
			this.jButtonDuplicarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaDuplicarEstadoFisicoFactura && this.isPermisoDuplicarEstadoFisicoFactura));			
			this.jButtonCopiarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaCopiarEstadoFisicoFactura && this.isPermisoCopiarEstadoFisicoFactura));
			this.jButtonVerFormEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaVerFormEstadoFisicoFactura && this.isPermisoVerFormEstadoFisicoFactura));
			
			this.jButtonAbrirOrderByEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFactura && this.isPermisoOrdenEstadoFisicoFactura));			
			
			this.jButtonNuevoRelacionesEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura));			
			this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaModificarEstadoFisicoFactura && this.isPermisoActualizarEstadoFisicoFactura));	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaActualizarEstadoFisicoFactura && this.isPermisoActualizarEstadoFisicoFactura));	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaEliminarEstadoFisicoFactura && this.isPermisoEliminarEstadoFisicoFactura));
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarEstadoFisicoFactura.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFactura);							
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura));						
			this.jButtonDuplicarToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaDuplicarEstadoFisicoFactura && this.isPermisoDuplicarEstadoFisicoFactura));						
			this.jButtonCopiarToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaCopiarEstadoFisicoFactura && this.isPermisoCopiarEstadoFisicoFactura));			
			this.jButtonVerFormToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaVerFormEstadoFisicoFactura && this.isPermisoVerFormEstadoFisicoFactura));			
			this.jButtonAbrirOrderByToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFactura && this.isPermisoOrdenEstadoFisicoFactura));
			this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));			
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaModificarEstadoFisicoFactura && this.isPermisoActualizarEstadoFisicoFactura));	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaActualizarEstadoFisicoFactura  && this.isPermisoActualizarEstadoFisicoFactura));	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaEliminarEstadoFisicoFactura && this.isPermisoEliminarEstadoFisicoFactura));
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarToolBarEstadoFisicoFactura.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFactura);				
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura));			
			this.jMenuItemDuplicarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaDuplicarEstadoFisicoFactura && this.isPermisoDuplicarEstadoFisicoFactura));			
			this.jMenuItemCopiarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaCopiarEstadoFisicoFactura && this.isPermisoCopiarEstadoFisicoFactura));			
			this.jMenuItemVerFormEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaVerFormEstadoFisicoFactura && this.isPermisoVerFormEstadoFisicoFactura));			
			this.jMenuItemAbrirOrderByEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFactura && this.isPermisoOrdenEstadoFisicoFactura));			
			//this.jMenuItemMostrarOcultarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFactura && this.isPermisoOrdenEstadoFisicoFactura));
			this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFactura && this.isPermisoOrdenEstadoFisicoFactura));			
			//this.jMenuItemDetalleMostrarOcultarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaOrdenEstadoFisicoFactura && this.isPermisoOrdenEstadoFisicoFactura));			
			this.jMenuItemNuevoRelacionesEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura));			
			this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaNuevoEstadoFisicoFactura && this.isPermisoNuevoEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));									
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemModificarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaModificarEstadoFisicoFactura && this.isPermisoActualizarEstadoFisicoFactura));	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemActualizarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaActualizarEstadoFisicoFactura && this.isPermisoActualizarEstadoFisicoFactura));	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemEliminarEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaEliminarEstadoFisicoFactura && this.isPermisoEliminarEstadoFisicoFactura));
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemCancelarEstadoFisicoFactura.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFactura);				
			}
			
			this.jMenuItemGuardarCambiosEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));						
			this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=this.jButtonNuevoEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoFisicoFactura=this.jButtonDuplicarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaCopiarEstadoFisicoFactura=this.jButtonCopiarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaVerFormEstadoFisicoFactura=this.jButtonVerFormEstadoFisicoFactura.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoFisicoFactura=this.jButtonAbrirOrderByEstadoFisicoFactura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=this.jButtonNuevoRelacionesEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=this.jButtonModificarEstadoFisicoFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaGuardarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=this.jButtonGuardarCambiosTablaEstadoFisicoFactura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=this.jButtonNuevoToolBarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarToolBarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarToolBarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarToolBarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarToolBarEstadoFisicoFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFisicoFactura=this.jButtonGuardarCambiosToolBarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=this.jMenuItemNuevoEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=this.jMenuItemNuevoRelacionesEstadoFisicoFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemModificarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemActualizarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemEliminarEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemCancelarEstadoFisicoFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoFisicoFactura=this.jMenuItemGuardarCambiosEstadoFisicoFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoFisicoFactura(Boolean esInicializar) {
		if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
				//if(this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFisicoFactura();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoFisicoFactura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoFisicoFactura() {
		this.jButtonNuevoEstadoFisicoFactura.setVisible(this.isPermisoNuevoEstadoFisicoFactura);			
		this.jButtonDuplicarEstadoFisicoFactura.setVisible(this.isPermisoDuplicarEstadoFisicoFactura);			
		this.jButtonCopiarEstadoFisicoFactura.setVisible(this.isPermisoCopiarEstadoFisicoFactura);			
		this.jButtonVerFormEstadoFisicoFactura.setVisible(this.isPermisoVerFormEstadoFisicoFactura);			
		
		this.jButtonAbrirOrderByEstadoFisicoFactura.setVisible(this.isPermisoOrdenEstadoFisicoFactura);					
		
		this.jButtonNuevoRelacionesEstadoFisicoFactura.setVisible(this.isPermisoNuevoEstadoFisicoFactura);			
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarEstadoFisicoFactura.setVisible(this.isPermisoActualizarEstadoFisicoFactura);	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarEstadoFisicoFactura.setVisible(this.isPermisoActualizarEstadoFisicoFactura);	
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarEstadoFisicoFactura.setVisible(this.isPermisoEliminarEstadoFisicoFactura);
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarEstadoFisicoFactura.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFactura);						
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.setVisible(this.isPermisoGuardarCambiosEstadoFisicoFactura);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.setVisible(this.isPermisoActualizarEstadoFisicoFactura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFisicoFactura() {
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarEstadoFisicoFactura.setVisible(this.isPermisoActualizarEstadoFisicoFactura);	
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarEstadoFisicoFactura.setVisible(this.isPermisoActualizarEstadoFisicoFactura);	
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarEstadoFisicoFactura.setVisible(this.isPermisoEliminarEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarEstadoFisicoFactura.setVisible(this.isVisibilidadCeldaCancelarEstadoFisicoFactura);							
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.setVisible((this.isVisibilidadCeldaGuardarEstadoFisicoFactura && this.isPermisoGuardarCambiosEstadoFisicoFactura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoFisicoFactura() {
		if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoFisicoFactura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoFisicoFactura() {
	}
	
	public void jTableDatosEstadoFisicoFacturaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoFisicoFactura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoFisicoFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.getestadofisicofactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofactura==null) {
						this.estadofisicofactura = new EstadoFisicoFactura();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
				}

				if(this.estadofisicofactura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadofisicofactura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisEstadoFisicoFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebEstadoFisicoFactura(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadoFisicoFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadoFisicoFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.getestadofisicofactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.estadofisicofacturaLogic.getConnexion());

				if(this.estadofisicofactura.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.estadofisicofactura.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadoFisicoFactura=(TitledBorder)this.jScrollPanelDatosEstadoFisicoFactura.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderEstadoFisicoFactura.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisEstadoFisicoFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.getestadofisicofactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofactura==null) {
						this.estadofisicofactura = new EstadoFisicoFactura();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
				}

				if(this.estadofisicofactura.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.estadofisicofactura.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoFisicoFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.getestadofisicofactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadofisicofactura==null) {
						this.estadofisicofactura = new EstadoFisicoFactura();
					}

					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);
				}

				if(this.estadofisicofactura.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadofisicofactura.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoFisicoFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisEstadoFisicoFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);

			this.getEstadoFisicoFacturasFK_IdPais();

			this.inicializarActualizarBindingEstadoFisicoFactura(false);

			//if(EstadoFisicoFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadofisicofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadoFisicoFactura() {
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.dispose();
			this.jInternalFrameDetalleFormEstadoFisicoFactura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
			this.jInternalFrameReporteDinamicoEstadoFisicoFactura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoFisicoFactura.dispose();
			this.jInternalFrameReporteDinamicoEstadoFisicoFactura=null;
		}
		
		if(this.jInternalFrameImportacionEstadoFisicoFactura!=null) {
			this.jInternalFrameImportacionEstadoFisicoFactura.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoFisicoFactura.dispose();
			this.jInternalFrameImportacionEstadoFisicoFactura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoFisicoFactura();
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoFisicoFactura")) {
				jButtonDuplicarEstadoFisicoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoFisicoFactura")) {
				jButtonCopiarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoFisicoFactura")) {
				jButtonVerFormEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoFisicoFactura")) {
				jButtonDuplicarEstadoFisicoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoFisicoFactura")) {
				jButtonDuplicarEstadoFisicoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoFisicoFactura")) {
				jButtonModificarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoFisicoFactura")) {
				jButtonModificarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoFisicoFactura")) {
				jButtonModificarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoFisicoFactura")) {
				jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoFisicoFactura")) {
				jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoFisicoFactura")) {
				jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoFisicoFactura")) {
				jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoFisicoFactura")) {
				jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoFisicoFactura")) {
				jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoFisicoFactura")) {
				jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoFisicoFactura")) {
				jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoFisicoFactura")) {
				jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoFisicoFactura")) {
				jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoFisicoFactura")) {
				jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoFisicoFactura")) {
				jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoFisicoFactura")) {
				jButtonMostrarOcultarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoFisicoFactura")) {
				jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoFisicoFactura")) {
				jButtonCopiarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoFisicoFactura")) {
				jButtonVerFormEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoFisicoFactura")) {
				jButtonCopiarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoFisicoFactura")) {
				jButtonVerFormEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoFisicoFactura")) {
				jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoFisicoFactura")) {
				jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoFisicoFactura")) {
				jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoFisicoFactura")) {
				jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoFisicoFactura")) {
				jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoFisicoFactura")) {
				jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoFisicoFactura")) {
				jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoFisicoFactura")) {
				jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoFisicoFactura")) {
				jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoFisicoFactura") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoFisicoFactura")) {
				jButtonAbrirOrderByEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoFisicoFactura") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoFisicoFactura")) {
				jButtonMostrarOcultarEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFisicoFactura")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoFisicoFactura")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoFisicoFactura")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoFisicoFactura")) {
				jButtonCerrarReporteDinamicoEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoFisicoFactura")) {
				jButtonGenerarReporteDinamicoEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoFisicoFactura")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoFisicoFactura")) {
				jButtonCerrarImportacionEstadoFisicoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoFisicoFactura")) {
				
				jButtonGenerarImportacionEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoFisicoFactura")) {
				
				jButtonAbrirImportacionEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoFisicoFactura")) {
				jComboBoxTiposAccionesEstadoFisicoFacturaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoFisicoFactura")) {
				jComboBoxTiposRelacionesEstadoFisicoFacturaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoFisicoFactura")) {
				jComboBoxTiposAccionesEstadoFisicoFacturaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoFisicoFactura")) {
				
				jComboBoxTiposSeleccionarEstadoFisicoFacturaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoFisicoFactura")) {
				jTextFieldValorCampoGeneralEstadoFisicoFacturaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoFisicoFactura")) {
				jButtonAbrirOrderByEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoFisicoFactura")) {
				jButtonAbrirOrderByEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoFisicoFactura")) {
				jButtonCerrarOrderByEstadoFisicoFacturaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFisicoFacturaBusqueda")) {
				this.jButtonidEstadoFisicoFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisEstadoFisicoFacturaUpdate")) {
				this.jButtonid_paisEstadoFisicoFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisEstadoFisicoFacturaBusqueda")) {
				this.jButtonid_paisEstadoFisicoFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFisicoFacturaBusqueda")) {
				this.jButtonnombreEstadoFisicoFacturaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisEstadoFisicoFactura")) {
				this.jButtonFK_IdPaisEstadoFisicoFacturaActionPerformed(evt);
			}
			
			;
			
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoFisicoFactura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoFisicoFactura estadofisicofacturaLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadofisicofacturaLocal=this.estadofisicofactura;
			} else {
				estadofisicofacturaLocal=this.estadofisicofacturaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
							
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
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
			
			


			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
								
						
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
								
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
							
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
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
			
			


			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
								
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoFisicoFactura")) {
					jCheckBoxSeleccionarTodosEstadoFisicoFacturaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoFisicoFactura")) {
					jCheckBoxSeleccionadosEstadoFisicoFacturaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoFisicoFactura")) {
					
				}
				
				


				
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
												
				
				


				
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
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
			
			


			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadofisicofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadofisicofactura);
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
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
				
				


				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoFisicoFactura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoFisicoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoFisicoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadofisicofacturaAnterior =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoFisicoFactura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoFisicoFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoFisicoFactura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadofisicofactura =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadofisicofactura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoFisicoFactura")) {
				
				}
				
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoFisicoFactura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoFisicoFactura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoFisicoFactura")) {
			
			}
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoFisicoFactura();
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoFisicoFactura")) {
				jButtonDuplicarEstadoFisicoFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoFisicoFactura")) {
				jButtonCopiarEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoFisicoFactura")) {
				jButtonVerFormEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoFisicoFactura")) {
				jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoFisicoFactura")) {
				jButtonModificarEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoFisicoFactura")) {
				jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoFisicoFactura")) {
				jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoFisicoFactura")) {
				jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoFisicoFactura")) {
				jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoFisicoFactura")) {
				jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoFisicoFactura")) {
				jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoFisicoFactura")) {
				jButtonAbrirOrderByEstadoFisicoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoFisicoFactura")) {
				jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoFisicoFactura")) {
				jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoFisicoFactura")) {
				jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoFisicoFacturaBusqueda")) {
				this.jButtonidEstadoFisicoFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisEstadoFisicoFacturaUpdate")) {
				this.jButtonid_paisEstadoFisicoFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisEstadoFisicoFacturaBusqueda")) {
				this.jButtonid_paisEstadoFisicoFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoFisicoFacturaBusqueda")) {
				this.jButtonnombreEstadoFisicoFacturaBusquedaActionPerformed(evt);
			}
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoFisicoFactura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoFisicoFactura")) {
				closingInternalFrameEstadoFisicoFactura();
				
			} else if(sTipo.equals("jButtonCancelarEstadoFisicoFactura")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoFisicoFactura = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoFisicoFacturaBeanSwingJInternalFrame jInternalFrameParent=(EstadoFisicoFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFisicoFactura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoFisicoFacturaActionPerformed(null);
			}
			
			EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadofisicofactura,new Object(),this.estadofisicofacturaParameterGeneral,this.estadofisicofacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoFisicoFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoFisicoFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoFisicoFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadofisicofactura)) {
			if(!esControlTabla) {
				if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);			
				}
				
				if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofisicofacturaReturnGeneral=estadofisicofacturaLogic.procesarEventosEstadoFisicoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofacturaLogic.getEstadoFisicoFacturas(),this.estadofisicofactura,this.estadofisicofacturaParameterGeneral,this.isEsNuevoEstadoFisicoFactura,classes);//this.estadofisicofacturaLogic.getEstadoFisicoFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral,this.estadofisicofacturaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFisicoFactura(classes,this.estadofisicofacturaReturnGeneral,this.estadofisicofacturaBean,false);
					}
						
					if(this.estadofisicofacturaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura());	
					}
						
					if(this.estadofisicofacturaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura(),classes);//this.estadofisicofacturaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFactura(this.estadofisicofactura,classes);//this.estadofisicofacturaBean);									
				}
			
				if(EstadoFisicoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoFisicoFactura(this.estadofisicofactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoFisicoFactura(this.estadofisicofactura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadofisicofacturaAnterior!=null) {
						this.estadofisicofactura=this.estadofisicofacturaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadofisicofacturaReturnGeneral=estadofisicofacturaLogic.procesarEventosEstadoFisicoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofacturaLogic.getEstadoFisicoFacturas(),this.estadofisicofactura,this.estadofisicofacturaParameterGeneral,this.isEsNuevoEstadoFisicoFactura,classes);//this.estadofisicofacturaLogic.getEstadoFisicoFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadofisicofacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadofisicofacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura(),estadofisicofacturaLogic.getEstadoFisicoFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura(),this.estadofisicofacturas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoFisicoFactura.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoFisicoFactura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoFisicoFactura();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoFisicoFactura() throws Exception {
		
		EstadoFisicoFacturaModel estadofisicofacturaModel=(EstadoFisicoFacturaModel)this.jTableDatosEstadoFisicoFactura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadofisicofacturaModel.estadofisicofacturas=this.estadofisicofacturaLogic.getEstadoFisicoFacturas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadofisicofacturaModel.estadofisicofacturas=this.estadofisicofacturas;
		}
		
		
		((EstadoFisicoFacturaModel) this.jTableDatosEstadoFisicoFactura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoFisicoFactura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadofisicofacturaAnterior(),this.estadofisicofacturaLogic.getEstadoFisicoFacturas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadofisicofacturaAnterior(),this.estadofisicofacturas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoFisicoFactura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
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
										
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofactura,new Object(),generalEntityParameterGeneral,this.estadofisicofacturaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoFisicoFacturaConstantesFunciones.getClassesRelationshipsOfEstadoFisicoFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoFisicoFacturaConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoFisicoFactura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoFisicoFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoFisicoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadofisicofactura,new Object(),generalEntityParameterGeneral,this.estadofisicofacturaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoFisicoFactura(EstadoFisicoFacturaBean estadofisicofacturaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoFisicoFactura(ArrayList<Classe> classes,EstadoFisicoFacturaReturnGeneral estadofisicofacturaReturnGeneral,EstadoFisicoFacturaBean estadofisicofacturaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadofisicofactura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura = new EstadoFisicoFacturaDetalleFormJInternalFrame(jDesktopPane,this.estadofisicofacturaSessionBean.getConGuardarRelaciones(),this.estadofisicofacturaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.setVisible(false);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.estadofisicofacturaLogic=this.estadofisicofacturaLogic;
		
		this.cargarCombosFrameForeignKeyEstadoFisicoFactura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoFisicoFactura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoFisicoFactura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoFisicoFactura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoFisicoFactura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFisicoFactura"));
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"ModificarEstadoFisicoFactura"));

		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFisicoFactura"));
					
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemModificarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFisicoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFisicoFactura"));
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFisicoFactura"));
						
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemActualizarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFisicoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"EliminarEstadoFisicoFactura"));
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFisicoFactura"));
								
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemEliminarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFisicoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CancelarEstadoFisicoFactura"));
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFisicoFactura"));
					
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemCancelarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFisicoFactura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemDetalleCerrarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFisicoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFisicoFactura"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFisicoFactura"));
		
		
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFisicoFactura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonidEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFisicoFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonid_paisEstadoFisicoFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_paisEstadoFisicoFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonid_paisEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEstadoFisicoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonnombreEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFisicoFacturaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFisicoFactura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoFisicoFactura"));
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoFisicoFactura"));
		}
		
		this.jTableDatosEstadoFisicoFactura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoFisicoFactura"));
		
		this.jTableDatosEstadoFisicoFactura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoFisicoFactura"));
		
		this.jButtonNuevoEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"NuevoEstadoFisicoFactura"));
		
		this.jButtonDuplicarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"DuplicarEstadoFisicoFactura"));
		
		this.jButtonCopiarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"CopiarEstadoFisicoFactura"));
		
		this.jButtonVerFormEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"VerFormEstadoFisicoFactura"));
		
		
		this.jButtonNuevoToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoFisicoFactura"));
			
		this.jButtonDuplicarToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoFisicoFactura"));
			
		this.jMenuItemNuevoEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoFisicoFactura"));
			
		this.jMenuItemDuplicarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoFisicoFactura"));		
		
		
		this.jButtonNuevoRelacionesEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoFisicoFactura"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoFisicoFactura"));
			
		this.jMenuItemNuevoRelacionesEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoFisicoFactura"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"ModificarEstadoFisicoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonModificarToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoFisicoFactura"));
			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemModificarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoFisicoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"ActualizarEstadoFisicoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonActualizarToolBarEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoFisicoFactura"));
				
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemActualizarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoFisicoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"EliminarEstadoFisicoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonEliminarToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoFisicoFactura"));
						
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemEliminarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoFisicoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CancelarEstadoFisicoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonCancelarToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoFisicoFactura"));
			
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemCancelarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoFisicoFactura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoFisicoFactura"));		
		
		
		this.jButtonCerrarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CerrarEstadoFisicoFactura"));
		
		
		this.jButtonCerrarToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoFisicoFactura"));
			
		this.jMenuItemCerrarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoFisicoFactura"));
			
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jMenuItemDetalleCerrarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoFisicoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoFisicoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoFisicoFactura"));
		}
		
		this.jButtonCopiarToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoFisicoFactura"));
			
		this.jButtonVerFormToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoFisicoFactura"));
		
		this.jMenuItemGuardarCambiosEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoFisicoFactura"));
			
		this.jMenuItemCopiarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoFisicoFactura"));		
		
		this.jMenuItemVerFormEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoFisicoFactura"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFisicoFactura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoFisicoFactura"));
			
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoFisicoFactura"));		
		
		
		
		this.jButtonRecargarInformacionEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoFisicoFactura"));
					
		this.jButtonRecargarInformacionToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoFisicoFactura"));
		
		this.jMenuItemRecargarInformacionEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoFisicoFactura"));		
		
		
		
		this.jButtonAnterioresEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"AnterioresEstadoFisicoFactura"));
		
		
		this.jButtonAnterioresToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoFisicoFactura"));
		
		this.jMenuItemAnterioresEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoFisicoFactura"));		
		
		
		this.jButtonSiguientesEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"SiguientesEstadoFisicoFactura"));
		
		
		this.jButtonSiguientesToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoFisicoFactura"));
			
		this.jMenuItemSiguientesEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoFisicoFactura"));
			
		this.jMenuItemAbrirOrderByEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoFisicoFactura"));
			
		this.jMenuItemMostrarOcultarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoFisicoFactura"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoFisicoFactura"));
			
		this.jMenuItemDetalleMostarOcultarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoFisicoFactura"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoFisicoFactura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoFisicoFactura"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoFisicoFactura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoFisicoFactura"));

		this.jCheckBoxSeleccionadosEstadoFisicoFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoFisicoFactura"));
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoFisicoFactura"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoFisicoFactura"));
			
		this.jComboBoxTiposAccionesEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoFisicoFactura"));
					
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoFisicoFactura"));
			
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoFisicoFactura"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonidEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFisicoFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonid_paisEstadoFisicoFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_paisEstadoFisicoFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonid_paisEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEstadoFisicoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonnombreEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFisicoFacturaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"FK_IdPaisEstadoFisicoFactura"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoFisicoFactura!=null) {
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFisicoFactura"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFisicoFactura"));
				this.jInternalFrameReporteDinamicoEstadoFisicoFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFisicoFactura"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoFisicoFactura"));				
			//this.jButtonGenerarReporteDinamicoEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoFisicoFactura"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoFisicoFactura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoFisicoFactura!=null) {
				this.jInternalFrameImportacionEstadoFisicoFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoFisicoFactura"));
				this.jInternalFrameImportacionEstadoFisicoFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoFisicoFactura"));
				this.jInternalFrameImportacionEstadoFisicoFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoFisicoFactura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoFisicoFactura"));
			
			this.jButtonAbrirOrderByToolBarEstadoFisicoFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoFisicoFactura"));			
			
			if(this.jInternalFrameOrderByEstadoFisicoFactura!=null) {
				this.jInternalFrameOrderByEstadoFisicoFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoFisicoFactura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoFisicoFactura.jTabbedPaneRelacionesEstadoFisicoFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoFisicoFactura"));
		
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
            		closingInternalFrameEstadoFisicoFactura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoFisicoFactura = (JInternalFrameBase)event.getSource();
	            	
	            EstadoFisicoFacturaBeanSwingJInternalFrame jInternalFrameParent=(EstadoFisicoFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoFisicoFactura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoFisicoFacturaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoFisicoFactura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoFisicoFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoFisicoFactura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoFisicoFactura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoFisicoFactura";
		inputMap = this.jButtonNuevoEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoFisicoFactura";
		inputMap = this.jButtonNuevoRelacionesEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoFisicoFacturaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoFisicoFactura";
		inputMap = this.jButtonModificarEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoFisicoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoFisicoFactura";
		inputMap = this.jButtonActualizarEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoFisicoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoFisicoFactura";
		inputMap = this.jButtonEliminarEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoFisicoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoFisicoFactura";
		inputMap = this.jButtonCancelarEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoFisicoFactura";
		inputMap = this.jButtonCerrarEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoFisicoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoFisicoFactura";
		inputMap = this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonGuardarCambiosEstadoFisicoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoFisicoFactura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoFisicoFacturaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoFisicoFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoFisicoFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoFisicoFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoFisicoFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoFisicoFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoFisicoFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonidEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoFisicoFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonid_paisEstadoFisicoFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_paisEstadoFisicoFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonid_paisEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEstadoFisicoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jButtonnombreEstadoFisicoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoFisicoFacturaBusqueda"));
		
		
		this.jButtonFK_IdPaisEstadoFisicoFactura.addActionListener(new ButtonActionListener(this,"FK_IdPaisEstadoFisicoFactura"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoFisicoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoFisicoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoFisicoFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoFisicoFactura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoFisicoFactura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
					estadofisicofacturaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturas) {
					estadofisicofacturaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoFisicoFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
						estadofisicofacturaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturas) {
						estadofisicofacturaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFisicoFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFisicoFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoFisicoFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoFisicoFactura.getSelectedRows();
			
			EstadoFisicoFactura estadofisicofacturaLocal=new EstadoFisicoFactura();
			
			//this.seleccionarTodosEstadoFisicoFactura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadofisicofacturaLocal =(EstadoFisicoFactura) this.estadofisicofacturaLogic.getEstadoFisicoFacturas().toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadofisicofacturaLocal =(EstadoFisicoFactura) this.estadofisicofacturas.toArray()[this.jTableDatosEstadoFisicoFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadofisicofacturaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
						estadofisicofacturaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturas) {
						estadofisicofacturaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoFisicoFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoFisicoFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoFisicoFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoFisicoFacturaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoFisicoFacturaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoFisicoFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoFisicoFactura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
				
						if(sTipoSeleccionar.equals(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofisicofacturaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturas) {
					
						if(sTipoSeleccionar.equals(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadofisicofacturaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoFisicoFacturaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoFisicoFactura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoFisicoFactura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoFisicoFactura) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoFisicoFactura(conSplash);
				
					this.generarReporteEstadoFisicoFacturasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoFisicoFacturasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFisicoFacturasSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoFisicoFacturasSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFisicoFactura();
				
				this.exportarEstadoFisicoFacturasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoFisicoFacturas();
				//this.importarEstadoFisicoFacturas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoFisicoFactura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoFisicoFacturasSeleccionados();
				//this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Fisico Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoFisicoFactura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoFisicoFactura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoFisicoFactura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoFisicoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxTiposAccionesFormularioEstadoFisicoFactura.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoFisicoFactura();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoFisicoFactura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoFisicoFacturaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoFisicoFactura();
			
			if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
			EstadoFisicoFactura estadofisicofactura=new EstadoFisicoFactura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoFisicoFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoFisicoFactura.getSelectedItem();
			
			
			
			
			estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadofisicofacturasSeleccionados.size()==1) {
				for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasSeleccionados) {
					estadofisicofactura=estadofisicofacturaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoFisicoFactura();
			
      		//this.finishProcessEstadoFisicoFactura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoFisicoFacturaReturnGeneral() throws Exception {
		if(this.estadofisicofacturaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadofisicofacturaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadofisicofacturaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadofisicofacturaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadofisicofacturaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadofisicofacturaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
		}
		
		if(this.estadofisicofacturaReturnGeneral.getConRetornoLista() || this.estadofisicofacturaReturnGeneral.getConRetornoObjeto()) {
			if(this.estadofisicofacturaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofisicofacturaLogic.setEstadoFisicoFacturas(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadofisicofacturaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadofisicofacturaLogic.setEstadoFisicoFactura(this.estadofisicofacturaReturnGeneral.getEstadoFisicoFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoFisicoFactura(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoFisicoFactura() throws Exception {
		
		
	}
	
	public ArrayList<EstadoFisicoFactura> getEstadoFisicoFacturasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoFisicoFactura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturaLogic.getEstadoFisicoFacturas()) {
					if(estadofisicofacturaAux.getIsSelected()) {
						estadofisicofacturasSeleccionados.add(estadofisicofacturaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoFisicoFactura estadofisicofacturaAux:this.estadofisicofacturas) {
					if(estadofisicofacturaAux.getIsSelected()) {
						estadofisicofacturasSeleccionados.add(estadofisicofacturaAux);				
					}
				}
			}
			
			if(estadofisicofacturasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadofisicofacturasSeleccionados.addAll(this.estadofisicofacturaLogic.getEstadoFisicoFacturas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadofisicofacturasSeleccionados.addAll(this.estadofisicofacturas);				
					}
				}
			}
		} else {
			estadofisicofacturasSeleccionados.add(this.estadofisicofactura);
		}
		
		return estadofisicofacturasSeleccionados;
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
	
	public void generarReporteEstadoFisicoFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoFisicoFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoFisicoFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFisicoFacturasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoFisicoFacturasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Fisico Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoFisicoFacturasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoFisicoFacturasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoFisicoFacturasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoFisicoFacturasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoFisicoFactura();
		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoFisicoFactura();
		
		
		//this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados ,estadofisicofacturaImplementable,estadofisicofacturaImplementableHome);
	}
	
	public void mostrarImportacionEstadoFisicoFacturas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoFisicoFactura();
		
		this.abrirFrameImportacionEstadoFisicoFactura();		
		
			
		//this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados ,estadofisicofacturaImplementable,estadofisicofacturaImplementableHome);
	}
	
	public void importarEstadoFisicoFacturas() throws Exception {		
	
	}
	
	public void exportarEstadoFisicoFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoFisicoFacturasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoFisicoFacturasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoFisicoFacturasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Fisico Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoFisicoFacturasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoFisicoFactura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoFisicoFactura(estadofisicofacturaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadofisicofacturaAux.setsDetalleGeneralEntityReporte(estadofisicofacturaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoFisicoFactura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoFisicoFacturaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadofisicofactura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofactura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofactura.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadofisicofactura.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoFisicoFacturasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoFisicoFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoFisicoFactura(row);				
				iRow++;
			}				
			
			for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoFisicoFactura(estadofisicofacturaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoFisicoFacturasSeleccionados() throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();		
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadofisicofactura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadofisicofacturas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadofisicofactura");
			//elementRoot.appendChild(element);
		
			for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasSeleccionados) {
				element = document.createElement("estadofisicofactura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoFisicoFactura(estadofisicofacturaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Fisico Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoFisicoFactura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofactura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofactura.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadofisicofactura.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoFisicoFactura(EstadoFisicoFactura estadofisicofactura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoFisicoFacturaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadofisicofactura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoFisicoFacturaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadofisicofactura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(EstadoFisicoFacturaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(estadofisicofactura.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(EstadoFisicoFacturaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadofisicofactura.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoFisicoFacturasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados=new ArrayList<EstadoFisicoFactura>();
		
		estadofisicofacturasSeleccionados=this.getEstadoFisicoFacturasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoFisicoFactura(estadofisicofacturasSeleccionados);
		
		this.generarReporteEstadoFisicoFacturas("Todos",estadofisicofacturasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoFisicoFactura(ArrayList<EstadoFisicoFactura> estadofisicofacturasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoFisicoFactura estadofisicofacturaAux:estadofisicofacturasSeleccionados) {
				estadofisicofacturaAux.setsDetalleGeneralEntityReporte(estadofisicofacturaAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoFisicoFacturaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					estadofisicofacturaAux.setsDescripcionGeneralEntityReporte1(estadofisicofacturaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadoFisicoFacturaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadofisicofacturaAux.setsDescripcionGeneralEntityReporte1(estadofisicofacturaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoFisicoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoFisicoFactura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoFisicoFactura=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=true;
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
			this.isVisibilidadCeldaModificarEstadoFisicoFactura=true;
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaCancelarEstadoFisicoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoFisicoFactura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoFisicoFacturaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=true;
		} else {
			this.actualizarEstadoPanelsEstadoFisicoFactura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoFisicoFactura=false;
			//this.isVisibilidadCeldaVerFormEstadoFisicoFactura=false;
			this.isVisibilidadCeldaDuplicarEstadoFisicoFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadofisicofacturaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoFisicoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoFisicoFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			if(!estadofisicofacturaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;												
			}
			
			this.jButtonCerrarEstadoFisicoFactura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoFisicoFactura=false;
		}
		
		if(!this.permiteMantenimiento(this.estadofisicofactura)) {
			this.isVisibilidadCeldaActualizarEstadoFisicoFactura=false;
			this.isVisibilidadCeldaEliminarEstadoFisicoFactura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoFisicoFactura() {
	}
	
	public void actualizarEstadoPanelsEstadoFisicoFactura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEdicionEstadoFisicoFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoFisicoFactura!=null) {
				this.jScrollPanelDatosEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoFisicoFactura!=null) {
				this.jPanelPaginacionEstadoFisicoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
					this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadofisicofacturaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadoFisicoFactura!=null) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadoFisicoFactura!=null) {
				this.jPanelParametrosReportesEstadoFisicoFactura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasEstadoFisicoFactura.remove(jPanelFK_IdPaisEstadoFisicoFactura);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoFisicoFacturaSessionBean estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
		
		if(this.estadofisicofacturaSessionBean==null) {
			this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
		}
		
		this.estadofisicofacturaSessionBean.setsUltimaBusquedaEstadoFisicoFactura(this.getsAccionBusqueda());
		this.estadofisicofacturaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadofisicofacturaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			estadofisicofacturaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoFisicoFacturaSessionBean estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
		
		if(this.estadofisicofacturaSessionBean==null) {
			this.estadofisicofacturaSessionBean=new EstadoFisicoFacturaSessionBean();
		}
		
		if(this.estadofisicofacturaSessionBean.getsUltimaBusquedaEstadoFisicoFactura()!=null&&!this.estadofisicofacturaSessionBean.getsUltimaBusquedaEstadoFisicoFactura().equals("")) {
			this.setsAccionBusqueda(estadofisicofacturaSessionBean.getsUltimaBusquedaEstadoFisicoFactura());
			this.setiNumeroPaginacion(estadofisicofacturaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadofisicofacturaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(estadofisicofacturaSessionBean.getid_pais());
				estadofisicofacturaSessionBean.setid_pais(-1L);
			}
		}
		
		this.estadofisicofacturaSessionBean.setsUltimaBusquedaEstadoFisicoFactura("");
		this.estadofisicofacturaSessionBean.setiNumeroPaginacion(EstadoFisicoFacturaConstantesFunciones.INUMEROPAGINACION);
		this.estadofisicofacturaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoFisicoFactura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoFisicoFactura() {
		this.updateBorderResaltarBusquedasFormularioEstadoFisicoFactura();
		this.updateVisibilidadBusquedasFormularioEstadoFisicoFactura();
		this.updateHabilitarBusquedasFormularioEstadoFisicoFactura();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoFisicoFactura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponents().length>0) {
	

		if(this.estadofisicofacturaConstantesFunciones.resaltarFK_IdPaisEstadoFisicoFactura!=null) {
			index= this.jTabbedPaneBusquedasEstadoFisicoFactura.indexOfComponent(this.jPanelFK_IdPaisEstadoFisicoFactura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponent(index);
				jPanel.setBorder(this.estadofisicofacturaConstantesFunciones.resaltarFK_IdPaisEstadoFisicoFactura);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoFisicoFactura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoFisicoFactura.indexOfComponent(this.jPanelFK_IdPaisEstadoFisicoFactura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadofisicofacturaConstantesFunciones.mostrarFK_IdPaisEstadoFisicoFactura);
			if(!this.estadofisicofacturaConstantesFunciones.mostrarFK_IdPaisEstadoFisicoFactura && index>-1) {
				this.jTabbedPaneBusquedasEstadoFisicoFactura.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadoFisicoFactura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadoFisicoFactura.indexOfComponent(this.jPanelFK_IdPaisEstadoFisicoFactura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadofisicofacturaConstantesFunciones.activarFK_IdPaisEstadoFisicoFactura);
				this.jTabbedPaneBusquedasEstadoFisicoFactura.setEnabledAt(index,this.estadofisicofacturaConstantesFunciones.activarFK_IdPaisEstadoFisicoFactura);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadoFisicoFactura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasEstadoFisicoFactura.indexOfComponent(this.jPanelFK_IdPaisEstadoFisicoFactura);

			this.jTabbedPaneBusquedasEstadoFisicoFactura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadoFisicoFactura.getComponent(index);

			this.estadofisicofacturaConstantesFunciones.setResaltarFK_IdPaisEstadoFisicoFactura(resaltar);

			jPanel.setBorder(this.estadofisicofacturaConstantesFunciones.resaltarFK_IdPaisEstadoFisicoFactura);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadoFisicoFactura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadoFisicoFactura() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoFisicoFactura();
		this.updateVisibilidadResaltarControlesFormularioEstadoFisicoFactura();
		this.updateHabilitarResaltarControlesFormularioEstadoFisicoFactura();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoFisicoFactura() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadofisicofacturaConstantesFunciones.resaltaridEstadoFisicoFactura!=null && this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setBorder(this.estadofisicofacturaConstantesFunciones.resaltaridEstadoFisicoFactura);}
		if(this.estadofisicofacturaConstantesFunciones.resaltarid_paisEstadoFisicoFactura!=null && this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setBorder(this.estadofisicofacturaConstantesFunciones.resaltarid_paisEstadoFisicoFactura);}
		if(this.estadofisicofacturaConstantesFunciones.resaltarnombreEstadoFisicoFactura!=null && this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setBorder(this.estadofisicofacturaConstantesFunciones.resaltarnombreEstadoFisicoFactura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoFisicoFactura() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
	
		//this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setVisible(this.estadofisicofacturaConstantesFunciones.mostraridEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelidEstadoFisicoFactura.setVisible(this.estadofisicofacturaConstantesFunciones.mostraridEstadoFisicoFactura);
		//this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setVisible(this.estadofisicofacturaConstantesFunciones.mostrarid_paisEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelid_paisEstadoFisicoFactura.setVisible(this.estadofisicofacturaConstantesFunciones.mostrarid_paisEstadoFisicoFactura);
		//this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setVisible(this.estadofisicofacturaConstantesFunciones.mostrarnombreEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jPanelnombreEstadoFisicoFactura.setVisible(this.estadofisicofacturaConstantesFunciones.mostrarnombreEstadoFisicoFactura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoFisicoFactura() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoFisicoFactura!=null) {
	
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextFieldidEstadoFisicoFactura.setEnabled(this.estadofisicofacturaConstantesFunciones.activaridEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jComboBoxid_paisEstadoFisicoFactura.setEnabled(this.estadofisicofacturaConstantesFunciones.activarid_paisEstadoFisicoFactura);
		this.jInternalFrameDetalleFormEstadoFisicoFactura.jTextAreanombreEstadoFisicoFactura.setEnabled(this.estadofisicofacturaConstantesFunciones.activarnombreEstadoFisicoFactura);
		}
	}
	
		
}